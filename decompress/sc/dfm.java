import android.os.Handler;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfm
{
    public final Object a;
    public final Object b;
    public final Object c;
    
    public dfm(final bia c) {
        this.c = c;
        this.b = new Handler(Looper.myLooper());
        this.a = new bhz(this, null);
    }
    
    public dfm(final qcy c, final dnr b, final dfq a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
}
