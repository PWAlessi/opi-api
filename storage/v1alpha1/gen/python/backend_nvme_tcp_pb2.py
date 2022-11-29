# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: backend_nvme_tcp.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16\x62\x61\x63kend_nvme_tcp.proto\x12\x12opi_api.storage.v1\"\xd0\x02\n\x14NVMfRemoteController\x12\n\n\x02id\x18\x01 \x01(\x03\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x35\n\x06trtype\x18\x03 \x01(\x0e\x32%.opi_api.storage.v1.NvmeTransportType\x12\x35\n\x06\x61\x64rfam\x18\x04 \x01(\x0e\x32%.opi_api.storage.v1.NvmeAddressFamily\x12\x0e\n\x06traddr\x18\x05 \x01(\t\x12\x0f\n\x07trsvcid\x18\x06 \x01(\x03\x12\x0e\n\x06subnqn\x18\x07 \x01(\t\x12\r\n\x05hdgst\x18\x08 \x01(\x08\x12\r\n\x05\x64\x64gst\x18\t \x01(\x08\x12\x34\n\tmultipath\x18\n \x01(\x0e\x32!.opi_api.storage.v1.NvmeMultipath\x12\x17\n\x0fio_queues_count\x18\x0b \x01(\x03\x12\x12\n\nqueue_size\x18\x0c \x01(\x03\"\\\n\"NVMfRemoteControllerConnectRequest\x12\x36\n\x04\x63trl\x18\x01 \x01(\x0b\x32(.opi_api.storage.v1.NVMfRemoteController\"%\n#NVMfRemoteControllerConnectResponse\"3\n%NVMfRemoteControllerDisconnectRequest\x12\n\n\x02id\x18\x01 \x01(\x03\"(\n&NVMfRemoteControllerDisconnectResponse\".\n NVMfRemoteControllerResetRequest\x12\n\n\x02id\x18\x01 \x01(\x03\"#\n!NVMfRemoteControllerResetResponse\"-\n\x1fNVMfRemoteControllerListRequest\x12\n\n\x02id\x18\x01 \x01(\x03\"Z\n NVMfRemoteControllerListResponse\x12\x36\n\x04\x63trl\x18\x01 \x03(\x0b\x32(.opi_api.storage.v1.NVMfRemoteController\",\n\x1eNVMfRemoteControllerGetRequest\x12\n\n\x02id\x18\x01 \x01(\x03\"Y\n\x1fNVMfRemoteControllerGetResponse\x12\x36\n\x04\x63trl\x18\x01 \x01(\x0b\x32(.opi_api.storage.v1.NVMfRemoteController\".\n NVMfRemoteControllerStatsRequest\x12\n\n\x02id\x18\x01 \x01(\x03\">\n!NVMfRemoteControllerStatsResponse\x12\n\n\x02id\x18\x01 \x01(\x03\x12\r\n\x05stats\x18\x02 \x01(\t*\xb4\x01\n\x11NvmeTransportType\x12#\n\x1fNVME_TRANSPORT_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11NVME_TRANSPORT_FC\x10\x01\x12\x17\n\x13NVME_TRANSPORT_PCIE\x10\x02\x12\x17\n\x13NVME_TRANSPORT_RDMA\x10\x03\x12\x16\n\x12NVME_TRANSPORT_TCP\x10\x04\x12\x19\n\x15NVME_TRANSPORT_CUSTOM\x10\x05*\xa8\x01\n\x11NvmeAddressFamily\x12#\n\x1fNVME_ADDRESS_FAMILY_UNSPECIFIED\x10\x00\x12\x14\n\x10NVMF_ADRFAM_IPV4\x10\x01\x12\x14\n\x10NVMF_ADRFAM_IPV6\x10\x02\x12\x12\n\x0eNVMF_ADRFAM_IB\x10\x03\x12\x12\n\x0eNVMF_ADRFAM_FC\x10\x04\x12\x1a\n\x16NVMF_ADRFAM_INTRA_HOST\x10\x05*\x86\x01\n\rNvmeMultipath\x12\x1e\n\x1aNVME_MULTIPATH_UNSPECIFIED\x10\x00\x12\x1a\n\x16NVME_MULTIPATH_DISABLE\x10\x01\x12\x1b\n\x17NVME_MULTIPATH_FAILOVER\x10\x02\x12\x1c\n\x18NVME_MULTIPATH_MULTIPATH\x10\x03\x32\xf7\x06\n\x1bNVMfRemoteControllerService\x12\x90\x01\n\x1bNVMfRemoteControllerConnect\x12\x36.opi_api.storage.v1.NVMfRemoteControllerConnectRequest\x1a\x37.opi_api.storage.v1.NVMfRemoteControllerConnectResponse\"\x00\x12\x99\x01\n\x1eNVMfRemoteControllerDisconnect\x12\x39.opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest\x1a:.opi_api.storage.v1.NVMfRemoteControllerDisconnectResponse\"\x00\x12\x8a\x01\n\x19NVMfRemoteControllerReset\x12\x34.opi_api.storage.v1.NVMfRemoteControllerResetRequest\x1a\x35.opi_api.storage.v1.NVMfRemoteControllerResetResponse\"\x00\x12\x87\x01\n\x18NVMfRemoteControllerList\x12\x33.opi_api.storage.v1.NVMfRemoteControllerListRequest\x1a\x34.opi_api.storage.v1.NVMfRemoteControllerListResponse\"\x00\x12\x84\x01\n\x17NVMfRemoteControllerGet\x12\x32.opi_api.storage.v1.NVMfRemoteControllerGetRequest\x1a\x33.opi_api.storage.v1.NVMfRemoteControllerGetResponse\"\x00\x12\x8a\x01\n\x19NVMfRemoteControllerStats\x12\x34.opi_api.storage.v1.NVMfRemoteControllerStatsRequest\x1a\x35.opi_api.storage.v1.NVMfRemoteControllerStatsResponse\"\x00\x42\x62\n\x12opi_api.storage.v1B\x13\x42\x61\x63kendNvmeTcpProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_NVMETRANSPORTTYPE = DESCRIPTOR.enum_types_by_name['NvmeTransportType']
NvmeTransportType = enum_type_wrapper.EnumTypeWrapper(_NVMETRANSPORTTYPE)
_NVMEADDRESSFAMILY = DESCRIPTOR.enum_types_by_name['NvmeAddressFamily']
NvmeAddressFamily = enum_type_wrapper.EnumTypeWrapper(_NVMEADDRESSFAMILY)
_NVMEMULTIPATH = DESCRIPTOR.enum_types_by_name['NvmeMultipath']
NvmeMultipath = enum_type_wrapper.EnumTypeWrapper(_NVMEMULTIPATH)
NVME_TRANSPORT_TYPE_UNSPECIFIED = 0
NVME_TRANSPORT_FC = 1
NVME_TRANSPORT_PCIE = 2
NVME_TRANSPORT_RDMA = 3
NVME_TRANSPORT_TCP = 4
NVME_TRANSPORT_CUSTOM = 5
NVME_ADDRESS_FAMILY_UNSPECIFIED = 0
NVMF_ADRFAM_IPV4 = 1
NVMF_ADRFAM_IPV6 = 2
NVMF_ADRFAM_IB = 3
NVMF_ADRFAM_FC = 4
NVMF_ADRFAM_INTRA_HOST = 5
NVME_MULTIPATH_UNSPECIFIED = 0
NVME_MULTIPATH_DISABLE = 1
NVME_MULTIPATH_FAILOVER = 2
NVME_MULTIPATH_MULTIPATH = 3


_NVMFREMOTECONTROLLER = DESCRIPTOR.message_types_by_name['NVMfRemoteController']
_NVMFREMOTECONTROLLERCONNECTREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerConnectRequest']
_NVMFREMOTECONTROLLERCONNECTRESPONSE = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerConnectResponse']
_NVMFREMOTECONTROLLERDISCONNECTREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerDisconnectRequest']
_NVMFREMOTECONTROLLERDISCONNECTRESPONSE = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerDisconnectResponse']
_NVMFREMOTECONTROLLERRESETREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerResetRequest']
_NVMFREMOTECONTROLLERRESETRESPONSE = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerResetResponse']
_NVMFREMOTECONTROLLERLISTREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerListRequest']
_NVMFREMOTECONTROLLERLISTRESPONSE = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerListResponse']
_NVMFREMOTECONTROLLERGETREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerGetRequest']
_NVMFREMOTECONTROLLERGETRESPONSE = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerGetResponse']
_NVMFREMOTECONTROLLERSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerStatsRequest']
_NVMFREMOTECONTROLLERSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerStatsResponse']
NVMfRemoteController = _reflection.GeneratedProtocolMessageType('NVMfRemoteController', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLER,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteController)
  })
_sym_db.RegisterMessage(NVMfRemoteController)

NVMfRemoteControllerConnectRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerConnectRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERCONNECTREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerConnectRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerConnectRequest)

NVMfRemoteControllerConnectResponse = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerConnectResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERCONNECTRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerConnectResponse)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerConnectResponse)

NVMfRemoteControllerDisconnectRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerDisconnectRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERDISCONNECTREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerDisconnectRequest)

NVMfRemoteControllerDisconnectResponse = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerDisconnectResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERDISCONNECTRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerDisconnectResponse)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerDisconnectResponse)

NVMfRemoteControllerResetRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerResetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERRESETREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerResetRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerResetRequest)

NVMfRemoteControllerResetResponse = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerResetResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERRESETRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerResetResponse)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerResetResponse)

NVMfRemoteControllerListRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerListRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERLISTREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerListRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerListRequest)

NVMfRemoteControllerListResponse = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerListResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERLISTRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerListResponse)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerListResponse)

NVMfRemoteControllerGetRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERGETREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerGetRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerGetRequest)

NVMfRemoteControllerGetResponse = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerGetResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERGETRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerGetResponse)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerGetResponse)

NVMfRemoteControllerStatsRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERSTATSREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerStatsRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerStatsRequest)

NVMfRemoteControllerStatsResponse = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERSTATSRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerStatsResponse)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerStatsResponse)

_NVMFREMOTECONTROLLERSERVICE = DESCRIPTOR.services_by_name['NVMfRemoteControllerService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\023BackendNvmeTcpProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _NVMETRANSPORTTYPE._serialized_start=1087
  _NVMETRANSPORTTYPE._serialized_end=1267
  _NVMEADDRESSFAMILY._serialized_start=1270
  _NVMEADDRESSFAMILY._serialized_end=1438
  _NVMEMULTIPATH._serialized_start=1441
  _NVMEMULTIPATH._serialized_end=1575
  _NVMFREMOTECONTROLLER._serialized_start=47
  _NVMFREMOTECONTROLLER._serialized_end=383
  _NVMFREMOTECONTROLLERCONNECTREQUEST._serialized_start=385
  _NVMFREMOTECONTROLLERCONNECTREQUEST._serialized_end=477
  _NVMFREMOTECONTROLLERCONNECTRESPONSE._serialized_start=479
  _NVMFREMOTECONTROLLERCONNECTRESPONSE._serialized_end=516
  _NVMFREMOTECONTROLLERDISCONNECTREQUEST._serialized_start=518
  _NVMFREMOTECONTROLLERDISCONNECTREQUEST._serialized_end=569
  _NVMFREMOTECONTROLLERDISCONNECTRESPONSE._serialized_start=571
  _NVMFREMOTECONTROLLERDISCONNECTRESPONSE._serialized_end=611
  _NVMFREMOTECONTROLLERRESETREQUEST._serialized_start=613
  _NVMFREMOTECONTROLLERRESETREQUEST._serialized_end=659
  _NVMFREMOTECONTROLLERRESETRESPONSE._serialized_start=661
  _NVMFREMOTECONTROLLERRESETRESPONSE._serialized_end=696
  _NVMFREMOTECONTROLLERLISTREQUEST._serialized_start=698
  _NVMFREMOTECONTROLLERLISTREQUEST._serialized_end=743
  _NVMFREMOTECONTROLLERLISTRESPONSE._serialized_start=745
  _NVMFREMOTECONTROLLERLISTRESPONSE._serialized_end=835
  _NVMFREMOTECONTROLLERGETREQUEST._serialized_start=837
  _NVMFREMOTECONTROLLERGETREQUEST._serialized_end=881
  _NVMFREMOTECONTROLLERGETRESPONSE._serialized_start=883
  _NVMFREMOTECONTROLLERGETRESPONSE._serialized_end=972
  _NVMFREMOTECONTROLLERSTATSREQUEST._serialized_start=974
  _NVMFREMOTECONTROLLERSTATSREQUEST._serialized_end=1020
  _NVMFREMOTECONTROLLERSTATSRESPONSE._serialized_start=1022
  _NVMFREMOTECONTROLLERSTATSRESPONSE._serialized_end=1084
  _NVMFREMOTECONTROLLERSERVICE._serialized_start=1578
  _NVMFREMOTECONTROLLERSERVICE._serialized_end=2465
# @@protoc_insertion_point(module_scope)
