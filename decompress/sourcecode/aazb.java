// 
// Decompiled by Procyon v0.6.0
// 

public final class aazb implements aayz
{
    public final afib a;
    public aexq b;
    private final String c;
    private final String d;
    private final asib e;
    private final vax f;
    private final aexq g;
    private final vbq h;
    private final zki i;
    private final int j;
    
    public aazb(final vbq h, final zki i, final vax f, final String c, final String d, final aexq g, final int j) {
        this.h = h;
        this.i = i;
        this.f = f;
        this.c = c;
        this.d = d;
        this.g = g;
        this.j = j;
        this.e = new asib();
        this.a = afib.a();
        this.b = aewp.a;
    }
    
    private final vbp e() {
        return this.h.a(this.i.c());
    }
    
    private final void f(final byte[] array, final int... array2) {
        if (this.g.h()) {
            final alzo alzo = (alzo)this.e().f(this.d).j((Class)alzo.class).af();
            if (alzo == null || !alzo.g() || !alzo.h()) {
                this.f.a((aioe)this.g.c());
            }
        }
        final agza builder = ((agzi)ajnt.a).createBuilder();
        final ahcu b = ahcv.b();
        b.e(array2);
        final aegg a = b.a();
        builder.copyOnWrite();
        final ajnt ajnt = (ajnt)builder.instance;
        a.getClass();
        ajnt.d = a;
        ajnt.b |= 0x2;
        final agza builder2 = ((agzi)ajns.a).createBuilder();
        builder2.copyOnWrite();
        final ajns ajns = (ajns)builder2.instance;
        ajns.c = 1;
        ajns.b |= 0x1;
        final ajns c = (ajns)builder2.build();
        builder.copyOnWrite();
        final ajnt ajnt2 = (ajnt)builder.instance;
        c.getClass();
        ajnt2.c = c;
        ajnt2.b |= 0x1;
        final ajnt ajnt3 = (ajnt)builder.build();
        final asib e = this.e;
        final vdv c2 = this.e().c();
        c2.i(this.d, ajnt3, array);
        e.c(c2.b().W((asir)gep.q, (asix)aamk.t));
    }
    
    public final void a(final long n) {
        final Long value = n;
        this.b = aexq.k((Object)value);
        final ardu ardu = (ardu)this.a.b((Comparable)value);
        if (ardu != null) {
            final alzm d = alzn.d(this.d);
            final int a = ardu.a;
            final agza a2 = d.a;
            final int intValue = a;
            a2.copyOnWrite();
            final alzq alzq = (alzq)a2.instance;
            final alzq a3 = alzq.a;
            alzq.c |= 0x8;
            alzq.f = intValue;
            d.b(aexs.e((String)ardu.b));
            this.e();
            this.f(d.d().d(), 4, 8);
            this.b = aewp.a;
            return;
        }
        if (this.a.c().isEmpty()) {
            return;
        }
        final alzm d2 = alzn.d(this.d);
        d2.b("");
        this.e();
        this.f(d2.d().d(), 8);
    }
    
    public final void b(final long n) {
        if (this.j == 1) {
            return;
        }
        this.a(n);
    }
    
    public final void c(final long n) {
        this.e.c(this.e().i(this.c).J((asjd)new aawc(6)).W((asjc)aaza.a).k((Class)aosg.class).aB((asix)new aavd(this, 19)));
        this.a(n);
    }
    
    public final void d() {
        this.e.b();
    }
}
