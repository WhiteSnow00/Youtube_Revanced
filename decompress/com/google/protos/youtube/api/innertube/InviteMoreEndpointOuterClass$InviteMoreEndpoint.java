// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InviteMoreEndpointOuterClass$InviteMoreEndpoint extends ahbh implements ahcw
{
    public static final InviteMoreEndpointOuterClass$InviteMoreEndpoint a;
    private static volatile ahdd b;
    public static final ahbf inviteMoreEndpoint;
    private int c;
    private anuv d;
    private byte e;
    
    static {
        final InviteMoreEndpointOuterClass$InviteMoreEndpoint a2 = new InviteMoreEndpointOuterClass$InviteMoreEndpoint();
        ahbh.registerDefaultInstance((Class)InviteMoreEndpointOuterClass$InviteMoreEndpoint.class, (ahbh)(a = a2));
        inviteMoreEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 77296946, ahek.k, (Class)InviteMoreEndpointOuterClass$InviteMoreEndpoint.class);
    }
    
    private InviteMoreEndpointOuterClass$InviteMoreEndpoint() {
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
                final ahdd b;
                if ((b = InviteMoreEndpointOuterClass$InviteMoreEndpoint.b) == null) {
                    synchronized (InviteMoreEndpointOuterClass$InviteMoreEndpoint.class) {
                        if (InviteMoreEndpointOuterClass$InviteMoreEndpoint.b == null) {
                            InviteMoreEndpointOuterClass$InviteMoreEndpoint.b = (ahdd)new ahba((ahbh)InviteMoreEndpointOuterClass$InviteMoreEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return InviteMoreEndpointOuterClass$InviteMoreEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)InviteMoreEndpointOuterClass$InviteMoreEndpoint.a);
            }
            case 3: {
                return new InviteMoreEndpointOuterClass$InviteMoreEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)InviteMoreEndpointOuterClass$InviteMoreEndpoint.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
