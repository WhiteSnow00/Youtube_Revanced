import java.util.Iterator;
import java.util.Map;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqk extends azo implements axx
{
    public static final bqk B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final SparseArray P;
    public final SparseBooleanArray Q;
    
    static {
        B = new bqj().f();
    }
    
    public bqk(final bqj bqj) {
        super((azn)bqj);
        this.C = bqj.r;
        this.D = false;
        this.E = bqj.s;
        this.F = false;
        this.G = bqj.t;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = bqj.u;
        this.M = bqj.v;
        this.N = false;
        this.O = bqj.w;
        this.P = bqj.x;
        this.Q = bqj.y;
    }
    
    public static bqk b(final Context context) {
        return new bqj(context).f();
    }
    
    public final boolean c(final int n) {
        return this.Q.get(n);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bqk bqk = (bqk)o;
                if (super.equals((Object)bqk) && this.C == bqk.C && this.E == bqk.E && this.G == bqk.G && this.L == bqk.L && this.M == bqk.M && this.O == bqk.O) {
                    final SparseBooleanArray q = this.Q;
                    final SparseBooleanArray q2 = bqk.Q;
                    final int size = q.size();
                    if (q2.size() == size) {
                        for (int i = 0; i < size; ++i) {
                            if (q2.indexOfKey(q.keyAt(i)) < 0) {
                                return false;
                            }
                        }
                        final SparseArray p = this.P;
                        final SparseArray p2 = bqk.P;
                        final int size2 = p.size();
                        if (p2.size() == size2) {
                            for (int j = 0; j < size2; ++j) {
                                final int indexOfKey = p2.indexOfKey(p.keyAt(j));
                                if (indexOfKey < 0) {
                                    return false;
                                }
                                final Map map = (Map)p.valueAt(j);
                                final Map map2 = (Map)p2.valueAt(indexOfKey);
                                if (map2.size() != map.size()) {
                                    return false;
                                }
                                for (final Map.Entry<bpd, V> entry : map.entrySet()) {
                                    final bpd bpd = entry.getKey();
                                    if (!map2.containsKey(bpd)) {
                                        return false;
                                    }
                                    if (!baw.aa((Object)entry.getValue(), map2.get(bpd))) {
                                        return false;
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return ((((((super.hashCode() + 31) * 31 + (this.C ? 1 : 0)) * 961 + (this.E ? 1 : 0)) * 961 + (this.G ? 1 : 0)) * 28629151 + (this.L ? 1 : 0)) * 31 + (this.M ? 1 : 0)) * 961 + (this.O ? 1 : 0);
    }
}
