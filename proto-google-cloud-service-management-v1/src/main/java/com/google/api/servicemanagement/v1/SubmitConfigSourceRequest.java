/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 *
 *
 * <pre>
 * Request message for SubmitConfigSource method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.SubmitConfigSourceRequest}
 */
public final class SubmitConfigSourceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.SubmitConfigSourceRequest)
    SubmitConfigSourceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubmitConfigSourceRequest.newBuilder() to construct.
  private SubmitConfigSourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubmitConfigSourceRequest() {
    serviceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubmitConfigSourceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SubmitConfigSourceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              serviceName_ = s;
              break;
            }
          case 18:
            {
              com.google.api.servicemanagement.v1.ConfigSource.Builder subBuilder = null;
              if (configSource_ != null) {
                subBuilder = configSource_.toBuilder();
              }
              configSource_ =
                  input.readMessage(
                      com.google.api.servicemanagement.v1.ConfigSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(configSource_);
                configSource_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              validateOnly_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.SubmitConfigSourceRequest.class,
            com.google.api.servicemanagement.v1.SubmitConfigSourceRequest.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   *
   *
   * <pre>
   * Required. The name of the service.  See the
   * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
   * example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the service.  See the
   * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
   * example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_SOURCE_FIELD_NUMBER = 2;
  private com.google.api.servicemanagement.v1.ConfigSource configSource_;
  /**
   *
   *
   * <pre>
   * Required. The source configuration for the service.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the configSource field is set.
   */
  @java.lang.Override
  public boolean hasConfigSource() {
    return configSource_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The source configuration for the service.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The configSource.
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.ConfigSource getConfigSource() {
    return configSource_ == null
        ? com.google.api.servicemanagement.v1.ConfigSource.getDefaultInstance()
        : configSource_;
  }
  /**
   *
   *
   * <pre>
   * Required. The source configuration for the service.
   * </pre>
   *
   * <code>
   * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.ConfigSourceOrBuilder getConfigSourceOrBuilder() {
    return getConfigSource();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_;
  /**
   *
   *
   * <pre>
   * Optional. If set, this will result in the generation of a
   * `google.api.Service` configuration based on the `ConfigSource` provided,
   * but the generated config and the sources will NOT be persisted.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (configSource_ != null) {
      output.writeMessage(2, getConfigSource());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (configSource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getConfigSource());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.servicemanagement.v1.SubmitConfigSourceRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.SubmitConfigSourceRequest other =
        (com.google.api.servicemanagement.v1.SubmitConfigSourceRequest) obj;

    if (!getServiceName().equals(other.getServiceName())) return false;
    if (hasConfigSource() != other.hasConfigSource()) return false;
    if (hasConfigSource()) {
      if (!getConfigSource().equals(other.getConfigSource())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    if (hasConfigSource()) {
      hash = (37 * hash) + CONFIG_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getConfigSource().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.api.servicemanagement.v1.SubmitConfigSourceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for SubmitConfigSource method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.SubmitConfigSourceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.SubmitConfigSourceRequest)
      com.google.api.servicemanagement.v1.SubmitConfigSourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.SubmitConfigSourceRequest.class,
              com.google.api.servicemanagement.v1.SubmitConfigSourceRequest.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.SubmitConfigSourceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      serviceName_ = "";

      if (configSourceBuilder_ == null) {
        configSource_ = null;
      } else {
        configSource_ = null;
        configSourceBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.SubmitConfigSourceRequest
        getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.SubmitConfigSourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.SubmitConfigSourceRequest build() {
      com.google.api.servicemanagement.v1.SubmitConfigSourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.SubmitConfigSourceRequest buildPartial() {
      com.google.api.servicemanagement.v1.SubmitConfigSourceRequest result =
          new com.google.api.servicemanagement.v1.SubmitConfigSourceRequest(this);
      result.serviceName_ = serviceName_;
      if (configSourceBuilder_ == null) {
        result.configSource_ = configSource_;
      } else {
        result.configSource_ = configSourceBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.servicemanagement.v1.SubmitConfigSourceRequest) {
        return mergeFrom((com.google.api.servicemanagement.v1.SubmitConfigSourceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.SubmitConfigSourceRequest other) {
      if (other
          == com.google.api.servicemanagement.v1.SubmitConfigSourceRequest.getDefaultInstance())
        return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (other.hasConfigSource()) {
        mergeConfigSource(other.getConfigSource());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.servicemanagement.v1.SubmitConfigSourceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.api.servicemanagement.v1.SubmitConfigSourceRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for serviceName.
     */
    public com.google.protobuf.ByteString getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {

      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the service.  See the
     * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
     * example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceName_ = value;
      onChanged();
      return this;
    }

    private com.google.api.servicemanagement.v1.ConfigSource configSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.servicemanagement.v1.ConfigSource,
            com.google.api.servicemanagement.v1.ConfigSource.Builder,
            com.google.api.servicemanagement.v1.ConfigSourceOrBuilder>
        configSourceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the configSource field is set.
     */
    public boolean hasConfigSource() {
      return configSourceBuilder_ != null || configSource_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The configSource.
     */
    public com.google.api.servicemanagement.v1.ConfigSource getConfigSource() {
      if (configSourceBuilder_ == null) {
        return configSource_ == null
            ? com.google.api.servicemanagement.v1.ConfigSource.getDefaultInstance()
            : configSource_;
      } else {
        return configSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConfigSource(com.google.api.servicemanagement.v1.ConfigSource value) {
      if (configSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configSource_ = value;
        onChanged();
      } else {
        configSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConfigSource(
        com.google.api.servicemanagement.v1.ConfigSource.Builder builderForValue) {
      if (configSourceBuilder_ == null) {
        configSource_ = builderForValue.build();
        onChanged();
      } else {
        configSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConfigSource(com.google.api.servicemanagement.v1.ConfigSource value) {
      if (configSourceBuilder_ == null) {
        if (configSource_ != null) {
          configSource_ =
              com.google.api.servicemanagement.v1.ConfigSource.newBuilder(configSource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          configSource_ = value;
        }
        onChanged();
      } else {
        configSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConfigSource() {
      if (configSourceBuilder_ == null) {
        configSource_ = null;
        onChanged();
      } else {
        configSource_ = null;
        configSourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.api.servicemanagement.v1.ConfigSource.Builder getConfigSourceBuilder() {

      onChanged();
      return getConfigSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.api.servicemanagement.v1.ConfigSourceOrBuilder getConfigSourceOrBuilder() {
      if (configSourceBuilder_ != null) {
        return configSourceBuilder_.getMessageOrBuilder();
      } else {
        return configSource_ == null
            ? com.google.api.servicemanagement.v1.ConfigSource.getDefaultInstance()
            : configSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The source configuration for the service.
     * </pre>
     *
     * <code>
     * .google.api.servicemanagement.v1.ConfigSource config_source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.servicemanagement.v1.ConfigSource,
            com.google.api.servicemanagement.v1.ConfigSource.Builder,
            com.google.api.servicemanagement.v1.ConfigSourceOrBuilder>
        getConfigSourceFieldBuilder() {
      if (configSourceBuilder_ == null) {
        configSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.servicemanagement.v1.ConfigSource,
                com.google.api.servicemanagement.v1.ConfigSource.Builder,
                com.google.api.servicemanagement.v1.ConfigSourceOrBuilder>(
                getConfigSource(), getParentForChildren(), isClean());
        configSource_ = null;
      }
      return configSourceBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. If set, this will result in the generation of a
     * `google.api.Service` configuration based on the `ConfigSource` provided,
     * but the generated config and the sources will NOT be persisted.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If set, this will result in the generation of a
     * `google.api.Service` configuration based on the `ConfigSource` provided,
     * but the generated config and the sources will NOT be persisted.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If set, this will result in the generation of a
     * `google.api.Service` configuration based on the `ConfigSource` provided,
     * but the generated config and the sources will NOT be persisted.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {

      validateOnly_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.SubmitConfigSourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.SubmitConfigSourceRequest)
  private static final com.google.api.servicemanagement.v1.SubmitConfigSourceRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.SubmitConfigSourceRequest();
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitConfigSourceRequest> PARSER =
      new com.google.protobuf.AbstractParser<SubmitConfigSourceRequest>() {
        @java.lang.Override
        public SubmitConfigSourceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SubmitConfigSourceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SubmitConfigSourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitConfigSourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.SubmitConfigSourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
