import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzz
{
    public final boolean a;
    public final RecyclerView b;
    
    public fzz() {
    }
    
    public fzz(final boolean a, final RecyclerView b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fzz) {
            final fzz fzz = (fzz)o;
            if (this.a == fzz.a && this.b.equals(fzz.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (n ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("SearchResultsChipBarModel{chipApplied=");
        sb.append(a);
        sb.append(", resultsRecyclerView=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
