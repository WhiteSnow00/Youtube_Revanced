import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhm implements dik, dhl
{
    private final AssetManager a;
    private final int b;
    
    public dhm(final AssetManager a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ddy a(final AssetManager assetManager, final String s) {
        if (this.b != 0) {
            return (ddy)new def(assetManager, s);
        }
        return (ddy)new den(assetManager, s);
    }
    
    @Override
    public final dij b(final dio dio) {
        if (this.b != 0) {
            return new diq(this.a, this, 1);
        }
        return new diq(this.a, this, 1);
    }
    
    @Override
    public final void c() {
    }
}
