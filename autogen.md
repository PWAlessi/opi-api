# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [backend_aio.proto](#backend_aio-proto)
    - [AioRemoteController](#opi_api-storage-v1-AioRemoteController)
    - [AioRemoteControllerCreateRequest](#opi_api-storage-v1-AioRemoteControllerCreateRequest)
    - [AioRemoteControllerDeleteRequest](#opi_api-storage-v1-AioRemoteControllerDeleteRequest)
    - [AioRemoteControllerGetListRequest](#opi_api-storage-v1-AioRemoteControllerGetListRequest)
    - [AioRemoteControllerGetRequest](#opi_api-storage-v1-AioRemoteControllerGetRequest)
    - [AioRemoteControllerGetStatsRequest](#opi_api-storage-v1-AioRemoteControllerGetStatsRequest)
    - [AioRemoteControllerList](#opi_api-storage-v1-AioRemoteControllerList)
    - [AioRemoteControllerStats](#opi_api-storage-v1-AioRemoteControllerStats)
    - [AioRemoteControllerStatsRequest](#opi_api-storage-v1-AioRemoteControllerStatsRequest)
    - [AioRemoteControllerUpdateRequest](#opi_api-storage-v1-AioRemoteControllerUpdateRequest)
  
    - [AioRemoteControllerService](#opi_api-storage-v1-AioRemoteControllerService)
  
- [backend_iscsi.proto](#backend_iscsi-proto)
- [backend_null.proto](#backend_null-proto)
    - [NullDebug](#opi_api-storage-v1-NullDebug)
    - [NullDebugCreateRequest](#opi_api-storage-v1-NullDebugCreateRequest)
    - [NullDebugCreateResponse](#opi_api-storage-v1-NullDebugCreateResponse)
    - [NullDebugDeleteRequest](#opi_api-storage-v1-NullDebugDeleteRequest)
    - [NullDebugDeleteResponse](#opi_api-storage-v1-NullDebugDeleteResponse)
    - [NullDebugGetRequest](#opi_api-storage-v1-NullDebugGetRequest)
    - [NullDebugGetResponse](#opi_api-storage-v1-NullDebugGetResponse)
    - [NullDebugListRequest](#opi_api-storage-v1-NullDebugListRequest)
    - [NullDebugListResponse](#opi_api-storage-v1-NullDebugListResponse)
    - [NullDebugStatsRequest](#opi_api-storage-v1-NullDebugStatsRequest)
    - [NullDebugStatsResponse](#opi_api-storage-v1-NullDebugStatsResponse)
    - [NullDebugUpdateRequest](#opi_api-storage-v1-NullDebugUpdateRequest)
    - [NullDebugUpdateResponse](#opi_api-storage-v1-NullDebugUpdateResponse)
  
    - [NullDebugService](#opi_api-storage-v1-NullDebugService)
  
- [backend_nvme_pcie.proto](#backend_nvme_pcie-proto)
- [backend_nvme_tcp.proto](#backend_nvme_tcp-proto)
    - [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController)
    - [NVMfRemoteControllerConnectRequest](#opi_api-storage-v1-NVMfRemoteControllerConnectRequest)
    - [NVMfRemoteControllerConnectResponse](#opi_api-storage-v1-NVMfRemoteControllerConnectResponse)
    - [NVMfRemoteControllerDisconnectRequest](#opi_api-storage-v1-NVMfRemoteControllerDisconnectRequest)
    - [NVMfRemoteControllerDisconnectResponse](#opi_api-storage-v1-NVMfRemoteControllerDisconnectResponse)
    - [NVMfRemoteControllerGetRequest](#opi_api-storage-v1-NVMfRemoteControllerGetRequest)
    - [NVMfRemoteControllerGetResponse](#opi_api-storage-v1-NVMfRemoteControllerGetResponse)
    - [NVMfRemoteControllerListRequest](#opi_api-storage-v1-NVMfRemoteControllerListRequest)
    - [NVMfRemoteControllerListResponse](#opi_api-storage-v1-NVMfRemoteControllerListResponse)
    - [NVMfRemoteControllerResetRequest](#opi_api-storage-v1-NVMfRemoteControllerResetRequest)
    - [NVMfRemoteControllerResetResponse](#opi_api-storage-v1-NVMfRemoteControllerResetResponse)
    - [NVMfRemoteControllerStatsRequest](#opi_api-storage-v1-NVMfRemoteControllerStatsRequest)
    - [NVMfRemoteControllerStatsResponse](#opi_api-storage-v1-NVMfRemoteControllerStatsResponse)
  
    - [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily)
    - [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath)
    - [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType)
  
    - [NVMfRemoteControllerService](#opi_api-storage-v1-NVMfRemoteControllerService)
  
- [common.proto](#common-proto)
    - [NvmeControllerPciId](#opi_api-storage-v1-NvmeControllerPciId)
  
- [frontend_nvme_pcie.proto](#frontend_nvme_pcie-proto)
    - [NVMeController](#opi_api-storage-v1-NVMeController)
    - [NVMeControllerCreateRequest](#opi_api-storage-v1-NVMeControllerCreateRequest)
    - [NVMeControllerCreateResponse](#opi_api-storage-v1-NVMeControllerCreateResponse)
    - [NVMeControllerDeleteRequest](#opi_api-storage-v1-NVMeControllerDeleteRequest)
    - [NVMeControllerDeleteResponse](#opi_api-storage-v1-NVMeControllerDeleteResponse)
    - [NVMeControllerGetRequest](#opi_api-storage-v1-NVMeControllerGetRequest)
    - [NVMeControllerGetResponse](#opi_api-storage-v1-NVMeControllerGetResponse)
    - [NVMeControllerListRequest](#opi_api-storage-v1-NVMeControllerListRequest)
    - [NVMeControllerListResponse](#opi_api-storage-v1-NVMeControllerListResponse)
    - [NVMeControllerStatsRequest](#opi_api-storage-v1-NVMeControllerStatsRequest)
    - [NVMeControllerStatsResponse](#opi_api-storage-v1-NVMeControllerStatsResponse)
    - [NVMeControllerUpdateRequest](#opi_api-storage-v1-NVMeControllerUpdateRequest)
    - [NVMeControllerUpdateResponse](#opi_api-storage-v1-NVMeControllerUpdateResponse)
    - [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace)
    - [NVMeNamespaceCreateRequest](#opi_api-storage-v1-NVMeNamespaceCreateRequest)
    - [NVMeNamespaceCreateResponse](#opi_api-storage-v1-NVMeNamespaceCreateResponse)
    - [NVMeNamespaceDeleteRequest](#opi_api-storage-v1-NVMeNamespaceDeleteRequest)
    - [NVMeNamespaceDeleteResponse](#opi_api-storage-v1-NVMeNamespaceDeleteResponse)
    - [NVMeNamespaceGetRequest](#opi_api-storage-v1-NVMeNamespaceGetRequest)
    - [NVMeNamespaceGetResponse](#opi_api-storage-v1-NVMeNamespaceGetResponse)
    - [NVMeNamespaceListRequest](#opi_api-storage-v1-NVMeNamespaceListRequest)
    - [NVMeNamespaceListResponse](#opi_api-storage-v1-NVMeNamespaceListResponse)
    - [NVMeNamespaceStatsRequest](#opi_api-storage-v1-NVMeNamespaceStatsRequest)
    - [NVMeNamespaceStatsResponse](#opi_api-storage-v1-NVMeNamespaceStatsResponse)
    - [NVMeNamespaceUpdateRequest](#opi_api-storage-v1-NVMeNamespaceUpdateRequest)
    - [NVMeNamespaceUpdateResponse](#opi_api-storage-v1-NVMeNamespaceUpdateResponse)
    - [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem)
    - [NVMeSubsystemCreateRequest](#opi_api-storage-v1-NVMeSubsystemCreateRequest)
    - [NVMeSubsystemCreateResponse](#opi_api-storage-v1-NVMeSubsystemCreateResponse)
    - [NVMeSubsystemDeleteRequest](#opi_api-storage-v1-NVMeSubsystemDeleteRequest)
    - [NVMeSubsystemDeleteResponse](#opi_api-storage-v1-NVMeSubsystemDeleteResponse)
    - [NVMeSubsystemGetRequest](#opi_api-storage-v1-NVMeSubsystemGetRequest)
    - [NVMeSubsystemGetResponse](#opi_api-storage-v1-NVMeSubsystemGetResponse)
    - [NVMeSubsystemListRequest](#opi_api-storage-v1-NVMeSubsystemListRequest)
    - [NVMeSubsystemListResponse](#opi_api-storage-v1-NVMeSubsystemListResponse)
    - [NVMeSubsystemStatsRequest](#opi_api-storage-v1-NVMeSubsystemStatsRequest)
    - [NVMeSubsystemStatsResponse](#opi_api-storage-v1-NVMeSubsystemStatsResponse)
    - [NVMeSubsystemUpdateRequest](#opi_api-storage-v1-NVMeSubsystemUpdateRequest)
    - [NVMeSubsystemUpdateResponse](#opi_api-storage-v1-NVMeSubsystemUpdateResponse)
  
    - [NVMeControllerService](#opi_api-storage-v1-NVMeControllerService)
    - [NVMeNamespaceService](#opi_api-storage-v1-NVMeNamespaceService)
    - [NVMeSubsystemService](#opi_api-storage-v1-NVMeSubsystemService)
  
- [frontend_virtio_blk.proto](#frontend_virtio_blk-proto)
    - [VirtioBlk](#opi_api-storage-v1-VirtioBlk)
    - [VirtioBlkCreateRequest](#opi_api-storage-v1-VirtioBlkCreateRequest)
    - [VirtioBlkCreateResponse](#opi_api-storage-v1-VirtioBlkCreateResponse)
    - [VirtioBlkDeleteRequest](#opi_api-storage-v1-VirtioBlkDeleteRequest)
    - [VirtioBlkDeleteResponse](#opi_api-storage-v1-VirtioBlkDeleteResponse)
    - [VirtioBlkGetRequest](#opi_api-storage-v1-VirtioBlkGetRequest)
    - [VirtioBlkGetResponse](#opi_api-storage-v1-VirtioBlkGetResponse)
    - [VirtioBlkListRequest](#opi_api-storage-v1-VirtioBlkListRequest)
    - [VirtioBlkListResponse](#opi_api-storage-v1-VirtioBlkListResponse)
    - [VirtioBlkStatsRequest](#opi_api-storage-v1-VirtioBlkStatsRequest)
    - [VirtioBlkStatsResponse](#opi_api-storage-v1-VirtioBlkStatsResponse)
    - [VirtioBlkUpdateRequest](#opi_api-storage-v1-VirtioBlkUpdateRequest)
    - [VirtioBlkUpdateResponse](#opi_api-storage-v1-VirtioBlkUpdateResponse)
  
    - [VirtioBlkService](#opi_api-storage-v1-VirtioBlkService)
  
- [frontend_virtio_fs.proto](#frontend_virtio_fs-proto)
- [frontend_virtio_scsi.proto](#frontend_virtio_scsi-proto)
    - [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController)
    - [VirtioScsiControllerCreateRequest](#opi_api-storage-v1-VirtioScsiControllerCreateRequest)
    - [VirtioScsiControllerCreateResponse](#opi_api-storage-v1-VirtioScsiControllerCreateResponse)
    - [VirtioScsiControllerDeleteRequest](#opi_api-storage-v1-VirtioScsiControllerDeleteRequest)
    - [VirtioScsiControllerDeleteResponse](#opi_api-storage-v1-VirtioScsiControllerDeleteResponse)
    - [VirtioScsiControllerGetRequest](#opi_api-storage-v1-VirtioScsiControllerGetRequest)
    - [VirtioScsiControllerGetResponse](#opi_api-storage-v1-VirtioScsiControllerGetResponse)
    - [VirtioScsiControllerListRequest](#opi_api-storage-v1-VirtioScsiControllerListRequest)
    - [VirtioScsiControllerListResponse](#opi_api-storage-v1-VirtioScsiControllerListResponse)
    - [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest)
    - [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse)
    - [VirtioScsiControllerUpdateRequest](#opi_api-storage-v1-VirtioScsiControllerUpdateRequest)
    - [VirtioScsiControllerUpdateResponse](#opi_api-storage-v1-VirtioScsiControllerUpdateResponse)
    - [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun)
    - [VirtioScsiLunCreateRequest](#opi_api-storage-v1-VirtioScsiLunCreateRequest)
    - [VirtioScsiLunCreateResponse](#opi_api-storage-v1-VirtioScsiLunCreateResponse)
    - [VirtioScsiLunDeleteRequest](#opi_api-storage-v1-VirtioScsiLunDeleteRequest)
    - [VirtioScsiLunDeleteResponse](#opi_api-storage-v1-VirtioScsiLunDeleteResponse)
    - [VirtioScsiLunGetRequest](#opi_api-storage-v1-VirtioScsiLunGetRequest)
    - [VirtioScsiLunGetResponse](#opi_api-storage-v1-VirtioScsiLunGetResponse)
    - [VirtioScsiLunListRequest](#opi_api-storage-v1-VirtioScsiLunListRequest)
    - [VirtioScsiLunListResponse](#opi_api-storage-v1-VirtioScsiLunListResponse)
    - [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest)
    - [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse)
    - [VirtioScsiLunUpdateRequest](#opi_api-storage-v1-VirtioScsiLunUpdateRequest)
    - [VirtioScsiLunUpdateResponse](#opi_api-storage-v1-VirtioScsiLunUpdateResponse)
  
    - [VirtioScsiControllerService](#opi_api-storage-v1-VirtioScsiControllerService)
    - [VirtioScsiLunService](#opi_api-storage-v1-VirtioScsiLunService)
  
- [ipsec.proto](#ipsec-proto)
    - [Addrs](#opi_api-security-v1-Addrs)
    - [CaCerts](#opi_api-security-v1-CaCerts)
    - [CertPolicy](#opi_api-security-v1-CertPolicy)
    - [Certs](#opi_api-security-v1-Certs)
    - [Child](#opi_api-security-v1-Child)
    - [Connection](#opi_api-security-v1-Connection)
    - [Groups](#opi_api-security-v1-Groups)
    - [IPsecInitiateReq](#opi_api-security-v1-IPsecInitiateReq)
    - [IPsecInitiateResp](#opi_api-security-v1-IPsecInitiateResp)
    - [IPsecListCertsReq](#opi_api-security-v1-IPsecListCertsReq)
    - [IPsecListCertsResp](#opi_api-security-v1-IPsecListCertsResp)
    - [IPsecListConnsReq](#opi_api-security-v1-IPsecListConnsReq)
    - [IPsecListConnsResp](#opi_api-security-v1-IPsecListConnsResp)
    - [IPsecListSasReq](#opi_api-security-v1-IPsecListSasReq)
    - [IPsecListSasResp](#opi_api-security-v1-IPsecListSasResp)
    - [IPsecLoadConnReq](#opi_api-security-v1-IPsecLoadConnReq)
    - [IPsecLoadConnResp](#opi_api-security-v1-IPsecLoadConnResp)
    - [IPsecRekeyReq](#opi_api-security-v1-IPsecRekeyReq)
    - [IPsecRekeyResp](#opi_api-security-v1-IPsecRekeyResp)
    - [IPsecStatsReq](#opi_api-security-v1-IPsecStatsReq)
    - [IPsecStatsResp](#opi_api-security-v1-IPsecStatsResp)
    - [IPsecTerminateReq](#opi_api-security-v1-IPsecTerminateReq)
    - [IPsecTerminateResp](#opi_api-security-v1-IPsecTerminateResp)
    - [IPsecUnloadConnReq](#opi_api-security-v1-IPsecUnloadConnReq)
    - [IPsecUnloadConnResp](#opi_api-security-v1-IPsecUnloadConnResp)
    - [IPsecVersionReq](#opi_api-security-v1-IPsecVersionReq)
    - [IPsecVersionResp](#opi_api-security-v1-IPsecVersionResp)
    - [ListCert](#opi_api-security-v1-ListCert)
    - [ListChild](#opi_api-security-v1-ListChild)
    - [ListChildSa](#opi_api-security-v1-ListChildSa)
    - [ListConnAuth](#opi_api-security-v1-ListConnAuth)
    - [ListConnResp](#opi_api-security-v1-ListConnResp)
    - [ListIkeSa](#opi_api-security-v1-ListIkeSa)
    - [LocalAuth](#opi_api-security-v1-LocalAuth)
    - [Pools](#opi_api-security-v1-Pools)
    - [Proposals](#opi_api-security-v1-Proposals)
    - [PubKeys](#opi_api-security-v1-PubKeys)
    - [RemoteAuth](#opi_api-security-v1-RemoteAuth)
    - [TrafficSelectors](#opi_api-security-v1-TrafficSelectors)
    - [TrafficSelectors.TrafficSelector](#opi_api-security-v1-TrafficSelectors-TrafficSelector)
    - [Vips](#opi_api-security-v1-Vips)
  
    - [AuthType](#opi_api-security-v1-AuthType)
    - [CertificateType](#opi_api-security-v1-CertificateType)
    - [ChildSaState](#opi_api-security-v1-ChildSaState)
    - [CryptoAlgorithm](#opi_api-security-v1-CryptoAlgorithm)
    - [DiffieHellmanGroups](#opi_api-security-v1-DiffieHellmanGroups)
    - [IPsecMode](#opi_api-security-v1-IPsecMode)
    - [IkeSaState](#opi_api-security-v1-IkeSaState)
    - [IntegAlgorithm](#opi_api-security-v1-IntegAlgorithm)
    - [PseudoRandomFunction](#opi_api-security-v1-PseudoRandomFunction)
    - [X509CertificateFlag](#opi_api-security-v1-X509CertificateFlag)
  
    - [IPsec](#opi_api-security-v1-IPsec)
  
- [middleend.proto](#middleend-proto)
- [object_key.proto](#object_key-proto)
    - [ObjectKey](#opi_api-common-v1-ObjectKey)
  
- [oc_interfaces.proto](#oc_interfaces-proto)
    - [Interface](#opi_api-network-v1-Interface)
    - [Interface.Config](#opi_api-network-v1-Interface-Config)
    - [Interface.HoldTime](#opi_api-network-v1-Interface-HoldTime)
    - [Interface.HoldTime.Config](#opi_api-network-v1-Interface-HoldTime-Config)
    - [Interface.HoldTime.State](#opi_api-network-v1-Interface-HoldTime-State)
    - [Interface.State](#opi_api-network-v1-Interface-State)
    - [Interface.State.Counters](#opi_api-network-v1-Interface-State-Counters)
    - [Interface.Subinterfaces](#opi_api-network-v1-Interface-Subinterfaces)
    - [Interface.Subinterfaces.Subinterface](#opi_api-network-v1-Interface-Subinterfaces-Subinterface)
    - [Interface.Subinterfaces.Subinterface.Config](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-Config)
    - [Interface.Subinterfaces.Subinterface.State](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-State)
    - [Interface.Subinterfaces.Subinterface.State.Counters](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-State-Counters)
    - [Interfaces](#opi_api-network-v1-Interfaces)
    - [NetInterfaceGetRequest](#opi_api-network-v1-NetInterfaceGetRequest)
    - [NetInterfaceGetResponse](#opi_api-network-v1-NetInterfaceGetResponse)
    - [NetInterfaceListRequest](#opi_api-network-v1-NetInterfaceListRequest)
    - [NetInterfaceListResponse](#opi_api-network-v1-NetInterfaceListResponse)
    - [NetInterfaceUpdateRequest](#opi_api-network-v1-NetInterfaceUpdateRequest)
    - [NetInterfaceUpdateResponse](#opi_api-network-v1-NetInterfaceUpdateResponse)
  
    - [InterfaceState](#opi_api-network-v1-InterfaceState)
    - [InterfaceType](#opi_api-network-v1-InterfaceType)
  
    - [NetInterface](#opi_api-network-v1-NetInterface)
  
- [openoffload.proto](#openoffload-proto)
    - [ActionParameters](#opi_api-security-firewall-v1-ActionParameters)
    - [AddSessionResponse](#opi_api-security-firewall-v1-AddSessionResponse)
    - [SessionId](#opi_api-security-firewall-v1-SessionId)
    - [SessionRequest](#opi_api-security-firewall-v1-SessionRequest)
    - [SessionRequestArgs](#opi_api-security-firewall-v1-SessionRequestArgs)
    - [SessionResponse](#opi_api-security-firewall-v1-SessionResponse)
    - [SessionResponseError](#opi_api-security-firewall-v1-SessionResponseError)
    - [SessionResponses](#opi_api-security-firewall-v1-SessionResponses)
  
    - [ActionType](#opi_api-security-firewall-v1-ActionType)
    - [AddSessionStatus](#opi_api-security-firewall-v1-AddSessionStatus)
    - [IpVersion](#opi_api-security-firewall-v1-IpVersion)
    - [ProtocolId](#opi_api-security-firewall-v1-ProtocolId)
    - [RequestStatus](#opi_api-security-firewall-v1-RequestStatus)
    - [SessionCloseCode](#opi_api-security-firewall-v1-SessionCloseCode)
    - [SessionState](#opi_api-security-firewall-v1-SessionState)
  
    - [SessionTable](#opi_api-security-firewall-v1-SessionTable)
  
- [uuid.proto](#uuid-proto)
    - [Uuid](#opi_api-common-v1-Uuid)
  
- [Scalar Value Types](#scalar-value-types)



<a name="backend_aio-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_aio.proto



<a name="opi_api-storage-v1-AioRemoteController"></a>

### AioRemoteController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | handle is an opaque object handle that is not user settable. handle will be returned with created object |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| block_size | [int64](#int64) |  |  |
| num_blocks | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-AioRemoteControllerCreateRequest"></a>

### AioRemoteControllerCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [AioRemoteController](#opi_api-storage-v1-AioRemoteController) |  |  |






<a name="opi_api-storage-v1-AioRemoteControllerDeleteRequest"></a>

### AioRemoteControllerDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioRemoteControllerGetListRequest"></a>

### AioRemoteControllerGetListRequest
Intentionally empty






<a name="opi_api-storage-v1-AioRemoteControllerGetRequest"></a>

### AioRemoteControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioRemoteControllerGetStatsRequest"></a>

### AioRemoteControllerGetStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioRemoteControllerList"></a>

### AioRemoteControllerList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [AioRemoteController](#opi_api-storage-v1-AioRemoteController) | repeated |  |






<a name="opi_api-storage-v1-AioRemoteControllerStats"></a>

### AioRemoteControllerStats



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-AioRemoteControllerStatsRequest"></a>

### AioRemoteControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioRemoteControllerUpdateRequest"></a>

### AioRemoteControllerUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [AioRemoteController](#opi_api-storage-v1-AioRemoteController) |  |  |





 

 

 


<a name="opi_api-storage-v1-AioRemoteControllerService"></a>

### AioRemoteControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AioRemoteControllerCreate | [AioRemoteControllerCreateRequest](#opi_api-storage-v1-AioRemoteControllerCreateRequest) | [AioRemoteController](#opi_api-storage-v1-AioRemoteController) |  |
| AioRemoteControllerDelete | [AioRemoteControllerDeleteRequest](#opi_api-storage-v1-AioRemoteControllerDeleteRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| AioRemoteControllerGet | [AioRemoteControllerGetRequest](#opi_api-storage-v1-AioRemoteControllerGetRequest) | [AioRemoteController](#opi_api-storage-v1-AioRemoteController) |  |
| AioRemoteControllerGetList | [AioRemoteControllerGetListRequest](#opi_api-storage-v1-AioRemoteControllerGetListRequest) | [AioRemoteControllerList](#opi_api-storage-v1-AioRemoteControllerList) |  |
| AioRemoteControllerGetStats | [AioRemoteControllerGetStatsRequest](#opi_api-storage-v1-AioRemoteControllerGetStatsRequest) | [AioRemoteControllerStats](#opi_api-storage-v1-AioRemoteControllerStats) |  |
| AioRemoteControllerUpdate | [AioRemoteControllerUpdateRequest](#opi_api-storage-v1-AioRemoteControllerUpdateRequest) | [AioRemoteController](#opi_api-storage-v1-AioRemoteController) |  |

 



<a name="backend_iscsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_iscsi.proto


 

 

 

 



<a name="backend_null-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_null.proto



<a name="opi_api-storage-v1-NullDebug"></a>

### NullDebug



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| block_size | [int64](#int64) |  |  |
| num_blocks | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-NullDebugCreateRequest"></a>

### NullDebugCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |






<a name="opi_api-storage-v1-NullDebugCreateResponse"></a>

### NullDebugCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NullDebugDeleteRequest"></a>

### NullDebugDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NullDebugDeleteResponse"></a>

### NullDebugDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-NullDebugGetRequest"></a>

### NullDebugGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NullDebugGetResponse"></a>

### NullDebugGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |






<a name="opi_api-storage-v1-NullDebugListRequest"></a>

### NullDebugListRequest
Intentionally empty.






<a name="opi_api-storage-v1-NullDebugListResponse"></a>

### NullDebugListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) | repeated |  |






<a name="opi_api-storage-v1-NullDebugStatsRequest"></a>

### NullDebugStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NullDebugStatsResponse"></a>

### NullDebugStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NullDebugUpdateRequest"></a>

### NullDebugUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |






<a name="opi_api-storage-v1-NullDebugUpdateResponse"></a>

### NullDebugUpdateResponse
Intentionally empty.





 

 

 


<a name="opi_api-storage-v1-NullDebugService"></a>

### NullDebugService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NullDebugCreate | [NullDebugCreateRequest](#opi_api-storage-v1-NullDebugCreateRequest) | [NullDebugCreateResponse](#opi_api-storage-v1-NullDebugCreateResponse) |  |
| NullDebugDelete | [NullDebugDeleteRequest](#opi_api-storage-v1-NullDebugDeleteRequest) | [NullDebugDeleteResponse](#opi_api-storage-v1-NullDebugDeleteResponse) |  |
| NullDebugUpdate | [NullDebugUpdateRequest](#opi_api-storage-v1-NullDebugUpdateRequest) | [NullDebugUpdateResponse](#opi_api-storage-v1-NullDebugUpdateResponse) |  |
| NullDebugList | [NullDebugListRequest](#opi_api-storage-v1-NullDebugListRequest) | [NullDebugListResponse](#opi_api-storage-v1-NullDebugListResponse) |  |
| NullDebugGet | [NullDebugGetRequest](#opi_api-storage-v1-NullDebugGetRequest) | [NullDebugGetResponse](#opi_api-storage-v1-NullDebugGetResponse) |  |
| NullDebugStats | [NullDebugStatsRequest](#opi_api-storage-v1-NullDebugStatsRequest) | [NullDebugStatsResponse](#opi_api-storage-v1-NullDebugStatsResponse) |  |

 



<a name="backend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_pcie.proto


 

 

 

 



<a name="backend_nvme_tcp-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_tcp.proto



<a name="opi_api-storage-v1-NVMfRemoteController"></a>

### NVMfRemoteController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| trtype | [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType) |  |  |
| adrfam | [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily) |  |  |
| traddr | [string](#string) |  |  |
| trsvcid | [int64](#int64) |  |  |
| subnqn | [string](#string) |  |  |
| hdgst | [bool](#bool) |  |  |
| ddgst | [bool](#bool) |  |  |
| multipath | [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath) |  |  |
| num_io_queues | [int64](#int64) |  |  |
| queue_size | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerConnectRequest"></a>

### NVMfRemoteControllerConnectRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ctrl | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerConnectResponse"></a>

### NVMfRemoteControllerConnectResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMfRemoteControllerDisconnectRequest"></a>

### NVMfRemoteControllerDisconnectRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerDisconnectResponse"></a>

### NVMfRemoteControllerDisconnectResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMfRemoteControllerGetRequest"></a>

### NVMfRemoteControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerGetResponse"></a>

### NVMfRemoteControllerGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ctrl | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerListRequest"></a>

### NVMfRemoteControllerListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerListResponse"></a>

### NVMfRemoteControllerListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ctrl | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) | repeated |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerResetRequest"></a>

### NVMfRemoteControllerResetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerResetResponse"></a>

### NVMfRemoteControllerResetResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMfRemoteControllerStatsRequest"></a>

### NVMfRemoteControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerStatsResponse"></a>

### NVMfRemoteControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |





 


<a name="opi_api-storage-v1-NvmeAddressFamily"></a>

### NvmeAddressFamily


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVMF_ADRFAM_IPV4 | 0 |  |
| NVMF_ADRFAM_IPV6 | 1 |  |
| NVMF_ADRFAM_IB | 2 |  |
| NVMF_ADRFAM_FC | 3 |  |
| NVMF_ADRFAM_INTRA_HOST | 4 |  |



<a name="opi_api-storage-v1-NvmeMultipath"></a>

### NvmeMultipath


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_MPIO_DISABLE | 0 |  |
| NVME_MPIO_FAILOVER | 1 |  |
| NVME_MPIO_MULTIPATH | 2 |  |



<a name="opi_api-storage-v1-NvmeTransportType"></a>

### NvmeTransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_TRANSPORT_FC | 0 |  |
| NVME_TRANSPORT_PCIE | 1 |  |
| NVME_TRANSPORT_RDMA | 2 |  |
| NVME_TRANSPORT_TCP | 3 |  |
| NVME_TRANSPORT_CUSTOM | 4 |  |


 

 


<a name="opi_api-storage-v1-NVMfRemoteControllerService"></a>

### NVMfRemoteControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMfRemoteControllerConnect | [NVMfRemoteControllerConnectRequest](#opi_api-storage-v1-NVMfRemoteControllerConnectRequest) | [NVMfRemoteControllerConnectResponse](#opi_api-storage-v1-NVMfRemoteControllerConnectResponse) |  |
| NVMfRemoteControllerDisconnect | [NVMfRemoteControllerDisconnectRequest](#opi_api-storage-v1-NVMfRemoteControllerDisconnectRequest) | [NVMfRemoteControllerDisconnectResponse](#opi_api-storage-v1-NVMfRemoteControllerDisconnectResponse) |  |
| NVMfRemoteControllerReset | [NVMfRemoteControllerResetRequest](#opi_api-storage-v1-NVMfRemoteControllerResetRequest) | [NVMfRemoteControllerResetResponse](#opi_api-storage-v1-NVMfRemoteControllerResetResponse) |  |
| NVMfRemoteControllerList | [NVMfRemoteControllerListRequest](#opi_api-storage-v1-NVMfRemoteControllerListRequest) | [NVMfRemoteControllerListResponse](#opi_api-storage-v1-NVMfRemoteControllerListResponse) |  |
| NVMfRemoteControllerGet | [NVMfRemoteControllerGetRequest](#opi_api-storage-v1-NVMfRemoteControllerGetRequest) | [NVMfRemoteControllerGetResponse](#opi_api-storage-v1-NVMfRemoteControllerGetResponse) |  |
| NVMfRemoteControllerStats | [NVMfRemoteControllerStatsRequest](#opi_api-storage-v1-NVMfRemoteControllerStatsRequest) | [NVMfRemoteControllerStatsResponse](#opi_api-storage-v1-NVMfRemoteControllerStatsResponse) |  |

 



<a name="common-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## common.proto



<a name="opi_api-storage-v1-NvmeControllerPciId"></a>

### NvmeControllerPciId
The controller PCI-ID is used to address a given virtual controller. Virtual
controllers are organized into devices with Physical functions and SRIOV
virtual function within the physical functions. Currently, xPUs may
expose multiple devices with one physical function each and one or more
virtual functions under the physical function.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bus | [uint32](#uint32) |  | Bus number, provided for future usage if needed. Currently set to ’0’ |
| device | [uint32](#uint32) |  | Device number, based on the NVMe device layout |
| function | [uint32](#uint32) |  | Physical function, always set to 0 in current model |
| virtual_function | [uint32](#uint32) |  | SRIOV Virtual function within the Device and Physical function. Set to 0 for Physical Function. Virtual Function numbering starts from 1 |





 

 

 

 



<a name="frontend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_nvme_pcie.proto



<a name="opi_api-storage-v1-NVMeController"></a>

### NVMeController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| subsystem_id | [string](#string) |  |  |
| pcie_id | [NvmeControllerPciId](#opi_api-storage-v1-NvmeControllerPciId) |  |  |
| max_io_qps | [int64](#int64) |  |  |
| max_ns | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerCreateRequest"></a>

### NVMeControllerCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |






<a name="opi_api-storage-v1-NVMeControllerCreateResponse"></a>

### NVMeControllerCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeControllerDeleteRequest"></a>

### NVMeControllerDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerDeleteResponse"></a>

### NVMeControllerDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeControllerGetRequest"></a>

### NVMeControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerGetResponse"></a>

### NVMeControllerGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |






<a name="opi_api-storage-v1-NVMeControllerListRequest"></a>

### NVMeControllerListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerListResponse"></a>

### NVMeControllerListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) | repeated |  |






<a name="opi_api-storage-v1-NVMeControllerStatsRequest"></a>

### NVMeControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerStatsResponse"></a>

### NVMeControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeControllerUpdateRequest"></a>

### NVMeControllerUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |






<a name="opi_api-storage-v1-NVMeControllerUpdateResponse"></a>

### NVMeControllerUpdateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeNamespace"></a>

### NVMeNamespace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| subsystem_id | [string](#string) |  |  |
| controller_id | [int64](#int64) |  |  |
| nsid | [int64](#int64) |  |  |
| bdev | [string](#string) |  |  |
| block_size | [int64](#int64) |  |  |
| num_blocks | [int64](#int64) |  |  |
| nguid | [string](#string) |  |  |
| eui64 | [string](#string) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |
| multipath | [string](#string) |  |  |
| authentication | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceCreateRequest"></a>

### NVMeNamespaceCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceCreateResponse"></a>

### NVMeNamespaceCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeNamespaceDeleteRequest"></a>

### NVMeNamespaceDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |
| namespace_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceDeleteResponse"></a>

### NVMeNamespaceDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeNamespaceGetRequest"></a>

### NVMeNamespaceGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |
| namespace_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceGetResponse"></a>

### NVMeNamespaceGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceListRequest"></a>

### NVMeNamespaceListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceListResponse"></a>

### NVMeNamespaceListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) | repeated |  |






<a name="opi_api-storage-v1-NVMeNamespaceStatsRequest"></a>

### NVMeNamespaceStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |
| namespace_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceStatsResponse"></a>

### NVMeNamespaceStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceUpdateRequest"></a>

### NVMeNamespaceUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceUpdateResponse"></a>

### NVMeNamespaceUpdateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeSubsystem"></a>

### NVMeSubsystem



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  |  |
| serial_number | [string](#string) |  |  |
| model_number | [string](#string) |  |  |
| max_ns | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemCreateRequest"></a>

### NVMeSubsystemCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemCreateResponse"></a>

### NVMeSubsystemCreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemDeleteRequest"></a>

### NVMeSubsystemDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemDeleteResponse"></a>

### NVMeSubsystemDeleteResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| result | [uint32](#uint32) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemGetRequest"></a>

### NVMeSubsystemGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemGetResponse"></a>

### NVMeSubsystemGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemListRequest"></a>

### NVMeSubsystemListRequest
Intentionally empty.






<a name="opi_api-storage-v1-NVMeSubsystemListResponse"></a>

### NVMeSubsystemListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) | repeated |  |






<a name="opi_api-storage-v1-NVMeSubsystemStatsRequest"></a>

### NVMeSubsystemStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemStatsResponse"></a>

### NVMeSubsystemStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemUpdateRequest"></a>

### NVMeSubsystemUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemUpdateResponse"></a>

### NVMeSubsystemUpdateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| result | [uint32](#uint32) |  |  |





 

 

 


<a name="opi_api-storage-v1-NVMeControllerService"></a>

### NVMeControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeControllerCreate | [NVMeControllerCreateRequest](#opi_api-storage-v1-NVMeControllerCreateRequest) | [NVMeControllerCreateResponse](#opi_api-storage-v1-NVMeControllerCreateResponse) |  |
| NVMeControllerDelete | [NVMeControllerDeleteRequest](#opi_api-storage-v1-NVMeControllerDeleteRequest) | [NVMeControllerDeleteResponse](#opi_api-storage-v1-NVMeControllerDeleteResponse) |  |
| NVMeControllerUpdate | [NVMeControllerUpdateRequest](#opi_api-storage-v1-NVMeControllerUpdateRequest) | [NVMeControllerUpdateResponse](#opi_api-storage-v1-NVMeControllerUpdateResponse) |  |
| NVMeControllerList | [NVMeControllerListRequest](#opi_api-storage-v1-NVMeControllerListRequest) | [NVMeControllerListResponse](#opi_api-storage-v1-NVMeControllerListResponse) |  |
| NVMeControllerGet | [NVMeControllerGetRequest](#opi_api-storage-v1-NVMeControllerGetRequest) | [NVMeControllerGetResponse](#opi_api-storage-v1-NVMeControllerGetResponse) |  |
| NVMeControllerStats | [NVMeControllerStatsRequest](#opi_api-storage-v1-NVMeControllerStatsRequest) | [NVMeControllerStatsResponse](#opi_api-storage-v1-NVMeControllerStatsResponse) |  |


<a name="opi_api-storage-v1-NVMeNamespaceService"></a>

### NVMeNamespaceService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeNamespaceCreate | [NVMeNamespaceCreateRequest](#opi_api-storage-v1-NVMeNamespaceCreateRequest) | [NVMeNamespaceCreateResponse](#opi_api-storage-v1-NVMeNamespaceCreateResponse) |  |
| NVMeNamespaceDelete | [NVMeNamespaceDeleteRequest](#opi_api-storage-v1-NVMeNamespaceDeleteRequest) | [NVMeNamespaceDeleteResponse](#opi_api-storage-v1-NVMeNamespaceDeleteResponse) |  |
| NVMeNamespaceUpdate | [NVMeNamespaceUpdateRequest](#opi_api-storage-v1-NVMeNamespaceUpdateRequest) | [NVMeNamespaceUpdateResponse](#opi_api-storage-v1-NVMeNamespaceUpdateResponse) |  |
| NVMeNamespaceList | [NVMeNamespaceListRequest](#opi_api-storage-v1-NVMeNamespaceListRequest) | [NVMeNamespaceListResponse](#opi_api-storage-v1-NVMeNamespaceListResponse) |  |
| NVMeNamespaceGet | [NVMeNamespaceGetRequest](#opi_api-storage-v1-NVMeNamespaceGetRequest) | [NVMeNamespaceGetResponse](#opi_api-storage-v1-NVMeNamespaceGetResponse) |  |
| NVMeNamespaceStats | [NVMeNamespaceStatsRequest](#opi_api-storage-v1-NVMeNamespaceStatsRequest) | [NVMeNamespaceStatsResponse](#opi_api-storage-v1-NVMeNamespaceStatsResponse) |  |


<a name="opi_api-storage-v1-NVMeSubsystemService"></a>

### NVMeSubsystemService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeSubsystemCreate | [NVMeSubsystemCreateRequest](#opi_api-storage-v1-NVMeSubsystemCreateRequest) | [NVMeSubsystemCreateResponse](#opi_api-storage-v1-NVMeSubsystemCreateResponse) |  |
| NVMeSubsystemDelete | [NVMeSubsystemDeleteRequest](#opi_api-storage-v1-NVMeSubsystemDeleteRequest) | [NVMeSubsystemDeleteResponse](#opi_api-storage-v1-NVMeSubsystemDeleteResponse) |  |
| NVMeSubsystemUpdate | [NVMeSubsystemUpdateRequest](#opi_api-storage-v1-NVMeSubsystemUpdateRequest) | [NVMeSubsystemUpdateResponse](#opi_api-storage-v1-NVMeSubsystemUpdateResponse) |  |
| NVMeSubsystemList | [NVMeSubsystemListRequest](#opi_api-storage-v1-NVMeSubsystemListRequest) | [NVMeSubsystemListResponse](#opi_api-storage-v1-NVMeSubsystemListResponse) |  |
| NVMeSubsystemGet | [NVMeSubsystemGetRequest](#opi_api-storage-v1-NVMeSubsystemGetRequest) | [NVMeSubsystemGetResponse](#opi_api-storage-v1-NVMeSubsystemGetResponse) |  |
| NVMeSubsystemStats | [NVMeSubsystemStatsRequest](#opi_api-storage-v1-NVMeSubsystemStatsRequest) | [NVMeSubsystemStatsResponse](#opi_api-storage-v1-NVMeSubsystemStatsResponse) |  |

 



<a name="frontend_virtio_blk-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_blk.proto



<a name="opi_api-storage-v1-VirtioBlk"></a>

### VirtioBlk



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| pcie_id | [NvmeControllerPciId](#opi_api-storage-v1-NvmeControllerPciId) |  |  |
| bdev | [string](#string) |  |  |
| max_io_qps | [int64](#int64) |  |  |
| serial_number | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioBlkCreateRequest"></a>

### VirtioBlkCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |






<a name="opi_api-storage-v1-VirtioBlkCreateResponse"></a>

### VirtioBlkCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioBlkDeleteRequest"></a>

### VirtioBlkDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkDeleteResponse"></a>

### VirtioBlkDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioBlkGetRequest"></a>

### VirtioBlkGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkGetResponse"></a>

### VirtioBlkGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |






<a name="opi_api-storage-v1-VirtioBlkListRequest"></a>

### VirtioBlkListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkListResponse"></a>

### VirtioBlkListResponse







<a name="opi_api-storage-v1-VirtioBlkStatsRequest"></a>

### VirtioBlkStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkStatsResponse"></a>

### VirtioBlkStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioBlkUpdateRequest"></a>

### VirtioBlkUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |






<a name="opi_api-storage-v1-VirtioBlkUpdateResponse"></a>

### VirtioBlkUpdateResponse
Intentionally empty.





 

 

 


<a name="opi_api-storage-v1-VirtioBlkService"></a>

### VirtioBlkService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| VirtioBlkCreate | [VirtioBlkCreateRequest](#opi_api-storage-v1-VirtioBlkCreateRequest) | [VirtioBlkCreateResponse](#opi_api-storage-v1-VirtioBlkCreateResponse) |  |
| VirtioBlkDelete | [VirtioBlkDeleteRequest](#opi_api-storage-v1-VirtioBlkDeleteRequest) | [VirtioBlkDeleteResponse](#opi_api-storage-v1-VirtioBlkDeleteResponse) |  |
| VirtioBlkUpdate | [VirtioBlkUpdateRequest](#opi_api-storage-v1-VirtioBlkUpdateRequest) | [VirtioBlkUpdateResponse](#opi_api-storage-v1-VirtioBlkUpdateResponse) |  |
| VirtioBlkList | [VirtioBlkListRequest](#opi_api-storage-v1-VirtioBlkListRequest) | [VirtioBlkListResponse](#opi_api-storage-v1-VirtioBlkListResponse) |  |
| VirtioBlkGet | [VirtioBlkGetRequest](#opi_api-storage-v1-VirtioBlkGetRequest) | [VirtioBlkGetResponse](#opi_api-storage-v1-VirtioBlkGetResponse) |  |
| VirtioBlkStats | [VirtioBlkStatsRequest](#opi_api-storage-v1-VirtioBlkStatsRequest) | [VirtioBlkStatsResponse](#opi_api-storage-v1-VirtioBlkStatsResponse) |  |

 



<a name="frontend_virtio_fs-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_fs.proto


 

 

 

 



<a name="frontend_virtio_scsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_scsi.proto



<a name="opi_api-storage-v1-VirtioScsiController"></a>

### VirtioScsiController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| pcie_id | [NvmeControllerPciId](#opi_api-storage-v1-NvmeControllerPciId) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerCreateRequest"></a>

### VirtioScsiControllerCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerCreateResponse"></a>

### VirtioScsiControllerCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiControllerDeleteRequest"></a>

### VirtioScsiControllerDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerDeleteResponse"></a>

### VirtioScsiControllerDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiControllerGetRequest"></a>

### VirtioScsiControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerGetResponse"></a>

### VirtioScsiControllerGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerListRequest"></a>

### VirtioScsiControllerListRequest
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiControllerListResponse"></a>

### VirtioScsiControllerListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | repeated |  |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsRequest"></a>

### VirtioScsiControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsResponse"></a>

### VirtioScsiControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerUpdateRequest"></a>

### VirtioScsiControllerUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerUpdateResponse"></a>

### VirtioScsiControllerUpdateResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiLun"></a>

### VirtioScsiLun



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |
| bdev | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunCreateRequest"></a>

### VirtioScsiLunCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunCreateResponse"></a>

### VirtioScsiLunCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiLunDeleteRequest"></a>

### VirtioScsiLunDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |
| lun_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunDeleteResponse"></a>

### VirtioScsiLunDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiLunGetRequest"></a>

### VirtioScsiLunGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |
| lun_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunGetResponse"></a>

### VirtioScsiLunGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunListRequest"></a>

### VirtioScsiLunListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunListResponse"></a>

### VirtioScsiLunListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | repeated |  |






<a name="opi_api-storage-v1-VirtioScsiLunStatsRequest"></a>

### VirtioScsiLunStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |
| lun_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunStatsResponse"></a>

### VirtioScsiLunStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunUpdateRequest"></a>

### VirtioScsiLunUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunUpdateResponse"></a>

### VirtioScsiLunUpdateResponse
Intentionally empty.





 

 

 


<a name="opi_api-storage-v1-VirtioScsiControllerService"></a>

### VirtioScsiControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| VirtioScsiControllerCreate | [VirtioScsiControllerCreateRequest](#opi_api-storage-v1-VirtioScsiControllerCreateRequest) | [VirtioScsiControllerCreateResponse](#opi_api-storage-v1-VirtioScsiControllerCreateResponse) |  |
| VirtioScsiControllerDelete | [VirtioScsiControllerDeleteRequest](#opi_api-storage-v1-VirtioScsiControllerDeleteRequest) | [VirtioScsiControllerDeleteResponse](#opi_api-storage-v1-VirtioScsiControllerDeleteResponse) |  |
| VirtioScsiControllerUpdate | [VirtioScsiControllerUpdateRequest](#opi_api-storage-v1-VirtioScsiControllerUpdateRequest) | [VirtioScsiControllerUpdateResponse](#opi_api-storage-v1-VirtioScsiControllerUpdateResponse) |  |
| VirtioScsiControllerList | [VirtioScsiControllerListRequest](#opi_api-storage-v1-VirtioScsiControllerListRequest) | [VirtioScsiControllerListResponse](#opi_api-storage-v1-VirtioScsiControllerListResponse) |  |
| VirtioScsiControllerGet | [VirtioScsiControllerGetRequest](#opi_api-storage-v1-VirtioScsiControllerGetRequest) | [VirtioScsiControllerGetResponse](#opi_api-storage-v1-VirtioScsiControllerGetResponse) |  |
| VirtioScsiControllerStats | [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest) | [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse) |  |


<a name="opi_api-storage-v1-VirtioScsiLunService"></a>

### VirtioScsiLunService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| VirtioScsiLunCreate | [VirtioScsiLunCreateRequest](#opi_api-storage-v1-VirtioScsiLunCreateRequest) | [VirtioScsiLunCreateResponse](#opi_api-storage-v1-VirtioScsiLunCreateResponse) |  |
| VirtioScsiLunDelete | [VirtioScsiLunDeleteRequest](#opi_api-storage-v1-VirtioScsiLunDeleteRequest) | [VirtioScsiLunDeleteResponse](#opi_api-storage-v1-VirtioScsiLunDeleteResponse) |  |
| VirtioScsiLunUpdate | [VirtioScsiLunUpdateRequest](#opi_api-storage-v1-VirtioScsiLunUpdateRequest) | [VirtioScsiLunUpdateResponse](#opi_api-storage-v1-VirtioScsiLunUpdateResponse) |  |
| VirtioScsiLunList | [VirtioScsiLunListRequest](#opi_api-storage-v1-VirtioScsiLunListRequest) | [VirtioScsiLunListResponse](#opi_api-storage-v1-VirtioScsiLunListResponse) |  |
| VirtioScsiLunGet | [VirtioScsiLunGetRequest](#opi_api-storage-v1-VirtioScsiLunGetRequest) | [VirtioScsiLunGetResponse](#opi_api-storage-v1-VirtioScsiLunGetResponse) |  |
| VirtioScsiLunStats | [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest) | [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse) |  |

 



<a name="ipsec-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ipsec.proto
Copyright (C) 2021 Intel Corporation
SPDX-License-Identifier: Apache-2.0

Major pieces taken from:
https://github.com/ligato/cn-infra/blob/master/examples/cryptodata-proto-plugin/ipsec/ipsec.proto


<a name="opi_api-security-v1-Addrs"></a>

### Addrs
IP addresses or hostanmes


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addr | [string](#string) |  |  |






<a name="opi_api-security-v1-CaCerts"></a>

### CaCerts



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cacert | [string](#string) | repeated |  |






<a name="opi_api-security-v1-CertPolicy"></a>

### CertPolicy



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cert_policy | [string](#string) | repeated |  |






<a name="opi_api-security-v1-Certs"></a>

### Certs



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cert | [string](#string) | repeated |  |






<a name="opi_api-security-v1-Child"></a>

### Child
Child SA


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Child SA name |
| ag_proposals | [Proposals](#opi_api-security-v1-Proposals) |  |  |
| esp_proposals | [Proposals](#opi_api-security-v1-Proposals) |  |  |
| local_ts | [TrafficSelectors](#opi_api-security-v1-TrafficSelectors) |  |  |
| remote_ts | [TrafficSelectors](#opi_api-security-v1-TrafficSelectors) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| life_time | [uint32](#uint32) |  |  |
| rand_time | [uint32](#uint32) |  |  |
| updown | [string](#string) |  |  |
| inactivity | [uint32](#uint32) |  |  |
| mark_in | [uint32](#uint32) |  |  |
| mark_in_sa | [string](#string) |  |  |
| mark_out | [uint32](#uint32) |  |  |
| set_mark_in | [uint32](#uint32) |  |  |
| set_mark_out | [uint32](#uint32) |  |  |
| hw_offload | [string](#string) |  |  |






<a name="opi_api-security-v1-Connection"></a>

### Connection
IKE connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | connection name |
| version | [string](#string) |  |  |
| local_addrs | [Addrs](#opi_api-security-v1-Addrs) | repeated |  |
| remote_addrs | [Addrs](#opi_api-security-v1-Addrs) | repeated |  |
| local_port | [uint32](#uint32) |  |  |
| remote_port | [uint32](#uint32) |  |  |
| proposals | [Proposals](#opi_api-security-v1-Proposals) |  |  |
| vips | [Vips](#opi_api-security-v1-Vips) |  |  |
| dscp | [uint64](#uint64) |  | We use only the lower 6 bytes |
| encap | [string](#string) |  |  |
| mobike | [string](#string) |  |  |
| dpd_delay | [uint32](#uint32) |  |  |
| dpd_timeout | [uint32](#uint32) |  |  |
| reauth_time | [uint32](#uint32) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| pools | [Pools](#opi_api-security-v1-Pools) |  |  |
| local_auth | [LocalAuth](#opi_api-security-v1-LocalAuth) |  |  |
| remote_auth | [RemoteAuth](#opi_api-security-v1-RemoteAuth) |  |  |
| children | [Child](#opi_api-security-v1-Child) | repeated |  |






<a name="opi_api-security-v1-Groups"></a>

### Groups



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [string](#string) | repeated |  |






<a name="opi_api-security-v1-IPsecInitiateReq"></a>

### IPsecInitiateReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| timeout | [string](#string) |  |  |
| loglevel | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecInitiateResp"></a>

### IPsecInitiateResp
Intentionally empty






<a name="opi_api-security-v1-IPsecListCertsReq"></a>

### IPsecListCertsReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| flag | [string](#string) |  |  |
| subject | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecListCertsResp"></a>

### IPsecListCertsResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| certs | [ListCert](#opi_api-security-v1-ListCert) | repeated |  |






<a name="opi_api-security-v1-IPsecListConnsReq"></a>

### IPsecListConnsReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecListConnsResp"></a>

### IPsecListConnsResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [ListConnResp](#opi_api-security-v1-ListConnResp) | repeated |  |






<a name="opi_api-security-v1-IPsecListSasReq"></a>

### IPsecListSasReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| noblock | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| ike_id | [uint64](#uint64) |  |  |
| child | [string](#string) |  |  |
| child_id | [uint64](#uint64) |  |  |






<a name="opi_api-security-v1-IPsecListSasResp"></a>

### IPsecListSasResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ikesas | [ListIkeSa](#opi_api-security-v1-ListIkeSa) | repeated |  |






<a name="opi_api-security-v1-IPsecLoadConnReq"></a>

### IPsecLoadConnReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [Connection](#opi_api-security-v1-Connection) |  |  |






<a name="opi_api-security-v1-IPsecLoadConnResp"></a>

### IPsecLoadConnResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecRekeyReq"></a>

### IPsecRekeyReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| child_id | [uint64](#uint64) |  |  |
| ike_id | [uint64](#uint64) |  |  |
| reauth | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecRekeyResp"></a>

### IPsecRekeyResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |
| matches | [uint32](#uint32) |  |  |






<a name="opi_api-security-v1-IPsecStatsReq"></a>

### IPsecStatsReq
Intentionally empty






<a name="opi_api-security-v1-IPsecStatsResp"></a>

### IPsecStatsResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [string](#string) |  | Generic status string for now |






<a name="opi_api-security-v1-IPsecTerminateReq"></a>

### IPsecTerminateReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| child_id | [uint64](#uint64) |  |  |
| ike_id | [uint64](#uint64) |  |  |
| force | [string](#string) |  |  |
| timeout | [string](#string) |  |  |
| loglevel | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecTerminateResp"></a>

### IPsecTerminateResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |
| matches | [uint32](#uint32) |  |  |
| terminated | [uint32](#uint32) |  |  |






<a name="opi_api-security-v1-IPsecUnloadConnReq"></a>

### IPsecUnloadConnReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecUnloadConnResp"></a>

### IPsecUnloadConnResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecVersionReq"></a>

### IPsecVersionReq
Intentionally empty






<a name="opi_api-security-v1-IPsecVersionResp"></a>

### IPsecVersionResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| daemon | [string](#string) |  |  |
| version | [string](#string) |  |  |
| sysname | [string](#string) |  |  |
| release | [string](#string) |  |  |
| machine | [string](#string) |  |  |






<a name="opi_api-security-v1-ListCert"></a>

### ListCert
list-cert


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [CertificateType](#opi_api-security-v1-CertificateType) |  |  |
| flag | [X509CertificateFlag](#opi_api-security-v1-X509CertificateFlag) |  |  |
| hasprivkey | [string](#string) |  |  |
| data | [string](#string) |  |  |
| subject | [string](#string) |  |  |
| notbefore | [string](#string) |  |  |
| notafter | [string](#string) |  |  |






<a name="opi_api-security-v1-ListChild"></a>

### ListChild



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Child SA name |
| mode | [string](#string) |  |  |
| label | [string](#string) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| rekey_bytes | [uint32](#uint32) |  |  |
| rekey_packets | [uint32](#uint32) |  |  |
| dpd_action | [string](#string) |  |  |
| close_action | [string](#string) |  |  |
| local_ts | [TrafficSelectors](#opi_api-security-v1-TrafficSelectors) |  |  |
| remote_ts | [TrafficSelectors](#opi_api-security-v1-TrafficSelectors) |  |  |
| interface | [string](#string) |  |  |
| priority | [string](#string) |  |  |






<a name="opi_api-security-v1-ListChildSa"></a>

### ListChildSa



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| protocol | [string](#string) |  |  |
| encap | [string](#string) |  |  |
| spi_in | [string](#string) |  |  |
| spi_out | [string](#string) |  |  |
| cpi_in | [string](#string) |  |  |
| cpi_out | [string](#string) |  |  |
| mark_in | [string](#string) |  |  |
| mark_mask_in | [string](#string) |  |  |
| mark_out | [string](#string) |  |  |
| mark_mask_out | [string](#string) |  |  |
| if_id_in | [string](#string) |  |  |
| if_id_out | [string](#string) |  |  |
| encr_alg | [string](#string) |  |  |
| encr_keysize | [string](#string) |  |  |
| integ_alg | [string](#string) |  |  |
| integ_keysize | [string](#string) |  |  |
| dh_group | [string](#string) |  |  |
| esn | [string](#string) |  |  |






<a name="opi_api-security-v1-ListConnAuth"></a>

### ListConnAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| class | [string](#string) |  |  |
| eaptype | [string](#string) |  |  |
| eapvendor | [string](#string) |  |  |
| xauth | [string](#string) |  |  |
| revocation | [string](#string) |  |  |
| id | [string](#string) |  |  |
| ca_id | [string](#string) |  |  |
| aaa_id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| xauth_id | [string](#string) |  |  |
| group | [Groups](#opi_api-security-v1-Groups) |  |  |
| cert_policy | [CertPolicy](#opi_api-security-v1-CertPolicy) |  |  |
| certs | [Certs](#opi_api-security-v1-Certs) |  |  |
| cacerts | [CaCerts](#opi_api-security-v1-CaCerts) |  |  |






<a name="opi_api-security-v1-ListConnResp"></a>

### ListConnResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Connection name |
| local_addrs | [Addrs](#opi_api-security-v1-Addrs) | repeated |  |
| remote_addrs | [Addrs](#opi_api-security-v1-Addrs) | repeated |  |
| version | [string](#string) |  |  |
| reauth_time | [uint32](#uint32) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| unique | [string](#string) |  |  |
| dpd_delay | [uint32](#uint32) |  |  |
| dpd_timeout | [uint32](#uint32) |  |  |
| ppk | [string](#string) |  |  |
| ppk_required | [string](#string) |  |  |
| local_auth | [ListConnAuth](#opi_api-security-v1-ListConnAuth) | repeated |  |
| remote_auth | [ListConnAuth](#opi_api-security-v1-ListConnAuth) | repeated |  |
| children | [ListChild](#opi_api-security-v1-ListChild) | repeated |  |






<a name="opi_api-security-v1-ListIkeSa"></a>

### ListIkeSa



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | IKE_SA name |
| uniqueid | [string](#string) |  |  |
| version | [string](#string) |  |  |
| ikestate | [IkeSaState](#opi_api-security-v1-IkeSaState) |  |  |
| local_host | [string](#string) |  |  |
| local_port | [string](#string) |  |  |
| local_id | [string](#string) |  |  |
| remote_host | [string](#string) |  |  |
| remote_port | [string](#string) |  |  |
| remote_id | [string](#string) |  |  |
| remote_xauth_id | [string](#string) |  |  |
| remote_eap_id | [string](#string) |  |  |
| initiator | [string](#string) |  |  |
| initiator_spi | [string](#string) |  |  |
| responder_spi | [string](#string) |  |  |
| nat_local | [string](#string) |  |  |
| nat_remote | [string](#string) |  |  |
| nat_fake | [string](#string) |  |  |
| nat_any | [string](#string) |  |  |
| if_id_in | [string](#string) |  |  |
| if_id_out | [string](#string) |  |  |
| encr_alg | [string](#string) |  |  |
| encr_keysize | [string](#string) |  |  |
| integ_alg | [string](#string) |  |  |
| integ_keysize | [string](#string) |  |  |
| prf_alg | [string](#string) |  |  |
| dh_group | [string](#string) |  |  |
| ppk | [string](#string) |  |  |
| established | [string](#string) |  |  |
| rekey_time | [string](#string) |  |  |
| reauth_time | [string](#string) |  |  |
| local_vips | [string](#string) | repeated |  |
| remote_vips | [string](#string) | repeated |  |
| tasks_queued | [string](#string) | repeated |  |
| tasks_active | [string](#string) | repeated |  |
| tasks_passive | [string](#string) | repeated |  |
| childsas | [ListChildSa](#opi_api-security-v1-ListChildSa) | repeated |  |






<a name="opi_api-security-v1-LocalAuth"></a>

### LocalAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth | [AuthType](#opi_api-security-v1-AuthType) |  |  |
| id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| aaa_id | [string](#string) |  |  |
| xauth_id | [string](#string) |  |  |
| certs | [Certs](#opi_api-security-v1-Certs) |  |  |
| pubkeys | [PubKeys](#opi_api-security-v1-PubKeys) |  |  |






<a name="opi_api-security-v1-Pools"></a>

### Pools



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pool | [string](#string) | repeated |  |






<a name="opi_api-security-v1-Proposals"></a>

### Proposals



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| crypto_alg | [CryptoAlgorithm](#opi_api-security-v1-CryptoAlgorithm) | repeated |  |
| integ_alg | [IntegAlgorithm](#opi_api-security-v1-IntegAlgorithm) | repeated |  |
| prf | [PseudoRandomFunction](#opi_api-security-v1-PseudoRandomFunction) | repeated |  |
| dhgroups | [DiffieHellmanGroups](#opi_api-security-v1-DiffieHellmanGroups) | repeated |  |






<a name="opi_api-security-v1-PubKeys"></a>

### PubKeys



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pubkey | [string](#string) | repeated |  |






<a name="opi_api-security-v1-RemoteAuth"></a>

### RemoteAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth | [AuthType](#opi_api-security-v1-AuthType) |  |  |
| id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| groups | [Groups](#opi_api-security-v1-Groups) |  |  |
| cert_policy | [CertPolicy](#opi_api-security-v1-CertPolicy) |  |  |
| certs | [Certs](#opi_api-security-v1-Certs) |  |  |
| ca_certs | [CaCerts](#opi_api-security-v1-CaCerts) |  |  |
| pubkeys | [PubKeys](#opi_api-security-v1-PubKeys) |  |  |






<a name="opi_api-security-v1-TrafficSelectors"></a>

### TrafficSelectors



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ts | [TrafficSelectors.TrafficSelector](#opi_api-security-v1-TrafficSelectors-TrafficSelector) | repeated |  |






<a name="opi_api-security-v1-TrafficSelectors-TrafficSelector"></a>

### TrafficSelectors.TrafficSelector



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cidr | [string](#string) |  |  |
| proto | [string](#string) |  |  |
| port | [string](#string) |  |  |






<a name="opi_api-security-v1-Vips"></a>

### Vips



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vip | [string](#string) | repeated |  |





 


<a name="opi_api-security-v1-AuthType"></a>

### AuthType
Authentication Type

| Name | Number | Description |
| ---- | ------ | ----------- |
| PUBKEY | 0 |  |
| PSK | 1 |  |
| XAUTH | 2 |  |
| EAP | 3 |  |



<a name="opi_api-security-v1-CertificateType"></a>

### CertificateType
Certificate type

| Name | Number | Description |
| ---- | ------ | ----------- |
| CERT_X509 | 0 |  |
| CERT_X509_AC | 1 |  |
| CERT_X509_CRL | 2 |  |
| CERT_OCSP_RESPONSE | 3 |  |
| CERT_PUBKEY | 4 |  |



<a name="opi_api-security-v1-ChildSaState"></a>

### ChildSaState
CHILD_SA state

| Name | Number | Description |
| ---- | ------ | ----------- |
| CHILD_CREATED | 0 |  |
| CHILD_ROUTED | 1 |  |
| CHILD_INSTALLING | 2 |  |
| CHILD_INSTALLED | 3 |  |
| CHILD_UPDATING | 4 |  |
| CHILD_REKEYING | 5 |  |
| CHILD_REKEYED | 6 |  |
| CHILD_RETRYING | 7 |  |
| CHILD_DELETING | 8 |  |
| CHILD_DELETED | 9 |  |
| CHILD_DESTROYING | 10 |  |



<a name="opi_api-security-v1-CryptoAlgorithm"></a>

### CryptoAlgorithm
Cryptographic algorithm for encryption

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_CRYPTO | 0 |  |
| AES128 | 1 |  |
| AES192 | 2 |  |
| AES256 | 3 |  |
| AES128GCM128 | 4 |  |
| AES256GCM128 | 5 |  |
| AES128GMAC | 6 |  |
| AES256GMAC | 7 |  |



<a name="opi_api-security-v1-DiffieHellmanGroups"></a>

### DiffieHellmanGroups
Diffie Hellman Groups

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_DH_GROUP | 0 |  |
| MODP768 | 1 |  |
| MODP1024 | 2 |  |
| MODP1536 | 3 |  |
| MODP2048 | 4 |  |
| MODP3072 | 5 |  |
| MODP4096 | 6 |  |
| MODP6144 | 7 |  |
| MODP8192 | 8 |  |
| MODP1024S160 | 9 |  |
| MODP2048S224 | 10 |  |
| MODP2048S256 | 11 |  |
| CURVE25519 | 12 |  |



<a name="opi_api-security-v1-IPsecMode"></a>

### IPsecMode
Tunnel mode

| Name | Number | Description |
| ---- | ------ | ----------- |
| TUNNEL_MODE | 0 |  |
| TRANSPORT_MODE | 1 |  |



<a name="opi_api-security-v1-IkeSaState"></a>

### IkeSaState
IKE_SA state

| Name | Number | Description |
| ---- | ------ | ----------- |
| CREATED | 0 |  |
| CONNECTING | 1 |  |
| ESTABLISHED | 2 |  |
| PASSIVE | 3 |  |
| REKEYING | 4 |  |
| REKEYED | 5 |  |
| DELETING | 6 |  |
| DESTROYING | 7 |  |



<a name="opi_api-security-v1-IntegAlgorithm"></a>

### IntegAlgorithm
Cryptographic algorithm for authentication

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_INTEG | 0 |  |
| MD5 | 1 |  |
| MD5_128 | 2 |  |
| SHA1 | 3 |  |
| SHA1_160 | 4 |  |
| SHA256 | 5 |  |
| SHA384 | 7 |  |
| SHA512 | 8 |  |
| SHA256_96 | 9 |  |



<a name="opi_api-security-v1-PseudoRandomFunction"></a>

### PseudoRandomFunction


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_PRF | 0 |  |
| PRFMD5 | 1 |  |
| PRFSHA1 | 2 |  |
| PRFAESXCBC | 3 |  |
| PRFAESCMAC | 4 |  |
| PRFSHA256 | 5 |  |
| PRFSHA384 | 6 |  |
| PRFSHA512 | 7 |  |



<a name="opi_api-security-v1-X509CertificateFlag"></a>

### X509CertificateFlag
X.509 certificate flag

| Name | Number | Description |
| ---- | ------ | ----------- |
| X509_CERT_FLAG_NONE | 0 |  |
| X509_CERT_FLAG_CA | 1 |  |
| X509_CERT_FLAG_AA | 2 |  |
| X509_CERT_FLAG_OCSP | 3 |  |


 

 


<a name="opi_api-security-v1-IPsec"></a>

### IPsec


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| IPsecVersion | [IPsecVersionReq](#opi_api-security-v1-IPsecVersionReq) | [IPsecVersionResp](#opi_api-security-v1-IPsecVersionResp) |  |
| IPsecStats | [IPsecStatsReq](#opi_api-security-v1-IPsecStatsReq) | [IPsecStatsResp](#opi_api-security-v1-IPsecStatsResp) |  |
| IPsecInitiate | [IPsecInitiateReq](#opi_api-security-v1-IPsecInitiateReq) | [IPsecInitiateResp](#opi_api-security-v1-IPsecInitiateResp) |  |
| IPsecTerminate | [IPsecTerminateReq](#opi_api-security-v1-IPsecTerminateReq) | [IPsecTerminateResp](#opi_api-security-v1-IPsecTerminateResp) |  |
| IPsecRekey | [IPsecRekeyReq](#opi_api-security-v1-IPsecRekeyReq) | [IPsecRekeyResp](#opi_api-security-v1-IPsecRekeyResp) |  |
| IPsecListSas | [IPsecListSasReq](#opi_api-security-v1-IPsecListSasReq) | [IPsecListSasResp](#opi_api-security-v1-IPsecListSasResp) |  |
| IPsecListConns | [IPsecListConnsReq](#opi_api-security-v1-IPsecListConnsReq) | [IPsecListConnsResp](#opi_api-security-v1-IPsecListConnsResp) |  |
| IPsecListCerts | [IPsecListCertsReq](#opi_api-security-v1-IPsecListCertsReq) | [IPsecListCertsResp](#opi_api-security-v1-IPsecListCertsResp) |  |
| IPsecLoadConn | [IPsecLoadConnReq](#opi_api-security-v1-IPsecLoadConnReq) | [IPsecLoadConnResp](#opi_api-security-v1-IPsecLoadConnResp) |  |
| IPsecUnloadConn | [IPsecUnloadConnReq](#opi_api-security-v1-IPsecUnloadConnReq) | [IPsecUnloadConnResp](#opi_api-security-v1-IPsecUnloadConnResp) |  |

 



<a name="middleend-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend.proto


 

 

 

 



<a name="object_key-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## object_key.proto



<a name="opi_api-common-v1-ObjectKey"></a>

### ObjectKey
Object Keys are opaque values. The object key uniquely
identifies a given configuration object. The key used must be unique within
the agent&#39;s context for the give object type and must be non-zero. No other
restrictions apply on the usage of the key.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  | The value of the ObjectKey |





 

 

 

 



<a name="oc_interfaces-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## oc_interfaces.proto
openconfig-interfaces.proto file
Derived from the OpenConfig interfaces model github.com/openconfig/public/release/models/interfaces


<a name="opi_api-network-v1-Interface"></a>

### Interface
Main Data Structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| config | [Interface.Config](#opi_api-network-v1-Interface-Config) |  |  |
| state | [Interface.State](#opi_api-network-v1-Interface-State) |  |  |
| holdtime | [Interface.HoldTime](#opi_api-network-v1-Interface-HoldTime) |  |  |
| subinterfaces | [Interface.Subinterfaces](#opi_api-network-v1-Interface-Subinterfaces) |  |  |






<a name="opi_api-network-v1-Interface-Config"></a>

### Interface.Config



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| type | [InterfaceType](#opi_api-network-v1-InterfaceType) |  |  |
| mtu | [uint32](#uint32) |  |  |
| loopback_mode | [bool](#bool) |  |  |
| description | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |






<a name="opi_api-network-v1-Interface-HoldTime"></a>

### Interface.HoldTime



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [Interface.HoldTime.Config](#opi_api-network-v1-Interface-HoldTime-Config) |  |  |
| state | [Interface.HoldTime.State](#opi_api-network-v1-Interface-HoldTime-State) |  |  |






<a name="opi_api-network-v1-Interface-HoldTime-Config"></a>

### Interface.HoldTime.Config



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| up | [uint32](#uint32) |  |  |
| down | [uint32](#uint32) |  |  |






<a name="opi_api-network-v1-Interface-HoldTime-State"></a>

### Interface.HoldTime.State



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| up | [uint32](#uint32) |  |  |
| down | [uint32](#uint32) |  |  |






<a name="opi_api-network-v1-Interface-State"></a>

### Interface.State



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| type | [InterfaceType](#opi_api-network-v1-InterfaceType) |  |  |
| mtu | [uint32](#uint32) |  |  |
| loopback_mode | [bool](#bool) |  |  |
| description | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |
| ifindex | [uint32](#uint32) |  |  |
| admin_status | [InterfaceState](#opi_api-network-v1-InterfaceState) |  |  |
| oper_status | [InterfaceState](#opi_api-network-v1-InterfaceState) |  |  |
| last_change | [uint64](#uint64) |  |  |
| logical | [bool](#bool) |  |  |
| management | [bool](#bool) |  |  |
| cpu | [bool](#bool) |  |  |
| counters | [Interface.State.Counters](#opi_api-network-v1-Interface-State-Counters) |  |  |






<a name="opi_api-network-v1-Interface-State-Counters"></a>

### Interface.State.Counters



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| in_octets | [uint64](#uint64) |  |  |
| in_packets | [uint64](#uint64) |  |  |
| in_unicast_pkts | [uint64](#uint64) |  |  |
| in_broadcast_pkts | [uint64](#uint64) |  |  |
| in_multicast_pkts | [uint64](#uint64) |  |  |
| in_discards | [uint64](#uint64) |  |  |
| in_errors | [uint64](#uint64) |  |  |
| in_unknown_protos | [uint64](#uint64) |  |  |
| in_fcs_errors | [uint64](#uint64) |  |  |
| out_octets | [uint64](#uint64) |  |  |
| out_packets | [uint64](#uint64) |  |  |
| out_unicast_pkts | [uint64](#uint64) |  |  |
| out_broadcast_pkts | [uint64](#uint64) |  |  |
| out_multicast_pkts | [uint64](#uint64) |  |  |
| out_discards | [uint64](#uint64) |  |  |
| out_errors | [uint64](#uint64) |  |  |
| carrier_transitions | [uint64](#uint64) |  |  |
| last_clear | [uint64](#uint64) |  |  |






<a name="opi_api-network-v1-Interface-Subinterfaces"></a>

### Interface.Subinterfaces



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subinterface | [Interface.Subinterfaces.Subinterface](#opi_api-network-v1-Interface-Subinterfaces-Subinterface) | repeated |  |






<a name="opi_api-network-v1-Interface-Subinterfaces-Subinterface"></a>

### Interface.Subinterfaces.Subinterface



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| config | [Interface.Subinterfaces.Subinterface.Config](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-Config) |  |  |
| state | [Interface.Subinterfaces.Subinterface.State](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-State) |  |  |






<a name="opi_api-network-v1-Interface-Subinterfaces-Subinterface-Config"></a>

### Interface.Subinterfaces.Subinterface.Config



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| description | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |






<a name="opi_api-network-v1-Interface-Subinterfaces-Subinterface-State"></a>

### Interface.Subinterfaces.Subinterface.State



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint32](#uint32) |  |  |
| description | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |
| name | [string](#string) |  |  |
| ifindex | [uint32](#uint32) |  |  |
| admin_status | [InterfaceState](#opi_api-network-v1-InterfaceState) |  |  |
| oper_status | [InterfaceState](#opi_api-network-v1-InterfaceState) |  |  |
| last_change | [uint64](#uint64) |  |  |
| logical | [bool](#bool) |  |  |
| management | [bool](#bool) |  |  |
| cpu | [bool](#bool) |  |  |
| counters | [Interface.Subinterfaces.Subinterface.State.Counters](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-State-Counters) |  |  |






<a name="opi_api-network-v1-Interface-Subinterfaces-Subinterface-State-Counters"></a>

### Interface.Subinterfaces.Subinterface.State.Counters



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| in_octets | [uint64](#uint64) |  |  |
| in_packets | [uint64](#uint64) |  |  |
| in_unicast_pkts | [uint64](#uint64) |  |  |
| in_broadcast_pkts | [uint64](#uint64) |  |  |
| in_multicast_pkts | [uint64](#uint64) |  |  |
| in_discards | [uint64](#uint64) |  |  |
| in_errors | [uint64](#uint64) |  |  |
| in_unknown_protos | [uint64](#uint64) |  |  |
| in_fcs_errors | [uint64](#uint64) |  |  |
| out_octets | [uint64](#uint64) |  |  |
| out_packets | [uint64](#uint64) |  |  |
| out_unicast_pkts | [uint64](#uint64) |  |  |
| out_broadcast_pkts | [uint64](#uint64) |  |  |
| out_multicast_pkts | [uint64](#uint64) |  |  |
| out_discards | [uint64](#uint64) |  |  |
| out_errors | [uint64](#uint64) |  |  |
| carrier_transitions | [uint64](#uint64) |  |  |
| last_clear | [uint64](#uint64) |  |  |






<a name="opi_api-network-v1-Interfaces"></a>

### Interfaces



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-v1-Interface) | repeated |  |






<a name="opi_api-network-v1-NetInterfaceGetRequest"></a>

### NetInterfaceGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-network-v1-NetInterfaceGetResponse"></a>

### NetInterfaceGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-v1-Interface) |  |  |






<a name="opi_api-network-v1-NetInterfaceListRequest"></a>

### NetInterfaceListRequest
empty






<a name="opi_api-network-v1-NetInterfaceListResponse"></a>

### NetInterfaceListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-v1-Interface) | repeated |  |






<a name="opi_api-network-v1-NetInterfaceUpdateRequest"></a>

### NetInterfaceUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-v1-Interface) |  |  |






<a name="opi_api-network-v1-NetInterfaceUpdateResponse"></a>

### NetInterfaceUpdateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| result | [uint32](#uint32) |  |  |





 


<a name="opi_api-network-v1-InterfaceState"></a>

### InterfaceState


| Name | Number | Description |
| ---- | ------ | ----------- |
| DOWN | 0 |  |
| UP | 1 |  |



<a name="opi_api-network-v1-InterfaceType"></a>

### InterfaceType
Data Types

| Name | Number | Description |
| ---- | ------ | ----------- |
| ETHERNET | 0 |  |
| LOOPBACK | 1 |  |


 

 


<a name="opi_api-network-v1-NetInterface"></a>

### NetInterface
Service functions for Network Interface exported by the server

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NetInterfaceGet | [NetInterfaceGetRequest](#opi_api-network-v1-NetInterfaceGetRequest) | [NetInterfaceGetResponse](#opi_api-network-v1-NetInterfaceGetResponse) | Retrieves the interface information for a given interface |
| NetInterfaceList | [NetInterfaceListRequest](#opi_api-network-v1-NetInterfaceListRequest) | [NetInterfaceListResponse](#opi_api-network-v1-NetInterfaceListResponse) | Retrieves the set of interfaces on the device |
| NetInterfaceUpdate | [NetInterfaceUpdateRequest](#opi_api-network-v1-NetInterfaceUpdateRequest) | [NetInterfaceUpdateResponse](#opi_api-network-v1-NetInterfaceUpdateResponse) | A method for setting or changing configuration of an interface |

 



<a name="openoffload-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## openoffload.proto



<a name="opi_api-security-firewall-v1-ActionParameters"></a>

### ActionParameters
MIRROR and SNOOP require an actionNextHop
DROP and FORWARD do not have an actionNextHop
The IPV4 nextHop definition maps to the V4 struct returned by inet_pton which is a uint32_t.
The IPV6 nextHop definition maps to the V6 struct returned by inet_ptoN which is a uint8_t s6_addr[16]
PROXY require a src/dst IPv4 or IPv6 address to be set
In the case of a QUIC proxy, srcconnid and dstconnid are also required
proxysrcv4 and proxydstv4 maps to the V5 struct returned by inet_pton which is a uint32_t.
proxysrcv6 and proxydstv6 maps tothe V6 struct returned by inet_ptoN which is a uint8_t s6_addr[16]
srcconnid maps to the raw bytes of the source QUIC connection ID
dstconnid maps to the raw bytes of the destination QUIC connection ID


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| actiontype | [ActionType](#opi_api-security-firewall-v1-ActionType) |  |  |
| actionnexthop | [uint32](#uint32) |  |  |
| actionnexthopv6 | [bytes](#bytes) |  |  |
| proxysrcv4 | [uint32](#uint32) |  |  |
| proxydstv4 | [uint32](#uint32) |  |  |
| proxysrcv6 | [bytes](#bytes) |  |  |
| proxydstv6 | [bytes](#bytes) |  |  |
| srcconnid | [bytes](#bytes) |  |  |
| dstconnid | [bytes](#bytes) |  |  |






<a name="opi_api-security-firewall-v1-AddSessionResponse"></a>

### AddSessionResponse
In v1apha4 the errorstatus was added to act as a bitmask
of errors for each of the sesssions sent in a stream (max 64).


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| requeststatus | [AddSessionStatus](#opi_api-security-firewall-v1-AddSessionStatus) |  |  |
| errorstatus | [uint64](#uint64) |  |  |
| starttime | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |
| responseerror | [SessionResponseError](#opi_api-security-firewall-v1-SessionResponseError) | repeated |  |






<a name="opi_api-security-firewall-v1-SessionId"></a>

### SessionId
should the Application assign the sessionID on AddSession and avoid conflicts
or have the applications have a mechanism to avoid duplicate sessionIDs across 
applications since there will be many applications instances to 1 switch


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [uint64](#uint64) |  |  |






<a name="opi_api-security-firewall-v1-SessionRequest"></a>

### SessionRequest
SessionId is generated by client and passed in via gRPC call
The IPV4 definition maps to the V4 struct returned by inet_pton which is a uint32_t.
The IPV6 definition maps to the V6 struct returned by inet_ptoN which is a uint8_t s6_addr[16]


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |
| inlif | [int32](#int32) |  |  |
| outlif | [int32](#int32) |  |  |
| ipversion | [IpVersion](#opi_api-security-firewall-v1-IpVersion) |  |  |
| sourceip | [uint32](#uint32) |  |  |
| sourceipv6 | [bytes](#bytes) |  |  |
| sourceport | [uint32](#uint32) |  |  |
| destinationip | [uint32](#uint32) |  |  |
| destinationipv6 | [bytes](#bytes) |  |  |
| destinationport | [uint32](#uint32) |  |  |
| protocolid | [ProtocolId](#opi_api-security-firewall-v1-ProtocolId) |  |  |
| action | [ActionParameters](#opi_api-security-firewall-v1-ActionParameters) |  |  |
| cachetimeout | [uint32](#uint32) |  |  |
| srcconnid | [bytes](#bytes) |  | Used for QUIC connections |
| dstconnid | [bytes](#bytes) |  | Used for QUIC connections |






<a name="opi_api-security-firewall-v1-SessionRequestArgs"></a>

### SessionRequestArgs



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sessionid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  | If SessionId is zero, return all sessions |
| sessionstate | [SessionState](#opi_api-security-firewall-v1-SessionState) |  | Filter argument to only return sessions of a given state |






<a name="opi_api-security-firewall-v1-SessionResponse"></a>

### SessionResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sessionid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |
| inpackets | [uint64](#uint64) |  |  |
| outpackets | [uint64](#uint64) |  |  |
| inbytes | [uint64](#uint64) |  |  |
| outbytes | [uint64](#uint64) |  |  |
| sessionstate | [SessionState](#opi_api-security-firewall-v1-SessionState) |  |  |
| sessionclosecode | [SessionCloseCode](#opi_api-security-firewall-v1-SessionCloseCode) |  |  |
| requeststatus | [RequestStatus](#opi_api-security-firewall-v1-RequestStatus) |  |  |
| starttime | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |
| endtime | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  |  |






<a name="opi_api-security-firewall-v1-SessionResponseError"></a>

### SessionResponseError



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sessionid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |
| errorstatus | [int32](#int32) |  |  |






<a name="opi_api-security-firewall-v1-SessionResponses"></a>

### SessionResponses



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sessioninfo | [SessionResponse](#opi_api-security-firewall-v1-SessionResponse) | repeated |  |
| nextkey | [uint64](#uint64) |  |  |





 


<a name="opi_api-security-firewall-v1-ActionType"></a>

### ActionType


| Name | Number | Description |
| ---- | ------ | ----------- |
| _DROP | 0 |  |
| _FORWARD | 1 |  |
| _MIRROR | 2 |  |
| _SNOOP | 3 |  |
| _PROXY | 4 |  |



<a name="opi_api-security-firewall-v1-AddSessionStatus"></a>

### AddSessionStatus
Errors for adding a session
If all sessions are successful inserted return _ACCEPTED

If check of session capacity in offload device is insufficient to add all sessions 
do not insert any sessions and return  _REJECTED_SESSION_TABLE_FULL. It is the 
responsibility of the client to re-try

If the server is unavailable for some other reason then return _REJECTED_SESSION_TABLE_UNAVAILABLE.
It is the  responsibility of the client to re-try

All other errors will return _REJECTED with a buit mask of the failed sessions and it is the responsibility
of the client to address the issues

AddSessionStatus Codes Description

_SESSION_ACCEPTED: Session is accepted by the server and the client performs normal operation
_SESSION_REJECTED: Session is rejected by the server as the message 
   is invalid, the client needs to correct the error.
_SESSION_TABLE_FULL: Session is rejected by the server as its session table is full, 
   the client needs to backoff until more space is available
_SESSION_TABLE_UNAVAILABLE: Session is rejected by the server due to an internal error 
   in the server, the client needs to back off until error is corrected.
_SESSION_ALREADY_EXISTS: Session is rejected by the the server as it already exists 
   in the server session table, the client will take corrective action to ensure state is consistent.

| Name | Number | Description |
| ---- | ------ | ----------- |
| _SESSION_ACCEPTED | 0 |  |
| _SESSION_REJECTED | 1 |  |
| _SESSION_TABLE_FULL | 2 |  |
| _SESSION_TABLE_UNAVAILABLE | 3 |  |
| _SESSION_ALREADY_EXISTS | 4 |  |



<a name="opi_api-security-firewall-v1-IpVersion"></a>

### IpVersion


| Name | Number | Description |
| ---- | ------ | ----------- |
| _IPV4 | 0 |  |
| _IPV6 | 1 |  |



<a name="opi_api-security-firewall-v1-ProtocolId"></a>

### ProtocolId


| Name | Number | Description |
| ---- | ------ | ----------- |
| _HOPOPT | 0 |  |
| _TCP | 6 |  |
| _UDP | 17 |  |



<a name="opi_api-security-firewall-v1-RequestStatus"></a>

### RequestStatus
RequestStatus Codes Description

_ACCEPTED: Normal operation
_REJECTED: Unknown error in the format of the REQUEST message
_REJECTED_SESSION_NONEXISTENT: In getSession or deleteSession the server does not have the session
   in its session table. The client needs to reconcile the system state.
_REJECTED_SESSION_TABLE_FULL: This should never happen as getClosedSessions, getSession, deleteSession never add sessions.
_REJECTED_SESSION_ALREADY_EXISTS: This should never happen as getClosedSessions, getSession, deleteSession never add sessions.
_NO_CLOSED_SESSIONS: When getClosedSessions returns with no closed sessions it will return 0 sessions. There should be no
   message attached so not sure if this is valid.
_REJECTED_INTERNAL_ERROR: The server has an internal error and cannot serivce the request.
   The client must log the error and optionally retry or skip the request.

| Name | Number | Description |
| ---- | ------ | ----------- |
| _ACCEPTED | 0 |  |
| _REJECTED | 1 |  |
| _REJECTED_SESSION_NONEXISTENT | 2 |  |
| _REJECTED_SESSION_TABLE_FULL | 3 |  |
| _REJECTED_SESSION_ALREADY_EXISTS | 4 |  |
| _NO_CLOSED_SESSIONS | 5 |  |
| _REJECTED_INTERNAL_ERROR | 6 |  |



<a name="opi_api-security-firewall-v1-SessionCloseCode"></a>

### SessionCloseCode


| Name | Number | Description |
| ---- | ------ | ----------- |
| _NOT_CLOSED | 0 |  |
| _FINACK | 1 |  |
| _RST | 2 |  |
| _TIMEOUT | 3 |  |
| _UNKNOWN_CLOSE_CODE | 4 |  |



<a name="opi_api-security-firewall-v1-SessionState"></a>

### SessionState


| Name | Number | Description |
| ---- | ------ | ----------- |
| _ESTABLISHED | 0 |  |
| _CLOSING_1 | 1 |  |
| _CLOSING_2 | 2 |  |
| _CLOSED | 3 |  |
| _UNKNOWN_STATE | 4 |  |


 

 


<a name="opi_api-security-firewall-v1-SessionTable"></a>

### SessionTable
The session table was combined with the statistices service
in v1alpha4 to simplfy the code.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddSession | [SessionRequest](#opi_api-security-firewall-v1-SessionRequest) stream | [AddSessionResponse](#opi_api-security-firewall-v1-AddSessionResponse) | Adds a session This was changed in v1alpha4 to be a streaming API, for performance reasons. |
| GetSession | [SessionId](#opi_api-security-firewall-v1-SessionId) | [SessionResponse](#opi_api-security-firewall-v1-SessionResponse) | Obtains the session |
| DeleteSession | [SessionId](#opi_api-security-firewall-v1-SessionId) | [SessionResponse](#opi_api-security-firewall-v1-SessionResponse) | Delete a session |
| GetAllSession | [SessionRequestArgs](#opi_api-security-firewall-v1-SessionRequestArgs) | [SessionResponses](#opi_api-security-firewall-v1-SessionResponses) | Stream back a specific session or all current sessions To stream a single session, pass SessionId as zero |

 



<a name="uuid-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## uuid.proto



<a name="opi_api-common-v1-Uuid"></a>

### Uuid
A universally unique identifier (UUID) is a 128-bit label
When generated according to the standard methods, UUIDs are, for practical purposes, unique.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  | The value of the UUID |





 

 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

