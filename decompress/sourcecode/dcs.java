import java.io.IOException;
import java.io.File;
import java.io.Closeable;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcs
{
    static final Charset a;
    
    static {
        a = Charset.forName("US-ASCII");
        Charset.forName("UTF-8");
    }
    
    static void a(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {}
    }
    
    public static void b(File file) {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                file = listFiles[i];
                if (file.isDirectory()) {
                    b(file);
                }
                if (!file.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(String.valueOf(file))));
                }
            }
            return;
        }
        throw new IOException("not a readable directory: ".concat(String.valueOf(String.valueOf(file))));
    }
}
