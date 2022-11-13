// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateCommentEndpointOuterClass$UpdateCommentEndpoint extends ahbh implements ahcw
{
    public static final UpdateCommentEndpointOuterClass$UpdateCommentEndpoint a;
    private static volatile ahdd h;
    public static final ahbf updateCommentEndpoint;
    public int b;
    public String c;
    public ajut d;
    public boolean e;
    public String f;
    public String g;
    private byte i;
    
    static {
        final UpdateCommentEndpointOuterClass$UpdateCommentEndpoint a2 = new UpdateCommentEndpointOuterClass$UpdateCommentEndpoint();
        ahbh.registerDefaultInstance((Class)UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class, (ahbh)(a = a2));
        updateCommentEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 99326409, ahek.k, (Class)UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class);
    }
    
    private UpdateCommentEndpointOuterClass$UpdateCommentEndpoint() {
        this.i = 2;
        this.c = "";
        this.f = "";
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.h) == null) {
                    synchronized (UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class) {
                        if (UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.h == null) {
                            UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.h = (ahdd)new ahba((ahbh)UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.a);
            }
            case 3: {
                return new UpdateCommentEndpointOuterClass$UpdateCommentEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
