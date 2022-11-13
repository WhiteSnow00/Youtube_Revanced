import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import android.os.ParcelFileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhx implements dhw
{
    private final int a;
    
    public dhx(final int a) {
        this.a = a;
    }
    
    @Override
    public final Class a() {
        if (this.a != 0) {
            return ParcelFileDescriptor.class;
        }
        return InputStream.class;
    }
    
    @Override
    public final Object b(final File file) {
        if (this.a != 0) {
            return ParcelFileDescriptor.open(file, 268435456);
        }
        return new FileInputStream(file);
    }
    
    @Override
    public final void c(final Object o) {
        if (this.a != 0) {
            ((ParcelFileDescriptor)o).close();
            return;
        }
        ((InputStream)o).close();
    }
}
