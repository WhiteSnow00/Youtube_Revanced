import java.io.ByteArrayOutputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acit implements ddu
{
    private final dgi a;
    
    public acit(final dgi a) {
        this.a = a;
    }
    
    public final dgc a(final Object o, int read, final int n, final dds dds) {
        final InputStream inputStream = (InputStream)o;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = (byte[])this.a.a(65536, (Class)byte[].class);
        while (true) {
            read = inputStream.read(array, 0, array.length);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        byteArrayOutputStream.flush();
        ((dgr)this.a).c((Object)array);
        return (dgc)new dle(byteArrayOutputStream.toByteArray(), 0);
    }
    
    public final /* bridge */ boolean b(final Object o, final dds dds) {
        final InputStream inputStream = (InputStream)o;
        return true;
    }
}
