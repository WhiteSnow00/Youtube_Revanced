// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction extends agzi implements ahax
{
    public static final ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction a;
    private static volatile ahbe b;
    public static final agzg showPurchaseConfirmationDialogAction;
    private int c;
    private aoep d;
    private byte e;
    
    static {
        final ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction a2 = new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
        agzi.registerDefaultInstance((Class)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class, (agzi)(a = a2));
        showPurchaseConfirmationDialogAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 116405387, ahcm.k, (Class)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class);
    }
    
    private ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction() {
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
                if ((b2 = ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.b) == null) {
                    synchronized (ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class) {
                        if (ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.b == null) {
                            ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.b = (ahbe)new agzb((agzi)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.a;
            }
            case 4: {
                return new agza((agzi)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.a);
            }
            case 3: {
                return new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
