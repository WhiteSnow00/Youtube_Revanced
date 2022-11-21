import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import j$.wrapper.java.io.FileInputStreamWrapper;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.io.File;
import android.os.ParcelFileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufk implements aufm
{
    final Object a;
    private final int b;
    
    public aufk(final ParcelFileDescriptor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aufk(final File a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final FileChannel a() {
        if (this.b != 0) {
            return FileInputStreamWrapper.getChannel(new FileInputStream((File)this.a));
        }
        if (((ParcelFileDescriptor)this.a).getStatSize() != -1L) {
            return FileInputStreamWrapper.getChannel((FileInputStream)new ParcelFileDescriptor$AutoCloseInputStream((ParcelFileDescriptor)this.a));
        }
        ((ParcelFileDescriptor)this.a).close();
        final Object a = this.a;
        new StringBuilder("Not a file: ").append(a);
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(a)));
    }
}
