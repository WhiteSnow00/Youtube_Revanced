// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer extends ahbh implements ahcw
{
    public static final AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer a;
    public static final ahbf basicThumbnailCustomStyleRenderer;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public aotp e;
    public int f;
    public boolean g;
    public int h;
    private byte j;
    
    static {
        final AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer a2 = new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
        ahbh.registerDefaultInstance((Class)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class, (ahbh)(a = a2));
        basicThumbnailCustomStyleRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 179869979, ahek.k, (Class)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class);
    }
    
    private AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer() {
        this.c = 0;
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.i) == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class) {
                        if (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.i == null) {
                            AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.i = (ahdd)new ahba((ahbh)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.a);
            }
            case 3: {
                return new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001\u0003\u103e\u0000\u0004\u100c\u0006\u0005\u1007\u0005\u0006\u103a\u0000\u0007\u103a\u0000", new Object[] { "d", "c", "b", "e", "f", amrp.a(), "h", ampw.h, "g" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
