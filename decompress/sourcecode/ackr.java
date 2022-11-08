import java.util.Iterator;
import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ackr extends DataSetObserver
{
    final /* synthetic */ agiy a;
    
    public ackr(final agiy a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final void onChanged() {
        final agiy a = this.a;
        final amvw a2 = ((acky)a.d).a();
        if (a2 == null) {
            a.f();
            return;
        }
        final Iterator<Object> iterator = a2.h.iterator();
        while (iterator.hasNext()) {
            agiy.K((aioe)iterator.next(), a);
        }
        a.h(a2.f ^ true);
    }
}
