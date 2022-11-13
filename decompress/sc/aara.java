import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aara
{
    public int a;
    public final Object b;
    
    public aara() {
        this.b = new yhs[3];
    }
    
    public aara(int n) {
        this.a = 0;
        ++n;
        this.b = new int[n + n];
    }
    
    public aara(final int a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    public aara(final String b) {
        this.b = b;
    }
    
    public aara(final tjk b) {
        this.a = 0;
        new CopyOnWriteArraySet();
        this.b = b;
    }
    
    public aara(final byte[] array) {
        this.b = new lxl(8);
    }
    
    public aara(final byte[] array, final byte[] array2) {
        this.b = new bas(8);
    }
    
    public aara(final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new Object[256];
    }
    
    final void a(final int n, final int n2) {
        final Object b = this.b;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final int[] array = (int[])b;
        array[a] = n;
        this.a = a2 + 1;
        array[a2] = n2;
    }
    
    public final yhs b(final int n) {
        final yhs[] array = (yhs[])this.b;
        yhs yhs;
        if ((yhs = array[n]) == null) {
            yhs = new yhs();
            array[n] = yhs;
        }
        return yhs;
    }
    
    public final void c(final int a) {
        synchronized (this) {
            this.a = a;
        }
    }
    
    public final boolean d() {
        return this.a == 0 || ((tjk)this.b).a() < this.a;
    }
    
    public final long e(final ltl ltl) {
        final byte[] array = (byte[])((lxl)this.b).c;
        int i = 0;
        ltl.f(array, 0, 1);
        final int n = ((byte[])((lxl)this.b).c)[0] & 0xFF;
        if (n != 0) {
            int n2;
            int n3;
            for (n2 = 128, n3 = 0; (n & n2) == 0x0; n2 >>= 1, ++n3) {}
            int n4 = n & ~n2;
            ltl.f((byte[])((lxl)this.b).c, 1, n3);
            while (i < n3) {
                final Object c = ((lxl)this.b).c;
                ++i;
                n4 = (((byte[])c)[i] & 0xFF) + (n4 << 8);
            }
            this.a += n3 + 1;
            return n4;
        }
        return Long.MIN_VALUE;
    }
    
    public final long f(final btk btk) {
        final byte[] a = ((bas)this.b).a;
        int i = 0;
        btk.j(a, 0, 1);
        final int n = ((bas)this.b).a[0] & 0xFF;
        if (n != 0) {
            int n2;
            int n3;
            for (n2 = 128, n3 = 0; (n & n2) == 0x0; n2 >>= 1, ++n3) {}
            int n4 = n & ~n2;
            btk.j(((bas)this.b).a, 1, n3);
            while (i < n3) {
                final byte[] a2 = ((bas)this.b).a;
                ++i;
                n4 = (a2[i] & 0xFF) + (n4 << 8);
            }
            this.a += n3 + 1;
            return n4;
        }
        return Long.MIN_VALUE;
    }
    
    public final Object g() {
        int a = this.a;
        if (a > 0) {
            --a;
            final Object[] array = (Object[])this.b;
            final Object o = array[a];
            array[a] = null;
            this.a = a;
            return o;
        }
        return null;
    }
    
    public final void h(final Object o) {
        final int a = this.a;
        if (a < 256) {
            ((Object[])this.b)[a] = o;
            this.a = a + 1;
        }
    }
}
