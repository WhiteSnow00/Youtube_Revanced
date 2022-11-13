import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arla implements arlm
{
    private volatile Object a;
    private final Object b;
    private final pvh c;
    
    public arla(final pvh c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new Object();
        this.c = c;
    }
    
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final pvh c = this.c;
                    final atke a = err.a;
                    this.a = new eqy(new auch((Context)c.a, (char[])null), new mam((byte[])null), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                }
            }
        }
        return this.a;
    }
}
