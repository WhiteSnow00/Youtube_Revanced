import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ay implements ajl
{
    final Animator a;
    final dd b;
    
    public ay(final Animator a, final dd b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.a.end();
        if (cl.W(2)) {
            new StringBuilder("Animator from operation ").append(this.b);
        }
    }
}
