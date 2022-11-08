// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint extends agzi implements ahax
{
    public static final InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint a;
    private static volatile ahbe b;
    public static final agzg inlineMutedSettingsMenuEndpoint;
    
    static {
        final InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint a2 = new InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint();
        agzi.registerDefaultInstance((Class)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class, (agzi)(a = a2));
        inlineMutedSettingsMenuEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 148127366, ahcm.k, (Class)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class);
    }
    
    private InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.b) == null) {
                    synchronized (InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class) {
                        if (InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.b == null) {
                            InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.b = (ahbe)new agzb((agzi)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.a;
            }
            case 4: {
                return new agza((agzi)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.a);
            }
            case 3: {
                return new InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.a, "\u0001\u0000", (Object[])null);
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
