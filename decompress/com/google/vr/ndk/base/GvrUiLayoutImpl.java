// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import android.view.ViewGroup;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.content.Context;
import android.animation.ObjectAnimator;

class GvrUiLayoutImpl extends ardv
{
    private final Runnable beginDimmingUiLayerRunnable;
    private final GvrUiLayoutImpl$CloseButtonListenerWrapper closeButtonListener;
    private boolean daydreamModeEnabled;
    private final Runnable delayDimmingUiLayerAfterVisibleRunnable;
    private final arcx uiLayer;
    private ObjectAnimator uiLayerDimmingAnimation;
    
    public static void $r8$lambda$Aw0iq_5OskyqrS0baZu6EbIZOMA(final GvrUiLayoutImpl gvrUiLayoutImpl) {
        gvrUiLayoutImpl.beginDimmingUiLayer();
    }
    
    static /* bridge */ Runnable -$$Nest$smcreateDefaultCloseButtonListener(final Context context, final DaydreamUtilsWrapper daydreamUtilsWrapper) {
        return createDefaultCloseButtonListener(context, daydreamUtilsWrapper);
    }
    
    public GvrUiLayoutImpl(final Context context, final Runnable runnable) {
        this(context, runnable, new DaydreamUtilsWrapper());
    }
    
    public GvrUiLayoutImpl(final Context context, final Runnable runnable, final DaydreamUtilsWrapper daydreamUtilsWrapper) {
        this.delayDimmingUiLayerAfterVisibleRunnable = new GvrUiLayoutImpl$$ExternalSyntheticLambda1(this);
        this.beginDimmingUiLayerRunnable = new GvrUiLayoutImpl$$ExternalSyntheticLambda2(this);
        this.daydreamModeEnabled = false;
        final GvrUiLayoutImpl$CloseButtonListenerWrapper gvrUiLayoutImpl$CloseButtonListenerWrapper = new GvrUiLayoutImpl$CloseButtonListenerWrapper(context, runnable, daydreamUtilsWrapper);
        this.closeButtonListener = gvrUiLayoutImpl$CloseButtonListenerWrapper;
        final arcx uiLayer = new arcx(context);
        this.uiLayer = uiLayer;
        uiLayer.l = gvrUiLayoutImpl$CloseButtonListenerWrapper;
        arcq.a((Runnable)new agjf(uiLayer, (Runnable)gvrUiLayoutImpl$CloseButtonListenerWrapper, 17));
    }
    
    private void beginDimmingUiLayer() {
        this.cancelDimmingUiLayer();
        final arct h = this.uiLayer.h;
        if (h != null && h.getVisibility() == 0) {
            this.getRoot().postDelayed(this.delayDimmingUiLayerAfterVisibleRunnable, 100L);
            return;
        }
        (this.uiLayerDimmingAnimation = ObjectAnimator.ofFloat((Object)this.uiLayer.b, View.ALPHA, new float[] { 1.0f, 0.2f })).setDuration(500L);
        this.uiLayerDimmingAnimation.start();
        this.setDimmedUiTouchOverride();
    }
    
    private static Runnable createDefaultCloseButtonListener(final Context context, final DaydreamUtilsWrapper daydreamUtilsWrapper) {
        final Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        final Activity t = arbu.t(context);
        if (t == null) {
            return new GvrUiLayoutImpl$1(context, intent);
        }
        if (daydreamUtilsWrapper.isDaydreamActivity(t)) {
            return new GvrUiLayoutImpl$2(t, intent);
        }
        return new GvrUiLayoutImpl$3(t);
    }
    
    private void delayDimmingUiLayer(final long n) {
        this.cancelDimmingUiLayer();
        this.getRoot().postDelayed(this.beginDimmingUiLayerRunnable, n);
    }
    
    private void setDimmedUiTouchOverride() {
        this.uiLayer.k = new GvrUiLayoutImpl$$ExternalSyntheticLambda0(this);
    }
    
    public void cancelDimmingUiLayer() {
        this.getRoot().removeCallbacks(this.beginDimmingUiLayerRunnable);
        final ObjectAnimator uiLayerDimmingAnimation = this.uiLayerDimmingAnimation;
        if (uiLayerDimmingAnimation != null) {
            uiLayerDimmingAnimation.cancel();
            this.uiLayerDimmingAnimation = null;
        }
        ((ViewGroup)this.uiLayer.b).setAlpha(1.0f);
        this.uiLayer.k = null;
    }
    
    public void delayDimmingUiLayerAfterVisible() {
        this.delayDimmingUiLayer(2500L);
    }
    
    public ViewGroup getRoot() {
        return (ViewGroup)this.uiLayer.b;
    }
    
    public ardz getRootView() {
        return ObjectWrapper.a((Object)this.uiLayer.b);
    }
    
    public void invokeCloseButtonListener() {
        this.closeButtonListener.run();
    }
    
    public boolean isEnabled() {
        return this.uiLayer.i;
    }
    
    public void lambda$setDimmedUiTouchOverride$0$com-google-vr-ndk-base-GvrUiLayoutImpl() {
        this.delayDimmingUiLayer(5000L);
    }
    
    public void setCloseButtonListener(final ardz ardz) {
        Runnable clientCloseButtonListener;
        if (ardz != null) {
            clientCloseButtonListener = (Runnable)ObjectWrapper.b(ardz, (Class)Runnable.class);
        }
        else {
            clientCloseButtonListener = null;
        }
        this.closeButtonListener.setClientCloseButtonListener(clientCloseButtonListener);
    }
    
    public void setDaydreamModeEnabled(final boolean daydreamModeEnabled) {
        if (this.daydreamModeEnabled == daydreamModeEnabled) {
            return;
        }
        this.daydreamModeEnabled = daydreamModeEnabled;
        if (daydreamModeEnabled) {
            this.uiLayer.d(0.35f);
            this.uiLayer.e(false);
            return;
        }
        this.uiLayer.d(1.0f);
    }
    
    public void setEnabled(final boolean i) {
        final arcx uiLayer = this.uiLayer;
        uiLayer.i = i;
        arcq.a((Runnable)new a(uiLayer, i, 20));
    }
    
    public void setSettingsButtonEnabled(final boolean j) {
        final arcx uiLayer = this.uiLayer;
        uiLayer.j = j;
        arcq.a((Runnable)new asbg(uiLayer, j, 1));
    }
    
    public void setSettingsButtonListener(final ardz ardz) {
        final arcx uiLayer = this.uiLayer;
        Runnable m;
        if (ardz != null) {
            m = (Runnable)ObjectWrapper.b(ardz, (Class)Runnable.class);
        }
        else {
            m = null;
        }
        uiLayer.m = m;
    }
    
    public void setTransitionViewEnabled(final boolean b) {
        final arcx uiLayer = this.uiLayer;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (!this.daydreamModeEnabled) {
                b2 = true;
            }
        }
        uiLayer.e(b2);
    }
    
    public void setTransitionViewListener(final ardz ardz) {
        final arcx uiLayer = this.uiLayer;
        Runnable n;
        if (ardz != null) {
            n = (Runnable)ObjectWrapper.b(ardz, (Class)Runnable.class);
        }
        else {
            n = null;
        }
        uiLayer.n = n;
        arcq.a((Runnable)new agjf(uiLayer, n, 15));
    }
    
    public void setViewerName(final String o) {
        final arcx uiLayer = this.uiLayer;
        uiLayer.o = o;
        arcq.a((Runnable)new agjf(uiLayer, o, 16));
    }
}
