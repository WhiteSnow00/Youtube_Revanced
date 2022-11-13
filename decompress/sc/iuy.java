import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iuy implements trk
{
    public final iuz a;
    public final toz b;
    private final int c;
    
    public iuy(final iuz a, final toz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void b(final int n, toz b) {
        if (this.c != 0) {
            final iuz a = this.a;
            b = this.b;
            if (n == 0 && a.a == null) {
                ((TextView)b.a).setText((CharSequence)null);
            }
            return;
        }
        final iuz a2 = this.a;
        final toz b2 = this.b;
        if (n == 0 && a2.b == null) {
            ((TextView)b2.a).setText((CharSequence)null);
        }
    }
}
