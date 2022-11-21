import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ba implements ajl
{
    final View a;
    final ViewGroup b;
    final bb c;
    final dd d;
    
    public ba(final View a, final ViewGroup b, final bb c, final dd d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        ((bc)this.c).b();
        if (cl.W(2)) {
            new StringBuilder("Animation from operation ").append(this.d);
        }
    }
}
