import android.graphics.drawable.Drawable;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class achi extends dnw
{
    final tcc a;
    final Uri b;
    
    public achi(final tcc a, final Uri b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Drawable drawable) {
        final tcc a = this.a;
        final Uri b = this.b;
        a.sd((Object)b, new Exception("Load failed: ".concat(String.valueOf(String.valueOf(b)))));
    }
    
    public final /* bridge */ void b(final Object o, final dol dol) {
        this.a.b((Object)this.b, (Object)o);
    }
    
    public final void lp(final Drawable drawable) {
    }
}
