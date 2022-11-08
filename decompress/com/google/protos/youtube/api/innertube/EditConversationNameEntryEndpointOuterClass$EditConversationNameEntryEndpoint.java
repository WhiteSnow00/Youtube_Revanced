// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint extends agzi implements ahax
{
    public static final EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint a;
    private static volatile ahbe b;
    public static final agzg editConversationNameEntryEndpoint;
    private int c;
    private ajjd d;
    private byte e;
    
    static {
        final EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint a2 = new EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint();
        agzi.registerDefaultInstance((Class)EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class, (agzi)(a = a2));
        editConversationNameEntryEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 127156142, ahcm.k, (Class)EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class);
    }
    
    private EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.b) == null) {
                    synchronized (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class) {
                        if (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.b == null) {
                            EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.b = (ahbe)new agzb((agzi)EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.a;
            }
            case 4: {
                return new agza((agzi)EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.a);
            }
            case 3: {
                return new EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
