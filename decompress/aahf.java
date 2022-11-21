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

public final class aahf implements aahn
{
    private static final String[] b;
    SQLiteDatabase a;
    private final Context c;
    private final Object d;
    
    static {
        b = new String[] { "file_path", "status", "status_reason", "bytes_transferred", "bytes_total", "extras", "output_extras", "accountname", "priority", "failure_count" };
    }
    
    public aahf(final Context c) {
        final Object d = new Object();
        this.c = c;
        this.d = d;
    }
    
    private static aaha i(final Cursor cursor) {
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
        final aade aade = new aade(cursor.getBlob(columnIndex6));
        final aade f = new aade(cursor.getBlob(columnIndex7));
        final String string2 = cursor.getString(columnIndex8);
        final int int2 = cursor.getInt(columnIndex9);
        final int int3 = cursor.getInt(columnIndex10);
        aahc.t((aach)aade);
        final aaha aaha = new aaha(string2, string, int2, (aach)aade, int3);
        final int n2 = n - 1;
        final aozk a = aozk.a;
        if (n != 0) {
            aozk j;
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                j = aozk.a;
                            }
                            else {
                                j = aozk.e;
                            }
                        }
                        else {
                            j = aozk.f;
                        }
                    }
                    else {
                        j = aozk.g;
                    }
                }
                else {
                    j = aozk.d;
                }
            }
            else {
                j = aozk.b;
            }
            aaha.j = j;
            aaha.b = int1;
            aaha.d = long2;
            aaha.c = long1;
            aaha.f = (aach)f;
            return aaha;
        }
        throw null;
    }
    
    private static String j(final aaha aaha) {
        final znz l = aaha.l;
        if (l == zny.a) {
            return aaha.a;
        }
        return aamn.s(l.d(), vht.i(aaha.a));
    }
    
    private static void k() {
        tut.d("[Offline] Attempting to access closed or null database.", (Throwable)new NullPointerException());
    }
    
    private static final ContentValues l(final aaha aaha) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("file_path", j(aaha));
        final aozk j = aaha.j;
        final aozk a = aozk.a;
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
        contentValues.put("status_reason", Integer.valueOf(aaha.b));
        contentValues.put("bytes_transferred", Long.valueOf(aaha.c));
        contentValues.put("bytes_total", Long.valueOf(aaha.d));
        final aach e = aaha.e;
        if (e instanceof aade) {
            contentValues.put("extras", ((aade)e).r());
        }
        else if (e instanceof aacg) {
            final aacg aacg = (aacg)e;
            final aade aade = new aade();
            for (final String s : Collections.unmodifiableMap((Map<? extends String, ?>)aacg.f().b.b).keySet()) {
                if (aahc.b.contains(s)) {
                    aamn.w((aach)aacg, (aach)aade, s);
                }
            }
            contentValues.put("extras", aade.r());
        }
        final aach f = aaha.f;
        if (f instanceof aade) {
            contentValues.put("output_extras", ((aade)f).r());
        }
        else if (f instanceof aacg) {
            final aacg aacg2 = (aacg)f;
            final aade aade2 = new aade();
            for (final String s2 : Collections.unmodifiableMap((Map<? extends String, ?>)aacg2.f().b.b).keySet()) {
                if (aahc.c.contains(s2)) {
                    aamn.w((aach)aacg2, (aach)aade2, s2);
                }
            }
            contentValues.put("output_extras", aade2.r());
        }
        contentValues.put("accountname", aaha.g);
        contentValues.put("priority", Integer.valueOf(aaha.h));
        contentValues.put("failure_count", Integer.valueOf(aaha.i));
        return contentValues;
    }
    
    @Override
    public final afbh a(final String s) {
        if (this.a == null) {
            k();
            return afag.a;
        }
        synchronized (this.d) {
            final Cursor query = this.a.query("transfers", aahf.b, "file_path=?", new String[] { s }, (String)null, (String)null, (String)null);
            try {
                aaha i;
                if (query.moveToNext()) {
                    i = i(query);
                }
                else {
                    i = null;
                }
                query.close();
                monitorexit(this.d);
                return afbh.j(i);
            }
            finally {
                query.close();
            }
        }
    }
    
    @Override
    public final List b(znz d) {
        final String d2 = d.d();
        final ArrayList list = new ArrayList();
        if (this.a == null) {
            k();
            return list;
        }
        d = (znz)this.d;
        monitorenter(d);
        try {
            final Cursor query = this.a.query("transfers", aahf.b, "accountname=?", new String[] { d2 }, (String)null, (String)null, (String)null);
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
    
    @Override
    public final void c(final aaha aaha) {
        this.f(aaha);
    }
    
    @Override
    public final void d(final aaha aaha) {
        synchronized (this.d) {
            final SQLiteDatabase a = this.a;
            if (a == null) {
                k();
                return;
            }
            a.insert("transfers", (String)null, l(aaha));
        }
    }
    
    @Override
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
                    d = new aahe(this.c);
                    this.a = ((aahe)d).getWritableDatabase();
                }
            }
        }
    }
    
    @Override
    public final void f(final aaha aaha) {
        this.g(j(aaha));
    }
    
    @Override
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
    
    @Override
    public final void h(final aaha aaha) {
        synchronized (this.d) {
            final SQLiteDatabase a = this.a;
            if (a == null) {
                k();
                return;
            }
            final ContentValues l = l(aaha);
            final String asString = l.getAsString("file_path");
            asString.getClass();
            a.update("transfers", l, "file_path = ?", new String[] { asString });
        }
    }
}
