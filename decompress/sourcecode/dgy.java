import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgy implements dgu
{
    private final dha a;
    
    public dgy(final Context context) {
        final dha a = new dha(context);
        this.a = a;
    }
    
    public final dgv a() {
        final dha a = this.a;
        final File cacheDir = ((Context)a.a).getCacheDir();
        File file;
        if (cacheDir == null) {
            file = null;
        }
        else {
            file = new File(cacheDir, (String)a.b);
        }
        if (file == null) {
            return null;
        }
        if (!file.isDirectory() && !file.mkdirs()) {
            return null;
        }
        return (dgv)new dgz(file);
    }
}
