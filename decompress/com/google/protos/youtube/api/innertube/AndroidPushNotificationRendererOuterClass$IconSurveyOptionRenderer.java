// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer extends ahbh implements ahcw
{
    public static final AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer a;
    private static volatile ahdd g;
    public static final ahbf iconSurveyOptionRenderer;
    public int b;
    public akdi c;
    public aiqj d;
    public aiqj e;
    public alvw f;
    private byte h;
    
    static {
        final AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer a2 = new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
        ahbh.registerDefaultInstance((Class)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class, (ahbh)(a = a2));
        iconSurveyOptionRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 202680135, ahek.k, (Class)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class);
    }
    
    private AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.g) == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class) {
                        if (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.g == null) {
                            AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.g = (ahdd)new ahba((ahbh)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a);
            }
            case 3: {
                return new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a, "\u0001\u0004\u0000\u0001\u0001\u03e7\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u03e7\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
