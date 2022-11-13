// 
// Decompiled by Procyon v0.6.0
// 

final class dgb implements ddx
{
    final dgc a;
    final aln b;
    
    public dgb(final dgc a, final aln b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Object c) {
        if (this.a.e(this.b)) {
            final dgc a = this.a;
            final aln b = this.b;
            final dfi o = a.a.o;
            if (c != null && o.c(((ddy)b.b).g())) {
                a.c = c;
                ((dfd)a.b).e(2);
                return;
            }
            final dez b2 = a.b;
            final Object a2 = b.a;
            final Object b3 = b.b;
            b2.d((ddk)a2, c, (ddy)b3, ((ddy)b3).g(), (ddk)a.d);
        }
    }
    
    public final void e(final Exception ex) {
        if (this.a.e(this.b)) {
            final dgc a = this.a;
            final aln b = this.b;
            final dez b2 = a.b;
            final dey d = a.d;
            final Object b3 = b.b;
            b2.b((ddk)d, ex, (ddy)b3, ((ddy)b3).g());
        }
    }
}
