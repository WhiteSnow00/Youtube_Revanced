import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class accx extends accf
{
    public accx(final Executor executor, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(executor, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final /* bridge */ ajmo a(final Object o) {
        final anuv anuv = (anuv)o;
        if (!anuv.ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
            return null;
        }
        return (ajmo)anuv.rx((ahaq)ElementRendererOuterClass.elementRenderer);
    }
}
