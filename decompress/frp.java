import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frp extends accf
{
    public frp(final Executor executor, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(executor, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final /* bridge */ ajmo a(final Object o) {
        final apkb apkb = (apkb)o;
        ajmo ajmo;
        if ((apkb.b & 0x200) != 0x0) {
            if ((ajmo = apkb.n) == null) {
                ajmo = ajmo.a;
            }
        }
        else {
            ajmo = null;
        }
        return ajmo;
    }
}
