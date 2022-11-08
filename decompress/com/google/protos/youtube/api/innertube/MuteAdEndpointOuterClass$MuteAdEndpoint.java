// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MuteAdEndpointOuterClass$MuteAdEndpoint extends agzi implements ahax
{
    public static final MuteAdEndpointOuterClass$MuteAdEndpoint a;
    private static volatile ahbe d;
    public static final agzg muteAdEndpoint;
    public int b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        final MuteAdEndpointOuterClass$MuteAdEndpoint a2 = new MuteAdEndpointOuterClass$MuteAdEndpoint();
        agzi.registerDefaultInstance((Class)MuteAdEndpointOuterClass$MuteAdEndpoint.class, (agzi)(a = a2));
        muteAdEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 69108384, ahcm.k, (Class)MuteAdEndpointOuterClass$MuteAdEndpoint.class);
    }
    
    private MuteAdEndpointOuterClass$MuteAdEndpoint() {
        this.f = 2;
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
                if ((d = MuteAdEndpointOuterClass$MuteAdEndpoint.d) == null) {
                    synchronized (MuteAdEndpointOuterClass$MuteAdEndpoint.class) {
                        if (MuteAdEndpointOuterClass$MuteAdEndpoint.d == null) {
                            MuteAdEndpointOuterClass$MuteAdEndpoint.d = (ahbe)new agzb((agzi)MuteAdEndpointOuterClass$MuteAdEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return MuteAdEndpointOuterClass$MuteAdEndpoint.a;
            }
            case 4: {
                return new agza((agzi)MuteAdEndpointOuterClass$MuteAdEndpoint.a);
            }
            case 3: {
                return new MuteAdEndpointOuterClass$MuteAdEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MuteAdEndpointOuterClass$MuteAdEndpoint.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002\u100c\u0001\u0003\u041b", new Object[] { "e", "b", amom.b, "c", aioe.class });
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
