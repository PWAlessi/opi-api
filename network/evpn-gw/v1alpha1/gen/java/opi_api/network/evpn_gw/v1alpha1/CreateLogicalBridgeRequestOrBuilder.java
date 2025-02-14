// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface CreateLogicalBridgeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID to use for the logical bridge, which will become the final component of
   * the logical bridge's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string logical_bridge_id = 1;</code>
   * @return The logicalBridgeId.
   */
  java.lang.String getLogicalBridgeId();
  /**
   * <pre>
   * The ID to use for the logical bridge, which will become the final component of
   * the logical bridge's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string logical_bridge_id = 1;</code>
   * @return The bytes for logicalBridgeId.
   */
  com.google.protobuf.ByteString
      getLogicalBridgeIdBytes();

  /**
   * <pre>
   * The logical bridge to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridge = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the logicalBridge field is set.
   */
  boolean hasLogicalBridge();
  /**
   * <pre>
   * The logical bridge to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridge = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The logicalBridge.
   */
  opi_api.network.evpn_gw.v1alpha1.LogicalBridge getLogicalBridge();
  /**
   * <pre>
   * The logical bridge to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridge = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.evpn_gw.v1alpha1.LogicalBridgeOrBuilder getLogicalBridgeOrBuilder();
}
