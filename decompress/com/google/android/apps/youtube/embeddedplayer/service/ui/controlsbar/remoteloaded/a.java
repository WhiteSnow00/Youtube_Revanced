// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.view.View$MeasureSpec;
import android.view.animation.Animation;
import android.graphics.Region$Op;
import android.graphics.Region;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageButton;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

public final class a extends ViewGroup implements View$OnClickListener
{
    public int a;
    public int b;
    public int c;
    public c d;
    public View e;
    public f f;
    public ImageButton g;
    public ImageButton h;
    public abbr i;
    public TextView j;
    
    public a(final Context context) {
        super(context);
    }
    
    private final int d(final View view, final int n) {
        final int height = this.e.getHeight();
        final int measuredHeight = view.getMeasuredHeight();
        final int top = this.e.getTop();
        final int n2 = (height - measuredHeight) / 2;
        view.layout(n, top + n2, view.getMeasuredWidth() + n, this.e.getBottom() - n2);
        return view.getWidth();
    }
    
    public final int a() {
        return this.a + this.b - 2;
    }
    
    public final void b(final boolean selected) {
        this.h.setSelected(selected);
        int n;
        if (!selected) {
            n = 2132017255;
        }
        else {
            n = 2132017260;
        }
        this.h.setContentDescription(this.getContext().getText(n));
    }
    
    public final void c(final long n, final long n2, final long n3) {
        this.f.b(n, n2, n3);
    }
    
    public final boolean gatherTransparentRegion(final Region region) {
        final int[] array = new int[2];
        this.getLocationInWindow(array);
        final int n = array[0];
        region.op(n, array[1], this.getRight() + n - this.getLeft(), array[1] + this.getBottom() - this.getTop(), Region$Op.DIFFERENCE);
        return true;
    }
    
    public final void onClick(final View view) {
        adkp.R(this.i != null, (Object)"listener not set for ControlsOverlay");
        final ImageButton h = this.h;
        if (view == h) {
            this.b(h.isSelected() ^ true);
            this.i.w(view.isSelected());
            return;
        }
        if (view == this.g) {
            final c d = this.d;
            if (d.getVisibility() == 0) {
                d.d.cancel();
                d.e.reset();
                d.startAnimation((Animation)d.e);
                return;
            }
            d.e.cancel();
            d.d.reset();
            d.startAnimation((Animation)d.d);
            d.setVisibility(0);
        }
    }
    
    protected final void onLayout(final boolean b, int n, int c, final int n2, final int n3) {
        final View e = this.e;
        final int measuredHeight = e.getMeasuredHeight();
        c = n3 - c;
        n = n2 - n;
        e.layout(0, c - measuredHeight, n, c);
        c = this.e.getTop() + 2;
        final c d = this.d;
        d.layout(0, c - d.getMeasuredHeight(), n, c);
        c = this.c;
        if (this.f.getVisibility() != 8) {
            n = this.d(this.f, c);
        }
        else {
            this.d((View)this.j, c);
            n = this.f.getMeasuredWidth();
        }
        c = c + n + this.c;
        n = this.d((View)this.g, c);
        if (this.h.getVisibility() != 8) {
            this.d((View)this.h, c + n);
        }
    }
    
    protected final void onMeasure(int n, int n2) {
        n = getDefaultSize(0, n);
        this.setMeasuredDimension(n, resolveSize(this.a(), n2));
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        this.d.measure(measureSpec, View$MeasureSpec.makeMeasureSpec(this.b, 1073741824));
        n2 = View$MeasureSpec.makeMeasureSpec(this.a, 1073741824);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE);
        this.e.measure(measureSpec, n2);
        this.g.measure(measureSpec2, measureSpec2);
        n2 = this.c;
        n2 = (n = n - (n2 + n2) - this.g.getMeasuredWidth());
        if (this.h.getVisibility() != 8) {
            this.h.measure(measureSpec2, measureSpec2);
            n = n2 - this.h.getMeasuredWidth();
        }
        n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        this.f.measure(n, measureSpec2);
        this.j.measure(n, measureSpec2);
    }
}
