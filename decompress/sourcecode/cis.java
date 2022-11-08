// 
// Decompiled by Procyon v0.6.0
// 

final class cis extends cin
{
    final cit a;
    
    public cis(final cit a) {
        this.a = a;
    }
    
    public final void a(final cim cim) {
        final cit a = this.a;
        final int p = a.p - 1;
        a.p = p;
        if (p == 0) {
            a.q = false;
            ((cim)a).o();
        }
        cim.A((cil)this);
    }
    
    public final void e() {
        final cit a = this.a;
        if (!a.q) {
            ((cim)a).t();
            this.a.q = true;
        }
    }
}
