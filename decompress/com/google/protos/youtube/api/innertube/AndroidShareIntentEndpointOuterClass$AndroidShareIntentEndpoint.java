// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint extends ahbh implements ahcw
{
    public static final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint a;
    public static final ahbf androidShareIntentEndpoint;
    private static volatile ahdd g;
    public int b;
    public ahbx c;
    public String d;
    public String e;
    public String f;
    private byte h;
    
    static {
        final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint a2 = new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
        ahbh.registerDefaultInstance((Class)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class, (ahbh)(a = a2));
        androidShareIntentEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 106983893, ahek.k, (Class)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class);
    }
    
    private AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint() {
        this.h = 2;
        this.c = emptyProtobufList();
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.g) == null) {
                    synchronized (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class) {
                        if (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.g == null) {
                            AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.g = (ahdd)new ahba((ahbh)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.a);
            }
            case 3: {
                return new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001\u041b\u0002\u1008\u0000\u0004\u1008\u0001\u0006\u1008\u0002", new Object[] { "b", "c", alkt.class, "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
