// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AutoconnectEndpointOuterClass$AutoconnectEndpoint extends agzi implements ahax
{
    public static final AutoconnectEndpointOuterClass$AutoconnectEndpoint a;
    public static final agzg autoconnectEndpoint;
    private static volatile ahbe l;
    public int b;
    public ajym c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public aioe j;
    public boolean k;
    private byte m;
    
    static {
        final AutoconnectEndpointOuterClass$AutoconnectEndpoint a2 = new AutoconnectEndpointOuterClass$AutoconnectEndpoint();
        agzi.registerDefaultInstance((Class)AutoconnectEndpointOuterClass$AutoconnectEndpoint.class, (agzi)(a = a2));
        autoconnectEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 354181190, ahcm.k, (Class)AutoconnectEndpointOuterClass$AutoconnectEndpoint.class);
    }
    
    private AutoconnectEndpointOuterClass$AutoconnectEndpoint() {
        this.m = 2;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
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
                final ahbe l;
                if ((l = AutoconnectEndpointOuterClass$AutoconnectEndpoint.l) == null) {
                    synchronized (AutoconnectEndpointOuterClass$AutoconnectEndpoint.class) {
                        if (AutoconnectEndpointOuterClass$AutoconnectEndpoint.l == null) {
                            AutoconnectEndpointOuterClass$AutoconnectEndpoint.l = (ahbe)new agzb((agzi)AutoconnectEndpointOuterClass$AutoconnectEndpoint.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return AutoconnectEndpointOuterClass$AutoconnectEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AutoconnectEndpointOuterClass$AutoconnectEndpoint.a);
            }
            case 3: {
                return new AutoconnectEndpointOuterClass$AutoconnectEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AutoconnectEndpointOuterClass$AutoconnectEndpoint.a, "\u0001\t\u0000\u0001\u0003\r\t\u0000\u0000\u0001\u0003\u1007\u0003\u0004\u1009\u0002\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0007\b\u1008\b\n\u1007\n\u000b\u1409\t\r\u1008\u0006", new Object[] { "b", "d", "c", "e", "f", "h", "i", "k", "j", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
