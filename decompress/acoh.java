import java.util.List;
import java.util.Iterator;
import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acoh extends DataSetObserver
{
    final agmq a;
    
    public acoh(final agmq a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final void onChanged() {
        final agmq a = this.a;
        final anaf a2 = ((acoo)a.d).a();
        if (a2 == null) {
            a.f();
            return;
        }
        final Iterator<Object> iterator = ((List<Object>)a2.h).iterator();
        while (iterator.hasNext()) {
            agmq.K(iterator.next(), a);
        }
        a.h(a2.f ^ true);
    }
}
