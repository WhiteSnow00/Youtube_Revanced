import java.util.NoSuchElementException;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixx
{
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;
    
    public ixx() {
        this.a = 8;
        this.b = 8;
        this.c = 8;
        this.d = 0;
        this.e = null;
    }
    
    public ixx(final ak ak) {
        this.e = new ArrayList();
        this.c = ak.w;
        this.d = ak.x;
        this.a = ak.h();
        this.b = ak.d();
        final ArrayList q = ak.q;
        for (int size = q.size(), i = 0; i < size; ++i) {
            ((ArrayList<aeud>)this.e).add(new aeud((aj)q.get(i)));
        }
    }
    
    public ixx(final byte[] array) {
        this.c = 0;
        this.b = 3;
    }
    
    public ixx(final byte[] array, final byte[] array2) {
        this.b = 0;
        this.c = -1;
        this.a = 0;
        final int[] e = new int[16];
        this.e = e;
        this.d = e.length - 1;
    }
    
    public final ixy a() {
        return new ixy(this);
    }
    
    public final void b() {
        this.a = 0;
    }
    
    public final int c() {
        final int a = this.a;
        if (a != 0) {
            final Object e = this.e;
            final int b = this.b;
            final int n = ((int[])e)[b];
            this.b = (b + 1 & this.d);
            this.a = a - 1;
            return n;
        }
        throw new NoSuchElementException();
    }
    
    public final void d(final int n) {
        final int a = this.a;
        final Object e = this.e;
        final int length = ((int[])e).length;
        Object e2 = e;
        if (a == length) {
            final int n2 = length + length;
            if (n2 < 0) {
                throw new IllegalStateException();
            }
            e2 = new int[n2];
            final int b = this.b;
            final int n3 = length - b;
            System.arraycopy(e, b, e2, 0, n3);
            System.arraycopy(this.e, 0, e2, n3, b);
            this.b = 0;
            this.c = this.a - 1;
            this.e = e2;
            this.d = ((int[])e2).length - 1;
        }
        final int c = this.c + 1 & this.d;
        this.c = c;
        ((int[])e2)[c] = n;
        ++this.a;
    }
    
    public final void e() {
        this.b = 0;
        this.c = -1;
        this.a = 0;
    }
    
    public final boolean f() {
        return this.a == 0;
    }
}
