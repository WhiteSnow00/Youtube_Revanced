// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.ui;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.View;
import android.content.res.TypedArray;
import android.widget.ImageView;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

public class UndoRedoButtonView extends FrameLayout
{
    final AnimatorSet a;
    final AnimatorSet b;
    ValueAnimator c;
    ValueAnimator d;
    ValueAnimator e;
    ValueAnimator f;
    private final Context g;
    private int h;
    
    public UndoRedoButtonView(final Context g, final AttributeSet set) {
        super(g, set);
        this.a = new AnimatorSet();
        this.b = new AnimatorSet();
        int h = 0;
        this.h = 0;
        this.g = g;
        if (set != null) {
            final TypedArray obtainStyledAttributes = g.getTheme().obtainStyledAttributes(set, txl.c, 0, 0);
            if (obtainStyledAttributes.getInt(0, 0) != 0) {
                h = 1;
            }
            this.h = h;
            obtainStyledAttributes.recycle();
            return;
        }
        ((ImageView)this.findViewById(2131427928)).setImageResource(2131231428);
    }
    
    public final void a() {
        if (this.getVisibility() == 0) {
            return;
        }
        final AnimatorSet a = this.a;
        if (this.c == null) {
            (this.c = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, View.ALPHA, new float[] { 0.0f, 1.0f }).setDuration(300L)).addListener((Animator$AnimatorListener)new txn(this));
        }
        final ValueAnimator c = this.c;
        if (this.d == null) {
            if (this.h == 0) {
                this.d = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, View.ROTATION, new float[] { -15.0f, 0.0f }).setDuration(300L);
            }
            else {
                this.d = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, View.ROTATION, new float[] { 15.0f, 0.0f }).setDuration(300L);
            }
        }
        a.playTogether(new Animator[] { (Animator)c, (Animator)this.d });
        this.a.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        this.a.start();
    }
    
    public final void b() {
        if (this.getVisibility() != 4) {
            if (this.getVisibility() != 8) {
                final AnimatorSet b = this.b;
                if (this.e == null) {
                    (this.e = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, View.ALPHA, new float[] { 1.0f, 0.0f }).setDuration(300L)).addListener((Animator$AnimatorListener)new txo(this));
                }
                final ValueAnimator e = this.e;
                if (this.f == null) {
                    if (this.h == 0) {
                        this.f = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, View.ROTATION, new float[] { 0.0f, -15.0f }).setDuration(300L);
                    }
                    else {
                        this.f = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, View.ROTATION, new float[] { 0.0f, 15.0f }).setDuration(300L);
                    }
                }
                b.playTogether(new Animator[] { (Animator)e, (Animator)this.f });
                this.b.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
                this.b.start();
            }
        }
    }
    
    public final void c() {
        LayoutInflater.from(this.g).inflate(2131625659, (ViewGroup)this);
        final ImageView imageView = (ImageView)this.findViewById(2131427928);
        int imageResource;
        if (1 != this.h) {
            imageResource = 2131231428;
        }
        else {
            imageResource = 2131231427;
        }
        imageView.setImageResource(imageResource);
    }
}
