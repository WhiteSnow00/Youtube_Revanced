import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import android.os.ParcelFileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhw implements dhv
{
    private final /* synthetic */ int a;
    
    public dhw(final int a) {
        this.a = a;
    }
    
    public final Class a() {
        if (this.a != 0) {
            return ParcelFileDescriptor.class;
        }
        return InputStream.class;
    }
}
