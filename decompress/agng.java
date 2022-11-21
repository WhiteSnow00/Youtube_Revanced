import java.nio.charset.Charset;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agng
{
    public static final int a = 0;
    private static final byte b;
    private static final byte c;
    
    static {
        b = Byte.parseByte("01110000", 2);
        c = Byte.parseByte("00001111", 2);
    }
    
    public static final String a() {
        final UUID randomUUID = UUID.randomUUID();
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        final byte[] array = wrap.array();
        final byte b = array[0];
        array[16] = b;
        array[0] = (byte)((b & agng.c) | agng.b);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
