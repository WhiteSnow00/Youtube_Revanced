import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwq
{
    public boolean a;
    public final iwo b;
    public final iwp c;
    public final vdr d;
    public final zmf e;
    public final asid f;
    public asir g;
    public asir h;
    public String i;
    public final vai j;
    
    public iwq(final iwo b, final iwp c, final vdr d, final zmf e, final abpu abpu, final vai j, final asid f, final msr msr, final byte[] array, final byte[] array2) {
        this.a = true;
        this.i = "";
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.j = j;
        this.f = f;
        msr.Q((Callable)new imy(this, abpu, 3));
    }
    
    public final void a(final String e, final boolean b) {
        final vdq a = this.d.a(this.e.c());
        final String h = vgl.h(akfq.b.a(), e);
        h.getClass();
        adkp.R(h.isEmpty() ^ true, (Object)"key cannot be empty");
        final ahaz builder = ((ahbh)akfq.a).createBuilder();
        builder.copyOnWrite();
        final akfq akfq = (akfq)builder.instance;
        akfq.c |= 0x1;
        akfq.d = h;
        final akfn akfn = new akfn(builder);
        final ahaz a2 = akfn.a;
        a2.copyOnWrite();
        final akfq akfq2 = (akfq)a2.instance;
        e.getClass();
        akfq2.c |= 0x2;
        akfq2.e = e;
        akfr akfr;
        if (b) {
            akfr = akfr.b;
        }
        else {
            akfr = akfr.d;
        }
        final ahaz a3 = akfn.a;
        a3.copyOnWrite();
        final akfq akfq3 = (akfq)a3.instance;
        akfq3.g = akfr.e;
        akfq3.c |= 0x8;
        final ahaz a4 = akfn.a;
        final boolean booleanValue = (boolean)true;
        a4.copyOnWrite();
        final akfq akfq4 = (akfq)a4.instance;
        akfq4.c |= 0x10;
        akfq4.h = booleanValue;
        final akfp b2 = akfn.b();
        final vfw c = a.c();
        c.d((vfn)b2);
        c.b().U();
    }
}
