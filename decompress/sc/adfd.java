import java.util.ArrayList;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class adfd
{
    public final Context a;
    public final otc b;
    public final float c;
    public nwj d;
    public final List e;
    
    public adfd(final Context a, final otc b) {
        this.d = null;
        this.e = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = a.getResources().getDisplayMetrics().density;
    }
    
    public static List a(final List list, final List list2) {
        final ArrayList o = agpi.O();
        for (int i = 0; i < list.size(); ++i) {
            o.add((double)list.get(i) - (double)list2.get(i));
        }
        return o;
    }
}
