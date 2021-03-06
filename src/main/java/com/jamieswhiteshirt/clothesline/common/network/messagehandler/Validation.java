package com.jamieswhiteshirt.clothesline.common.network.messagehandler;

import com.jamieswhiteshirt.clothesline.api.Network;
import com.jamieswhiteshirt.clothesline.api.NetworkState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

public class Validation {
    public static boolean canReachAttachment(PlayerEntity player, Network network, int attachmentKey) {
        NetworkState state = network.getState();
        return canReachPos(player, state.getPath().getPositionForOffset(state.attachmentKeyToOffset(attachmentKey)));
    }

    public static boolean canReachPos(PlayerEntity player, Vec3d pos) {
        Vec3d delta = pos.subtract(player.getX(), player.getY() + 1.5D, player.getZ());
        return delta.lengthSquared() < 64.0D;
    }
}
