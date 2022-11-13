import android.database.Cursor;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csp extends csr
{
    final cof a;
    
    public csp(final cof a) {
        this.a = a;
    }
    
    public final Object a() {
        final cri w = this.a.d.w();
        final cfv a = cfv.a("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        a.g(1, "BACKGROUND_HOME_PREFETCH");
        final crw crw = (crw)w;
        crw.a.j();
        crw.a.k();
        try {
            final Cursor d = bsg.d(((crw)w).a, (cgs)a, true);
            try {
                final abh abh = new abh();
                final abh abh2 = new abh();
                while (d.moveToNext()) {
                    final String string = d.getString(0);
                    if (abh.get((Object)string) == null) {
                        abh.put((Object)string, (Object)new ArrayList());
                    }
                    final String string2 = d.getString(0);
                    if (abh2.get((Object)string2) == null) {
                        abh2.put((Object)string2, (Object)new ArrayList());
                    }
                }
                d.moveToPosition(-1);
                ((crw)w).m(abh);
                ((crw)w).l(abh2);
                final ArrayList list = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    final boolean null = d.isNull(0);
                    byte[] blob = null;
                    String string3;
                    if (null) {
                        string3 = null;
                    }
                    else {
                        string3 = d.getString(0);
                    }
                    final int g = chu.g(d.getInt(1));
                    if (!d.isNull(2)) {
                        blob = d.getBlob(2);
                    }
                    final cmi a2 = cmi.a(blob);
                    final int int1 = d.getInt(3);
                    final int int2 = d.getInt(4);
                    ArrayList list2;
                    if ((list2 = (ArrayList)abh.get((Object)d.getString(0))) == null) {
                        list2 = new ArrayList();
                    }
                    ArrayList list3;
                    if ((list3 = (ArrayList)abh2.get((Object)d.getString(0))) == null) {
                        list3 = new ArrayList();
                    }
                    list.add((Object)new crg(string3, g, a2, int1, int2, (List)list2, (List)list3));
                }
                ((crw)w).a.n();
                d.close();
                a.j();
                crw.a.l();
                return crh.b.a((Object)list);
            }
            finally {
                d.close();
                a.j();
            }
        }
        finally {
            crw.a.l();
            while (true) {}
        }
    }
}
