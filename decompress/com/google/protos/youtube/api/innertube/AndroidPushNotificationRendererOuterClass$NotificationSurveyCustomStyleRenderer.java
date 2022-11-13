// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer extends ahbh implements ahcw
{
    public static final AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer a;
    private static volatile ahdd d;
    public static final ahbf notificationSurveyCustomStyleRenderer;
    public int b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        final AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer a2 = new AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer();
        ahbh.registerDefaultInstance((Class)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class, (ahbh)(a = a2));
        notificationSurveyCustomStyleRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 195330824, ahek.k, (Class)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class);
    }
    
    private AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer() {
        this.f = 2;
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.d) == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class) {
                        if (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.d == null) {
                            AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.d = (ahdd)new ahba((ahbh)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.a);
            }
            case 3: {
                return new AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u100c\u0000\u0002\u041b", new Object[] { "e", "b", amrq.a(), "c", anuv.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
