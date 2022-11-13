// 
// Decompiled by Procyon v0.6.0
// 

final class ekl implements ekm
{
    private final String a;
    private final int b;
    private final hyx c;
    
    public ekl(final hyx c, final String a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final hyx a(final eka eka) {
        final int b = this.b;
        if (b == 0) {
            final hyx k = this.c.K();
            k.z(this.a, eka);
            return k;
        }
        if (b != 1) {
            this.c.z(this.a, eka);
            return this.c;
        }
        final hyx i = this.c.K();
        i.A(this.a, eka);
        return i;
    }
}
