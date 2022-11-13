// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveCreationEndpointOuterClass$LiveCreationEndpoint extends ahbh implements ahcw
{
    public static final LiveCreationEndpointOuterClass$LiveCreationEndpoint a;
    private static volatile ahdd f;
    public static final ahbf liveCreationEndpoint;
    public int b;
    public String c;
    public String d;
    public boolean e;
    
    static {
        final LiveCreationEndpointOuterClass$LiveCreationEndpoint a2 = new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
        ahbh.registerDefaultInstance((Class)LiveCreationEndpointOuterClass$LiveCreationEndpoint.class, (ahbh)(a = a2));
        liveCreationEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 122546829, ahek.k, (Class)LiveCreationEndpointOuterClass$LiveCreationEndpoint.class);
    }
    
    private LiveCreationEndpointOuterClass$LiveCreationEndpoint() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = LiveCreationEndpointOuterClass$LiveCreationEndpoint.f) == null) {
                    synchronized (LiveCreationEndpointOuterClass$LiveCreationEndpoint.class) {
                        if (LiveCreationEndpointOuterClass$LiveCreationEndpoint.f == null) {
                            LiveCreationEndpointOuterClass$LiveCreationEndpoint.f = (ahdd)new ahba((ahbh)LiveCreationEndpointOuterClass$LiveCreationEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LiveCreationEndpointOuterClass$LiveCreationEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveCreationEndpointOuterClass$LiveCreationEndpoint.a);
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
