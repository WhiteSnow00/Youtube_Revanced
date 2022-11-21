import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acdx extends acdr
{
    public acdx(final Executor executor, final aefs aefs, final byte[] array, final byte[] array2, final byte[] array3) {
        super(executor, aefs, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final /* bridge */ ajon a(final Object o) {
        final almc almc = (almc)o;
        ajon ajon;
        if ((almc.b & 0x40) != 0x0) {
            if ((ajon = almc.i) == null) {
                ajon = ajon.a;
            }
        }
        else {
            ajon = null;
        }
        return ajon;
    }
}
