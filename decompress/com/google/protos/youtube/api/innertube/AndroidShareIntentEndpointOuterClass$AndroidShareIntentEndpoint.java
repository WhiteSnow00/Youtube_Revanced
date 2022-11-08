// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint extends agzi implements ahax
{
    public static final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint a;
    public static final agzg androidShareIntentEndpoint;
    private static volatile ahbe g;
    public int b;
    public agzy c;
    public String d;
    public String e;
    public String f;
    private byte h;
    
    static {
        final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint a2 = new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
        agzi.registerDefaultInstance((Class)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class, (agzi)(a = a2));
        androidShareIntentEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 106983893, ahcm.k, (Class)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class);
    }
    
    private AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint() {
        this.h = 2;
        this.c = emptyProtobufList();
        this.d = "";
        this.e = "";
        this.f = "";
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
                final ahbe g;
                if ((g = AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.g) == null) {
                    synchronized (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class) {
                        if (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.g == null) {
                            AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.g = (ahbe)new agzb((agzi)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.a);
            }
            case 3: {
                return new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001\u041b\u0002\u1008\u0000\u0004\u1008\u0001\u0006\u1008\u0002", new Object[] { "b", "c", aliq.class, "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
