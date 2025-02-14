// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * List device response
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListDevicesResponse}
 */
public final class ListDevicesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.ListDevicesResponse)
    ListDevicesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDevicesResponse.newBuilder() to construct.
  private ListDevicesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDevicesResponse() {
    device_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDevicesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDevicesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              device_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.Device>();
              mutable_bitField0_ |= 0x00000001;
            }
            device_.add(
                input.readMessage(opi_api.network.cloud.v1alpha1.Device.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        device_ = java.util.Collections.unmodifiableList(device_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListDevicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListDevicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.ListDevicesResponse.class, opi_api.network.cloud.v1alpha1.ListDevicesResponse.Builder.class);
  }

  public static final int DEVICE_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.cloud.v1alpha1.Device> device_;
  /**
   * <pre>
   * list of devices
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.cloud.v1alpha1.Device> getDeviceList() {
    return device_;
  }
  /**
   * <pre>
   * list of devices
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.cloud.v1alpha1.DeviceOrBuilder> 
      getDeviceOrBuilderList() {
    return device_;
  }
  /**
   * <pre>
   * list of devices
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
   */
  @java.lang.Override
  public int getDeviceCount() {
    return device_.size();
  }
  /**
   * <pre>
   * list of devices
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.Device getDevice(int index) {
    return device_.get(index);
  }
  /**
   * <pre>
   * list of devices
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.DeviceOrBuilder getDeviceOrBuilder(
      int index) {
    return device_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < device_.size(); i++) {
      output.writeMessage(1, device_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < device_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, device_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.ListDevicesResponse)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.ListDevicesResponse other = (opi_api.network.cloud.v1alpha1.ListDevicesResponse) obj;

    if (!getDeviceList()
        .equals(other.getDeviceList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getDeviceCount() > 0) {
      hash = (37 * hash) + DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.ListDevicesResponse prototype) {
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
   * List device response
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListDevicesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.ListDevicesResponse)
      opi_api.network.cloud.v1alpha1.ListDevicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListDevicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListDevicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.ListDevicesResponse.class, opi_api.network.cloud.v1alpha1.ListDevicesResponse.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.ListDevicesResponse.newBuilder()
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
        getDeviceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deviceBuilder_ == null) {
        device_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        deviceBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListDevicesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListDevicesResponse getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.ListDevicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListDevicesResponse build() {
      opi_api.network.cloud.v1alpha1.ListDevicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListDevicesResponse buildPartial() {
      opi_api.network.cloud.v1alpha1.ListDevicesResponse result = new opi_api.network.cloud.v1alpha1.ListDevicesResponse(this);
      int from_bitField0_ = bitField0_;
      if (deviceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          device_ = java.util.Collections.unmodifiableList(device_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.device_ = device_;
      } else {
        result.device_ = deviceBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.ListDevicesResponse) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.ListDevicesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.ListDevicesResponse other) {
      if (other == opi_api.network.cloud.v1alpha1.ListDevicesResponse.getDefaultInstance()) return this;
      if (deviceBuilder_ == null) {
        if (!other.device_.isEmpty()) {
          if (device_.isEmpty()) {
            device_ = other.device_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeviceIsMutable();
            device_.addAll(other.device_);
          }
          onChanged();
        }
      } else {
        if (!other.device_.isEmpty()) {
          if (deviceBuilder_.isEmpty()) {
            deviceBuilder_.dispose();
            deviceBuilder_ = null;
            device_ = other.device_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deviceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDeviceFieldBuilder() : null;
          } else {
            deviceBuilder_.addAllMessages(other.device_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      opi_api.network.cloud.v1alpha1.ListDevicesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.ListDevicesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.cloud.v1alpha1.Device> device_ =
      java.util.Collections.emptyList();
    private void ensureDeviceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        device_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.Device>(device_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Device, opi_api.network.cloud.v1alpha1.Device.Builder, opi_api.network.cloud.v1alpha1.DeviceOrBuilder> deviceBuilder_;

    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.Device> getDeviceList() {
      if (deviceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(device_);
      } else {
        return deviceBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public int getDeviceCount() {
      if (deviceBuilder_ == null) {
        return device_.size();
      } else {
        return deviceBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Device getDevice(int index) {
      if (deviceBuilder_ == null) {
        return device_.get(index);
      } else {
        return deviceBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder setDevice(
        int index, opi_api.network.cloud.v1alpha1.Device value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceIsMutable();
        device_.set(index, value);
        onChanged();
      } else {
        deviceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder setDevice(
        int index, opi_api.network.cloud.v1alpha1.Device.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        device_.set(index, builderForValue.build());
        onChanged();
      } else {
        deviceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder addDevice(opi_api.network.cloud.v1alpha1.Device value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceIsMutable();
        device_.add(value);
        onChanged();
      } else {
        deviceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder addDevice(
        int index, opi_api.network.cloud.v1alpha1.Device value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceIsMutable();
        device_.add(index, value);
        onChanged();
      } else {
        deviceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder addDevice(
        opi_api.network.cloud.v1alpha1.Device.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        device_.add(builderForValue.build());
        onChanged();
      } else {
        deviceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder addDevice(
        int index, opi_api.network.cloud.v1alpha1.Device.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        device_.add(index, builderForValue.build());
        onChanged();
      } else {
        deviceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder addAllDevice(
        java.lang.Iterable<? extends opi_api.network.cloud.v1alpha1.Device> values) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, device_);
        onChanged();
      } else {
        deviceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder clearDevice() {
      if (deviceBuilder_ == null) {
        device_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deviceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public Builder removeDevice(int index) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        device_.remove(index);
        onChanged();
      } else {
        deviceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Device.Builder getDeviceBuilder(
        int index) {
      return getDeviceFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.DeviceOrBuilder getDeviceOrBuilder(
        int index) {
      if (deviceBuilder_ == null) {
        return device_.get(index);  } else {
        return deviceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public java.util.List<? extends opi_api.network.cloud.v1alpha1.DeviceOrBuilder> 
         getDeviceOrBuilderList() {
      if (deviceBuilder_ != null) {
        return deviceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(device_);
      }
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Device.Builder addDeviceBuilder() {
      return getDeviceFieldBuilder().addBuilder(
          opi_api.network.cloud.v1alpha1.Device.getDefaultInstance());
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Device.Builder addDeviceBuilder(
        int index) {
      return getDeviceFieldBuilder().addBuilder(
          index, opi_api.network.cloud.v1alpha1.Device.getDefaultInstance());
    }
    /**
     * <pre>
     * list of devices
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Device device = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.Device.Builder> 
         getDeviceBuilderList() {
      return getDeviceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Device, opi_api.network.cloud.v1alpha1.Device.Builder, opi_api.network.cloud.v1alpha1.DeviceOrBuilder> 
        getDeviceFieldBuilder() {
      if (deviceBuilder_ == null) {
        deviceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.Device, opi_api.network.cloud.v1alpha1.Device.Builder, opi_api.network.cloud.v1alpha1.DeviceOrBuilder>(
                device_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        device_ = null;
      }
      return deviceBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.ListDevicesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ListDevicesResponse)
  private static final opi_api.network.cloud.v1alpha1.ListDevicesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.ListDevicesResponse();
  }

  public static opi_api.network.cloud.v1alpha1.ListDevicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDevicesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDevicesResponse>() {
    @java.lang.Override
    public ListDevicesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListDevicesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDevicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDevicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.ListDevicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

