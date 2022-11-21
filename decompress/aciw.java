import android.graphics.drawable.Drawable;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class aciw extends dnz
{
    final tdg a;
    final Uri b;
    
    public aciw(final tdg a, final Uri b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Drawable drawable) {
        final tdg a = this.a;
        final Uri b = this.b;
        a.c((Object)b, new Exception("Load failed: ".concat(String.valueOf(String.valueOf(b)))));
    }
    
    public final /* bridge */ void b(final Object o, final doo doo) {
        this.a.d((Object)this.b, (Object)o);
    }
    
    public final void lp(final Drawable drawable) {
    }
}
