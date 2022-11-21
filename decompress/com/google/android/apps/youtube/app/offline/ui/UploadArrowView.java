// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.offline.ui;

import android.graphics.drawable.AnimationDrawable;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.widget.ImageView$ScaleType;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.Context;

public class UploadArrowView extends iop
{
    public UploadArrowView(final Context context) {
        super(context);
        this.b(ume.P(context, (AttributeSet)null, 0), null);
    }
    
    public UploadArrowView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b(ume.P(context, set, 0), set);
    }
    
    public UploadArrowView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b(ume.P(context, set, 0), set);
    }
    
    public UploadArrowView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b(ume.P(context, set, 0), set);
    }
    
    private final void b(final Context context, final AttributeSet set) {
        final Resources resources = context.getResources();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ioo.b);
        this.k = 2131233926;
        final int int1 = obtainStyledAttributes.getInt(0, 0);
        int l;
        if (int1 != 0) {
            if (int1 != 1) {
                final StringBuilder sb = new StringBuilder("Unsupported UploadArrowView completedStyle: ");
                sb.append(int1);
                throw new IllegalArgumentException(sb.toString());
            }
            l = 2131233683;
        }
        else {
            l = 2131233521;
        }
        this.l = l;
        this.m = 2131232533;
        obtainStyledAttributes.recycle();
        this.o = ColorStateList.valueOf(tqf.cr(this.getContext(), 2130970846));
        final TintableImageView f = new TintableImageView(context);
        (this.f = f).setScaleType(ImageView$ScaleType.CENTER);
        f.a(this.o);
        this.a(this.k);
        final int cr = tqf.cr(this.getContext(), 2130970850);
        final Drawable a = agy.a(context, 2131232388);
        this.j = a;
        (this.e = new ProgressBar(context, (AttributeSet)null, 16842872)).setProgressDrawable(a);
        this.e.setRotation(-90.0f);
        this.e.setProgressTintList(ColorStateList.valueOf(cr));
        this.e.setVisibility(8);
        final ProgressBar g = new ProgressBar(context);
        (this.g = g).setIndeterminateDrawable((Drawable)new pev(-1.0f, resources.getDimensionPixelSize(2131168397), resources.getDimensionPixelSize(2131168395), new int[] { cr }));
        g.setVisibility(8);
        final LottieAnimationView i = new LottieAnimationView(context);
        (this.i = i).g(2131951681);
        i.n(-1);
        i.setRotationX(180.0f);
        i.b(new cwm(new String[] { "**" }), cuq.E, (czy)new iow(cr));
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131168376);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131168396);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17);
        this.addView((View)g, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        this.addView((View)this.e, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        this.addView((View)i, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.addView((View)f, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 17));
    }
    
    public final void a(final int n) {
        this.k();
        this.n = n;
        final AnimationDrawable h = this.h;
        if (h != null) {
            h.stop();
        }
        final TintableImageView f = this.f;
        if (f != null) {
            f.setImageResource(n);
            f.a(this.o);
        }
    }
    
    public final void j(final int progress) {
        final ProgressBar e = this.e;
        if (e != null) {
            e.setProgressDrawable(this.j);
            tqf.v((View)e, true);
            tqf.v((View)this.g, false);
            e.setMax(100);
            e.setProgress(progress);
        }
    }
}
