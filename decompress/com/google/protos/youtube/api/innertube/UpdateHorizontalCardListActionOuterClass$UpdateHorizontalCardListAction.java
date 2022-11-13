// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction extends ahbh implements ahcw
{
    public static final UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction a;
    private static volatile ahdd e;
    public static final ahbf updateHorizontalCardListAction;
    public int b;
    public Object c;
    public apgb d;
    private int f;
    private byte g;
    
    static {
        final UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction a2 = new UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction();
        ahbh.registerDefaultInstance((Class)UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class, (ahbh)(a = a2));
        updateHorizontalCardListAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 139828682, ahek.k, (Class)UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class);
    }
    
    private UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction() {
        this.b = 0;
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.e) == null) {
                    synchronized (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class) {
                        if (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.e == null) {
                            UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.e = (ahdd)new ahba((ahbh)UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.a);
            }
            case 3: {
                return new UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u103b\u0000\u0002\u1409\u0002\u0003\u103b\u0000", new Object[] { "c", "b", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
