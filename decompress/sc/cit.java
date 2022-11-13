// 
// Decompiled by Procyon v0.6.0
// 

final class cit extends cio
{
    final ciu a;
    
    public cit(final ciu a) {
        this.a = a;
    }
    
    public final void a(final cin cin) {
        final ciu a = this.a;
        final int p = a.p - 1;
        a.p = p;
        if (p == 0) {
            a.q = false;
            ((cin)a).o();
        }
        cin.A((cim)this);
    }
    
    public final void e() {
        final ciu a = this.a;
        if (!a.q) {
            ((cin)a).t();
            this.a.q = true;
        }
    }
}
