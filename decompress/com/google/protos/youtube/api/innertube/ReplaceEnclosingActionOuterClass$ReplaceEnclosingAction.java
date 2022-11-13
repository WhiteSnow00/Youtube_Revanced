// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction extends ahbh implements ahcw
{
    public static final ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction a;
    private static volatile ahdd d;
    public static final ahbf replaceEnclosingAction;
    public int b;
    public anvg c;
    private byte e;
    
    static {
        final ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction a2 = new ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction();
        ahbh.registerDefaultInstance((Class)ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class, (ahbh)(a = a2));
        replaceEnclosingAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 77297283, ahek.k, (Class)ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class);
    }
    
    private ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.d) == null) {
                    synchronized (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class) {
                        if (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.d == null) {
                            ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.d = (ahdd)new ahba((ahbh)ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.a);
            }
            case 3: {
                return new ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
