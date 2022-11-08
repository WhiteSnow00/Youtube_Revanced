// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.progressindicator;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;

public final class LinearProgressIndicator extends adup
{
    public LinearProgressIndicator(final Context context) {
        this(context, null);
    }
    
    public LinearProgressIndicator(final Context context, final AttributeSet set) {
        this(context, set, 2130969740);
    }
    
    public LinearProgressIndicator(final Context context, final AttributeSet set, final int n) {
        super(context, set, n, 2132085198);
        final Context context2 = this.getContext();
        final advp advp = (advp)this.a;
        final advh advh = new advh(advp);
        Object o;
        if (advp.g == 0) {
            o = new advk(advp);
        }
        else {
            o = new advo(context2, advp);
        }
        this.setIndeterminateDrawable((Drawable)new advg(context2, (aduq)advp, (adve)advh, (advf)o));
        final Context context3 = this.getContext();
        final advp advp2 = (advp)this.a;
        this.setProgressDrawable((Drawable)new aduz(context3, (aduq)advp2, (adve)new advh(advp2)));
    }
    
    public final void g(final int n) {
        final aduq a = this.a;
        if (a != null && ((advp)a).g == 0 && this.isIndeterminate()) {
            return;
        }
        super.g(n);
    }
    
    protected final void onLayout(final boolean b, int h, final int n, final int n2, final int n3) {
        super.onLayout(b, h, n, n2, n3);
        final advp advp = (advp)this.a;
        h = advp.h;
        boolean i;
        final boolean b2 = i = true;
        Label_0091: {
            if (h != 1) {
                if (ana.f((View)this) == 1) {
                    i = b2;
                    if (((advp)this.a).h == 2) {
                        break Label_0091;
                    }
                }
                i = (ana.f((View)this) == 0 && ((advp)this.a).h == 3 && b2);
            }
        }
        advp.i = i;
    }
    
    protected final void onSizeChanged(int n, int n2, final int n3, final int n4) {
        n -= this.getPaddingLeft() + this.getPaddingRight();
        n2 -= this.getPaddingTop() + this.getPaddingBottom();
        final advg c = this.c();
        if (c != null) {
            ((Drawable)c).setBounds(0, 0, n, n2);
        }
        final aduz b = this.b();
        if (b != null) {
            ((Drawable)b).setBounds(0, 0, n, n2);
        }
    }
}
