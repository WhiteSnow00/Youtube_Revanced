import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aril implements arix
{
    private volatile Object a;
    private final Object b;
    private final qpt c;
    
    public aril(final qpt c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = new Object();
        this.c = c;
    }
    
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final qpt c = this.c;
                    final atjj a = ero.a;
                    this.a = new eqv(new aeby((Context)c.a, (short[])null), new lzh((byte[])null), (byte[])null, (byte[])null, (byte[])null);
                }
            }
        }
        return this.a;
    }
}
