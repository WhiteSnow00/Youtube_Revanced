import android.graphics.drawable.Drawable;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class acfe extends dnv
{
    final /* synthetic */ szx a;
    final /* synthetic */ Uri b;
    
    public acfe(final szx a, final Uri b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Drawable drawable) {
        final szx a = this.a;
        final Uri b = this.b;
        a.rX((Object)b, new Exception("Load failed: ".concat(String.valueOf(String.valueOf(b)))));
    }
    
    public final void lp(final Drawable drawable) {
    }
}
