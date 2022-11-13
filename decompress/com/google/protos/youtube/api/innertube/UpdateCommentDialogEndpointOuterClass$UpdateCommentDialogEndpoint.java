// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint extends ahbh implements ahcw
{
    public static final UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint a;
    private static volatile ahdd d;
    public static final ahbf updateCommentDialogEndpoint;
    public apfw b;
    public boolean c;
    private int e;
    private byte f;
    
    static {
        final UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint a2 = new UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint();
        ahbh.registerDefaultInstance((Class)UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class, (ahbh)(a = a2));
        updateCommentDialogEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 122557296, ahek.k, (Class)UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class);
    }
    
    private UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint() {
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
                if ((d = UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.d) == null) {
                    synchronized (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class) {
                        if (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.d == null) {
                            UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.d = (ahdd)new ahba((ahbh)UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.a);
            }
            case 3: {
                return new UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1007\u0002", new Object[] { "e", "b", "c" });
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
