import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afhe extends afhf implements afjh
{
    private transient afgh a;
    private transient afhk b;
    
    public static afhb n() {
        return new afhb(4);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @Deprecated
    @Override
    public final int a(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final int c(final Object[] array, int n) {
        final aflu k = this.p().k();
        while (((Iterator)k).hasNext()) {
            final afji afji = (afji)((Iterator)k).next();
            Arrays.fill(array, n, afji.a() + n, afji.a);
            n += afji.a();
        }
        return n;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.b(o) > 0;
    }
    
    @Deprecated
    @Override
    public final int d(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return aewr.n(this, o);
    }
    
    @Override
    public final afgh g() {
        afgh a;
        if ((a = this.a) == null) {
            a = super.g();
            this.a = a;
        }
        return a;
    }
    
    @Deprecated
    @Override
    public final boolean h(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final int hashCode() {
        return agra.F((Set)this.p());
    }
    
    @Override
    public /* bridge */ Set i() {
        throw null;
    }
    
    @Override
    public final /* bridge */ Iterator iterator() {
        return (Iterator)this.k();
    }
    
    @Override
    public final /* bridge */ Set j() {
        return this.p();
    }
    
    @Override
    public final aflu k() {
        return new afha((Iterator)this.p().k());
    }
    
    public abstract afhk o();
    
    public final afhk p() {
        Object b;
        if ((b = this.b) == null) {
            if (this.isEmpty()) {
                b = afkg.a;
            }
            else {
                b = new afhc(this);
            }
            this.b = (afhk)b;
        }
        return (afhk)b;
    }
    
    public abstract afji q(final int p0);
    
    @Override
    public final String toString() {
        return this.p().toString();
    }
    
    @Override
    abstract Object writeReplace();
}
