// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface VirtioScsiLunStatsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.VirtioScsiLunStatsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
   * @return Whether the controllerId field is set.
   */
  boolean hasControllerId();
  /**
   * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
   * @return The controllerId.
   */
  opi_api.common.v1.ObjectKey getControllerId();
  /**
   * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getControllerIdOrBuilder();

  /**
   * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
   * @return Whether the lunId field is set.
   */
  boolean hasLunId();
  /**
   * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
   * @return The lunId.
   */
  opi_api.common.v1.ObjectKey getLunId();
  /**
   * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getLunIdOrBuilder();
}
