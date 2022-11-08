// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint extends agzi implements ahax
{
    public static final EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint a;
    private static volatile ahbe c;
    public static final agzg editVideoThumbnailEndpoint;
    public String b;
    private int d;
    
    static {
        final EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint a2 = new EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint();
        agzi.registerDefaultInstance((Class)EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class, (agzi)(a = a2));
        editVideoThumbnailEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 136550626, ahcm.k, (Class)EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class);
    }
    
    private EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint() {
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
                if ((c = EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.c) == null) {
                    synchronized (EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class) {
                        if (EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.c == null) {
                            EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.c = (ahbe)new agzb((agzi)EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.a;
            }
            case 4: {
                return new agza((agzi)EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.a);
            }
            case 3: {
                return new EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
