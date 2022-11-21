import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class adus
{
    public int a;
    public int b;
    private final View c;
    private int d;
    
    public adus(final View c) {
        this.c = c;
    }
    
    final void a() {
        final View c = this.c;
        anc.F(c, this.b - (c.getTop() - this.a));
        final View c2 = this.c;
        anc.E(c2, -(c2.getLeft() - this.d));
    }
    
    final void b() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
    }
    
    public final boolean c(final int b) {
        if (this.b != b) {
            this.b = b;
            this.a();
            return true;
        }
        return false;
    }
}
