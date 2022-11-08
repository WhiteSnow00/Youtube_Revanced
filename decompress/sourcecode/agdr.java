// 
// Decompiled by Procyon v0.6.0
// 

final class agdr extends agdq
{
    private final long[] d;
    
    agdr() {
        final long[] array = new long[10];
        final long[] array2 = new long[10];
        final long[] d = new long[10];
        super(array, array2, new long[10]);
        this.d = d;
    }
    
    public agdr(final aseo aseo, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final long[] array5 = new long[10];
        final long[] array6 = new long[10];
        final long[] d = new long[10];
        super(array5, array6, new long[10]);
        this.d = d;
        final long[] a = this.a;
        final auip auip = (auip)aseo.b;
        agec.j(a, (long[])auip.b, (long[])auip.c);
        final long[] b = this.b;
        final auip auip2 = (auip)aseo.b;
        agec.i(b, (long[])auip2.b, (long[])auip2.c);
        System.arraycopy(((auip)aseo.b).a, 0, d, 0, 10);
        agec.b(this.c, (long[])aseo.a, agdt.b);
    }
    
    public final void b(final long[] array, final long[] array2) {
        agec.b(array, array2, this.d);
    }
}
