// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.widget.ImageView;

public class CircularImageView extends ImageView
{
    public float a;
    private tps b;
    private InsetDrawable c;
    private tps d;
    private int e;
    
    public CircularImageView(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, tqs.b);
        this.a = obtainStyledAttributes.getDimension(1, 0.0f);
        this.e = obtainStyledAttributes.getColor(0, -16777216);
    }
    
    private final void a() {
        if (this.getBackground() != null) {
            if (this.c != null) {
                final Rect rect = new Rect();
                this.c.getPadding(rect);
                if (rect.left == this.getPaddingLeft() && rect.top == this.getPaddingTop() && rect.right == this.getPaddingRight() && rect.bottom == this.getPaddingBottom()) {
                    return;
                }
            }
            super.setBackgroundDrawable((Drawable)(this.c = new InsetDrawable((Drawable)this.d, this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom())));
        }
    }
    
    public final Drawable getBackground() {
        final tps d = this.d;
        if (d != null) {
            return d.a;
        }
        return null;
    }
    
    public final Drawable getDrawable() {
        final tps b = this.b;
        if (b != null) {
            return b.a;
        }
        return null;
    }
    
    public final boolean hasOverlappingRendering() {
        return false;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.a();
    }
    
    public final void setBackgroundDrawable(final Drawable drawable) {
        if (drawable == null) {
            final tps d = this.d;
            if (d != null) {
                d.a((Drawable)null);
            }
            super.setBackgroundDrawable((Drawable)null);
            return;
        }
        final tps d2 = this.d;
        if (d2 == null) {
            this.d = new tps(drawable, this.a, this.e);
        }
        else {
            d2.a(drawable);
        }
        this.a();
        this.invalidate();
    }
    
    public final void setImageBitmap(final Bitmap bitmap) {
        this.setImageDrawable((Drawable)new BitmapDrawable(this.getContext().getResources(), bitmap));
    }
    
    public final void setImageDrawable(final Drawable drawable) {
        if (drawable == null) {
            final tps b = this.b;
            if (b != null) {
                b.a((Drawable)null);
            }
            super.setImageDrawable((Drawable)null);
            return;
        }
        final tps b2 = this.b;
        if (b2 == null) {
            this.b = new tps(drawable, this.a, this.e);
        }
        else {
            b2.a(drawable);
            this.invalidate();
        }
        super.setImageDrawable((Drawable)this.b);
    }
    
    public final void setImageResource(final int n) {
        this.setImageDrawable(this.getResources().getDrawable(n));
    }
}
