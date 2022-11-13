import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icp extends icr
{
    public icp(final View view, final int n, final int n2, final float n3, final float n4) {
        super(view, n, n2, n3, n4);
        final boolean b = true;
        adkp.Q(n3 >= 0.0f && n3 <= 1.0f);
        adkp.Q(n4 >= 0.0f && n4 <= 1.0f && b);
    }
    
    protected final void a(final float alpha) {
        this.g.setAlpha(alpha);
    }
}
