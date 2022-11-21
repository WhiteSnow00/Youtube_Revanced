import java.util.Arrays;
import java.util.Iterator;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afdm extends afdq implements Serializable
{
    private static final long serialVersionUID = 0L;
    transient afjp a;
    transient long b;
    
    public afdm() {
        this.a = this.g();
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        this.a = this.g();
        for (int i = 0; i < int1; ++i) {
            this.a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.j().size());
        for (final afji afji : this.j()) {
            objectOutputStream.writeObject(afji.a);
            objectOutputStream.writeInt(afji.a());
        }
    }
    
    @Override
    public final int a(final Object o, final int n) {
        if (n == 0) {
            return this.b(o);
        }
        final boolean b = true;
        adme.N(n > 0, "occurrences cannot be negative: %s", n);
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
        adme.O(n4 <= 2147483647L && b, "too many occurrences: %s", n4);
        this.a.m(d, (int)n4);
        this.b += n3;
        return c;
    }
    
    @Override
    public final int b(final Object o) {
        return this.a.b(o);
    }
    
    @Override
    public final int c() {
        return this.a.c;
    }
    
    @Override
    public final void clear() {
        final afjp a = this.a;
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
        adme.N(true, "occurrences cannot be negative: %s", n);
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
        return new afdj(this);
    }
    
    @Override
    public final Iterator f() {
        return new afdk(this);
    }
    
    public abstract afjp g();
    
    @Override
    public final boolean h(final Object o, final int n) {
        adzw.H(n, "oldCount");
        adzw.H(0, "newCount");
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
        return new afjl(this, this.j().iterator());
    }
    
    @Override
    public final int size() {
        return afxr.F(this.b);
    }
}
