// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint extends agzi implements ahax
{
    public static final YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint a;
    private static volatile ahbe d;
    public static final agzg ypcGetOfflineUpsellEndpoint;
    public int b;
    public String c;
    
    static {
        final YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint a2 = new YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint();
        agzi.registerDefaultInstance((Class)YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class, (agzi)(a = a2));
        ypcGetOfflineUpsellEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 133724106, ahcm.k, (Class)YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class);
    }
    
    private YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.d) == null) {
                    synchronized (YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class) {
                        if (YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.d == null) {
                            YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.d = (ahbe)new agzb((agzi)YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.a);
            }
            case 3: {
                return new YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
