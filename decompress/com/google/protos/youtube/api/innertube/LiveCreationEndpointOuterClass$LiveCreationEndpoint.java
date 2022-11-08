// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveCreationEndpointOuterClass$LiveCreationEndpoint extends agzi implements ahax
{
    public static final LiveCreationEndpointOuterClass$LiveCreationEndpoint a;
    private static volatile ahbe f;
    public static final agzg liveCreationEndpoint;
    public int b;
    public String c;
    public String d;
    public boolean e;
    
    static {
        final LiveCreationEndpointOuterClass$LiveCreationEndpoint a2 = new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
        agzi.registerDefaultInstance((Class)LiveCreationEndpointOuterClass$LiveCreationEndpoint.class, (agzi)(a = a2));
        liveCreationEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 122546829, ahcm.k, (Class)LiveCreationEndpointOuterClass$LiveCreationEndpoint.class);
    }
    
    private LiveCreationEndpointOuterClass$LiveCreationEndpoint() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = LiveCreationEndpointOuterClass$LiveCreationEndpoint.f) == null) {
                    synchronized (LiveCreationEndpointOuterClass$LiveCreationEndpoint.class) {
                        if (LiveCreationEndpointOuterClass$LiveCreationEndpoint.f == null) {
                            LiveCreationEndpointOuterClass$LiveCreationEndpoint.f = (ahbe)new agzb((agzi)LiveCreationEndpointOuterClass$LiveCreationEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LiveCreationEndpointOuterClass$LiveCreationEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LiveCreationEndpointOuterClass$LiveCreationEndpoint.a);
            }
            case 3: {
                return new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveCreationEndpointOuterClass$LiveCreationEndpoint.a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e" });
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
