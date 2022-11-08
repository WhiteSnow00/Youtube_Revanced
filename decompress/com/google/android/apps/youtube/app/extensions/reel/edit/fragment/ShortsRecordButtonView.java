// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.View$AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.animation.Animator;
import android.widget.FrameLayout;

public class ShortsRecordButtonView extends FrameLayout
{
    Animator a;
    public final int b;
    final int c;
    final int d;
    public final int e;
    public final ImageView f;
    public final ImageView g;
    final GradientDrawable h;
    final GradientDrawable i;
    int j;
    int k;
    public boolean l;
    public boolean m;
    private final FrameLayout n;
    private boolean o;
    private boolean p;
    
    public ShortsRecordButtonView(final Context context, final AttributeSet set) {
        super(context, set);
        LayoutInflater.from(context).inflate(2131625413, (ViewGroup)this, true);
        (this.n = (FrameLayout)this.findViewById(2131431505)).setAccessibilityDelegate((View$AccessibilityDelegate)new hji());
        this.d();
        final ImageView f = (ImageView)this.findViewById(2131431503);
        this.f = f;
        final ImageView g = (ImageView)this.findViewById(2131431504);
        this.g = g;
        this.h = (GradientDrawable)g.getDrawable();
        this.i = (GradientDrawable)f.getDrawable();
        this.b = this.getResources().getDimensionPixelSize(2131169702);
        this.j = this.getResources().getColor(2131102071);
        this.k = this.getResources().getColor(2131102072);
        this.c = this.getResources().getDimensionPixelSize(2131169699);
        this.d = this.getResources().getDimensionPixelSize(2131169698);
        this.e = this.getResources().getDimensionPixelOffset(2131169703);
    }
    
    public static void a(final View view, final float n, final float n2) {
        view.animate().translationX(n).translationY(n2).setDuration(50L).start();
    }
    
    private final void i() {
        a((View)this.f, 0.0f, 0.0f);
        a((View)this.g, 0.0f, 0.0f);
        this.m = false;
    }
    
    public final void b() {
        if (this.l) {
            final Animator a = this.a;
            if (a != null && a.isRunning()) {
                this.a.cancel();
            }
            if (!this.p) {
                final AnimatorSet a2 = new AnimatorSet();
                final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.g, "scaleX", new float[] { 1.8472222f });
                ofFloat.setDuration(500L);
                ofFloat.setInterpolator((TimeInterpolator)new ats());
                final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.g, "scaleY", new float[] { 1.8472222f });
                ofFloat2.setDuration(500L);
                ofFloat2.setInterpolator((TimeInterpolator)new ats());
                final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.f, "scaleX", new float[] { 1.0f });
                ofFloat3.setDuration(200L);
                ofFloat3.setInterpolator((TimeInterpolator)new ats());
                final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)this.f, "scaleY", new float[] { 1.0f });
                ofFloat4.setDuration(200L);
                ofFloat4.setInterpolator((TimeInterpolator)new ats());
                final int k = this.k;
                ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hjk(this, k, k));
                final AnimatorSet set = new AnimatorSet();
                set.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2, (Animator)ofFloat3, (Animator)ofFloat4 });
                final ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((Object)this.g, "scaleX", new float[] { 1.8472222f, 1.5277778f });
                ofFloat5.setDuration(1000L);
                ofFloat5.setRepeatCount(-1);
                ofFloat5.setRepeatMode(2);
                final ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((Object)this.g, "scaleY", new float[] { 1.8472222f, 1.5277778f });
                ofFloat6.setDuration(1000L);
                ofFloat6.setRepeatCount(-1);
                ofFloat6.setRepeatMode(2);
                final int i = this.k;
                ofFloat6.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hjk(this, i, i));
                final AnimatorSet set2 = new AnimatorSet();
                set2.playTogether(new Animator[] { (Animator)ofFloat5, (Animator)ofFloat6 });
                a2.playSequentially(new Animator[] { (Animator)set, (Animator)set2 });
                (this.a = (Animator)a2).start();
                return;
            }
            final ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat((Object)this.g, "scaleX", new float[] { 1.2222222f });
            ofFloat7.setDuration(100L);
            ofFloat7.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat((Object)this.g, "scaleY", new float[] { 1.2222222f });
            ofFloat8.setDuration(100L);
            ofFloat8.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat((Object)this.f, "scaleX", new float[] { 0.5714286f });
            ofFloat9.setDuration(100L);
            ofFloat9.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat((Object)this.f, "scaleY", new float[] { 0.5714286f });
            ofFloat10.setDuration(100L);
            ofFloat10.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat((Object)this.i, "cornerRadius", new float[] { (float)this.c });
            ofFloat11.setDuration(100L);
            ofFloat11.setInterpolator((TimeInterpolator)new ats());
            final int j = this.k;
            ofFloat8.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hjk(this, j, j));
            final AnimatorSet a3 = new AnimatorSet();
            a3.playTogether(new Animator[] { (Animator)ofFloat7, (Animator)ofFloat8, (Animator)ofFloat9, (Animator)ofFloat10, (Animator)ofFloat11 });
            (this.a = (Animator)a3).start();
        }
    }
    
    public final void c() {
        final Animator a = this.a;
        if (a != null && a.isRunning()) {
            this.a.cancel();
        }
        this.l = false;
        this.o = false;
        this.m = false;
        this.i.setCornerRadius((float)this.d);
        this.f.setScaleX(1.0f);
        this.f.setScaleY(1.0f);
        this.f.setTranslationX(0.0f);
        this.f.setTranslationY(0.0f);
        this.g.setScaleX(1.0f);
        this.g.setScaleY(1.0f);
        this.g.setTranslationX(0.0f);
        this.g.setTranslationY(0.0f);
        this.e(this.b, this.j);
    }
    
    public final void d() {
        this.setContentDescription(this.getResources().getString(2132019712));
    }
    
    public final void e(final int n, final int n2) {
        this.h.setStroke(n, n2);
    }
    
    public final void f() {
        this.p = true;
        this.i();
        this.b();
    }
    
    public final void g() {
        this.p = false;
        this.l = false;
        this.o = false;
        final Animator a = this.a;
        if (a != null && a.isRunning()) {
            this.a.end();
        }
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.g, "scaleX", new float[] { 1.0f, 1.1412036f });
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator((TimeInterpolator)new LinearInterpolator());
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.g, "scaleY", new float[] { 1.0f, 1.1412036f });
        ofFloat2.setDuration(100L);
        ofFloat2.setInterpolator((TimeInterpolator)new LinearInterpolator());
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.f, "scaleX", new float[] { 1.0f, 0.9f });
        ofFloat3.setDuration(100L);
        ofFloat3.setInterpolator((TimeInterpolator)new LinearInterpolator());
        final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)this.f, "scaleY", new float[] { 1.0f, 0.9f });
        ofFloat4.setDuration(100L);
        ofFloat4.setInterpolator((TimeInterpolator)new LinearInterpolator());
        ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hjk(this, this.j, this.k));
        final AnimatorSet a2 = new AnimatorSet();
        a2.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2, (Animator)ofFloat3, (Animator)ofFloat4 });
        (this.a = (Animator)a2).addListener((Animator$AnimatorListener)new hjj(this));
        this.a.start();
    }
    
    public final void h() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.l = false;
        final Animator a = this.a;
        if (a != null && a.isRunning()) {
            this.a.cancel();
        }
        if (this.p) {
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.g, "scaleX", new float[] { 1.0f });
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.g, "scaleY", new float[] { 1.0f });
            ofFloat2.setDuration(200L);
            ofFloat2.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.f, "scaleX", new float[] { 1.0f });
            ofFloat3.setDuration(200L);
            ofFloat3.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)this.f, "scaleY", new float[] { 1.0f });
            ofFloat4.setDuration(200L);
            ofFloat4.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((Object)this.i, "cornerRadius", new float[] { (float)this.d });
            ofFloat5.setDuration(200L);
            ofFloat5.setInterpolator((TimeInterpolator)new ats());
            ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hjk(this, this.k, this.j));
            final AnimatorSet a2 = new AnimatorSet();
            a2.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2, (Animator)ofFloat3, (Animator)ofFloat4, (Animator)ofFloat5 });
            (this.a = (Animator)a2).start();
        }
        else {
            final ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((Object)this.g, "scaleX", new float[] { 1.0f });
            ofFloat6.setDuration(200L);
            final ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat((Object)this.g, "scaleY", new float[] { 1.0f });
            ofFloat7.setDuration(200L);
            final ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat((Object)this.f, "scaleX", new float[] { 1.0f });
            ofFloat8.setDuration(200L);
            ofFloat8.setInterpolator((TimeInterpolator)new ats());
            final ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat((Object)this.f, "scaleY", new float[] { 1.0f });
            ofFloat9.setDuration(200L);
            ofFloat9.setInterpolator((TimeInterpolator)new ats());
            ofFloat7.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hjk(this, this.k, this.j));
            final AnimatorSet a3 = new AnimatorSet();
            a3.playTogether(new Animator[] { (Animator)ofFloat6, (Animator)ofFloat7, (Animator)ofFloat8, (Animator)ofFloat9 });
            (this.a = (Animator)a3).start();
        }
        this.i();
    }
    
    public final void setContentDescription(final CharSequence contentDescription) {
        this.n.setContentDescription(contentDescription);
    }
    
    public final void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            this.i.setAlpha(255);
            this.h.setAlpha(255);
            return;
        }
        this.i.setAlpha(128);
        this.h.setAlpha(128);
    }
    
    public final void setOnClickListener(final View$OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
    }
    
    public final void setOnTouchListener(final View$OnTouchListener onTouchListener) {
        this.n.setOnTouchListener(onTouchListener);
    }
}
