import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

class agdq
{
    final long[] a;
    final long[] b;
    final long[] c;
    
    agdq() {
        this(new long[10], new long[10], new long[10]);
    }
    
    public agdq(final agdq agdq) {
        this.a = Arrays.copyOf(agdq.a, 10);
        this.b = Arrays.copyOf(agdq.b, 10);
        this.c = Arrays.copyOf(agdq.c, 10);
    }
    
    public agdq(final long[] a, final long[] b, final long[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    final void a(final agdq agdq, final int n) {
        agdl.a(this.a, agdq.a, n);
        agdl.a(this.b, agdq.b, n);
        agdl.a(this.c, agdq.c, n);
    }
    
    public void b(final long[] array, final long[] array2) {
        System.arraycopy(array2, 0, array, 0, 10);
    }
}
