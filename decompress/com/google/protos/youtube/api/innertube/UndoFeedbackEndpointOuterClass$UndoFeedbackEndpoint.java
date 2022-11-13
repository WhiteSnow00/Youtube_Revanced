// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint extends ahbh implements ahcw
{
    public static final UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint a;
    private static volatile ahdd d;
    public static final ahbf undoFeedbackEndpoint;
    public String b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        final UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint a2 = new UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint();
        ahbh.registerDefaultInstance((Class)UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class, (ahbh)(a = a2));
        undoFeedbackEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 75948536, ahek.k, (Class)UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class);
    }
    
    private UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint() {
        this.f = 2;
        this.b = "";
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.d) == null) {
                    synchronized (UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.class) {
                        if (UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.d == null) {
                            UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.d = (ahdd)new ahba((ahbh)UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.a);
            }
            case 3: {
                return new UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "e", "b", "c", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
