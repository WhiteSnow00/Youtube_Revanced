// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.AttributeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Context;
import java.util.List;

public class RtlAwareViewPager extends trr
{
    public final List i;
    public ckv j;
    
    public RtlAwareViewPager(final Context context) {
        super(context);
        this.i = new CopyOnWriteArrayList();
        this.x();
    }
    
    public RtlAwareViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.i = new CopyOnWriteArrayList();
        this.x();
    }
    
    private final void x() {
        ((ViewPager)this).f = (ckv)new tqw(this, 0);
    }
    
    public final int a() {
        return this.z(((ViewPager)this).c);
    }
    
    public final void addView(final View view, final int n) {
        if (this.indexOfChild(view) != -1) {
            return;
        }
        super.addView(view, this.z(n));
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.indexOfChild(view) != -1) {
            return;
        }
        super.addView(view, this.z(n), viewGroup$LayoutParams);
    }
    
    public final void e(final ckv ckv) {
        this.i.add(ckv);
    }
    
    public final void j(final ckv ckv) {
        this.i.remove(ckv);
    }
    
    public final void l(final int n) {
        super.l(this.z(n));
    }
    
    public final void m(final int n, final boolean b) {
        super.m(this.z(n), b);
    }
    
    public final void q(final ckv j) {
        this.j = j;
    }
    
    public final int z(final int n) {
        if (this.getResources().getConfiguration().getLayoutDirection() == 1) {
            return ((ViewPager)this).b.j() - n - 1;
        }
        return n;
    }
}
