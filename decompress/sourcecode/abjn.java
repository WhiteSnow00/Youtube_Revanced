// 
// Decompiled by Procyon v0.6.0
// 

public final class abjn implements abkd
{
    private final abhs a;
    private final abit b;
    
    public abjn(final abhs a, final abit b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void sA(final abkg abkg) {
        if (this.a.g() == abid.h) {
            abkg.R = (aaja.g(5) | aaja.g(2));
            abkg.S = (aaja.d(5) | aaja.d(2));
        }
        else {
            final abhs a = this.a;
            abkg.R = a.f().a;
            int s;
            if (a.s()) {
                s = aaja.d(5);
            }
            else {
                s = aaja.d(1);
            }
            abkg.S = s;
        }
        final abhs a2 = this.a;
        abkg.T = a2.h().c;
        abkg.x(a2.g().i);
        synchronized (this.b) {
            final abit b = this.b;
            if (b.m()) {
                abkg.K = b.l();
                abkg.J = this.b.a();
                abkg.L = this.b.b().f;
                abkg.N = this.b.o();
            }
        }
    }
}
