// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.inline;

import android.view.View$MeasureSpec;
import android.view.ViewConfiguration;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

public class SnappyLinearLayoutManager extends LinearLayoutManager implements fqw
{
    private static final float a;
    private double b;
    private final Context c;
    private final oj d;
    
    static {
        a = (float)(Math.log(0.78) / Math.log(0.9));
    }
    
    public SnappyLinearLayoutManager(final Context c) {
        this.c = c;
        this.d = this.c();
        final double n = c.getResources().getDisplayMetrics().density * 386.0878f * 160.0f;
        Double.isNaN(n);
        this.b = n * 0.84;
    }
    
    public final int J() {
        return this.K();
    }
    
    public final int a() {
        if (((nw)this).as() == 0) {
            return 0;
        }
        final View ab = ((nw)this).aB(0);
        final int bo = bo(ab);
        int n;
        int n2;
        if (super.i == 1) {
            n = ab.getTop();
            n2 = ab.getMeasuredHeight();
        }
        else {
            n = ab.getLeft();
            n2 = ab.getMeasuredWidth();
        }
        int n3 = bo;
        if (Math.abs(n) > n2 / 2) {
            n3 = bo + 1;
        }
        return n3;
    }
    
    public final void ao(final RecyclerView recyclerView, final int b) {
        final oj d = this.d;
        d.b = b;
        ((nw)this).bf(d);
    }
    
    public final int b(int height, int n) {
        if (((nw)this).as() == 0) {
            return 0;
        }
        final View ab = ((nw)this).aB(0);
        int n2;
        if (super.i == 1) {
            n2 = ab.getTop();
            height = ab.getHeight();
        }
        else {
            n2 = ab.getLeft();
            final int width = ab.getWidth();
            n = height;
            height = width;
        }
        final int bo = bo(ab);
        final double abs = Math.abs((double)Math.abs(n));
        final float scrollFriction = ViewConfiguration.getScrollFriction();
        final double b = this.b;
        final double n3 = scrollFriction;
        Double.isNaN(n3);
        final double log = Math.log(abs * 0.3499999940395355 / (n3 * b));
        final float a = SnappyLinearLayoutManager.a;
        final double n4 = ViewConfiguration.getScrollFriction();
        final double b2 = this.b;
        Double.isNaN(n4);
        final double n5 = a;
        final double n6 = a;
        Double.isNaN(n6);
        Double.isNaN(n5);
        final double n7 = n4 * b2 * Math.exp(n5 / (n6 - 1.0) * log);
        final double n8 = n2;
        double n9 = n7;
        if (n > 0) {
            n9 = -n7;
        }
        Double.isNaN(n8);
        final double n10 = n8 + n9;
        if (super.i == 0 && this.ah()) {
            if (n10 >= height / 2) {
                return bo + 1;
            }
            n = bo;
        }
        else {
            n = bo;
            if (n10 <= -height / 2) {
                n = bo + 1;
            }
        }
        return n;
    }
    
    public final void bt(final View view) {
        final nx nx = (nx)view.getLayoutParams();
        int n;
        int n2;
        if (super.i == 1) {
            n = at(((nw)this).E, ((nw)this).getPaddingLeft() + ((nw)this).getPaddingRight() + nx.leftMargin + nx.rightMargin, nx.width, ((nw)this).ae());
            n2 = View$MeasureSpec.makeMeasureSpec(((nw)this).F, 1073741824);
        }
        else {
            n2 = at(((nw)this).F, ((nw)this).getPaddingTop() + ((nw)this).getPaddingBottom() + nx.topMargin + nx.bottomMargin, nx.height, ((nw)this).af());
            n = View$MeasureSpec.makeMeasureSpec(((nw)this).E, 1073741824);
        }
        view.measure(n, n2);
    }
    
    protected oj c() {
        return (oj)new kbb(this.c, (LinearLayoutManager)this);
    }
}
