import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atlc implements Serializable, atli
{
    private final atli a;
    private final atlf b;
    
    public atlc(final atli a, final atlf b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    private final int a() {
        int n = 2;
        atlc atlc = this;
        while (true) {
            final atli a = atlc.a;
            if (a instanceof atlc) {
                atlc = (atlc)a;
            }
            else {
                atlc = null;
            }
            if (atlc == null) {
                break;
            }
            ++n;
        }
        return n;
    }
    
    private final boolean b(final atlf atlf) {
        return atnh.c(this.get(atlf.getKey()), atlf);
    }
    
    private final Object writeReplace() {
        final int a = this.a();
        final atli[] array = new atli[a];
        final atnm atnm = new atnm();
        this.fold(atjv.a, (atmp)new atlb(array, atnm));
        if (atnm.a == a) {
            return new atla(array);
        }
        throw new IllegalStateException("Check failed.");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this != o) {
            if (o instanceof atlc) {
                final atlc atlc = (atlc)o;
                if (atlc.a() == this.a()) {
                    atlc atlc2 = this;
                    while (atlc.b(atlc2.b)) {
                        final atli a = atlc2.a;
                        if (a instanceof atlc) {
                            atlc2 = (atlc)a;
                        }
                        else {
                            if (atlc.b((atlf)a)) {
                                b = b;
                                return b;
                            }
                            return false;
                        }
                    }
                    return false;
                }
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final Object fold(final Object o, final atmp atmp) {
        return atmp.invoke(this.a.fold(o, atmp), this.b);
    }
    
    @Override
    public final atlf get(final atlg atlg) {
        atlg.getClass();
        atlc atlc = this;
        while (true) {
            final atlf value = atlc.b.get(atlg);
            if (value != null) {
                return value;
            }
            final atli a = atlc.a;
            if (!(a instanceof atlc)) {
                return a.get(atlg);
            }
            atlc = (atlc)a;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }
    
    @Override
    public final atli minusKey(final atlg atlg) {
        atlg.getClass();
        if (this.b.get(atlg) != null) {
            return this.a;
        }
        final atli minusKey = this.a.minusKey(atlg);
        Object b;
        if (minusKey != this.a) {
            if (minusKey == atlj.a) {
                b = this.b;
            }
            else {
                b = new atlc(minusKey, this.b);
            }
        }
        else {
            b = this;
        }
        return (atli)b;
    }
    
    @Override
    public final atli plus(final atli atli) {
        return atxk.c((atli)this, atli);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append((String)this.fold("", (atmp)atlh.b));
        sb.append(']');
        return sb.toString();
    }
}
