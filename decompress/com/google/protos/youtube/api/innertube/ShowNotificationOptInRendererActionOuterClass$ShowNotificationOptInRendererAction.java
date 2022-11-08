// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction extends agzi implements ahax
{
    public static final ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction a;
    private static volatile ahbe b;
    public static final agzg showNotificationOptInRendererAction;
    
    static {
        final ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction a2 = new ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction();
        agzi.registerDefaultInstance((Class)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class, (agzi)(a = a2));
        showNotificationOptInRendererAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 135114359, ahcm.k, (Class)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class);
    }
    
    private ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.b) == null) {
                    synchronized (ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class) {
                        if (ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.b == null) {
                            ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.b = (ahbe)new agzb((agzi)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.a;
            }
            case 4: {
                return new agza((agzi)ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.a);
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
