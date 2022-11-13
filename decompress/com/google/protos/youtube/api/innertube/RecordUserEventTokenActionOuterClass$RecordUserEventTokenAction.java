// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction extends ahbh implements ahcw
{
    public static final RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction a;
    private static volatile ahdd c;
    public static final ahbf recordUserEventTokenAction;
    public String b;
    private int d;
    
    static {
        final RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction a2 = new RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction();
        ahbh.registerDefaultInstance((Class)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class, (ahbh)(a = a2));
        recordUserEventTokenAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 166884902, ahek.k, (Class)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class);
    }
    
    private RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.c) == null) {
                    synchronized (RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.class) {
                        if (RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.c == null) {
                            RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.c = (ahdd)new ahba((ahbh)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.a;
            }
            case 4: {
                return new ahaz((ahbh)RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.a);
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
