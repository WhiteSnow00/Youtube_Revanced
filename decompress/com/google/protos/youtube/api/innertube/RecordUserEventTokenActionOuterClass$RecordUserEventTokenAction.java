// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction extends agzi implements ahax
{
    public static final RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction a;
    private static volatile ahbe c;
    public static final agzg recordUserEventTokenAction;
    public String b;
    private int d;
    
    static {
        final RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction a2 = new RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction();
        agzi.registerDefaultInstance((Class)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class, (agzi)(a = a2));
        recordUserEventTokenAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 166884902, ahcm.k, (Class)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class);
    }
    
    private RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction() {
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
                if ((c = RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.c) == null) {
                    synchronized (RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class) {
                        if (RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.c == null) {
                            RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.c = (ahbe)new agzb((agzi)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.a;
            }
            case 4: {
                return new agza((agzi)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.a);
            }
            case 3: {
                return new RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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