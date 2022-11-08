// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.widget;

import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;

public class TintableImageView extends ImageView
{
    public static final ColorStateList a;
    private tnw b;
    private ColorStateList c;
    private boolean d;
    
    static {
        a = new ColorStateList(new int[0][0], new int[0]);
    }
    
    public TintableImageView(final Context context) {
        super(uji.S(context, (AttributeSet)null, 2132085284));
        this.b();
    }
    
    public TintableImageView(final Context context, final AttributeSet set) {
        super(uji.S(context, set, 2132085284), set);
        this.b();
    }
    
    public TintableImageView(final Context context, final AttributeSet set, final int n) {
        super(uji.S(context, set, 2132085284), set, n);
        this.b();
    }
    
    public TintableImageView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(uji.S(context, set, 2132085284), set, n, n2);
        this.b();
    }
    
    private final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c = TintableImageView.a;
        this.c();
    }
    
    private final void c() {
        this.setImageDrawable(this.getDrawable());
    }
    
    public final void a(final ColorStateList c) {
        if (this.c == c) {
            return;
        }
        this.c = c;
        this.c();
    }
    
    public final void setImageDrawable(final Drawable imageDrawable) {
        if (imageDrawable == null || !this.d) {
            super.setImageDrawable(imageDrawable);
            return;
        }
        if (this.b == null) {
            this.b = new tnw(this.getContext());
        }
        final tnw b = this.b;
        final ColorStateList c = this.c;
        if (c == TintableImageView.a) {
            if (b.b == null) {
                final int orElse = tmy.ct(b.a, 2130969045).orElse(0);
                final int orElse2 = tmy.ct(b.a, 2130969043).orElse(0);
                b.b = b.a(orElse2, orElse2, orElse2, orElse2, tmy.ct(b.a, 2130969046).orElse(orElse2), orElse);
            }
            super.setImageDrawable(b.d(imageDrawable, b.b, PorterDuff$Mode.SRC_IN));
            return;
        }
        super.setImageDrawable(b.c(imageDrawable, c));
    }
    
    public final void setImageResource(final int n) {
        this.setImageDrawable(this.getResources().getDrawable(n));
    }
}
