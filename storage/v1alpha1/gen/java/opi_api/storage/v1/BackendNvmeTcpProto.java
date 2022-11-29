// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public final class BackendNvmeTcpProto {
  private BackendNvmeTcpProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteController_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026backend_nvme_tcp.proto\022\022opi_api.storag" +
      "e.v1\"\320\002\n\024NVMfRemoteController\022\n\n\002id\030\001 \001(" +
      "\003\022\014\n\004name\030\002 \001(\t\0225\n\006trtype\030\003 \001(\0162%.opi_ap" +
      "i.storage.v1.NvmeTransportType\0225\n\006adrfam" +
      "\030\004 \001(\0162%.opi_api.storage.v1.NvmeAddressF" +
      "amily\022\016\n\006traddr\030\005 \001(\t\022\017\n\007trsvcid\030\006 \001(\003\022\016" +
      "\n\006subnqn\030\007 \001(\t\022\r\n\005hdgst\030\010 \001(\010\022\r\n\005ddgst\030\t" +
      " \001(\010\0224\n\tmultipath\030\n \001(\0162!.opi_api.storag" +
      "e.v1.NvmeMultipath\022\027\n\017io_queues_count\030\013 " +
      "\001(\003\022\022\n\nqueue_size\030\014 \001(\003\"\\\n\"NVMfRemoteCon" +
      "trollerConnectRequest\0226\n\004ctrl\030\001 \001(\0132(.op" +
      "i_api.storage.v1.NVMfRemoteController\"%\n" +
      "#NVMfRemoteControllerConnectResponse\"3\n%" +
      "NVMfRemoteControllerDisconnectRequest\022\n\n" +
      "\002id\030\001 \001(\003\"(\n&NVMfRemoteControllerDisconn" +
      "ectResponse\".\n NVMfRemoteControllerReset" +
      "Request\022\n\n\002id\030\001 \001(\003\"#\n!NVMfRemoteControl" +
      "lerResetResponse\"-\n\037NVMfRemoteController" +
      "ListRequest\022\n\n\002id\030\001 \001(\003\"Z\n NVMfRemoteCon" +
      "trollerListResponse\0226\n\004ctrl\030\001 \003(\0132(.opi_" +
      "api.storage.v1.NVMfRemoteController\",\n\036N" +
      "VMfRemoteControllerGetRequest\022\n\n\002id\030\001 \001(" +
      "\003\"Y\n\037NVMfRemoteControllerGetResponse\0226\n\004" +
      "ctrl\030\001 \001(\0132(.opi_api.storage.v1.NVMfRemo" +
      "teController\".\n NVMfRemoteControllerStat" +
      "sRequest\022\n\n\002id\030\001 \001(\003\">\n!NVMfRemoteContro" +
      "llerStatsResponse\022\n\n\002id\030\001 \001(\003\022\r\n\005stats\030\002" +
      " \001(\t*\264\001\n\021NvmeTransportType\022#\n\037NVME_TRANS" +
      "PORT_TYPE_UNSPECIFIED\020\000\022\025\n\021NVME_TRANSPOR" +
      "T_FC\020\001\022\027\n\023NVME_TRANSPORT_PCIE\020\002\022\027\n\023NVME_" +
      "TRANSPORT_RDMA\020\003\022\026\n\022NVME_TRANSPORT_TCP\020\004" +
      "\022\031\n\025NVME_TRANSPORT_CUSTOM\020\005*\250\001\n\021NvmeAddr" +
      "essFamily\022#\n\037NVME_ADDRESS_FAMILY_UNSPECI" +
      "FIED\020\000\022\024\n\020NVMF_ADRFAM_IPV4\020\001\022\024\n\020NVMF_ADR" +
      "FAM_IPV6\020\002\022\022\n\016NVMF_ADRFAM_IB\020\003\022\022\n\016NVMF_A" +
      "DRFAM_FC\020\004\022\032\n\026NVMF_ADRFAM_INTRA_HOST\020\005*\206" +
      "\001\n\rNvmeMultipath\022\036\n\032NVME_MULTIPATH_UNSPE" +
      "CIFIED\020\000\022\032\n\026NVME_MULTIPATH_DISABLE\020\001\022\033\n\027" +
      "NVME_MULTIPATH_FAILOVER\020\002\022\034\n\030NVME_MULTIP" +
      "ATH_MULTIPATH\020\0032\367\006\n\033NVMfRemoteController" +
      "Service\022\220\001\n\033NVMfRemoteControllerConnect\022" +
      "6.opi_api.storage.v1.NVMfRemoteControlle" +
      "rConnectRequest\0327.opi_api.storage.v1.NVM" +
      "fRemoteControllerConnectResponse\"\000\022\231\001\n\036N" +
      "VMfRemoteControllerDisconnect\0229.opi_api." +
      "storage.v1.NVMfRemoteControllerDisconnec" +
      "tRequest\032:.opi_api.storage.v1.NVMfRemote" +
      "ControllerDisconnectResponse\"\000\022\212\001\n\031NVMfR" +
      "emoteControllerReset\0224.opi_api.storage.v" +
      "1.NVMfRemoteControllerResetRequest\0325.opi" +
      "_api.storage.v1.NVMfRemoteControllerRese" +
      "tResponse\"\000\022\207\001\n\030NVMfRemoteControllerList" +
      "\0223.opi_api.storage.v1.NVMfRemoteControll" +
      "erListRequest\0324.opi_api.storage.v1.NVMfR" +
      "emoteControllerListResponse\"\000\022\204\001\n\027NVMfRe" +
      "moteControllerGet\0222.opi_api.storage.v1.N" +
      "VMfRemoteControllerGetRequest\0323.opi_api." +
      "storage.v1.NVMfRemoteControllerGetRespon" +
      "se\"\000\022\212\001\n\031NVMfRemoteControllerStats\0224.opi" +
      "_api.storage.v1.NVMfRemoteControllerStat" +
      "sRequest\0325.opi_api.storage.v1.NVMfRemote" +
      "ControllerStatsResponse\"\000Bb\n\022opi_api.sto" +
      "rage.v1B\023BackendNvmeTcpProtoP\001Z5github.c" +
      "om/opiproject/opi-api/storage/v1alpha1/g" +
      "en/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_NVMfRemoteController_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor,
        new java.lang.String[] { "Id", "Name", "Trtype", "Adrfam", "Traddr", "Trsvcid", "Subnqn", "Hdgst", "Ddgst", "Multipath", "IoQueuesCount", "QueueSize", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectRequest_descriptor,
        new java.lang.String[] { "Ctrl", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerConnectResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerDisconnectResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerResetResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerListRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerListResponse_descriptor,
        new java.lang.String[] { "Ctrl", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerGetRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerGetResponse_descriptor,
        new java.lang.String[] { "Ctrl", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor,
        new java.lang.String[] { "Id", "Stats", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
