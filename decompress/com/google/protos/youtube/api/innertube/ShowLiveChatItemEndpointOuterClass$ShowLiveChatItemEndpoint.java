// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint extends agzi implements ahax
{
    public static final ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint a;
    private static volatile ahbe d;
    public static final agzg showLiveChatItemEndpoint;
    public int b;
    public aloe c;
    private ahfw e;
    private byte f;
    
    static {
        final ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint a2 = new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
        agzi.registerDefaultInstance((Class)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class, (agzi)(a = a2));
        showLiveChatItemEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 135843030, ahcm.k, (Class)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class);
    }
    
    private ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint() {
        this.f = 2;
        final agyc b = agyc.b;
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
                final ahbe d;
                if ((d = ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.d) == null) {
                    synchronized (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class) {
                        if (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.d == null) {
                            ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.d = (ahbe)new agzb((agzi)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a);
            }
            case 3: {
                return new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
