import java.util.List;
import android.support.v7.widget.RecyclerView;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class haa extends qf
{
    private final hyx a;
    
    public haa(final hyx a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    static Optional q(final on on) {
        return Optional.ofNullable((Object)on.a.getTag(2131430572));
    }
    
    static boolean r(final nq nq, final int n) {
        return n != -1 && (nq.a() != 0 && nq instanceof ackz) && ((ackz)nq).getItem(n) instanceof gzw;
    }
    
    public final int d(final RecyclerView recyclerView, final on on) {
        Label_0073: {
            if (!r(recyclerView.m, on.a())) {
                break Label_0073;
            }
            final Optional q = q(on);
            if (!q.isPresent() || !(((ackt)q.get()).t instanceof gzi) || ((gzi)((ackt)q.get()).t).a.g) {
                break Label_0073;
            }
            final int n = 3;
            return n(n);
        }
        final int n = 0;
        return n(n);
    }
    
    public final void f(final RecyclerView recyclerView, final on on) {
        on.a.setScaleX(1.0f);
        on.a.setScaleY(1.0f);
        super.f(recyclerView, on);
    }
    
    public final void g(final on on, final int n) {
        if (n == 2) {
            on.a.setScaleX(1.03f);
            on.a.setScaleY(1.1f);
            final Optional q = q(on);
            if (q.isPresent() && ((ackt)q.get()).t instanceof gzi) {
                final aeea h = ((gzi)((ackt)q.get()).t).a.h;
                if (h != null) {
                    h.cG(xaa.c(116672)).e();
                }
            }
        }
    }
    
    public final boolean j() {
        return false;
    }
    
    public final boolean k() {
        return this.a.c() > 1;
    }
    
    public final boolean l(final RecyclerView recyclerView, final on on, final on on2) {
        final int n = (r(recyclerView.m, 0) ^ true) ? 1 : 0;
        final int c = this.a.c();
        final int a = on.a();
        final int min = Math.min(Math.max(on2.a(), n), c + n - 1);
        if (a != min && r(recyclerView.m, min)) {
            final hyx a2 = this.a;
            final int n2 = a - n;
            final int n3 = min - n;
            if (n2 != n3) {
                if (n2 >= 0 && n3 >= 0 && n2 < a2.c() && n3 < a2.c()) {
                    final int size = ((List)a2.d).size();
                    final hab hab = ((List<hab>)a2.d).remove(n2);
                    ((List<hab>)a2.d).add(n3, hab);
                    ((tyv)a2.c).p(hab.a(), size - n3 - 1);
                }
            }
            recyclerView.m.k(a, min);
            return true;
        }
        return false;
    }
    
    public final void p() {
    }
}
