// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatAction$ClearChatWindowAction extends ahbh implements ahcw
{
    public static final LiveChatAction$ClearChatWindowAction a;
    private static volatile ahdd b;
    public static final ahbf clearChatWindowAction;
    
    static {
        final LiveChatAction$ClearChatWindowAction a2 = new LiveChatAction$ClearChatWindowAction();
        ahbh.registerDefaultInstance((Class)LiveChatAction$ClearChatWindowAction.class, (ahbh)(a = a2));
        clearChatWindowAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 430167970, ahek.k, (Class)LiveChatAction$ClearChatWindowAction.class);
    }
    
    private LiveChatAction$ClearChatWindowAction() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = LiveChatAction$ClearChatWindowAction.b) == null) {
                    synchronized (LiveChatAction$ClearChatWindowAction.class) {
                        if (LiveChatAction$ClearChatWindowAction.b == null) {
                            LiveChatAction$ClearChatWindowAction.b = (ahdd)new ahba((ahbh)LiveChatAction$ClearChatWindowAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LiveChatAction$ClearChatWindowAction.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatAction$ClearChatWindowAction.a);
            }
            case 3: {
                return new LiveChatAction$ClearChatWindowAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatAction$ClearChatWindowAction.a, "\u0001\u0000", (Object[])null);
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
