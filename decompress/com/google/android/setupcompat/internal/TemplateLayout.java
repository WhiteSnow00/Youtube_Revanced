// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupcompat.internal;

import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import java.util.HashMap;
import android.content.Context;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Map;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class TemplateLayout extends FrameLayout
{
    private ViewGroup a;
    private final Map b;
    public float c;
    public ViewTreeObserver$OnPreDrawListener d;
    
    public TemplateLayout(final Context context, final int n, final int n2) {
        super(context);
        this.b = new HashMap();
        this.a(n, n2, null, 2130970402);
    }
    
    public TemplateLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new HashMap();
        this.a(0, 0, set, 2130970402);
    }
    
    public TemplateLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new HashMap();
        this.a(0, 0, set, n);
    }
    
    private final void a(int resourceId, final int n, final AttributeSet set, final int n2) {
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aees.f, n2, 0);
        int resourceId2 = resourceId;
        if (resourceId == 0) {
            resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
        }
        if ((resourceId = n) == 0) {
            resourceId = obtainStyledAttributes.getResourceId(1, 0);
        }
        this.d(set, n2);
        super.addView(this.b(LayoutInflater.from(this.getContext()), resourceId2), -1, (ViewGroup$LayoutParams)this.generateDefaultLayoutParams());
        if ((this.a = this.c(resourceId)) != null) {
            this.k();
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a.addView(view, n, viewGroup$LayoutParams);
    }
    
    protected View b(final LayoutInflater layoutInflater, final int n) {
        return this.i(layoutInflater, 0, n);
    }
    
    protected ViewGroup c(final int n) {
        return (ViewGroup)this.findViewById(n);
    }
    
    protected void d(final AttributeSet set, final int n) {
    }
    
    public float getXFraction() {
        return this.c;
    }
    
    public View h(final int n) {
        return this.findViewById(n);
    }
    
    protected final View i(final LayoutInflater layoutInflater, final int n, final int n2) {
        if (n2 != 0) {
            LayoutInflater from = layoutInflater;
            if (n != 0) {
                from = LayoutInflater.from((Context)new aeeu(layoutInflater.getContext(), n));
            }
            return from.inflate(n2, (ViewGroup)this, false);
        }
        throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
    }
    
    public final aefj j(final Class clazz) {
        return this.b.get(clazz);
    }
    
    protected void k() {
    }
    
    protected final void l(final Class clazz, final aefj aefj) {
        this.b.put(clazz, aefj);
    }
    
    public void setXFraction(final float c) {
        this.c = c;
        final int width = this.getWidth();
        if (width != 0) {
            this.setTranslationX(width * c);
            return;
        }
        if (this.d == null) {
            this.d = (ViewTreeObserver$OnPreDrawListener)new edj(this, 6);
            this.getViewTreeObserver().addOnPreDrawListener(this.d);
        }
    }
}
