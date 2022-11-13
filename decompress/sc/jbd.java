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

public final class jbd extends GestureDetector$SimpleOnGestureListener
{
    public static final wyt a;
    public static final wyt b;
    public static final wyt c;
    public static final wyt d;
    public final jbh e;
    public final fpn f;
    public final jba g;
    public final jbj h;
    public final fjv i;
    public final wyw j;
    public final boolean k;
    public ViewStub l;
    public View m;
    public View n;
    public RecyclerView o;
    public TextView p;
    public GestureDetector q;
    public int r;
    public int s;
    public final arfk t;
    public final msr u;
    private int v;
    
    static {
        a = new wyt(xaa.c(153154));
        b = new wyt(xaa.c(152789));
        c = new wyt(xaa.c(153156));
        d = new wyt(xaa.c(153155));
    }
    
    public jbd(final jbh e, final fpn f, final jba g, final arfk t, final ajb ajb, final fjv i, final msr u, final wyw j, final vai vai, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = ajb.m(2);
        this.t = t;
        this.i = i;
        this.u = u;
        this.j = j;
        this.k = vai.f(45378693L);
    }
    
    public static String a(final long n) {
        return tvb.j(TimeUnit.MILLISECONDS.toSeconds(n + 500L));
    }
    
    public final void b() {
        final ViewStub l = this.l;
        if (l != null) {
            final View inflate = l.inflate();
            this.m = inflate;
            this.n = inflate.findViewById(2131432067);
            this.o = (RecyclerView)this.m.findViewById(2131429010);
            this.p = (TextView)this.m.findViewById(2131428564);
            this.q = new GestureDetector(this.l.getContext(), (GestureDetector$OnGestureListener)this);
            this.r = this.l.getResources().getDimensionPixelOffset(2131166508);
            this.s = this.l.getResources().getDimensionPixelOffset(2131166504);
            this.v = this.l.getResources().getDimensionPixelOffset(2131170075);
            this.m.findViewById(2131428234).setOnClickListener((View$OnClickListener)new jan(this, 11));
            this.m.findViewById(2131430410).setOnClickListener((View$OnClickListener)new jan(this, 12));
            this.m.setOnTouchListener((View$OnTouchListener)new gcf(this, 6));
            ((View)this.o).setOnTouchListener((View$OnTouchListener)new gcf(this, 7, (byte[])null));
            this.u.Q((Callable)new ikw(this, 15));
            this.u.Q((Callable)new ikw(this, 16));
            this.u.Q((Callable)new ikw(this, 17));
            this.u.Q((Callable)new ikw(this, 18));
            final jba g = this.g;
            final View m = this.m;
            g.e = (RecyclerView)m.findViewById(2131429010);
            g.g = m.findViewById(2131432069);
            if (g.e != null) {
                m.getContext();
                g.f = new jaz();
                final LinearLayoutManager f = g.f;
                f.n = false;
                g.e.af((nw)f);
                g.e.ac((nq)g.d);
                g.e.addOnLayoutChangeListener((View$OnLayoutChangeListener)adby.a);
                g.e.aE((iw)g);
                g.h.Q((Callable)new ikw(g, 12));
                g.c.i(abea.f, (abao)g);
            }
            anb.N((View)this.o, new jbc(this));
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
        this.j.J(3, (wzz)jbd.a, (alhi)null);
        return true;
    }
}
