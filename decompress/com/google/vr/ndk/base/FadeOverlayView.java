// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.util.Log;
import android.view.animation.AnimationUtils;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import android.view.View;

class FadeOverlayView extends View
{
    private final boolean autoFadeEnabled;
    private final Handler autoFadeHandler;
    private long fadeDurationMillis;
    private float fadeStartOpacity;
    private long fadeStartTimeMillis;
    private int fadeType;
    private final Runnable fadeUpdateRunnable;
    private boolean flushAutoFadeOnVisible;
    private boolean visible;
    
    public FadeOverlayView(final Context context, final boolean autoFadeEnabled) {
        super(context);
        this.fadeType = 0;
        this.fadeUpdateRunnable = new FadeOverlayView$1(this);
        this.autoFadeHandler = new FadeOverlayView$2(this, Looper.getMainLooper());
        this.setBackgroundColor(-16777216);
        this.autoFadeEnabled = autoFadeEnabled;
    }
    
    private void endFade() {
        final int fadeType = this.fadeType;
        if (fadeType == 0) {
            return;
        }
        int visibility;
        if (fadeType == 2) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
        float alpha;
        if (this.fadeType == 2) {
            alpha = 1.0f;
        }
        else {
            alpha = 0.0f;
        }
        this.setAlpha(alpha);
        this.removeCallbacks(this.fadeUpdateRunnable);
        this.fadeType = 0;
        this.flushAutoFadeOnVisible = false;
    }
    
    private void removeFadeCallbacks() {
        this.autoFadeHandler.removeMessages(77337733);
        this.removeCallbacks(this.fadeUpdateRunnable);
    }
    
    private void updateFade() {
        final long n = AnimationUtils.currentAnimationTimeMillis() - this.fadeStartTimeMillis;
        float n2 = n / (float)this.fadeDurationMillis;
        if (this.fadeType == 1) {
            n2 = -n2;
        }
        final float min = Math.min(Math.max(this.fadeStartOpacity + n2, 0.0f), 1.0f);
        this.setAlpha(min);
        if (n < this.fadeDurationMillis && this.getVisibility() != 0) {
            this.setVisibility(0);
        }
        Label_0133: {
            if (n < this.fadeDurationMillis) {
                final int fadeType = this.fadeType;
                if (fadeType == 1) {
                    if (min <= 0.0f) {
                        break Label_0133;
                    }
                }
                else if (fadeType == 2 && min >= 1.0f) {
                    break Label_0133;
                }
                this.postOnAnimation(this.fadeUpdateRunnable);
                return;
            }
        }
        this.endFade();
    }
    
    public void flushAutoFade() {
        if (!this.autoFadeEnabled) {
            return;
        }
        if (this.autoFadeHandler.hasMessages(77337733)) {
            this.autoFadeHandler.removeMessages(77337733);
            this.autoFadeHandler.sendEmptyMessageDelayed(77337733, 200L);
            return;
        }
        if (!this.visible) {
            this.flushAutoFadeOnVisible = true;
        }
    }
    
    public void onInvisible() {
        if (!this.visible) {
            return;
        }
        this.visible = false;
        if (this.isEnabled() && this.autoFadeEnabled) {
            this.removeFadeCallbacks();
            this.fadeType = 2;
            this.endFade();
        }
    }
    
    public void onVisible() {
        if (this.visible && this.getAlpha() == 0.0f) {
            return;
        }
        this.visible = true;
        if (this.isEnabled() && this.autoFadeEnabled) {
            this.removeFadeCallbacks();
            final Handler autoFadeHandler = this.autoFadeHandler;
            long n;
            if (!this.flushAutoFadeOnVisible) {
                n = 1000L;
            }
            else {
                n = 200L;
            }
            autoFadeHandler.sendEmptyMessageDelayed(77337733, n);
            return;
        }
        this.fadeType = 1;
        this.endFade();
    }
    
    public void setEnabled(final boolean enabled) {
        if (this.isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        if (!enabled) {
            this.removeFadeCallbacks();
            this.fadeType = 1;
            this.endFade();
        }
    }
    
    public void startFade(final int fadeType, final long fadeDurationMillis, final int backgroundColor) {
        if (!this.isEnabled()) {
            Log.w("FadeOverlayView", "Ignoring fade request while disabled.");
            return;
        }
        if (!this.visible) {
            Log.w("FadeOverlayView", "Ignoring fade request while invisible.");
            return;
        }
        this.setBackgroundColor(backgroundColor);
        this.removeFadeCallbacks();
        this.fadeType = fadeType;
        this.fadeDurationMillis = fadeDurationMillis;
        this.fadeStartTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.fadeStartOpacity = this.getAlpha();
        this.updateFade();
    }
}
