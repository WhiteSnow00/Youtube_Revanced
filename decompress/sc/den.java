import java.io.InputStream;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class den extends ddv
{
    public den(final AssetManager assetManager, final String s) {
        super(assetManager, s);
    }
    
    public final Class a() {
        return InputStream.class;
    }
    
    protected final Object b(final AssetManager assetManager, final String s) {
        return assetManager.open(s);
    }
    
    protected final void e(final Object o) {
        ((InputStream)o).close();
    }
}
