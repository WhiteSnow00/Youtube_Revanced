// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import java.util.concurrent.TimeUnit;
import android.animation.AnimatorSet$Builder;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.os.PowerManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.os.CountDownTimer;
import android.animation.AnimatorSet;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class WaitingIndicatorView extends RelativeLayout
{
    public Circle a;
    public TextView b;
    public wte c;
    public boolean d;
    public boolean e;
    public int f;
    private AnimatorSet g;
    private CountDownTimer h;
    private boolean i;
    
    public WaitingIndicatorView(final Context context) {
        this(context, null);
    }
    
    public WaitingIndicatorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.i = false;
        LayoutInflater.from(context).inflate(2131624656, (ViewGroup)this, true);
        this.a = (Circle)this.findViewById(2131428201);
        this.b = (TextView)this.findViewById(2131428671);
    }
    
    public final void a() {
        this.d();
        final boolean powerSaveMode = ((PowerManager)this.getContext().getSystemService("power")).isPowerSaveMode();
        this.i = powerSaveMode;
        if (powerSaveMode) {
            return;
        }
        this.g = new AnimatorSet();
        final float a = this.a.a;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 360.0f });
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new usg(this, 12));
        ofFloat.addListener((Animator$AnimatorListener)new wsz(this));
        ofFloat.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(650L);
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.0f, 360.0f });
        ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new wta(this, a));
        ofFloat2.addListener((Animator$AnimatorListener)new wtb(this));
        ofFloat2.setDuration(350L);
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.b, "translationY", new float[] { 50.0f, 0.0f });
        ofFloat3.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        long n = 300L;
        ofFloat3.setDuration(300L);
        final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)this.b, "alpha", new float[] { 0.0f, 1.0f });
        ofFloat4.setDuration(300L);
        this.g.play((Animator)ofFloat).before((Animator)ofFloat2);
        this.g.play((Animator)ofFloat).with((Animator)ofFloat3).with((Animator)ofFloat4);
        this.g.addListener((Animator$AnimatorListener)new wtc(this));
        final AnimatorSet set = new AnimatorSet();
        final AnimatorSet$Builder play = set.play((Animator)this.g);
        if (tqt.e(this.getContext())) {
            n = 5000L;
        }
        play.after(n);
        set.start();
    }
    
    public final void b() {
        this.c(3);
    }
    
    public final void c(final int f) {
        if (this.i) {
            this.b.setVisibility(0);
            (this.h = (CountDownTimer)new wtd(this, TimeUnit.SECONDS.toMillis(3L) + 300L)).start();
            return;
        }
        this.f = f;
        this.e = true;
        this.d = true;
    }
    
    public final void d() {
        final AnimatorSet g = this.g;
        if (g != null) {
            g.removeAllListeners();
            this.g.end();
            this.g.cancel();
            this.g = null;
        }
        final CountDownTimer h = this.h;
        if (h != null) {
            h.cancel();
            this.h = null;
        }
        this.d = false;
        this.e = false;
        this.f = 0;
        this.a.setVisibility(4);
        this.b.setVisibility(4);
        this.b.setText((CharSequence)"");
    }
}
