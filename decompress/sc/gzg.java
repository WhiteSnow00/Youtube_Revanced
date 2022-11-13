import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzg extends acjg
{
    public List a;
    
    public gzg(final List a) {
        this.a = a;
    }
    
    public final int a() {
        return this.a.size();
    }
    
    public final long b(final int n) {
        return this.d(n).a();
    }
    
    public final /* bridge */ Object c(final int n) {
        return this.d(n);
    }
    
    public final boolean contains(final Object o) {
        throw null;
    }
    
    public final hab d(final int n) {
        return this.a.get(n);
    }
    
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
}
