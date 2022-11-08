import android.net.Uri;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class diy implements dij
{
    private final Context a;
    private final Class b;
    
    public diy(final Context a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    public final dii b(final din din) {
        return (dii)new dja(this.a, din.a((Class)File.class, this.b), din.a((Class)Uri.class, this.b), this.b);
    }
    
    public final void c() {
    }
}
