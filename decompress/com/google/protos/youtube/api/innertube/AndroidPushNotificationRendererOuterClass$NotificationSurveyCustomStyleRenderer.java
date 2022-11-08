// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer extends agzi implements ahax
{
    public static final AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer a;
    private static volatile ahbe d;
    public static final agzg notificationSurveyCustomStyleRenderer;
    public int b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        final AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer a2 = new AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer();
        agzi.registerDefaultInstance((Class)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class, (agzi)(a = a2));
        notificationSurveyCustomStyleRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 195330824, ahcm.k, (Class)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class);
    }
    
    private AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer() {
        this.f = 2;
        this.c = emptyProtobufList();
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
                final ahbe d;
                if ((d = AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.d) == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class) {
                        if (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.d == null) {
                            AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.d = (ahbe)new agzb((agzi)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.a;
            }
            case 4: {
                return new agza((agzi)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.a);
            }
            case 3: {
                return new AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u100c\u0000\u0002\u041b", new Object[] { "e", "b", ampm.a(), "c", anss.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
