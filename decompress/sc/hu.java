import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class hu extends anm
{
    final hv a;
    private boolean b;
    private int c;
    
    public hu(final hv a) {
        this.a = a;
        this.b = false;
        this.c = 0;
    }
    
    public final void a(final View view) {
        final int c = this.c + 1;
        this.c = c;
        if (c == this.a.a.size()) {
            final anl b = this.a.b;
            if (b != null) {
                b.a((View)null);
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }
    
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        final anl b = this.a.b;
        if (b != null) {
            b.b();
        }
    }
}
