// 
// Decompiled by Procyon v0.6.0
// 

public final class ablm implements abmf
{
    private final abjk a;
    private final abkl b;
    
    public ablm(final abjk a, final abkl b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void sG(final abmi abmi) {
        if (this.a.g() == abjv.h) {
            abmi.R = (aakv.g(5) | aakv.g(2));
            abmi.S = (aakv.d(5) | aakv.d(2));
        }
        else {
            final abjk a = this.a;
            abmi.R = a.f().a;
            int s;
            if (a.s()) {
                s = aakv.d(5);
            }
            else {
                s = aakv.d(1);
            }
            abmi.S = s;
        }
        final abjk a2 = this.a;
        abmi.T = a2.h().c;
        abmi.x(a2.g().i);
        synchronized (this.b) {
            final abkl b = this.b;
            if (b.m()) {
                abmi.K = b.l();
                abmi.J = this.b.a();
                abmi.L = this.b.b().f;
                abmi.N = this.b.o();
            }
        }
    }
}
