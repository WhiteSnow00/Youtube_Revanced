import android.support.v7.widget.RecyclerView;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class jvl extends iw
{
    public final Set a;
    
    public jvl() {
        this.a = new HashSet();
    }
    
    public final void d(final RecyclerView recyclerView) {
        this.a.add(recyclerView);
    }
}