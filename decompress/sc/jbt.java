import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import android.view.View$OnLongClickListener;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.content.SharedPreferences;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnLayoutChangeListener;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;
import android.graphics.Rect;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbt implements etv
{
    private final blu A;
    public final wyw a;
    public jbr b;
    public boolean c;
    public boolean d;
    public int e;
    public ajvq f;
    public alhi g;
    public ajvv h;
    private final Set i;
    private final int j;
    private final int k;
    private final int l;
    private final Context m;
    private final Rect n;
    private final abho o;
    private View p;
    private View q;
    private View r;
    private TextView s;
    private RecyclerView t;
    private jbq u;
    private jbk v;
    private toz w;
    private final arwh x;
    private abdo y;
    private final lmo z;
    
    public jbt(final Context m, final wyw a, final blu a2, final lmo z, final abho o, final arwh x, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        this.A = a2;
        this.z = z;
        this.m = m;
        this.n = new Rect();
        this.i = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.j = m.getResources().getDimensionPixelSize(2131166506);
        this.k = m.getResources().getDimensionPixelSize(2131167939);
        this.l = m.getResources().getDimensionPixelSize(2131167940);
        this.x = x;
        (this.o = o).addOnLayoutChangeListener((View$OnLayoutChangeListener)new jcy(this, 1));
    }
    
    private final void j() {
        this.o.d.getClass();
        final View inflate = LayoutInflater.from(this.m).inflate(2131624470, (ViewGroup)null);
        this.p = inflate;
        this.s = (TextView)inflate.findViewById(2131428899);
        this.q = this.p.findViewById(2131428893);
        this.r = this.p.findViewById(2131428894);
        this.t = (RecyclerView)this.p.findViewById(2131429864);
        this.y = new abdo(new RecyclerView[] { this.t, this.o.d });
        final lmo z = this.z;
        final RecyclerView t = this.t;
        ((atke)z.a).a().getClass();
        final jjv jjv = (jjv)((atke)z.e).a();
        jjv.getClass();
        final gyw gyw = (gyw)((atke)z.b).a();
        gyw.getClass();
        final jbo jbo = (jbo)((atke)z.c).a();
        jbo.getClass();
        final aeea aeea = (aeea)((atke)z.h).a();
        aeea.getClass();
        final Object d = z.d;
        final arkg b = ((arlw)z.f).b();
        b.getClass();
        final arwh arwh = (arwh)((atke)z.g).a();
        arwh.getClass();
        t.getClass();
        this.u = new jbq(jjv, gyw, jbo, aeea, (atke)d, b, arwh, t, null, null, null, null, null);
        final blu a = this.A;
        final ViewGroup viewGroup = (ViewGroup)this.p.findViewById(2131427444);
        final View viewById = this.p.findViewById(2131427446);
        final wyw wyw = (wyw)((atke)a.a).a();
        wyw.getClass();
        final e e = (e)((atke)a.e).a();
        e.getClass();
        final lkx lkx = (lkx)((atke)a.c).a();
        lkx.getClass();
        final kqx kqx = (kqx)((atke)a.d).a();
        kqx.getClass();
        final kqp kqp = (kqp)((atke)a.b).a();
        kqp.getClass();
        viewGroup.getClass();
        viewById.getClass();
        this.v = new jbk(wyw, e, lkx, kqx, kqp, viewGroup, viewById, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.p.findViewById(2131428892).setOnClickListener((View$OnClickListener)new jan(this, 13));
        final toz w = new toz(this.p);
        this.w = w;
        w.c = 300L;
        w.d = 300L;
        w.g((trk)new ivs(this, 5));
        this.w.a(false);
        if (this.h != null) {
            this.l();
        }
        this.k();
        this.d = true;
    }
    
    private final void k() {
        this.q.setPadding(this.n.left, this.n.top, this.n.right, this.n.bottom);
        final jbq u = this.u;
        final Rect n = this.n;
        if (!u.c.equals((Object)n)) {
            u.c.set(n);
            u.a.setPadding(u.d + n.left, 0, u.e + n.right, 0);
            u.a.aa(0);
        }
        tpe.aF(this.r, tpe.aB(this.n.top), (Class)ViewGroup$MarginLayoutParams.class);
        this.f();
    }
    
    private final void l() {
        final ajvv h = this.h;
        boolean b = true;
        if (h != null) {
            this.a.D((wzz)new wyt(xaa.c(51992)));
            final TextView s = this.s;
            final ajvv h2 = this.h;
            ajut ajut;
            if (h2 != null && (h2.b & 0x1) != 0x0) {
                if ((ajut = h2.c) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            s.setText((CharSequence)acak.b(ajut));
        }
        this.e();
        final jbk v = this.v;
        final ajvv h3 = this.h;
        v.c.removeAllViews();
        final kqw g = v.g;
        if (g != null) {
            ((kqj)g).b();
        }
        final kqw h4 = v.h;
        if (h4 != null) {
            ((kqj)h4).b();
        }
        final kqo i = v.i;
        if (i != null) {
            ((kqj)i).b();
        }
        final ajvr b2 = jbk.b(h3);
        if (b2 != null) {
            if (b2.b.size() != 0) {
                for (final anuv anuv : b2.b) {
                    if (!((ahbc)anuv).ry((ahaq)SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer)) {
                        if (((ahbc)anuv).ry((ahaq)SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer)) {
                            final aoif aoif = (aoif)((ahbc)anuv).rx((ahaq)SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer);
                            if (aoif.c) {
                                if (v.g == null) {
                                    v.g = v.a();
                                }
                                ((krf)v.g).k(aoif);
                                v.c.addView(((kqj)v.g).c);
                                continue;
                            }
                            if (aoif.d) {
                                if (v.h == null) {
                                    v.h = v.a();
                                }
                                ((krf)v.h).k(aoif);
                                v.c.addView(((kqj)v.h).c);
                                continue;
                            }
                        }
                        if (!((ahbc)anuv).ry((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer)) {
                            if (!((ahbc)anuv).ry((ahaq)SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer)) {
                                continue;
                            }
                            final aoib aoib = (aoib)((ahbc)anuv).rx((ahaq)SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer);
                            if (v.i == null) {
                                final kqp e = v.e;
                                final ViewGroup c = v.c;
                                final kre a = jbk.a;
                                final vcy vcy = (vcy)e.a.a();
                                vcy.getClass();
                                final acpk acpk = (acpk)e.b.a();
                                acpk.getClass();
                                final Context context = (Context)e.c.a();
                                context.getClass();
                                final tgd tgd = (tgd)e.d.a();
                                tgd.getClass();
                                final vdr vdr = (vdr)e.e.a();
                                vdr.getClass();
                                final vaf vaf = (vaf)e.f.a();
                                vaf.getClass();
                                final asid asid = (asid)e.g.a();
                                asid.getClass();
                                final tjm tjm = (tjm)e.h.a();
                                tjm.getClass();
                                final SharedPreferences sharedPreferences = (SharedPreferences)e.i.a();
                                sharedPreferences.getClass();
                                v.i = new kqo(vcy, acpk, context, tgd, vdr, vaf, asid, tjm, sharedPreferences, c, 2131624467, a);
                            }
                            v.i.n(aoib);
                            v.c.addView(((kqj)v.i).c);
                        }
                        else {
                            final ajvs ajvs = (ajvs)((ahbc)anuv).rx((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer);
                            if (v.f == null) {
                                final lkx j = v.j;
                                final ViewGroup c2 = v.c;
                                final Context context2 = (Context)((atke)j.d).a();
                                context2.getClass();
                                final wyw wyw = (wyw)((atke)j.e).a();
                                wyw.getClass();
                                final vcy vcy2 = (vcy)((atke)j.c).a();
                                vcy2.getClass();
                                final acpk acpk2 = (acpk)((atke)j.f).a();
                                acpk2.getClass();
                                final acvw acvw = (acvw)((atke)j.b).a();
                                acvw.getClass();
                                final aujg aujg = (aujg)((atke)j.a).a();
                                aujg.getClass();
                                v.f = new jbm(context2, wyw, vcy2, acpk2, acvw, aujg, c2, (byte[])null, (byte[])null, (byte[])null);
                            }
                            final jbm f = v.f;
                            if ((ajvs.b & 0x1) != 0x0) {
                                anuv anuv2;
                                if ((anuv2 = ajvs.c) == null) {
                                    anuv2 = anuv.a;
                                }
                                final aicz aicz = (aicz)aakt.v(anuv2, (ahaq)ButtonRendererOuterClass.buttonRenderer);
                                if (aicz != null) {
                                    final HashMap hashMap = new HashMap();
                                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", f);
                                    f.f.a(aicz, f.g, (Map)hashMap);
                                    f.c.setOnLongClickListener((View$OnLongClickListener)new jbl(f, ajvs, (Map)hashMap));
                                    int a3;
                                    if ((aicz.b & 0x20) != 0x0) {
                                        final acpk a2 = f.a;
                                        akdi akdi;
                                        if ((akdi = aicz.g) == null) {
                                            akdi = akdi.a;
                                        }
                                        akdh akdh;
                                        if ((akdh = akdh.b(akdi.c)) == null) {
                                            akdh = akdh.a;
                                        }
                                        a3 = a2.a(akdh);
                                    }
                                    else {
                                        a3 = 0;
                                    }
                                    Drawable a4;
                                    if (a3 == 0) {
                                        a4 = null;
                                    }
                                    else {
                                        a4 = agx.a(f.b, a3);
                                    }
                                    if (a4 == null) {
                                        f.d.setImageResource(0);
                                    }
                                    else {
                                        final Drawable mutate = a4.mutate();
                                        aiq.f(mutate, f.j);
                                        f.d.setImageDrawable(mutate);
                                    }
                                    final TextView e2 = f.e;
                                    ajut ajut2;
                                    if ((aicz.b & 0x200) != 0x0) {
                                        if ((ajut2 = aicz.i) == null) {
                                            ajut2 = ajut.a;
                                        }
                                    }
                                    else {
                                        ajut2 = null;
                                    }
                                    e2.setText((CharSequence)acak.b(ajut2));
                                    akbq akbq;
                                    if ((akbq = aicz.m) == null) {
                                        akbq = akbq.a;
                                    }
                                    if (akbq.b == 102716411) {
                                        final acvw k = f.i;
                                        akbq akbq2;
                                        if ((akbq2 = aicz.m) == null) {
                                            akbq2 = akbq.a;
                                        }
                                        akbo a5;
                                        if (akbq2.b == 102716411) {
                                            a5 = (akbo)akbq2.c;
                                        }
                                        else {
                                            a5 = akbo.a;
                                        }
                                        k.b(a5, f.c, (Object)aicz, f.g);
                                    }
                                }
                            }
                            v.c.addView(v.f.c);
                        }
                    }
                    else {
                        final aoic aoic = (aoic)((ahbc)anuv).rx((ahaq)SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer);
                        final e l = v.k;
                        final ViewGroup c3 = v.c;
                        final acpk acpk3 = (acpk)((atke)l.c).a();
                        acpk3.getClass();
                        final acvw acvw2 = (acvw)((atke)l.a).a();
                        acvw2.getClass();
                        final Context context3 = (Context)((atke)l.b).a();
                        context3.getClass();
                        final aujg aujg2 = (aujg)((atke)l.d).a();
                        aujg2.getClass();
                        final kqi kqi = new kqi(acpk3, acvw2, context3, aujg2, c3, 2131624467, 2130970881, (byte[])null, (byte[])null, (byte[])null);
                        kqi.c(aoic, v.b, (ackm)null);
                        v.c.addView(kqi.a);
                    }
                }
            }
        }
        final int childCount = v.c.getChildCount();
        final ViewGroup c4 = v.c;
        if (childCount <= 0) {
            b = false;
        }
        tpe.v((View)c4, b);
        tpe.v(v.d, b);
    }
    
    public final View a() {
        if (!this.d) {
            this.j();
        }
        return this.p;
    }
    
    public final void b(final jbs jbs) {
        this.i.add(jbs);
    }
    
    public final void c(final int n, final boolean b) {
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((jbs)iterator.next()).ph(n, b);
        }
    }
    
    public final void d(final Rect rect) {
        if (this.n.equals((Object)rect)) {
            return;
        }
        this.n.set(rect);
        if (this.d) {
            this.k();
        }
    }
    
    public final void e() {
        if (this.u == null) {
            return;
        }
        alxw alxw;
        if ((alxw = this.x.f().e) == null) {
            alxw = alxw.a;
        }
        final boolean aa = alxw.aa;
        boolean b = true;
        if (aa) {
            final abdo y = this.y;
            if (!y.a) {
                if (y.c == null) {
                    y.c = new fyp((RecyclerView[])y.b);
                }
                final Object b2 = y.b;
                for (int i = 0; i < 2; ++i) {
                    ((RecyclerView[])b2)[i].aE((iw)y.c);
                }
                y.a = true;
            }
        }
        else {
            final abdo y2 = this.y;
            if (y2.a) {
                final Object b3 = y2.b;
                for (int j = 0; j < 2; ++j) {
                    ((RecyclerView[])b3)[j].aH((iw)y2.c);
                }
                y2.a = false;
            }
        }
        final jbq u = this.u;
        final ajvv h = this.h;
        final ajvq f = this.f;
        final alhi g = this.g;
        final ViewGroup viewGroup = (ViewGroup)((View)u.a).findViewById(2131429098);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        u.a.aa(0);
        u.g = null;
        ((tfz)u.b).clear();
        if (h != null && h.e.size() != 0) {
            for (final anuv anuv : h.e) {
                if (((ahbc)anuv).ry((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer)) {
                    u.b.add(((ahbc)anuv).rx((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer));
                }
                else if (((ahbc)anuv).ry((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementAdSlotRenderer) && f != null) {
                    u.b.add((Object)f);
                    u.g = g;
                }
                else {
                    if (!((ahbc)anuv).ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
                        continue;
                    }
                    final ajmo ajmo = (ajmo)((ahbc)anuv).rx((ahaq)ElementRendererOuterClass.elementRenderer);
                    alxw alxw2;
                    if ((alxw2 = u.h.f().e) == null) {
                        alxw2 = alxw.a;
                    }
                    if (alxw2.al) {
                        u.b.add((Object)((accf)u.f.a()).d(ajmo));
                    }
                    else {
                        u.b.add((Object)ajmo);
                    }
                }
            }
        }
        final RecyclerView a = u.a;
        if (((tfz)u.b).size() <= 0) {
            b = false;
        }
        tpe.v((View)a, b);
        u.b.l();
    }
    
    public final void f() {
        tpe.aF((View)this.t, tpe.aB(Math.min(this.l, Math.max(0, (this.e - (this.n.top + this.j + this.k)) / 2)) + this.j + this.n.top), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    public final void g(final ajvv h) {
        if (!adkp.ae(this.h, h)) {
            this.h = h;
            if (this.d) {
                this.l();
            }
        }
    }
    
    public final void h(final boolean b, final boolean c, final boolean b2) {
        if (!this.d) {
            if (!b) {
                return;
            }
            this.j();
        }
        final boolean c2 = this.c;
        this.c = c;
        if (b == this.w.d() && c != c2) {
            this.c(this.w.b, c);
            return;
        }
        if (b) {
            this.w.b(b2);
            return;
        }
        this.w.a(b2);
    }
    
    public final boolean i() {
        return this.d && this.w.b != 0;
    }
}
