import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bhn implements azu
{
    protected azs b;
    protected azs c;
    public ByteBuffer d;
    private azs e;
    private azs f;
    private ByteBuffer g;
    private boolean h;
    
    public bhn() {
        final ByteBuffer a = bhn.a;
        this.g = a;
        this.d = a;
        this.e = azs.a;
        final azs a2 = azs.a;
        this.f = a2;
        this.b = a2;
        this.c = a2;
    }
    
    public final azs a(azs e) {
        this.e = e;
        this.f = this.i(e);
        if (this.g()) {
            e = this.f;
        }
        else {
            e = azs.a;
        }
        return e;
    }
    
    public ByteBuffer b() {
        final ByteBuffer d = this.d;
        this.d = bhn.a;
        return d;
    }
    
    public final void c() {
        this.d = bhn.a;
        this.h = false;
        this.b = this.e;
        this.c = this.f;
        this.k();
    }
    
    public final void d() {
        this.h = true;
        this.l();
    }
    
    public final void f() {
        this.c();
        this.g = bhn.a;
        this.e = azs.a;
        final azs a = azs.a;
        this.f = a;
        this.b = a;
        this.c = a;
        this.m();
    }
    
    public boolean g() {
        return this.f != azs.a;
    }
    
    public boolean h() {
        return this.h && this.d == bhn.a;
    }
    
    protected azs i(final azs azs) {
        throw null;
    }
    
    protected final ByteBuffer j(final int n) {
        if (this.g.capacity() < n) {
            this.g = ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
        }
        else {
            this.g.clear();
        }
        return this.d = this.g;
    }
    
    protected void k() {
    }
    
    protected void l() {
    }
    
    protected void m() {
    }
}
