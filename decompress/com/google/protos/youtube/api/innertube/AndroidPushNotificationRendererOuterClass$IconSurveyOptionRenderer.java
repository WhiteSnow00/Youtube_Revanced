// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer extends agzi implements ahax
{
    public static final AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer a;
    private static volatile ahbe g;
    public static final agzg iconSurveyOptionRenderer;
    public int b;
    public akbf c;
    public aioe d;
    public aioe e;
    public alts f;
    private byte h;
    
    static {
        final AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer a2 = new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
        agzi.registerDefaultInstance((Class)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class, (agzi)(a = a2));
        iconSurveyOptionRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 202680135, ahcm.k, (Class)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class);
    }
    
    private AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer() {
        this.h = 2;
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
                final ahbe g;
                if ((g = AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.g) == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class) {
                        if (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.g == null) {
                            AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.g = (ahbe)new agzb((agzi)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a;
            }
            case 4: {
                return new agza((agzi)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a);
            }
            case 3: {
                return new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a, "\u0001\u0004\u0000\u0001\u0001\u03e7\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u03e7\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
