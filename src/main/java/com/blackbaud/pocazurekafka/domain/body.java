/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.blackbaud.pocazurekafka.domain;
@SuppressWarnings("CPD-START")
@org.apache.avro.specific.AvroGenerated
public class body extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"body\",\"namespace\":\"com.blackbaud.pocazurekafka.domain\",\"fields\":[{\"name\":\"LegalEntityId\",\"type\":\"string\"},{\"name\":\"EnvironmentId\",\"type\":\"string\"},{\"name\":\"EntitlementId\",\"type\":\"string\"},{\"name\":\"EntitlementType\",\"type\":\"string\"},{\"name\":\"ErrorMessage\",\"type\":[\"string\",\"null\"]},{\"name\":\"EntitlementEventActionType\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence LegalEntityId;
  @Deprecated public java.lang.CharSequence EnvironmentId;
  @Deprecated public java.lang.CharSequence EntitlementId;
  @Deprecated public java.lang.CharSequence EntitlementType;
  @Deprecated public java.lang.CharSequence ErrorMessage;
  @Deprecated public int EntitlementEventActionType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public body() {}

  /**
   * All-args constructor.
   */
  public body(java.lang.CharSequence LegalEntityId, java.lang.CharSequence EnvironmentId, java.lang.CharSequence EntitlementId, java.lang.CharSequence EntitlementType, java.lang.CharSequence ErrorMessage, java.lang.Integer EntitlementEventActionType) {
    this.LegalEntityId = LegalEntityId;
    this.EnvironmentId = EnvironmentId;
    this.EntitlementId = EntitlementId;
    this.EntitlementType = EntitlementType;
    this.ErrorMessage = ErrorMessage;
    this.EntitlementEventActionType = EntitlementEventActionType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return LegalEntityId;
    case 1: return EnvironmentId;
    case 2: return EntitlementId;
    case 3: return EntitlementType;
    case 4: return ErrorMessage;
    case 5: return EntitlementEventActionType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: LegalEntityId = (java.lang.CharSequence)value$; break;
    case 1: EnvironmentId = (java.lang.CharSequence)value$; break;
    case 2: EntitlementId = (java.lang.CharSequence)value$; break;
    case 3: EntitlementType = (java.lang.CharSequence)value$; break;
    case 4: ErrorMessage = (java.lang.CharSequence)value$; break;
    case 5: EntitlementEventActionType = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'LegalEntityId' field.
   */
  public java.lang.CharSequence getLegalEntityId() {
    return LegalEntityId;
  }

  /**
   * Sets the value of the 'LegalEntityId' field.
   * @param value the value to set.
   */
  public void setLegalEntityId(java.lang.CharSequence value) {
    this.LegalEntityId = value;
  }

  /**
   * Gets the value of the 'EnvironmentId' field.
   */
  public java.lang.CharSequence getEnvironmentId() {
    return EnvironmentId;
  }

  /**
   * Sets the value of the 'EnvironmentId' field.
   * @param value the value to set.
   */
  public void setEnvironmentId(java.lang.CharSequence value) {
    this.EnvironmentId = value;
  }

  /**
   * Gets the value of the 'EntitlementId' field.
   */
  public java.lang.CharSequence getEntitlementId() {
    return EntitlementId;
  }

  /**
   * Sets the value of the 'EntitlementId' field.
   * @param value the value to set.
   */
  public void setEntitlementId(java.lang.CharSequence value) {
    this.EntitlementId = value;
  }

  /**
   * Gets the value of the 'EntitlementType' field.
   */
  public java.lang.CharSequence getEntitlementType() {
    return EntitlementType;
  }

  /**
   * Sets the value of the 'EntitlementType' field.
   * @param value the value to set.
   */
  public void setEntitlementType(java.lang.CharSequence value) {
    this.EntitlementType = value;
  }

  /**
   * Gets the value of the 'ErrorMessage' field.
   */
  public java.lang.CharSequence getErrorMessage() {
    return ErrorMessage;
  }

  /**
   * Sets the value of the 'ErrorMessage' field.
   * @param value the value to set.
   */
  public void setErrorMessage(java.lang.CharSequence value) {
    this.ErrorMessage = value;
  }

  /**
   * Gets the value of the 'EntitlementEventActionType' field.
   */
  public java.lang.Integer getEntitlementEventActionType() {
    return EntitlementEventActionType;
  }

  /**
   * Sets the value of the 'EntitlementEventActionType' field.
   * @param value the value to set.
   */
  public void setEntitlementEventActionType(java.lang.Integer value) {
    this.EntitlementEventActionType = value;
  }

  /** Creates a new body RecordBuilder */
  public static body.Builder newBuilder() {
    return new body.Builder();
  }
  
  /** Creates a new body RecordBuilder by copying an existing Builder */
  public static body.Builder newBuilder(body.Builder other) {
    return new body.Builder(other);
  }
  
  /** Creates a new body RecordBuilder by copying an existing body instance */
  public static body.Builder newBuilder(body other) {
    return new body.Builder(other);
  }
  
  /**
   * RecordBuilder for body instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<body>
    implements org.apache.avro.data.RecordBuilder<body> {

    private java.lang.CharSequence LegalEntityId;
    private java.lang.CharSequence EnvironmentId;
    private java.lang.CharSequence EntitlementId;
    private java.lang.CharSequence EntitlementType;
    private java.lang.CharSequence ErrorMessage;
    private int EntitlementEventActionType;

    /** Creates a new Builder */
    private Builder() {
      super(body.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(body.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.LegalEntityId)) {
        this.LegalEntityId = data().deepCopy(fields()[0].schema(), other.LegalEntityId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.EnvironmentId)) {
        this.EnvironmentId = data().deepCopy(fields()[1].schema(), other.EnvironmentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.EntitlementId)) {
        this.EntitlementId = data().deepCopy(fields()[2].schema(), other.EntitlementId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.EntitlementType)) {
        this.EntitlementType = data().deepCopy(fields()[3].schema(), other.EntitlementType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ErrorMessage)) {
        this.ErrorMessage = data().deepCopy(fields()[4].schema(), other.ErrorMessage);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.EntitlementEventActionType)) {
        this.EntitlementEventActionType = data().deepCopy(fields()[5].schema(), other.EntitlementEventActionType);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing body instance */
    private Builder(body other) {
            super(body.SCHEMA$);
      if (isValidValue(fields()[0], other.LegalEntityId)) {
        this.LegalEntityId = data().deepCopy(fields()[0].schema(), other.LegalEntityId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.EnvironmentId)) {
        this.EnvironmentId = data().deepCopy(fields()[1].schema(), other.EnvironmentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.EntitlementId)) {
        this.EntitlementId = data().deepCopy(fields()[2].schema(), other.EntitlementId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.EntitlementType)) {
        this.EntitlementType = data().deepCopy(fields()[3].schema(), other.EntitlementType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ErrorMessage)) {
        this.ErrorMessage = data().deepCopy(fields()[4].schema(), other.ErrorMessage);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.EntitlementEventActionType)) {
        this.EntitlementEventActionType = data().deepCopy(fields()[5].schema(), other.EntitlementEventActionType);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'LegalEntityId' field */
    public java.lang.CharSequence getLegalEntityId() {
      return LegalEntityId;
    }
    
    /** Sets the value of the 'LegalEntityId' field */
    public body.Builder setLegalEntityId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.LegalEntityId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'LegalEntityId' field has been set */
    public boolean hasLegalEntityId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'LegalEntityId' field */
    public body.Builder clearLegalEntityId() {
      LegalEntityId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'EnvironmentId' field */
    public java.lang.CharSequence getEnvironmentId() {
      return EnvironmentId;
    }
    
    /** Sets the value of the 'EnvironmentId' field */
    public body.Builder setEnvironmentId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.EnvironmentId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'EnvironmentId' field has been set */
    public boolean hasEnvironmentId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'EnvironmentId' field */
    public body.Builder clearEnvironmentId() {
      EnvironmentId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'EntitlementId' field */
    public java.lang.CharSequence getEntitlementId() {
      return EntitlementId;
    }
    
    /** Sets the value of the 'EntitlementId' field */
    public body.Builder setEntitlementId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.EntitlementId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'EntitlementId' field has been set */
    public boolean hasEntitlementId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'EntitlementId' field */
    public body.Builder clearEntitlementId() {
      EntitlementId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'EntitlementType' field */
    public java.lang.CharSequence getEntitlementType() {
      return EntitlementType;
    }
    
    /** Sets the value of the 'EntitlementType' field */
    public body.Builder setEntitlementType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.EntitlementType = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'EntitlementType' field has been set */
    public boolean hasEntitlementType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'EntitlementType' field */
    public body.Builder clearEntitlementType() {
      EntitlementType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'ErrorMessage' field */
    public java.lang.CharSequence getErrorMessage() {
      return ErrorMessage;
    }
    
    /** Sets the value of the 'ErrorMessage' field */
    public body.Builder setErrorMessage(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.ErrorMessage = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'ErrorMessage' field has been set */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'ErrorMessage' field */
    public body.Builder clearErrorMessage() {
      ErrorMessage = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'EntitlementEventActionType' field */
    public java.lang.Integer getEntitlementEventActionType() {
      return EntitlementEventActionType;
    }
    
    /** Sets the value of the 'EntitlementEventActionType' field */
    public body.Builder setEntitlementEventActionType(int value) {
      validate(fields()[5], value);
      this.EntitlementEventActionType = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'EntitlementEventActionType' field has been set */
    public boolean hasEntitlementEventActionType() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'EntitlementEventActionType' field */
    public body.Builder clearEntitlementEventActionType() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public body build() {
      try {
        body record = new body();
        record.LegalEntityId = fieldSetFlags()[0] ? this.LegalEntityId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.EnvironmentId = fieldSetFlags()[1] ? this.EnvironmentId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.EntitlementId = fieldSetFlags()[2] ? this.EntitlementId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.EntitlementType = fieldSetFlags()[3] ? this.EntitlementType : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.ErrorMessage = fieldSetFlags()[4] ? this.ErrorMessage : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.EntitlementEventActionType = fieldSetFlags()[5] ? this.EntitlementEventActionType : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
