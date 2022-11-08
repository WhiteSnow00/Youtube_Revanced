import java.util.ArrayList;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class addb
{
    public final Context a;
    public final ort b;
    public final float c;
    public nvd d;
    public final List e;
    
    public addb(final Context a, final ort b) {
        this.d = null;
        this.e = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = a.getResources().getDisplayMetrics().density;
    }
    
    public static List a(final List list, final List list2) {
        final ArrayList ak = adwd.ak();
        for (int i = 0; i < list.size(); ++i) {
            ak.add((double)list.get(i) - (double)list2.get(i));
        }
        return ak;
    }
}
