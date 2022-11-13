import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class accl extends accf
{
    public accl(final Executor executor, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(executor, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final /* bridge */ ajmo a(final Object o) {
        final alkc alkc = (alkc)o;
        ajmo ajmo;
        if ((alkc.b & 0x40) != 0x0) {
            if ((ajmo = alkc.i) == null) {
                ajmo = ajmo.a;
            }
        }
        else {
            ajmo = null;
        }
        return ajmo;
    }
}
