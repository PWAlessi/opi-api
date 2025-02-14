# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import backend_aio_pb2 as backend__aio__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class AioVolumeServiceStub(object):
    """Back End (network-facing) APIs. This service is for AIO generic kernel block device.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateAioVolume = channel.unary_unary(
                '/opi_api.storage.v1.AioVolumeService/CreateAioVolume',
                request_serializer=backend__aio__pb2.CreateAioVolumeRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.AioVolume.FromString,
                )
        self.DeleteAioVolume = channel.unary_unary(
                '/opi_api.storage.v1.AioVolumeService/DeleteAioVolume',
                request_serializer=backend__aio__pb2.DeleteAioVolumeRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.UpdateAioVolume = channel.unary_unary(
                '/opi_api.storage.v1.AioVolumeService/UpdateAioVolume',
                request_serializer=backend__aio__pb2.UpdateAioVolumeRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.AioVolume.FromString,
                )
        self.ListAioVolumes = channel.unary_unary(
                '/opi_api.storage.v1.AioVolumeService/ListAioVolumes',
                request_serializer=backend__aio__pb2.ListAioVolumesRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.ListAioVolumesResponse.FromString,
                )
        self.GetAioVolume = channel.unary_unary(
                '/opi_api.storage.v1.AioVolumeService/GetAioVolume',
                request_serializer=backend__aio__pb2.GetAioVolumeRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.AioVolume.FromString,
                )
        self.StatsAioVolume = channel.unary_unary(
                '/opi_api.storage.v1.AioVolumeService/StatsAioVolume',
                request_serializer=backend__aio__pb2.StatsAioVolumeRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.StatsAioVolumeResponse.FromString,
                )


class AioVolumeServiceServicer(object):
    """Back End (network-facing) APIs. This service is for AIO generic kernel block device.
    """

    def CreateAioVolume(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteAioVolume(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateAioVolume(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListAioVolumes(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetAioVolume(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def StatsAioVolume(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_AioVolumeServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateAioVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateAioVolume,
                    request_deserializer=backend__aio__pb2.CreateAioVolumeRequest.FromString,
                    response_serializer=backend__aio__pb2.AioVolume.SerializeToString,
            ),
            'DeleteAioVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteAioVolume,
                    request_deserializer=backend__aio__pb2.DeleteAioVolumeRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateAioVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateAioVolume,
                    request_deserializer=backend__aio__pb2.UpdateAioVolumeRequest.FromString,
                    response_serializer=backend__aio__pb2.AioVolume.SerializeToString,
            ),
            'ListAioVolumes': grpc.unary_unary_rpc_method_handler(
                    servicer.ListAioVolumes,
                    request_deserializer=backend__aio__pb2.ListAioVolumesRequest.FromString,
                    response_serializer=backend__aio__pb2.ListAioVolumesResponse.SerializeToString,
            ),
            'GetAioVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.GetAioVolume,
                    request_deserializer=backend__aio__pb2.GetAioVolumeRequest.FromString,
                    response_serializer=backend__aio__pb2.AioVolume.SerializeToString,
            ),
            'StatsAioVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.StatsAioVolume,
                    request_deserializer=backend__aio__pb2.StatsAioVolumeRequest.FromString,
                    response_serializer=backend__aio__pb2.StatsAioVolumeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'opi_api.storage.v1.AioVolumeService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AioVolumeService(object):
    """Back End (network-facing) APIs. This service is for AIO generic kernel block device.
    """

    @staticmethod
    def CreateAioVolume(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioVolumeService/CreateAioVolume',
            backend__aio__pb2.CreateAioVolumeRequest.SerializeToString,
            backend__aio__pb2.AioVolume.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteAioVolume(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioVolumeService/DeleteAioVolume',
            backend__aio__pb2.DeleteAioVolumeRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateAioVolume(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioVolumeService/UpdateAioVolume',
            backend__aio__pb2.UpdateAioVolumeRequest.SerializeToString,
            backend__aio__pb2.AioVolume.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListAioVolumes(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioVolumeService/ListAioVolumes',
            backend__aio__pb2.ListAioVolumesRequest.SerializeToString,
            backend__aio__pb2.ListAioVolumesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetAioVolume(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioVolumeService/GetAioVolume',
            backend__aio__pb2.GetAioVolumeRequest.SerializeToString,
            backend__aio__pb2.AioVolume.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def StatsAioVolume(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioVolumeService/StatsAioVolume',
            backend__aio__pb2.StatsAioVolumeRequest.SerializeToString,
            backend__aio__pb2.StatsAioVolumeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
