// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textview;

import android.widget.TextView;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;

public class MaterialTextView extends AppCompatTextView
{
    public MaterialTextView(final Context context) {
        this(context, null);
    }
    
    public MaterialTextView(final Context context, final AttributeSet set) {
        this(context, set, 16842884);
    }
    
    public MaterialTextView(final Context context, final AttributeSet set, final int n) {
        super(adyy.a(context, set, n, 0), set, n);
        this.c(set, n, 0);
    }
    
    @Deprecated
    public MaterialTextView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(adyy.a(context, set, n, n2), set, n);
        this.c(set, n, n2);
    }
    
    private static int a(final Context context, final TypedArray typedArray, final int... array) {
        int n;
        int e;
        for (n = 0, e = -1; n < 2 && e < 0; e = adwd.e(context, typedArray, array[n], -1), ++n) {}
        return e;
    }
    
    private final void b(final Resources$Theme resources$Theme, int a) {
        final TypedArray obtainStyledAttributes = resources$Theme.obtainStyledAttributes(a, adyx.a);
        a = a(this.getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            api.h((TextView)this, a);
        }
    }
    
    private final void c(final AttributeSet set, int resourceId, final int n) {
        final Context context = this.getContext();
        if (d(context)) {
            final Resources$Theme theme = context.getTheme();
            final TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(set, adyx.b, resourceId, n);
            final int a = a(context, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a == -1) {
                final TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(set, adyx.b, resourceId, n);
                resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    this.b(theme, resourceId);
                }
            }
        }
    }
    
    private static boolean d(final Context context) {
        return adwd.m(context, 2130970588, true);
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        if (d(context)) {
            this.b(context.getTheme(), n);
        }
    }
}
