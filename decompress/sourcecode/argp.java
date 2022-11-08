import com.youtube.android.libraries.elements.StatusOr;
import com.google.android.libraries.elements.interfaces.PbToFb;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argp
{
    public static final AtomicBoolean a;
    
    static {
        ogh.a();
        a = new AtomicBoolean(false);
    }
    
    public static int a(final byte[] array, final aglt aglt, final boolean b, final boolean b2) {
        final StatusOr convert = PbToFb.convert(ByteBuffer.wrap(array), argp.a.get(), b, b2);
        if (convert.hasValue) {
            aglt.ar(ByteBuffer.wrap((byte[])convert.value), aglt);
            return convert.status.getCode().value();
        }
        throw new IllegalStateException("status: ".concat(String.valueOf(String.valueOf(convert.status))));
    }
}
