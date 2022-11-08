import android.view.MenuItem;
import android.view.SubMenu;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtn extends im
{
    public adtn(final Context context) {
        super(context);
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final MenuItem c = this.c(n, n2, n3, charSequence);
        final Context a = super.a;
        final io io = (io)c;
        final adty adty = new adty(a, this, io);
        io.l((jg)adty);
        return (SubMenu)adty;
    }
}
