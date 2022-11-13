import com.google.common.util.concurrent.ListenableFuture;
import j$.util.OptionalInt;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.Optional;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzc extends fjo
{
    public final atke f;
    public final atke g;
    public final atke h;
    public final Executor i;
    public final ScheduledExecutorService j;
    public final tnu k;
    public final atke l;
    public boolean m;
    public final vaf n;
    public final vai o;
    public final arwh p;
    public final fzw q;
    private final oby r;
    private final atke s;
    private final Executor t;
    private final asid u;
    private final atke v;
    private final blu w;
    private final jki x;
    
    public hzc(final atke f, final oby r, final fzw q, final vaf n, final arwh p22, final atke s, final atke g, final atke h, final Executor t, final Executor i, final asid u, final ScheduledExecutorService j, final jki x, final blu w, final vai o, final tnu k, final atke l, final atke v, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(f, r);
        this.f = f;
        this.r = r;
        q.getClass();
        this.q = q;
        this.n = n;
        this.p = p22;
        s.getClass();
        this.s = s;
        this.g = g;
        this.h = h;
        this.t = t;
        this.i = i;
        this.u = u;
        this.j = j;
        this.x = x;
        this.w = w;
        this.o = o;
        this.k = k;
        this.l = l;
        this.v = v;
        this.m = true;
    }
    
    public static void n(final atke atke, final vns vns) {
        final String p2 = (String)atke.a();
        if (!TextUtils.isEmpty((CharSequence)p2)) {
            ((vkk)vns).p = p2;
        }
    }
    
    public static void q(final vns vns, final atke atke, final arwh arwh) {
        alxw alxw;
        if ((alxw = arwh.f().e) == null) {
            alxw = alxw.a;
        }
        if (!alxw.K) {
            return;
        }
        final ahaz builder = ((ahbh)ajeg.a).createBuilder();
        final tjm tjm = (tjm)atke.a();
        if (tjm != null) {
            final long b = tjm.b();
            builder.copyOnWrite();
            final ajeg ajeg = (ajeg)builder.instance;
            ajeg.b |= 0x2;
            ajeg.d = b;
            final boolean k = tjm.k();
            builder.copyOnWrite();
            final ajeg ajeg2 = (ajeg)builder.instance;
            ajeg2.b |= 0x1;
            ajeg2.c = k;
        }
        final ajec a = ajej.a();
        ((ahaz)a).copyOnWrite();
        ajej.j((ajej)a.instance, (ajeg)builder.build());
        final ajej b2 = (ajej)((ahaz)a).build();
        b2.getClass();
        vns.B = b2;
    }
    
    public static void r(final vns vns, final aiqj aiqj, final boolean b, final atke atke, final atke atke2, final arwh arwh, final Optional optional) {
        final String f = vxg.f(aiqj);
        final byte[] e = glb.e(aiqj);
        if (e != null) {
            ((vkk)vns).k(e);
        }
        else {
            ((vkk)vns).i();
        }
        if (optional.isPresent()) {
            ((vkk)vns).v = (tlu)optional.get();
        }
        if (aiqj != null && ((ahbc)aiqj).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
            final aicj aicj = (aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint);
            vns.w(f);
            vns.y(aicj.d);
            vns.e = vns.g(aicj.e);
            if (b) {
                ((vkk)vns).s(2);
            }
            if ((aicj.b & 0x40) != 0x0) {
                final ahaz builder = ((ahbh)aicn.a).createBuilder();
                aicm aicm;
                if ((aicm = aicj.h) == null) {
                    aicm = aicm.a;
                }
                builder.aC((Iterable)aicm.d);
                vns.f = (aicn)builder.build();
            }
            n(atke, vns);
        }
        q(vns, atke2, arwh);
    }
    
    @Override
    public final /* bridge */ ashn c(final vkk vkk, final Throwable t) {
        final jki x = this.x;
        final vns vns = (vns)vkk;
        ashn ashn;
        if ("FEwhat_to_watch".equals(vns.c)) {
            ashn = vdh.aZ(((blu)x.b).b()).h((asjr)new iov(x, t, 1, (byte[])null, (byte[])null));
        }
        else {
            ashn = ashn.t();
        }
        return ashn.w((asjr)new hvs(vns, 6)).E(this.u);
    }
    
    @Override
    protected final /* bridge */ ashn d(final vkk vkk) {
        return ((hza)this.s.a()).a((vns)vkk).E(this.u);
    }
    
    @Override
    public final void f(final dbj dbj) {
        final fzw q = this.q;
        ((toj)q.a).k(10, (Throwable)dbj);
        ((tgd)q.b).d((Object)new fhh());
    }
    
    @Override
    public final /* bridge */ void g(final Object o) {
        final BrowseResponseModel browseResponseModel = (BrowseResponseModel)o;
        final fzw q = this.q;
        ((toj)q.a).j(10);
        ((tgd)q.b).d((Object)new fhf());
    }
    
    @Override
    protected final /* bridge */ void i(final vmq vmq, final vkk vkk, final zpf zpf) {
        final vnu vnu = (vnu)vmq;
        final vns vns = (vns)vkk;
        final fzw q = this.q;
        ((toj)q.a).p(10);
        ((tgd)q.b).d((Object)new fhg());
        Executor executor;
        if (this.m) {
            executor = this.i;
        }
        else {
            executor = this.t;
        }
        final long n = this.k.e(tnu.Y) * 60L;
        OptionalInt optionalInt;
        if (n > 0L) {
            final aels q2 = this.k.q(1);
            q2.c(tnu.Y, 0L);
            q2.b();
            optionalInt = OptionalInt.of(afwm.G(n - this.r.c() / 1000L));
        }
        else {
            optionalInt = OptionalInt.empty();
        }
        final boolean b = optionalInt.isPresent() && optionalInt.getAsInt() > 0;
        ListenableFuture listenableFuture;
        if (!((tjm)this.h.a()).p() && "FEwhat_to_watch".equals(vns.c)) {
            listenableFuture = this.w.b();
        }
        else {
            listenableFuture = afwm.m((Object)false);
        }
        final ListenableFuture f = aftq.f((ListenableFuture)afvk.m(listenableFuture), (aftz)new hzb(this, optionalInt, vnu, vns, executor, b), (Executor)afum.a);
        Object o;
        if (this.m) {
            o = this.t;
        }
        else {
            o = afum.a;
        }
        teu.k(f, (Executor)o, (tes)new hug(zpf, 3), (tet)new hgd(zpf, 5));
        this.m = false;
    }
    
    public final void o(final OptionalInt optionalInt, final int n) {
        this.p(optionalInt, n, ahab.b);
    }
    
    public final void p(final OptionalInt optionalInt, int asInt, final ahab e) {
        if (!optionalInt.isPresent()) {
            return;
        }
        final ahaz builder = ((ahbh)akbv.a).createBuilder();
        builder.copyOnWrite();
        final akbv akbv = (akbv)builder.instance;
        akbv.c = asInt - 1;
        akbv.b |= 0x1;
        asInt = optionalInt.getAsInt();
        builder.copyOnWrite();
        final akbv akbv2 = (akbv)builder.instance;
        akbv2.b |= 0x4;
        akbv2.d = asInt;
        if (!e.H()) {
            builder.copyOnWrite();
            final akbv akbv3 = (akbv)builder.instance;
            e.getClass();
            akbv3.b |= 0x8;
            akbv3.e = e;
        }
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.X((aknt)d.instance, (akbv)builder.build());
        ((wxx)this.v.a()).d((aknt)((ahaz)d).build());
    }
}
