/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.blackbaud.pocazurekafka.domain;
@SuppressWarnings("CPD-START")
@org.apache.avro.specific.AvroGenerated
public class entitlement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"entitlement\",\"namespace\":\"com.blackbaud.pocazurekafka.domain\",\"fields\":[{\"name\":\"body\",\"type\":{\"type\":\"record\",\"name\":\"body\",\"fields\":[{\"name\":\"LegalEntityId\",\"type\":\"string\"},{\"name\":\"EnvironmentId\",\"type\":\"string\"},{\"name\":\"EntitlementId\",\"type\":\"string\"},{\"name\":\"EntitlementType\",\"type\":\"string\"},{\"name\":\"ErrorMessage\",\"type\":[\"string\",\"null\"]},{\"name\":\"EntitlementEventActionType\",\"type\":\"int\"}]}},{\"name\":\"topic\",\"type\":{\"type\":\"record\",\"name\":\"topic\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"}]}},{\"name\":\"schema\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.blackbaud.pocazurekafka.domain.body body;
  @Deprecated public com.blackbaud.pocazurekafka.domain.topic topic;
  @Deprecated public java.lang.CharSequence schema;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public entitlement() {}

  /**
   * All-args constructor.
   */
  public entitlement(com.blackbaud.pocazurekafka.domain.body body, com.blackbaud.pocazurekafka.domain.topic topic, java.lang.CharSequence schema) {
    this.body = body;
    this.topic = topic;
    this.schema = schema;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return body;
    case 1: return topic;
    case 2: return schema;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: body = (com.blackbaud.pocazurekafka.domain.body)value$; break;
    case 1: topic = (com.blackbaud.pocazurekafka.domain.topic)value$; break;
    case 2: schema = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'body' field.
   */
  public com.blackbaud.pocazurekafka.domain.body getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(com.blackbaud.pocazurekafka.domain.body value) {
    this.body = value;
  }

  /**
   * Gets the value of the 'topic' field.
   */
  public com.blackbaud.pocazurekafka.domain.topic getTopic() {
    return topic;
  }

  /**
   * Sets the value of the 'topic' field.
   * @param value the value to set.
   */
  public void setTopic(com.blackbaud.pocazurekafka.domain.topic value) {
    this.topic = value;
  }

  /**
   * Gets the value of the 'schema' field.
   */
  public java.lang.CharSequence getSchema$() {
    return schema;
  }

  /**
   * Sets the value of the 'schema' field.
   * @param value the value to set.
   */
  public void setSchema$(java.lang.CharSequence value) {
    this.schema = value;
  }

  /** Creates a new entitlement RecordBuilder */
  public static entitlement.Builder newBuilder() {
    return new entitlement.Builder();
  }
  
  /** Creates a new entitlement RecordBuilder by copying an existing Builder */
  public static entitlement.Builder newBuilder(entitlement.Builder other) {
    return new entitlement.Builder(other);
  }
  
  /** Creates a new entitlement RecordBuilder by copying an existing entitlement instance */
  public static entitlement.Builder newBuilder(entitlement other) {
    return new entitlement.Builder(other);
  }
  
  /**
   * RecordBuilder for entitlement instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<entitlement>
    implements org.apache.avro.data.RecordBuilder<entitlement> {

    private com.blackbaud.pocazurekafka.domain.body body;
    private com.blackbaud.pocazurekafka.domain.topic topic;
    private java.lang.CharSequence schema;

    /** Creates a new Builder */
    private Builder() {
      super(entitlement.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(entitlement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.body)) {
        this.body = data().deepCopy(fields()[0].schema(), other.body);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.topic)) {
        this.topic = data().deepCopy(fields()[1].schema(), other.topic);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.schema)) {
        this.schema = data().deepCopy(fields()[2].schema(), other.schema);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing entitlement instance */
    private Builder(entitlement other) {
            super(entitlement.SCHEMA$);
      if (isValidValue(fields()[0], other.body)) {
        this.body = data().deepCopy(fields()[0].schema(), other.body);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.topic)) {
        this.topic = data().deepCopy(fields()[1].schema(), other.topic);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.schema)) {
        this.schema = data().deepCopy(fields()[2].schema(), other.schema);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'body' field */
    public com.blackbaud.pocazurekafka.domain.body getBody() {
      return body;
    }
    
    /** Sets the value of the 'body' field */
    public entitlement.Builder setBody(com.blackbaud.pocazurekafka.domain.body value) {
      validate(fields()[0], value);
      this.body = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'body' field has been set */
    public boolean hasBody() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'body' field */
    public entitlement.Builder clearBody() {
      body = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'topic' field */
    public com.blackbaud.pocazurekafka.domain.topic getTopic() {
      return topic;
    }
    
    /** Sets the value of the 'topic' field */
    public entitlement.Builder setTopic(com.blackbaud.pocazurekafka.domain.topic value) {
      validate(fields()[1], value);
      this.topic = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'topic' field has been set */
    public boolean hasTopic() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'topic' field */
    public entitlement.Builder clearTopic() {
      topic = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'schema' field */
    public java.lang.CharSequence getSchema$() {
      return schema;
    }
    
    /** Sets the value of the 'schema' field */
    public entitlement.Builder setSchema$(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.schema = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'schema' field has been set */
    public boolean hasSchema$() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'schema' field */
    public entitlement.Builder clearSchema$() {
      schema = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public entitlement build() {
      try {
        entitlement record = new entitlement();
        record.body = fieldSetFlags()[0] ? this.body : (com.blackbaud.pocazurekafka.domain.body) defaultValue(fields()[0]);
        record.topic = fieldSetFlags()[1] ? this.topic : (com.blackbaud.pocazurekafka.domain.topic) defaultValue(fields()[1]);
        record.schema = fieldSetFlags()[2] ? this.schema : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
