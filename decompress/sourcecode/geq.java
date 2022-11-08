import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class geq
{
    public final ged a;
    public final int b;
    public final ArrayList c;
    public final atit d;
    public final atit e;
    public int f;
    public int g;
    public geq h;
    
    public geq(final gle gle, final gfa gfa, final int b) {
        this.a = new ged(gfa, gle);
        this.b = b;
        this.f = 0;
        this.g = 0;
        this.c = new ArrayList();
        this.d = atit.aa();
        this.e = atit.aa();
    }
    
    public final void a(final ger ger) {
        this.c.remove(ger);
    }
    
    public final boolean b() {
        return !this.c.isEmpty();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[ Inline playback request");
        sb.append(": autoplayable = ".concat(this.a.b.toString()));
        final int f = this.f;
        final StringBuilder sb2 = new StringBuilder(", current state = ");
        sb2.append(f);
        sb.append(sb2.toString());
        final int g = this.g;
        final StringBuilder sb3 = new StringBuilder(", status = ");
        sb3.append(g);
        sb.append(sb3.toString());
        sb.append(", next request = ");
        sb.append(this.h);
        return sb.toString();
    }
}
