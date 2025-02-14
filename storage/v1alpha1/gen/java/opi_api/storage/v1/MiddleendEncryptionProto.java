// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_encryption.proto

package opi_api.storage.v1;

public final class MiddleendEncryptionProto {
  private MiddleendEncryptionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_EncryptedVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_EncryptedVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_StatsEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_StatsEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_StatsEncryptedVolumeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_StatsEncryptedVolumeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032middleend_encryption.proto\022\022opi_api.st" +
      "orage.v1\032\017opicommon.proto\032\027google/api/cl" +
      "ient.proto\032\031google/api/resource.proto\032\033g" +
      "oogle/protobuf/empty.proto\032\034google/api/a" +
      "nnotations.proto\032\037google/api/field_behav" +
      "ior.proto\032 google/protobuf/field_mask.pr" +
      "oto\"\354\001\n\017EncryptedVolume\022;\n\004name\030\001 \001(\tB-\340" +
      "A\003\340A\005\372A$\n\"opi_api.storage.v1/EncryptedVo" +
      "lume\022\034\n\017volume_name_ref\030\002 \001(\tB\003\340A\002\022\013\n\003ke" +
      "y\030\003 \001(\014\0222\n\006cipher\030\004 \001(\0162\".opi_api.storag" +
      "e.v1.EncryptionType:=\352A:\n&storage.opipro" +
      "ject.org/EncryptedVolume\022\020volumes/{volum" +
      "e}\"\177\n\034CreateEncryptedVolumeRequest\022B\n\020en" +
      "crypted_volume\030\001 \001(\0132#.opi_api.storage.v" +
      "1.EncryptedVolumeB\003\340A\002\022\033\n\023encrypted_volu" +
      "me_id\030\002 \001(\t\"o\n\034DeleteEncryptedVolumeRequ" +
      "est\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"opi_api.stora" +
      "ge.v1/EncryptedVolume\022\025\n\rallow_missing\030\002" +
      " \001(\010\"\245\001\n\034UpdateEncryptedVolumeRequest\022=\n" +
      "\020encrypted_volume\030\001 \001(\0132#.opi_api.storag" +
      "e.v1.EncryptedVolume\022/\n\013update_mask\030\002 \001(" +
      "\0132\032.google.protobuf.FieldMask\022\025\n\rallow_m" +
      "issing\030\003 \001(\010\"\200\001\n\033ListEncryptedVolumesReq" +
      "uest\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$\n\"opi_api.st" +
      "orage.v1/EncryptedVolume\022\021\n\tpage_size\030\002 " +
      "\001(\005\022\022\n\npage_token\030\003 \001(\t\"w\n\034ListEncrypted" +
      "VolumesResponse\022>\n\021encrypted_volumes\030\001 \003" +
      "(\0132#.opi_api.storage.v1.EncryptedVolume\022" +
      "\027\n\017next_page_token\030\002 \001(\t\"U\n\031GetEncrypted" +
      "VolumeRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"opi" +
      "_api.storage.v1/EncryptedVolume\"W\n\033Stats" +
      "EncryptedVolumeRequest\0228\n\004name\030\001 \001(\tB*\340A" +
      "\002\372A$\n\"opi_api.storage.v1/EncryptedVolume" +
      "\"N\n\034StatsEncryptedVolumeResponse\022.\n\005stat" +
      "s\030\001 \001(\0132\037.opi_api.storage.v1.VolumeStats" +
      "2\253\010\n\032MiddleendEncryptionService\022\274\001\n\025Crea" +
      "teEncryptedVolume\0220.opi_api.storage.v1.C" +
      "reateEncryptedVolumeRequest\032#.opi_api.st" +
      "orage.v1.EncryptedVolume\"L\202\323\344\223\002\037\"\013/v1/vo" +
      "lumes:\020encrypted_volume\332A$encrypted_volu" +
      "me,encrypted_volume_id\022\217\001\n\025DeleteEncrypt" +
      "edVolume\0220.opi_api.storage.v1.DeleteEncr" +
      "yptedVolumeRequest\032\026.google.protobuf.Emp" +
      "ty\",\202\323\344\223\002\037*\035/v1/{name=EncryptedVolumes/*" +
      "}\332A\004name\022\317\001\n\025UpdateEncryptedVolume\0220.opi" +
      "_api.storage.v1.UpdateEncryptedVolumeReq" +
      "uest\032#.opi_api.storage.v1.EncryptedVolum" +
      "e\"_\202\323\344\223\002:2&/v1/{encrypted_volume.name=su" +
      "bsystems}:\020encrypted_volume\332A\034encrypted_" +
      "volume,update_mask\022\240\001\n\024ListEncryptedVolu" +
      "mes\022/.opi_api.storage.v1.ListEncryptedVo" +
      "lumesRequest\0320.opi_api.storage.v1.ListEn" +
      "cryptedVolumesResponse\"%\202\323\344\223\002\026\022\024/v1/{par" +
      "ent=volumes}\332A\006parent\022\226\001\n\022GetEncryptedVo" +
      "lume\022-.opi_api.storage.v1.GetEncryptedVo" +
      "lumeRequest\032#.opi_api.storage.v1.Encrypt" +
      "edVolume\",\202\323\344\223\002\037\022\035/v1/{name=EncryptedVol" +
      "umes/*}\332A\004name\022\255\001\n\024StatsEncryptedVolume\022" +
      "/.opi_api.storage.v1.StatsEncryptedVolum" +
      "eRequest\0320.opi_api.storage.v1.StatsEncry" +
      "ptedVolumeResponse\"2\202\323\344\223\002%\022#/v1/{name=En" +
      "cryptedVolumes/*}:stats\332A\004nameBg\n\022opi_ap" +
      "i.storage.v1B\030MiddleendEncryptionProtoP\001" +
      "Z5github.com/opiproject/opi-api/storage/" +
      "v1alpha1/gen/gob\006proto3"
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
    internal_static_opi_api_storage_v1_EncryptedVolume_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_EncryptedVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_EncryptedVolume_descriptor,
        new java.lang.String[] { "Name", "VolumeNameRef", "Key", "Cipher", });
    internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "EncryptedVolume", "EncryptedVolumeId", });
    internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "EncryptedVolume", "UpdateMask", "AllowMissing", });
    internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_descriptor,
        new java.lang.String[] { "EncryptedVolumes", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_StatsEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_StatsEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_StatsEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_StatsEncryptedVolumeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_StatsEncryptedVolumeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_StatsEncryptedVolumeResponse_descriptor,
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
