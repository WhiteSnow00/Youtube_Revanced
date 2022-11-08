import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ieh extends icx
{
    public ieh() {
    }
    
    private static final apwb k(final zyz zyz) {
        final String a = zyz.a.a;
        final long e = zyz.e;
        final long f = zyz.f;
        final String ay = gkt.aY(a);
        ay.getClass();
        agot.E(ay.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)apwe.a).createBuilder();
        builder.copyOnWrite();
        final apwe apwe = (apwe)builder.instance;
        apwe.c |= 0x1;
        apwe.d = ay;
        final apwb apwb = new apwb(builder);
        final agza a2 = apwb.a;
        final long longValue = e;
        a2.copyOnWrite();
        final apwe apwe2 = (apwe)a2.instance;
        apwe2.c |= 0x8;
        apwe2.g = longValue;
        final String bs = gkt.bs(a);
        final agza a3 = apwb.a;
        a3.copyOnWrite();
        final apwe apwe3 = (apwe)a3.instance;
        bs.getClass();
        apwe3.c |= 0x4;
        apwe3.e = bs;
        final agza a4 = apwb.a;
        final long longValue2 = f;
        a4.copyOnWrite();
        final apwe apwe4 = (apwe)a4.instance;
        apwe4.c |= 0x10;
        apwe4.h = longValue2;
        return apwb;
    }
    
    public final afdu e(final aack aack) {
        final afds i = afdu.i();
        final Iterator iterator = aack.i().l().iterator();
        while (iterator.hasNext()) {
            i.h(k((zyz)iterator.next()));
        }
        return i.g();
    }
    
    public final void g(final vdv vdv, final zyz zyz) {
        vdv.j((vdj)k(zyz));
    }
    
    public final void h(final vdv vdv, final String s) {
        vdv.g(gkt.aY(s));
    }
}
