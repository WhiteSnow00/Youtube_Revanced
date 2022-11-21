import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class bk extends bq
{
    final br a;
    
    public bk(final br a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.ab.b();
        avl.c((cgn)this.a);
        final Bundle h = this.a.h;
        Bundle bundle;
        if (h != null) {
            bundle = h.getBundle("registryState");
        }
        else {
            bundle = null;
        }
        this.a.ab.c(bundle);
    }
}
