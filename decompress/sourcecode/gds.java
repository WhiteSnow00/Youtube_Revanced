import java.util.function.Consumer;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.view.View;
import java.util.function.Function;
import j$.util.Optional;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gds extends AnimatorListenerAdapter
{
    final /* synthetic */ gdu a;
    
    public gds(final gdu a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final gdu a = this.a;
        final FloatingActionButton c = a.c;
        final Object orElse = Optional.ofNullable((Object)a.d).map((Function)fwc.p).orElse((Object)null);
        final gdu a2 = this.a;
        final wwv j = a2.j;
        if (c != null && j != null && a2.e == null && orElse instanceof aivu) {
            final aivu aivu = (aivu)orElse;
            if ((aivu.b & 0x40) != 0x0) {
                aivt aivt;
                if ((aivt = aivu.g) == null) {
                    aivt = aivt.a;
                }
                ajzl a3;
                if (aivt.b == 102716411) {
                    a3 = (ajzl)aivt.c;
                }
                else {
                    a3 = ajzl.a;
                }
                this.a.b.b(a3, (View)c, orElse, j);
            }
        }
        this.a.d();
    }
    
    public final void onAnimationStart(final Animator animator) {
        Optional.ofNullable((Object)this.a.c).ifPresent((Consumer)fwb.o);
    }
}
