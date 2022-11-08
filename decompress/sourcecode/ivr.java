import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivr
{
    public boolean a;
    public final ivp b;
    public final ivq c;
    public final vbq d;
    public final zki e;
    public final asho f;
    public asic g;
    public asic h;
    public String i;
    public final uyi j;
    
    public ivr(final ivp b, final ivq c, final vbq d, final zki e, final abns abns, final uyi j, final asho f, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = true;
        this.i = "";
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.j = j;
        this.f = f;
        mrm.A((Callable)new imb(this, abns, 3));
    }
    
    public final void a(final String e, final boolean b) {
        final vbp a = this.d.a(this.e.c());
        final String h = vek.h(akdn.b.a(), e);
        h.getClass();
        agot.E(h.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)akdn.a).createBuilder();
        builder.copyOnWrite();
        final akdn akdn = (akdn)builder.instance;
        akdn.c |= 0x1;
        akdn.d = h;
        final akdk akdk = new akdk(builder);
        final agza a2 = akdk.a;
        a2.copyOnWrite();
        final akdn akdn2 = (akdn)a2.instance;
        e.getClass();
        akdn2.c |= 0x2;
        akdn2.e = e;
        akdo akdo;
        if (b) {
            akdo = akdo.b;
        }
        else {
            akdo = akdo.d;
        }
        final agza a3 = akdk.a;
        a3.copyOnWrite();
        final akdn akdn3 = (akdn)a3.instance;
        akdn3.g = akdo.e;
        akdn3.c |= 0x8;
        final agza a4 = akdk.a;
        final boolean booleanValue = (boolean)true;
        a4.copyOnWrite();
        final akdn akdn4 = (akdn)a4.instance;
        akdn4.c |= 0x10;
        akdn4.h = booleanValue;
        final akdm b2 = akdk.b();
        final vdv c = a.c();
        c.d((vdm)b2);
        c.b().U();
    }
}
