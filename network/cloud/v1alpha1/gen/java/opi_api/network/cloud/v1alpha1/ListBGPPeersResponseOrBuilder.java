// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface ListBGPPeersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.ListBGPPeersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of bgppeers
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 1;</code>
   */
  java.util.List<opi_api.network.cloud.v1alpha1.BGPPeer> 
      getBgppeerList();
  /**
   * <pre>
   * list of bgppeers
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.BGPPeer getBgppeer(int index);
  /**
   * <pre>
   * list of bgppeers
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 1;</code>
   */
  int getBgppeerCount();
  /**
   * <pre>
   * list of bgppeers
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 1;</code>
   */
  java.util.List<? extends opi_api.network.cloud.v1alpha1.BGPPeerOrBuilder> 
      getBgppeerOrBuilderList();
  /**
   * <pre>
   * list of bgppeers
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.BGPPeerOrBuilder getBgppeerOrBuilder(
      int index);

  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
