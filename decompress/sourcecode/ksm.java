import java.util.Map;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksm implements fzi
{
    private final aioe a;
    private final CharSequence b;
    private final vax c;
    private final int d;
    
    public ksm(final aioe a, final CharSequence b, final vax c, final int n) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (n == 1) {
            this.d = 1;
            return;
        }
        this.d = 2;
    }
    
    public final int j() {
        return this.d;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
        final CharSequence b = this.b;
        if (b != null) {
            menuItem.setTitle(b);
        }
    }
    
    public final boolean p() {
        this.c.c(this.a, (Map)null);
        return true;
    }
    
    @Override
    public final int q() {
        return 0;
    }
    
    @Override
    public final CharSequence r() {
        return this.b;
    }
}
