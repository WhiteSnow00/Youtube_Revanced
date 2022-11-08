// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.elements;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

public final class CommandOuterClass$GestureOptions extends agzi implements ahax
{
    public static final CommandOuterClass$GestureOptions a;
    private static volatile ahbe c;
    public CommandOuterClass$GestureAccessibilityInfo b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)CommandOuterClass$GestureOptions.class, (agzi)(a = new CommandOuterClass$GestureOptions()));
    }
    
    private CommandOuterClass$GestureOptions() {
    }
    
    public static CommandOuterClass$GestureOptions getDefaultInstance() {
        return CommandOuterClass$GestureOptions.a;
    }
    
    public static CommandOuterClass$GestureOptions parseFrom(final ByteBuffer byteBuffer, final ExtensionRegistryLite extensionRegistryLite) {
        return (CommandOuterClass$GestureOptions)agzi.parseFrom((agzi)CommandOuterClass$GestureOptions.a, byteBuffer, extensionRegistryLite);
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = CommandOuterClass$GestureOptions.c) == null) {
                    synchronized (CommandOuterClass$GestureOptions.class) {
                        if (CommandOuterClass$GestureOptions.c == null) {
                            CommandOuterClass$GestureOptions.c = (ahbe)new agzb((agzi)CommandOuterClass$GestureOptions.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return CommandOuterClass$GestureOptions.a;
            }
            case 4: {
                return new agza((agzi)CommandOuterClass$GestureOptions.a);
            }
            case 3: {
                return new CommandOuterClass$GestureOptions();
            }
            case 2: {
                return newMessageInfo((MessageLite)CommandOuterClass$GestureOptions.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
