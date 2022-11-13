import java.util.HashSet;
import android.widget.TextView;
import android.widget.ListView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.Set;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igf implements tgg
{
    public final Activity a;
    public final tgd b;
    public final acku c;
    public final atke d;
    public final atke e;
    public final wyw f;
    public final String g;
    public final boolean h;
    public final Set i;
    public LoadingFrameLayout j;
    public ListView k;
    public acle l;
    public tce m;
    public TextView n;
    public acko o;
    public igh p;
    public igk q;
    public final kle r;
    public final arwh s;
    public final lan t;
    public final ktn u;
    public final ktn v;
    public final aeea w;
    
    public igf(final Activity a, final tgd b, final arwh s, final lan t, final ktn v, final ktn u, final atke d, final aeea w, final acku c, final kle r, final atke e, final wyw f, final String g, final boolean h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = a;
        this.b = b;
        this.s = s;
        this.t = t;
        this.v = v;
        this.u = u;
        this.w = w;
        this.c = c;
        this.r = r;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = new HashSet();
    }
    
    public final void a(final boolean b) {
        final tce m = this.m;
        if (m != null && !m.e()) {
            this.m.d();
        }
        final LoadingFrameLayout j = this.j;
        j.getClass();
        j.c();
        this.m = tce.c((tcc)new ige(this, b));
        final aaeg i = ((aabo)this.e.a()).a().i();
        final String g = this.g;
        final Activity a = this.a;
        final tce k = this.m;
        k.getClass();
        i.y(g, (tcc)tca.c(a, (tcc)k));
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                                sb.append(n);
                                throw new IllegalStateException(sb.toString());
                            }
                            if (this.i.contains(((zym)o).a)) {
                                this.a(false);
                                return null;
                            }
                        }
                        else if (this.i.contains(((zyh)o).a)) {
                            this.a(true);
                            return null;
                        }
                    }
                    else if (this.g.equals(((zxx)o).a.d())) {
                        this.a(false);
                        return null;
                    }
                }
                else if (this.g.equals(((zxw)o).a)) {
                    this.a(false);
                    return null;
                }
            }
            else {
                final uzn uzn = (uzn)o;
                final acle l = this.l;
                l.getClass();
                l.remove(uzn.b());
            }
        }
        else {
            array = new Class[] { uzn.class, zxw.class, zxx.class, zyh.class, zym.class };
        }
        return array;
    }
}
