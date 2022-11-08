import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aod extends afr
{
    final WindowInsetsController a;
    protected final Window b;
    
    public aod(final Window b) {
        final WindowInsetsController insetsController = b.getInsetsController();
        new abn();
        this.a = insetsController;
        this.b = b;
    }
    
    public final void b(final boolean b) {
        if (b) {
            final View decorView = this.b.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 0x2000);
            this.a.setSystemBarsAppearance(8, 8);
            return;
        }
        final View decorView2 = this.b.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & 0xFFFFDFFF);
        this.a.setSystemBarsAppearance(0, 8);
    }
    
    public final boolean c() {
        return (this.a.getSystemBarsAppearance() & 0x8) != 0x0;
    }
    
    public final void d() {
        this.a.hide(2);
    }
    
    public final void e() {
        this.a.setSystemBarsBehavior(2);
    }
}
