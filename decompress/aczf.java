// 
// Decompiled by Procyon v0.6.0
// 

public final class aczf
{
    public boolean a;
    public boolean b;
    public byte c;
    
    public aczf() {
    }
    
    public aczf(final ivg ivg) {
        this.b = ivg.a;
        this.a = ivg.b;
        this.c = 7;
    }
    
    public final aczg a() {
        if (this.c != 3) {
            final StringBuilder sb = new StringBuilder();
            if ((this.c & 0x1) == 0x0) {
                sb.append(" isShortsContext");
            }
            if ((this.c & 0x2) == 0x0) {
                sb.append(" isShortsChipSelected");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new aczg(this.a, this.b);
    }
    
    public final void b(final boolean b) {
        this.b = b;
        this.c |= 0x2;
    }
    
    public final void c(final boolean a) {
        this.a = a;
        this.c |= 0x1;
    }
    
    public final void d(final boolean b) {
        this.b = b;
        this.c |= 0x4;
    }
    
    public final void e(final boolean a) {
        this.a = a;
        this.c |= 0x2;
    }
    
    public final ivg f() {
        if (this.c != 7) {
            final StringBuilder sb = new StringBuilder();
            if ((this.c & 0x1) == 0x0) {
                sb.append(" isControlsOverlayVisible");
            }
            if ((this.c & 0x2) == 0x0) {
                sb.append(" isChangeAnimated");
            }
            if ((this.c & 0x4) == 0x0) {
                sb.append(" shouldCancelHiding");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ivg(this.b, this.a);
    }
    
    public final void g(final boolean b) {
        this.b = b;
        this.c |= 0x1;
    }
    
    public final void h(final boolean a) {
        this.a = a;
        this.c |= 0x4;
    }
}
