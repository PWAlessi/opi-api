// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface VirtioScsiControllerStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.VirtioScsiControllerStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  opi_api.common.v1.ObjectKey getId();
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder();

  /**
   * <code>string stats = 2;</code>
   * @return The stats.
   */
  java.lang.String getStats();
  /**
   * <code>string stats = 2;</code>
   * @return The bytes for stats.
   */
  com.google.protobuf.ByteString
      getStatsBytes();
}
