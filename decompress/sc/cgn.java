import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgn
{
    public final int a;
    public cfo b;
    public final cfu c;
    public final String d;
    public final String e;
    
    public cgn(final int a) {
        this.a = a;
    }
    
    public cgn(final cfo b, final cfu c, final String d, final String e) {
        this(c.a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static final void a(final String s) {
        if (!s.equalsIgnoreCase(":memory:")) {
            int n = s.length() - 1;
            int i = 0;
            boolean b = false;
            while (i <= n) {
                int n2;
                if (!b) {
                    n2 = i;
                }
                else {
                    n2 = n;
                }
                final int a = atoc.a((int)s.charAt(n2), 32);
                if (!b) {
                    if (a > 0) {
                        b = true;
                    }
                    else {
                        ++i;
                    }
                }
                else {
                    if (a > 0) {
                        break;
                    }
                    --n;
                }
            }
            if (s.subSequence(i, n + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(s));
                try {
                    SQLiteDatabase.deleteDatabase(new File(s));
                }
                catch (final Exception ex) {
                    Log.w("SupportSQLite", "delete failed: ", (Throwable)ex);
                }
            }
        }
    }
    
    public final void b(final cgm cgm, final int n, final int n2) {
        final cfo b = this.b;
        if (b != null) {
            final avu n3 = b.n;
            Object a = null;
            Label_0279: {
                if (n != n2) {
                    final boolean b2 = n2 > n;
                    final ArrayList list = new ArrayList<Object>();
                    int intValue = n;
                Label_0271:
                    while (true) {
                        boolean b3;
                        do {
                            Label_0077: {
                                if (b2) {
                                    if (intValue >= n2) {
                                        break Label_0077;
                                    }
                                }
                                else if (intValue <= n2) {
                                    break Label_0077;
                                }
                                final TreeMap treeMap = ((Map<K, TreeMap>)n3.a).get(intValue);
                                if (treeMap == null) {
                                    a = null;
                                    break Label_0279;
                                }
                                Set set;
                                if (b2) {
                                    set = treeMap.descendingKeySet();
                                }
                                else {
                                    set = treeMap.keySet();
                                }
                                for (final Integer n4 : set) {
                                    if (b2) {
                                        n4.getClass();
                                        final int intValue2 = n4;
                                        if (intValue + 1 > intValue2 || intValue2 > n2) {
                                            continue;
                                        }
                                    }
                                    else {
                                        n4.getClass();
                                        final int intValue3 = n4;
                                        if (n2 > intValue3 || intValue3 >= intValue) {
                                            continue;
                                        }
                                    }
                                    final Object value = treeMap.get(n4);
                                    value.getClass();
                                    list.add(value);
                                    intValue = n4;
                                    b3 = true;
                                    continue Label_0271;
                                }
                                b3 = false;
                                continue;
                            }
                            a = list;
                            break Label_0279;
                        } while (b3);
                        continue;
                    }
                }
                a = atlc.a;
            }
            if (a != null) {
                this.c.d(cgm);
                final Iterator iterator2 = ((Iterable)a).iterator();
                while (iterator2.hasNext()) {
                    ((cfz)iterator2.next()).a(cgm);
                }
                final fwv f = this.c.f(cgm);
                if (f.a) {
                    this.c(cgm);
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(f.b)));
            }
        }
        final cfo b4 = this.b;
        if (b4 != null && ((n > n2 && b4.i) || !b4.h || b4.j.contains(n))) {
            this.c.b(cgm);
            this.c.a(cgm);
            return;
        }
        final StringBuilder sb = new StringBuilder("A migration from ");
        sb.append(n);
        sb.append(" to ");
        sb.append(n2);
        sb.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void c(final cgm cgm) {
        cgm.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        final String d = this.d;
        final StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(d);
        sb.append("')");
        cgm.g(sb.toString());
    }
}
