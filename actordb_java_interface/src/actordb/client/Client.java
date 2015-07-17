package actordb.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import com.actordb.thrift.Actordb;
import com.actordb.thrift.Group;
import com.actordb.thrift.Server;
import com.actordb.thrift.Val;

public class Client {
	/*schema.yaml:
	 * 
	 * 
	 * 
	 * some_actor:
	   - CREATE TABLE test(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, owner TEXT NOT NULL)
	 * 
	 * */
	public static final String domain = "localhost";
	public static final int port = 33306; //default is 33306;
	public static final String name_thrift = "ino.murko@biokoda.com_thrift";
	public static final String logger = "ino.murko@o.com";
	public static final String username = "";
	public static final String password = "";

	public static void main(String[] args) {

		init();
		
		readAll();
		
		insertOne();
		
		
	}

	public static void init(){
		TTransport transport;
		transport = new TSocket(domain, port);
		try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Actordb.Client client = new Actordb.Client(protocol);
			client.login("", "");
			Server servers = new Server();
			servers.addToServers("testnd@127.0.0.1:44381");
			List<Group> groups = new ArrayList<Group>();
			Group group = new Group();
			group.name = "grp1";
			group.nodes = new ArrayList<String>();
			group.nodes.add("testnd");
			group.type = "cluster";
			groups.add(group);
			servers.groups = groups;
			
			
			String result = client.initialize(servers);
			
			System.out.println(result);
		} catch (TException x) {
			
			x.printStackTrace();
			
		} finally {
			transport.close();
		}
	}
	public static void readAll() {
		TTransport transport;
		transport = new TSocket(domain, port);
		try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Actordb.Client client = new Actordb.Client(protocol);
			client.login("", "");
			
			com.actordb.thrift.Result result = client.exec_sql("ACTOR some_actor(*); {{RESULT}}SELECT * FROM test;");
			System.out.println(result);
		} catch (TException x) {
			if(x.getMessage().toLowerCase().contains("unique constraint failed")){
				//try not to run it 500 times with the same name
			}
			else{
				x.printStackTrace();
			}
		} finally {
			transport.close();
		}
	}

	public static void insertOne() {
		TTransport transport;
		transport = new TSocket(domain, port);
		try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Actordb.Client client = new Actordb.Client(protocol);
			client.login("", "");
			String actorName = createActorName();
			String actorType = "some_actor";
			String sql = "INSERT INTO test (id, name, owner) VALUES (null,?1,?2);";
			List<String> flags = new ArrayList<String>(); 
			flags.add("CREATE");
			List<List<Val>> bindingVals = new ArrayList<List<Val>>();
			List<Val> firstSqlPrepare = new ArrayList<Val>();
			Val name = new Val();
			name.setText("Client name");
			Val owner = new Val();
			owner.setText("Computer");
			firstSqlPrepare.add(name);
			firstSqlPrepare.add(owner);
			bindingVals.add(firstSqlPrepare);
			com.actordb.thrift.Result result = client.exec_single_prepare(actorName, actorType, sql, flags, bindingVals);
			System.out.println(result);
		} catch (TException x) {
			if(x.getMessage().toLowerCase().contains("unique constraint failed")){
				//try not to run it 500 times with the same name
			}
			else{
				x.printStackTrace();
			}
		} finally {
			transport.close();
		}
	}
	public static String createActorName(){
		byte[] bytes = new byte[5];
		new Random().nextBytes(bytes);
		String actorName = new String(bytes);
		return actorName;
	}

}
