# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_virtio_scsi.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
import object_key_pb2 as object__key__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1a\x66rontend_virtio_scsi.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\x10object_key.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\xa2\x01\n\x10VirtioScsiTarget\x12<\n\x04name\x18\x01 \x01(\tB.\xe0\x41\x03\xe0\x41\x05\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\x12\x10\n\x08max_luns\x18\x02 \x01(\x05:>\xea\x41;\n\'storage.opiproject.org/VirtioScsiTarget\x12\x10volumes/{volume}\"\xb0\x02\n\x14VirtioScsiController\x12@\n\x04name\x18\x01 \x01(\tB2\xe0\x41\x03\xe0\x41\x05\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\x12\x30\n\x07pcie_id\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.PciEndpoint\x12/\n\tmin_limit\x18\x03 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimit\x12/\n\tmax_limit\x18\x04 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimit:B\xea\x41?\n+storage.opiproject.org/VirtioScsiController\x12\x10volumes/{volume}\"\xe9\x01\n\rVirtioScsiLun\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x03\xe0\x41\x05\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\x12/\n\ttarget_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12/\n\tvolume_id\x18\x03 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey:;\xea\x41\x38\n$storage.opiproject.org/VirtioScsiLun\x12\x10volumes/{volume}\"\x85\x01\n\x1d\x43reateVirtioScsiTargetRequest\x12\x45\n\x12virtio_scsi_target\x18\x01 \x01(\x0b\x32$.opi_api.storage.v1.VirtioScsiTargetB\x03\xe0\x41\x02\x12\x1d\n\x15virtio_scsi_target_id\x18\x02 \x01(\t\"q\n\x1d\x44\x65leteVirtioScsiTargetRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\xa9\x01\n\x1dUpdateVirtioScsiTargetRequest\x12@\n\x12virtio_scsi_target\x18\x01 \x01(\x0b\x32$.opi_api.storage.v1.VirtioScsiTarget\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"\x82\x01\n\x1cListVirtioScsiTargetsRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"{\n\x1dListVirtioScsiTargetsResponse\x12\x41\n\x13virtio_scsi_targets\x18\x01 \x03(\x0b\x32$.opi_api.storage.v1.VirtioScsiTarget\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"W\n\x1aGetVirtioScsiTargetRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\"Y\n\x1cStatsVirtioScsiTargetRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\"O\n\x1dStatsVirtioScsiTargetResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"\x95\x01\n!CreateVirtioScsiControllerRequest\x12M\n\x16virtio_scsi_controller\x18\x01 \x01(\x0b\x32(.opi_api.storage.v1.VirtioScsiControllerB\x03\xe0\x41\x02\x12!\n\x19virtio_scsi_controller_id\x18\x02 \x01(\t\"y\n!DeleteVirtioScsiControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\xb5\x01\n!UpdateVirtioScsiControllerRequest\x12H\n\x16virtio_scsi_controller\x18\x01 \x01(\x0b\x32(.opi_api.storage.v1.VirtioScsiController\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"\x8a\x01\n ListVirtioScsiControllersRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x87\x01\n!ListVirtioScsiControllersResponse\x12I\n\x17virtio_scsi_controllers\x18\x01 \x03(\x0b\x32(.opi_api.storage.v1.VirtioScsiController\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"_\n\x1eGetVirtioScsiControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\"a\n StatsVirtioScsiControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\"S\n!StatsVirtioScsiControllerResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"y\n\x1a\x43reateVirtioScsiLunRequest\x12?\n\x0fvirtio_scsi_lun\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.VirtioScsiLunB\x03\xe0\x41\x02\x12\x1a\n\x12virtio_scsi_lun_id\x18\x02 \x01(\t\"k\n\x1a\x44\x65leteVirtioScsiLunRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\xa0\x01\n\x1aUpdateVirtioScsiLunRequest\x12:\n\x0fvirtio_scsi_lun\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.VirtioScsiLun\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"|\n\x19ListVirtioScsiLunsRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"r\n\x1aListVirtioScsiLunsResponse\x12;\n\x10virtio_scsi_luns\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.VirtioScsiLun\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"Q\n\x17GetVirtioScsiLunRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\"\x88\x01\n\x19StatsVirtioScsiLunRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\x12\x33\n\rcontroller_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"L\n\x1aStatsVirtioScsiLunResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats2\xcb\x19\n\x19\x46rontendVirtioScsiService\x12\xc5\x01\n\x16\x43reateVirtioScsiTarget\x12\x31.opi_api.storage.v1.CreateVirtioScsiTargetRequest\x1a$.opi_api.storage.v1.VirtioScsiTarget\"R\x82\xd3\xe4\x93\x02!\"\x0b/v1/volumes:\x12virtio_scsi_target\xda\x41(virtio_scsi_target,virtio_scsi_target_id\x12\x92\x01\n\x16\x44\x65leteVirtioScsiTarget\x12\x31.opi_api.storage.v1.DeleteVirtioScsiTargetRequest\x1a\x16.google.protobuf.Empty\"-\x82\xd3\xe4\x93\x02 *\x1e/v1/{name=VirtioScsiTargets/*}\xda\x41\x04name\x12\xd8\x01\n\x16UpdateVirtioScsiTarget\x12\x31.opi_api.storage.v1.UpdateVirtioScsiTargetRequest\x1a$.opi_api.storage.v1.VirtioScsiTarget\"e\x82\xd3\xe4\x93\x02>2(/v1/{virtio_scsi_target.name=subsystems}:\x12virtio_scsi_target\xda\x41\x1evirtio_scsi_target,update_mask\x12\xa6\x01\n\x15ListVirtioScsiTargets\x12\x30.opi_api.storage.v1.ListVirtioScsiTargetsRequest\x1a\x31.opi_api.storage.v1.ListVirtioScsiTargetsResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x9a\x01\n\x13GetVirtioScsiTarget\x12..opi_api.storage.v1.GetVirtioScsiTargetRequest\x1a$.opi_api.storage.v1.VirtioScsiTarget\"-\x82\xd3\xe4\x93\x02 \x12\x1e/v1/{name=VirtioScsiTargets/*}\xda\x41\x04name\x12\xb1\x01\n\x15StatsVirtioScsiTarget\x12\x30.opi_api.storage.v1.StatsVirtioScsiTargetRequest\x1a\x31.opi_api.storage.v1.StatsVirtioScsiTargetResponse\"3\x82\xd3\xe4\x93\x02&\x12$/v1/{name=VirtioScsiTargets/*}:stats\xda\x41\x04name\x12\xdd\x01\n\x1a\x43reateVirtioScsiController\x12\x35.opi_api.storage.v1.CreateVirtioScsiControllerRequest\x1a(.opi_api.storage.v1.VirtioScsiController\"^\x82\xd3\xe4\x93\x02%\"\x0b/v1/volumes:\x16virtio_scsi_controller\xda\x41\x30virtio_scsi_controller,virtio_scsi_controller_id\x12\x9e\x01\n\x1a\x44\x65leteVirtioScsiController\x12\x35.opi_api.storage.v1.DeleteVirtioScsiControllerRequest\x1a\x16.google.protobuf.Empty\"1\x82\xd3\xe4\x93\x02$*\"/v1/{name=VirtioScsiControllers/*}\xda\x41\x04name\x12\xf0\x01\n\x1aUpdateVirtioScsiController\x12\x35.opi_api.storage.v1.UpdateVirtioScsiControllerRequest\x1a(.opi_api.storage.v1.VirtioScsiController\"q\x82\xd3\xe4\x93\x02\x46\x32,/v1/{virtio_scsi_controller.name=subsystems}:\x16virtio_scsi_controller\xda\x41\"virtio_scsi_controller,update_mask\x12\xb2\x01\n\x19ListVirtioScsiControllers\x12\x34.opi_api.storage.v1.ListVirtioScsiControllersRequest\x1a\x35.opi_api.storage.v1.ListVirtioScsiControllersResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\xaa\x01\n\x17GetVirtioScsiController\x12\x32.opi_api.storage.v1.GetVirtioScsiControllerRequest\x1a(.opi_api.storage.v1.VirtioScsiController\"1\x82\xd3\xe4\x93\x02$\x12\"/v1/{name=VirtioScsiControllers/*}\xda\x41\x04name\x12\xc1\x01\n\x19StatsVirtioScsiController\x12\x34.opi_api.storage.v1.StatsVirtioScsiControllerRequest\x1a\x35.opi_api.storage.v1.StatsVirtioScsiControllerResponse\"7\x82\xd3\xe4\x93\x02*\x12(/v1/{name=VirtioScsiControllers/*}:stats\xda\x41\x04name\x12\xb3\x01\n\x13\x43reateVirtioScsiLun\x12..opi_api.storage.v1.CreateVirtioScsiLunRequest\x1a!.opi_api.storage.v1.VirtioScsiLun\"I\x82\xd3\xe4\x93\x02\x1e\"\x0b/v1/volumes:\x0fvirtio_scsi_lun\xda\x41\"virtio_scsi_lun,virtio_scsi_lun_id\x12\x89\x01\n\x13\x44\x65leteVirtioScsiLun\x12..opi_api.storage.v1.DeleteVirtioScsiLunRequest\x1a\x16.google.protobuf.Empty\"*\x82\xd3\xe4\x93\x02\x1d*\x1b/v1/{name=VirtioScsiLuns/*}\xda\x41\x04name\x12\xc6\x01\n\x13UpdateVirtioScsiLun\x12..opi_api.storage.v1.UpdateVirtioScsiLunRequest\x1a!.opi_api.storage.v1.VirtioScsiLun\"\\\x82\xd3\xe4\x93\x02\x38\x32%/v1/{virtio_scsi_lun.name=subsystems}:\x0fvirtio_scsi_lun\xda\x41\x1bvirtio_scsi_lun,update_mask\x12\x9d\x01\n\x12ListVirtioScsiLuns\x12-.opi_api.storage.v1.ListVirtioScsiLunsRequest\x1a..opi_api.storage.v1.ListVirtioScsiLunsResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x8e\x01\n\x10GetVirtioScsiLun\x12+.opi_api.storage.v1.GetVirtioScsiLunRequest\x1a!.opi_api.storage.v1.VirtioScsiLun\"*\x82\xd3\xe4\x93\x02\x1d\x12\x1b/v1/{name=VirtioScsiLuns/*}\xda\x41\x04name\x12\xa5\x01\n\x12StatsVirtioScsiLun\x12-.opi_api.storage.v1.StatsVirtioScsiLunRequest\x1a..opi_api.storage.v1.StatsVirtioScsiLunResponse\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=VirtioScsiLuns/*}:stats\xda\x41\x04nameBf\n\x12opi_api.storage.v1B\x17\x46rontendVirtioScsiProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_VIRTIOSCSITARGET = DESCRIPTOR.message_types_by_name['VirtioScsiTarget']
_VIRTIOSCSICONTROLLER = DESCRIPTOR.message_types_by_name['VirtioScsiController']
_VIRTIOSCSILUN = DESCRIPTOR.message_types_by_name['VirtioScsiLun']
_CREATEVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['CreateVirtioScsiTargetRequest']
_DELETEVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['DeleteVirtioScsiTargetRequest']
_UPDATEVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['UpdateVirtioScsiTargetRequest']
_LISTVIRTIOSCSITARGETSREQUEST = DESCRIPTOR.message_types_by_name['ListVirtioScsiTargetsRequest']
_LISTVIRTIOSCSITARGETSRESPONSE = DESCRIPTOR.message_types_by_name['ListVirtioScsiTargetsResponse']
_GETVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['GetVirtioScsiTargetRequest']
_STATSVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['StatsVirtioScsiTargetRequest']
_STATSVIRTIOSCSITARGETRESPONSE = DESCRIPTOR.message_types_by_name['StatsVirtioScsiTargetResponse']
_CREATEVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['CreateVirtioScsiControllerRequest']
_DELETEVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['DeleteVirtioScsiControllerRequest']
_UPDATEVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['UpdateVirtioScsiControllerRequest']
_LISTVIRTIOSCSICONTROLLERSREQUEST = DESCRIPTOR.message_types_by_name['ListVirtioScsiControllersRequest']
_LISTVIRTIOSCSICONTROLLERSRESPONSE = DESCRIPTOR.message_types_by_name['ListVirtioScsiControllersResponse']
_GETVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['GetVirtioScsiControllerRequest']
_STATSVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['StatsVirtioScsiControllerRequest']
_STATSVIRTIOSCSICONTROLLERRESPONSE = DESCRIPTOR.message_types_by_name['StatsVirtioScsiControllerResponse']
_CREATEVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['CreateVirtioScsiLunRequest']
_DELETEVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['DeleteVirtioScsiLunRequest']
_UPDATEVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['UpdateVirtioScsiLunRequest']
_LISTVIRTIOSCSILUNSREQUEST = DESCRIPTOR.message_types_by_name['ListVirtioScsiLunsRequest']
_LISTVIRTIOSCSILUNSRESPONSE = DESCRIPTOR.message_types_by_name['ListVirtioScsiLunsResponse']
_GETVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['GetVirtioScsiLunRequest']
_STATSVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['StatsVirtioScsiLunRequest']
_STATSVIRTIOSCSILUNRESPONSE = DESCRIPTOR.message_types_by_name['StatsVirtioScsiLunResponse']
VirtioScsiTarget = _reflection.GeneratedProtocolMessageType('VirtioScsiTarget', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSITARGET,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiTarget)
  })
_sym_db.RegisterMessage(VirtioScsiTarget)

VirtioScsiController = _reflection.GeneratedProtocolMessageType('VirtioScsiController', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSICONTROLLER,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiController)
  })
_sym_db.RegisterMessage(VirtioScsiController)

VirtioScsiLun = _reflection.GeneratedProtocolMessageType('VirtioScsiLun', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSILUN,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiLun)
  })
_sym_db.RegisterMessage(VirtioScsiLun)

CreateVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('CreateVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(CreateVirtioScsiTargetRequest)

DeleteVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('DeleteVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(DeleteVirtioScsiTargetRequest)

UpdateVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('UpdateVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(UpdateVirtioScsiTargetRequest)

ListVirtioScsiTargetsRequest = _reflection.GeneratedProtocolMessageType('ListVirtioScsiTargetsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSITARGETSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiTargetsRequest)
  })
_sym_db.RegisterMessage(ListVirtioScsiTargetsRequest)

ListVirtioScsiTargetsResponse = _reflection.GeneratedProtocolMessageType('ListVirtioScsiTargetsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSITARGETSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiTargetsResponse)
  })
_sym_db.RegisterMessage(ListVirtioScsiTargetsResponse)

GetVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('GetVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(GetVirtioScsiTargetRequest)

StatsVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('StatsVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _STATSVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(StatsVirtioScsiTargetRequest)

StatsVirtioScsiTargetResponse = _reflection.GeneratedProtocolMessageType('StatsVirtioScsiTargetResponse', (_message.Message,), {
  'DESCRIPTOR' : _STATSVIRTIOSCSITARGETRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsVirtioScsiTargetResponse)
  })
_sym_db.RegisterMessage(StatsVirtioScsiTargetResponse)

CreateVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('CreateVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(CreateVirtioScsiControllerRequest)

DeleteVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('DeleteVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(DeleteVirtioScsiControllerRequest)

UpdateVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('UpdateVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(UpdateVirtioScsiControllerRequest)

ListVirtioScsiControllersRequest = _reflection.GeneratedProtocolMessageType('ListVirtioScsiControllersRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSICONTROLLERSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiControllersRequest)
  })
_sym_db.RegisterMessage(ListVirtioScsiControllersRequest)

ListVirtioScsiControllersResponse = _reflection.GeneratedProtocolMessageType('ListVirtioScsiControllersResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSICONTROLLERSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiControllersResponse)
  })
_sym_db.RegisterMessage(ListVirtioScsiControllersResponse)

GetVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('GetVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(GetVirtioScsiControllerRequest)

StatsVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('StatsVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _STATSVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(StatsVirtioScsiControllerRequest)

StatsVirtioScsiControllerResponse = _reflection.GeneratedProtocolMessageType('StatsVirtioScsiControllerResponse', (_message.Message,), {
  'DESCRIPTOR' : _STATSVIRTIOSCSICONTROLLERRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsVirtioScsiControllerResponse)
  })
_sym_db.RegisterMessage(StatsVirtioScsiControllerResponse)

CreateVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('CreateVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(CreateVirtioScsiLunRequest)

DeleteVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('DeleteVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(DeleteVirtioScsiLunRequest)

UpdateVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('UpdateVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(UpdateVirtioScsiLunRequest)

ListVirtioScsiLunsRequest = _reflection.GeneratedProtocolMessageType('ListVirtioScsiLunsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSILUNSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiLunsRequest)
  })
_sym_db.RegisterMessage(ListVirtioScsiLunsRequest)

ListVirtioScsiLunsResponse = _reflection.GeneratedProtocolMessageType('ListVirtioScsiLunsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSILUNSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiLunsResponse)
  })
_sym_db.RegisterMessage(ListVirtioScsiLunsResponse)

GetVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('GetVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(GetVirtioScsiLunRequest)

StatsVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('StatsVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _STATSVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(StatsVirtioScsiLunRequest)

StatsVirtioScsiLunResponse = _reflection.GeneratedProtocolMessageType('StatsVirtioScsiLunResponse', (_message.Message,), {
  'DESCRIPTOR' : _STATSVIRTIOSCSILUNRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsVirtioScsiLunResponse)
  })
_sym_db.RegisterMessage(StatsVirtioScsiLunResponse)

_FRONTENDVIRTIOSCSISERVICE = DESCRIPTOR.services_by_name['FrontendVirtioScsiService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\027FrontendVirtioScsiProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _VIRTIOSCSITARGET.fields_by_name['name']._options = None
  _VIRTIOSCSITARGET.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _VIRTIOSCSITARGET._options = None
  _VIRTIOSCSITARGET._serialized_options = b'\352A;\n\'storage.opiproject.org/VirtioScsiTarget\022\020volumes/{volume}'
  _VIRTIOSCSICONTROLLER.fields_by_name['name']._options = None
  _VIRTIOSCSICONTROLLER.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _VIRTIOSCSICONTROLLER._options = None
  _VIRTIOSCSICONTROLLER._serialized_options = b'\352A?\n+storage.opiproject.org/VirtioScsiController\022\020volumes/{volume}'
  _VIRTIOSCSILUN.fields_by_name['name']._options = None
  _VIRTIOSCSILUN.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _VIRTIOSCSILUN._options = None
  _VIRTIOSCSILUN._serialized_options = b'\352A8\n$storage.opiproject.org/VirtioScsiLun\022\020volumes/{volume}'
  _CREATEVIRTIOSCSITARGETREQUEST.fields_by_name['virtio_scsi_target']._options = None
  _CREATEVIRTIOSCSITARGETREQUEST.fields_by_name['virtio_scsi_target']._serialized_options = b'\340A\002'
  _DELETEVIRTIOSCSITARGETREQUEST.fields_by_name['name']._options = None
  _DELETEVIRTIOSCSITARGETREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _LISTVIRTIOSCSITARGETSREQUEST.fields_by_name['parent']._options = None
  _LISTVIRTIOSCSITARGETSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _GETVIRTIOSCSITARGETREQUEST.fields_by_name['name']._options = None
  _GETVIRTIOSCSITARGETREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _STATSVIRTIOSCSITARGETREQUEST.fields_by_name['name']._options = None
  _STATSVIRTIOSCSITARGETREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _CREATEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['virtio_scsi_controller']._options = None
  _CREATEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['virtio_scsi_controller']._serialized_options = b'\340A\002'
  _DELETEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._options = None
  _DELETEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _LISTVIRTIOSCSICONTROLLERSREQUEST.fields_by_name['parent']._options = None
  _LISTVIRTIOSCSICONTROLLERSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _GETVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._options = None
  _GETVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _STATSVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._options = None
  _STATSVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _CREATEVIRTIOSCSILUNREQUEST.fields_by_name['virtio_scsi_lun']._options = None
  _CREATEVIRTIOSCSILUNREQUEST.fields_by_name['virtio_scsi_lun']._serialized_options = b'\340A\002'
  _DELETEVIRTIOSCSILUNREQUEST.fields_by_name['name']._options = None
  _DELETEVIRTIOSCSILUNREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _LISTVIRTIOSCSILUNSREQUEST.fields_by_name['parent']._options = None
  _LISTVIRTIOSCSILUNSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _GETVIRTIOSCSILUNREQUEST.fields_by_name['name']._options = None
  _GETVIRTIOSCSILUNREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _STATSVIRTIOSCSILUNREQUEST.fields_by_name['name']._options = None
  _STATSVIRTIOSCSILUNREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002!\"\013/v1/volumes:\022virtio_scsi_target\332A(virtio_scsi_target,virtio_scsi_target_id'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002 *\036/v1/{name=VirtioScsiTargets/*}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002>2(/v1/{virtio_scsi_target.name=subsystems}:\022virtio_scsi_target\332A\036virtio_scsi_target,update_mask'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiTargets']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiTargets']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002 \022\036/v1/{name=VirtioScsiTargets/*}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['StatsVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['StatsVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002&\022$/v1/{name=VirtioScsiTargets/*}:stats\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiController']._serialized_options = b'\202\323\344\223\002%\"\013/v1/volumes:\026virtio_scsi_controller\332A0virtio_scsi_controller,virtio_scsi_controller_id'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiController']._serialized_options = b'\202\323\344\223\002$*\"/v1/{name=VirtioScsiControllers/*}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiController']._serialized_options = b'\202\323\344\223\002F2,/v1/{virtio_scsi_controller.name=subsystems}:\026virtio_scsi_controller\332A\"virtio_scsi_controller,update_mask'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiControllers']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiControllers']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiController']._serialized_options = b'\202\323\344\223\002$\022\"/v1/{name=VirtioScsiControllers/*}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['StatsVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['StatsVirtioScsiController']._serialized_options = b'\202\323\344\223\002*\022(/v1/{name=VirtioScsiControllers/*}:stats\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiLun']._serialized_options = b'\202\323\344\223\002\036\"\013/v1/volumes:\017virtio_scsi_lun\332A\"virtio_scsi_lun,virtio_scsi_lun_id'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiLun']._serialized_options = b'\202\323\344\223\002\035*\033/v1/{name=VirtioScsiLuns/*}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiLun']._serialized_options = b'\202\323\344\223\00282%/v1/{virtio_scsi_lun.name=subsystems}:\017virtio_scsi_lun\332A\033virtio_scsi_lun,update_mask'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiLuns']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiLuns']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiLun']._serialized_options = b'\202\323\344\223\002\035\022\033/v1/{name=VirtioScsiLuns/*}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['StatsVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['StatsVirtioScsiLun']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=VirtioScsiLuns/*}:stats\332A\004name'
  _VIRTIOSCSITARGET._serialized_start=264
  _VIRTIOSCSITARGET._serialized_end=426
  _VIRTIOSCSICONTROLLER._serialized_start=429
  _VIRTIOSCSICONTROLLER._serialized_end=733
  _VIRTIOSCSILUN._serialized_start=736
  _VIRTIOSCSILUN._serialized_end=969
  _CREATEVIRTIOSCSITARGETREQUEST._serialized_start=972
  _CREATEVIRTIOSCSITARGETREQUEST._serialized_end=1105
  _DELETEVIRTIOSCSITARGETREQUEST._serialized_start=1107
  _DELETEVIRTIOSCSITARGETREQUEST._serialized_end=1220
  _UPDATEVIRTIOSCSITARGETREQUEST._serialized_start=1223
  _UPDATEVIRTIOSCSITARGETREQUEST._serialized_end=1392
  _LISTVIRTIOSCSITARGETSREQUEST._serialized_start=1395
  _LISTVIRTIOSCSITARGETSREQUEST._serialized_end=1525
  _LISTVIRTIOSCSITARGETSRESPONSE._serialized_start=1527
  _LISTVIRTIOSCSITARGETSRESPONSE._serialized_end=1650
  _GETVIRTIOSCSITARGETREQUEST._serialized_start=1652
  _GETVIRTIOSCSITARGETREQUEST._serialized_end=1739
  _STATSVIRTIOSCSITARGETREQUEST._serialized_start=1741
  _STATSVIRTIOSCSITARGETREQUEST._serialized_end=1830
  _STATSVIRTIOSCSITARGETRESPONSE._serialized_start=1832
  _STATSVIRTIOSCSITARGETRESPONSE._serialized_end=1911
  _CREATEVIRTIOSCSICONTROLLERREQUEST._serialized_start=1914
  _CREATEVIRTIOSCSICONTROLLERREQUEST._serialized_end=2063
  _DELETEVIRTIOSCSICONTROLLERREQUEST._serialized_start=2065
  _DELETEVIRTIOSCSICONTROLLERREQUEST._serialized_end=2186
  _UPDATEVIRTIOSCSICONTROLLERREQUEST._serialized_start=2189
  _UPDATEVIRTIOSCSICONTROLLERREQUEST._serialized_end=2370
  _LISTVIRTIOSCSICONTROLLERSREQUEST._serialized_start=2373
  _LISTVIRTIOSCSICONTROLLERSREQUEST._serialized_end=2511
  _LISTVIRTIOSCSICONTROLLERSRESPONSE._serialized_start=2514
  _LISTVIRTIOSCSICONTROLLERSRESPONSE._serialized_end=2649
  _GETVIRTIOSCSICONTROLLERREQUEST._serialized_start=2651
  _GETVIRTIOSCSICONTROLLERREQUEST._serialized_end=2746
  _STATSVIRTIOSCSICONTROLLERREQUEST._serialized_start=2748
  _STATSVIRTIOSCSICONTROLLERREQUEST._serialized_end=2845
  _STATSVIRTIOSCSICONTROLLERRESPONSE._serialized_start=2847
  _STATSVIRTIOSCSICONTROLLERRESPONSE._serialized_end=2930
  _CREATEVIRTIOSCSILUNREQUEST._serialized_start=2932
  _CREATEVIRTIOSCSILUNREQUEST._serialized_end=3053
  _DELETEVIRTIOSCSILUNREQUEST._serialized_start=3055
  _DELETEVIRTIOSCSILUNREQUEST._serialized_end=3162
  _UPDATEVIRTIOSCSILUNREQUEST._serialized_start=3165
  _UPDATEVIRTIOSCSILUNREQUEST._serialized_end=3325
  _LISTVIRTIOSCSILUNSREQUEST._serialized_start=3327
  _LISTVIRTIOSCSILUNSREQUEST._serialized_end=3451
  _LISTVIRTIOSCSILUNSRESPONSE._serialized_start=3453
  _LISTVIRTIOSCSILUNSRESPONSE._serialized_end=3567
  _GETVIRTIOSCSILUNREQUEST._serialized_start=3569
  _GETVIRTIOSCSILUNREQUEST._serialized_end=3650
  _STATSVIRTIOSCSILUNREQUEST._serialized_start=3653
  _STATSVIRTIOSCSILUNREQUEST._serialized_end=3789
  _STATSVIRTIOSCSILUNRESPONSE._serialized_start=3791
  _STATSVIRTIOSCSILUNRESPONSE._serialized_end=3867
  _FRONTENDVIRTIOSCSISERVICE._serialized_start=3870
  _FRONTENDVIRTIOSCSISERVICE._serialized_end=7145
# @@protoc_insertion_point(module_scope)
