// 
// Decompiled by Procyon v0.6.0
// 

public final class aauq implements aass
{
    public final aasb a;
    private final int b;
    
    public aauq(final aapr a, final int b) {
        this.b = b;
        this.a = (aasb)a;
    }
    
    public aauq(final aaur a, final int b) {
        this.b = b;
        this.a = (aasb)a;
    }
    
    public final void a(final float g, final float n) {
        if (this.b != 0) {
            ((aapi)this.a).sZ(g + 2.0f, n + 1.0f, 1.0f);
            return;
        }
        final aaur aaur = (aaur)this.a;
        ((aapi)aaur.a).k((g - aaur.g) / 2.0f, 0.0f, 0.0f);
        aaur.g = g;
        aaur.b();
    }
}
