// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface PolicyLookupMatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.PolicyLookupMatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * source IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress source_ip = 1;</code>
   * @return Whether the sourceIp field is set.
   */
  boolean hasSourceIp();
  /**
   * <pre>
   * source IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress source_ip = 1;</code>
   * @return The sourceIp.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getSourceIp();
  /**
   * <pre>
   * source IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress source_ip = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getSourceIpOrBuilder();

  /**
   * <pre>
   * tags corresponding to the source; an implementation may limit the maximum number of tags
   * range:1-4294967294
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: tags are 32bit values. --)
   * </pre>
   *
   * <code>repeated uint32 source_tags = 2;</code>
   * @return A list containing the sourceTags.
   */
  java.util.List<java.lang.Integer> getSourceTagsList();
  /**
   * <pre>
   * tags corresponding to the source; an implementation may limit the maximum number of tags
   * range:1-4294967294
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: tags are 32bit values. --)
   * </pre>
   *
   * <code>repeated uint32 source_tags = 2;</code>
   * @return The count of sourceTags.
   */
  int getSourceTagsCount();
  /**
   * <pre>
   * tags corresponding to the source; an implementation may limit the maximum number of tags
   * range:1-4294967294
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: tags are 32bit values. --)
   * </pre>
   *
   * <code>repeated uint32 source_tags = 2;</code>
   * @param index The index of the element to return.
   * @return The sourceTags at the given index.
   */
  int getSourceTags(int index);

  /**
   * <pre>
   * destination IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress destination_ip = 3;</code>
   * @return Whether the destinationIp field is set.
   */
  boolean hasDestinationIp();
  /**
   * <pre>
   * destination IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress destination_ip = 3;</code>
   * @return The destinationIp.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getDestinationIp();
  /**
   * <pre>
   * destination IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress destination_ip = 3;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getDestinationIpOrBuilder();

  /**
   * <pre>
   * tags corresponding to the destination; an implementation may limit the maximum number of tags
   * range:1-4294967294
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: tags are 32bit values. --)
   * </pre>
   *
   * <code>repeated uint32 destination_tags = 4;</code>
   * @return A list containing the destinationTags.
   */
  java.util.List<java.lang.Integer> getDestinationTagsList();
  /**
   * <pre>
   * tags corresponding to the destination; an implementation may limit the maximum number of tags
   * range:1-4294967294
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: tags are 32bit values. --)
   * </pre>
   *
   * <code>repeated uint32 destination_tags = 4;</code>
   * @return The count of destinationTags.
   */
  int getDestinationTagsCount();
  /**
   * <pre>
   * tags corresponding to the destination; an implementation may limit the maximum number of tags
   * range:1-4294967294
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: tags are 32bit values. --)
   * </pre>
   *
   * <code>repeated uint32 destination_tags = 4;</code>
   * @param index The index of the element to return.
   * @return The destinationTags at the given index.
   */
  int getDestinationTags(int index);

  /**
   * <pre>
   * IP protocol
   * </pre>
   *
   * <code>int32 protocol = 5;</code>
   * @return The protocol.
   */
  int getProtocol();

  /**
   * <pre>
   * source port, valid only for TCP and UDP
   * </pre>
   *
   * <code>int32 source_port = 6;</code>
   * @return The sourcePort.
   */
  int getSourcePort();

  /**
   * <pre>
   * destination port, valid only for TCP and UDP
   * </pre>
   *
   * <code>int32 destination_port = 7;</code>
   * @return The destinationPort.
   */
  int getDestinationPort();

  /**
   * <pre>
   * valid only for ICMPv4 and ICMPv6
   * </pre>
   *
   * <code>int32 icmp_type = 8;</code>
   * @return The icmpType.
   */
  int getIcmpType();

  /**
   * <pre>
   * valid only for ICMPv4 and ICMPv6
   * </pre>
   *
   * <code>int32 icmp_code = 9;</code>
   * @return The icmpCode.
   */
  int getIcmpCode();
}
