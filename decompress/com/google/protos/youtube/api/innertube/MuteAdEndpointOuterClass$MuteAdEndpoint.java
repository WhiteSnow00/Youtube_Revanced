// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MuteAdEndpointOuterClass$MuteAdEndpoint extends ahbh implements ahcw
{
    public static final MuteAdEndpointOuterClass$MuteAdEndpoint a;
    private static volatile ahdd d;
    public static final ahbf muteAdEndpoint;
    public int b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        final MuteAdEndpointOuterClass$MuteAdEndpoint a2 = new MuteAdEndpointOuterClass$MuteAdEndpoint();
        ahbh.registerDefaultInstance((Class)MuteAdEndpointOuterClass$MuteAdEndpoint.class, (ahbh)(a = a2));
        muteAdEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 69108384, ahek.k, (Class)MuteAdEndpointOuterClass$MuteAdEndpoint.class);
    }
    
    private MuteAdEndpointOuterClass$MuteAdEndpoint() {
        this.f = 2;
        this.c = emptyProtobufList();
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
                if ((d = MuteAdEndpointOuterClass$MuteAdEndpoint.d) == null) {
                    synchronized (MuteAdEndpointOuterClass$MuteAdEndpoint.class) {
                        if (MuteAdEndpointOuterClass$MuteAdEndpoint.d == null) {
                            MuteAdEndpointOuterClass$MuteAdEndpoint.d = (ahdd)new ahba((ahbh)MuteAdEndpointOuterClass$MuteAdEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return MuteAdEndpointOuterClass$MuteAdEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)MuteAdEndpointOuterClass$MuteAdEndpoint.a);
            }
            case 3: {
                return new MuteAdEndpointOuterClass$MuteAdEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MuteAdEndpointOuterClass$MuteAdEndpoint.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002\u100c\u0001\u0003\u041b", new Object[] { "e", "b", ampw.a, "c", aiqj.class });
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
