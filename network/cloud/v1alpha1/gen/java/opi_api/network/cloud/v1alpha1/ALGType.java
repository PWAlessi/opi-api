// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * ALG specifices with Application Level Gateway (ALG) should be invoked
 * when a rule match happens. This ALG will also be reported in the flow logs.
 * Any platform specific limitations may result into errors during configuration
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.cloud.v1alpha1.ALGType}
 */
public enum ALGType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>ALG_TYPE_UNSPECIFIED = 0;</code>
   */
  ALG_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * TFTP ALG
   * </pre>
   *
   * <code>ALG_TYPE_TFTP = 1;</code>
   */
  ALG_TYPE_TFTP(1),
  /**
   * <pre>
   * FTP ALG
   * </pre>
   *
   * <code>ALG_TYPE_FTP = 2;</code>
   */
  ALG_TYPE_FTP(2),
  /**
   * <pre>
   * DNS ALG
   * </pre>
   *
   * <code>ALG_TYPE_DNS = 3;</code>
   */
  ALG_TYPE_DNS(3),
  /**
   * <pre>
   * SUNRPC ALG
   * </pre>
   *
   * <code>ALG_TYPE_SUNRPC = 4;</code>
   */
  ALG_TYPE_SUNRPC(4),
  /**
   * <pre>
   * MSRPC ALG
   * </pre>
   *
   * <code>ALG_TYPE_MSRPC = 5;</code>
   */
  ALG_TYPE_MSRPC(5),
  /**
   * <pre>
   * RTSP ALG
   * </pre>
   *
   * <code>ALG_TYPE_RTSP = 6;</code>
   */
  ALG_TYPE_RTSP(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>ALG_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ALG_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * TFTP ALG
   * </pre>
   *
   * <code>ALG_TYPE_TFTP = 1;</code>
   */
  public static final int ALG_TYPE_TFTP_VALUE = 1;
  /**
   * <pre>
   * FTP ALG
   * </pre>
   *
   * <code>ALG_TYPE_FTP = 2;</code>
   */
  public static final int ALG_TYPE_FTP_VALUE = 2;
  /**
   * <pre>
   * DNS ALG
   * </pre>
   *
   * <code>ALG_TYPE_DNS = 3;</code>
   */
  public static final int ALG_TYPE_DNS_VALUE = 3;
  /**
   * <pre>
   * SUNRPC ALG
   * </pre>
   *
   * <code>ALG_TYPE_SUNRPC = 4;</code>
   */
  public static final int ALG_TYPE_SUNRPC_VALUE = 4;
  /**
   * <pre>
   * MSRPC ALG
   * </pre>
   *
   * <code>ALG_TYPE_MSRPC = 5;</code>
   */
  public static final int ALG_TYPE_MSRPC_VALUE = 5;
  /**
   * <pre>
   * RTSP ALG
   * </pre>
   *
   * <code>ALG_TYPE_RTSP = 6;</code>
   */
  public static final int ALG_TYPE_RTSP_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ALGType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ALGType forNumber(int value) {
    switch (value) {
      case 0: return ALG_TYPE_UNSPECIFIED;
      case 1: return ALG_TYPE_TFTP;
      case 2: return ALG_TYPE_FTP;
      case 3: return ALG_TYPE_DNS;
      case 4: return ALG_TYPE_SUNRPC;
      case 5: return ALG_TYPE_MSRPC;
      case 6: return ALG_TYPE_RTSP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ALGType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ALGType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ALGType>() {
          public ALGType findValueByNumber(int number) {
            return ALGType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ALGType[] VALUES = values();

  public static ALGType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ALGType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.cloud.v1alpha1.ALGType)
}

