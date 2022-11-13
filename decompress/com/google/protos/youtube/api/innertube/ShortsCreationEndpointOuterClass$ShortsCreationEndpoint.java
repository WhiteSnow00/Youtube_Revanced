// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShortsCreationEndpointOuterClass$ShortsCreationEndpoint extends ahbh implements ahcw
{
    public static final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint a;
    private static volatile ahdd l;
    public static final ahbf shortsCreationEndpoint;
    public int b;
    public ahbx c;
    public int d;
    public int e;
    public aiqj f;
    public ahbx g;
    public String h;
    public String i;
    public aoes j;
    public int k;
    private byte m;
    
    static {
        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint a2 = new ShortsCreationEndpointOuterClass$ShortsCreationEndpoint();
        ahbh.registerDefaultInstance((Class)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class, (ahbh)(a = a2));
        shortsCreationEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 307460408, ahek.k, (Class)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class);
    }
    
    private ShortsCreationEndpointOuterClass$ShortsCreationEndpoint() {
        this.m = 2;
        this.c = emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.l) == null) {
                    synchronized (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class) {
                        if (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.l == null) {
                            ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.l = (ahdd)new ahba((ahbh)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.a;
            }
            case 4: {
                return new ahaz((char[][])null, (short[][])null);
            }
            case 3: {
                return new ShortsCreationEndpointOuterClass$ShortsCreationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.a, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0002\u0003\u0002\u041b\u0003\u100c\u0001\u0004\u100c\u0002\u0005\u1409\u0003\u0006\u041b\u0007\u1008\u0004\b\u1008\u0005\t\u1009\u0006\n\u100c\u0007", new Object[] { "b", "c", anuv.class, "d", aoeu.a(), "e", aoet.a, "f", "g", anuv.class, "h", "i", "j", "k", aoet.e });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
