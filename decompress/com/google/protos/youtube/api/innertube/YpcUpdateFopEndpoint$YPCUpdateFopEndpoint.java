// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcUpdateFopEndpoint$YPCUpdateFopEndpoint extends agzi implements ahax
{
    public static final YpcUpdateFopEndpoint$YPCUpdateFopEndpoint a;
    private static volatile ahbe c;
    public static final agzg ypcUpdateFopEndpoint;
    public String b;
    private int d;
    
    static {
        final YpcUpdateFopEndpoint$YPCUpdateFopEndpoint a2 = new YpcUpdateFopEndpoint$YPCUpdateFopEndpoint();
        agzi.registerDefaultInstance((Class)YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class, (agzi)(a = a2));
        ypcUpdateFopEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 151765852, ahcm.k, (Class)YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class);
    }
    
    private YpcUpdateFopEndpoint$YPCUpdateFopEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.c) == null) {
                    synchronized (YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.class) {
                        if (YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.c == null) {
                            YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.c = (ahbe)new agzb((agzi)YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.a);
            }
            case 3: {
                return new YpcUpdateFopEndpoint$YPCUpdateFopEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
