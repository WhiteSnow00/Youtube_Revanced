import java.util.HashMap;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import android.support.constraint.ConstraintLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjl extends acje
{
    private ConstraintLayout a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int[] g;
    private View h;
    private View i;
    
    public acjl(final Context context, final ackr ackr, final acku acku) {
        super(context, ackr, acku);
    }
    
    protected final ViewGroup b(final Context context) {
        (this.a = new ConstraintLayout(context)).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, -2));
        return this.a;
    }
    
    protected final acjj d(final Context context, final acku acku) {
        return (acjj)new acjk(context, acku);
    }
    
    protected final void f(final int n, final ackm ackm, final acjo acjo) {
        this.g = new int[n];
        this.b = ackm.b("grid_row_presenter_horizontal_row_padding", acjo.e);
        this.d = ackm.b("grid_row_presenter_top_padding", acjo.c);
        this.c = ackm.b("grid_row_presenter_horizontal_row_padding", acjo.f);
        this.e = ackm.b("grid_row_presenter_bottom_padding", acjo.d);
        this.f = acjo.g;
    }
    
    protected final void g(final ackm ackm, final acjo acjo) {
        final ac c = new ac();
        final ConstraintLayout a = this.a;
        final int childCount = a.getChildCount();
        c.a.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = a.getChildAt(i);
            final aa aa = (aa)child.getLayoutParams();
            final int id = child.getId();
            final HashMap a2 = c.a;
            final Integer value = id;
            if (!a2.containsKey(value)) {
                c.a.put(value, new ab());
            }
            final ab ab = c.a.get(value);
            ab.d = id;
            ab.h = aa.d;
            ab.i = aa.e;
            ab.j = aa.f;
            ab.k = aa.g;
            ab.l = aa.h;
            ab.m = aa.i;
            ab.n = aa.j;
            ab.o = aa.k;
            ab.p = aa.l;
            ab.q = aa.m;
            ab.r = aa.n;
            ab.s = aa.o;
            ab.t = aa.p;
            ab.u = aa.w;
            ab.v = aa.x;
            ab.w = aa.y;
            ab.x = aa.K;
            ab.y = aa.L;
            ab.z = aa.M;
            ab.g = aa.c;
            ab.e = aa.a;
            ab.f = aa.b;
            ab.b = aa.width;
            ab.c = aa.height;
            ab.A = aa.leftMargin;
            ab.B = aa.rightMargin;
            ab.C = aa.topMargin;
            ab.D = aa.bottomMargin;
            ab.N = aa.B;
            ab.O = aa.A;
            ab.Q = aa.D;
            ab.P = aa.C;
            ab.ad = aa.E;
            ab.ae = aa.F;
            ab.af = aa.I;
            ab.ag = aa.J;
            ab.ah = aa.G;
            ab.ai = aa.H;
            ab.E = aa.getMarginEnd();
            ab.F = aa.getMarginStart();
            ab.G = child.getVisibility();
            ab.R = child.getAlpha();
            ab.U = child.getRotationX();
            ab.V = child.getRotationY();
            ab.W = child.getScaleX();
            ab.X = child.getScaleY();
            ab.Y = child.getPivotX();
            ab.Z = child.getPivotY();
            ab.aa = child.getTranslationX();
            ab.ab = child.getTranslationY();
            ab.ac = child.getTranslationZ();
            if (ab.S) {
                ab.T = child.getElevation();
            }
        }
        c.b(this.h.getId(), 6, 0, 6);
        c.d(this.h.getId(), 6, this.b);
        c.b(this.i.getId(), 7, 0, 7);
        c.d(this.i.getId(), 7, this.c);
        final int[] g = this.g;
        final int length = g.length;
        int n = 1;
        if (length == 1) {
            c.b(g[0], 6, this.h.getId(), 6);
            c.b(this.g[0], 7, this.i.getId(), 7);
        }
        else {
            final int id2 = this.h.getId();
            final int id3 = this.i.getId();
            final int[] g2 = this.g;
            if (g2.length < 2) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            c.a(g2[0]).P = 0;
            c.e(g2[0], 6, id2, 6);
            int length2;
            while (true) {
                length2 = g2.length;
                if (n >= length2) {
                    break;
                }
                final int n2 = g2[n];
                final int n3 = n - 1;
                c.e(n2, 6, g2[n3], 7);
                c.e(g2[n3], 7, g2[n], 6);
                ++n;
            }
            c.e(g2[length2 - 1], 7, id3, 7);
        }
        int n4 = 0;
        while (true) {
            final int[] g3 = this.g;
            if (n4 >= g3.length) {
                break;
            }
            c.b(g3[n4], 3, 0, 3);
            c.b(this.g[n4], 4, 0, 4);
            c.a(this.g[n4]).v = 0.0f;
            final int[] g4 = this.g;
            final int length3 = g4.length;
            final float n5 = (float)length3;
            final float n6 = (float)this.f;
            int n7;
            if (n4 == length3 - 1) {
                n7 = 0;
            }
            else {
                n7 = (int)((length3 - n4 - 1) / n5 * n6);
            }
            final float n8 = n4 / n5;
            final int d = this.d;
            final int e = this.e;
            c.d(g4[n4], 6, (int)(n8 * n6));
            c.d(this.g[n4], 7, n7);
            c.d(this.g[n4], 3, d);
            c.d(this.g[n4], 4, e);
            ++n4;
        }
        this.a.c = c;
    }
    
    protected final void i(final View view, final acjo acjo, final int n) {
        this.g[n] = view.getId();
        int n2 = n;
        if (n == 0) {
            (this.h = new View(view.getContext())).setLayoutParams(new ViewGroup$LayoutParams(0, 0));
            this.h.setId(View.generateViewId());
            this.h.setVisibility(4);
            this.a.addView(this.h);
            n2 = 0;
        }
        this.a.addView(view);
        if (n2 == acjo.a - 1) {
            (this.i = new View(view.getContext())).setLayoutParams(new ViewGroup$LayoutParams(0, 0));
            this.i.setId(View.generateViewId());
            this.i.setVisibility(4);
            this.a.addView(this.i);
        }
    }
}
