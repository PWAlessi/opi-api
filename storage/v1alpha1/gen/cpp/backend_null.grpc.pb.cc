// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: backend_null.proto

#include "backend_null.pb.h"
#include "backend_null.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace opi_api {
namespace storage {
namespace v1 {

static const char* NullVolumeService_method_names[] = {
  "/opi_api.storage.v1.NullVolumeService/CreateNullVolume",
  "/opi_api.storage.v1.NullVolumeService/DeleteNullVolume",
  "/opi_api.storage.v1.NullVolumeService/UpdateNullVolume",
  "/opi_api.storage.v1.NullVolumeService/ListNullVolumes",
  "/opi_api.storage.v1.NullVolumeService/GetNullVolume",
  "/opi_api.storage.v1.NullVolumeService/StatsNullVolume",
};

std::unique_ptr< NullVolumeService::Stub> NullVolumeService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< NullVolumeService::Stub> stub(new NullVolumeService::Stub(channel, options));
  return stub;
}

NullVolumeService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_CreateNullVolume_(NullVolumeService_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_DeleteNullVolume_(NullVolumeService_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_UpdateNullVolume_(NullVolumeService_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ListNullVolumes_(NullVolumeService_method_names[3], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetNullVolume_(NullVolumeService_method_names[4], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_StatsNullVolume_(NullVolumeService_method_names[5], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status NullVolumeService::Stub::CreateNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateNullVolumeRequest& request, ::opi_api::storage::v1::NullVolume* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::CreateNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_CreateNullVolume_, context, request, response);
}

void NullVolumeService::Stub::async::CreateNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::CreateNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_CreateNullVolume_, context, request, response, std::move(f));
}

void NullVolumeService::Stub::async::CreateNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_CreateNullVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NullVolume>* NullVolumeService::Stub::PrepareAsyncCreateNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NullVolume, ::opi_api::storage::v1::CreateNullVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_CreateNullVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NullVolume>* NullVolumeService::Stub::AsyncCreateNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncCreateNullVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NullVolumeService::Stub::DeleteNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteNullVolumeRequest& request, ::google::protobuf::Empty* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::DeleteNullVolumeRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_DeleteNullVolume_, context, request, response);
}

void NullVolumeService::Stub::async::DeleteNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteNullVolumeRequest* request, ::google::protobuf::Empty* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::DeleteNullVolumeRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_DeleteNullVolume_, context, request, response, std::move(f));
}

void NullVolumeService::Stub::async::DeleteNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteNullVolumeRequest* request, ::google::protobuf::Empty* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_DeleteNullVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::google::protobuf::Empty>* NullVolumeService::Stub::PrepareAsyncDeleteNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::google::protobuf::Empty, ::opi_api::storage::v1::DeleteNullVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_DeleteNullVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::google::protobuf::Empty>* NullVolumeService::Stub::AsyncDeleteNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncDeleteNullVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NullVolumeService::Stub::UpdateNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateNullVolumeRequest& request, ::opi_api::storage::v1::NullVolume* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::UpdateNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_UpdateNullVolume_, context, request, response);
}

void NullVolumeService::Stub::async::UpdateNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::UpdateNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_UpdateNullVolume_, context, request, response, std::move(f));
}

void NullVolumeService::Stub::async::UpdateNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_UpdateNullVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NullVolume>* NullVolumeService::Stub::PrepareAsyncUpdateNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NullVolume, ::opi_api::storage::v1::UpdateNullVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_UpdateNullVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NullVolume>* NullVolumeService::Stub::AsyncUpdateNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncUpdateNullVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NullVolumeService::Stub::ListNullVolumes(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListNullVolumesRequest& request, ::opi_api::storage::v1::ListNullVolumesResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::ListNullVolumesRequest, ::opi_api::storage::v1::ListNullVolumesResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_ListNullVolumes_, context, request, response);
}

void NullVolumeService::Stub::async::ListNullVolumes(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListNullVolumesRequest* request, ::opi_api::storage::v1::ListNullVolumesResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::ListNullVolumesRequest, ::opi_api::storage::v1::ListNullVolumesResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ListNullVolumes_, context, request, response, std::move(f));
}

void NullVolumeService::Stub::async::ListNullVolumes(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListNullVolumesRequest* request, ::opi_api::storage::v1::ListNullVolumesResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ListNullVolumes_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::ListNullVolumesResponse>* NullVolumeService::Stub::PrepareAsyncListNullVolumesRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListNullVolumesRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::ListNullVolumesResponse, ::opi_api::storage::v1::ListNullVolumesRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_ListNullVolumes_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::ListNullVolumesResponse>* NullVolumeService::Stub::AsyncListNullVolumesRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListNullVolumesRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncListNullVolumesRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NullVolumeService::Stub::GetNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetNullVolumeRequest& request, ::opi_api::storage::v1::NullVolume* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::GetNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetNullVolume_, context, request, response);
}

void NullVolumeService::Stub::async::GetNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::GetNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetNullVolume_, context, request, response, std::move(f));
}

void NullVolumeService::Stub::async::GetNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetNullVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NullVolume>* NullVolumeService::Stub::PrepareAsyncGetNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NullVolume, ::opi_api::storage::v1::GetNullVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetNullVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NullVolume>* NullVolumeService::Stub::AsyncGetNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetNullVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NullVolumeService::Stub::StatsNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::StatsNullVolumeRequest& request, ::opi_api::storage::v1::StatsNullVolumeResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::StatsNullVolumeRequest, ::opi_api::storage::v1::StatsNullVolumeResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_StatsNullVolume_, context, request, response);
}

void NullVolumeService::Stub::async::StatsNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::StatsNullVolumeRequest* request, ::opi_api::storage::v1::StatsNullVolumeResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::StatsNullVolumeRequest, ::opi_api::storage::v1::StatsNullVolumeResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_StatsNullVolume_, context, request, response, std::move(f));
}

void NullVolumeService::Stub::async::StatsNullVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::StatsNullVolumeRequest* request, ::opi_api::storage::v1::StatsNullVolumeResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_StatsNullVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::StatsNullVolumeResponse>* NullVolumeService::Stub::PrepareAsyncStatsNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::StatsNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::StatsNullVolumeResponse, ::opi_api::storage::v1::StatsNullVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_StatsNullVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::StatsNullVolumeResponse>* NullVolumeService::Stub::AsyncStatsNullVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::StatsNullVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncStatsNullVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

NullVolumeService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NullVolumeService_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NullVolumeService::Service, ::opi_api::storage::v1::CreateNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NullVolumeService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::CreateNullVolumeRequest* req,
             ::opi_api::storage::v1::NullVolume* resp) {
               return service->CreateNullVolume(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NullVolumeService_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NullVolumeService::Service, ::opi_api::storage::v1::DeleteNullVolumeRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NullVolumeService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::DeleteNullVolumeRequest* req,
             ::google::protobuf::Empty* resp) {
               return service->DeleteNullVolume(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NullVolumeService_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NullVolumeService::Service, ::opi_api::storage::v1::UpdateNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NullVolumeService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::UpdateNullVolumeRequest* req,
             ::opi_api::storage::v1::NullVolume* resp) {
               return service->UpdateNullVolume(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NullVolumeService_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NullVolumeService::Service, ::opi_api::storage::v1::ListNullVolumesRequest, ::opi_api::storage::v1::ListNullVolumesResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NullVolumeService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::ListNullVolumesRequest* req,
             ::opi_api::storage::v1::ListNullVolumesResponse* resp) {
               return service->ListNullVolumes(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NullVolumeService_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NullVolumeService::Service, ::opi_api::storage::v1::GetNullVolumeRequest, ::opi_api::storage::v1::NullVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NullVolumeService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::GetNullVolumeRequest* req,
             ::opi_api::storage::v1::NullVolume* resp) {
               return service->GetNullVolume(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NullVolumeService_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NullVolumeService::Service, ::opi_api::storage::v1::StatsNullVolumeRequest, ::opi_api::storage::v1::StatsNullVolumeResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NullVolumeService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::StatsNullVolumeRequest* req,
             ::opi_api::storage::v1::StatsNullVolumeResponse* resp) {
               return service->StatsNullVolume(ctx, req, resp);
             }, this)));
}

NullVolumeService::Service::~Service() {
}

::grpc::Status NullVolumeService::Service::CreateNullVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::CreateNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NullVolumeService::Service::DeleteNullVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::DeleteNullVolumeRequest* request, ::google::protobuf::Empty* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NullVolumeService::Service::UpdateNullVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::UpdateNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NullVolumeService::Service::ListNullVolumes(::grpc::ServerContext* context, const ::opi_api::storage::v1::ListNullVolumesRequest* request, ::opi_api::storage::v1::ListNullVolumesResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NullVolumeService::Service::GetNullVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::GetNullVolumeRequest* request, ::opi_api::storage::v1::NullVolume* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NullVolumeService::Service::StatsNullVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::StatsNullVolumeRequest* request, ::opi_api::storage::v1::StatsNullVolumeResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace opi_api
}  // namespace storage
}  // namespace v1

