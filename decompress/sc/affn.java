import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class affn extends affo implements afhr
{
    private transient afeq a;
    private transient afft b;
    
    public static affk n() {
        return new affk(4);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @Deprecated
    public final int a(final Object o, final int n) {
        throw null;
    }
    
    public final int c(final Object[] array, int n) {
        final afke k = this.p().k();
        while (k.hasNext()) {
            final afhs afhs = k.next();
            Arrays.fill(array, n, afhs.a() + n, afhs.a);
            n += afhs.a();
        }
        return n;
    }
    
    public final boolean contains(final Object o) {
        return this.b(o) > 0;
    }
    
    @Deprecated
    public final int d(final Object o, final int n) {
        throw null;
    }
    
    public final boolean equals(final Object o) {
        return agpi.E(this, o);
    }
    
    public final afeq g() {
        afeq a;
        if ((a = this.a) == null) {
            a = super.g();
            this.a = a;
        }
        return a;
    }
    
    @Deprecated
    public final boolean h(final Object o, final int n) {
        throw null;
    }
    
    public final int hashCode() {
        return agqs.aa((Set)this.p());
    }
    
    public /* bridge */ Set i() {
        throw null;
    }
    
    public final /* bridge */ Iterator iterator() {
        return this.k();
    }
    
    public final /* bridge */ Set j() {
        return (Set)this.p();
    }
    
    public final afke k() {
        return (afke)new affj((Iterator)this.p().k());
    }
    
    public abstract afft o();
    
    public final afft p() {
        Object b;
        if ((b = this.b) == null) {
            if (this.isEmpty()) {
                b = afiq.a;
            }
            else {
                b = new affl(this);
            }
            this.b = (afft)b;
        }
        return (afft)b;
    }
    
    public abstract afhs q(final int p0);
    
    public final String toString() {
        return this.p().toString();
    }
    
    abstract Object writeReplace();
}
