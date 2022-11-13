// 
// Decompiled by Procyon v0.6.0
// 

public final class gie implements ska
{
    final Object a;
    private final int b;
    
    public gie(final fbz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gie(final gif a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void l(final say v) {
        if (this.b != 0) {
            final Object a = this.a;
            final sde b = v.b();
            final fbz fbz = (fbz)a;
            fbz.a = b;
            final smq b2 = fbz.b;
            if (b2 != null) {
                ((smv)b2).a = fbz.a;
            }
            return;
        }
        if (!adkp.ae(((gif)this.a).v, v)) {
            final gif gif = (gif)this.a;
            gif.v = v;
            if (gif.z && !gif.y) {
                gif.f();
            }
        }
    }
    
    public final void m(final sba sba) {
    }
}
