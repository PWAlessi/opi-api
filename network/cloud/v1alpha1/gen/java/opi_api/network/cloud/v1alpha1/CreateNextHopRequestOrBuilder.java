// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface CreateNextHopRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.CreateNextHopRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * nexthop
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nexthop field is set.
   */
  boolean hasNexthop();
  /**
   * <pre>
   * nexthop
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nexthop.
   */
  opi_api.network.cloud.v1alpha1.NextHop getNexthop();
  /**
   * <pre>
   * nexthop
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.cloud.v1alpha1.NextHopOrBuilder getNexthopOrBuilder();

  /**
   * <pre>
   * nexthop_id
   * </pre>
   *
   * <code>string nexthop_id = 3;</code>
   * @return The nexthopId.
   */
  java.lang.String getNexthopId();
  /**
   * <pre>
   * nexthop_id
   * </pre>
   *
   * <code>string nexthop_id = 3;</code>
   * @return The bytes for nexthopId.
   */
  com.google.protobuf.ByteString
      getNexthopIdBytes();
}
