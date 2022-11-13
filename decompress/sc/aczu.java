// 
// Decompiled by Procyon v0.6.0
// 

public final class aczu implements acaw
{
    final boolean a;
    final Object b;
    private final int c;
    
    public aczu(final aczv b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aczu(final jri b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void m() {
    }
    
    public final void o(final boolean b) {
    }
    
    public final void oN() {
        if (this.c != 0) {
            ((jri)this.b).d.setChecked(this.a);
            return;
        }
        final aczv aczv = (aczv)this.b;
        if (aczv.e) {
            aczv.b(this.a);
            return;
        }
        aczv.f = this.a;
    }
}
