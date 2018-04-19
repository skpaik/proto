package io.lib.proto;


public class DemoModel {
    public void Test() {
        MeshProto.MeshPeer protoMsg = MeshProto.MeshPeer.newBuilder()
                .setPeerId("")
                .setState(1).build();
    }
}
