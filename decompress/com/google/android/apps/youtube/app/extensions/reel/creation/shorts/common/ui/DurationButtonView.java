// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.content.Context;
import android.widget.FrameLayout;

public final class DurationButtonView extends FrameLayout
{
    public final Context a;
    public final YouTubeTextView b;
    public LottieAnimationView c;
    public float d;
    public int e;
    public int f;
    
    public DurationButtonView(final Context context) {
        this(context, null);
    }
    
    public DurationButtonView(final Context a, final AttributeSet set) {
        super(a, set);
        this.d = 1.0f;
        this.a = a;
        LayoutInflater.from(a).inflate(2131624374, (ViewGroup)this);
        final YouTubeTextView b = (YouTubeTextView)this.findViewById(2131428771);
        b.getClass();
        this.b = b;
        final LottieAnimationView c = (LottieAnimationView)this.findViewById(2131428770);
        c.getClass();
        this.c = c;
        if (set != null) {
            final TypedArray obtainStyledAttributes = a.getTheme().obtainStyledAttributes(set, gur.a, 0, 0);
            final String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                b.getClass();
                b.setText((CharSequence)string);
            }
            if (obtainStyledAttributes.getBoolean(2, false)) {
                this.c(0);
            }
            else {
                this.c(8);
            }
            this.d = Math.abs(obtainStyledAttributes.getFloat(1, 1.0f));
        }
    }
    
    public final void a(final float n, final float n2) {
        final LottieAnimationView c = this.c;
        c.getClass();
        c.l(n, n2);
    }
    
    public final void b(int max) {
        final int f = this.f;
        if (f <= 0) {
            ttr.b("maxDurationMs not set");
            return;
        }
        max = Math.max(0, Math.min(max, f));
        final int min = Math.min(max, this.e);
        final int max2 = Math.max(max, this.e);
        final float n = (float)min;
        final float n2 = (float)this.f;
        this.a(n / n2, max2 / n2);
        final LottieAnimationView c = this.c;
        c.getClass();
        c.m(max / (float)this.f);
        this.e = max;
    }
    
    public final void c(final int visibility) {
        final LottieAnimationView c = this.c;
        c.getClass();
        c.setVisibility(visibility);
    }
}
