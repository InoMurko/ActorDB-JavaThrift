package actordb.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import com.actordb.thrift.Actordb;
import com.actordb.thrift.ReadResult;
import com.actordb.thrift.Val;

public class Client {
	public static final String domain = "172.16.0.190";
	public static final int port = 33306;
	public static final String name_thrift = "ino.murko@biokoda.com_thrift";
	public static final String logger = "ino.murko@biokoda.com";
	public static final String username = "";
	public static final String password = "";

	public static void main(String[] args) {

		associationsWrite();
		
		logWrite();
		
		logRead();
		
	}

	public static void logWrite() {
		TTransport transport;
		transport = new TSocket(domain, port);
		try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Actordb.Client client = new Actordb.Client(protocol);
			client.login(username, password);
			List<String> flags = new ArrayList<String>(); 
			flags.add("CREATE");
			com.actordb.thrift.Result result = client.exec_single(name_thrift, "log", "INSERT INTO event VALUES (NULL,'"+name_thrift+"',date('now'));", flags);
			transport.close();
			System.out.println(result);
		} catch (TException x) {
			x.printStackTrace();
		}
	}

	public static void logRead() {
		TTransport transport;
		transport = new TSocket(domain, port);
		try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Actordb.Client client = new Actordb.Client(protocol);
			client.login(username, password);
			com.actordb.thrift.Result result = client
					.exec_sql("ACTOR log("+name_thrift+");SELECT * FROM event;");
			ReadResult readResult = result.getRead_result();
			for (Map<String,Val> element :  readResult.rows) {
				System.out.println(element);
				System.out.println("\n");
			}
		} catch (TException x) {
			x.printStackTrace();
		}
		finally{
			transport.close();
		}
	}

	

	public static void associationsWrite() {
		TTransport transport;
		transport = new TSocket(domain, port);
		try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Actordb.Client client = new Actordb.Client(protocol);
			client.login("", "");
			List<String> flags = new ArrayList<String>();
			com.actordb.thrift.Result result = client.exec_single(name_thrift,
					"associations",
					"INSERT INTO actors (id, hash,logger_id) VALUES ('"
							+ name_thrift + "'," + "{{hash(" + name_thrift
							+ ")}},'" + logger + "');", flags);
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

	/*
	 * 
	 * 
	 * 
	 * // associationsRead();
		/*
		 * TTransport transport; transport = new TSocket("172.16.0.190", 33306);
		 * try { transport.open(); TProtocol protocol = new
		 * TBinaryProtocol(transport); Actordb.Client client = new
		 * Actordb.Client(protocol); client.login("", "");
		 * com.actordb.thrift.Result result =
		 * client.exec_sql("ACTOR log(1); SELECT * FROM event;");
		 * transport.close(); System.out.println(result); } catch (TException
		 * x){ x.printStackTrace(); }
		 * 
		 * 
		 * List<String> flags = new ArrayList<String>(); flags.add("CREATE");
		 
	  public static void associationEventLogWrite() {
		TTransport transport;
		transport = new TSocket("172.16.0.190", 33306);
		try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Actordb.Client client = new Actordb.Client(protocol);
			client.login("", "");
			List<String> flags = new ArrayList<String>();
			flags.add("CREATE");
			com.actordb.thrift.Result result = client.exec_single(
					"associations", "ino.murko@biokoda.com_thrift",
					"INSERT INTO actors (hash,logger_id) VALUES ({{hash("
							+ "ino.murko@biokoda.com_thrift"
							+ ")}},ino.murko@biokoda.com)", flags);
			transport.close();
			System.out.println(result);
		} catch (TException x) {
			x.printStackTrace();
		}
	}
	
	*
	public static void associationsRead() {
		TTransport transport;
		transport = new TSocket(domain, port);
		try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Actordb.Client client = new Actordb.Client(protocol);
			client.login(username, password);
			com.actordb.thrift.Result result = client
					.exec_sql("ACTOR associations('ino.murko@biokoda.com_thrift');SELECT * FROM actors;");
			transport.close();
			System.out.println(result);
		} catch (TException x) {
			x.printStackTrace();
		}
	}*/

}
