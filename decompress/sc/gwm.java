// 
// Decompiled by Procyon v0.6.0
// 

final class gwm implements txg
{
    final gww a;
    
    public gwm(final gww a) {
        this.a = a;
    }
    
    public final void a(final txh txh) {
        ((utv)txh).E();
    }
    
    public final void b(final txh txh) {
        final hap bq = this.a.bq;
        if (bq != null && bq.i()) {
            this.a.N();
        }
        final ubu k = this.a.k;
        final ucd ucd = (ucd)((ativ)k.b).aG();
        arbc arbc = null;
        ubw ubw;
        if (ucd != null) {
            String p;
            if ((p = ucd.p) == null) {
                p = null;
            }
            afeq aa;
            if ((aa = ucd.aa()) == null) {
                aa = null;
            }
            String s;
            if ((s = (String)ucd.q().f()) == null) {
                s = null;
            }
            final arbc arbc2 = (arbc)ucd.n().f();
            if (arbc2 != null) {
                arbc = arbc2;
            }
            ubw = tpe.bK(p, aa, s, arbc);
        }
        else {
            ubw = tpe.bK((String)null, (afeq)null, (String)null, (arbc)null);
        }
        k.f(ubw);
        ((utv)txh).E();
        final gwe j = this.a.J;
        if (j != null) {
            j.c(true);
        }
    }
    
    public final void c() {
        this.a.j(true);
    }
}
