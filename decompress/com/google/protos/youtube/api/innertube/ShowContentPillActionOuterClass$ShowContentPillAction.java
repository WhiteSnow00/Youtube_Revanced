// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowContentPillActionOuterClass$ShowContentPillAction extends ahbh implements ahcw
{
    public static final ShowContentPillActionOuterClass$ShowContentPillAction a;
    private static volatile ahdd d;
    public static final ahbf showContentPillAction;
    public int b;
    public aoga c;
    private byte e;
    
    static {
        final ShowContentPillActionOuterClass$ShowContentPillAction a2 = new ShowContentPillActionOuterClass$ShowContentPillAction();
        ahbh.registerDefaultInstance((Class)ShowContentPillActionOuterClass$ShowContentPillAction.class, (ahbh)(a = a2));
        showContentPillAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 135486026, ahek.k, (Class)ShowContentPillActionOuterClass$ShowContentPillAction.class);
    }
    
    private ShowContentPillActionOuterClass$ShowContentPillAction() {
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
                if ((d = ShowContentPillActionOuterClass$ShowContentPillAction.d) == null) {
                    synchronized (ShowContentPillActionOuterClass$ShowContentPillAction.class) {
                        if (ShowContentPillActionOuterClass$ShowContentPillAction.d == null) {
                            ShowContentPillActionOuterClass$ShowContentPillAction.d = (ahdd)new ahba((ahbh)ShowContentPillActionOuterClass$ShowContentPillAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowContentPillActionOuterClass$ShowContentPillAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowContentPillActionOuterClass$ShowContentPillAction.a);
            }
            case 3: {
                return new ShowContentPillActionOuterClass$ShowContentPillAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowContentPillActionOuterClass$ShowContentPillAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
