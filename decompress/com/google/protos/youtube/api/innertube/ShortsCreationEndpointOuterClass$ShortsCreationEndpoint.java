// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShortsCreationEndpointOuterClass$ShortsCreationEndpoint extends agzi implements ahax
{
    public static final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint a;
    private static volatile ahbe l;
    public static final agzg shortsCreationEndpoint;
    public int b;
    public agzy c;
    public int d;
    public int e;
    public aioe f;
    public agzy g;
    public String h;
    public String i;
    public aocq j;
    public int k;
    private byte m;
    
    static {
        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint a2 = new ShortsCreationEndpointOuterClass$ShortsCreationEndpoint();
        agzi.registerDefaultInstance((Class)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class, (agzi)(a = a2));
        shortsCreationEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 307460408, ahcm.k, (Class)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class);
    }
    
    private ShortsCreationEndpointOuterClass$ShortsCreationEndpoint() {
        this.m = 2;
        this.c = emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = "";
        this.i = "";
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
                final ahbe l;
                if ((l = ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.l) == null) {
                    synchronized (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class) {
                        if (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.l == null) {
                            ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.l = (ahbe)new agzb((agzi)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.a;
            }
            case 4: {
                return new agza((float[][])null, (char[][][])null);
            }
            case 3: {
                return new ShortsCreationEndpointOuterClass$ShortsCreationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.a, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0002\u0003\u0002\u041b\u0003\u100c\u0001\u0004\u100c\u0002\u0005\u1409\u0003\u0006\u041b\u0007\u1008\u0004\b\u1008\u0005\t\u1009\u0006\n\u100c\u0007", new Object[] { "b", "c", anss.class, "d", aocs.a(), "e", aocr.b, "f", "g", anss.class, "h", "i", "j", "k", aocr.d });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
