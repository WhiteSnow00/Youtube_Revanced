// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint extends ahbh implements ahcw
{
    public static final UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint a;
    private static volatile ahdd e;
    public static final ahbf unlimitedManageFamilyEndpoint;
    public int b;
    public String c;
    public ahab d;
    
    static {
        final UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint a2 = new UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint();
        ahbh.registerDefaultInstance((Class)UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class, (ahbh)(a = a2));
        unlimitedManageFamilyEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 129506414, ahek.k, (Class)UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class);
    }
    
    private UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint() {
        this.c = "";
        this.d = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.e) == null) {
                    synchronized (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class) {
                        if (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.e == null) {
                            UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.e = (ahdd)new ahba((ahbh)UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.a);
            }
            case 3: {
                return new UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u100a\u0002", new Object[] { "b", "c", "d" });
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
