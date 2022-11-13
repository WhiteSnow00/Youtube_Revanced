import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzx implements uaf
{
    private final atke a;
    private final aeea b;
    
    public gzx(final atke a, final aeea b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
    }
    
    public final View a(final ViewGroup viewGroup, final aqzt aqzt, final acwr acwr) {
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131625642, viewGroup, false);
        final gzs gzs = (gzs)this.a.a();
        final twx cg = this.b.cG(xaa.c(118661));
        cg.k(true);
        cg.c();
        final twx cg2 = this.b.cG(xaa.c(118662));
        cg2.k(true);
        cg2.c();
        inflate.setOnClickListener((View$OnClickListener)new gbw(acwr, gzs, aqzt, 4));
        return inflate;
    }
    
    public final void b(final aqzt aqzt) {
        if (this.c(aqzt)) {
            ((gzs)this.a.a()).e(aqzt.e(), 118662);
        }
    }
    
    public final boolean c(final aqzt aqzt) {
        final aqzr i = aqzt.i();
        arah a;
        if (i.c == 1) {
            a = (arah)i.d;
        }
        else {
            a = arah.a;
        }
        return !a.c.isEmpty();
    }
}
