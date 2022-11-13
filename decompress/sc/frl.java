import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frl extends accf
{
    public frl(final Executor executor, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(executor, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final /* bridge */ ajmo a(final Object o) {
        final ajzr ajzr = (ajzr)o;
        ajmo ajmo;
        if ((ajzr.c & 0x20000) != 0x0) {
            if ((ajmo = ajzr.aa) == null) {
                ajmo = ajmo.a;
            }
        }
        else {
            ajmo = null;
        }
        return ajmo;
    }
}
