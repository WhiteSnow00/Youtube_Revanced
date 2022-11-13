import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvt implements acvo
{
    final apny a;
    final amrl b;
    final hmw c;
    
    public fvt(final hmw c, final apny a, final amrl b, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final /* bridge */ void a(final Object o, final int n) {
        final acwd acwd = (acwd)o;
    }
    
    public final /* bridge */ void mv(final Object o) {
        final acwd acwd = (acwd)o;
        ((wyw)this.c.c).t((wzz)new wyt(this.a.d), (alhi)null);
        ((wyw)this.c.c).t((wzz)new wyt(this.b.e), (alhi)null);
        final hmw c = this.c;
        final SharedPreferences$Editor edit = ((SharedPreferences)c.b).edit();
        edit.putLong("video_quality_promo_last_displayed", ((oby)c.e).c());
        edit.apply();
    }
}
