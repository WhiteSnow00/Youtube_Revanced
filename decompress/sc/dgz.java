import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgz implements dgv
{
    private final dhb a;
    
    public dgz(final Context context) {
        final dhb a = new dhb(context);
        this.a = a;
    }
    
    @Override
    public final dgw a() {
        final dhb a = this.a;
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
        return new dha(file);
    }
}
