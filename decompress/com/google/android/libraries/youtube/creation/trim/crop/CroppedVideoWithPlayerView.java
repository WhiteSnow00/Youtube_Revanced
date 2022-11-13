// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.trim.crop;

import android.view.View$MeasureSpec;
import android.util.Size;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.youtube.player.ui.PlayerView;

public class CroppedVideoWithPlayerView extends PlayerView implements uep
{
    float a;
    int b;
    private float c;
    private float f;
    private double g;
    
    public CroppedVideoWithPlayerView(final Context context) {
        super(context);
        this.b = 1;
        this.a = 0.0f;
        this.c = 0.0f;
        this.f = 0.5f;
        this.g = 1.0;
    }
    
    public CroppedVideoWithPlayerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 1;
        this.a = 0.0f;
        this.c = 0.0f;
        this.f = 0.5f;
        this.g = 1.0;
    }
    
    public final float b() {
        return this.f;
    }
    
    public final float d() {
        final View m = ((abue)this).m;
        final int measuredWidth = m.getMeasuredWidth();
        boolean b = false;
        if (measuredWidth != 0) {
            b = b;
            if (m.getMeasuredHeight() != 0) {
                b = true;
            }
        }
        adkp.H(b);
        return (float)this.g;
    }
    
    public final float e() {
        return (this.getWidth() - this.getHeight() * 0.5625f) / 2.0f;
    }
    
    public final void f(final boolean clipChildren) {
        super.setClipChildren(clipChildren);
    }
    
    public final boolean g() {
        return tpe.by(this.b, this.c);
    }
    
    public final void h(final int b) {
        this.b = b;
        final zdi d = super.d;
        if (d == null) {
            return;
        }
        ((ViewGroup)d).setClipChildren(b != 2);
        this.requestLayout();
    }
    
    public final void j(float a) {
        final int measuredWidth = ((abue)this).m.getMeasuredWidth();
        final float n = (float)this.getMeasuredWidth();
        final float n2 = (float)this.getMeasuredHeight();
        final float n3 = (float)measuredWidth;
        final float e = this.e();
        final int b = this.b;
        final float a2 = this.a;
        final float c = this.c;
        ueo ueo2;
        final ueo ueo = ueo2 = null;
        if (b == 2) {
            if (n / n2 >= c) {
                ueo2 = ueo;
            }
            else {
                float n4 = a2 + a;
                a = (n3 - n) / 2.0f + e;
                final float n5 = n3 / 2.0f;
                final float n6 = n5 + a;
                final float n7 = n5 + n4;
                final float n8 = n5 - a;
                if (n7 < n8) {
                    n4 = n8 - n5;
                    a = n8;
                }
                else {
                    a = n7;
                    if (n7 > n6) {
                        n4 = n6 - n5;
                        a = n6;
                    }
                }
                final float n9 = n6 - e;
                final float n10 = n8 / n9;
                final float n11 = n6 / n9;
                a /= n9;
                ueo2 = new ueo(n4, a, (a - n10) / (n11 - n10));
            }
        }
        if (ueo2 != null) {
            a = ueo2.a;
            this.a = a;
            this.f = ueo2.b;
            this.scrollTo((int)a, 0);
        }
    }
    
    protected final void onMeasure(int measuredWidth, int measuredHeight) {
        super.onMeasure(measuredWidth, measuredHeight);
        if (this.b != 1) {
            final View m = ((abue)this).m;
            if (m == null) {
                return;
            }
            final int measuredWidth2 = this.getMeasuredWidth();
            measuredHeight = this.getMeasuredHeight();
            this.g = 1.0;
            measuredWidth = m.getMeasuredWidth();
            final int measuredHeight2 = m.getMeasuredHeight();
            if (this.b == 2 && measuredHeight > 0 && measuredHeight2 > 0) {
                final double n = measuredWidth2;
                final double n2 = measuredWidth;
                final double n3 = measuredHeight;
                final double n4 = measuredHeight2;
                Double.isNaN(n);
                Double.isNaN(n3);
                final double n5 = n / n3;
                Double.isNaN(n2);
                Double.isNaN(n4);
                this.g = tpe.bx(n5, n2 / n4);
            }
            final double n6 = measuredWidth;
            final double g = this.g;
            Double.isNaN(n6);
            final double n7 = measuredHeight2;
            Double.isNaN(n7);
            measuredWidth = (int)(n6 * g);
            measuredHeight = (int)(n7 * g);
            this.c = measuredWidth / (float)measuredHeight;
            final Size size = new Size(measuredWidth, measuredHeight);
            m.measure(View$MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(size.getHeight(), 1073741824));
        }
    }
}
