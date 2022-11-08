// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelWatchEndpointOuterClass$ReelWatchEndpoint extends agzi implements ahax
{
    private static volatile ahbe D;
    public static final ReelWatchEndpointOuterClass$ReelWatchEndpoint a;
    public static final agzg reelWatchEndpoint;
    public String A;
    public String B;
    public String C;
    private aioe E;
    private byte F;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    public int g;
    public String h;
    public aorm i;
    public aioe j;
    public anss k;
    public boolean l;
    public amvn m;
    public int n;
    public String o;
    public String p;
    public anss q;
    public anpy r;
    public aioe s;
    public String t;
    public aioe u;
    public apqa v;
    public agyc w;
    public anss x;
    public int y;
    public int z;
    
    static {
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint a2 = new ReelWatchEndpointOuterClass$ReelWatchEndpoint();
        agzi.registerDefaultInstance((Class)ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, (agzi)(a = a2));
        reelWatchEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 139608561, ahcm.k, (Class)ReelWatchEndpointOuterClass$ReelWatchEndpoint.class);
    }
    
    private ReelWatchEndpointOuterClass$ReelWatchEndpoint() {
        this.F = 2;
        this.e = "";
        this.f = "";
        this.h = "";
        this.o = "";
        this.p = "";
        this.t = "";
        this.w = agyc.b;
        this.A = "";
        this.B = "";
        this.C = "";
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
                if ((d = ReelWatchEndpointOuterClass$ReelWatchEndpoint.D) == null) {
                    synchronized (ReelWatchEndpointOuterClass$ReelWatchEndpoint.class) {
                        if (ReelWatchEndpointOuterClass$ReelWatchEndpoint.D == null) {
                            ReelWatchEndpointOuterClass$ReelWatchEndpoint.D = (ahbe)new agzb((agzi)ReelWatchEndpointOuterClass$ReelWatchEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ReelWatchEndpointOuterClass$ReelWatchEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ReelWatchEndpointOuterClass$ReelWatchEndpoint.a);
            }
            case 3: {
                return new ReelWatchEndpointOuterClass$ReelWatchEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelWatchEndpointOuterClass$ReelWatchEndpoint.a, "\u0001\u001c\u0000\u0001\u0001\ue8f4\u2614\u001c\u0000\u0000\b\u0001\u1008\u0002\u0002\u1008\u0004\u0003\u100b\u0005\u0004\u1008\u0006\u0005\u1409\u0007\u0007\u1409\b\b\u1409\t\n\u1007\n\u000b\u1008\u000f\f\u100c\f\r\u1008\r\u000e\u1409\u0011\u000f\u100c\u0001\u0010\u1009\u0012\u0011\u1409\u0013\u0012\u1008\u0014\u0016\u1409\u0015\u0017\u1009\u0016\u0018\u100a\u0017\u0019\u1409\u0018\u001a\u100c\u0019\u001b\u1004\u001a\u001c\u1008\u001b\u001d\u1008\u001c\u001e\u1008\u001d\u001f\u100c\u0000\u03e9\u1409\u000e\ue8f4\u2614\u1009\u000b", new Object[] { "b", "e", "f", "g", "h", "i", "j", "k", "l", "p", "n", anqs.b, "o", "q", "d", anoo.u, "r", "s", "t", "u", "v", "w", "x", "y", anoo.t, "z", "A", "B", "C", "c", anqs.i, "E", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.F = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.F;
            }
        }
    }
}
