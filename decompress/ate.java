import android.system.Os;
import java.io.FileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ate
{
    static long a(final FileDescriptor fileDescriptor, final long n, final int n2) {
        return Os.lseek(fileDescriptor, n, n2);
    }
    
    static FileDescriptor b(final FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }
    
    static void c(final FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }
    
    public static final avt d() {
        if (avt.c == null) {
            avt.c = new avt();
        }
        final avt c = avt.c;
        c.getClass();
        return c;
    }
}
