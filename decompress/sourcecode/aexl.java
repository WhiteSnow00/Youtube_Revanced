import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

final class aexl extends AbstractList
{
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    
    public aexl(final Object[] a, final Object b, final Object c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object get(final int n) {
        if (n == 0) {
            return this.b;
        }
        if (n != 1) {
            return this.a[n - 2];
        }
        return this.c;
    }
    
    @Override
    public final int size() {
        return this.a.length + 2;
    }
}
