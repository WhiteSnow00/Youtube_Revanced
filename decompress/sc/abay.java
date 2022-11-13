// 
// Decompiled by Procyon v0.6.0
// 

public final class abay implements abax
{
    public final afkb a;
    public aezp b;
    private final String c;
    private final String d;
    private final asiq e;
    private final vcy f;
    private final aezp g;
    private final vdr h;
    private final zmf i;
    private final int j;
    
    public abay(final vdr h, final zmf i, final vcy f, final String c, final String d, final aezp g, final int j) {
        this.h = h;
        this.i = i;
        this.f = f;
        this.c = c;
        this.d = d;
        this.g = g;
        this.j = j;
        this.e = new asiq();
        this.a = afkb.a();
        this.b = (aezp)aeyo.a;
    }
    
    private final vdq e() {
        return this.h.a(this.i.c());
    }
    
    private final void f(final byte[] array, final int... array2) {
        if (this.g.h()) {
            final ambs ambs = (ambs)this.e().f(this.d).j(ambs.class).af();
            if (ambs == null || !ambs.g() || !ambs.h()) {
                this.f.a((aiqj)this.g.c());
            }
        }
        final ahaz builder = ((ahbh)ajpy.a).createBuilder();
        final ahes b = ahet.b();
        b.e(array2);
        final aeih a = b.a();
        builder.copyOnWrite();
        final ajpy ajpy = (ajpy)builder.instance;
        a.getClass();
        ajpy.d = a;
        ajpy.b |= 0x2;
        final ahaz builder2 = ((ahbh)ajpx.a).createBuilder();
        builder2.copyOnWrite();
        final ajpx ajpx = (ajpx)builder2.instance;
        ajpx.c = 1;
        ajpx.b |= 0x1;
        final ajpx c = (ajpx)builder2.build();
        builder.copyOnWrite();
        final ajpy ajpy2 = (ajpy)builder.instance;
        c.getClass();
        ajpy2.c = c;
        ajpy2.b |= 0x1;
        final ajpy ajpy3 = (ajpy)builder.build();
        final asiq e = this.e;
        final vfw c2 = this.e().c();
        c2.i(this.d, ajpy3, array);
        e.c(c2.b().W((asjg)gex.q, (asjm)aaof.t));
    }
    
    @Override
    public final void a(final long n) {
        final Long value = n;
        this.b = aezp.k((Object)value);
        final argj argj = (argj)this.a.b(value);
        if (argj != null) {
            final ambq d = ambr.d(this.d);
            final int a = argj.a;
            final ahaz a2 = d.a;
            final int intValue = a;
            a2.copyOnWrite();
            final ambu ambu = (ambu)a2.instance;
            final ambu a3 = ambu.a;
            ambu.c |= 0x8;
            ambu.f = intValue;
            d.b(aezr.e((String)argj.b));
            this.e();
            this.f(d.d().d(), 4, 8);
            this.b = (aezp)aeyo.a;
            return;
        }
        if (this.a.c().isEmpty()) {
            return;
        }
        final ambq d2 = ambr.d(this.d);
        d2.b("");
        this.e();
        this.f(d2.d().d(), 8);
    }
    
    @Override
    public final void b(final long n) {
        if (this.j == 1) {
            return;
        }
        this.a(n);
    }
    
    @Override
    public final void c(final long n) {
        this.e.c(this.e().i(this.c).K((asjs)new aada(9)).Z((asjr)aaxs.j).l(aouj.class).aH(new abav(this, 3)));
        this.a(n);
    }
    
    @Override
    public final void d() {
        this.e.b();
    }
}
