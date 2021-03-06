package com.jamieswhiteshirt.clothesline.common.network.message;

import com.jamieswhiteshirt.clothesline.common.util.PacketByteBufSerialization;
import net.minecraft.network.PacketByteBuf;

public class RemoveNetworkMessage {
    public final int networkId;

    public RemoveNetworkMessage(int networkId) {
        this.networkId = networkId;
    }

    public void serialize(PacketByteBuf buf) {
        PacketByteBufSerialization.writeNetworkId(buf, networkId);
    }

    public static RemoveNetworkMessage deserialize(PacketByteBuf buf) {
        return new RemoveNetworkMessage(
            PacketByteBufSerialization.readNetworkId(buf)
        );
    }
}
