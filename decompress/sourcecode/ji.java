import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ji implements ank
{
    int a;
    final /* synthetic */ jj b;
    private boolean c;
    
    protected ji(final jj b) {
        this.b = b;
        this.c = false;
    }
    
    @Override
    public final void a(final View view) {
        if (this.c) {
            return;
        }
        final jj b = this.b;
        b.f = null;
        jj.b(b, this.a);
    }
    
    @Override
    public final void b() {
        jj.d(this.b);
        this.c = false;
    }
    
    @Override
    public final void c() {
        this.c = true;
    }
    
    public final void d(final bx f, final int a) {
        this.b.f = f;
        this.a = a;
    }
}
