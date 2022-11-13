import android.graphics.Typeface;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aasp implements Runnable
{
    public final Context a;
    public final ViewGroup b;
    public final float c;
    public final float d;
    public final aask e;
    private final int f;
    
    public aasp(final aarm e, final Context a, final float c, final float d, final ViewGroup b, final int f) {
        this.f = f;
        this.e = (aask)e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public aasp(final aast e, final Context a, final ViewGroup b, final float c, final float d, final int f) {
        this.f = f;
        this.e = (aask)e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        if (this.f != 0) {
            final aask e = this.e;
            final Context a = this.a;
            final float c = this.c;
            final float d = this.d;
            final ViewGroup b = this.b;
            final aarl k = new aarl(a, e);
            final aarm aarm = (aarm)e;
            (aarm.k = k).setOrientation(0);
            aarm.k.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(aarm.s(c), aarm.s(d)));
            b.addView((View)aarm.k);
            return;
        }
        final aask e2 = this.e;
        final Context a2 = this.a;
        final ViewGroup b2 = this.b;
        final float c2 = this.c;
        final float d2 = this.d;
        final aasr j = new aasr(a2, e2);
        final aast aast = (aast)e2;
        (aast.j = j).addOnLayoutChangeListener((View$OnLayoutChangeListener)e2);
        aast.j.setVisibility(0);
        b2.addView((View)aast.j, aast.s(c2), aast.s(d2));
        aast.j.setTextColor(-1);
        aast.j.setTextSize(5.0f);
        aast.j.setTypeface((Typeface)null, 1);
        aast.j.invalidate();
    }
}
