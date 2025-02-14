// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opicommon.proto

package opi_api.storage.v1;

public interface PciEndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.PciEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The "port" or "device". In other words, the connector/cable that's
   * plugged into a particular host. This number may end up matching
   * the host-assigned "device" value in the bus:device:function identifier,
   * but it does not strictly have to and that should not be relied upon.
   * </pre>
   *
   * <code>int32 port_id = 1;</code>
   * @return The portId.
   */
  int getPortId();

  /**
   * <pre>
   * Physical function index. This may end up matching the host-assigned
   * "function" value in the bus:device:function identifier, but it does not
   * strictly have to and that should not be relied upon.
   * </pre>
   *
   * <code>int32 physical_function = 2;</code>
   * @return The physicalFunction.
   */
  int getPhysicalFunction();

  /**
   * <pre>
   * Virtual function index. 1-based index.
   * The value 0 is reserved to represent the PCI physical "device".
   * This may end up matching the host-assigned "function" value in the
   * bus:device:function identifier, but it does not strictly have to and
   * that should not be relied upon.
   * </pre>
   *
   * <code>int32 virtual_function = 3;</code>
   * @return The virtualFunction.
   */
  int getVirtualFunction();
}
