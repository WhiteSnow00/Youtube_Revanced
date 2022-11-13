import java.util.List;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.Iterator;
import android.view.View$OnClickListener;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import android.support.v7.widget.LinearLayoutManager;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icb extends icf implements tgg
{
    public final atke a;
    private View v;
    
    public icb(final Context context, final atke atke, final idd idd, final atke atke2, final fzw fzw, final hzn hzn, final acpn acpn, final lhk lhk, final xbv xbv, final abpu abpu, final atke a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(context, atke, idd, lhk, atke2, acpn, fzw, hzn, xbv, abpu, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
    }
    
    private final String d() {
        final xsf r = this.r;
        final int e = r.e;
        final int d = r.d;
        if (e < d && d != 0) {
            return this.b.getString(2132018581, new Object[] { String.valueOf(e + 1), String.valueOf(this.r.d) });
        }
        return this.b.getString(2132018580);
    }
    
    public final void a(int n, final xsf r) {
        this.r = r;
        if (!this.m) {
            return;
        }
        if (n == 5) {
            if (super.m) {
                final xlj a = xlj.a;
                final abkb a2 = abkb.a;
                n = super.r.h.ordinal();
                if (n != 0) {
                    if (n == 4) {
                        final Optional ofNullable = Optional.ofNullable((Object)super.r.g);
                        if (super.m) {
                            if (!ofNullable.isEmpty()) {
                                final anjb g = ((WatchNextResponseModel)ofNullable.get()).g;
                                if (g == null) {
                                    super.e.b();
                                }
                                else {
                                    super.o.setVisibility(8);
                                    if (super.h) {
                                        super.j.setVisibility(0);
                                    }
                                    super.n.setVisibility(0);
                                    super.l.setVisibility(0);
                                    final lhk e = super.e;
                                    e.a();
                                    final acle e2 = e.e;
                                    if (e2 != null) {
                                        final ArrayList list = new ArrayList();
                                        final Iterator<Object> iterator = ((List<Object>)g.i).iterator();
                                        n = 0;
                                        while (iterator.hasNext()) {
                                            final anja anja = iterator.next();
                                            final int b = anja.b;
                                            if ((b & 0x1) != 0x0) {
                                                anjf anjf;
                                                if ((anjf = anja.c) == null) {
                                                    anjf = anjf.a;
                                                }
                                                list.add(anjf);
                                                final anjf c = anja.c;
                                                anjf a3;
                                                if (c == null) {
                                                    a3 = anjf.a;
                                                }
                                                else {
                                                    a3 = c;
                                                }
                                                final String p2 = a3.p;
                                                anjf a4 = c;
                                                if (c == null) {
                                                    a4 = anjf.a;
                                                }
                                                final String t = a4.t;
                                                e.b.put(p2, n);
                                                anjf anjf2;
                                                if ((anjf2 = anja.c) == null) {
                                                    anjf2 = anjf.a;
                                                }
                                                if (anjf2.m) {
                                                    final lhj d = e.d;
                                                    d.b = p2;
                                                    d.c = t;
                                                    final Iterator iterator2 = d.a.iterator();
                                                    while (iterator2.hasNext()) {
                                                        ((git)iterator2.next()).a();
                                                    }
                                                }
                                            }
                                            else if ((b & 0x80) != 0x0) {
                                                anjc anjc;
                                                if ((anjc = anja.e) == null) {
                                                    anjc = anjc.a;
                                                }
                                                list.add(new jgd(anjc));
                                            }
                                            ++n;
                                        }
                                        e2.p((Collection)list);
                                        final acle e3 = e.e;
                                        final ArrayList list2 = new ArrayList();
                                        for (final anja anja2 : g.i) {
                                            if ((anja2.b & 0x20) != 0x0) {
                                                aniy aniy;
                                                if ((aniy = anja2.d) == null) {
                                                    aniy = aniy.a;
                                                }
                                                list2.add(aniy);
                                            }
                                        }
                                        ((tfz)e3).addAll((Collection)list2);
                                        final acle e4 = e.e;
                                        if (e4 != null) {
                                            e.a();
                                            e.c.b((acjn)e4);
                                            ((nq)e.a).rZ();
                                            final LoadingFrameLayout h = e.h;
                                            if (h != null) {
                                                h.a();
                                            }
                                        }
                                    }
                                    final lhl f = e.f;
                                    if (f != null) {
                                        f.e(vyg.b(g));
                                    }
                                    if (e.j) {
                                        e.j = false;
                                        final Integer n2 = e.b.get(e.d.b);
                                        if (n2 != null) {
                                            n = n2;
                                            final RecyclerView g2 = e.g;
                                            if (g2 != null) {
                                                n = Math.max(e.c.a(n) - 1, 0);
                                                final nw n3 = g2.n;
                                                if (n3 instanceof LinearLayoutManager) {
                                                    ((LinearLayoutManager)n3).ab(n, 0);
                                                }
                                            }
                                        }
                                    }
                                    final idf p3 = super.p;
                                    final anjb g3 = ((WatchNextResponseModel)ofNullable.get()).g;
                                    p3.f = (g3 != null && xrx.a(g3.m));
                                    p3.a();
                                    n = g.c;
                                    final amgs amgs = null;
                                    CharSequence string = null;
                                    Label_0849: {
                                        if ((n & 0x100) == 0x0) {
                                            if ((n & 0x10) == 0x0) {
                                                string = null;
                                                break Label_0849;
                                            }
                                        }
                                        string = this.b.getString(2132018584, new Object[] { String.valueOf(g.j + 1), String.valueOf(g.n) });
                                    }
                                    this.k.setText(string);
                                    final acpn g4 = super.g;
                                    final ImageView l = super.l;
                                    amgv amgv;
                                    if ((amgv = g.x) == null) {
                                        amgv = amgv.a;
                                    }
                                    amgs amgs2 = amgs;
                                    if ((amgv.b & 0x1) != 0x0) {
                                        amgv amgv2;
                                        if ((amgv2 = g.x) == null) {
                                            amgv2 = amgv.a;
                                        }
                                        if ((amgs2 = amgv2.c) == null) {
                                            amgs2 = amgs.a;
                                        }
                                    }
                                    g4.d((View)l, amgs2, g, wyw.k);
                                }
                            }
                        }
                        if (!ofNullable.isEmpty()) {
                            this.g.g((View)this.l);
                            final View v = this.v;
                            if (v != null) {
                                v.setContentDescription((CharSequence)this.d());
                            }
                            final anjb g5 = ((WatchNextResponseModel)ofNullable.get()).g;
                            Optional optional = null;
                            Label_1296: {
                                if (g5 != null && (g5.c & 0x800000) != 0x0) {
                                    amgv amgv3;
                                    if ((amgv3 = g5.x) == null) {
                                        amgv3 = amgv.a;
                                    }
                                    if ((amgv3.b & 0x1) != 0x0) {
                                        amgv amgv4;
                                        if ((amgv4 = g5.x) == null) {
                                            amgv4 = amgv.a;
                                        }
                                        amgs amgs3;
                                        if ((amgs3 = amgv4.c) == null) {
                                            amgs3 = amgs.a;
                                        }
                                        for (final amgp amgp : amgs3.c) {
                                            amgq amgq;
                                            if ((amgq = amgp.c) == null) {
                                                amgq = amgq.a;
                                            }
                                            if ((amgq.b & 0x4) != 0x0) {
                                                amgq amgq2;
                                                if ((amgq2 = amgp.c) == null) {
                                                    amgq2 = amgq.a;
                                                }
                                                aiqj aiqj;
                                                if ((aiqj = amgq2.e) == null) {
                                                    aiqj = aiqj.a;
                                                }
                                                if (!((ahbc)aiqj).ry((ahaq)CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint)) {
                                                    amgq amgq3;
                                                    if ((amgq3 = amgp.c) == null) {
                                                        amgq3 = amgq.a;
                                                    }
                                                    aiqj aiqj2;
                                                    if ((aiqj2 = amgq3.e) == null) {
                                                        aiqj2 = aiqj.a;
                                                    }
                                                    if (!((ahbc)aiqj2).ry((ahaq)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)) {
                                                        continue;
                                                    }
                                                }
                                                amgq amgq4;
                                                if ((amgq4 = amgp.c) == null) {
                                                    amgq4 = amgq.a;
                                                }
                                                aiqj aiqj3;
                                                if ((aiqj3 = amgq4.e) == null) {
                                                    aiqj3 = aiqj.a;
                                                }
                                                optional = Optional.of((Object)aiqj3);
                                                break Label_1296;
                                            }
                                        }
                                        optional = Optional.empty();
                                        break Label_1296;
                                    }
                                }
                                optional = Optional.empty();
                            }
                            final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                            ahbb.e((ahaq)CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint, (Object)CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a);
                            this.l.setOnClickListener((View$OnClickListener)new hqd(this, (aiqj)optional.orElse((Object)((ahaz)ahbb).build()), 15));
                        }
                    }
                }
                else {
                    super.o.setVisibility(8);
                    if (super.h) {
                        super.j.setVisibility(0);
                    }
                    super.n.setVisibility(0);
                    super.l.setVisibility(8);
                }
            }
        }
    }
    
    public final void b(final ViewGroup a) {
        if (!this.m) {
            if (!super.m) {
                final xsj xsj = (xsj)super.c.a();
                super.r = xsj.f;
                final ViewGroup j = (ViewGroup)a.findViewById(2131429765);
                j.getClass();
                super.j = j;
                final RecyclerView g = (RecyclerView)a.findViewById(2131429773);
                g.getClass();
                final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.ac(1);
                g.af((nw)linearLayoutManager);
                g.setNestedScrollingEnabled(true);
                final LoadingFrameLayout n = (LoadingFrameLayout)a.findViewById(2131429774);
                n.getClass();
                super.n = n;
                final TextView k = (TextView)a.findViewById(2131429772);
                k.getClass();
                super.k = k;
                final ImageView l = (ImageView)a.findViewById(2131429770);
                l.getClass();
                super.l = l;
                final View viewById = a.findViewById(2131428858);
                viewById.getClass();
                super.o = viewById;
                final lhk e = super.e;
                (e.g = g).ac((nq)e.a);
                g.getContext();
                g.af((nw)new lhh());
                ((nq)e.a).rZ();
                final lhk e2 = super.e;
                final LoadingFrameLayout n2 = super.n;
                n2.getClass();
                e2.h = n2;
                final idd d = super.d;
                final boolean a2 = d.a();
                d.a = (View)a;
                if (d.a() != a2) {
                    ((wzy)d).b();
                }
                xsj.a((xsh)this);
                if (super.f.a() != null) {
                    super.s.f(((abcz)super.f.a()).lX(super.i));
                }
                final fzw u = super.u;
                final lhk e3 = super.e;
                final xnt xnt = (xnt)((atke)u.b).a();
                xnt.getClass();
                e3.getClass();
                final xsj xsj2 = (xsj)((atke)u.a).a();
                xsj2.getClass();
                super.p = new idf(xnt, g, e3, xsj2);
                final idf p = super.p;
                p.e = p.c.g();
                if (((tfz)p.b.b).size() == 0) {
                    p.b.c(p.h);
                }
                p.d.a(p.i);
                p.g = p.d.f;
                p.b();
                if (super.h) {
                    final hzn t = super.t;
                    final ViewGroup i = super.j;
                    final xnt xnt2 = (xnt)((atke)t.a).a();
                    xnt2.getClass();
                    i.getClass();
                    super.q = new icd(xnt2, i);
                    final icd q = super.q;
                    q.a.i((xnr)q);
                    final xnm g2 = q.a.g();
                    if (g2 != null) {
                        q.q(g2);
                    }
                }
                super.m = true;
            }
            (this.v = a.findViewById(2131429762)).setContentDescription((CharSequence)this.d());
            final Drawable a3 = agx.a(this.b, 2131233769);
            if (a3 != null) {
                a3.mutate();
                a3.setColorFilter(tpe.cr(this.b, 2130970924), PorterDuff$Mode.SRC_ATOP);
                this.l.setImageDrawable(a3);
            }
            this.c();
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, int ordinal) {
        Class[] array;
        if (ordinal != -1) {
            if (ordinal != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(ordinal);
                throw new IllegalStateException(sb.toString());
            }
            final xlj xlj = (xlj)o;
            final xlj a = xlj.a;
            final abkb a2 = abkb.a;
            ordinal = xlj.ordinal();
            array = null;
            if (ordinal == 2) {
                this.c();
                return null;
            }
        }
        else {
            array = new Class[] { xlj.class };
        }
        return array;
    }
}
