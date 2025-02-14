// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

public final class MiddleendQosVolumeProto {
  private MiddleendQosVolumeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_QosVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_QosVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListQosVolumesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListQosVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListQosVolumesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListQosVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_StatsQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_StatsQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_StatsQosVolumeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_StatsQosVolumeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032middleend_qos_volume.proto\022\022opi_api.st" +
      "orage.v1\032\017opicommon.proto\032\027google/api/cl" +
      "ient.proto\032\031google/api/resource.proto\032\033g" +
      "oogle/protobuf/empty.proto\032\034google/api/a" +
      "nnotations.proto\032\037google/api/field_behav" +
      "ior.proto\032 google/protobuf/field_mask.pr" +
      "oto\"\373\001\n\tQosVolume\0225\n\004name\030\001 \001(\tB\'\340A\003\340A\005\372" +
      "A\036\n\034opi_api.storage.v1/QosVolume\022\034\n\017volu" +
      "me_name_ref\030\002 \001(\tB\003\340A\002\022/\n\tmin_limit\030\003 \001(" +
      "\0132\034.opi_api.storage.v1.QosLimit\022/\n\tmax_l" +
      "imit\030\004 \001(\0132\034.opi_api.storage.v1.QosLimit" +
      ":7\352A4\n storage.opiproject.org/QosVolume\022" +
      "\020volumes/{volume}\"g\n\026CreateQosVolumeRequ" +
      "est\0226\n\nqos_volume\030\001 \001(\0132\035.opi_api.storag" +
      "e.v1.QosVolumeB\003\340A\002\022\025\n\rqos_volume_id\030\002 \001" +
      "(\t\"c\n\026DeleteQosVolumeRequest\0222\n\004name\030\001 \001" +
      "(\tB$\340A\002\372A\036\n\034opi_api.storage.v1/QosVolume" +
      "\022\025\n\rallow_missing\030\002 \001(\010\"\223\001\n\026UpdateQosVol" +
      "umeRequest\0221\n\nqos_volume\030\001 \001(\0132\035.opi_api" +
      ".storage.v1.QosVolume\022/\n\013update_mask\030\002 \001" +
      "(\0132\032.google.protobuf.FieldMask\022\025\n\rallow_" +
      "missing\030\003 \001(\010\"t\n\025ListQosVolumesRequest\0224" +
      "\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api.storage." +
      "v1/QosVolume\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_" +
      "token\030\003 \001(\t\"e\n\026ListQosVolumesResponse\0222\n" +
      "\013qos_volumes\030\001 \003(\0132\035.opi_api.storage.v1." +
      "QosVolume\022\027\n\017next_page_token\030\002 \001(\t\"I\n\023Ge" +
      "tQosVolumeRequest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n" +
      "\034opi_api.storage.v1/QosVolume\"K\n\025StatsQo" +
      "sVolumeRequest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034op" +
      "i_api.storage.v1/QosVolume\"H\n\026StatsQosVo" +
      "lumeResponse\022.\n\005stats\030\001 \001(\0132\037.opi_api.st" +
      "orage.v1.VolumeStats2\214\007\n\031MiddleendQosVol" +
      "umeService\022\230\001\n\017CreateQosVolume\022*.opi_api" +
      ".storage.v1.CreateQosVolumeRequest\032\035.opi" +
      "_api.storage.v1.QosVolume\":\202\323\344\223\002\031\"\013/v1/v" +
      "olumes:\nqos_volume\332A\030qos_volume,qos_volu" +
      "me_id\022}\n\017DeleteQosVolume\022*.opi_api.stora" +
      "ge.v1.DeleteQosVolumeRequest\032\026.google.pr" +
      "otobuf.Empty\"&\202\323\344\223\002\031*\027/v1/{name=QosVolum" +
      "es/*}\332A\004name\022\253\001\n\017UpdateQosVolume\022*.opi_a" +
      "pi.storage.v1.UpdateQosVolumeRequest\032\035.o" +
      "pi_api.storage.v1.QosVolume\"M\202\323\344\223\002.2 /v1" +
      "/{qos_volume.name=subsystems}:\nqos_volum" +
      "e\332A\026qos_volume,update_mask\022\216\001\n\016ListQosVo" +
      "lumes\022).opi_api.storage.v1.ListQosVolume" +
      "sRequest\032*.opi_api.storage.v1.ListQosVol" +
      "umesResponse\"%\202\323\344\223\002\026\022\024/v1/{parent=volume" +
      "s}\332A\006parent\022~\n\014GetQosVolume\022\'.opi_api.st" +
      "orage.v1.GetQosVolumeRequest\032\035.opi_api.s" +
      "torage.v1.QosVolume\"&\202\323\344\223\002\031\022\027/v1/{name=Q" +
      "osVolumes/*}\332A\004name\022\225\001\n\016StatsQosVolume\022)" +
      ".opi_api.storage.v1.StatsQosVolumeReques" +
      "t\032*.opi_api.storage.v1.StatsQosVolumeRes" +
      "ponse\",\202\323\344\223\002\037\022\035/v1/{name=QosVolumes/*}:s" +
      "tats\332A\004nameBf\n\022opi_api.storage.v1B\027Middl" +
      "eendQosVolumeProtoP\001Z5github.com/opiproj" +
      "ect/opi-api/storage/v1alpha1/gen/gob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_QosVolume_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_QosVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_QosVolume_descriptor,
        new java.lang.String[] { "Name", "VolumeNameRef", "MinLimit", "MaxLimit", });
    internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor,
        new java.lang.String[] { "QosVolume", "QosVolumeId", });
    internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_descriptor,
        new java.lang.String[] { "QosVolume", "UpdateMask", "AllowMissing", });
    internal_static_opi_api_storage_v1_ListQosVolumesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListQosVolumesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListQosVolumesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListQosVolumesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListQosVolumesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListQosVolumesResponse_descriptor,
        new java.lang.String[] { "QosVolumes", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetQosVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_StatsQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_StatsQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_StatsQosVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_StatsQosVolumeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_StatsQosVolumeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_StatsQosVolumeResponse_descriptor,
        new java.lang.String[] { "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
