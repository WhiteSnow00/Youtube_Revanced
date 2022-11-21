// 
// Decompiled by Procyon v0.6.0
// 

public final class aand
{
    public final aanf a;
    public twp b;
    public aapa c;
    public boolean d;
    public boolean e;
    
    public aand(final zdb zdb) {
        zdb.d((zdc)(this.a = new aanf()));
    }
    
    public final xbt a() {
        final twp b = this.b;
        if (b != null) {
            return (xbt)b.a();
        }
        return null;
    }
    
    public final void b(final aske aske, final aske aske2, final aske aske3) {
        final aslm aslm = new aslm();
        aslm.c(aske.am(new aaid(this, 16)));
        aslm.c(aske3.an(new aaid(this, 11), (asmi)uzs.r));
        aslm.c(aana.o(aske2, aanc.b).am(new aaid(this, 14)));
        aslm.c(aana.o(aske3, aanc.a).an(new aaid(this, 15), (asmi)uzs.r));
        aslm.c(aana.o(aske3, aanc.c).an(new aaid(this, 17), (asmi)uzs.r));
        aslm.c(aana.o(aske2, aanc.d).am(new aaid(this, 18)));
        aslm.c(aana.o(aske2, aanc.e).am(new aaid(this, 19)));
        aslm.c(aana.o(aske2, aanc.f).am(new aaid(this, 20)));
        aslm.c(aana.o(aske3, aanc.g).an(new aaid(this, 10), (asmi)uzs.r));
        aslm.c(aana.o(aske3, (afax)zzj.n).an(new aaid(this, 12), (asmi)uzs.r));
        aslm.c(aske2.p().Z((asmn)zjn.t).am(new aaid(this, 13)));
    }
    
    public final void c() {
        final xbt a = this.a();
        if (a != null) {
            a.c("pl_int");
            this.e();
        }
    }
    
    public final void d(final aaod aaod) {
        final xbt xbt = (xbt)this.b.a();
        if (xbt != null) {
            if (aaod.a() > 0L) {
                xbt.d(aaod.f(), aaod.a());
                return;
            }
            xbt.c(aaod.f());
        }
    }
    
    public final void e() {
        final xbt xbt = (xbt)this.b.a();
        if (xbt != null) {
            xbt.c("aa");
            final twp b = this.b;
            if (b instanceof abkj) {
                ((abkj)b).a = null;
            }
            this.d = false;
            this.e = false;
        }
    }
}
