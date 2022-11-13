// 
// Decompiled by Procyon v0.6.0
// 

public final class abio implements abmf
{
    public aezp a;
    private final tmx b;
    private aezp c;
    private final arwh d;
    
    public abio(final arwh d, final tmx b, final byte[] array, final byte[] array2) {
        this.d = d;
        this.b = b;
        final aeyo a = aeyo.a;
        this.c = (aezp)a;
        this.a = (aezp)a;
    }
    
    private final void c() {
        synchronized (this) {
            if (!this.c.h()) {
                return;
            }
            ((asir)this.c.c()).dispose();
            final aeyo a = aeyo.a;
            this.c = (aezp)a;
            this.a = (aezp)a;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.c.h()) {
                return;
            }
            this.c = aezp.k((Object)this.b.d().R().am((asjm)new abhx(this, 9)));
        }
    }
    
    public final void sG(final abmi abmi) {
        amfz amfz;
        if ((amfz = this.d.f().i) == null) {
            amfz = amfz.a;
        }
        amga amga;
        if ((amga = amfz.j) == null) {
            amga = amga.a;
        }
        if (amga.g > 0) {
            if (!this.c.h()) {
                this.b();
            }
        }
        else if (this.c.h()) {
            this.c();
        }
        if (this.c.h() && this.a.h()) {
            final aqql aqql = (aqql)this.a.d((afaq)yrg.l);
            final ahaz builder = ((ahbh)akxh.a).createBuilder();
            apoc apoc;
            if ((apoc = apoc.b(aqql.j)) == null) {
                apoc = apoc.a;
            }
            builder.copyOnWrite();
            final akxh akxh = (akxh)builder.instance;
            akxh.d = apoc.e;
            akxh.b |= 0x2;
            apoc apoc2;
            if ((apoc2 = apoc.b(aqql.i)) == null) {
                apoc2 = apoc.a;
            }
            builder.copyOnWrite();
            final akxh akxh2 = (akxh)builder.instance;
            akxh2.c = apoc2.e;
            akxh2.b |= 0x1;
            final long k = aqql.k;
            builder.copyOnWrite();
            final akxh akxh3 = (akxh)builder.instance;
            akxh3.b |= 0x4;
            akxh3.e = k;
            final akxh d = (akxh)builder.build();
            abmi.D = d;
            abmi.w((abmh)new abin(d, 0));
        }
    }
}
