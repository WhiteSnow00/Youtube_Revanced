// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InviteMoreEndpointOuterClass$InviteMoreEndpoint extends agzi implements ahax
{
    public static final InviteMoreEndpointOuterClass$InviteMoreEndpoint a;
    private static volatile ahbe b;
    public static final agzg inviteMoreEndpoint;
    private int c;
    private anss d;
    private byte e;
    
    static {
        final InviteMoreEndpointOuterClass$InviteMoreEndpoint a2 = new InviteMoreEndpointOuterClass$InviteMoreEndpoint();
        agzi.registerDefaultInstance((Class)InviteMoreEndpointOuterClass$InviteMoreEndpoint.class, (agzi)(a = a2));
        inviteMoreEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 77296946, ahcm.k, (Class)InviteMoreEndpointOuterClass$InviteMoreEndpoint.class);
    }
    
    private InviteMoreEndpointOuterClass$InviteMoreEndpoint() {
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
                final ahbe b2;
                if ((b2 = InviteMoreEndpointOuterClass$InviteMoreEndpoint.b) == null) {
                    synchronized (InviteMoreEndpointOuterClass$InviteMoreEndpoint.class) {
                        if (InviteMoreEndpointOuterClass$InviteMoreEndpoint.b == null) {
                            InviteMoreEndpointOuterClass$InviteMoreEndpoint.b = (ahbe)new agzb((agzi)InviteMoreEndpointOuterClass$InviteMoreEndpoint.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return InviteMoreEndpointOuterClass$InviteMoreEndpoint.a;
            }
            case 4: {
                return new agza((agzi)InviteMoreEndpointOuterClass$InviteMoreEndpoint.a);
            }
            case 3: {
                return new InviteMoreEndpointOuterClass$InviteMoreEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)InviteMoreEndpointOuterClass$InviteMoreEndpoint.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
