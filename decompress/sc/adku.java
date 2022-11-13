import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import java.util.concurrent.TimeUnit;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.concurrent.ConcurrentHashMap;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adku
{
    public final Map a;
    private final Context b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;
    private SQLiteDatabase e;
    private final adet f;
    
    public adku(final Context b, final ScheduledExecutorService c, adet f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        f = new adet(f, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.c = c;
        this.f = f;
        this.a = (Map)new ConcurrentHashMap();
    }
    
    private final admv j(final String s, final byte[] array, final int n) {
        final adet f = this.f;
        Object o = null;
        Object o2;
        try {
            final admv admv = (admv)ahbh.parseFrom((ahbh)admv.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            o2 = o;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        o2 = o;
                    }
                    else {
                        o2 = admv;
                    }
                }
                else {
                    final ahaz builder = ((ahbh)admv).toBuilder();
                    if (((admv)builder.instance).Y) {
                        o2 = builder.build();
                    }
                    else {
                        builder.copyOnWrite();
                        admv.a((admv)builder.instance);
                        final admv admv2 = (admv)builder.instance;
                        Label_1629: {
                            if (!admv2.aj) {
                                if (admv2.ai) {
                                    o = admv2.am;
                                    adms a;
                                    if ((a = (adms)o) == null) {
                                        a = adms.a;
                                    }
                                    final int i = adkp.i(a.c);
                                    if (i != 0) {
                                        if (i == 2) {
                                            o = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            final admv admv3 = (admv)builder.instance;
                                            o.getClass();
                                            admv3.ar = (adms)o;
                                            admv3.d |= 0x10;
                                            final adms s2 = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            o = builder.instance;
                                            s2.getClass();
                                            ((admv)o).S = s2;
                                            ((admv)o).c |= 0x4000;
                                            o = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            final admv admv4 = (admv)builder.instance;
                                            o.getClass();
                                            admv4.ae = (adms)o;
                                            admv4.c |= 0x800000;
                                            final adms s3 = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            o = builder.instance;
                                            s3.getClass();
                                            ((admv)o).C = s3;
                                            ((admv)o).b |= 0x40000000;
                                            final adms s4 = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            o = builder.instance;
                                            s4.getClass();
                                            ((admv)o).ag = s4;
                                            ((admv)o).c |= 0x2000000;
                                            final adms s5 = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            o = builder.instance;
                                            s5.getClass();
                                            ((admv)o).ao = s5;
                                            ((admv)o).d |= 0x2;
                                            final adms s6 = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            o = builder.instance;
                                            s6.getClass();
                                            ((admv)o).R = s6;
                                            ((admv)o).c |= 0x2000;
                                            final adms s7 = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            o = builder.instance;
                                            s7.getClass();
                                            ((admv)o).O = s7;
                                            ((admv)o).c |= 0x400;
                                            o = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            final admv admv5 = (admv)builder.instance;
                                            o.getClass();
                                            admv5.N = (adms)o;
                                            admv5.c |= 0x200;
                                            final adms s8 = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            o = builder.instance;
                                            s8.getClass();
                                            ((admv)o).Q = s8;
                                            ((admv)o).c |= 0x1000;
                                            o = ((adet)f.a).s();
                                            builder.copyOnWrite();
                                            final admv admv6 = (admv)builder.instance;
                                            o.getClass();
                                            admv6.ah = (adms)o;
                                            admv6.c |= 0x4000000;
                                            break Label_1629;
                                        }
                                    }
                                    o = ((admv)builder.instance).ar;
                                    adms ar;
                                    if ((ar = (adms)o) == null) {
                                        ar = adms.a;
                                    }
                                    final int j = adkp.i(ar.c);
                                    Label_0790: {
                                        if (j != 0) {
                                            if (j == 2) {
                                                break Label_0790;
                                            }
                                        }
                                        ar = adms.a;
                                    }
                                    builder.copyOnWrite();
                                    o = builder.instance;
                                    ar.getClass();
                                    ((admv)o).ar = ar;
                                    ((admv)o).d |= 0x10;
                                    o = ((admv)o).S;
                                    Object a2;
                                    if ((a2 = o) == null) {
                                        a2 = adms.a;
                                    }
                                    o = f.f((adms)a2);
                                    builder.copyOnWrite();
                                    final admv admv7 = (admv)builder.instance;
                                    o.getClass();
                                    admv7.S = (adms)o;
                                    admv7.c |= 0x4000;
                                    o = admv7.ae;
                                    adms a3;
                                    if ((a3 = (adms)o) == null) {
                                        a3 = adms.a;
                                    }
                                    o = f.f(a3);
                                    builder.copyOnWrite();
                                    final admv admv8 = (admv)builder.instance;
                                    o.getClass();
                                    admv8.ae = (adms)o;
                                    admv8.c |= 0x800000;
                                    o = admv8.C;
                                    adms a4;
                                    if ((a4 = (adms)o) == null) {
                                        a4 = adms.a;
                                    }
                                    final adms f2 = f.f(a4);
                                    builder.copyOnWrite();
                                    o = builder.instance;
                                    f2.getClass();
                                    ((admv)o).C = f2;
                                    ((admv)o).b |= 0x40000000;
                                    o = ((admv)o).C;
                                    Object a5;
                                    if ((a5 = o) == null) {
                                        a5 = adms.a;
                                    }
                                    o = f.f((adms)a5);
                                    builder.copyOnWrite();
                                    final admv admv9 = (admv)builder.instance;
                                    o.getClass();
                                    admv9.ag = (adms)o;
                                    admv9.c |= 0x2000000;
                                    o = admv9.ao;
                                    adms a6;
                                    if ((a6 = (adms)o) == null) {
                                        a6 = adms.a;
                                    }
                                    o = f.f(a6);
                                    builder.copyOnWrite();
                                    final admv admv10 = (admv)builder.instance;
                                    o.getClass();
                                    admv10.ao = (adms)o;
                                    admv10.d |= 0x2;
                                    o = admv10.R;
                                    adms a7;
                                    if ((a7 = (adms)o) == null) {
                                        a7 = adms.a;
                                    }
                                    final adms f3 = f.f(a7);
                                    builder.copyOnWrite();
                                    o = builder.instance;
                                    f3.getClass();
                                    ((admv)o).R = f3;
                                    ((admv)o).c |= 0x2000;
                                    o = ((admv)o).O;
                                    Object a8;
                                    if ((a8 = o) == null) {
                                        a8 = adms.a;
                                    }
                                    o = f.f((adms)a8);
                                    builder.copyOnWrite();
                                    final admv admv11 = (admv)builder.instance;
                                    o.getClass();
                                    admv11.O = (adms)o;
                                    admv11.c |= 0x400;
                                    o = admv11.N;
                                    adms a9;
                                    if ((a9 = (adms)o) == null) {
                                        a9 = adms.a;
                                    }
                                    final adms f4 = f.f(a9);
                                    builder.copyOnWrite();
                                    o = builder.instance;
                                    f4.getClass();
                                    ((admv)o).N = f4;
                                    ((admv)o).c |= 0x200;
                                    o = ((admv)o).Q;
                                    Object a10;
                                    if ((a10 = o) == null) {
                                        a10 = adms.a;
                                    }
                                    final adms f5 = f.f((adms)a10);
                                    builder.copyOnWrite();
                                    o = builder.instance;
                                    f5.getClass();
                                    ((admv)o).Q = f5;
                                    ((admv)o).c |= 0x1000;
                                    o = ((admv)o).ah;
                                    Object a11;
                                    if ((a11 = o) == null) {
                                        a11 = adms.a;
                                    }
                                    o = f.f((adms)a11);
                                    builder.copyOnWrite();
                                    final admv admv12 = (admv)builder.instance;
                                    o.getClass();
                                    admv12.ah = (adms)o;
                                    admv12.c |= 0x4000000;
                                }
                                else {
                                    final adms a12 = adms.a;
                                    builder.copyOnWrite();
                                    o = builder.instance;
                                    a12.getClass();
                                    ((admv)o).ae = a12;
                                    final int c = ((admv)o).c | 0x800000;
                                    ((admv)o).c = c;
                                    if ((c & 0x80) != 0x0) {
                                        final adms s9 = ((adet)f.a).s();
                                        builder.copyOnWrite();
                                        o = builder.instance;
                                        s9.getClass();
                                        ((admv)o).O = s9;
                                        ((admv)o).c |= 0x400;
                                    }
                                    else {
                                        o = adms.a;
                                        builder.copyOnWrite();
                                        final admv admv13 = (admv)builder.instance;
                                        o.getClass();
                                        admv13.O = (adms)o;
                                        admv13.c |= 0x400;
                                    }
                                }
                            }
                        }
                        o2 = builder.build();
                    }
                }
            }
        }
        catch (final ahca ahca) {
            o2 = o;
        }
        if (o2 == null) {
            this.g(s);
        }
        else if (n < 3) {
            this.i(s, (admv)o2);
        }
        return (admv)o2;
    }
    
    private final void k(final String s, final admv admv) {
        atjm e;
        if ((e = this.a.get(s)) == null) {
            e = atjm.e();
            this.a.put(s, e);
        }
        e.tu((Object)admv);
    }
    
    private final void l() {
        synchronized (this) {
            final ScheduledFuture d = this.d;
            if (d != null) {
                d.cancel(true);
            }
            this.f();
            this.d = this.c.schedule((Runnable)new adap(this, 16), 60L, TimeUnit.SECONDS);
        }
    }
    
    private static final ContentValues m(final String s, final admv admv) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("id", s);
        contentValues.put("version", Integer.valueOf(3));
        contentValues.put("data", ((agzk)admv).toByteArray());
        return contentValues;
    }
    
    public final adlq a(final String s, final adkx adkx) {
        synchronized (this) {
            this.l();
            try {
                this.e.beginTransaction();
                try {
                    final admv b = this.b(s);
                    final admv a = adkx.a(b);
                    if (adkp.ae(a, b)) {
                        final adlq adlq = new adlq(b, a);
                        final SQLiteDatabase e = this.e;
                        e.getClass();
                        e.endTransaction();
                        return adlq;
                    }
                    if (b == null && a != null) {
                        if (!this.h(s, a)) {
                            throw new AssertionError((Object)"Insert failed after an empty read, in a transaction");
                        }
                    }
                    else if (a == null) {
                        if (!this.g(s)) {
                            throw new AssertionError((Object)"Delete failed after a read, in a transaction");
                        }
                    }
                    else if (!this.i(s, a)) {
                        throw new AssertionError((Object)"Update failed after a read, in a transaction");
                    }
                    final SQLiteDatabase e2 = this.e;
                    e2.getClass();
                    e2.setTransactionSuccessful();
                    final adlq adlq2 = new adlq(b, a);
                    final SQLiteDatabase e3 = this.e;
                    e3.getClass();
                    e3.endTransaction();
                    return adlq2;
                }
                finally {
                    try {
                        final AssertionError assertionError = new AssertionError((Object)"Failure applying the update, in a transaction");
                        final Throwable t;
                        assertionError.initCause(t);
                        throw assertionError;
                    }
                    finally {
                        final SQLiteDatabase e4 = this.e;
                        e4.getClass();
                        e4.endTransaction();
                    }
                }
            }
            catch (final SQLiteException ex) {
                throw new adkv("Error updating the database in a transaction", (Throwable)ex);
            }
        }
    }
    
    public final admv b(final String s) {
        synchronized (this) {
            this.l();
            try {
                final Cursor query = this.e.query("job_storage_jobs", new String[] { "version", "data" }, "id = ?", new String[] { s }, (String)null, (String)null, (String)null);
                try {
                    if (!query.moveToFirst()) {
                        return null;
                    }
                    final int int1 = query.getInt(query.getColumnIndexOrThrow("version"));
                    final byte[] blob = query.getBlob(query.getColumnIndexOrThrow("data"));
                    if (!query.moveToNext()) {
                        return this.j(s, blob, int1);
                    }
                    throw new AssertionError((Object)"Multiple jobs with the same id were found");
                }
                finally {
                    query.close();
                }
            }
            finally {
                final Throwable t;
                throw new adkv("Error querying the database", t);
            }
        }
    }
    
    public final Map c() {
        monitorenter(this);
        try {
            this.l();
            try {
                final HashMap hashMap = new HashMap();
                final Cursor query = this.e.query("job_storage_jobs", new String[] { "id", "version", "data" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
                try {
                    final int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                    final int columnIndexOrThrow2 = query.getColumnIndexOrThrow("version");
                    final int columnIndexOrThrow3 = query.getColumnIndexOrThrow("data");
                    while (query.moveToNext()) {
                        final String string = query.getString(columnIndexOrThrow);
                        final admv j = this.j(string, query.getBlob(columnIndexOrThrow3), query.getInt(columnIndexOrThrow2));
                        if (j != null) {
                            if (hashMap.put(string, j) != null) {
                                throw new AssertionError((Object)"Multiple jobs with the same id were found");
                            }
                            this.k(string, j);
                        }
                    }
                    query.close();
                    monitorexit(this);
                    return hashMap;
                }
                finally {
                    query.close();
                }
            }
            finally {
                final Throwable t;
                throw new adkv("Error querying the database", t);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Map d(final aezs aezs) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList<Object>(this.c().entrySet());
            Collections.sort((List<Object>)list, (Comparator<? super Object>)new zks(15));
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int size = list.size(), i = 0; i < size; ++i) {
                final Map.Entry<K, admv> entry = (Map.Entry<K, admv>)list.get(i);
                if (aezs.a((Object)entry.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            monitorexit(this);
            return linkedHashMap;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e() {
        monitorenter(this);
        try {
            final SQLiteDatabase e = this.e;
            if (e != null) {
                e.close();
                this.e = null;
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            try {
                final Throwable t;
                throw new adkv("Could not close the database", t);
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    protected final void f() {
        monitorenter(this);
        try {
            if (this.e == null) {
                this.e = new adkt(this.b).getWritableDatabase();
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            try {
                final Throwable t;
                throw new adkv("Could not open the database", t);
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final boolean g(final String s) {
        synchronized (this) {
            this.l();
            try {
                final SQLiteDatabase e = this.e;
                boolean b = true;
                final int delete = e.delete("job_storage_jobs", "id = ?", new String[] { s });
                if (delete <= 1) {
                    if (delete != 1) {
                        b = false;
                    }
                    if (b) {
                        final atjm atjm = this.a.remove(s);
                        if (atjm != null) {
                            atjm.tx();
                        }
                    }
                    return b;
                }
                throw new AssertionError((Object)"Multiple jobs with the same id were found");
            }
            finally {
                final Throwable t;
                throw new adkv("Error deleting from the database", t);
            }
        }
    }
    
    public final boolean h(final String s, final admv admv) {
        synchronized (this) {
            adkp.H(admv.Y);
            this.l();
            try {
                final boolean b = this.e.insertOrThrow("job_storage_jobs", (String)null, m(s, admv)) >= 0L;
                if (b) {
                    this.k(s, admv);
                }
                return b;
            }
            finally {
                final Throwable t;
                throw new adkv("Error inserting into the database", t);
            }
        }
    }
    
    public final boolean i(final String s, final admv admv) {
        synchronized (this) {
            this.l();
            try {
                final SQLiteDatabase e = this.e;
                final ContentValues m = m(s, admv);
                boolean b = true;
                final int update = e.update("job_storage_jobs", m, "id = ?", new String[] { s });
                if (update <= 1) {
                    if (update != 1) {
                        b = false;
                    }
                    if (b) {
                        this.k(s, admv);
                    }
                    return b;
                }
                throw new AssertionError((Object)"Multiple jobs with the same id were found");
            }
            finally {
                final Throwable t;
                throw new adkv("Error updating the database", t);
            }
        }
    }
}
