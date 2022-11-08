import java.util.Arrays;
import java.util.Iterator;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aezv extends aezz implements Serializable
{
    private static final long serialVersionUID = 0L;
    transient affz a;
    transient long b;
    
    public aezv() {
        this.a = this.g();
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        this.a = this.g();
        for (int i = 0; i < int1; ++i) {
            ((affr)this).a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(((affr)this).j().size());
        for (final affs affs : ((affr)this).j()) {
            objectOutputStream.writeObject(affs.a);
            objectOutputStream.writeInt(affs.a());
        }
    }
    
    @Override
    public final int a(final Object o, final int n) {
        if (n == 0) {
            return this.b(o);
        }
        final boolean b = true;
        agot.x(n > 0, "occurrences cannot be negative: %s", n);
        final int d = this.a.d(o);
        if (d == -1) {
            this.a.o(o, n);
            this.b += n;
            return 0;
        }
        final int c = this.a.c(d);
        final long n2 = n;
        final long n3 = c + n2;
        agot.y(n3 <= 2147483647L && b, "too many occurrences: %s", n3);
        this.a.m(d, (int)n3);
        this.b += n2;
        return c;
    }
    
    public final int b(final Object o) {
        return this.a.b(o);
    }
    
    @Override
    public final int c() {
        return this.a.c;
    }
    
    @Override
    public final void clear() {
        final affz a = this.a;
        ++a.d;
        Arrays.fill(a.a, 0, a.c, null);
        Arrays.fill(a.b, 0, a.c, 0);
        Arrays.fill(a.e, -1);
        Arrays.fill(a.f, -1L);
        a.c = 0;
        this.b = 0L;
    }
    
    @Override
    public final int d(final Object o, int n) {
        agot.x(true, "occurrences cannot be negative: %s", n);
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
    
    @Override
    public final Iterator e() {
        return (Iterator)new aezs(this);
    }
    
    @Override
    public final Iterator f() {
        return (Iterator)new aezt(this);
    }
    
    public abstract affz g();
    
    @Override
    public final boolean h(final Object o, final int n) {
        ahbz.ay(n, "oldCount");
        ahbz.ay(0, "newCount");
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
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new affv((affr)this, (Iterator)((affr)this).j().iterator());
    }
    
    @Override
    public final int size() {
        return aesy.A(this.b);
    }
}
