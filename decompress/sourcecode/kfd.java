import java.util.Iterator;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfd extends acja
{
    public final RecyclerView a;
    final acjb b;
    public final alm c;
    private final Context d;
    private ajzx e;
    private acip f;
    private acip g;
    private final achw h;
    private final aeby i;
    
    public kfd(final Context d, final alm c, final aeby i, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = d;
        (this.a = (RecyclerView)LayoutInflater.from(d).inflate(2131624521, viewGroup, false)).af((nw)new kfc());
        this.c = c;
        this.i = i;
        this.b = new acjb();
        this.h = new achw();
    }
    
    private final int f(final ahzg ahzg, final aoqe aoqe) {
        final int orElse = tmy.ct(this.d, 2130970859).orElse(0);
        if (aoqe != null && (aoqe.b & 0x4) != 0x0) {
            final Context d = this.d;
            aoqb aoqb;
            if ((aoqb = aoqb.b(aoqe.e)) == null) {
                aoqb = aoqb.a;
            }
            return actf.a(d, aoqb, orElse);
        }
        if (ahzg != null) {
            return ahzg.c;
        }
        return orElse;
    }
    
    public final View a() {
        return (View)this.a;
    }
    
    public final void c(final acir acir) {
        ((tdv)this.b).clear();
        tmy.v((View)this.a, false);
    }
}
