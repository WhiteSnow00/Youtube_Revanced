// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint extends agzi implements ahax
{
    public static final AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint a;
    public static final agzg adChoicesDialogEndpoint;
    private static volatile ahbe c;
    public ahiy b;
    private int d;
    private byte e;
    
    static {
        final AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint a2 = new AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint();
        agzi.registerDefaultInstance((Class)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class, (agzi)(a = a2));
        adChoicesDialogEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 83457823, ahcm.k, (Class)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class);
    }
    
    private AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint() {
        this.e = 2;
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
                final ahbe c;
                if ((c = AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.c) == null) {
                    synchronized (AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class) {
                        if (AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.c == null) {
                            AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.c = (ahbe)new agzb((agzi)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.a);
            }
            case 3: {
                return new AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
