import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afdo extends afdp implements affr
{
    private transient afcr a;
    private transient afdu b;
    
    public static afdl n() {
        return new afdl(4);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @Deprecated
    public final int a(final Object o, final int n) {
        throw null;
    }
    
    public final int c(final Object[] array, int n) {
        final afie k = this.p().k();
        while (((Iterator)k).hasNext()) {
            final affs affs = (affs)((Iterator)k).next();
            Arrays.fill(array, n, affs.a() + n, affs.a);
            n += affs.a();
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
        return ajox.M((affr)this, o);
    }
    
    public final afcr g() {
        afcr a;
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
        return aesy.i((Set)this.p());
    }
    
    public final afie k() {
        return (afie)new afdk((Iterator)this.p().k());
    }
    
    public abstract afdu o();
    
    public final afdu p() {
        Object b;
        if ((b = this.b) == null) {
            if (this.isEmpty()) {
                b = afgq.a;
            }
            else {
                b = new afdm(this);
            }
            this.b = (afdu)b;
        }
        return (afdu)b;
    }
    
    public abstract affs q(final int p0);
    
    public final String toString() {
        return this.p().toString();
    }
    
    abstract Object writeReplace();
}
