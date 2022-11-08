import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class cib extends cin
{
    boolean a;
    final /* synthetic */ ViewGroup b;
    
    public cib(final ViewGroup b) {
        this.b = b;
        this.a = false;
    }
    
    public final void a(final cim cim) {
        if (!this.a) {
            cja.a(this.b, false);
        }
        cim.A((cil)this);
    }
    
    public final void b() {
        cja.a(this.b, false);
        this.a = true;
    }
    
    public final void c() {
        cja.a(this.b, false);
    }
    
    public final void d() {
        cja.a(this.b, true);
    }
}
