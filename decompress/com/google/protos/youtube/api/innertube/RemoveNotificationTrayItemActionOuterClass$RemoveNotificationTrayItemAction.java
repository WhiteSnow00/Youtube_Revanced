// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction extends ahbh implements ahcw
{
    public static final RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction a;
    private static volatile ahdd d;
    public static final ahbf removeNotificationTrayItemAction;
    public String b;
    public int c;
    private int e;
    
    static {
        final RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction a2 = new RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction();
        ahbh.registerDefaultInstance((Class)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class, (ahbh)(a = a2));
        removeNotificationTrayItemAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 99968691, ahek.k, (Class)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class);
    }
    
    private RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.d) == null) {
                    synchronized (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class) {
                        if (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.d == null) {
                            RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.d = (ahdd)new ahba((ahbh)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.a;
            }
            case 4: {
                return new ahaz((ahbh)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.a);
            }
            case 3: {
                return new RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
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
