import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfl implements ouw
{
    public long a;
    
    public final ahaq a() {
        return (ahaq)anwi.b;
    }
    
    public final /* bridge */ void b(final dsx dsx, final oti oti, final String s, final Object o, final ouc ouc, final osz osz) {
        if (!((anwi)o).c) {
            return;
        }
        final acvb c = acvc.c();
        ouc.q((otz)new acfi(this, c));
        ouc.r((oua)new acfj(this, c));
        ouc.p((oty)new acfk(this, c));
    }
    
    public final void c(final ouc ouc) {
        throw null;
    }
    
    public final MotionEvent d(final long n, final int n2, final ovs ovs) {
        return MotionEvent.obtain(this.a, n, n2, ovs.a, ovs.b, 0);
    }
}
