// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera;

import android.widget.SeekBar;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Handler;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.support.v7.widget.AppCompatSeekBar;

public class ShortsZoomSlider extends AppCompatSeekBar implements SeekBar$OnSeekBarChangeListener
{
    boolean a;
    boolean b;
    public float c;
    Handler d;
    final Runnable e;
    public avt f;
    public qpt g;
    
    public ShortsZoomSlider(final Context context) {
        super(context);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = (Runnable)new gwx(this, 1);
        this.i();
    }
    
    public ShortsZoomSlider(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = (Runnable)new gwx(this, 1);
        this.i();
    }
    
    public ShortsZoomSlider(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = (Runnable)new gwx(this, 1);
        this.i();
    }
    
    public static wyb a() {
        return wya.c(100840);
    }
    
    private final void i() {
        this.d = new Handler();
        this.setProgressDrawable(this.getContext().getDrawable(2131233965));
        this.setThumb(this.getContext().getDrawable(2131233967));
        this.setMax(1000);
        this.setVisibility(4);
        this.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
    }
    
    public final void b(final float c) {
        if (this.b) {
            return;
        }
        if (this.c != c) {
            if (c != this.getAlpha()) {
                this.c = c;
                this.animate().cancel();
                if (c > 0.0f && this.getVisibility() != 0) {
                    this.setAlpha(0.0f);
                    this.setVisibility(0);
                    final avt f = this.f;
                    if (f != null) {
                        f.S(a()).h();
                    }
                }
                this.animate().alpha(c).setDuration(100L).withEndAction((Runnable)new gwx(this, 0)).start();
            }
        }
    }
    
    public final void c(final float n, final boolean b) {
        this.setProgress(Math.min(1000, (int)(n * 1000.0f)));
        if (b) {
            this.b(0.3f);
        }
    }
    
    public final void d() {
        this.animate().cancel();
        this.a = false;
        this.d.removeCallbacks(this.e);
        this.c = -1.0f;
        if (!this.b) {
            if (this.f != null && this.getVisibility() == 0 && this.getAlpha() != 0.0f) {
                this.f.S(a()).f();
            }
            this.setVisibility(4);
        }
    }
    
    public final void e() {
        this.d.removeCallbacks(this.e);
        this.animate().cancel();
        this.setAlpha(1.0f);
        this.d.postDelayed(this.e, 2000L);
    }
    
    public final void f(final boolean b) {
        this.b = b;
        this.d();
        if (b) {
            if (this.f != null && avt.R((View)this, true)) {
                this.f.S(a()).h();
            }
            this.setVisibility(0);
        }
    }
    
    public final void g(final boolean b) {
        this.h(b, 2000);
    }
    
    public final void h(final boolean a, final int n) {
        this.a = a;
        if (!this.b && this.getVisibility() == 0) {
            float n2;
            if (!this.a) {
                n2 = 1.0f;
            }
            else {
                n2 = 0.3f;
            }
            this.b(n2);
            this.d.removeCallbacks(this.e);
            if (!this.a) {
                if (n <= 0) {
                    this.d.post(this.e);
                    return;
                }
                this.d.postDelayed(this.e, (long)n);
            }
        }
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            final qpt g = this.g;
            if (g != null) {
                final float n2 = n / 1000.0f;
                final gwe bj = ((gwg)g.a).bJ;
                if (bj != null) {
                    bj.b(n2);
                }
            }
            final avt f = this.f;
            if (f != null) {
                f.S(a()).i();
            }
            if (!this.b && !this.a) {
                this.e();
            }
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
