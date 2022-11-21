import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.ArrayList;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class cka extends AnimatorListenerAdapter
{
    final cke a;
    
    public cka(final cke a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final ArrayList list = new ArrayList(this.a.c);
        for (int size = list.size(), i = 0; i < size; ++i) {
            ((cjy)list.get(i)).b(this.a);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        final ArrayList list = new ArrayList(this.a.c);
        for (int size = list.size(), i = 0; i < size; ++i) {
            ((cjy)list.get(i)).c(this.a);
        }
    }
}
