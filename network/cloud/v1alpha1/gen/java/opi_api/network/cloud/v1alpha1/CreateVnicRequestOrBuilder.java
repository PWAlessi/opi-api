// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface CreateVnicRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.CreateVnicRequest)
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
   * vnic
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Vnic vnic = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the vnic field is set.
   */
  boolean hasVnic();
  /**
   * <pre>
   * vnic
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Vnic vnic = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vnic.
   */
  opi_api.network.cloud.v1alpha1.Vnic getVnic();
  /**
   * <pre>
   * vnic
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Vnic vnic = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.cloud.v1alpha1.VnicOrBuilder getVnicOrBuilder();

  /**
   * <pre>
   * vnic_id
   * </pre>
   *
   * <code>string vnic_id = 3;</code>
   * @return The vnicId.
   */
  java.lang.String getVnicId();
  /**
   * <pre>
   * vnic_id
   * </pre>
   *
   * <code>string vnic_id = 3;</code>
   * @return The bytes for vnicId.
   */
  com.google.protobuf.ByteString
      getVnicIdBytes();
}
