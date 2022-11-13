// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint extends ahbh implements ahcw
{
    public static final PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint a;
    private static volatile ahdd e;
    public static final ahbf performCommentActionEndpoint;
    public String b;
    public ahbx c;
    public ahbx d;
    private int f;
    private byte g;
    
    static {
        final PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint a2 = new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
        ahbh.registerDefaultInstance((Class)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class, (ahbh)(a = a2));
        performCommentActionEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 65929205, ahek.k, (Class)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class);
    }
    
    private PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint() {
        this.g = 2;
        this.b = "";
        this.c = ahbh.emptyProtobufList();
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.e) == null) {
                    synchronized (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class) {
                        if (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.e == null) {
                            PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.e = (ahdd)new ahba((ahbh)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.a);
            }
            case 3: {
                return new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u1008\u0000\u0002\u041b\u0003\u001a", new Object[] { "f", "b", "d", aiqj.class, "c" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
