import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acck extends accf
{
    public acck(final Executor executor, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(executor, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final /* bridge */ ajmo a(final Object o) {
        final alkh alkh = (alkh)o;
        ajmo ajmo;
        if ((alkh.h & 0x2000000) != 0x0) {
            if ((ajmo = alkh.al) == null) {
                ajmo = ajmo.a;
            }
        }
        else {
            ajmo = null;
        }
        return ajmo;
    }
}
