// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.elements;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

public final class CommandOuterClass$GestureAccessibilityInfo extends agzi implements ahax
{
    public static final CommandOuterClass$GestureAccessibilityInfo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)CommandOuterClass$GestureAccessibilityInfo.class, (agzi)(a = new CommandOuterClass$GestureAccessibilityInfo()));
    }
    
    private CommandOuterClass$GestureAccessibilityInfo() {
    }
    
    public static CommandOuterClass$GestureAccessibilityInfo getDefaultInstance() {
        return CommandOuterClass$GestureAccessibilityInfo.a;
    }
    
    public static CommandOuterClass$GestureAccessibilityInfo parseFrom(final ByteBuffer byteBuffer, final ExtensionRegistryLite extensionRegistryLite) {
        return (CommandOuterClass$GestureAccessibilityInfo)agzi.parseFrom((agzi)CommandOuterClass$GestureAccessibilityInfo.a, byteBuffer, extensionRegistryLite);
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = CommandOuterClass$GestureAccessibilityInfo.b) == null) {
                    synchronized (CommandOuterClass$GestureAccessibilityInfo.class) {
                        if (CommandOuterClass$GestureAccessibilityInfo.b == null) {
                            CommandOuterClass$GestureAccessibilityInfo.b = (ahbe)new agzb((agzi)CommandOuterClass$GestureAccessibilityInfo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return CommandOuterClass$GestureAccessibilityInfo.a;
            }
            case 4: {
                return new agza((agzi)CommandOuterClass$GestureAccessibilityInfo.a);
            }
            case 3: {
                return new CommandOuterClass$GestureAccessibilityInfo();
            }
            case 2: {
                return newMessageInfo((MessageLite)CommandOuterClass$GestureAccessibilityInfo.a, "\u0001\u0000", (Object[])null);
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
