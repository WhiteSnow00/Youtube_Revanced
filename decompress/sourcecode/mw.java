import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mw
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public List l;
    public boolean m;
    
    public mw() {
        this.a = true;
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.l = null;
    }
    
    public final View a(final oc oc) {
        final List l = this.l;
        if (l != null) {
            for (int size = l.size(), i = 0; i < size; ++i) {
                final View a = this.l.get(i).a;
                final nx nx = (nx)a.getLayoutParams();
                if (!nx.lv()) {
                    if (this.d == nx.lt()) {
                        this.c(a);
                        return a;
                    }
                }
            }
            return null;
        }
        final View b = oc.b(this.d);
        this.d += this.e;
        return b;
    }
    
    public final void b() {
        this.c(null);
    }
    
    public final void c(final View view) {
        final int size = this.l.size();
        View view2 = null;
        int n = Integer.MAX_VALUE;
        int n2 = 0;
        View view3;
        while (true) {
            view3 = view2;
            if (n2 >= size) {
                break;
            }
            final View a = this.l.get(n2).a;
            final nx nx = (nx)a.getLayoutParams();
            View view4 = view2;
            int n3 = n;
            if (a != view) {
                if (nx.lv()) {
                    view4 = view2;
                    n3 = n;
                }
                else {
                    final int n4 = (nx.lt() - this.d) * this.e;
                    if (n4 < 0) {
                        view4 = view2;
                        n3 = n;
                    }
                    else {
                        view4 = view2;
                        if (n4 < (n3 = n)) {
                            if (n4 == 0) {
                                view3 = a;
                                break;
                            }
                            view4 = a;
                            n3 = n4;
                        }
                    }
                }
            }
            ++n2;
            view2 = view4;
            n = n3;
        }
        if (view3 == null) {
            this.d = -1;
            return;
        }
        this.d = ((nx)view3.getLayoutParams()).lt();
    }
    
    public final boolean d(final ok ok) {
        final int d = this.d;
        return d >= 0 && d < ok.a();
    }
}
