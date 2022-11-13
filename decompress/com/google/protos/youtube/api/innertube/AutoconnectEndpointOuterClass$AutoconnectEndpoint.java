// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AutoconnectEndpointOuterClass$AutoconnectEndpoint extends ahbh implements ahcw
{
    public static final AutoconnectEndpointOuterClass$AutoconnectEndpoint a;
    public static final ahbf autoconnectEndpoint;
    private static volatile ahdd l;
    public int b;
    public akap c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public aiqj j;
    public boolean k;
    private byte m;
    
    static {
        final AutoconnectEndpointOuterClass$AutoconnectEndpoint a2 = new AutoconnectEndpointOuterClass$AutoconnectEndpoint();
        ahbh.registerDefaultInstance((Class)AutoconnectEndpointOuterClass$AutoconnectEndpoint.class, (ahbh)(a = a2));
        autoconnectEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 354181190, ahek.k, (Class)AutoconnectEndpointOuterClass$AutoconnectEndpoint.class);
    }
    
    private AutoconnectEndpointOuterClass$AutoconnectEndpoint() {
        this.m = 2;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = AutoconnectEndpointOuterClass$AutoconnectEndpoint.l) == null) {
                    synchronized (AutoconnectEndpointOuterClass$AutoconnectEndpoint.class) {
                        if (AutoconnectEndpointOuterClass$AutoconnectEndpoint.l == null) {
                            AutoconnectEndpointOuterClass$AutoconnectEndpoint.l = (ahdd)new ahba((ahbh)AutoconnectEndpointOuterClass$AutoconnectEndpoint.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return AutoconnectEndpointOuterClass$AutoconnectEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AutoconnectEndpointOuterClass$AutoconnectEndpoint.a);
            }
            case 3: {
                return new AutoconnectEndpointOuterClass$AutoconnectEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AutoconnectEndpointOuterClass$AutoconnectEndpoint.a, "\u0001\t\u0000\u0001\u0003\r\t\u0000\u0000\u0001\u0003\u1007\u0003\u0004\u1009\u0002\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0007\b\u1008\b\n\u1007\n\u000b\u1409\t\r\u1008\u0006", new Object[] { "b", "d", "c", "e", "f", "h", "i", "k", "j", "g" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
