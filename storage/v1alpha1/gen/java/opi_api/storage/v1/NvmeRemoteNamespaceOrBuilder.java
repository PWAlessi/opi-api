// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface NvmeRemoteNamespaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeRemoteNamespace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * controller through which the namespace is visible
   * </pre>
   *
   * <code>string controller_name_ref = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The controllerNameRef.
   */
  java.lang.String getControllerNameRef();
  /**
   * <pre>
   * controller through which the namespace is visible
   * </pre>
   *
   * <code>string controller_name_ref = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for controllerNameRef.
   */
  com.google.protobuf.ByteString
      getControllerNameRefBytes();

  /**
   * <pre>
   * NSID
   * </pre>
   *
   * <code>int32 nsid = 3;</code>
   * @return The nsid.
   */
  int getNsid();

  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>string nguid = 4;</code>
   * @return The nguid.
   */
  java.lang.String getNguid();
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>string nguid = 4;</code>
   * @return The bytes for nguid.
   */
  com.google.protobuf.ByteString
      getNguidBytes();

  /**
   * <pre>
   * 64bit Extended unique identifier for the namespace
   * mandatory if guid is not specified
   * </pre>
   *
   * <code>int64 eui64 = 5;</code>
   * @return The eui64.
   */
  long getEui64();

  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 6;</code>
   * @return Whether the uuid field is set.
   */
  boolean hasUuid();
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 6;</code>
   * @return The uuid.
   */
  opi_api.common.v1.Uuid getUuid();
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 6;</code>
   */
  opi_api.common.v1.UuidOrBuilder getUuidOrBuilder();
}
