// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects;

import android.view.animation.TranslateAnimation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.LinearLayout;

public final class EffectsFeatureDescriptionView extends LinearLayout
{
    final TextView a;
    final TextView b;
    final TextView c;
    public Animation d;
    public boolean e;
    public qpt f;
    
    public EffectsFeatureDescriptionView(final Context context, final AttributeSet set) {
        super(context, set);
        View.inflate(context, 2131625380, (ViewGroup)this);
        this.a = (TextView)this.findViewById(2131432092);
        this.b = (TextView)this.findViewById(2131431819);
        this.c = (TextView)this.findViewById(2131431818);
    }
    
    private final void f(final String text, final String text2, final String text3) {
        final TextView a = this.a;
        final boolean empty = text.isEmpty();
        final int n = 0;
        int visibility;
        if (!empty) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        a.setVisibility(visibility);
        final TextView b = this.b;
        int visibility2;
        if (!text2.isEmpty()) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        b.setVisibility(visibility2);
        final TextView c = this.c;
        int visibility3;
        if (!text3.isEmpty()) {
            visibility3 = n;
        }
        else {
            visibility3 = 8;
        }
        c.setVisibility(visibility3);
        final Animation d = this.d;
        if (d != null) {
            d.cancel();
        }
        this.a.setText((CharSequence)text);
        this.b.setText((CharSequence)text2);
        this.c.setText((CharSequence)text3);
        if (this.f != null && (!text.isEmpty() || !text2.isEmpty() || !text3.isEmpty())) {
            final gvj as = ((gwg)this.f.a).aS;
            if (as != null) {
                as.e();
            }
        }
    }
    
    private final void g(final AnimationSet set, final long n) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ((Animation)alphaAnimation).setStartOffset(set.getDuration() + n);
        ((Animation)alphaAnimation).setDuration(300L);
        set.addAnimation((Animation)alphaAnimation);
        set.setAnimationListener((Animation$AnimationListener)new cbh(this, 7));
    }
    
    public final AnimationSet a(final boolean b) {
        final AnimationSet set = new AnimationSet(true);
        if (b) {
            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ((Animation)alphaAnimation).setDuration(300L);
            set.addAnimation((Animation)alphaAnimation);
        }
        this.g(set, 5000L);
        return set;
    }
    
    public final void b(final String s) {
        this.c("", "", s);
    }
    
    public final void c(final String s, final String s2, final String s3) {
        this.f(s, s2, s3);
        this.startAnimation((Animation)this.a(true));
    }
    
    public final void d() {
        final Animation d = this.d;
        if (d != null) {
            d.cancel();
        }
        this.setAlpha(0.0f);
        this.setVisibility(8);
    }
    
    public final void e(final String s, final float n) {
        this.f(s, "", "");
        final AnimationSet set = new AnimationSet(true);
        final TranslateAnimation translateAnimation = new TranslateAnimation(n, 0.0f, 0.0f, 0.0f);
        ((Animation)translateAnimation).setDuration(300L);
        set.addAnimation((Animation)translateAnimation);
        this.g(set, 250L);
        this.startAnimation((Animation)set);
    }
    
    public final void startAnimation(final Animation d) {
        super.startAnimation(d);
        this.d = d;
    }
}
