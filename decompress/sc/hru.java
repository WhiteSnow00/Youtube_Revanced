import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class hru implements afva
{
    final int a;
    final boolean b;
    final boolean c;
    final hrx d;
    final agmc e;
    
    public hru(final hrx d, final agmc e, final int a, final boolean b, final boolean c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ void b(final Object o) {
        final Optional optional = (Optional)o;
        if (!this.d.i) {
            if (!optional.isEmpty()) {
                final long d = this.d.c.d();
                final hrx d2 = this.d;
                final long b = d2.b;
                final aiqj aiqj = (aiqj)optional.get();
                final agmc e = this.e;
                final int a = this.a;
                final boolean b2 = this.b;
                d2.g(b, aiqj, e, 2, 1, a, b2, b2, this.c, d);
            }
        }
    }
    
    public final void rF(final Throwable t) {
        hko.L(zll.a, zlk.x, "Skipping prefetch: ".concat(String.valueOf(t.getMessage())));
    }
}
