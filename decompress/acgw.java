import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgw implements ovo
{
    public long a;
    
    public final ahci a() {
        return anyo.b;
    }
    
    public final /* bridge */ void b(final dta dta, final oua oua, final String s, final Object o, final ouu ouu, final otr otr) {
        if (!((anyo)o).c) {
            return;
        }
        final acwn c = acwo.c();
        ouu.q((our)new acgt(this, c));
        ouu.r((ous)new acgu(this, c));
        ouu.p((ouq)new acgv(this, c));
    }
    
    public final void c(final ouu ouu) {
        throw null;
    }
    
    public final MotionEvent d(final long n, final int n2, final owk owk) {
        return MotionEvent.obtain(this.a, n, n2, owk.a, owk.b, 0);
    }
}
