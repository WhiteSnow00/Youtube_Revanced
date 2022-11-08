// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public class NavigationBarButton extends Button
{
    public NavigationBarButton(final Context context) {
        super(context);
        this.a();
    }
    
    public NavigationBarButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    private final void a() {
        if (this.isInEditMode()) {
            return;
        }
        final Drawable[] compoundDrawablesRelative = this.getCompoundDrawablesRelative();
        for (int i = 0; i < compoundDrawablesRelative.length; ++i) {
            final Drawable drawable = compoundDrawablesRelative[i];
            if (drawable != null) {
                compoundDrawablesRelative[i] = (Drawable)aeej.a(drawable);
            }
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }
    
    private final void b() {
        final ColorStateList textColors = this.getTextColors();
        if (textColors != null) {
            final Drawable[] compoundDrawables = this.getCompoundDrawables();
            int i = 0;
            final Drawable drawable = compoundDrawables[0];
            final Drawable drawable2 = compoundDrawables[1];
            final Drawable drawable3 = compoundDrawables[2];
            final Drawable drawable4 = compoundDrawables[3];
            final Drawable[] compoundDrawablesRelative = this.getCompoundDrawablesRelative();
            final Drawable drawable5 = compoundDrawablesRelative[0];
            final Drawable drawable6 = compoundDrawablesRelative[2];
            while (i < 6) {
                final Drawable drawable7 = (new Drawable[] { drawable, drawable2, drawable3, drawable4, drawable5, drawable6 })[i];
                if (drawable7 instanceof aeej) {
                    final aeej aeej = (aeej)drawable7;
                    aeej.a = textColors;
                    if (aeej.b()) {
                        aeej.invalidateSelf();
                    }
                }
                ++i;
            }
            this.invalidate();
        }
    }
    
    public final void setCompoundDrawables(Drawable a, Drawable a2, Drawable a3, final Drawable drawable) {
        Object a4 = a;
        if (a != null) {
            a4 = aeej.a((Drawable)a);
        }
        if ((a = a2) != null) {
            a = aeej.a((Drawable)a2);
        }
        if ((a2 = a3) != null) {
            a2 = aeej.a((Drawable)a3);
        }
        if ((a3 = drawable) != null) {
            a3 = aeej.a(drawable);
        }
        super.setCompoundDrawables((Drawable)a4, (Drawable)a, (Drawable)a2, (Drawable)a3);
        this.b();
    }
    
    public final void setCompoundDrawablesRelative(Drawable a, Drawable a2, Drawable a3, final Drawable drawable) {
        Object a4 = a;
        if (a != null) {
            a4 = aeej.a((Drawable)a);
        }
        if ((a = a2) != null) {
            a = aeej.a((Drawable)a2);
        }
        if ((a2 = a3) != null) {
            a2 = aeej.a((Drawable)a3);
        }
        if ((a3 = drawable) != null) {
            a3 = aeej.a(drawable);
        }
        super.setCompoundDrawablesRelative((Drawable)a4, (Drawable)a, (Drawable)a2, (Drawable)a3);
        this.b();
    }
    
    public final void setTextColor(final ColorStateList textColor) {
        super.setTextColor(textColor);
        this.b();
    }
}
