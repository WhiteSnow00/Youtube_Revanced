// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.progressindicator;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;

public final class CircularProgressIndicator extends adwr
{
    public CircularProgressIndicator(final Context context) {
        this(context, null);
    }
    
    public CircularProgressIndicator(final Context context, final AttributeSet set) {
        this(context, set, 2130968991);
    }
    
    public CircularProgressIndicator(Context context, final AttributeSet set, final int n) {
        super(context, set, n, 2132085187);
        final Context context2 = this.getContext();
        final adwz adwz = (adwz)this.a;
        this.setIndeterminateDrawable((Drawable)new adxi(context2, (adws)adwz, (adxg)new adwt(adwz), (adxh)new adwy(adwz)));
        context = this.getContext();
        final adwz adwz2 = (adwz)this.a;
        this.setProgressDrawable((Drawable)new adxb(context, (adws)adwz2, (adxg)new adwt(adwz2)));
    }
    
    public final /* bridge */ adws a(final Context context, final AttributeSet set) {
        return (adws)new adwz(context, set);
    }
}
