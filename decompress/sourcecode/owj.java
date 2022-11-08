import com.facebook.litho.ComponentTree;
import android.view.View$MeasureSpec;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.view.View$OnLayoutChangeListener;
import android.support.v7.widget.RecyclerView;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public class owj
{
    public final HashMap a;
    public nq b;
    public RecyclerView c;
    public boolean d;
    public final owi e;
    public final View$OnLayoutChangeListener f;
    public final owh g;
    public int h;
    public int i;
    public final ArrayList j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public aepj p;
    private final int q;
    private final float r;
    private boolean s;
    private final adxi t;
    
    public owj(final int q, final float r) {
        this.a = new HashMap();
        this.b = null;
        this.p = null;
        this.c = null;
        this.d = true;
        this.e = new owi(this);
        this.f = (View$OnLayoutChangeListener)new jbw(this, 14);
        this.g = new owh(this);
        this.h = -1;
        this.i = -1;
        this.j = new ArrayList();
        this.k = -1;
        this.l = -1;
        this.m = 1;
        this.n = -1;
        this.o = -1;
        this.s = false;
        this.t = new adxi(0, null, null, null, null);
        this.q = q;
        this.r = r;
    }
    
    private static final boolean a(final int n, final int n2, final int n3) {
        return n >= n2 && n <= n3;
    }
    
    public final int b(int binarySearch) {
        final adxi t = this.t;
        t.a = binarySearch;
        final int n = binarySearch = Collections.binarySearch(this.j, t, (Comparator<? super adxi>)mao.e);
        if (n < 0) {
            binarySearch = -(n + 1);
        }
        return binarySearch;
    }
    
    public final void c() {
        if (!this.j.isEmpty() && this.i != 0) {
            if (this.h != 0) {
                final nw n = this.c.n;
                int k;
                if (n instanceof LinearLayoutManager) {
                    k = ((LinearLayoutManager)n).K();
                }
                else if (n instanceof GridLayoutManager) {
                    k = ((GridLayoutManager)n).K();
                }
                else {
                    k = 0;
                }
                this.k = k;
                final nw n2 = this.c.n;
                int l;
                if (n2 instanceof LinearLayoutManager) {
                    l = ((LinearLayoutManager)n2).M();
                }
                else if (n2 instanceof GridLayoutManager) {
                    l = ((GridLayoutManager)n2).M();
                }
                else {
                    l = -1;
                }
                this.l = l;
                final int max = Math.max(this.m, l - this.k + 1);
                this.m = max;
                final int max2 = Math.max(0, this.k - Math.round(max * this.r));
                final int n3 = this.l + Math.round(this.m * this.r);
                final int q = this.q;
                int n4 = n3;
                if (n3 - max2 + 1 < q) {
                    n4 = q + max2 - 1;
                }
                int o;
                if ((o = n4) >= this.b.a()) {
                    o = this.b.a() - 1;
                }
                final int n5 = this.n;
                if (max2 == n5 && o == this.o && !this.s) {
                    return;
                }
                this.s = false;
                int min;
                if (n5 < 0) {
                    min = max2;
                }
                else {
                    min = Math.min(n5, max2);
                }
                final int o2 = this.o;
                int max3;
                if (o2 < 0) {
                    max3 = o;
                }
                else {
                    max3 = Math.max(o2, o);
                }
                int i = this.b(min);
                owl owl = null;
                while (i < this.j.size()) {
                    final adxi adxi = this.j.get(i);
                    final int a = adxi.a;
                    if (a > max3) {
                        break;
                    }
                    owl owl3 = null;
                    Label_0642: {
                        if (a(a, max2, o) && !adxi.b) {
                            owl owl2;
                            if ((owl2 = owl) == null) {
                                owl2 = new owl(this.c.getWidth(), this.c.getHeight(), this.d);
                            }
                            adxi.b = true;
                            final Object c = adxi.c;
                            int h;
                            if (owl2.c) {
                                h = owl2.a;
                            }
                            else {
                                h = owl2.b;
                            }
                            final owp owp = (owp)c;
                            if (owp.g != null) {
                                owl3 = owl2;
                                if (h == owp.h) {
                                    break Label_0642;
                                }
                            }
                            owp.h = h;
                            final ComponentTree a2 = owp.a();
                            int measureSpec;
                            if (owl2.c) {
                                measureSpec = View$MeasureSpec.makeMeasureSpec(owl2.a, 1073741824);
                            }
                            else {
                                measureSpec = 0;
                            }
                            int measureSpec2;
                            if (owl2.c) {
                                measureSpec2 = 0;
                            }
                            else {
                                measureSpec2 = View$MeasureSpec.makeMeasureSpec(owl2.b, 1073741824);
                            }
                            final dss f = owp.f;
                            if (f == null) {
                                throw new IllegalArgumentException("Root component can't be null");
                            }
                            a2.y(f, measureSpec, measureSpec2, true, (dwp)null, 1, (cxz)null);
                            owl3 = owl2;
                        }
                        else {
                            owl3 = owl;
                            if (!a(a, max2, o)) {
                                owl3 = owl;
                                if (adxi.b) {
                                    adxi.b = false;
                                    ((owp)adxi.c).b();
                                    owl3 = owl;
                                }
                            }
                        }
                    }
                    ++i;
                    owl = owl3;
                }
                this.n = max2;
                this.o = o;
            }
        }
    }
    
    public final void d() {
        final ArrayList j = this.j;
        for (int size = j.size(), i = 0; i < size; ++i) {
            final adxi adxi = (adxi)j.get(i);
            if (adxi.b) {
                ((owp)adxi.c).b();
                adxi.b = false;
            }
        }
        this.k = -1;
        this.l = -1;
        this.n = -1;
        this.o = -1;
        this.m = 1;
    }
    
    public final void e() {
        if ((this.d && this.c.getWidth() != this.h) || (!this.d && this.c.getHeight() != this.i)) {
            this.h = this.c.getWidth();
            this.i = this.c.getHeight();
            this.d();
            this.c();
        }
    }
    
    public void f() {
        throw null;
    }
}
