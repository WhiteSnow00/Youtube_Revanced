// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RefreshAppActionOuterClass$RefreshAppAction extends ahbh implements ahcw
{
    public static final RefreshAppActionOuterClass$RefreshAppAction a;
    private static volatile ahdd b;
    public static final ahbf refreshAppAction;
    
    static {
        final RefreshAppActionOuterClass$RefreshAppAction a2 = new RefreshAppActionOuterClass$RefreshAppAction();
        ahbh.registerDefaultInstance((Class)RefreshAppActionOuterClass$RefreshAppAction.class, (ahbh)(a = a2));
        refreshAppAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 131467272, ahek.k, (Class)RefreshAppActionOuterClass$RefreshAppAction.class);
    }
    
    private RefreshAppActionOuterClass$RefreshAppAction() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = RefreshAppActionOuterClass$RefreshAppAction.b) == null) {
                    synchronized (RefreshAppActionOuterClass$RefreshAppAction.class) {
                        if (RefreshAppActionOuterClass$RefreshAppAction.b == null) {
                            RefreshAppActionOuterClass$RefreshAppAction.b = (ahdd)new ahba((ahbh)RefreshAppActionOuterClass$RefreshAppAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RefreshAppActionOuterClass$RefreshAppAction.a;
            }
            case 4: {
                return new ahaz((ahbh)RefreshAppActionOuterClass$RefreshAppAction.a);
            }
            case 3: {
                return new RefreshAppActionOuterClass$RefreshAppAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)RefreshAppActionOuterClass$RefreshAppAction.a, "\u0001\u0000", (Object[])null);
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
