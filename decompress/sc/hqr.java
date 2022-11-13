import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqr implements View$OnClickListener
{
    public final boolean a;
    public final hqt b;
    public final Object c;
    public final ahbh d;
    private final int e;
    
    public hqr(final hqh b, final hrf c, final boolean a, final aicz d, final int e) {
        this.e = e;
        this.b = (hqt)b;
        this.c = c;
        this.a = a;
        this.d = (ahbh)d;
    }
    
    public hqr(final hqu c, final boolean a, final hqt b, final ansx d, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = (ahbh)d;
    }
    
    public final void onClick(final View view) {
        if (this.e != 0) {
            final hqt b = this.b;
            final Object c = this.c;
            final boolean a = this.a;
            final ahbh d = this.d;
            if (a) {
                final aicz aicz = (aicz)d;
                if ((aicz.b & 0x800000) != 0x0) {
                    ((hqh)b).h.pF().J(3, (wzz)new wyt(aicz.w), (alhi)null);
                }
            }
            ((hrf)c).y();
            return;
        }
        final Object c2 = this.c;
        final boolean a2 = this.a;
        final hqt b2 = this.b;
        final ahbh d2 = this.d;
        if (a2) {
            ((hqu)c2).c.pF().J(3, (wzz)new wyt(xaa.c(117892)), (alhi)null);
            b2.p((ansx)d2);
        }
    }
}
