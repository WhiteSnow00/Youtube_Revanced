// 
// Decompiled by Procyon v0.6.0
// 

final class fss
{
    public fsr a;
    public boolean b;
    public fzw c;
    private boolean d;
    
    public fss() {
        this.d = false;
        this.b = false;
    }
    
    final void a(final boolean d) {
        if (this.b) {
            if (this.d != d) {
                this.d = d;
                final fsr a = this.a;
                if (a != null) {
                    a.a(d);
                }
            }
        }
    }
    
    final void b(final fsr a) {
        if (this.a == a) {
            return;
        }
        if (a != null && this.b && this.d) {
            a.a(true);
        }
        this.a = a;
    }
    
    final void c(final fzw c) {
        final fzw c2 = this.c;
        if (c2 == c) {
            return;
        }
        if (c2 != null && c == null && !this.d) {
            c2.c();
        }
        this.c = c;
    }
}
