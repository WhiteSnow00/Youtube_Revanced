// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint extends agzi implements ahax
{
    public static final EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint a;
    private static volatile ahbe d;
    public static final agzg editConnectionStateEndpoint;
    public String b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        final EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint a2 = new EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint();
        agzi.registerDefaultInstance((Class)EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class, (agzi)(a = a2));
        editConnectionStateEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 90427601, ahcm.k, (Class)EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class);
    }
    
    private EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint() {
        this.f = 2;
        this.b = "";
        this.c = emptyProtobufList();
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
                final ahbe d;
                if ((d = EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.d) == null) {
                    synchronized (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class) {
                        if (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.d == null) {
                            EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.d = (ahbe)new agzb((agzi)EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.a;
            }
            case 4: {
                return new agza((agzi)EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.a);
            }
            case 3: {
                return new EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "e", "b", "c", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
