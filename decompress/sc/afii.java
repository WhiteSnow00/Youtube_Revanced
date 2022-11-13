import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class afii extends afeq
{
    final afij a;
    
    public afii(final afij a) {
        this.a = a;
    }
    
    public final /* bridge */ Object get(int n) {
        adkp.Y(n, this.a.c);
        final afij a = this.a;
        final Object[] a2 = a.a;
        final int b = a.b;
        n += n;
        final Object o = a2[n + b];
        o.getClass();
        final Object o2 = a2[n + (b ^ 0x1)];
        o2.getClass();
        return new AbstractMap.SimpleImmutableEntry(o, o2);
    }
    
    public final boolean l() {
        return true;
    }
    
    public final int size() {
        return this.a.c;
    }
}
