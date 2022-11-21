import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arnu implements arog
{
    private volatile Object a;
    private final Object b;
    private final oqz c;
    
    public arnu(final oqz c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new Object();
        this.c = c;
    }
    
    @Override
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final oqz c = this.c;
                    final atnb a = ert.a;
                    this.a = new era(new agpb((Context)c.a, (char[])null), new mba((byte[])null), (byte[])null, (byte[])null, (byte[])null);
                }
            }
        }
        return this.a;
    }
}
