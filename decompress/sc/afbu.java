import java.util.Arrays;
import java.util.Iterator;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afbu extends afby implements Serializable
{
    private static final long serialVersionUID = 0L;
    transient afhz a;
    transient long b;
    
    public afbu() {
        this.a = this.g();
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        this.a = this.g();
        for (int i = 0; i < int1; ++i) {
            ((afhr)this).a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(((afhr)this).j().size());
        for (final afhs afhs : ((afhr)this).j()) {
            objectOutputStream.writeObject(afhs.a);
            objectOutputStream.writeInt(afhs.a());
        }
    }
    
    public final int a(final Object o, final int n) {
        if (n == 0) {
            return this.b(o);
        }
        final boolean b = true;
        adkp.K(n > 0, "occurrences cannot be negative: %s", n);
        final int d = this.a.d(o);
        if (d == -1) {
            this.a.o(o, n);
            this.b += n;
            return 0;
        }
        final int c = this.a.c(d);
        final long n2 = c;
        final long n3 = n;
        final long n4 = n2 + n3;
        adkp.L(n4 <= 2147483647L && b, "too many occurrences: %s", n4);
        this.a.m(d, (int)n4);
        this.b += n3;
        return c;
    }
    
    public final int b(final Object o) {
        return this.a.b(o);
    }
    
    public final int c() {
        return this.a.c;
    }
    
    public final void clear() {
        final afhz a = this.a;
        ++a.d;
        Arrays.fill(a.a, 0, a.c, null);
        Arrays.fill(a.b, 0, a.c, 0);
        Arrays.fill(a.e, -1);
        Arrays.fill(a.f, -1L);
        a.c = 0;
        this.b = 0L;
    }
    
    public final int d(final Object o, int n) {
        adkp.K(true, "occurrences cannot be negative: %s", n);
        final int d = this.a.d(o);
        if (d == -1) {
            return 0;
        }
        final int c = this.a.c(d);
        if (c > n) {
            this.a.m(d, c - n);
        }
        else {
            this.a.g(d);
            n = c;
        }
        this.b -= n;
        return c;
    }
    
    public final Iterator e() {
        return (Iterator)new afbr(this);
    }
    
    public final Iterator f() {
        return (Iterator)new afbs(this);
    }
    
    public abstract afhz g();
    
    public final boolean h(final Object o, final int n) {
        aefb.J(n, "oldCount");
        aefb.J(0, "newCount");
        final int d = this.a.d(o);
        if (d == -1) {
            return n == 0;
        }
        if (this.a.c(d) != n) {
            return false;
        }
        this.a.g(d);
        this.b -= n;
        return true;
    }
    
    public final Iterator iterator() {
        return new afhv((afhr)this, ((afhr)this).j().iterator());
    }
    
    public final int size() {
        return afwm.G(this.b);
    }
}
