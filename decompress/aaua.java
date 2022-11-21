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

public final class aaua implements Runnable
{
    public final Context a;
    public final ViewGroup b;
    public final float c;
    public final float d;
    public final aatv e;
    private final int f;
    
    public aaua(final aatc e, final Context a, final float c, final float d, final ViewGroup b, final int f) {
        this.f = f;
        this.e = (aatv)e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public aaua(final aaud e, final Context a, final ViewGroup b, final float c, final float d, final int f) {
        this.f = f;
        this.e = (aatv)e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        if (this.f != 0) {
            final aatv e = this.e;
            final Context a = this.a;
            final float c = this.c;
            final float d = this.d;
            final ViewGroup b = this.b;
            final aatb k = new aatb(a, e);
            final aatc aatc = (aatc)e;
            (aatc.k = k).setOrientation(0);
            aatc.k.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(aatc.s(c), aatc.s(d)));
            b.addView((View)aatc.k);
            return;
        }
        final aatv e2 = this.e;
        final Context a2 = this.a;
        final ViewGroup b2 = this.b;
        final float c2 = this.c;
        final float d2 = this.d;
        final aaub j = new aaub(a2, e2);
        final aaud aaud = (aaud)e2;
        (aaud.j = j).addOnLayoutChangeListener((View$OnLayoutChangeListener)e2);
        aaud.j.setVisibility(0);
        b2.addView((View)aaud.j, aaud.s(c2), aaud.s(d2));
        aaud.j.setTextColor(-1);
        aaud.j.setTextSize(5.0f);
        aaud.j.setTypeface((Typeface)null, 1);
        aaud.j.invalidate();
    }
}
