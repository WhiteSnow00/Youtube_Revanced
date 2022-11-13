import java.io.ByteArrayOutputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achf implements ddr
{
    private final dge a;
    
    public achf(final dge a) {
        this.a = a;
    }
    
    @Override
    public final dfy a(final Object o, int read, final int n, final ddp ddp) {
        final InputStream inputStream = (InputStream)o;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = (byte[])this.a.a(65536, byte[].class);
        while (true) {
            read = inputStream.read(array, 0, array.length);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        byteArrayOutputStream.flush();
        ((dgn)this.a).c((Object)array);
        return new dla(byteArrayOutputStream.toByteArray(), 0);
    }
    
    @Override
    public final /* bridge */ boolean b(final Object o, final ddp ddp) {
        final InputStream inputStream = (InputStream)o;
        return true;
    }
}
