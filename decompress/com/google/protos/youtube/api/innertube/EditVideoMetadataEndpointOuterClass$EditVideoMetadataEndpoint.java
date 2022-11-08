// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint extends agzi implements ahax
{
    public static final EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint a;
    private static volatile ahbe d;
    public static final agzg editVideoMetadataEndpoint;
    public int b;
    public String c;
    
    static {
        final EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint a2 = new EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint();
        agzi.registerDefaultInstance((Class)EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class, (agzi)(a = a2));
        editVideoMetadataEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 63560970, ahcm.k, (Class)EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class);
    }
    
    private EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint() {
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
                if ((d = EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.d) == null) {
                    synchronized (EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class) {
                        if (EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.d == null) {
                            EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.d = (ahbe)new agzb((agzi)EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.a;
            }
            case 4: {
                return new agza((agzi)EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.a);
            }
            case 3: {
                return new EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
