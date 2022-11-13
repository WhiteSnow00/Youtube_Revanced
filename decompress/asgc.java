import com.google.protobuf.MessageLite;
import java.io.OutputStream;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asgc
{
    public static volatile ExtensionRegistryLite a;
    
    static {
        asgc.a = ExtensionRegistryLite.a;
    }
    
    public static long a(final InputStream inputStream, final OutputStream outputStream) {
        outputStream.getClass();
        final byte[] array = new byte[8192];
        long n = 0L;
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            outputStream.write(array, 0, read);
            n += read;
        }
        return n;
    }
    
    public static arwm b(final MessageLite messageLite) {
        return (arwm)new asgb(messageLite);
    }
}
