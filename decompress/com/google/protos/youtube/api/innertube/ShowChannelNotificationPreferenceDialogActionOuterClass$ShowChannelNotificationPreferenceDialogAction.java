// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction extends agzi implements ahax
{
    public static final ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction a;
    private static volatile ahbe c;
    public static final agzg showChannelNotificationPreferenceDialogAction;
    public aodv b;
    private int d;
    private byte e;
    
    static {
        final ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction a2 = new ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction();
        agzi.registerDefaultInstance((Class)ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class, (agzi)(a = a2));
        showChannelNotificationPreferenceDialogAction = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 90188060, ahcm.k, (Class)ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class);
    }
    
    private ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction() {
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
                final ahbe c;
                if ((c = ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.c) == null) {
                    synchronized (ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class) {
                        if (ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.c == null) {
                            ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.c = (ahbe)new agzb((agzi)ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.a;
            }
            case 4: {
                return new agza((agzi)ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.a);
            }
            case 3: {
                return new ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "d", "b" });
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
