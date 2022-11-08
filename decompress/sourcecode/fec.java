// 
// Decompiled by Procyon v0.6.0
// 

public final class fec implements thj
{
    private final wvu b;
    private final thh c;
    
    public fec(final wvu b, final thh c) {
        this.b = b;
        this.c = c;
    }
    
    public final void a(final dbi dbi) {
        if (dbi instanceof daz) {
            if (this.c.o()) {
                final anph a = anpi.a();
                final anpj c = anpj.c;
                ((agza)a).copyOnWrite();
                anpi.c((anpi)a.instance, c);
                final ajbv f = this.c.f();
                ((agza)a).copyOnWrite();
                anpi.d((anpi)a.instance, f);
                final anpk a2 = anpk.a;
                ((agza)a).copyOnWrite();
                anpi.e((anpi)a.instance, a2);
                final anpi anpi = (anpi)((agza)a).build();
                final aklo d = aklq.d();
                ((agza)d).copyOnWrite();
                aklq.bf((aklq)d.instance, anpi);
                this.b.d((aklq)((agza)d).build());
            }
        }
    }
    
    public final void b() {
        if (this.c.o()) {
            return;
        }
        final anph a = anpi.a();
        final anpj b = anpj.b;
        ((agza)a).copyOnWrite();
        anpi.c((anpi)a.instance, b);
        final ajbv f = this.c.f();
        ((agza)a).copyOnWrite();
        anpi.d((anpi)a.instance, f);
        final anpk a2 = anpk.a;
        ((agza)a).copyOnWrite();
        anpi.e((anpi)a.instance, a2);
        final anpi anpi = (anpi)((agza)a).build();
        final aklo d = aklq.d();
        ((agza)d).copyOnWrite();
        aklq.bf((aklq)d.instance, anpi);
        this.b.d((aklq)((agza)d).build());
    }
}
