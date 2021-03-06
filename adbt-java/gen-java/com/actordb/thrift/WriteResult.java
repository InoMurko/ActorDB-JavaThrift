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
public class WriteResult implements org.apache.thrift.TBase<WriteResult, WriteResult._Fields>, java.io.Serializable, Cloneable, Comparable<WriteResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WriteResult");

  private static final org.apache.thrift.protocol.TField LAST_CHANGE_ROWID_FIELD_DESC = new org.apache.thrift.protocol.TField("lastChangeRowid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ROWS_CHANGED_FIELD_DESC = new org.apache.thrift.protocol.TField("rowsChanged", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WriteResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WriteResultTupleSchemeFactory());
  }

  public long lastChangeRowid; // required
  public long rowsChanged; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LAST_CHANGE_ROWID((short)1, "lastChangeRowid"),
    ROWS_CHANGED((short)2, "rowsChanged");

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
        case 1: // LAST_CHANGE_ROWID
          return LAST_CHANGE_ROWID;
        case 2: // ROWS_CHANGED
          return ROWS_CHANGED;
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
  private static final int __LASTCHANGEROWID_ISSET_ID = 0;
  private static final int __ROWSCHANGED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LAST_CHANGE_ROWID, new org.apache.thrift.meta_data.FieldMetaData("lastChangeRowid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ROWS_CHANGED, new org.apache.thrift.meta_data.FieldMetaData("rowsChanged", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WriteResult.class, metaDataMap);
  }

  public WriteResult() {
  }

  public WriteResult(
    long lastChangeRowid,
    long rowsChanged)
  {
    this();
    this.lastChangeRowid = lastChangeRowid;
    setLastChangeRowidIsSet(true);
    this.rowsChanged = rowsChanged;
    setRowsChangedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WriteResult(WriteResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.lastChangeRowid = other.lastChangeRowid;
    this.rowsChanged = other.rowsChanged;
  }

  public WriteResult deepCopy() {
    return new WriteResult(this);
  }

  @Override
  public void clear() {
    setLastChangeRowidIsSet(false);
    this.lastChangeRowid = 0;
    setRowsChangedIsSet(false);
    this.rowsChanged = 0;
  }

  public long getLastChangeRowid() {
    return this.lastChangeRowid;
  }

  public WriteResult setLastChangeRowid(long lastChangeRowid) {
    this.lastChangeRowid = lastChangeRowid;
    setLastChangeRowidIsSet(true);
    return this;
  }

  public void unsetLastChangeRowid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTCHANGEROWID_ISSET_ID);
  }

  /** Returns true if field lastChangeRowid is set (has been assigned a value) and false otherwise */
  public boolean isSetLastChangeRowid() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTCHANGEROWID_ISSET_ID);
  }

  public void setLastChangeRowidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTCHANGEROWID_ISSET_ID, value);
  }

  public long getRowsChanged() {
    return this.rowsChanged;
  }

  public WriteResult setRowsChanged(long rowsChanged) {
    this.rowsChanged = rowsChanged;
    setRowsChangedIsSet(true);
    return this;
  }

  public void unsetRowsChanged() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROWSCHANGED_ISSET_ID);
  }

  /** Returns true if field rowsChanged is set (has been assigned a value) and false otherwise */
  public boolean isSetRowsChanged() {
    return EncodingUtils.testBit(__isset_bitfield, __ROWSCHANGED_ISSET_ID);
  }

  public void setRowsChangedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROWSCHANGED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LAST_CHANGE_ROWID:
      if (value == null) {
        unsetLastChangeRowid();
      } else {
        setLastChangeRowid((Long)value);
      }
      break;

    case ROWS_CHANGED:
      if (value == null) {
        unsetRowsChanged();
      } else {
        setRowsChanged((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LAST_CHANGE_ROWID:
      return getLastChangeRowid();

    case ROWS_CHANGED:
      return getRowsChanged();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LAST_CHANGE_ROWID:
      return isSetLastChangeRowid();
    case ROWS_CHANGED:
      return isSetRowsChanged();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WriteResult)
      return this.equals((WriteResult)that);
    return false;
  }

  public boolean equals(WriteResult that) {
    if (that == null)
      return false;

    boolean this_present_lastChangeRowid = true;
    boolean that_present_lastChangeRowid = true;
    if (this_present_lastChangeRowid || that_present_lastChangeRowid) {
      if (!(this_present_lastChangeRowid && that_present_lastChangeRowid))
        return false;
      if (this.lastChangeRowid != that.lastChangeRowid)
        return false;
    }

    boolean this_present_rowsChanged = true;
    boolean that_present_rowsChanged = true;
    if (this_present_rowsChanged || that_present_rowsChanged) {
      if (!(this_present_rowsChanged && that_present_rowsChanged))
        return false;
      if (this.rowsChanged != that.rowsChanged)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_lastChangeRowid = true;
    list.add(present_lastChangeRowid);
    if (present_lastChangeRowid)
      list.add(lastChangeRowid);

    boolean present_rowsChanged = true;
    list.add(present_rowsChanged);
    if (present_rowsChanged)
      list.add(rowsChanged);

    return list.hashCode();
  }

  @Override
  public int compareTo(WriteResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLastChangeRowid()).compareTo(other.isSetLastChangeRowid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastChangeRowid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastChangeRowid, other.lastChangeRowid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowsChanged()).compareTo(other.isSetRowsChanged());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowsChanged()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rowsChanged, other.rowsChanged);
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
    StringBuilder sb = new StringBuilder("WriteResult(");
    boolean first = true;

    sb.append("lastChangeRowid:");
    sb.append(this.lastChangeRowid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rowsChanged:");
    sb.append(this.rowsChanged);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'lastChangeRowid' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'rowsChanged' because it's a primitive and you chose the non-beans generator.
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

  private static class WriteResultStandardSchemeFactory implements SchemeFactory {
    public WriteResultStandardScheme getScheme() {
      return new WriteResultStandardScheme();
    }
  }

  private static class WriteResultStandardScheme extends StandardScheme<WriteResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WriteResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LAST_CHANGE_ROWID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastChangeRowid = iprot.readI64();
              struct.setLastChangeRowidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROWS_CHANGED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.rowsChanged = iprot.readI64();
              struct.setRowsChangedIsSet(true);
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
      if (!struct.isSetLastChangeRowid()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'lastChangeRowid' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetRowsChanged()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'rowsChanged' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WriteResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LAST_CHANGE_ROWID_FIELD_DESC);
      oprot.writeI64(struct.lastChangeRowid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ROWS_CHANGED_FIELD_DESC);
      oprot.writeI64(struct.rowsChanged);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WriteResultTupleSchemeFactory implements SchemeFactory {
    public WriteResultTupleScheme getScheme() {
      return new WriteResultTupleScheme();
    }
  }

  private static class WriteResultTupleScheme extends TupleScheme<WriteResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WriteResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.lastChangeRowid);
      oprot.writeI64(struct.rowsChanged);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WriteResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.lastChangeRowid = iprot.readI64();
      struct.setLastChangeRowidIsSet(true);
      struct.rowsChanged = iprot.readI64();
      struct.setRowsChangedIsSet(true);
    }
  }

}

