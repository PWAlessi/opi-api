// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mapping.proto

package opi_api.network.cloud.v1alpha1;

public interface MappingLookupFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.MappingLookupFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Local is set to true for local mappings or else false
   * </pre>
   *
   * <code>bool local = 1;</code>
   * @return The local.
   */
  boolean getLocal();

  /**
   * <pre>
   * KeyType is used for query based on L3 or L2 without specifically
   * providing exact key (i.e. list all L2/L3 mappings)
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.MappingKeyType key_type = 2;</code>
   * @return The enum numeric value on the wire for keyType.
   */
  int getKeyTypeValue();
  /**
   * <pre>
   * KeyType is used for query based on L3 or L2 without specifically
   * providing exact key (i.e. list all L2/L3 mappings)
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.MappingKeyType key_type = 2;</code>
   * @return The keyType.
   */
  opi_api.network.cloud.v1alpha1.MappingKeyType getKeyType();

  /**
   * <pre>
   * Type is used to specify the type of mapping
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.MappingType type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type is used to specify the type of mapping
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.MappingType type = 3;</code>
   * @return The type.
   */
  opi_api.network.cloud.v1alpha1.MappingType getType();

  /**
   * <pre>
   * IP mapping key
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.L3MappingKey ip_key = 4;</code>
   * @return Whether the ipKey field is set.
   */
  boolean hasIpKey();
  /**
   * <pre>
   * IP mapping key
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.L3MappingKey ip_key = 4;</code>
   * @return The ipKey.
   */
  opi_api.network.cloud.v1alpha1.L3MappingKey getIpKey();
  /**
   * <pre>
   * IP mapping key
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.L3MappingKey ip_key = 4;</code>
   */
  opi_api.network.cloud.v1alpha1.L3MappingKeyOrBuilder getIpKeyOrBuilder();

  /**
   * <pre>
   * MAC mapping key
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.L2MappingKey mac_key = 5;</code>
   * @return Whether the macKey field is set.
   */
  boolean hasMacKey();
  /**
   * <pre>
   * MAC mapping key
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.L2MappingKey mac_key = 5;</code>
   * @return The macKey.
   */
  opi_api.network.cloud.v1alpha1.L2MappingKey getMacKey();
  /**
   * <pre>
   * MAC mapping key
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.L2MappingKey mac_key = 5;</code>
   */
  opi_api.network.cloud.v1alpha1.L2MappingKeyOrBuilder getMacKeyOrBuilder();

  /**
   * <pre>
   * IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 6;</code>
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   * <pre>
   * IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 6;</code>
   * @return The ipAddress.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getIpAddress();
  /**
   * <pre>
   * IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 6;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getIpAddressOrBuilder();

  /**
   * <pre>
   * MAC address
   * </pre>
   *
   * <code>bytes mac_address = 7;</code>
   * @return Whether the macAddress field is set.
   */
  boolean hasMacAddress();
  /**
   * <pre>
   * MAC address
   * </pre>
   *
   * <code>bytes mac_address = 7;</code>
   * @return The macAddress.
   */
  com.google.protobuf.ByteString getMacAddress();

  /**
   * <pre>
   * VPC id
   * </pre>
   *
   * <code>string vpc_name_ref = 8;</code>
   * @return Whether the vpcNameRef field is set.
   */
  boolean hasVpcNameRef();
  /**
   * <pre>
   * VPC id
   * </pre>
   *
   * <code>string vpc_name_ref = 8;</code>
   * @return The vpcNameRef.
   */
  java.lang.String getVpcNameRef();
  /**
   * <pre>
   * VPC id
   * </pre>
   *
   * <code>string vpc_name_ref = 8;</code>
   * @return The bytes for vpcNameRef.
   */
  com.google.protobuf.ByteString
      getVpcNameRefBytes();

  public opi_api.network.cloud.v1alpha1.MappingLookupFilter.IpOrMacCase getIpOrMacCase();
}
