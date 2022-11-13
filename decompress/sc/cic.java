import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class cic extends cio
{
    boolean a;
    final ViewGroup b;
    
    public cic(final ViewGroup b) {
        this.b = b;
        this.a = false;
    }
    
    public final void a(final cin cin) {
        if (!this.a) {
            cjb.a(this.b, false);
        }
        cin.A((cim)this);
    }
    
    public final void b() {
        cjb.a(this.b, false);
        this.a = true;
    }
    
    public final void c() {
        cjb.a(this.b, false);
    }
    
    public final void d() {
        cjb.a(this.b, true);
    }
}
