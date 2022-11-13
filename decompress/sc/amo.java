import android.os.Build$VERSION;
import android.view.WindowInsets;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class amo implements View$OnApplyWindowInsetsListener
{
    aob a;
    final View b;
    final alw c;
    
    public amo(final View b, final alw c) {
        this.b = b;
        this.c = c;
        this.a = null;
    }
    
    public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
        final aob p2 = aob.p(windowInsets, view);
        if (Build$VERSION.SDK_INT < 30) {
            amp.i(windowInsets, this.b);
            if (p2.equals((Object)this.a)) {
                return this.c.a(view, p2).e();
            }
        }
        this.a = p2;
        final aob a = this.c.a(view, p2);
        if (Build$VERSION.SDK_INT >= 30) {
            return a.e();
        }
        anb.L(view);
        return a.e();
    }
}
