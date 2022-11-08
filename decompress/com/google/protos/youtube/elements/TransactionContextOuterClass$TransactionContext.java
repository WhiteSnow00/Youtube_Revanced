// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.elements;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

public final class TransactionContextOuterClass$TransactionContext extends agzd implements agze
{
    public static final TransactionContextOuterClass$TransactionContext a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)TransactionContextOuterClass$TransactionContext.class, (agzi)(a = new TransactionContextOuterClass$TransactionContext()));
    }
    
    private TransactionContextOuterClass$TransactionContext() {
        this.c = 2;
    }
    
    public static TransactionContextOuterClass$TransactionContext getDefaultInstance() {
        return TransactionContextOuterClass$TransactionContext.a;
    }
    
    public static TransactionContextOuterClass$TransactionContext parseFrom(final ByteBuffer byteBuffer, final ExtensionRegistryLite extensionRegistryLite) {
        return (TransactionContextOuterClass$TransactionContext)agzi.parseFrom((agzi)TransactionContextOuterClass$TransactionContext.a, byteBuffer, extensionRegistryLite);
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = TransactionContextOuterClass$TransactionContext.b) == null) {
                    synchronized (TransactionContextOuterClass$TransactionContext.class) {
                        if (TransactionContextOuterClass$TransactionContext.b == null) {
                            TransactionContextOuterClass$TransactionContext.b = (ahbe)new agzb((agzi)TransactionContextOuterClass$TransactionContext.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return TransactionContextOuterClass$TransactionContext.a;
            }
            case 4: {
                return new agzc(TransactionContextOuterClass$TransactionContext.a);
            }
            case 3: {
                return new TransactionContextOuterClass$TransactionContext();
            }
            case 2: {
                return newMessageInfo((MessageLite)TransactionContextOuterClass$TransactionContext.a, "\u0001\u0000", (Object[])null);
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
