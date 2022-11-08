import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import android.content.ContentValues;
import android.database.Cursor;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aadm implements aadu
{
    private static final String[] b;
    SQLiteDatabase a;
    private final Context c;
    private final Object d;
    
    static {
        b = new String[] { "file_path", "status", "status_reason", "bytes_transferred", "bytes_total", "extras", "output_extras", "accountname", "priority", "failure_count" };
    }
    
    public aadm(final Context c) {
        final Object d = new Object();
        this.c = c;
        this.d = d;
    }
    
    private static aadh i(final Cursor cursor) {
        final int columnIndex = cursor.getColumnIndex("file_path");
        final int columnIndex2 = cursor.getColumnIndex("status");
        final int columnIndex3 = cursor.getColumnIndex("status_reason");
        final int columnIndex4 = cursor.getColumnIndex("bytes_transferred");
        final int columnIndex5 = cursor.getColumnIndex("bytes_total");
        final int columnIndex6 = cursor.getColumnIndex("extras");
        final int columnIndex7 = cursor.getColumnIndex("output_extras");
        final int columnIndex8 = cursor.getColumnIndex("accountname");
        final int columnIndex9 = cursor.getColumnIndex("priority");
        final int columnIndex10 = cursor.getColumnIndex("failure_count");
        final String string = cursor.getString(columnIndex);
        final int n = (new int[] { 1, 2, 3, 4, 5 })[cursor.getInt(columnIndex2)];
        final int int1 = cursor.getInt(columnIndex3);
        final long long1 = cursor.getLong(columnIndex4);
        final long long2 = cursor.getLong(columnIndex5);
        final zzn zzn = new zzn(cursor.getBlob(columnIndex6));
        final zzn f = new zzn(cursor.getBlob(columnIndex7));
        final String string2 = cursor.getString(columnIndex8);
        final int int2 = cursor.getInt(columnIndex9);
        final int int3 = cursor.getInt(columnIndex10);
        aadj.t((zyq)zzn);
        final aadh aadh = new aadh(string2, string, int2, (zyq)zzn, int3);
        final int n2 = n - 1;
        final aouv a = aouv.a;
        if (n != 0) {
            aouv j;
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                j = aouv.a;
                            }
                            else {
                                j = aouv.e;
                            }
                        }
                        else {
                            j = aouv.f;
                        }
                    }
                    else {
                        j = aouv.g;
                    }
                }
                else {
                    j = aouv.d;
                }
            }
            else {
                j = aouv.b;
            }
            aadh.j = j;
            aadh.b = int1;
            aadh.d = long2;
            aadh.c = long1;
            aadh.f = (zyq)f;
            return aadh;
        }
        throw null;
    }
    
    private static String j(final aadh aadh) {
        final zkh l = aadh.l;
        if (l == zkg.a) {
            return aadh.a;
        }
        return aaiw.s(l.d(), vek.i(aadh.a));
    }
    
    private static void k() {
        trn.d("[Offline] Attempting to access closed or null database.", (Throwable)new NullPointerException());
    }
    
    private static final ContentValues l(final aadh aadh) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("file_path", j(aadh));
        final aouv j = aadh.j;
        final aouv a = aouv.a;
        final int ordinal = j.ordinal();
        int n = 3;
        if (ordinal != 3) {
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        n = 1;
                    }
                }
                else {
                    n = 4;
                }
            }
            else {
                n = 5;
            }
        }
        else {
            n = 2;
        }
        contentValues.put("status", Integer.valueOf(n - 1));
        contentValues.put("status_reason", Integer.valueOf(aadh.b));
        contentValues.put("bytes_transferred", Long.valueOf(aadh.c));
        contentValues.put("bytes_total", Long.valueOf(aadh.d));
        final zyq e = aadh.e;
        if (e instanceof zzn) {
            contentValues.put("extras", ((zzn)e).r());
        }
        else if (e instanceof zyp) {
            final zyp zyp = (zyp)e;
            final zzn zzn = new zzn();
            for (final String s : Collections.unmodifiableMap((Map<? extends String, ?>)zyp.f().b.b).keySet()) {
                if (aadj.b.contains((Object)s)) {
                    aaiw.w((zyq)zyp, (zyq)zzn, s);
                }
            }
            contentValues.put("extras", zzn.r());
        }
        final zyq f = aadh.f;
        if (f instanceof zzn) {
            contentValues.put("output_extras", ((zzn)f).r());
        }
        else if (f instanceof zyp) {
            final zyp zyp2 = (zyp)f;
            final zzn zzn2 = new zzn();
            for (final String s2 : Collections.unmodifiableMap((Map<? extends String, ?>)zyp2.f().b.b).keySet()) {
                if (aadj.c.contains((Object)s2)) {
                    aaiw.w((zyq)zyp2, (zyq)zzn2, s2);
                }
            }
            contentValues.put("output_extras", zzn2.r());
        }
        contentValues.put("accountname", aadh.g);
        contentValues.put("priority", Integer.valueOf(aadh.h));
        contentValues.put("failure_count", Integer.valueOf(aadh.i));
        return contentValues;
    }
    
    public final aexq a(final String s) {
        if (this.a == null) {
            k();
            return (aexq)aewp.a;
        }
        synchronized (this.d) {
            final Cursor query = this.a.query("transfers", aadm.b, "file_path=?", new String[] { s }, (String)null, (String)null, (String)null);
            try {
                aadh i;
                if (query.moveToNext()) {
                    i = i(query);
                }
                else {
                    i = null;
                }
                query.close();
                monitorexit(this.d);
                return aexq.j(i);
            }
            finally {
                query.close();
            }
        }
    }
    
    public final List b(zkh d) {
        final String d2 = d.d();
        final ArrayList list = new ArrayList();
        if (this.a == null) {
            k();
            return list;
        }
        d = (zkh)this.d;
        monitorenter(d);
        try {
            final Cursor query = this.a.query("transfers", aadm.b, "accountname=?", new String[] { d2 }, (String)null, (String)null, (String)null);
            try {
                while (query.moveToNext()) {
                    list.add(i(query));
                }
                query.close();
                monitorexit(d);
                return list;
            }
            finally {
                query.close();
            }
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    public final void c(final aadh aadh) {
        this.f(aadh);
    }
    
    public final void d(final aadh aadh) {
        synchronized (this.d) {
            final SQLiteDatabase a = this.a;
            if (a == null) {
                k();
                return;
            }
            a.insert("transfers", (String)null, l(aadh));
        }
    }
    
    public final void e() {
        synchronized (this.d) {
            Object d = this.d;
            synchronized (d) {
                final SQLiteDatabase a = this.a;
                int n = 0;
                if (a != null) {
                    n = n;
                    if (a.isOpen()) {
                        n = 1;
                    }
                }
                monitorexit(d);
                if (n == 0) {
                    d = new aadl(this.c);
                    this.a = ((aadl)d).getWritableDatabase();
                }
            }
        }
    }
    
    public final void f(final aadh aadh) {
        this.g(j(aadh));
    }
    
    public final void g(final String s) {
        synchronized (this.d) {
            final SQLiteDatabase a = this.a;
            if (a == null) {
                k();
                return;
            }
            a.delete("transfers", "file_path = ?", new String[] { s });
        }
    }
    
    public final void h(final aadh aadh) {
        synchronized (this.d) {
            final SQLiteDatabase a = this.a;
            if (a == null) {
                k();
                return;
            }
            final ContentValues l = l(aadh);
            final String asString = l.getAsString("file_path");
            asString.getClass();
            a.update("transfers", l, "file_path = ?", new String[] { asString });
        }
    }
}
