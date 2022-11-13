import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqg implements iqx
{
    private final int a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;
    
    public iqg(final Context c, final heo b, final vai e, final aezp d, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
    }
    
    public iqg(final heo b, final vai e, final fzw c, final aezp d, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public iqg(final hzn b, final arwh d, final tjm e, final fmr c, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    public iqg(final hzn c, final oby b, final vdr e, final aezp d, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
    }
    
    @Override
    public final afeq a(final imt imt) {
        final int a = this.a;
        if (a == 0) {
            final aezp n = fmy.n((heo)this.b, (aezp)this.d, 42356, (vai)this.e, (fzw)this.c);
            afeq afeq;
            if (n.h()) {
                final ahaz builder = ((ahbh)alkh.a).createBuilder();
                final ajmo al = (ajmo)n.c();
                builder.copyOnWrite();
                final alkh alkh = (alkh)builder.instance;
                alkh.al = al;
                alkh.h |= 0x2000000;
                afeq = afeq.r((Object)new iqv((MessageLite)builder.build()));
            }
            else {
                afeq = afeq.q();
            }
            return afeq;
        }
        final boolean b = true;
        if (a == 1) {
            final boolean p = tbi.p((arwh)this.d);
            afeq afeq2;
            if (((fmr)this.c).g() && p && ((tjm)this.e).p()) {
                final ahaz builder2 = ((ahbh)alkh.a).createBuilder();
                final aivx s = (aivx)((hzn)this.b).E(Void.class, aivx.class, null, null);
                s.getClass();
                builder2.copyOnWrite();
                final alkh alkh2 = (alkh)builder2.instance;
                alkh2.S = s;
                alkh2.e |= 0x80;
                afeq2 = afeq.r((Object)new iqv((MessageLite)builder2.build()));
            }
            else {
                afeq2 = afeq.q();
            }
            return afeq2;
        }
        if (a == 2) {
            final ahaz builder3 = ajiu.a.createBuilder();
            final String string = ((Context)this.c).getString(2132019850);
            builder3.copyOnWrite();
            final ajiu ajiu = (ajiu)builder3.instance;
            string.getClass();
            ajiu.c |= 0x4;
            ajiu.d = string;
            final String string2 = ((Context)this.c).getString(2132017408);
            builder3.copyOnWrite();
            final ajiu ajiu2 = (ajiu)builder3.instance;
            string2.getClass();
            ajiu2.c |= 0x40;
            ajiu2.f = string2;
            final ahbf b2 = ajit.b;
            final ahbb ahbb = (ahbb)((ahbh)appk.a).createBuilder();
            ((ahaz)ahbb).copyOnWrite();
            final appk appk = (appk)ahbb.instance;
            appk.b |= 0x2;
            appk.d = 164;
            final String f = glb.F((ahaq)b2, ((agzk)((ahaz)ahbb).build()).toByteString());
            builder3.copyOnWrite();
            final ajiu ajiu3 = (ajiu)builder3.instance;
            f.getClass();
            ajiu3.c |= 0x80;
            ajiu3.g = f;
            final boolean h = ((vai)this.e).ap() && (!((vai)this.e).at() || ((vai)this.e).aj());
            builder3.copyOnWrite();
            final ajiu ajiu4 = (ajiu)builder3.instance;
            ajiu4.c |= 0x200;
            ajiu4.h = h;
            final boolean i = ((vai)this.e).ap() && ((vai)this.e).at() && b;
            builder3.copyOnWrite();
            final ajiu ajiu5 = (ajiu)builder3.instance;
            ajiu5.c |= 0x400;
            ajiu5.i = i;
            if (((vai)this.e).f(45372796L)) {
                final String string3 = ((Context)this.c).getString(2132019849);
                builder3.copyOnWrite();
                final ajiu ajiu6 = (ajiu)builder3.instance;
                string3.getClass();
                ajiu6.c |= 0x800;
                ajiu6.j = string3;
            }
            final aezp aezp = (aezp)this.d;
            if (aezp.h()) {
                final boolean a2 = ((irb)aezp.c()).a;
                builder3.copyOnWrite();
                final ajiu ajiu7 = (ajiu)builder3.instance;
                ajiu7.c |= 0x20;
                ajiu7.e = a2;
            }
            final aezp q = ((heo)this.b).q(2131951652, (ahaq)ajiu.b, (Object)builder3.build());
            afeq afeq3;
            if (q.h()) {
                final ahaz builder4 = ((ahbh)alkc.a).createBuilder();
                final ajmo j = (ajmo)q.c();
                builder4.copyOnWrite();
                final alkc alkc = (alkc)builder4.instance;
                alkc.i = j;
                alkc.b |= 0x40;
                afeq3 = afeq.r((Object)new iqv((MessageLite)builder4.build()));
            }
            else {
                afeq3 = afeq.q();
            }
            return afeq3;
        }
        if (a != 3) {
            final long s2 = jgk.s((aezp)this.d, (oby)this.b, (vfp)((vdr)this.e).b());
            afeq afeq4;
            if (s2 < 2147483647L) {
                final ahaz builder5 = ((ahbh)alkh.a).createBuilder();
                final apao v = (apao)((hzn)this.c).E(Void.class, apao.class, null, afev.n("is_texit_message", true, "unplayable_in_secs", (int)s2));
                v.getClass();
                builder5.copyOnWrite();
                final alkh alkh3 = (alkh)builder5.instance;
                alkh3.V = v;
                alkh3.f |= 0x10000;
                afeq4 = afeq.r((Object)new iqv((MessageLite)builder5.build()));
            }
            else {
                afeq4 = afeq.q();
            }
            return afeq4;
        }
        final aezp n2 = fmy.n((heo)this.b, (aezp)this.d, 129218, (vai)this.e, (fzw)this.c);
        afeq afeq5;
        if (n2.h()) {
            final ahaz builder6 = ((ahbh)alkh.a).createBuilder();
            final ajmo al2 = (ajmo)n2.c();
            builder6.copyOnWrite();
            final alkh alkh4 = (alkh)builder6.instance;
            alkh4.al = al2;
            alkh4.h |= 0x2000000;
            afeq5 = afeq.r((Object)new iqv((MessageLite)builder6.build()));
        }
        else {
            afeq5 = afeq.q();
        }
        return afeq5;
    }
}
