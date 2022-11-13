// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ToggleConversationActionOuterClass$ToggleConversationAction extends ahbh implements ahcw
{
    public static final ToggleConversationActionOuterClass$ToggleConversationAction a;
    private static volatile ahdd d;
    public static final ahbf toggleConversationAction;
    public int b;
    public boolean c;
    
    static {
        final ToggleConversationActionOuterClass$ToggleConversationAction a2 = new ToggleConversationActionOuterClass$ToggleConversationAction();
        ahbh.registerDefaultInstance((Class)ToggleConversationActionOuterClass$ToggleConversationAction.class, (ahbh)(a = a2));
        toggleConversationAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 130528991, ahek.k, (Class)ToggleConversationActionOuterClass$ToggleConversationAction.class);
    }
    
    private ToggleConversationActionOuterClass$ToggleConversationAction() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ToggleConversationActionOuterClass$ToggleConversationAction.d) == null) {
                    synchronized (ToggleConversationActionOuterClass$ToggleConversationAction.class) {
                        if (ToggleConversationActionOuterClass$ToggleConversationAction.d == null) {
                            ToggleConversationActionOuterClass$ToggleConversationAction.d = (ahdd)new ahba((ahbh)ToggleConversationActionOuterClass$ToggleConversationAction.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ToggleConversationActionOuterClass$ToggleConversationAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ToggleConversationActionOuterClass$ToggleConversationAction.a);
            }
            case 3: {
                return new ToggleConversationActionOuterClass$ToggleConversationAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ToggleConversationActionOuterClass$ToggleConversationAction.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "b", "c" });
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
