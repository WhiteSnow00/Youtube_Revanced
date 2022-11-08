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

public final class jau implements ets
{
    private final blt A;
    public final wwv a;
    public jas b;
    public boolean c;
    public boolean d;
    public int e;
    public ajtn f;
    public alff g;
    public ajts h;
    private final Set i;
    private final int j;
    private final int k;
    private final int l;
    private final Context m;
    private final Rect n;
    private final abft o;
    private View p;
    private View q;
    private View r;
    private TextView s;
    private RecyclerView t;
    private jar u;
    private jal v;
    private tmt w;
    private final arud x;
    private abbu y;
    private final lll z;
    
    public jau(final Context m, final wwv a, final blt a2, final lll z, final abft o, final arud x, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        this.A = a2;
        this.z = z;
        this.m = m;
        this.n = new Rect();
        this.i = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.j = m.getResources().getDimensionPixelSize(2131166507);
        this.k = m.getResources().getDimensionPixelSize(2131167940);
        this.l = m.getResources().getDimensionPixelSize(2131167941);
        this.x = x;
        (this.o = o).addOnLayoutChangeListener((View$OnLayoutChangeListener)new jbw(this, 1));
    }
    
    private final void j() {
        this.o.d.getClass();
        final View inflate = LayoutInflater.from(this.m).inflate(2131624470, (ViewGroup)null);
        this.p = inflate;
        this.s = (TextView)inflate.findViewById(2131428899);
        this.q = this.p.findViewById(2131428893);
        this.r = this.p.findViewById(2131428894);
        this.t = (RecyclerView)this.p.findViewById(2131429864);
        this.y = new abbu(new RecyclerView[] { this.t, this.o.d });
        final lll z = this.z;
        final RecyclerView t = this.t;
        ((atjj)z.a).a().getClass();
        final jit jit = (jit)((atjj)z.d).a();
        jit.getClass();
        final gyg gyg = (gyg)((atjj)z.b).a();
        gyg.getClass();
        final jap jap = (jap)((atjj)z.c).a();
        jap.getClass();
        final aeby aeby = (aeby)((atjj)z.h).a();
        aeby.getClass();
        final Object e = z.e;
        final arhr b = ((arjh)z.f).b();
        b.getClass();
        final arud arud = (arud)((atjj)z.g).a();
        arud.getClass();
        t.getClass();
        this.u = new jar(jit, gyg, jap, aeby, (atjj)e, b, arud, t, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final blt a = this.A;
        final ViewGroup viewGroup = (ViewGroup)this.p.findViewById(2131427444);
        final View viewById = this.p.findViewById(2131427446);
        final wwv wwv = (wwv)((atjj)a.a).a();
        wwv.getClass();
        final e e2 = (e)((atjj)a.e).a();
        e2.getClass();
        final lht lht = (lht)((atjj)a.c).a();
        lht.getClass();
        final kpw kpw = (kpw)((atjj)a.d).a();
        kpw.getClass();
        final kpo kpo = (kpo)((atjj)a.b).a();
        kpo.getClass();
        viewGroup.getClass();
        viewById.getClass();
        this.v = new jal(wwv, e2, lht, kpw, kpo, viewGroup, viewById, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.p.findViewById(2131428892).setOnClickListener((View$OnClickListener)new izp(this, 13));
        final tmt w = new tmt(this.p);
        this.w = w;
        w.c = 300L;
        w.d = 300L;
        w.g((tpf)new iut(this, 5));
        this.w.a(false);
        if (this.h != null) {
            this.l();
        }
        this.k();
        this.d = true;
    }
    
    private final void k() {
        this.q.setPadding(this.n.left, this.n.top, this.n.right, this.n.bottom);
        final jar u = this.u;
        final Rect n = this.n;
        if (!u.c.equals((Object)n)) {
            u.c.set(n);
            u.a.setPadding(u.d + n.left, 0, u.e + n.right, 0);
            u.a.aa(0);
        }
        tmy.aF(this.r, tmy.aB(this.n.top), (Class)ViewGroup$MarginLayoutParams.class);
        this.f();
    }
    
    private final void l() {
        final ajts h = this.h;
        boolean b = true;
        if (h != null) {
            this.a.D((wxz)new wws(wya.c(51992)));
            final TextView s = this.s;
            final ajts h2 = this.h;
            ajsq ajsq;
            if (h2 != null && (h2.b & 0x1) != 0x0) {
                if ((ajsq = h2.c) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            s.setText((CharSequence)abyh.b(ajsq));
        }
        this.e();
        final jal v = this.v;
        final ajts h3 = this.h;
        v.c.removeAllViews();
        final kpv g = v.g;
        if (g != null) {
            ((kpi)g).b();
        }
        final kpv h4 = v.h;
        if (h4 != null) {
            ((kpi)h4).b();
        }
        final kpn i = v.i;
        if (i != null) {
            ((kpi)i).b();
        }
        final ajto b2 = jal.b(h3);
        if (b2 != null) {
            if (b2.b.size() != 0) {
                for (final anss anss : b2.b) {
                    if (!((agzd)anss).rs((agyr)SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer)) {
                        if (((agzd)anss).rs((agyr)SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer)) {
                            final aogc aogc = (aogc)((agzd)anss).rr((agyr)SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer);
                            if (aogc.c) {
                                if (v.g == null) {
                                    v.g = v.a();
                                }
                                ((kqe)v.g).k(aogc);
                                v.c.addView(((kpi)v.g).c);
                                continue;
                            }
                            if (aogc.d) {
                                if (v.h == null) {
                                    v.h = v.a();
                                }
                                ((kqe)v.h).k(aogc);
                                v.c.addView(((kpi)v.h).c);
                                continue;
                            }
                        }
                        if (!((agzd)anss).rs((agyr)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer)) {
                            if (!((agzd)anss).rs((agyr)SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer)) {
                                continue;
                            }
                            final aofy aofy = (aofy)((agzd)anss).rr((agyr)SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer);
                            if (v.i == null) {
                                final kpo e = v.e;
                                final ViewGroup c = v.c;
                                final kqd a = jal.a;
                                final vax vax = (vax)e.a.a();
                                vax.getClass();
                                final acng acng = (acng)e.b.a();
                                acng.getClass();
                                final Context context = (Context)e.c.a();
                                context.getClass();
                                final tdz tdz = (tdz)e.d.a();
                                tdz.getClass();
                                final vbq vbq = (vbq)e.e.a();
                                vbq.getClass();
                                final uyf uyf = (uyf)e.f.a();
                                uyf.getClass();
                                final asho asho = (asho)e.g.a();
                                asho.getClass();
                                final thh thh = (thh)e.h.a();
                                thh.getClass();
                                final SharedPreferences sharedPreferences = (SharedPreferences)e.i.a();
                                sharedPreferences.getClass();
                                v.i = new kpn(vax, acng, context, tdz, vbq, uyf, asho, thh, sharedPreferences, c, 2131624467, a);
                            }
                            v.i.n(aofy);
                            v.c.addView(((kpi)v.i).c);
                        }
                        else {
                            final ajtp ajtp = (ajtp)((agzd)anss).rr((agyr)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer);
                            if (v.f == null) {
                                final lht j = v.j;
                                final ViewGroup c2 = v.c;
                                final Context context2 = (Context)((atjj)j.b).a();
                                context2.getClass();
                                final wwv wwv = (wwv)((atjj)j.c).a();
                                wwv.getClass();
                                final vax vax2 = (vax)((atjj)j.f).a();
                                vax2.getClass();
                                final acng acng2 = (acng)((atjj)j.d).a();
                                acng2.getClass();
                                final acts acts = (acts)((atjj)j.e).a();
                                acts.getClass();
                                final auip auip = (auip)((atjj)j.a).a();
                                auip.getClass();
                                v.f = new jan(context2, wwv, vax2, acng2, acts, auip, c2, (byte[])null, (byte[])null, (byte[])null);
                            }
                            final jan f = v.f;
                            if ((ajtp.b & 0x1) != 0x0) {
                                anss anss2;
                                if ((anss2 = ajtp.c) == null) {
                                    anss2 = anss.a;
                                }
                                final aibb aibb = (aibb)aaiy.w(anss2, (agyr)ButtonRendererOuterClass.buttonRenderer);
                                if (aibb != null) {
                                    final HashMap hashMap = new HashMap();
                                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", f);
                                    f.f.a(aibb, f.g, (Map)hashMap);
                                    f.c.setOnLongClickListener((View$OnLongClickListener)new jam(f, ajtp, (Map)hashMap));
                                    int a3;
                                    if ((aibb.b & 0x20) != 0x0) {
                                        final acng a2 = f.a;
                                        akbf akbf;
                                        if ((akbf = aibb.g) == null) {
                                            akbf = akbf.a;
                                        }
                                        akbe akbe;
                                        if ((akbe = akbe.b(akbf.c)) == null) {
                                            akbe = akbe.a;
                                        }
                                        a3 = a2.a(akbe);
                                    }
                                    else {
                                        a3 = 0;
                                    }
                                    Drawable a4;
                                    if (a3 == 0) {
                                        a4 = null;
                                    }
                                    else {
                                        a4 = agw.a(f.b, a3);
                                    }
                                    if (a4 == null) {
                                        f.d.setImageResource(0);
                                    }
                                    else {
                                        final Drawable mutate = a4.mutate();
                                        aip.f(mutate, f.j);
                                        f.d.setImageDrawable(mutate);
                                    }
                                    final TextView e2 = f.e;
                                    ajsq ajsq2;
                                    if ((aibb.b & 0x200) != 0x0) {
                                        if ((ajsq2 = aibb.i) == null) {
                                            ajsq2 = ajsq.a;
                                        }
                                    }
                                    else {
                                        ajsq2 = null;
                                    }
                                    e2.setText((CharSequence)abyh.b(ajsq2));
                                    ajzn ajzn;
                                    if ((ajzn = aibb.m) == null) {
                                        ajzn = ajzn.a;
                                    }
                                    if (ajzn.b == 102716411) {
                                        final acts k = f.i;
                                        ajzn ajzn2;
                                        if ((ajzn2 = aibb.m) == null) {
                                            ajzn2 = ajzn.a;
                                        }
                                        ajzl a5;
                                        if (ajzn2.b == 102716411) {
                                            a5 = (ajzl)ajzn2.c;
                                        }
                                        else {
                                            a5 = ajzl.a;
                                        }
                                        k.b(a5, f.c, (Object)aibb, f.g);
                                    }
                                }
                            }
                            v.c.addView(v.f.c);
                        }
                    }
                    else {
                        final aofz aofz = (aofz)((agzd)anss).rr((agyr)SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer);
                        final e l = v.k;
                        final ViewGroup c3 = v.c;
                        final acng acng3 = (acng)((atjj)l.c).a();
                        acng3.getClass();
                        final acts acts2 = (acts)((atjj)l.a).a();
                        acts2.getClass();
                        final Context context3 = (Context)((atjj)l.b).a();
                        context3.getClass();
                        final auip auip2 = (auip)((atjj)l.d).a();
                        auip2.getClass();
                        final kph kph = new kph(acng3, acts2, context3, auip2, c3, 2131624467, 2130970881, (byte[])null, (byte[])null, (byte[])null);
                        kph.c(aofz, v.b, (acij)null);
                        v.c.addView(kph.a);
                    }
                }
            }
        }
        if (v.c.getChildCount() <= 0) {
            b = false;
        }
        tmy.v((View)v.c, b);
        tmy.v(v.d, b);
    }
    
    public final View a() {
        if (!this.d) {
            this.j();
        }
        return this.p;
    }
    
    public final void b(final jat jat) {
        this.i.add(jat);
    }
    
    public final void c(final int n, final boolean b) {
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((jat)iterator.next()).pf(n, b);
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
        alvs alvs;
        if ((alvs = this.x.f().e) == null) {
            alvs = alvs.a;
        }
        final boolean aa = alvs.aa;
        boolean b = true;
        if (aa) {
            final abbu y = this.y;
            if (!y.a) {
                if (y.c == null) {
                    y.c = new fyh((RecyclerView[])y.b);
                }
                final Object b2 = y.b;
                for (int i = 0; i < 2; ++i) {
                    ((RecyclerView[])b2)[i].aE((iw)y.c);
                }
                y.a = true;
            }
        }
        else {
            final abbu y2 = this.y;
            if (y2.a) {
                final Object b3 = y2.b;
                for (int j = 0; j < 2; ++j) {
                    ((RecyclerView[])b3)[j].aH((iw)y2.c);
                }
                y2.a = false;
            }
        }
        final jar u = this.u;
        final ajts h = this.h;
        final ajtn f = this.f;
        final alff g = this.g;
        final ViewGroup viewGroup = (ViewGroup)((View)u.a).findViewById(2131429098);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        u.a.aa(0);
        u.g = null;
        ((tdv)u.b).clear();
        if (h != null && h.e.size() != 0) {
            for (final anss anss : h.e) {
                if (((agzd)anss).rs((agyr)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer)) {
                    u.b.add(((agzd)anss).rr((agyr)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer));
                }
                else if (((agzd)anss).rs((agyr)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementAdSlotRenderer) && f != null) {
                    u.b.add((Object)f);
                    u.g = g;
                }
                else {
                    if (!((agzd)anss).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
                        continue;
                    }
                    final ajkj ajkj = (ajkj)((agzd)anss).rr((agyr)ElementRendererOuterClass.elementRenderer);
                    alvs alvs2;
                    if ((alvs2 = u.h.f().e) == null) {
                        alvs2 = alvs.a;
                    }
                    if (alvs2.al) {
                        u.b.add((Object)((acae)u.f.a()).d(ajkj));
                    }
                    else {
                        u.b.add((Object)ajkj);
                    }
                }
            }
        }
        final RecyclerView a = u.a;
        if (((tdv)u.b).size() <= 0) {
            b = false;
        }
        tmy.v((View)a, b);
        u.b.l();
    }
    
    public final void f() {
        tmy.aF((View)this.t, tmy.aB(Math.min(this.l, Math.max(0, (this.e - (this.n.top + this.j + this.k)) / 2)) + this.j + this.n.top), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    public final void g(final ajts h) {
        if (!aeda.v((Object)this.h, (Object)h)) {
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
