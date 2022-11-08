import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jie extends acja
{
    acja a;
    private final FrameLayout b;
    private acja c;
    private acja d;
    private acja e;
    private acja f;
    private acja g;
    private final lht h;
    private final lht i;
    private final lht j;
    
    public jie(final Context context, final lht j, final lht h, final lht i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.j = j;
        this.h = h;
        this.i = i;
        this.b = new FrameLayout(context);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
        final acja a = this.a;
        if (a != null) {
            a.c(acir);
        }
    }
}
