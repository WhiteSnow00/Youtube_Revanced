// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.player.ui;

import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class BrandInteractionView extends LinearLayout
{
    public final int a;
    public ImageButton b;
    public ImageButton c;
    public LinearLayout d;
    public bx e;
    private final int f;
    private final int g;
    
    public BrandInteractionView(final Context context) {
        super(context);
        final Resources resources = context.getResources();
        this.a = resources.getInteger(17694722);
        this.f = resources.getDimensionPixelSize(2131165552);
        this.g = resources.getDimensionPixelSize(2131165551);
    }
    
    public BrandInteractionView(final Context context, final AttributeSet set) {
        super(context, set);
        final Resources resources = context.getResources();
        this.a = resources.getInteger(17694722);
        this.f = resources.getDimensionPixelSize(2131165552);
        this.g = resources.getDimensionPixelSize(2131165551);
    }
    
    public BrandInteractionView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final Resources resources = context.getResources();
        this.a = resources.getInteger(17694722);
        this.f = resources.getDimensionPixelSize(2131165552);
        this.g = resources.getDimensionPixelSize(2131165551);
    }
    
    public BrandInteractionView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        final Resources resources = context.getResources();
        this.a = resources.getInteger(17694722);
        this.f = resources.getDimensionPixelSize(2131165552);
        this.g = resources.getDimensionPixelSize(2131165551);
    }
    
    public final void a(final boolean b, final boolean b2, final boolean b3) {
        int n;
        if (!b && (!b2 || !b3)) {
            n = this.f;
        }
        else {
            n = this.g;
        }
        tpe.aF((View)this, tpe.aq(n), (Class)ViewGroup$MarginLayoutParams.class);
    }
}
