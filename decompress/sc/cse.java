import java.util.Iterator;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cse extends csf
{
    final cof a;
    final String b;
    final boolean c;
    
    public cse(final cof a, final String b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        final WorkDatabase d = this.a.d;
        ((cft)d).k();
        try {
            final cri w = d.w();
            final String b = this.b;
            Object a = cfv.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (b == null) {
                ((cfv)a).f(1);
            }
            else {
                ((cfv)a).g(1, b);
            }
            ((crw)w).a.j();
            final Cursor d2 = bsg.d(((crw)w).a, (cgs)a, false);
            try {
                final ArrayList list = new ArrayList(d2.getCount());
                while (d2.moveToNext()) {
                    Object string;
                    if (d2.isNull(0)) {
                        string = null;
                    }
                    else {
                        string = d2.getString(0);
                    }
                    list.add(string);
                }
                d2.close();
                ((cfv)a).j();
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    a = iterator.next();
                    c(this.a, (String)a);
                }
                ((cft)d).n();
                ((cft)d).l();
                if (this.c) {
                    d(this.a);
                }
            }
            finally {
                d2.close();
                ((cfv)a).j();
            }
        }
        finally {
            ((cft)d).l();
            while (true) {}
        }
    }
}
