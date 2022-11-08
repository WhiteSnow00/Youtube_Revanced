// 
// Decompiled by Procyon v0.6.0
// 

final class fsk
{
    public fsj a;
    public boolean b;
    public fzo c;
    private boolean d;
    
    public fsk() {
        this.d = false;
        this.b = false;
    }
    
    final void a(final boolean d) {
        if (this.b) {
            if (this.d != d) {
                this.d = d;
                final fsj a = this.a;
                if (a != null) {
                    a.a(d);
                }
            }
        }
    }
    
    final void b(final fsj a) {
        if (this.a == a) {
            return;
        }
        if (a != null && this.b && this.d) {
            a.a(true);
        }
        this.a = a;
    }
    
    final void c(final fzo c) {
        final fzo c2 = this.c;
        if (c2 == c) {
            return;
        }
        if (c2 != null && c == null && !this.d) {
            c2.c();
        }
        this.c = c;
    }
}
