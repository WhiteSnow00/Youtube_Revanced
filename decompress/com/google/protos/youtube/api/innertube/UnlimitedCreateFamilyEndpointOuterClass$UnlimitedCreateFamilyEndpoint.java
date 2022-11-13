// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint extends ahbh implements ahcw
{
    public static final UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint a;
    private static volatile ahdd i;
    public static final ahbf unlimitedCreateFamilyEndpoint;
    public int b;
    public String c;
    public apax d;
    public aiqj e;
    public aiqj f;
    public String g;
    public ahab h;
    private apax j;
    private byte k;
    
    static {
        final UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint a2 = new UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint();
        ahbh.registerDefaultInstance((Class)UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class, (ahbh)(a = a2));
        unlimitedCreateFamilyEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 128069078, ahek.k, (Class)UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class);
    }
    
    private UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint() {
        this.k = 2;
        this.c = "";
        this.g = "";
        this.h = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.i) == null) {
                    synchronized (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class) {
                        if (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.i == null) {
                            UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.i = (ahdd)new ahba((ahbh)UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.a);
            }
            case 3: {
                return new UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001\u1008\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1008\u0006\b\u100a\u0007", new Object[] { "b", "c", "d", "j", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
