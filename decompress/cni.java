import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cni
{
    public static final cni a;
    
    static {
        a = new cni();
    }
    
    private cni() {
    }
    
    public final File a(final Context context) {
        context.getClass();
        final File noBackupFilesDir = context.getNoBackupFilesDir();
        noBackupFilesDir.getClass();
        return noBackupFilesDir;
    }
}
