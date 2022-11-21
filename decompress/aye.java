import android.util.SparseBooleanArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aye
{
    private final SparseBooleanArray a;
    
    public aye(final SparseBooleanArray a) {
        this.a = a;
    }
    
    public final int a(final int n) {
        bad.h(n, this.b());
        return this.a.keyAt(n);
    }
    
    public final int b() {
        return this.a.size();
    }
    
    public final boolean c(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aye)) {
            return false;
        }
        final aye aye = (aye)o;
        final int a = baz.a;
        return this.a.equals((Object)aye.a);
    }
    
    @Override
    public final int hashCode() {
        final int a = baz.a;
        return this.a.hashCode();
    }
}
