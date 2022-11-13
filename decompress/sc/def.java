import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class def extends ddv
{
    public def(final AssetManager assetManager, final String s) {
        super(assetManager, s);
    }
    
    public final Class a() {
        return AssetFileDescriptor.class;
    }
    
    protected final Object b(final AssetManager assetManager, final String s) {
        return assetManager.openFd(s);
    }
    
    protected final void e(final Object o) {
        ((AssetFileDescriptor)o).close();
    }
}
