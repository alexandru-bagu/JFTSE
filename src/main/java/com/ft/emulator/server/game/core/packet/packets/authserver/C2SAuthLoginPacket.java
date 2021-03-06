package com.ft.emulator.server.game.core.packet.packets.authserver;

import com.ft.emulator.server.networking.packet.Packet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class C2SAuthLoginPacket extends Packet {
    private String username;

    public C2SAuthLoginPacket(Packet packet) {
        super(packet);
        this.username = this.readUnicodeString();
    }
}
