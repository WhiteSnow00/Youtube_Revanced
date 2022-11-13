import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqb implements ulc
{
    final Object a;
    private final int b;
    
    public eqb(final eps a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eqb(final eqd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eqb(final eqr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eqb(final erj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final uld a(final int n, final String s, final long n2) {
        final int b = this.b;
        if (b == 0) {
            final eqy a = ((eqd)this.a).a;
            return tpe.bw((Context)a.qg.a, n, s, n2, (oby)a.e.a());
        }
        if (b == 1) {
            final eqy a2 = ((eps)this.a).a;
            return tpe.bw((Context)a2.qg.a, n, s, n2, (oby)a2.e.a());
        }
        if (b != 2) {
            final eqy a3 = ((erj)this.a).a;
            return tpe.bw((Context)a3.qg.a, n, s, n2, (oby)a3.e.a());
        }
        final eqy a4 = ((eqr)this.a).a;
        return tpe.bw((Context)a4.qg.a, n, s, n2, (oby)a4.e.a());
    }
}
