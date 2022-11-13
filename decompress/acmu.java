import java.util.List;
import java.util.Iterator;
import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmu extends DataSetObserver
{
    final agkz a;
    
    public acmu(final agkz a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final void onChanged() {
        final agkz a = this.a;
        final amya a2 = ((acnb)a.d).a();
        if (a2 == null) {
            a.f();
            return;
        }
        final Iterator<Object> iterator = ((List<Object>)a2.h).iterator();
        while (iterator.hasNext()) {
            agkz.K((aiqj)iterator.next(), a);
        }
        a.h(a2.f ^ true);
    }
}
