// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction extends agzi implements ahax
{
    public static final RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction a;
    private static volatile ahbe d;
    public static final agzg removeNotificationTrayItemAction;
    public String b;
    public int c;
    private int e;
    
    static {
        final RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction a2 = new RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction();
        agzi.registerDefaultInstance((Class)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class, (agzi)(a = a2));
        removeNotificationTrayItemAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 99968691, ahcm.k, (Class)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class);
    }
    
    private RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.d) == null) {
                    synchronized (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class) {
                        if (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.d == null) {
                            RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.d = (ahbe)new agzb((agzi)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.a;
            }
            case 4: {
                return new agza((agzi)RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.a);
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
