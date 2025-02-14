// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * BGP NLRI prefix object, this object is not conifgured by the user
 * rather populated by the BGP automatically, spec is defined for get operations
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.BGPNLRIPrefix}
 */
public final class BGPNLRIPrefix extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.BGPNLRIPrefix)
    BGPNLRIPrefixOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BGPNLRIPrefix.newBuilder() to construct.
  private BGPNLRIPrefix(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BGPNLRIPrefix() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BGPNLRIPrefix();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BGPNLRIPrefix(
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
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.Builder subBuilder = null;
            if (spec_ != null) {
              subBuilder = spec_.toBuilder();
            }
            spec_ = input.readMessage(opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(spec_);
              spec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.Builder subBuilder = null;
            if (state_ != null) {
              subBuilder = state_.toBuilder();
            }
            state_ = input.readMessage(opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(state_);
              state_ = subBuilder.buildPartial();
            }

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
    return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPNLRIPrefix_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPNLRIPrefix_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefix.class, opi_api.network.cloud.v1alpha1.BGPNLRIPrefix.Builder.class);
  }

  public static final int SPEC_FIELD_NUMBER = 1;
  private opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec_;
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return spec_ != null;
  }
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
   * @return The spec.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec getSpec() {
    return spec_ == null ? opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.getDefaultInstance() : spec_;
  }
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpecOrBuilder getSpecOrBuilder() {
    return getSpec();
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state_;
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return state_ != null;
  }
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
   * @return The state.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus getState() {
    return state_ == null ? opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.getDefaultInstance() : state_;
  }
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatusOrBuilder getStateOrBuilder() {
    return getState();
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
    if (spec_ != null) {
      output.writeMessage(1, getSpec());
    }
    if (state_ != null) {
      output.writeMessage(2, getState());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (spec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpec());
    }
    if (state_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getState());
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.BGPNLRIPrefix)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.BGPNLRIPrefix other = (opi_api.network.cloud.v1alpha1.BGPNLRIPrefix) obj;

    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
    }
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState()
          .equals(other.getState())) return false;
    }
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
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.BGPNLRIPrefix prototype) {
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
   * BGP NLRI prefix object, this object is not conifgured by the user
   * rather populated by the BGP automatically, spec is defined for get operations
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.BGPNLRIPrefix}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.BGPNLRIPrefix)
      opi_api.network.cloud.v1alpha1.BGPNLRIPrefixOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPNLRIPrefix_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPNLRIPrefix_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.BGPNLRIPrefix.class, opi_api.network.cloud.v1alpha1.BGPNLRIPrefix.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.BGPNLRIPrefix.newBuilder()
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
      if (specBuilder_ == null) {
        spec_ = null;
      } else {
        spec_ = null;
        specBuilder_ = null;
      }
      if (stateBuilder_ == null) {
        state_ = null;
      } else {
        state_ = null;
        stateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPNLRIPrefix_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefix getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.BGPNLRIPrefix.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefix build() {
      opi_api.network.cloud.v1alpha1.BGPNLRIPrefix result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefix buildPartial() {
      opi_api.network.cloud.v1alpha1.BGPNLRIPrefix result = new opi_api.network.cloud.v1alpha1.BGPNLRIPrefix(this);
      if (specBuilder_ == null) {
        result.spec_ = spec_;
      } else {
        result.spec_ = specBuilder_.build();
      }
      if (stateBuilder_ == null) {
        result.state_ = state_;
      } else {
        result.state_ = stateBuilder_.build();
      }
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
      if (other instanceof opi_api.network.cloud.v1alpha1.BGPNLRIPrefix) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.BGPNLRIPrefix)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.BGPNLRIPrefix other) {
      if (other == opi_api.network.cloud.v1alpha1.BGPNLRIPrefix.getDefaultInstance()) return this;
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
      }
      if (other.hasState()) {
        mergeState(other.getState());
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
      opi_api.network.cloud.v1alpha1.BGPNLRIPrefix parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.BGPNLRIPrefix) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.Builder, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpecOrBuilder> specBuilder_;
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return specBuilder_ != null || spec_ != null;
    }
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     * @return The spec.
     */
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     */
    public Builder setSpec(opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
        onChanged();
      } else {
        specBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     */
    public Builder setSpec(
        opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
        onChanged();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     */
    public Builder mergeSpec(opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec value) {
      if (specBuilder_ == null) {
        if (spec_ != null) {
          spec_ =
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.newBuilder(spec_).mergeFrom(value).buildPartial();
        } else {
          spec_ = value;
        }
        onChanged();
      } else {
        specBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     */
    public Builder clearSpec() {
      if (specBuilder_ == null) {
        spec_ = null;
        onChanged();
      } else {
        spec_ = null;
        specBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.Builder getSpecBuilder() {
      
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.getDefaultInstance() : spec_;
      }
    }
    /**
     * <pre>
     * configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.Builder, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpecOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec.Builder, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpecOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
    }

    private opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.Builder, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatusOrBuilder> stateBuilder_;
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return stateBuilder_ != null || state_ != null;
    }
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     * @return The state.
     */
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus getState() {
      if (stateBuilder_ == null) {
        return state_ == null ? opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.getDefaultInstance() : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     */
    public Builder setState(opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
        onChanged();
      } else {
        stateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     */
    public Builder setState(
        opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.Builder builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
        onChanged();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     */
    public Builder mergeState(opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus value) {
      if (stateBuilder_ == null) {
        if (state_ != null) {
          state_ =
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.newBuilder(state_).mergeFrom(value).buildPartial();
        } else {
          state_ = value;
        }
        onChanged();
      } else {
        stateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     */
    public Builder clearState() {
      if (stateBuilder_ == null) {
        state_ = null;
        onChanged();
      } else {
        state_ = null;
        stateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.Builder getStateBuilder() {
      
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatusOrBuilder getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null ?
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.getDefaultInstance() : state_;
      }
    }
    /**
     * <pre>
     * status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus state = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.Builder, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatusOrBuilder> 
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatus.Builder, opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatusOrBuilder>(
                getState(),
                getParentForChildren(),
                isClean());
        state_ = null;
      }
      return stateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.BGPNLRIPrefix)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.BGPNLRIPrefix)
  private static final opi_api.network.cloud.v1alpha1.BGPNLRIPrefix DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.BGPNLRIPrefix();
  }

  public static opi_api.network.cloud.v1alpha1.BGPNLRIPrefix getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BGPNLRIPrefix>
      PARSER = new com.google.protobuf.AbstractParser<BGPNLRIPrefix>() {
    @java.lang.Override
    public BGPNLRIPrefix parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BGPNLRIPrefix(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BGPNLRIPrefix> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BGPNLRIPrefix> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPNLRIPrefix getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

