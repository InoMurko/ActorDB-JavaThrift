/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.actordb.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-6-4")
public class LoginResult implements org.apache.thrift.TBase<LoginResult, LoginResult._Fields>, java.io.Serializable, Cloneable, Comparable<LoginResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LoginResult");

  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField READACCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("readaccess", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField WRITEACCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("writeaccess", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LoginResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LoginResultTupleSchemeFactory());
  }

  public boolean success; // required
  public String error; // optional
  public List<String> readaccess; // optional
  public List<String> writeaccess; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUCCESS((short)1, "success"),
    ERROR((short)2, "error"),
    READACCESS((short)3, "readaccess"),
    WRITEACCESS((short)4, "writeaccess");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUCCESS
          return SUCCESS;
        case 2: // ERROR
          return ERROR;
        case 3: // READACCESS
          return READACCESS;
        case 4: // WRITEACCESS
          return WRITEACCESS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ERROR,_Fields.READACCESS,_Fields.WRITEACCESS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.READACCESS, new org.apache.thrift.meta_data.FieldMetaData("readaccess", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.WRITEACCESS, new org.apache.thrift.meta_data.FieldMetaData("writeaccess", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LoginResult.class, metaDataMap);
  }

  public LoginResult() {
  }

  public LoginResult(
    boolean success)
  {
    this();
    this.success = success;
    setSuccessIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LoginResult(LoginResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.success = other.success;
    if (other.isSetError()) {
      this.error = other.error;
    }
    if (other.isSetReadaccess()) {
      List<String> __this__readaccess = new ArrayList<String>(other.readaccess);
      this.readaccess = __this__readaccess;
    }
    if (other.isSetWriteaccess()) {
      List<String> __this__writeaccess = new ArrayList<String>(other.writeaccess);
      this.writeaccess = __this__writeaccess;
    }
  }

  public LoginResult deepCopy() {
    return new LoginResult(this);
  }

  @Override
  public void clear() {
    setSuccessIsSet(false);
    this.success = false;
    this.error = null;
    this.readaccess = null;
    this.writeaccess = null;
  }

  public boolean isSuccess() {
    return this.success;
  }

  public LoginResult setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public String getError() {
    return this.error;
  }

  public LoginResult setError(String error) {
    this.error = error;
    return this;
  }

  public void unsetError() {
    this.error = null;
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return this.error != null;
  }

  public void setErrorIsSet(boolean value) {
    if (!value) {
      this.error = null;
    }
  }

  public int getReadaccessSize() {
    return (this.readaccess == null) ? 0 : this.readaccess.size();
  }

  public java.util.Iterator<String> getReadaccessIterator() {
    return (this.readaccess == null) ? null : this.readaccess.iterator();
  }

  public void addToReadaccess(String elem) {
    if (this.readaccess == null) {
      this.readaccess = new ArrayList<String>();
    }
    this.readaccess.add(elem);
  }

  public List<String> getReadaccess() {
    return this.readaccess;
  }

  public LoginResult setReadaccess(List<String> readaccess) {
    this.readaccess = readaccess;
    return this;
  }

  public void unsetReadaccess() {
    this.readaccess = null;
  }

  /** Returns true if field readaccess is set (has been assigned a value) and false otherwise */
  public boolean isSetReadaccess() {
    return this.readaccess != null;
  }

  public void setReadaccessIsSet(boolean value) {
    if (!value) {
      this.readaccess = null;
    }
  }

  public int getWriteaccessSize() {
    return (this.writeaccess == null) ? 0 : this.writeaccess.size();
  }

  public java.util.Iterator<String> getWriteaccessIterator() {
    return (this.writeaccess == null) ? null : this.writeaccess.iterator();
  }

  public void addToWriteaccess(String elem) {
    if (this.writeaccess == null) {
      this.writeaccess = new ArrayList<String>();
    }
    this.writeaccess.add(elem);
  }

  public List<String> getWriteaccess() {
    return this.writeaccess;
  }

  public LoginResult setWriteaccess(List<String> writeaccess) {
    this.writeaccess = writeaccess;
    return this;
  }

  public void unsetWriteaccess() {
    this.writeaccess = null;
  }

  /** Returns true if field writeaccess is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteaccess() {
    return this.writeaccess != null;
  }

  public void setWriteaccessIsSet(boolean value) {
    if (!value) {
      this.writeaccess = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((Boolean)value);
      }
      break;

    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((String)value);
      }
      break;

    case READACCESS:
      if (value == null) {
        unsetReadaccess();
      } else {
        setReadaccess((List<String>)value);
      }
      break;

    case WRITEACCESS:
      if (value == null) {
        unsetWriteaccess();
      } else {
        setWriteaccess((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCCESS:
      return isSuccess();

    case ERROR:
      return getError();

    case READACCESS:
      return getReadaccess();

    case WRITEACCESS:
      return getWriteaccess();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUCCESS:
      return isSetSuccess();
    case ERROR:
      return isSetError();
    case READACCESS:
      return isSetReadaccess();
    case WRITEACCESS:
      return isSetWriteaccess();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LoginResult)
      return this.equals((LoginResult)that);
    return false;
  }

  public boolean equals(LoginResult that) {
    if (that == null)
      return false;

    boolean this_present_success = true;
    boolean that_present_success = true;
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_error = true && this.isSetError();
    boolean that_present_error = true && that.isSetError();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (!this.error.equals(that.error))
        return false;
    }

    boolean this_present_readaccess = true && this.isSetReadaccess();
    boolean that_present_readaccess = true && that.isSetReadaccess();
    if (this_present_readaccess || that_present_readaccess) {
      if (!(this_present_readaccess && that_present_readaccess))
        return false;
      if (!this.readaccess.equals(that.readaccess))
        return false;
    }

    boolean this_present_writeaccess = true && this.isSetWriteaccess();
    boolean that_present_writeaccess = true && that.isSetWriteaccess();
    if (this_present_writeaccess || that_present_writeaccess) {
      if (!(this_present_writeaccess && that_present_writeaccess))
        return false;
      if (!this.writeaccess.equals(that.writeaccess))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_success = true;
    list.add(present_success);
    if (present_success)
      list.add(success);

    boolean present_error = true && (isSetError());
    list.add(present_error);
    if (present_error)
      list.add(error);

    boolean present_readaccess = true && (isSetReadaccess());
    list.add(present_readaccess);
    if (present_readaccess)
      list.add(readaccess);

    boolean present_writeaccess = true && (isSetWriteaccess());
    list.add(present_writeaccess);
    if (present_writeaccess)
      list.add(writeaccess);

    return list.hashCode();
  }

  @Override
  public int compareTo(LoginResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetError()).compareTo(other.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReadaccess()).compareTo(other.isSetReadaccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReadaccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.readaccess, other.readaccess);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteaccess()).compareTo(other.isSetWriteaccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteaccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeaccess, other.writeaccess);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LoginResult(");
    boolean first = true;

    sb.append("success:");
    sb.append(this.success);
    first = false;
    if (isSetError()) {
      if (!first) sb.append(", ");
      sb.append("error:");
      if (this.error == null) {
        sb.append("null");
      } else {
        sb.append(this.error);
      }
      first = false;
    }
    if (isSetReadaccess()) {
      if (!first) sb.append(", ");
      sb.append("readaccess:");
      if (this.readaccess == null) {
        sb.append("null");
      } else {
        sb.append(this.readaccess);
      }
      first = false;
    }
    if (isSetWriteaccess()) {
      if (!first) sb.append(", ");
      sb.append("writeaccess:");
      if (this.writeaccess == null) {
        sb.append("null");
      } else {
        sb.append(this.writeaccess);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'success' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LoginResultStandardSchemeFactory implements SchemeFactory {
    public LoginResultStandardScheme getScheme() {
      return new LoginResultStandardScheme();
    }
  }

  private static class LoginResultStandardScheme extends StandardScheme<LoginResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LoginResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error = iprot.readString();
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // READACCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list26 = iprot.readListBegin();
                struct.readaccess = new ArrayList<String>(_list26.size);
                String _elem27;
                for (int _i28 = 0; _i28 < _list26.size; ++_i28)
                {
                  _elem27 = iprot.readString();
                  struct.readaccess.add(_elem27);
                }
                iprot.readListEnd();
              }
              struct.setReadaccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WRITEACCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list29 = iprot.readListBegin();
                struct.writeaccess = new ArrayList<String>(_list29.size);
                String _elem30;
                for (int _i31 = 0; _i31 < _list29.size; ++_i31)
                {
                  _elem30 = iprot.readString();
                  struct.writeaccess.add(_elem30);
                }
                iprot.readListEnd();
              }
              struct.setWriteaccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSuccess()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'success' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LoginResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.success);
      oprot.writeFieldEnd();
      if (struct.error != null) {
        if (struct.isSetError()) {
          oprot.writeFieldBegin(ERROR_FIELD_DESC);
          oprot.writeString(struct.error);
          oprot.writeFieldEnd();
        }
      }
      if (struct.readaccess != null) {
        if (struct.isSetReadaccess()) {
          oprot.writeFieldBegin(READACCESS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.readaccess.size()));
            for (String _iter32 : struct.readaccess)
            {
              oprot.writeString(_iter32);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.writeaccess != null) {
        if (struct.isSetWriteaccess()) {
          oprot.writeFieldBegin(WRITEACCESS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.writeaccess.size()));
            for (String _iter33 : struct.writeaccess)
            {
              oprot.writeString(_iter33);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LoginResultTupleSchemeFactory implements SchemeFactory {
    public LoginResultTupleScheme getScheme() {
      return new LoginResultTupleScheme();
    }
  }

  private static class LoginResultTupleScheme extends TupleScheme<LoginResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LoginResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.success);
      BitSet optionals = new BitSet();
      if (struct.isSetError()) {
        optionals.set(0);
      }
      if (struct.isSetReadaccess()) {
        optionals.set(1);
      }
      if (struct.isSetWriteaccess()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetError()) {
        oprot.writeString(struct.error);
      }
      if (struct.isSetReadaccess()) {
        {
          oprot.writeI32(struct.readaccess.size());
          for (String _iter34 : struct.readaccess)
          {
            oprot.writeString(_iter34);
          }
        }
      }
      if (struct.isSetWriteaccess()) {
        {
          oprot.writeI32(struct.writeaccess.size());
          for (String _iter35 : struct.writeaccess)
          {
            oprot.writeString(_iter35);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LoginResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.success = iprot.readBool();
      struct.setSuccessIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.error = iprot.readString();
        struct.setErrorIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list36 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.readaccess = new ArrayList<String>(_list36.size);
          String _elem37;
          for (int _i38 = 0; _i38 < _list36.size; ++_i38)
          {
            _elem37 = iprot.readString();
            struct.readaccess.add(_elem37);
          }
        }
        struct.setReadaccessIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.writeaccess = new ArrayList<String>(_list39.size);
          String _elem40;
          for (int _i41 = 0; _i41 < _list39.size; ++_i41)
          {
            _elem40 = iprot.readString();
            struct.writeaccess.add(_elem40);
          }
        }
        struct.setWriteaccessIsSet(true);
      }
    }
  }

}

