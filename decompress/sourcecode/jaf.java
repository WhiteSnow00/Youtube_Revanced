import android.view.MotionEvent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View$OnLayoutChangeListener;
import java.util.concurrent.Callable;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.GestureDetector$OnGestureListener;
import java.util.concurrent.TimeUnit;
import android.view.GestureDetector;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jaf extends GestureDetector$SimpleOnGestureListener
{
    public static final wws a;
    public static final wws b;
    public static final wws c;
    public static final wws d;
    public final jai e;
    public final fpg f;
    public final jac g;
    public final jak h;
    public final fjp i;
    public final wwv j;
    public final boolean k;
    public ViewStub l;
    public View m;
    public View n;
    public RecyclerView o;
    public TextView p;
    public GestureDetector q;
    public int r;
    public int s;
    public final arcv t;
    public final mrm u;
    private int v;
    
    static {
        a = new wws(wya.c(153154));
        b = new wws(wya.c(152789));
        c = new wws(wya.c(153156));
        d = new wws(wya.c(153155));
    }
    
    public jaf(final jai e, final fpg f, final jac g, final arcv t, final aja aja, final fjp i, final mrm u, final wwv j, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = aja.m(2);
        this.t = t;
        this.i = i;
        this.u = u;
        this.j = j;
        this.k = uyi.f(45378693L);
    }
    
    public static String a(final long n) {
        return tsx.j(TimeUnit.MILLISECONDS.toSeconds(n + 500L));
    }
    
    public final void b() {
        final ViewStub l = this.l;
        if (l != null) {
            final View inflate = l.inflate();
            this.m = inflate;
            this.n = inflate.findViewById(2131432064);
            this.o = (RecyclerView)this.m.findViewById(2131429010);
            this.p = (TextView)this.m.findViewById(2131428564);
            this.q = new GestureDetector(this.l.getContext(), (GestureDetector$OnGestureListener)this);
            this.r = this.l.getResources().getDimensionPixelOffset(2131166509);
            this.s = this.l.getResources().getDimensionPixelOffset(2131166505);
            this.v = this.l.getResources().getDimensionPixelOffset(2131170074);
            this.m.findViewById(2131428234).setOnClickListener((View$OnClickListener)new izp(this, 11));
            this.m.findViewById(2131430409).setOnClickListener((View$OnClickListener)new izp(this, 12));
            this.m.setOnTouchListener((View$OnTouchListener)new gby(this, 6));
            ((View)this.o).setOnTouchListener((View$OnTouchListener)new gby(this, 7, (byte[])null));
            this.u.A((Callable)new inm(this, 13));
            this.u.A((Callable)new inm(this, 14));
            this.u.A((Callable)new inm(this, 15));
            this.u.A((Callable)new inm(this, 16));
            final jac g = this.g;
            final View m = this.m;
            g.e = (RecyclerView)m.findViewById(2131429010);
            g.g = m.findViewById(2131432066);
            if (g.e != null) {
                m.getContext();
                g.f = new jab();
                final LinearLayoutManager f = g.f;
                f.n = false;
                g.e.af((nw)f);
                g.e.ac((nq)g.d);
                g.e.addOnLayoutChangeListener((View$OnLayoutChangeListener)aczv.a);
                g.e.aE((iw)g);
                g.h.A((Callable)new inm(g, 10));
                g.c.i(abcg.f, (aayr)g);
            }
            ana.N((View)this.o, (akv)new jae(this));
        }
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        return true;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        if (n2 >= 500.0f && n2 >= Math.abs(n * 1.5f) && motionEvent != null) {
            if (motionEvent2 != null) {
                if (motionEvent2.getRawY() - motionEvent.getRawY() >= this.v && this.e.j()) {
                    this.e.g(true, true);
                }
            }
        }
        return false;
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        this.e.g(true, true);
        this.j.J(3, (wxz)jaf.a, (alff)null);
        return true;
    }
}
