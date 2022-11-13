// 
// Decompiled by Procyon v0.6.0
// 

public class abnk
{
    public final String a;
    public final tcc b;
    final abnl c;
    private final akwz d;
    
    public abnk(final abnl c, final akwz d, final tcc b, final String a) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public void a() {
        final akwz d = this.d;
        final int c = d.c;
        final int cg = aqsx.cG(c);
        if (cg != 0) {
            if (cg == 4) {
                this.c.b(d, this.b, this.a);
                return;
            }
        }
        final int cg2 = aqsx.cG(c);
        if (cg2 != 0) {
            if (cg2 == 6) {
                this.c.b = afwm.m((Object)true);
                this.c.f();
            }
        }
        final int cg3 = aqsx.cG(this.d.c);
        if (cg3 != 0) {
            if (cg3 == 5) {
                this.c.c = true;
            }
        }
        abnm.b(this.b);
    }
    
    public final void b() {
        abnm.a(this.b, abnl.h(this.d, this.a));
    }
}
