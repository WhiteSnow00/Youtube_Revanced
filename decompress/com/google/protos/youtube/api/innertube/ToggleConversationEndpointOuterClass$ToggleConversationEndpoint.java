// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ToggleConversationEndpointOuterClass$ToggleConversationEndpoint extends ahbh implements ahcw
{
    public static final ToggleConversationEndpointOuterClass$ToggleConversationEndpoint a;
    private static volatile ahdd c;
    public static final ahbf toggleConversationEndpoint;
    public ahbx b;
    private byte d;
    
    static {
        final ToggleConversationEndpointOuterClass$ToggleConversationEndpoint a2 = new ToggleConversationEndpointOuterClass$ToggleConversationEndpoint();
        ahbh.registerDefaultInstance((Class)ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class, (ahbh)(a = a2));
        toggleConversationEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 131184017, ahek.k, (Class)ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class);
    }
    
    private ToggleConversationEndpointOuterClass$ToggleConversationEndpoint() {
        this.d = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.c) == null) {
                    synchronized (ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class) {
                        if (ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.c == null) {
                            ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.c = (ahdd)new ahba((ahbh)ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.a);
            }
            case 3: {
                return new ToggleConversationEndpointOuterClass$ToggleConversationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
