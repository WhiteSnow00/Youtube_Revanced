import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public class agzc extends agza implements agze, ozs
{
    public agzc() {
        final epe a = epe.a;
        throw null;
    }
    
    public agzc(final agzd agzd) {
        super((agzi)agzd);
    }
    
    public agzc(final byte[] array) {
        this((agzd)nzs.b());
    }
    
    private final agyv cK() {
        agyv l;
        final agyv agyv = l = ((agzd)this.instance).l;
        if (agyv.c) {
            l = agyv.d();
            ((agzd)this.instance).l = l;
        }
        return l;
    }
    
    private final void cL(final agzg agzg) {
        if (agzg.a == this.getDefaultInstanceForType()) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
    
    public final agzd a() {
        if (!((agzi)this.instance).isMutable()) {
            return (agzd)this.instance;
        }
        ((agzd)this.instance).l.f();
        return (agzd)super.buildPartial();
    }
    
    public final void cH(final agza agza) {
        this.copyOnWrite();
        final anip anip = (anip)this.instance;
        final aora aora = (aora)agza.build();
        final anip a = anip.a;
        aora.getClass();
        final agzy w = anip.w;
        if (!w.c()) {
            anip.w = agzi.mutableCopy(w);
        }
        anip.w.add(aora);
    }
    
    public final void cI(final agza agza) {
        this.copyOnWrite();
        final aorm aorm = (aorm)this.instance;
        final aorl aorl = (aorl)agza.build();
        final aorm a = aorm.a;
        aorl.getClass();
        aorm.a();
        aorm.c.add(aorl);
    }
    
    public final void cJ(final int n, final agza agza) {
        this.copyOnWrite();
        final apot apot = (apot)this.instance;
        final appq appq = (appq)agza.build();
        final apot a = apot.a;
        appq.getClass();
        final agzy e = apot.e;
        if (!e.c()) {
            apot.e = agzi.mutableCopy(e);
        }
        apot.e.set(n, appq);
    }
    
    protected final void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        if (((agzd)this.instance).l != agyv.a) {
            final agzd agzd = (agzd)this.instance;
            agzd.l = agzd.l.d();
        }
    }
    
    public final void d(final agyr agyr) {
        final agzg -$$Nest$smcheckIsLite = agzi.-$$Nest$smcheckIsLite(agyr);
        this.cL(-$$Nest$smcheckIsLite);
        this.copyOnWrite();
        final agyv ck = this.cK();
        ck.b.remove(-$$Nest$smcheckIsLite.d);
        if (ck.b.isEmpty()) {
            ck.d = false;
        }
    }
    
    public final void e(final agyr agyr, final Object o) {
        final agzg -$$Nest$smcheckIsLite = agzi.-$$Nest$smcheckIsLite(agyr);
        this.cL(-$$Nest$smcheckIsLite);
        this.copyOnWrite();
        final agyv ck = this.cK();
        final agzf d = -$$Nest$smcheckIsLite.d;
        Object d2;
        if (d.d) {
            d2 = o;
            if (d.a() == ahcn.h) {
                d2 = new ArrayList<Object>();
                final Iterator iterator = ((List)o).iterator();
                while (iterator.hasNext()) {
                    ((List<Object>)d2).add(-$$Nest$smcheckIsLite.d(iterator.next()));
                }
            }
        }
        else {
            d2 = -$$Nest$smcheckIsLite.d(o);
        }
        ck.n(d, d2);
    }
    
    public final void f(final long n) {
        this.copyOnWrite();
        final ahdm ahdm = (ahdm)this.instance;
        final ahdm a = ahdm.a;
        ahdm.a();
        ahdm.m.f(n);
    }
    
    @Deprecated
    public final void g(final Iterable iterable) {
        this.copyOnWrite();
        final ahvo ahvo = (ahvo)this.instance;
        final ahvo a = ahvo.a;
        final agzy c = ahvo.c;
        if (!c.c()) {
            ahvo.c = agzi.mutableCopy(c);
        }
        agxl.addAll(iterable, (List)ahvo.c);
    }
    
    public final void h(final Iterable iterable) {
        this.copyOnWrite();
        final ahvo ahvo = (ahvo)this.instance;
        final ahvo a = ahvo.a;
        final agzy b = ahvo.b;
        if (!b.c()) {
            ahvo.b = agzi.mutableCopy(b);
        }
        agxl.addAll(iterable, (List)ahvo.b);
    }
    
    public final void i(final ajss ajss) {
        this.copyOnWrite();
        final ajsq ajsq = (ajsq)this.instance;
        final ajsq a = ajsq.a;
        ajss.getClass();
        ajsq.a();
        ajsq.c.add(ajss);
    }
    
    public final void j(final Iterable iterable) {
        this.copyOnWrite();
        final akve akve = (akve)this.instance;
        final akve a = akve.a;
        final agzy g = akve.G;
        if (!g.c()) {
            akve.G = agzi.mutableCopy(g);
        }
        agxl.addAll(iterable, (List)akve.G);
    }
    
    public final void k(final Iterable iterable) {
        this.copyOnWrite();
        final alib alib = (alib)this.instance;
        final alib a = alib.a;
        alib.a();
        agxl.addAll(iterable, (List)alib.e);
    }
    
    public final void l(final alie alie) {
        this.copyOnWrite();
        final alib alib = (alib)this.instance;
        final alib a = alib.a;
        alie.getClass();
        alib.a();
        alib.e.add(alie);
    }
    
    public final void m(final alid alid) {
        this.copyOnWrite();
        final alib alib = (alib)this.instance;
        final alib a = alib.a;
        alid.getClass();
        alib.d();
        alib.f.add(alid);
    }
    
    public final void n(final Iterable iterable) {
        this.copyOnWrite();
        final amsf amsf = (amsf)this.instance;
        final agzr a = amsf.a;
        amsf.a();
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            amsf.e.g(((amse)iterator.next()).f);
        }
    }
    
    public final void o(final Iterable iterable) {
        this.copyOnWrite();
        final amsf amsf = (amsf)this.instance;
        final agzr a = amsf.a;
        amsf.d();
        agxl.addAll(iterable, (List)amsf.f);
    }
    
    public final void p(final amse amse) {
        this.copyOnWrite();
        final amsf amsf = (amsf)this.instance;
        final agzr a = amsf.a;
        amse.getClass();
        amsf.a();
        amsf.e.g(amse.f);
    }
    
    public final void q(final anss anss) {
        this.copyOnWrite();
        final anhb anhb = (anhb)this.instance;
        final anhb a = anhb.a;
        anss.getClass();
        final agzy z = anhb.z;
        if (!z.c()) {
            anhb.z = agzi.mutableCopy(z);
        }
        anhb.z.add(anss);
    }
    
    public final void r(final anss anss) {
        this.copyOnWrite();
        final aogo aogo = (aogo)this.instance;
        final aogo a = aogo.a;
        anss.getClass();
        final agzy c = aogo.c;
        if (!c.c()) {
            aogo.c = agzi.mutableCopy(c);
        }
        aogo.c.add(anss);
    }
    
    public final Object rr(final agyr agyr) {
        return ((agzd)this.instance).rr(agyr);
    }
    
    public final boolean rs(final agyr agyr) {
        return ((agzd)this.instance).rs(agyr);
    }
    
    public final void s(final String s) {
        this.copyOnWrite();
        final aova aova = (aova)this.instance;
        final aova a = aova.a;
        s.getClass();
        aova.a();
        aova.h.add(s);
    }
    
    public final appg t(final int n) {
        return ((appn)this.instance).c.get(n);
    }
    
    public final void u(final agzc agzc) {
        this.copyOnWrite();
        final ajsq ajsq = (ajsq)this.instance;
        final ajss ajss = (ajss)agzc.build();
        final ajsq a = ajsq.a;
        ajss.getClass();
        ajsq.a();
        ajsq.c.add(ajss);
    }
    
    public final void v(final agza agza) {
        this.copyOnWrite();
        final alib alib = (alib)this.instance;
        final alie alie = (alie)agza.build();
        final alib a = alib.a;
        alie.getClass();
        alib.a();
        alib.e.add(alie);
    }
    
    public final void w(final agza agza) {
        this.copyOnWrite();
        final angx angx = (angx)this.instance;
        final angw angw = (angw)agza.build();
        final angx a = angx.a;
        angw.getClass();
        angx.a();
        angx.i.add(angw);
    }
}
