import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doh implements dol
{
    private final int a;
    
    public doh(final int a) {
        this.a = a;
    }
    
    public final /* bridge */ boolean a(Object o, final dok dok) {
        final Drawable drawable = (Drawable)o;
        Object j;
        if ((j = dok.j()) == null) {
            j = new ColorDrawable(0);
        }
        o = new TransitionDrawable(new Drawable[] { (Drawable)j, drawable });
        ((TransitionDrawable)o).setCrossFadeEnabled(true);
        ((TransitionDrawable)o).startTransition(this.a);
        dok.n((Drawable)o);
        return true;
    }
}
