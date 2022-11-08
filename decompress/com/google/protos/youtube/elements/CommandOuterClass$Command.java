// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.elements;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

public final class CommandOuterClass$Command extends agzd implements agze
{
    public static final CommandOuterClass$Command a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)CommandOuterClass$Command.class, (agzi)(a = new CommandOuterClass$Command()));
    }
    
    private CommandOuterClass$Command() {
        this.c = 2;
    }
    
    public static CommandOuterClass$Command getDefaultInstance() {
        return CommandOuterClass$Command.a;
    }
    
    public static CommandOuterClass$Command parseFrom(final ByteBuffer byteBuffer, final ExtensionRegistryLite extensionRegistryLite) {
        return (CommandOuterClass$Command)agzi.parseFrom((agzi)CommandOuterClass$Command.a, byteBuffer, extensionRegistryLite);
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = CommandOuterClass$Command.b) == null) {
                    synchronized (CommandOuterClass$Command.class) {
                        if (CommandOuterClass$Command.b == null) {
                            CommandOuterClass$Command.b = (ahbe)new agzb((agzi)CommandOuterClass$Command.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return CommandOuterClass$Command.a;
            }
            case 4: {
                return new agzc(CommandOuterClass$Command.a);
            }
            case 3: {
                return new CommandOuterClass$Command();
            }
            case 2: {
                return newMessageInfo((MessageLite)CommandOuterClass$Command.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
