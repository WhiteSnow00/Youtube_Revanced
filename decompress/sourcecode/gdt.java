import java.util.function.Consumer;
import j$.util.Optional;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdt extends AnimatorListenerAdapter
{
    final /* synthetic */ gdu a;
    
    public gdt(final gdu a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        Optional.ofNullable((Object)this.a.c).ifPresent((Consumer)fwb.p);
        this.a.d();
    }
}
