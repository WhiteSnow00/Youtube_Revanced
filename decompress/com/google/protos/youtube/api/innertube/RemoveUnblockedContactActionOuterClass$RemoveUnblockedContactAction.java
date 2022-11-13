// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction extends ahbh implements ahcw
{
    public static final RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction a;
    private static volatile ahdd b;
    public static final ahbf removeUnblockedContactAction;
    
    static {
        final RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction a2 = new RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction();
        ahbh.registerDefaultInstance((Class)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class, (ahbh)(a = a2));
        removeUnblockedContactAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 125707981, ahek.k, (Class)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class);
    }
    
    private RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.b) == null) {
                    synchronized (RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class) {
                        if (RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.b == null) {
                            RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.b = (ahdd)new ahba((ahbh)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.a;
            }
            case 4: {
                return new ahaz((ahbh)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.a);
            }
            case 3: {
                return new RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.a, "\u0001\u0000", (Object[])null);
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
