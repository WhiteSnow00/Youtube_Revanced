// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint extends ahbh implements ahcw
{
    public static final UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint a;
    private static volatile ahdd d;
    public static final ahbf updateCommentReplyDialogEndpoint;
    public apfx b;
    public boolean c;
    private int e;
    private byte f;
    
    static {
        final UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint a2 = new UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint();
        ahbh.registerDefaultInstance((Class)UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class, (ahbh)(a = a2));
        updateCommentReplyDialogEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 122558141, ahek.k, (Class)UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class);
    }
    
    private UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.d) == null) {
                    synchronized (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class) {
                        if (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.d == null) {
                            UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.d = (ahdd)new ahba((ahbh)UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.a);
            }
            case 3: {
                return new UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0004\u1007\u0002", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
