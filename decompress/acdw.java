import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acdw extends acdr
{
    public acdw(final Executor executor, final aefs aefs, final byte[] array, final byte[] array2, final byte[] array3) {
        super(executor, aefs, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final /* bridge */ ajon a(final Object o) {
        final almh almh = (almh)o;
        ajon ajon;
        if ((almh.h & 0x2000000) != 0x0) {
            if ((ajon = almh.al) == null) {
                ajon = ajon.a;
            }
        }
        else {
            ajon = null;
        }
        return ajon;
    }
}
