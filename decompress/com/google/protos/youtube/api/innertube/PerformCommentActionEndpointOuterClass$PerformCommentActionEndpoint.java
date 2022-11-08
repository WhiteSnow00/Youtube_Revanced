// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint extends agzi implements ahax
{
    public static final PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint a;
    private static volatile ahbe e;
    public static final agzg performCommentActionEndpoint;
    public String b;
    public agzy c;
    public agzy d;
    private int f;
    private byte g;
    
    static {
        final PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint a2 = new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
        agzi.registerDefaultInstance((Class)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class, (agzi)(a = a2));
        performCommentActionEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 65929205, ahcm.k, (Class)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class);
    }
    
    private PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint() {
        this.g = 2;
        this.b = "";
        this.c = agzi.emptyProtobufList();
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.e) == null) {
                    synchronized (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class) {
                        if (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.e == null) {
                            PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.e = (ahbe)new agzb((agzi)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.a);
            }
            case 3: {
                return new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u1008\u0000\u0002\u041b\u0003\u001a", new Object[] { "f", "b", "d", aioe.class, "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
