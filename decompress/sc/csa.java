import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csa implements crx
{
    public final cft a;
    public final cfq b;
    
    public csa(final cft a) {
        this.a = a;
        this.b = (cfq)new cry(a);
        new crz(a);
    }
    
    public final List a(String string) {
        final cfv a = cfv.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        a.g(1, string);
        this.a.j();
        final Cursor d = bsg.d(this.a, (cgs)a, false);
        try {
            final ArrayList list = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                if (d.isNull(0)) {
                    string = null;
                }
                else {
                    string = d.getString(0);
                }
                list.add((Object)string);
            }
            d.close();
            a.j();
            return list;
        }
        finally {
            d.close();
            a.j();
            while (true) {}
        }
    }
}
