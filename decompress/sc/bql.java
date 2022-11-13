import java.util.Iterator;
import java.util.Map;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bql extends azp implements axy
{
    public static final bql B;
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
        B = new bqk().f();
    }
    
    public bql(final bqk bqk) {
        super((azo)bqk);
        this.C = bqk.r;
        this.D = false;
        this.E = bqk.s;
        this.F = false;
        this.G = bqk.t;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = bqk.u;
        this.M = bqk.v;
        this.N = false;
        this.O = bqk.w;
        this.P = bqk.x;
        this.Q = bqk.y;
    }
    
    public static bql b(final Context context) {
        return new bqk(context).f();
    }
    
    public final /* bridge */ azo a() {
        return (azo)new bqk(this);
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
                final bql bql = (bql)o;
                if (super.equals((Object)bql) && this.C == bql.C && this.E == bql.E && this.G == bql.G && this.L == bql.L && this.M == bql.M && this.O == bql.O) {
                    final SparseBooleanArray q = this.Q;
                    final SparseBooleanArray q2 = bql.Q;
                    final int size = q.size();
                    if (q2.size() == size) {
                        for (int i = 0; i < size; ++i) {
                            if (q2.indexOfKey(q.keyAt(i)) < 0) {
                                return false;
                            }
                        }
                        final SparseArray p = this.P;
                        final SparseArray p2 = bql.P;
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
                                for (final Map.Entry<bpe, V> entry : map.entrySet()) {
                                    final bpe bpe = entry.getKey();
                                    if (!map2.containsKey(bpe)) {
                                        return false;
                                    }
                                    if (!bax.aa((Object)entry.getValue(), map2.get(bpe))) {
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
