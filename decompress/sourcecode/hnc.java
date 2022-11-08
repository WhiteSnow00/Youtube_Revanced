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

public final class hnc
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
    
    public hnc(final Activity i, final zki h, final zkw f, final vup a, final tny c, final tdz d, final thh j, final toi g, final vax b, final Executor e, final byte[] array, final byte[] array2) {
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
    
    public hnc(final atjj a, final atjj b, final atjj c, final atjj d, final atjj e, final atjj f, final atjj g, final atjj h, final atjj i, final atjj j) {
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
    
    public hnc(final atjj b, final atjj f, final atjj i, final atjj c, final atjj a, final atjj g, final atjj d, final atjj h, final atjj e, final atjj j, final byte[] array) {
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
    
    public final hcn a(final View view, final hcm hcm, final boolean b) {
        view.getClass();
        final wwv wwv = (wwv)((atjj)this.b).a();
        wwv.getClass();
        final avt avt = (avt)((atjj)this.f).a();
        avt.getClass();
        final bu bu = (bu)((atjj)this.i).a();
        bu.getClass();
        final Context context = (Context)((atjj)this.c).a();
        final tzg tzg = (tzg)((atjj)this.a).a();
        final aceo aceo = (aceo)((atjj)this.g).a();
        aceo.getClass();
        final cya cya = (cya)((atjj)this.d).a();
        final auip auip = (auip)((atjj)this.h).a();
        auip.getClass();
        final tzz tzz = (tzz)((atjj)this.e).a();
        final vax vax = (vax)((atjj)this.j).a();
        vax.getClass();
        return new hcn(view, hcm, b, wwv, avt, bu, context, tzg, aceo, cya, auip, tzz, vax, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void b(final almd almd, final allx allx, final gfl gfl, final gfl gfl2, final gfl gfl3) {
        allx.getClass();
        if (!((thh)this.j).o()) {
            ((toi)this.g).b();
            return;
        }
        if (((zki)this.h).t()) {
            this.c(almd, allx, false, gfl, gfl2, gfl3);
            return;
        }
        ((zkw)this.f).b((Activity)this.i, (byte[])null, (zku)new gfk(this, almd, allx, gfl, gfl2, gfl3, null, null));
    }
    
    public final void c(final almd almd, final allx allx, final boolean b, final gfl gfl, final gfl gfl2, final gfl gfl3) {
        final Runnable a = afua.a;
        while (true) {
            for (final aioe aioe : Collections.unmodifiableList((List<? extends aioe>)((allx)((agzc)((agzi)allx).toBuilder()).instance).p)) {
                if (((agzd)aioe).rs((agyr)LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)) {
                    almd almd2;
                    if ((almd2 = almd.b(((LikeEndpointOuterClass$LikeEndpoint)((agzd)aioe).rr((agyr)LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)).e)) == null) {
                        almd2 = almd.a;
                    }
                    if (!almd2.equals((Object)almd)) {
                        continue;
                    }
                    final Object o = aexq.k(aioe);
                    final almd l = vwh.l((agzc)((agzi)allx).toBuilder());
                    final vpm b2 = ((vup)this.a).b(((zki)this.h).c());
                    final almd a2 = almd.a;
                    final int ordinal = almd.ordinal();
                    if (ordinal == 0) {
                        final vpl b3 = b2.b();
                        if (((aexq)o).h()) {
                            b3.w((aioe)((aexq)o).c());
                        }
                        else {
                            b3.k(allx.n.I());
                            alme alme;
                            if ((alme = allx.c) == null) {
                                alme = alme.a;
                            }
                            b3.x(alme);
                        }
                        gfl.a(almd.a, allx);
                        tcp.l(b2.g(b3), (Executor)this.e, (tcn)new gfj(this, gfl3, l, allx, 0, null, null), (tco)new fcp(this, allx, b, gfl2, 3, (byte[])null, (byte[])null), a);
                        return;
                    }
                    if (ordinal != 1) {
                        final vpo d = b2.d();
                        if (((aexq)o).h()) {
                            d.w((aioe)((aexq)o).c());
                        }
                        else {
                            d.k(allx.n.I());
                            alme alme2;
                            if ((alme2 = allx.c) == null) {
                                alme2 = alme.a;
                            }
                            d.x(alme2);
                        }
                        gfl.a(almd.c, allx);
                        tcp.l(b2.i(d), (Executor)this.e, (tcn)new gfj(this, gfl3, l, allx, 3, null, null), (tco)new fcp(this, allx, b, gfl2, 5, (byte[])null, (byte[])null), a);
                        return;
                    }
                    final vpk a3 = b2.a();
                    if (((aexq)o).h()) {
                        a3.w((aioe)((aexq)o).c());
                    }
                    else {
                        a3.k(allx.n.I());
                        alme alme3;
                        if ((alme3 = allx.c) == null) {
                            alme3 = alme.a;
                        }
                        a3.x(alme3);
                    }
                    gfl.a(almd.b, allx);
                    tcp.l(b2.e(a3), (Executor)this.e, (tcn)new gfj(this, gfl3, l, allx, 2, null, null), (tco)new fcp(this, allx, b, gfl2, 4, (byte[])null, (byte[])null), a);
                    return;
                }
            }
            final Object o = aewp.a;
            continue;
        }
    }
    
    public final void d(final allx allx, final almd almd, final boolean b, final List list, final gfl gfl) {
        if (list != null && !list.isEmpty()) {
            ((vax)this.b).b(list);
        }
        if ((allx.b & 0x1) != 0x0) {
            alme alme;
            if ((alme = allx.c) == null) {
                alme = alme.a;
            }
            if (!alme.d.isEmpty()) {
                final Object d = this.d;
                alme alme2;
                if ((alme2 = allx.c) == null) {
                    alme2 = alme.a;
                }
                ((tdz)d).f((Object)new gfm(alme2.d, almd));
                return;
            }
        }
        final Object d2 = this.d;
        alme alme3;
        if ((alme3 = allx.c) == null) {
            alme3 = alme.a;
        }
        ((tdz)d2).d((Object)new gfn(alme3.c, almd, b));
        gfl.a(almd, allx);
    }
}
