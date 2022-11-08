import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhl implements dij, dhk
{
    private final AssetManager a;
    private final /* synthetic */ int b;
    
    public dhl(final AssetManager a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ddx a(final AssetManager assetManager, final String s) {
        if (this.b != 0) {
            return (ddx)new dee(assetManager, s);
        }
        return (ddx)new dem(assetManager, s);
    }
    
    public final dii b(final din din) {
        if (this.b != 0) {
            return (dii)new dip(this.a, (dhk)this, 1);
        }
        return (dii)new dip(this.a, (dhk)this, 1);
    }
    
    public final void c() {
    }
}
