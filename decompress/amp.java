import android.os.Build$VERSION;
import android.view.WindowInsets;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class amp implements View$OnApplyWindowInsetsListener
{
    aoc a;
    final View b;
    final alx c;
    
    public amp(final View b, final alx c) {
        this.b = b;
        this.c = c;
        this.a = null;
    }
    
    public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
        final aoc p2 = aoc.p(windowInsets, view);
        if (Build$VERSION.SDK_INT < 30) {
            amq.i(windowInsets, this.b);
            if (p2.equals((Object)this.a)) {
                return this.c.a(view, p2).e();
            }
        }
        this.a = p2;
        final aoc a = this.c.a(view, p2);
        if (Build$VERSION.SDK_INT >= 30) {
            return a.e();
        }
        anc.L(view);
        return a.e();
    }
}
