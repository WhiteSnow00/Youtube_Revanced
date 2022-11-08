import java.util.NoSuchElementException;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class abd implements Iterator, Entry
{
    int a;
    int b;
    boolean c;
    final /* synthetic */ abg d;
    
    public abd(final abg d) {
        this.d = d;
        this.a = ((abn)d).d - 1;
        this.b = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(o instanceof Entry)) {
            return false;
        }
        final Entry entry = (Entry)o;
        return atnh.c(entry.getKey(), ((abn)this.d).c(this.b)) && atnh.c(entry.getValue(), ((abn)this.d).f(this.b));
    }
    
    @Override
    public final Object getKey() {
        if (this.c) {
            return ((abn)this.d).c(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    @Override
    public final Object getValue() {
        if (this.c) {
            return ((abn)this.d).f(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }
    
    @Override
    public final int hashCode() {
        if (this.c) {
            final Object c = ((abn)this.d).c(this.b);
            final Object f = ((abn)this.d).f(this.b);
            int hashCode = 0;
            int hashCode2;
            if (c == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = c.hashCode();
            }
            if (f != null) {
                hashCode = f.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    @Override
    public final void remove() {
        if (this.c) {
            ((abn)this.d).d(this.b);
            --this.b;
            --this.a;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final Object setValue(final Object o) {
        if (this.c) {
            return ((abn)this.d).e(this.b, o);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getKey());
        sb.append("=");
        sb.append(this.getValue());
        return sb.toString();
    }
}
