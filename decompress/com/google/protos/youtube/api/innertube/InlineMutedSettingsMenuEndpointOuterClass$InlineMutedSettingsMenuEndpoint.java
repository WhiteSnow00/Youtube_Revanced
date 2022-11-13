// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint extends ahbh implements ahcw
{
    public static final InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint a;
    private static volatile ahdd b;
    public static final ahbf inlineMutedSettingsMenuEndpoint;
    
    static {
        final InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint a2 = new InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint();
        ahbh.registerDefaultInstance((Class)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class, (ahbh)(a = a2));
        inlineMutedSettingsMenuEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 148127366, ahek.k, (Class)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class);
    }
    
    private InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.b) == null) {
                    synchronized (InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.class) {
                        if (InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.b == null) {
                            InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.b = (ahdd)new ahba((ahbh)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.a);
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
