// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mapping.proto

package opi_api.network.cloud.v1alpha1;

public interface MappingStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.MappingStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * private to public IP xlation nat index
   * </pre>
   *
   * <code>int32 public_nat_index = 1;</code>
   * @return The publicNatIndex.
   */
  int getPublicNatIndex();

  /**
   * <pre>
   * public to private IP xlation nat index
   * </pre>
   *
   * <code>int32 private_nat_index = 2;</code>
   * @return The privateNatIndex.
   */
  int getPrivateNatIndex();

  /**
   * <pre>
   * tunnel IP address
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress tunnel_ip = 3;</code>
   */
  java.util.List<opi_api.network.opinetcommon.v1alpha1.IPAddress> 
      getTunnelIpList();
  /**
   * <pre>
   * tunnel IP address
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress tunnel_ip = 3;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getTunnelIp(int index);
  /**
   * <pre>
   * tunnel IP address
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress tunnel_ip = 3;</code>
   */
  int getTunnelIpCount();
  /**
   * <pre>
   * tunnel IP address
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress tunnel_ip = 3;</code>
   */
  java.util.List<? extends opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder> 
      getTunnelIpOrBuilderList();
  /**
   * <pre>
   * tunnel IP address
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPAddress tunnel_ip = 3;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getTunnelIpOrBuilder(
      int index);

  /**
   * <pre>
   * service to backend port mapping hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle svc_port_map_hw_handle = 4;</code>
   * @return Whether the svcPortMapHwHandle field is set.
   */
  boolean hasSvcPortMapHwHandle();
  /**
   * <pre>
   * service to backend port mapping hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle svc_port_map_hw_handle = 4;</code>
   * @return The svcPortMapHwHandle.
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandle getSvcPortMapHwHandle();
  /**
   * <pre>
   * service to backend port mapping hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle svc_port_map_hw_handle = 4;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder getSvcPortMapHwHandleOrBuilder();

  /**
   * <pre>
   * VNF tunnel hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle vnf_tunnel_hw_handle = 5;</code>
   * @return Whether the vnfTunnelHwHandle field is set.
   */
  boolean hasVnfTunnelHwHandle();
  /**
   * <pre>
   * VNF tunnel hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle vnf_tunnel_hw_handle = 5;</code>
   * @return The vnfTunnelHwHandle.
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandle getVnfTunnelHwHandle();
  /**
   * <pre>
   * VNF tunnel hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle vnf_tunnel_hw_handle = 5;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder getVnfTunnelHwHandleOrBuilder();

  /**
   * <pre>
   * rewrite index
   * </pre>
   *
   * <code>int32 rewrite_index = 6;</code>
   * @return The rewriteIndex.
   */
  int getRewriteIndex();
}
