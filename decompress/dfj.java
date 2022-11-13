// 
// Decompiled by Procyon v0.6.0
// 

public final class dfj implements dpk
{
    final Object a;
    private final int b;
    
    public dfj(final agoe a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public dfj(final dfk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        if (this.b != 0) {
            final agoe agoe = (agoe)this.a;
            return new dfd((dfl)agoe.c, (akr)agoe.a);
        }
        final dfk dfk = (dfk)this.a;
        return new dfq(dfk.a, dfk.b, dfk.c, dfk.e, dfk.f, dfk.d, null, null, null, null, null);
    }
}
