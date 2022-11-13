// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.progressindicator;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;

public final class LinearProgressIndicator extends adwr
{
    public LinearProgressIndicator(final Context context) {
        this(context, null);
    }
    
    public LinearProgressIndicator(final Context context, final AttributeSet set) {
        this(context, set, 2130969740);
    }
    
    public LinearProgressIndicator(Context context, final AttributeSet set, final int n) {
        super(context, set, n, 2132085199);
        final Context context2 = this.getContext();
        final adxr adxr = (adxr)this.a;
        final adxj adxj = new adxj(adxr);
        Object o;
        if (adxr.g == 0) {
            o = new adxm(adxr);
        }
        else {
            o = new adxq(context2, adxr);
        }
        this.setIndeterminateDrawable((Drawable)new adxi(context2, (adws)adxr, (adxg)adxj, (adxh)o));
        context = this.getContext();
        final adxr adxr2 = (adxr)this.a;
        this.setProgressDrawable((Drawable)new adxb(context, (adws)adxr2, (adxg)new adxj(adxr2)));
    }
    
    public final /* bridge */ adws a(final Context context, final AttributeSet set) {
        return (adws)new adxr(context, set);
    }
    
    public final void g(final int n) {
        final adws a = this.a;
        if (a != null && ((adxr)a).g == 0 && this.isIndeterminate()) {
            return;
        }
        super.g(n);
    }
    
    protected final void onLayout(final boolean b, int h, final int n, final int n2, final int n3) {
        super.onLayout(b, h, n, n2, n3);
        final adxr adxr = (adxr)this.a;
        h = adxr.h;
        boolean i;
        final boolean b2 = i = true;
        Label_0091: {
            if (h != 1) {
                if (anb.f((View)this) == 1) {
                    i = b2;
                    if (((adxr)this.a).h == 2) {
                        break Label_0091;
                    }
                }
                i = (anb.f((View)this) == 0 && ((adxr)this.a).h == 3 && b2);
            }
        }
        adxr.i = i;
    }
    
    protected final void onSizeChanged(int n, int n2, int paddingBottom, int paddingTop) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        paddingTop = this.getPaddingTop();
        paddingBottom = this.getPaddingBottom();
        final adxi c = this.c();
        n -= paddingLeft + paddingRight;
        n2 -= paddingTop + paddingBottom;
        if (c != null) {
            ((Drawable)c).setBounds(0, 0, n, n2);
        }
        final adxb b = this.b();
        if (b != null) {
            ((Drawable)b).setBounds(0, 0, n, n2);
        }
    }
}
