// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Create SecurityRule Request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest}
 */
public final class CreateSecurityRuleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest)
    CreateSecurityRuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSecurityRuleRequest.newBuilder() to construct.
  private CreateSecurityRuleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSecurityRuleRequest() {
    parent_ = "";
    securityruleId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSecurityRuleRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSecurityRuleRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            opi_api.network.cloud.v1alpha1.SecurityRule.Builder subBuilder = null;
            if (securityrule_ != null) {
              subBuilder = securityrule_.toBuilder();
            }
            securityrule_ = input.readMessage(opi_api.network.cloud.v1alpha1.SecurityRule.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(securityrule_);
              securityrule_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            securityruleId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityRuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityRuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.class, opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITYRULE_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.SecurityRule securityrule_;
  /**
   * <pre>
   * securityrule
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the securityrule field is set.
   */
  @java.lang.Override
  public boolean hasSecurityrule() {
    return securityrule_ != null;
  }
  /**
   * <pre>
   * securityrule
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securityrule.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityRule getSecurityrule() {
    return securityrule_ == null ? opi_api.network.cloud.v1alpha1.SecurityRule.getDefaultInstance() : securityrule_;
  }
  /**
   * <pre>
   * securityrule
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityRuleOrBuilder getSecurityruleOrBuilder() {
    return getSecurityrule();
  }

  public static final int SECURITYRULE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object securityruleId_;
  /**
   * <pre>
   * securityrule_id
   * </pre>
   *
   * <code>string securityrule_id = 3;</code>
   * @return The securityruleId.
   */
  @java.lang.Override
  public java.lang.String getSecurityruleId() {
    java.lang.Object ref = securityruleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityruleId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * securityrule_id
   * </pre>
   *
   * <code>string securityrule_id = 3;</code>
   * @return The bytes for securityruleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecurityruleIdBytes() {
    java.lang.Object ref = securityruleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      securityruleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (securityrule_ != null) {
      output.writeMessage(2, getSecurityrule());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityruleId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, securityruleId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (securityrule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSecurityrule());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityruleId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, securityruleId_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest other = (opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSecurityrule() != other.hasSecurityrule()) return false;
    if (hasSecurityrule()) {
      if (!getSecurityrule()
          .equals(other.getSecurityrule())) return false;
    }
    if (!getSecurityruleId()
        .equals(other.getSecurityruleId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSecurityrule()) {
      hash = (37 * hash) + SECURITYRULE_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityrule().hashCode();
    }
    hash = (37 * hash) + SECURITYRULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityruleId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Create SecurityRule Request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest)
      opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityRuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityRuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.class, opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (securityruleBuilder_ == null) {
        securityrule_ = null;
      } else {
        securityrule_ = null;
        securityruleBuilder_ = null;
      }
      securityruleId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityRuleRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest build() {
      opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest result = new opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest(this);
      result.parent_ = parent_;
      if (securityruleBuilder_ == null) {
        result.securityrule_ = securityrule_;
      } else {
        result.securityrule_ = securityruleBuilder_.build();
      }
      result.securityruleId_ = securityruleId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSecurityrule()) {
        mergeSecurityrule(other.getSecurityrule());
      }
      if (!other.getSecurityruleId().isEmpty()) {
        securityruleId_ = other.securityruleId_;
        onChanged();
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
      opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private opi_api.network.cloud.v1alpha1.SecurityRule securityrule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.SecurityRule, opi_api.network.cloud.v1alpha1.SecurityRule.Builder, opi_api.network.cloud.v1alpha1.SecurityRuleOrBuilder> securityruleBuilder_;
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the securityrule field is set.
     */
    public boolean hasSecurityrule() {
      return securityruleBuilder_ != null || securityrule_ != null;
    }
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The securityrule.
     */
    public opi_api.network.cloud.v1alpha1.SecurityRule getSecurityrule() {
      if (securityruleBuilder_ == null) {
        return securityrule_ == null ? opi_api.network.cloud.v1alpha1.SecurityRule.getDefaultInstance() : securityrule_;
      } else {
        return securityruleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecurityrule(opi_api.network.cloud.v1alpha1.SecurityRule value) {
      if (securityruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        securityrule_ = value;
        onChanged();
      } else {
        securityruleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecurityrule(
        opi_api.network.cloud.v1alpha1.SecurityRule.Builder builderForValue) {
      if (securityruleBuilder_ == null) {
        securityrule_ = builderForValue.build();
        onChanged();
      } else {
        securityruleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSecurityrule(opi_api.network.cloud.v1alpha1.SecurityRule value) {
      if (securityruleBuilder_ == null) {
        if (securityrule_ != null) {
          securityrule_ =
            opi_api.network.cloud.v1alpha1.SecurityRule.newBuilder(securityrule_).mergeFrom(value).buildPartial();
        } else {
          securityrule_ = value;
        }
        onChanged();
      } else {
        securityruleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSecurityrule() {
      if (securityruleBuilder_ == null) {
        securityrule_ = null;
        onChanged();
      } else {
        securityrule_ = null;
        securityruleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityRule.Builder getSecurityruleBuilder() {
      
      onChanged();
      return getSecurityruleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityRuleOrBuilder getSecurityruleOrBuilder() {
      if (securityruleBuilder_ != null) {
        return securityruleBuilder_.getMessageOrBuilder();
      } else {
        return securityrule_ == null ?
            opi_api.network.cloud.v1alpha1.SecurityRule.getDefaultInstance() : securityrule_;
      }
    }
    /**
     * <pre>
     * securityrule
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.SecurityRule, opi_api.network.cloud.v1alpha1.SecurityRule.Builder, opi_api.network.cloud.v1alpha1.SecurityRuleOrBuilder> 
        getSecurityruleFieldBuilder() {
      if (securityruleBuilder_ == null) {
        securityruleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.SecurityRule, opi_api.network.cloud.v1alpha1.SecurityRule.Builder, opi_api.network.cloud.v1alpha1.SecurityRuleOrBuilder>(
                getSecurityrule(),
                getParentForChildren(),
                isClean());
        securityrule_ = null;
      }
      return securityruleBuilder_;
    }

    private java.lang.Object securityruleId_ = "";
    /**
     * <pre>
     * securityrule_id
     * </pre>
     *
     * <code>string securityrule_id = 3;</code>
     * @return The securityruleId.
     */
    public java.lang.String getSecurityruleId() {
      java.lang.Object ref = securityruleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityruleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * securityrule_id
     * </pre>
     *
     * <code>string securityrule_id = 3;</code>
     * @return The bytes for securityruleId.
     */
    public com.google.protobuf.ByteString
        getSecurityruleIdBytes() {
      java.lang.Object ref = securityruleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityruleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * securityrule_id
     * </pre>
     *
     * <code>string securityrule_id = 3;</code>
     * @param value The securityruleId to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityruleId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      securityruleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * securityrule_id
     * </pre>
     *
     * <code>string securityrule_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurityruleId() {
      
      securityruleId_ = getDefaultInstance().getSecurityruleId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * securityrule_id
     * </pre>
     *
     * <code>string securityrule_id = 3;</code>
     * @param value The bytes for securityruleId to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityruleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      securityruleId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest)
  private static final opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest();
  }

  public static opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSecurityRuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSecurityRuleRequest>() {
    @java.lang.Override
    public CreateSecurityRuleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSecurityRuleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSecurityRuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSecurityRuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

