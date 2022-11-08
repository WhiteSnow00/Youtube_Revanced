import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwz extends dxf
{
    final ArrayList a;
    public dxc b;
    public ouq c;
    public ouq d;
    public cxz e;
    ardu f;
    
    public dwz() {
        this.a = new ArrayList();
        throw null;
    }
    
    public dwz(final int n, final Object o) {
        this.a = new ArrayList();
        this.b = dxf.i;
        this.f = new ardu(n, o);
    }
    
    public final ArrayList a() {
        this.b();
        return this.a;
    }
    
    public final void b() {
        final cxz e = this.e;
        if (e == null) {
            return;
        }
        this.a.add(new dxe(new eaa(this.f, e, null, null, null, null, null, null), this.b, this.c, this.d, null, null));
        this.e = null;
        this.b = dxf.i;
        this.c = null;
        this.d = null;
    }
}
