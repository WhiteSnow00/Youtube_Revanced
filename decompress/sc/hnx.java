import java.util.Iterator;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.List;
import java.util.Collections;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnx
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    
    public hnx(final Activity i, final zmf h, final zmt f, final vwa a, final tqd c, final tgd d, final tjm j, final tqn g, final vcy b, final Executor e, final byte[] array, final byte[] array2) {
        this.i = i;
        this.h = h;
        this.f = f;
        this.a = a;
        this.c = c;
        this.d = d;
        this.j = j;
        this.g = g;
        this.b = b;
        this.e = e;
    }
    
    public hnx(final atke a, final atke b, final atke c, final atke d, final atke e, final atke f, final atke g, final atke h, final atke i, final atke j) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        this.j = j;
    }
    
    public hnx(final atke b, final atke f, final atke i, final atke c, final atke a, final atke g, final atke d, final atke h, final atke e, final atke j, final byte[] array) {
        b.getClass();
        this.b = b;
        f.getClass();
        this.f = f;
        i.getClass();
        this.i = i;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        this.g = g;
        d.getClass();
        this.d = d;
        h.getClass();
        this.h = h;
        e.getClass();
        this.e = e;
        j.getClass();
        this.j = j;
    }
    
    public final hdf a(final View view, final hde hde, final boolean b) {
        view.getClass();
        final wyw wyw = (wyw)((atke)this.b).a();
        wyw.getClass();
        final aeea aeea = (aeea)((atke)this.f).a();
        aeea.getClass();
        final bu bu = (bu)((atke)this.i).a();
        bu.getClass();
        final Context context = (Context)((atke)this.c).a();
        final ubi ubi = (ubi)((atke)this.a).a();
        final acgs acgs = (acgs)((atke)this.g).a();
        acgs.getClass();
        final cyb cyb = (cyb)((atke)this.d).a();
        final aujg aujg = (aujg)((atke)this.h).a();
        aujg.getClass();
        final ucb ucb = (ucb)((atke)this.e).a();
        final vcy vcy = (vcy)((atke)this.j).a();
        vcy.getClass();
        return new hdf(view, hde, b, wyw, aeea, bu, context, ubi, acgs, cyb, aujg, ucb, vcy, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void b(final alog alog, final aloa aloa, final gft gft, final gft gft2, final gft gft3) {
        aloa.getClass();
        if (!((tjm)this.j).o()) {
            ((tqn)this.g).b();
            return;
        }
        if (((zmf)this.h).t()) {
            this.c(alog, aloa, false, gft, gft2, gft3);
            return;
        }
        ((zmt)this.f).b((Activity)this.i, (byte[])null, (zmr)new gfs(this, alog, aloa, gft, gft2, gft3, (byte[])null, (byte[])null));
    }
    
    public final void c(final alog alog, final aloa aloa, final boolean b, final gft gft, final gft gft2, final gft gft3) {
        final Runnable a = afwb.a;
        while (true) {
            for (final aiqj aiqj : Collections.unmodifiableList((List<? extends aiqj>)((aloa)((ahbb)((ahbh)aloa).toBuilder()).instance).p)) {
                if (((ahbc)aiqj).ry((ahaq)LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)) {
                    alog alog2;
                    if ((alog2 = alog.b(((LikeEndpointOuterClass$LikeEndpoint)((ahbc)aiqj).rx((ahaq)LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)).e)) == null) {
                        alog2 = alog.a;
                    }
                    if (!alog2.equals(alog)) {
                        continue;
                    }
                    final Object o = aezp.k((Object)aiqj);
                    final alog n = vyg.n((ahbb)((ahbh)aloa).toBuilder());
                    final vro b2 = ((vwa)this.a).b(((zmf)this.h).c());
                    final alog a2 = alog.a;
                    final int ordinal = alog.ordinal();
                    if (ordinal == 0) {
                        final vrn b3 = b2.b();
                        if (((aezp)o).h()) {
                            b3.w((aiqj)((aezp)o).c());
                        }
                        else {
                            b3.k(aloa.n.I());
                            aloh aloh;
                            if ((aloh = aloa.c) == null) {
                                aloh = aloh.a;
                            }
                            b3.x(aloh);
                        }
                        gft.a(alog.a, aloa);
                        teu.l(b2.g(b3), (Executor)this.e, (tes)new gfr(this, gft3, n, aloa, 0, (byte[])null, (byte[])null), (tet)new fct(this, aloa, b, gft2, 3, (byte[])null, (byte[])null), a);
                        return;
                    }
                    if (ordinal != 1) {
                        final vrq d = b2.d();
                        if (((aezp)o).h()) {
                            d.w((aiqj)((aezp)o).c());
                        }
                        else {
                            d.k(aloa.n.I());
                            aloh aloh2;
                            if ((aloh2 = aloa.c) == null) {
                                aloh2 = aloh.a;
                            }
                            d.x(aloh2);
                        }
                        gft.a(alog.c, aloa);
                        teu.l(b2.i(d), (Executor)this.e, (tes)new gfr(this, gft3, n, aloa, 3, (byte[])null, (byte[])null), (tet)new fct(this, aloa, b, gft2, 5, (byte[])null, (byte[])null), a);
                        return;
                    }
                    final vrm a3 = b2.a();
                    if (((aezp)o).h()) {
                        a3.w((aiqj)((aezp)o).c());
                    }
                    else {
                        a3.k(aloa.n.I());
                        aloh aloh3;
                        if ((aloh3 = aloa.c) == null) {
                            aloh3 = aloh.a;
                        }
                        a3.x(aloh3);
                    }
                    gft.a(alog.b, aloa);
                    teu.l(b2.e(a3), (Executor)this.e, (tes)new gfr(this, gft3, n, aloa, 2, (byte[])null, (byte[])null), (tet)new fct(this, aloa, b, gft2, 4, (byte[])null, (byte[])null), a);
                    return;
                }
            }
            final Object o = aeyo.a;
            continue;
        }
    }
    
    public final void d(final aloa aloa, final alog alog, final boolean b, final List list, final gft gft) {
        if (list != null && !list.isEmpty()) {
            ((vcy)this.b).b(list);
        }
        if ((aloa.b & 0x1) != 0x0) {
            aloh aloh;
            if ((aloh = aloa.c) == null) {
                aloh = aloh.a;
            }
            if (!aloh.d.isEmpty()) {
                final Object d = this.d;
                aloh aloh2;
                if ((aloh2 = aloa.c) == null) {
                    aloh2 = aloh.a;
                }
                ((tgd)d).f((Object)new gfu(aloh2.d, alog));
                return;
            }
        }
        final Object d2 = this.d;
        aloh aloh3;
        if ((aloh3 = aloa.c) == null) {
            aloh3 = aloh.a;
        }
        ((tgd)d2).d((Object)new gfv(aloh3.c, alog, b));
        gft.a(alog, aloa);
    }
}
