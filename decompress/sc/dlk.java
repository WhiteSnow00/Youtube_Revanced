import java.io.IOException;
import android.util.Log;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlk implements dds
{
    public final /* bridge */ boolean a(final Object o, final File file, final ddp ddp) {
        final dlj dlj = (dlj)((dfy)o).c();
        boolean b;
        try {
            dou.e(dlj.b(), file);
            b = true;
        }
        catch (final IOException ex) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", (Throwable)ex);
            }
            b = false;
        }
        return b;
    }
    
    public final int b() {
        return 1;
    }
}
