import android.view.View$OnClickListener;
import app.revanced.integrations.patches.HideHomeAdsPatch;
import android.view.ViewStub;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kju
{
    private View A;
    private TextView B;
    private View C;
    private View D;
    private View E;
    private View F;
    private final View G;
    public kmn a;
    public kjq b;
    public kjr c;
    public kku d;
    public fvr e;
    public String f;
    public wyw g;
    public aicz h;
    public final boolean i;
    public boolean j;
    public final boolean k;
    final kjv l;
    public kme m;
    private kjm n;
    private View o;
    private View p;
    private final View q;
    private final View r;
    private View s;
    private final View t;
    private final View u;
    private final View v;
    private View w;
    private View x;
    private TextView y;
    private TextView z;
    
    public kju(final kjv l, final int n, final boolean i, final boolean k) {
        this.l = l;
        this.i = i;
        this.k = k;
        if (i) {
            final View inflate = LayoutInflater.from(l.c).inflate(n, l.l, false);
            this.o = inflate;
            final ViewStub viewStub = (ViewStub)inflate.findViewById(2131430700);
            final View inflate2 = ((ViewStub)this.o.findViewById(2131430698)).inflate();
            this.q = inflate2;
            this.p = viewStub.inflate();
            final View viewById = inflate2.findViewById(2131427536);
            this.r = viewById;
            final View viewById2 = viewById.findViewById(2131428429);
            this.t = viewById2;
            this.u = viewById.findViewById(2131428216);
            this.v = viewById2.findViewById(2131428426);
            this.G = (View)l.m;
            this.b();
            this.e();
            this.b = new kjq(l.e, l.g, l.h, this.o, this.p, viewById2, l.c, l.f, l.n, l.o, l.q, l.d, l.v, l.x, l.s, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            this.d();
            this.c();
            return;
        }
        final View inflate3 = LayoutInflater.from(l.c).inflate(n, l.l, false);
        this.q = inflate3;
        final View viewById3 = inflate3.findViewById(2131427536);
        this.r = viewById3;
        final View viewById4 = viewById3.findViewById(2131428429);
        this.t = viewById4;
        this.u = viewById3.findViewById(2131428216);
        this.v = viewById4.findViewById(2131428426);
        this.w = viewById4.findViewById(2131432048);
        this.G = (View)l.m;
        this.b();
        this.e();
        this.c = new kjr(l.e, l.g, l.h, inflate3, viewById4, l.v, l.x, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d();
        this.a.B(this.w, anpe.d);
        this.c();
    }
    
    private final void b() {
        this.x = this.t.findViewById(2131428150);
        this.y = (TextView)this.t.findViewById(2131432095);
        this.z = (TextView)this.t.findViewById(2131428624);
        final View t = this.t;
        HideHomeAdsPatch.HideHomeAds(t);
        this.A = t.findViewById(2131427495);
        this.B = (TextView)this.t.findViewById(2131427568);
        final View viewById = this.t.findViewById(2131428558);
        this.E = viewById;
        this.F = viewById.findViewById(2131428557);
        this.s = this.t.findViewById(2131428234);
        this.C = this.t.findViewById(2131428448);
        this.D = this.t.findViewById(2131431703);
        final View viewById2 = this.t.findViewById(2131428697);
        final fvr p = this.l.u.p(viewById2);
        this.e = p;
        p.e = (fvq)new kjt(this);
        viewById2.setOnClickListener((View$OnClickListener)null);
        viewById2.setClickable(false);
    }
    
    private final void c() {
        this.a.B((View)this.y, anpe.b);
        this.a.B((View)this.z, anpe.e);
        this.a.B(this.A, anpe.c);
        this.a.B((View)this.B, anpe.j);
        this.a.B(this.v, anpe.g);
        this.a.B(this.F, anpe.f);
        this.a.B(this.x, anpe.u);
    }
    
    private final void d() {
        this.n = new kjm((kki)this.a, (ViewStub)this.q.findViewById(2131430003), (kjl)new kjz(this, 1));
        this.d = new kku(this.a, this.n, this.r);
    }
    
    private final void e() {
        this.m = new kme(1);
        final kjv l = this.l;
        this.a = new kmn(l.c, l.f, l.t, l.i, l.j, l.w, l.k, this.q, this.t, this.u, this.G, this.s, this.C, this.D, this.e, (View$OnClickListener)new kgx(this, 17), (kmj)new kjx(this, 1), (kmm)new kjy(this, 1), (kmk)this.m, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final View a() {
        if (this.i) {
            return this.o;
        }
        return this.q;
    }
}
