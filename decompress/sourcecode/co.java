import android.view.View;
import android.view.ViewGroup;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class co extends cko
{
    public br a;
    private final cl c;
    private ct d;
    private boolean e;
    
    @Deprecated
    public co(final cl c) {
        this.d = null;
        this.a = null;
        this.c = c;
    }
    
    private static String o(final int n, final long n2) {
        final StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(n);
        sb.append(":");
        sb.append(n2);
        return sb.toString();
    }
    
    public final Parcelable a() {
        return null;
    }
    
    public abstract br b(final int p0);
    
    public final Object c(final ViewGroup viewGroup, final int n) {
        if (this.d == null) {
            this.d = this.c.i();
        }
        final long n2 = n;
        final br f = this.c.f(o(viewGroup.getId(), n2));
        br br;
        if (f != null) {
            this.d.u(f);
            br = f;
        }
        else {
            final br b = this.b(n);
            this.d.r(viewGroup.getId(), b, o(viewGroup.getId(), n2));
            br = b;
        }
        if (br != this.a) {
            br.aj(false);
            br.ao(false);
        }
        return br;
    }
    
    public final void d(final ViewGroup viewGroup, final int n, final Object o) {
        final br br = (br)o;
        if (this.d == null) {
            this.d = this.c.i();
        }
        this.d.l(br);
        if (br.equals((Object)this.a)) {
            this.a = null;
        }
    }
    
    public final void e(final Parcelable parcelable, final ClassLoader classLoader) {
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
        final ct d = this.d;
        if (d != null) {
            if (!this.e) {
                try {
                    this.e = true;
                    d.e();
                }
                finally {
                    this.e = false;
                }
            }
            this.d = null;
        }
    }
}
