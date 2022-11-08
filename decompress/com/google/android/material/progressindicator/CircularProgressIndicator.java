// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.progressindicator;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;

public final class CircularProgressIndicator extends adup
{
    public CircularProgressIndicator(final Context context) {
        this(context, null);
    }
    
    public CircularProgressIndicator(final Context context, final AttributeSet set) {
        this(context, set, 2130968991);
    }
    
    public CircularProgressIndicator(Context context, final AttributeSet set, final int n) {
        super(context, set, n, 2132085186);
        context = this.getContext();
        final adux adux = (adux)this.a;
        this.setIndeterminateDrawable((Drawable)new advg(context, (aduq)adux, (adve)new adur(adux), (advf)new aduw(adux)));
        context = this.getContext();
        final adux adux2 = (adux)this.a;
        this.setProgressDrawable((Drawable)new aduz(context, (aduq)adux2, (adve)new adur(adux2)));
    }
}
