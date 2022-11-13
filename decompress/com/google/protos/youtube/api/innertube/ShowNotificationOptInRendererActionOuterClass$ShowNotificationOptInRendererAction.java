// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction extends ahbh implements ahcw
{
    public static final ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction a;
    private static volatile ahdd b;
    public static final ahbf showNotificationOptInRendererAction;
    
    static {
        final ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction a2 = new ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction();
        ahbh.registerDefaultInstance((Class)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class, (ahbh)(a = a2));
        showNotificationOptInRendererAction = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 135114359, ahek.k, (Class)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class);
    }
    
    private ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.b) == null) {
                    synchronized (ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class) {
                        if (ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.b == null) {
                            ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.b = (ahdd)new ahba((ahbh)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.a);
            }
            case 3: {
                return new ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.a, "\u0001\u0000", (Object[])null);
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
