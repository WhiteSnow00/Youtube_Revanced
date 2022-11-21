import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class advh extends advd
{
    final advj a;
    
    public advh(final advj a) {
        this.a = a;
    }
    
    @Override
    public final void a(final View view, final float n) {
    }
    
    @Override
    public final void b(final View view, final int n) {
        if (n == 5) {
            this.a.cancel();
        }
    }
}
