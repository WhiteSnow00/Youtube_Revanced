import java.util.Iterator;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.List;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iig implements Callable
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final int g;
    
    public iig(final ihy a, final zme b, final List f, final Map c, final Map d, final alzg e, final int g) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public iig(final iin a, final zme b, final String c, final String d, final amao e, final amuj f, final int g) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public iig(final iqp b, final ahbb d, final imt a, final ListenableFuture e, final ListenableFuture f, final ListenableFuture c, final int g) {
        this.g = g;
        this.b = b;
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.c = c;
    }
    
    @Override
    public final Object call() {
        final int g = this.g;
        if (g == 0) {
            final Object a = this.a;
            final Object b = this.b;
            final Object c = this.c;
            final Object d = this.d;
            final Object e = this.e;
            final Object f = this.f;
            tbi.e();
            final amao amao = (amao)e;
            aabz aabz;
            if ((amao.c & 0x10) != 0x0) {
                final iin iin = (iin)a;
                final aaeh aaeh = (aaeh)fex.k(iin.h, (zme)b).orElse((Object)null);
                if (aaeh == null) {
                    final aaby b2 = aabz.c.b();
                    b2.b = 35;
                    aabz = b2.a();
                }
                else {
                    final zvo b3 = aaeh.B();
                    if (b3 == null) {
                        final aaby b4 = aabz.c.b();
                        b4.b = 15;
                        aabz = b4.a();
                    }
                    else {
                        amvs amvs;
                        if ((amvs = amao.g) == null) {
                            amvs = amvs.a;
                        }
                        final aaba c2 = aaba.c(amvs);
                        amwz amwz;
                        if ((amwz = amwz.b(amao.d)) == null) {
                            amwz = amwz.a;
                        }
                        final int u = iin.d.U(amwz);
                        final boolean j = amao.j;
                        if (!b3.an(c2, aaaz.a(amao.h), amwz, u, amao.i.I(), j, (String)d)) {
                            final aaby b5 = aabz.c.b();
                            b5.b = 41;
                            aabz = b5.a();
                        }
                        else if (j) {
                            final atib d2 = aaeh.D();
                            if (d2 != null) {
                                iin.p(d2, b3.x().size(), (String)c);
                            }
                            aabz = iin.e((String)c, (amuj)f);
                        }
                        else {
                            aabz = aabz.a;
                        }
                    }
                }
            }
            else {
                final aaby b6 = aabz.c.b();
                b6.b = 27;
                aabz = b6.a();
            }
            return aabz;
        }
        final boolean b7 = true;
        if (g != 1) {
            final Object b8 = this.b;
            final Object d3 = this.d;
            final Object a2 = this.a;
            final Object e2 = this.e;
            final Object f2 = this.f;
            final Object c3 = this.c;
            final flm flm = (flm)afwm.u((Future)e2);
            final boolean booleanValue = (boolean)afwm.u((Future)f2);
            final boolean booleanValue2 = (boolean)afwm.u((Future)c3);
            final iqh d4 = iqh.d;
            final aezp k = aezp.k((Object)new irb(booleanValue));
            final imt imt = (imt)a2;
            final iqp iqp = (iqp)b8;
            final aezp b9 = iqp.b(d4, (Class)alkc.class, k, imt);
            if (b9.h()) {
                final alkc d5 = (alkc)b9.c();
                ((ahaz)d3).copyOnWrite();
                final alke alke = (alke)((ahbb)d3).instance;
                final alke a3 = alke.a;
                alke.d = d5;
                alke.c |= 0x1;
            }
            final afeq b10 = flm.b;
            final ArrayList list = new ArrayList();
            final Iterator iterator = ((List)b10).iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final vfn vfn = (vfn)iterator.next();
                if (vfn instanceof amar) {
                    final aezp b11 = iqp.b(iqh.a, (Class)alkh.class, aezp.k((Object)iqy.a(n, (amar)vfn)), imt);
                    if (!b11.h()) {
                        continue;
                    }
                    list.add(b11.c());
                    ++n;
                }
            }
            if (list.isEmpty()) {
                final iqh c4 = iqh.c;
                final alyt alyt = (alyt)iqp.a.a(iqp.c.c()).f(glb.V()).j(alyt.class).af();
                Object o = null;
                Label_0458: {
                    if (alyt != null) {
                        final vfn b12 = alyt.b.b(alyt.c.f);
                        boolean b13 = b7;
                        if (b12 != null) {
                            b13 = (b12 instanceof anuc && b7);
                        }
                        adkp.R(b13, (Object)"entityFromStore is not instance of RefreshEntityModel, key=refresh");
                        final anuc anuc = (anuc)b12;
                        if (anuc != null) {
                            o = aezp.k((Object)anuc.getRefreshTime());
                            break Label_0458;
                        }
                    }
                    o = aeyo.a;
                }
                final aezp b14 = iqp.b(c4, (Class)alkh.class, (aezp)o, imt);
                if (b14.h()) {
                    ((ahbb)d3).l((alkh)b14.c());
                }
            }
            else {
                if (booleanValue2) {
                    final aezp b15 = iqp.b(iqh.p, (Class)alkh.class, aezp.k((Object)new ira(iqp.g.getResources().getString(2132019844), iqp.g.getResources().getString(2132019843), Integer.valueOf(153067))), imt);
                    if (b15.h()) {
                        list.add(b15.c());
                    }
                }
                ((ahbb)d3).k((Iterable)list);
            }
            final ahaz builder = ((ahbh)anyy.a).createBuilder();
            builder.copyOnWrite();
            final anyy anyy = (anyy)builder.instance;
            final alke i = (alke)((ahaz)d3).build();
            i.getClass();
            anyy.j = i;
            anyy.b |= 0x10;
            return afeq.r((Object)new iqv((MessageLite)builder.build()));
        }
        final Object a4 = this.a;
        final Object b16 = this.b;
        final Object f3 = this.f;
        final Object c5 = this.c;
        final Object d6 = this.d;
        final alzg alzg = (alzg)this.e;
        return ((ihy)a4).d((zme)b16, (List)f3, (Map)c5, (Map)d6, alzg.i, alzg.j);
    }
}
