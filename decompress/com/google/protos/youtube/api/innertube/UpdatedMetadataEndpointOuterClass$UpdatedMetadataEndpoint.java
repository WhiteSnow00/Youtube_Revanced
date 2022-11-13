// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint extends ahbh implements ahcw
{
    public static final UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint a;
    private static volatile ahdd d;
    public static final ahbf updatedMetadataEndpoint;
    public int b;
    public String c;
    
    static {
        final UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint a2 = new UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint();
        ahbh.registerDefaultInstance((Class)UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.class, (ahbh)(a = a2));
        updatedMetadataEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 124861221, ahek.k, (Class)UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.class);
    }
    
    private UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.d) == null) {
                    synchronized (UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.class) {
                        if (UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.d == null) {
                            UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.d = (ahdd)new ahba((ahbh)UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.a);
            }
            case 3: {
                return new UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
