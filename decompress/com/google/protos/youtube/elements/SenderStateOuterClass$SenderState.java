// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.elements;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

public final class SenderStateOuterClass$SenderState extends agzd implements agze
{
    public static final SenderStateOuterClass$SenderState a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)SenderStateOuterClass$SenderState.class, (agzi)(a = new SenderStateOuterClass$SenderState()));
    }
    
    private SenderStateOuterClass$SenderState() {
        this.c = 2;
    }
    
    public static SenderStateOuterClass$SenderState getDefaultInstance() {
        return SenderStateOuterClass$SenderState.a;
    }
    
    public static SenderStateOuterClass$SenderState parseFrom(final ByteBuffer byteBuffer, final ExtensionRegistryLite extensionRegistryLite) {
        return (SenderStateOuterClass$SenderState)agzi.parseFrom((agzi)SenderStateOuterClass$SenderState.a, byteBuffer, extensionRegistryLite);
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = SenderStateOuterClass$SenderState.b) == null) {
                    synchronized (SenderStateOuterClass$SenderState.class) {
                        if (SenderStateOuterClass$SenderState.b == null) {
                            SenderStateOuterClass$SenderState.b = (ahbe)new agzb((agzi)SenderStateOuterClass$SenderState.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return SenderStateOuterClass$SenderState.a;
            }
            case 4: {
                return new agzc(SenderStateOuterClass$SenderState.a);
            }
            case 3: {
                return new SenderStateOuterClass$SenderState();
            }
            case 2: {
                return newMessageInfo((MessageLite)SenderStateOuterClass$SenderState.a, "\u0001\u0000", (Object[])null);
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
