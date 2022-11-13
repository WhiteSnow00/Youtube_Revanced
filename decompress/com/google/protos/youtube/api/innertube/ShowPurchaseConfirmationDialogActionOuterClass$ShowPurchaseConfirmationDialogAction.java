// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction extends ahbh implements ahcw
{
    public static final ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction a;
    private static volatile ahdd b;
    public static final ahbf showPurchaseConfirmationDialogAction;
    private int c;
    private aogs d;
    private byte e;
    
    static {
        final ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction a2 = new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
        ahbh.registerDefaultInstance((Class)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class, (ahbh)(a = a2));
        showPurchaseConfirmationDialogAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 116405387, ahek.k, (Class)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class);
    }
    
    private ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction() {
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
                final ahdd b;
                if ((b = ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.b) == null) {
                    synchronized (ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class) {
                        if (ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.b == null) {
                            ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.b = (ahdd)new ahba((ahbh)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.a);
            }
            case 3: {
                return new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
