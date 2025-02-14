// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Create Bgp Request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateBgpRequest}
 */
public final class CreateBgpRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.CreateBgpRequest)
    CreateBgpRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBgpRequest.newBuilder() to construct.
  private CreateBgpRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBgpRequest() {
    parent_ = "";
    bgpId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateBgpRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateBgpRequest(
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
            opi_api.network.cloud.v1alpha1.Bgp.Builder subBuilder = null;
            if (bgp_ != null) {
              subBuilder = bgp_.toBuilder();
            }
            bgp_ = input.readMessage(opi_api.network.cloud.v1alpha1.Bgp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bgp_);
              bgp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            bgpId_ = s;
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
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBgpRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBgpRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.CreateBgpRequest.class, opi_api.network.cloud.v1alpha1.CreateBgpRequest.Builder.class);
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

  public static final int BGP_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.Bgp bgp_;
  /**
   * <pre>
   * bgp
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the bgp field is set.
   */
  @java.lang.Override
  public boolean hasBgp() {
    return bgp_ != null;
  }
  /**
   * <pre>
   * bgp
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bgp.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.Bgp getBgp() {
    return bgp_ == null ? opi_api.network.cloud.v1alpha1.Bgp.getDefaultInstance() : bgp_;
  }
  /**
   * <pre>
   * bgp
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BgpOrBuilder getBgpOrBuilder() {
    return getBgp();
  }

  public static final int BGP_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object bgpId_;
  /**
   * <pre>
   * bgp_id
   * </pre>
   *
   * <code>string bgp_id = 3;</code>
   * @return The bgpId.
   */
  @java.lang.Override
  public java.lang.String getBgpId() {
    java.lang.Object ref = bgpId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bgpId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * bgp_id
   * </pre>
   *
   * <code>string bgp_id = 3;</code>
   * @return The bytes for bgpId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBgpIdBytes() {
    java.lang.Object ref = bgpId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bgpId_ = b;
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
    if (bgp_ != null) {
      output.writeMessage(2, getBgp());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bgpId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bgpId_);
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
    if (bgp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBgp());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bgpId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bgpId_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.CreateBgpRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.CreateBgpRequest other = (opi_api.network.cloud.v1alpha1.CreateBgpRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasBgp() != other.hasBgp()) return false;
    if (hasBgp()) {
      if (!getBgp()
          .equals(other.getBgp())) return false;
    }
    if (!getBgpId()
        .equals(other.getBgpId())) return false;
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
    if (hasBgp()) {
      hash = (37 * hash) + BGP_FIELD_NUMBER;
      hash = (53 * hash) + getBgp().hashCode();
    }
    hash = (37 * hash) + BGP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBgpId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.CreateBgpRequest prototype) {
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
   * Create Bgp Request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateBgpRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.CreateBgpRequest)
      opi_api.network.cloud.v1alpha1.CreateBgpRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBgpRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBgpRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.CreateBgpRequest.class, opi_api.network.cloud.v1alpha1.CreateBgpRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.CreateBgpRequest.newBuilder()
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

      if (bgpBuilder_ == null) {
        bgp_ = null;
      } else {
        bgp_ = null;
        bgpBuilder_ = null;
      }
      bgpId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBgpRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateBgpRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.CreateBgpRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateBgpRequest build() {
      opi_api.network.cloud.v1alpha1.CreateBgpRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateBgpRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.CreateBgpRequest result = new opi_api.network.cloud.v1alpha1.CreateBgpRequest(this);
      result.parent_ = parent_;
      if (bgpBuilder_ == null) {
        result.bgp_ = bgp_;
      } else {
        result.bgp_ = bgpBuilder_.build();
      }
      result.bgpId_ = bgpId_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.CreateBgpRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.CreateBgpRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.CreateBgpRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.CreateBgpRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasBgp()) {
        mergeBgp(other.getBgp());
      }
      if (!other.getBgpId().isEmpty()) {
        bgpId_ = other.bgpId_;
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
      opi_api.network.cloud.v1alpha1.CreateBgpRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.CreateBgpRequest) e.getUnfinishedMessage();
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

    private opi_api.network.cloud.v1alpha1.Bgp bgp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Bgp, opi_api.network.cloud.v1alpha1.Bgp.Builder, opi_api.network.cloud.v1alpha1.BgpOrBuilder> bgpBuilder_;
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the bgp field is set.
     */
    public boolean hasBgp() {
      return bgpBuilder_ != null || bgp_ != null;
    }
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bgp.
     */
    public opi_api.network.cloud.v1alpha1.Bgp getBgp() {
      if (bgpBuilder_ == null) {
        return bgp_ == null ? opi_api.network.cloud.v1alpha1.Bgp.getDefaultInstance() : bgp_;
      } else {
        return bgpBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBgp(opi_api.network.cloud.v1alpha1.Bgp value) {
      if (bgpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bgp_ = value;
        onChanged();
      } else {
        bgpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBgp(
        opi_api.network.cloud.v1alpha1.Bgp.Builder builderForValue) {
      if (bgpBuilder_ == null) {
        bgp_ = builderForValue.build();
        onChanged();
      } else {
        bgpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeBgp(opi_api.network.cloud.v1alpha1.Bgp value) {
      if (bgpBuilder_ == null) {
        if (bgp_ != null) {
          bgp_ =
            opi_api.network.cloud.v1alpha1.Bgp.newBuilder(bgp_).mergeFrom(value).buildPartial();
        } else {
          bgp_ = value;
        }
        onChanged();
      } else {
        bgpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearBgp() {
      if (bgpBuilder_ == null) {
        bgp_ = null;
        onChanged();
      } else {
        bgp_ = null;
        bgpBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.Bgp.Builder getBgpBuilder() {
      
      onChanged();
      return getBgpFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.BgpOrBuilder getBgpOrBuilder() {
      if (bgpBuilder_ != null) {
        return bgpBuilder_.getMessageOrBuilder();
      } else {
        return bgp_ == null ?
            opi_api.network.cloud.v1alpha1.Bgp.getDefaultInstance() : bgp_;
      }
    }
    /**
     * <pre>
     * bgp
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Bgp bgp = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Bgp, opi_api.network.cloud.v1alpha1.Bgp.Builder, opi_api.network.cloud.v1alpha1.BgpOrBuilder> 
        getBgpFieldBuilder() {
      if (bgpBuilder_ == null) {
        bgpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.Bgp, opi_api.network.cloud.v1alpha1.Bgp.Builder, opi_api.network.cloud.v1alpha1.BgpOrBuilder>(
                getBgp(),
                getParentForChildren(),
                isClean());
        bgp_ = null;
      }
      return bgpBuilder_;
    }

    private java.lang.Object bgpId_ = "";
    /**
     * <pre>
     * bgp_id
     * </pre>
     *
     * <code>string bgp_id = 3;</code>
     * @return The bgpId.
     */
    public java.lang.String getBgpId() {
      java.lang.Object ref = bgpId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bgpId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * bgp_id
     * </pre>
     *
     * <code>string bgp_id = 3;</code>
     * @return The bytes for bgpId.
     */
    public com.google.protobuf.ByteString
        getBgpIdBytes() {
      java.lang.Object ref = bgpId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bgpId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * bgp_id
     * </pre>
     *
     * <code>string bgp_id = 3;</code>
     * @param value The bgpId to set.
     * @return This builder for chaining.
     */
    public Builder setBgpId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bgpId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bgp_id
     * </pre>
     *
     * <code>string bgp_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBgpId() {
      
      bgpId_ = getDefaultInstance().getBgpId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bgp_id
     * </pre>
     *
     * <code>string bgp_id = 3;</code>
     * @param value The bytes for bgpId to set.
     * @return This builder for chaining.
     */
    public Builder setBgpIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bgpId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.CreateBgpRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.CreateBgpRequest)
  private static final opi_api.network.cloud.v1alpha1.CreateBgpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.CreateBgpRequest();
  }

  public static opi_api.network.cloud.v1alpha1.CreateBgpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBgpRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateBgpRequest>() {
    @java.lang.Override
    public CreateBgpRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateBgpRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateBgpRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBgpRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.CreateBgpRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

