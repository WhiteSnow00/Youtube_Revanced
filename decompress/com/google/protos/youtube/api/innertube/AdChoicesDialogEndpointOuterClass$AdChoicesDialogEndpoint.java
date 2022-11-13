// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint extends ahbh implements ahcw
{
    public static final AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint a;
    public static final ahbf adChoicesDialogEndpoint;
    private static volatile ahdd c;
    public ahkw b;
    private int d;
    private byte e;
    
    static {
        final AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint a2 = new AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint();
        ahbh.registerDefaultInstance((Class)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class, (ahbh)(a = a2));
        adChoicesDialogEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 83457823, ahek.k, (Class)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class);
    }
    
    private AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.c) == null) {
                    synchronized (AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class) {
                        if (AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.c == null) {
                            AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.c = (ahdd)new ahba((ahbh)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.a);
            }
            case 3: {
                return new AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
