package io.skpaik.proto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.lib.proto.MeshProto;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MeshProto.MeshPeer protoMsg = MeshProto.MeshPeer.newBuilder()
                .setPeerId("")
                .setState(1).build();

        TestProto.ProtoData protoMsg2 = TestProto.ProtoData.newBuilder().build();
    }
}