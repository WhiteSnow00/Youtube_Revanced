import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout;
import android.view.OrientationEventListener;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatRecyclerView;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iab extends abbk implements View$OnClickListener, fqk
{
    private iaa A;
    private boolean B;
    private final abrj C;
    private final xib D;
    private final aeea E;
    public final atke a;
    public final Context b;
    public final acdp c;
    public final oug d;
    public final atke e;
    public final boolean f;
    public boolean g;
    public LiveChatRecyclerView h;
    public ViewGroup i;
    public acqs j;
    public OrientationEventListener k;
    public final omw l;
    public final vai m;
    public aeju n;
    private final atke o;
    private final acps p;
    private final vzf q;
    private final wfi r;
    private final ashy s;
    private final int t;
    private final int u;
    private final int v;
    private wfh w;
    private RelativeLayout x;
    private ViewGroup y;
    private ViewGroup z;
    
    public iab(final Context b, final atke a, final acps p21, final atke o, final aeea e, final vzf q, final wfi r, final abrj c, final xib d, final ashy s, final omw l, final acdp c2, final vai m, final oug d2, final atke e2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(b);
        this.b = b;
        this.a = a;
        this.o = o;
        this.p = p21;
        this.E = e;
        this.q = q;
        this.r = r;
        this.C = c;
        this.s = s;
        this.D = d;
        this.l = l;
        this.c = c2;
        this.m = m;
        this.d = d2;
        this.e = e2;
        this.n = hzz.a();
        this.f = ((alqc)d.b).d;
        this.t = b.getResources().getDimensionPixelSize(2131167376);
        this.v = b.getResources().getDimensionPixelSize(2131167389);
        this.u = b.getResources().getDimensionPixelSize(2131167386);
    }
    
    private final void m(final View view, final int n) {
        tpe.aF(view, tpe.aD(Math.min(n, (int)tpe.bh(this.b).first)), (Class)ViewGroup$LayoutParams.class);
    }
    
    private final void n() {
        this.B = true;
        this.mm();
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final /* bridge */ View c(final Context context) {
        final ViewGroup i = (ViewGroup)View.inflate(context, 2131624732, (ViewGroup)null);
        this.i = i;
        this.h = (LiveChatRecyclerView)i.findViewById(2131428485);
        this.x = (RelativeLayout)this.i.findViewById(2131429611);
        this.z = (ViewGroup)this.i.findViewById(2131429597);
        this.y = (ViewGroup)this.i.findViewById(2131429595);
        if (this.w == null) {
            this.w = this.r.a((View)this.i, true, ((vzo)this.a.a()).m());
        }
        this.h.setOnClickListener((View$OnClickListener)this);
        ((RecyclerView)this.h).af((nw)new WrappedLinearLayoutManager());
        this.A = new iaa(this, this.p, this.E, ((vzo)this.a.a()).m(), this.D, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        (this.k = (OrientationEventListener)new hzy(this, context)).enable();
        return (View)this.i;
    }
    
    public final void e(final Context context, final View view) {
        final ViewGroup viewGroup = (ViewGroup)view;
        if (this.B) {
            final hzz j = this.n.j();
            if (j.b && j.c != null) {
                final vzo a = (vzo)this.a.a();
                ((vzo)(((vzd)this.o.a()).a = (vzx)a)).o((wan)this.A);
                a.v(j.c);
                final wfh w = this.w;
                if (w != null) {
                    this.q.b((wah)w);
                }
                final abrj c = this.C;
                if (c != null) {
                    final vzg i = a.j;
                    final wet w2 = c.W((View)viewGroup, ((vzo)this.a.a()).m());
                    w2.j = true;
                    ((vzz)a.j).b((waa)w2);
                }
            }
            if (this.f) {
                this.h();
            }
            this.f();
            this.B = false;
        }
    }
    
    public final void f() {
        this.m((View)this.y, this.t);
        this.m((View)this.z, this.u);
        this.m((View)this.h, this.v);
    }
    
    public final void g(final boolean b) {
        this.n.k(b);
        if (b) {
            this.n();
        }
        else {
            this.mk();
        }
        this.Y();
    }
    
    public final void h() {
        final RelativeLayout x = this.x;
        if (x != null) {
            float alpha;
            if (!this.g) {
                alpha = 1.0f;
            }
            else {
                alpha = 0.3f;
            }
            x.setAlpha(alpha);
        }
    }
    
    public final void j(final boolean b) {
        this.n.k(b);
    }
    
    public final void k(final fkr fkr) {
        this.n.l(fkr);
        if (this.ow(fkr) && this.n.j().b) {
            this.n();
        }
        else {
            this.mk();
        }
        this.Y();
    }
    
    public final boolean l() {
        return this.n.j().b;
    }
    
    public final String mr() {
        return "player_overlay_live_chat_fullscreen";
    }
    
    public final boolean oV() {
        if (this.D.V()) {
            return false;
        }
        final hzz j = this.n.j();
        return j.b && j.c != null && this.ow(j.a);
    }
    
    public final void onClick(final View view) {
        this.s.tu(fqc.a);
    }
    
    public final boolean ow(final fkr fkr) {
        return ezt.d(fkr) && fkr.c() && !fkr.h() && !fkr.f();
    }
}
