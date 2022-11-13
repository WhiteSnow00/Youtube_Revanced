// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint extends ahbh implements ahcw
{
    public static final UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint a;
    private static volatile ahdd c;
    public static final ahbf updateHorizontalCardListActionEndpoint;
    public ahbx b;
    private byte d;
    
    static {
        final UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint a2 = new UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint();
        ahbh.registerDefaultInstance((Class)UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.class, (ahbh)(a = a2));
        updateHorizontalCardListActionEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 149801128, ahek.k, (Class)UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.class);
    }
    
    private UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint() {
        this.d = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.c) == null) {
                    synchronized (UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.class) {
                        if (UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.c == null) {
                            UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.c = (ahdd)new ahba((ahbh)UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.a);
            }
            case 3: {
                return new UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
