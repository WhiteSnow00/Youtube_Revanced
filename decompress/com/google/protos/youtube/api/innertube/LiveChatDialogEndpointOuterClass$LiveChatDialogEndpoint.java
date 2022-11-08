// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint extends agzi implements ahax
{
    public static final LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint a;
    private static volatile ahbe c;
    public static final agzg liveChatDialogEndpoint;
    public alnq b;
    private int d;
    private byte e;
    
    static {
        final LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint a2 = new LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint();
        agzi.registerDefaultInstance((Class)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class, (agzi)(a = a2));
        liveChatDialogEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 146867030, ahcm.k, (Class)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class);
    }
    
    private LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint() {
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
                if ((c = LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.c) == null) {
                    synchronized (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class) {
                        if (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.c == null) {
                            LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.c = (ahbe)new agzb((agzi)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.a);
            }
            case 3: {
                return new LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
