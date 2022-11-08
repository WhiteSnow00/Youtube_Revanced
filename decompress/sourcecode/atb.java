import android.system.Os;
import java.io.FileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atb
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
    
    public static avo d(final avq avq, final Class clazz) {
        return avq.a(clazz);
    }
}
