// 
// Decompiled by Procyon v0.6.0
// 

final class agfs extends agfr
{
    private final long[] d;
    
    agfs() {
        final long[] array = new long[10];
        final long[] array2 = new long[10];
        final long[] d = new long[10];
        super(array, array2, new long[10]);
        this.d = d;
    }
    
    public agfs(final arzp arzp, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final long[] array5 = new long[10];
        final long[] array6 = new long[10];
        final long[] d = new long[10];
        super(array5, array6, new long[10]);
        this.d = d;
        final long[] a = this.a;
        final aujg aujg = (aujg)arzp.a;
        aggd.j(a, (long[])aujg.b, (long[])aujg.c);
        final long[] b = this.b;
        final aujg aujg2 = (aujg)arzp.a;
        aggd.i(b, (long[])aujg2.b, (long[])aujg2.c);
        System.arraycopy(((aujg)arzp.a).a, 0, d, 0, 10);
        aggd.b(this.c, (long[])arzp.b, agfu.b);
    }
    
    public final void b(final long[] array, final long[] array2) {
        aggd.b(array, array2, this.d);
    }
}
