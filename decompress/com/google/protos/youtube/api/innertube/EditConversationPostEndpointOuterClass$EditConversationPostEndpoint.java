// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditConversationPostEndpointOuterClass$EditConversationPostEndpoint extends agzi implements ahax
{
    public static final EditConversationPostEndpointOuterClass$EditConversationPostEndpoint a;
    private static volatile ahbe b;
    public static final agzg editConversationPostEndpoint;
    
    static {
        final EditConversationPostEndpointOuterClass$EditConversationPostEndpoint a2 = new EditConversationPostEndpointOuterClass$EditConversationPostEndpoint();
        agzi.registerDefaultInstance((Class)EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class, (agzi)(a = a2));
        editConversationPostEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 88564668, ahcm.k, (Class)EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class);
    }
    
    private EditConversationPostEndpointOuterClass$EditConversationPostEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.b) == null) {
                    synchronized (EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class) {
                        if (EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.b == null) {
                            EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.b = (ahbe)new agzb((agzi)EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.a;
            }
            case 4: {
                return new agza((agzi)EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.a);
            }
            case 3: {
                return new EditConversationPostEndpointOuterClass$EditConversationPostEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.a, "\u0001\u0000", (Object[])null);
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
