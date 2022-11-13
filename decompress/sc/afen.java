import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class afen extends afeq
{
    private final transient afeq a;
    
    public afen(final afeq a) {
        this.a = a;
    }
    
    private final int F(final int n) {
        return this.size() - 1 - n;
    }
    
    private final int G(final int n) {
        return this.size() - n;
    }
    
    public final afeq a() {
        return this.a;
    }
    
    public final afeq b(final int n, final int n2) {
        adkp.P(n, n2, this.size());
        return this.a.b(this.G(n2), this.G(n)).a();
    }
    
    public final boolean contains(final Object o) {
        return this.a.contains(o);
    }
    
    public final Object get(final int n) {
        adkp.Y(n, this.size());
        return this.a.get(this.F(n));
    }
    
    public final int indexOf(final Object o) {
        final int lastIndex = this.a.lastIndexOf(o);
        if (lastIndex >= 0) {
            return this.F(lastIndex);
        }
        return -1;
    }
    
    public final boolean l() {
        return this.a.l();
    }
    
    public final int lastIndexOf(final Object o) {
        final int index = this.a.indexOf(o);
        if (index >= 0) {
            return this.F(index);
        }
        return -1;
    }
    
    public final int size() {
        return this.a.size();
    }
    
    public final /* bridge */ List subList(final int n, final int n2) {
        return (List)this.b(n, n2);
    }
}
