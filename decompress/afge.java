import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class afge extends afgh
{
    private final transient afgh a;
    
    public afge(final afgh a) {
        this.a = a;
    }
    
    private final int F(final int n) {
        return this.size() - 1 - n;
    }
    
    private final int G(final int n) {
        return this.size() - n;
    }
    
    @Override
    public final afgh a() {
        return this.a;
    }
    
    @Override
    public final afgh b(final int n, final int n2) {
        adme.S(n, n2, this.size());
        return this.a.b(this.G(n2), this.G(n)).a();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.contains(o);
    }
    
    @Override
    public final Object get(final int n) {
        adme.ab(n, this.size());
        return this.a.get(this.F(n));
    }
    
    @Override
    public final int indexOf(final Object o) {
        final int lastIndex = this.a.lastIndexOf(o);
        if (lastIndex >= 0) {
            return this.F(lastIndex);
        }
        return -1;
    }
    
    @Override
    public final boolean l() {
        return this.a.l();
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        final int index = this.a.indexOf(o);
        if (index >= 0) {
            return this.F(index);
        }
        return -1;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final /* bridge */ List subList(final int n, final int n2) {
        return this.b(n, n2);
    }
}
