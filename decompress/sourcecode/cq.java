import android.view.View;
import java.util.Iterator;
import android.util.Log;
import android.view.ViewGroup;
import android.support.v4.app.Fragment$SavedState;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class cq extends cko
{
    private final cl a;
    private ct c;
    private final ArrayList d;
    private final ArrayList e;
    private br f;
    private boolean g;
    
    @Deprecated
    public cq(final cl a) {
        this.c = null;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = null;
        this.a = a;
    }
    
    public final Parcelable a() {
        Bundle bundle;
        if (this.d.size() > 0) {
            bundle = new Bundle();
            final Fragment$SavedState[] array = new Fragment$SavedState[this.d.size()];
            this.d.toArray(array);
            bundle.putParcelableArray("states", (Parcelable[])array);
        }
        else {
            bundle = null;
        }
        Bundle bundle2;
        for (int i = 0; i < this.e.size(); ++i, bundle = bundle2) {
            final br br = this.e.get(i);
            bundle2 = bundle;
            if (br != null) {
                bundle2 = bundle;
                if (br.ar()) {
                    if ((bundle2 = bundle) == null) {
                        bundle2 = new Bundle();
                    }
                    final StringBuilder sb = new StringBuilder("f");
                    sb.append(i);
                    this.a.J(bundle2, sb.toString(), br);
                }
            }
        }
        return (Parcelable)bundle;
    }
    
    public abstract br b(final int p0);
    
    public Object c(final ViewGroup viewGroup, final int n) {
        if (this.e.size() > n) {
            final br br = this.e.get(n);
            if (br != null) {
                return br;
            }
        }
        if (this.c == null) {
            this.c = this.a.i();
        }
        final br b = this.b(n);
        if (this.d.size() > n) {
            final Fragment$SavedState fragment$SavedState = this.d.get(n);
            if (fragment$SavedState != null) {
                b.ai(fragment$SavedState);
            }
        }
        while (this.e.size() <= n) {
            this.e.add(null);
        }
        b.aj(false);
        b.ao(false);
        this.e.set(n, b);
        this.c.q(viewGroup.getId(), b);
        return b;
    }
    
    public void d(final ViewGroup viewGroup, final int n, final Object o) {
        final br br = (br)o;
        if (this.c == null) {
            this.c = this.a.i();
        }
        while (this.d.size() <= n) {
            this.d.add(null);
        }
        final ArrayList d = this.d;
        Fragment$SavedState c;
        if (br.ar()) {
            c = this.a.c(br);
        }
        else {
            c = null;
        }
        d.set(n, c);
        this.e.set(n, null);
        this.c.n(br);
        if (br.equals(this.f)) {
            this.f = null;
        }
    }
    
    public final void e(final Parcelable parcelable, final ClassLoader classLoader) {
        if (parcelable != null) {
            final Bundle bundle = (Bundle)parcelable;
            bundle.setClassLoader(classLoader);
            final Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.d.clear();
            this.e.clear();
            if (parcelableArray != null) {
                for (int i = 0; i < parcelableArray.length; ++i) {
                    this.d.add(parcelableArray[i]);
                }
            }
            for (final String s : bundle.keySet()) {
                if (s.startsWith("f")) {
                    final int int1 = Integer.parseInt(s.substring(1));
                    final br g = this.a.g(bundle, s);
                    if (g != null) {
                        while (this.e.size() <= int1) {
                            this.e.add(null);
                        }
                        g.aj(false);
                        this.e.set(int1, g);
                    }
                    else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(String.valueOf(s)));
                    }
                }
            }
        }
    }
    
    public final void f(final ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        final StringBuilder sb = new StringBuilder("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }
    
    public final boolean g(final View view, final Object o) {
        return ((br)o).O == view;
    }
    
    public final void h() {
        final ct c = this.c;
        if (c != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    c.e();
                }
                finally {
                    this.g = false;
                }
            }
            this.c = null;
        }
    }
    
    public final void i(final ViewGroup viewGroup, final Object o) {
        final br f = (br)o;
        final br f2 = this.f;
        if (f != f2) {
            if (f2 != null) {
                f2.aj(false);
                this.f.ao(false);
            }
            f.aj(true);
            f.ao(true);
            this.f = f;
        }
    }
}
