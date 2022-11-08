import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import j$.wrapper.java.io.FileInputStreamWrapper;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.io.File;
import android.os.ParcelFileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubw implements auby
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public aubw(final ParcelFileDescriptor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aubw(final File a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final FileChannel a() {
        if (this.b != 0) {
            return FileInputStreamWrapper.getChannel(new FileInputStream((File)this.a));
        }
        if (((ParcelFileDescriptor)this.a).getStatSize() != -1L) {
            return FileInputStreamWrapper.getChannel((FileInputStream)new ParcelFileDescriptor$AutoCloseInputStream((ParcelFileDescriptor)this.a));
        }
        ((ParcelFileDescriptor)this.a).close();
        final StringBuilder sb = new StringBuilder("Not a file: ");
        final Object a = this.a;
        sb.append(a);
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(a)));
    }
}
