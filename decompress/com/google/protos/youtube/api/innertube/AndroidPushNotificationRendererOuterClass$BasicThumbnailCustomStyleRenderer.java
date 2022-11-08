// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer extends agzi implements ahax
{
    public static final AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer a;
    public static final agzg basicThumbnailCustomStyleRenderer;
    private static volatile ahbe i;
    public int b;
    public int c;
    public Object d;
    public aorm e;
    public int f;
    public boolean g;
    public int h;
    private byte j;
    
    static {
        final AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer a2 = new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
        agzi.registerDefaultInstance((Class)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class, (agzi)(a = a2));
        basicThumbnailCustomStyleRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 179869979, ahcm.k, (Class)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class);
    }
    
    private AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer() {
        this.c = 0;
        this.j = 2;
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
                final ahbe i;
                if ((i = AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.i) == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class) {
                        if (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.i == null) {
                            AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.i = (ahbe)new agzb((agzi)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.a;
            }
            case 4: {
                return new agza((agzi)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.a);
            }
            case 3: {
                return new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001\u0003\u103e\u0000\u0004\u100c\u0006\u0005\u1007\u0005\u0006\u103a\u0000\u0007\u103a\u0000", new Object[] { "d", "c", "b", "e", "f", ampl.a(), "h", amom.g, "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
