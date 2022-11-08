import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class epy implements ujg
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public epy(final epq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public epy(final eqa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public epy(final eqo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public epy(final erg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ujh a(final int n, final String s, final long n2) {
        final int b = this.b;
        if (b == 0) {
            final eqv a = ((eqa)this.a).a;
            return uji.a((Context)a.qg.a, n, s, n2, (oas)a.e.a());
        }
        if (b == 1) {
            final eqv a2 = ((epq)this.a).a;
            return uji.a((Context)a2.qg.a, n, s, n2, (oas)a2.e.a());
        }
        if (b != 2) {
            final eqv a3 = ((erg)this.a).a;
            return uji.a((Context)a3.qg.a, n, s, n2, (oas)a3.e.a());
        }
        final eqv a4 = ((eqo)this.a).a;
        return uji.a((Context)a4.qg.a, n, s, n2, (oas)a4.e.a());
    }
}
