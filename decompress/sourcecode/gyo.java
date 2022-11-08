import java.util.List;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.view.ViewGroup;
import java.io.IOException;
import android.net.Uri;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import java.util.concurrent.atomic.AtomicReference;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyo implements View$OnClickListener, gzb, tws
{
    public final atix a;
    private final atjj b;
    private final atjj c;
    private final atjj d;
    private final asho e;
    private final wwv f;
    private final gzd g;
    private View h;
    private twt i;
    private asic j;
    private LinearLayoutManager k;
    private boolean l;
    private oj m;
    private final mrm n;
    private final qbo o;
    private final avt p;
    private final auip q;
    
    public gyo(final qbo o, final atjj b, final atjj c, final atjj d, final wwv wwv, final mrm n, final asho e, final auip q, final wwv f, final gzd g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.l = false;
        this.o = o;
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;
        this.e = e;
        this.q = q;
        this.f = f;
        this.g = g;
        this.a = atix.e();
        this.p = new avt(wwv, (byte[])null);
    }
    
    public final ashe a() {
        return (ashe)this.a;
    }
    
    public final void b() {
        this.i.c();
        if (this.l) {
            this.g.e().f();
        }
        this.p.P(wya.b(116646)).a();
        final asic j = this.j;
        if (j != null) {
            asjg.b((AtomicReference)j);
            this.j = null;
        }
    }
    
    public final void c(View viewById) {
        this.l = (boolean)((uyi)this.q.b).l(45374956L).aG();
        this.i = new twt(viewById, (tws)this);
        viewById = viewById.findViewById(2131431480);
        (this.h = viewById).setOnClickListener((View$OnClickListener)this);
    }
    
    public final void d(final wyb wyb) {
        this.p.S(wyb).d();
    }
    
    public final void e(final long n, final int n2) {
        this.f(n, avt.Q(this.f, aioe.a, n2));
    }
    
    public final void f(long h, final aioe b) {
        if (h != Long.MIN_VALUE) {
            this.j = ((ashe)((hyc)this.d.a()).a).al(1L).aa(this.e).p(tmy.ch(this.n.u())).aB((asix)new gym(this, h));
        }
        else {
            final LinearLayoutManager k = this.k;
            if (k != null) {
                ((nw)k).aa(0);
            }
        }
        final hyc hyc = (hyc)this.d.a();
        ((List)hyc.d).clear();
        ((two)hyc.c).l((umw)new hjf(hyc, 1, (byte[])null, (byte[])null));
        final twt i = this.i;
        final ViewGroup a = i.a;
        if (i.c == null) {
            final tws b2 = i.b;
            final LayoutInflater from = LayoutInflater.from(a.getContext());
            final ViewGroup a2 = i.a;
            final gyo gyo = (gyo)b2;
            View view;
            if (gyo.l) {
                view = from.inflate(2131625639, a2, false);
            }
            else {
                view = from.inflate(2131625634, a2, false);
            }
            final View viewById = view.findViewById(2131432075);
            final RecyclerView recyclerView = (RecyclerView)viewById.findViewById(2131432170);
            recyclerView.ae(null);
            viewById.getContext();
            (gyo.k = new LinearLayoutManager(1)).s(true);
            gyo.k.n = true;
            gyo.m = (oj)new gyn(recyclerView.getContext());
            recyclerView.af((nw)gyo.k);
            recyclerView.ac((nq)gyo.b.a());
            recyclerView.setImportantForAccessibility(2);
            new ql((qf)new gzj((hyc)gyo.d.a(), (byte[])null, (byte[])null)).g(recyclerView);
            final qbo o = gyo.o;
            final gzb gzb = (gzb)((atjj)o.f).a();
            gzb.getClass();
            final tvt tvt = (tvt)((atjj)o.d).a();
            tvt.getClass();
            final mrm mrm = (mrm)((atjj)o.e).a();
            ((atjj)o.b).a().getClass();
            ((atjj)o.c).a().getClass();
            ((atjj)o.a).a().getClass();
            ((atjj)o.g).a().getClass();
            viewById.getClass();
            new gzi(gzb, tvt, mrm, viewById, (byte[])null, (byte[])null, (byte[])null);
            if (gyo.l) {
                final ShortsVideoTrimView2 d = (ShortsVideoTrimView2)viewById.findViewById(2131431513);
                d.getClass();
                final View viewById2 = viewById.findViewById(2131432074);
                viewById2.getClass();
                final gzd g = gyo.g;
                g.a();
                g.d = d;
                g.e = viewById2;
                final aexq l = ((tvt)g.a.a()).L();
                if (l.h()) {
                    try {
                        final Uri uri = (Uri)l.c();
                        final qxu qxu = new qxu();
                        qxu.a = lhz.c(d.getContext(), uri);
                        final EditableVideo a3 = qxu.a();
                        h = a3.b.h;
                        if (g.c == null) {
                            g.c = g.g.K().e((qzc)new ubh(0), (aexq)aewp.a);
                        }
                        g.b = (ubd)new ube(a3.b, g.c, true);
                        final qxj qxj = new qxj(h, h);
                        qxj.i(0L, h, false, false);
                        d.L(a3, g.b, qxj, false);
                    }
                    catch (final IOException ex) {
                        zjp.c(zjo.b, zjn.x, "[ShortsCreation][Android][Edit]Failed to initialize timeline filmstrip.", (Throwable)ex);
                        d.t();
                    }
                }
                else {
                    d.t();
                }
                gzd.d(d, viewById2, ((tvt)g.a.a()).J());
                g.e().c();
                g.f = true;
                g.b();
            }
            i.c = viewById;
        }
        if (i.c.getParent() != null) {
            ((ViewGroup)i.c.getParent()).removeView(i.c);
        }
        a.addView(i.c, 0);
        i.d(true);
        ((tvt)this.c.a()).W();
        final tuw p2 = this.p.P(wya.b(116646));
        p2.a = null;
        p2.b = (agzi)b;
        p2.b();
        final tuw s = this.p.S(wya.c(113372));
        s.k(true);
        s.c();
        final tuw s2 = this.p.S(wya.c(116666));
        s2.k(true);
        s2.c();
        final tuw s3 = this.p.S(wya.c(116664));
        s3.k(true);
        s3.c();
        if (this.l) {
            this.g.e().h();
        }
    }
    
    public final void g() {
        if (this.l) {
            this.g.a();
        }
    }
    
    public final void h() {
        if (this.l) {
            this.g.b();
        }
    }
    
    public final void i(final long n) {
        if (n != Long.MIN_VALUE) {
            final oj m = this.m;
            if (m != null && this.k != null) {
                int a = ((aciw)this.b.a()).a();
                while (true) {
                    int b;
                    do {
                        b = a - 1;
                        if (b < 0) {
                            b = 0;
                            m.b = b;
                            ((nw)this.k).bf(this.m);
                            return;
                        }
                        a = b;
                    } while (((nq)this.b.a()).mR(b) != n);
                    continue;
                }
            }
        }
    }
    
    public final boolean j() {
        final twt i = this.i;
        return i == null || i.e();
    }
    
    public final avt k() {
        return this.p;
    }
    
    public final void onClick(final View view) {
        if (view == this.h) {
            this.e(Long.MIN_VALUE, 109823);
        }
    }
}
