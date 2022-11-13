import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class izk implements View$OnClickListener
{
    final izm a;
    private final int b;
    
    public izk(final izm a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onClick(final View view) {
        final izm a = this.a;
        final int b = this.b;
        final boolean b2 = view.isSelected() ^ true;
        a.l(b, b2);
        if (a.f) {
            if (b2) {
                final int g = a.g;
                if (b < g) {
                    a.l(g, false);
                }
                else {
                    for (int i = 0; i < a.g; ++i) {
                        a.l(i, false);
                    }
                }
            }
            a.q();
            return;
        }
        a.h();
    }
}
