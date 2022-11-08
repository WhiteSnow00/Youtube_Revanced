// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcGetCartEndpoint$YPCGetCartEndpoint extends agzi implements ahax
{
    public static final YpcGetCartEndpoint$YPCGetCartEndpoint a;
    private static volatile ahbe o;
    public static final agzg ypcGetCartEndpoint;
    public int b;
    public String c;
    public agyc d;
    public String e;
    public long f;
    public String g;
    public alqg h;
    public apud i;
    public agzy j;
    public String k;
    public long l;
    public aotv m;
    public String n;
    private byte p;
    
    static {
        final YpcGetCartEndpoint$YPCGetCartEndpoint a2 = new YpcGetCartEndpoint$YPCGetCartEndpoint();
        agzi.registerDefaultInstance((Class)YpcGetCartEndpoint$YPCGetCartEndpoint.class, (agzi)(a = a2));
        ypcGetCartEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 95253721, ahcm.k, (Class)YpcGetCartEndpoint$YPCGetCartEndpoint.class);
    }
    
    private YpcGetCartEndpoint$YPCGetCartEndpoint() {
        this.p = 2;
        this.c = "";
        this.d = agyc.b;
        this.e = "";
        this.g = "";
        this.j = emptyProtobufList();
        this.k = "";
        this.n = "";
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
                final ahbe o3;
                if ((o3 = YpcGetCartEndpoint$YPCGetCartEndpoint.o) == null) {
                    synchronized (YpcGetCartEndpoint$YPCGetCartEndpoint.class) {
                        if (YpcGetCartEndpoint$YPCGetCartEndpoint.o == null) {
                            YpcGetCartEndpoint$YPCGetCartEndpoint.o = (ahbe)new agzb((agzi)YpcGetCartEndpoint$YPCGetCartEndpoint.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return YpcGetCartEndpoint$YPCGetCartEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcGetCartEndpoint$YPCGetCartEndpoint.a);
            }
            case 3: {
                return new YpcGetCartEndpoint$YPCGetCartEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcGetCartEndpoint$YPCGetCartEndpoint.a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0001\u0002\u0001\u1008\u0000\u0003\u1409\u0006\u0004\u100a\u0001\u0005\u1002\u0003\u0006\u1008\u0004\u0007\u1009\u0005\t\u041b\n\u1008\t\u000b\u1003\n\f\u1008\u0002\u000e\u1009\u000b\u000f\u1008\f", new Object[] { "b", "c", "i", "d", "f", "g", "h", "j", aioe.class, "k", "l", "e", "m", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
