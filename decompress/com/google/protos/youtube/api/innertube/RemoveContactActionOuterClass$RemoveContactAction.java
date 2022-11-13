// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveContactActionOuterClass$RemoveContactAction extends ahbh implements ahcw
{
    public static final RemoveContactActionOuterClass$RemoveContactAction a;
    private static volatile ahdd b;
    public static final ahbf removeContactAction;
    
    static {
        final RemoveContactActionOuterClass$RemoveContactAction a2 = new RemoveContactActionOuterClass$RemoveContactAction();
        ahbh.registerDefaultInstance((Class)RemoveContactActionOuterClass$RemoveContactAction.class, (ahbh)(a = a2));
        removeContactAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 102580987, ahek.k, (Class)RemoveContactActionOuterClass$RemoveContactAction.class);
    }
    
    private RemoveContactActionOuterClass$RemoveContactAction() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = RemoveContactActionOuterClass$RemoveContactAction.b) == null) {
                    synchronized (RemoveContactActionOuterClass$RemoveContactAction.class) {
                        if (RemoveContactActionOuterClass$RemoveContactAction.b == null) {
                            RemoveContactActionOuterClass$RemoveContactAction.b = (ahdd)new ahba((ahbh)RemoveContactActionOuterClass$RemoveContactAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RemoveContactActionOuterClass$RemoveContactAction.a;
            }
            case 4: {
                return new ahaz((ahbh)RemoveContactActionOuterClass$RemoveContactAction.a);
            }
            case 3: {
                return new RemoveContactActionOuterClass$RemoveContactAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveContactActionOuterClass$RemoveContactAction.a, "\u0001\u0000", (Object[])null);
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
