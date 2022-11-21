import android.view.MenuItem;
import android.view.SubMenu;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxg extends in
{
    public adxg(final Context context) {
        super(context);
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final MenuItem c = this.c(n, n2, n3, charSequence);
        final Context a = super.a;
        final ip ip = (ip)c;
        final adxr adxr = new adxr(a, this, ip);
        ip.l((jh)adxr);
        return (SubMenu)adxr;
    }
}
