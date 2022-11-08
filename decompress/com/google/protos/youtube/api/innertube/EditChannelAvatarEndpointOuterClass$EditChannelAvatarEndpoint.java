// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint extends agzi implements ahax
{
    public static final EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint a;
    private static volatile ahbe b;
    public static final agzg editChannelAvatarEndpoint;
    
    static {
        final EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint a2 = new EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint();
        agzi.registerDefaultInstance((Class)EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.class, (agzi)(a = a2));
        editChannelAvatarEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 311688876, ahcm.k, (Class)EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.class);
    }
    
    private EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.b) == null) {
                    synchronized (EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.class) {
                        if (EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.b == null) {
                            EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.b = (ahbe)new agzb((agzi)EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.a;
            }
            case 4: {
                return new agza((agzi)EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.a);
            }
            case 3: {
                return new EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.a, "\u0001\u0000", (Object[])null);
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
