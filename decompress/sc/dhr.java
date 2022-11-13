import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhr implements ddc
{
    @Override
    public final /* bridge */ boolean a(final Object o, final File file, final ddp ddp) {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        boolean b;
        try {
            dou.e(byteBuffer, file);
            b = true;
        }
        catch (final IOException ex) {
            b = false;
        }
        return b;
    }
}
