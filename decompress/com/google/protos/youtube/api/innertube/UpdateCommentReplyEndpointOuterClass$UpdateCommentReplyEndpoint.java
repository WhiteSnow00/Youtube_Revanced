// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint extends ahbh implements ahcw
{
    public static final UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint a;
    private static volatile ahdd h;
    public static final ahbf updateCommentReplyEndpoint;
    public int b;
    public String c;
    public ajut d;
    public boolean e;
    public String f;
    public String g;
    private byte i;
    
    static {
        final UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint a2 = new UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint();
        ahbh.registerDefaultInstance((Class)UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class, (ahbh)(a = a2));
        updateCommentReplyEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 100723586, ahek.k, (Class)UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class);
    }
    
    private UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint() {
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
                if ((h = UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.h) == null) {
                    synchronized (UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class) {
                        if (UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.h == null) {
                            UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.h = (ahdd)new ahba((ahbh)UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.a);
            }
            case 3: {
                return new UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0002\u0004\u1007\u0003\u0005\u1008\u0004\u0006\u1008\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
