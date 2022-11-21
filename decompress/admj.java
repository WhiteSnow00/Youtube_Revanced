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

public final class admj
{
    public final Map a;
    private final Context b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;
    private SQLiteDatabase e;
    private final adgg f;
    
    public admj(final Context b, final ScheduledExecutorService c, adgg f, final byte[] array, final byte[] array2) {
        f = new adgg(f, (byte[])null, (byte[])null);
        this.b = b;
        this.c = c;
        this.f = f;
        this.a = (Map)new ConcurrentHashMap();
    }
    
    private final adoj j(final String s, final byte[] array, final int n) {
        final adgg f = this.f;
        ahcz ahcz = null;
        ahcz ahcz2;
        try {
            final adoj adoj = (adoj)ahcz.parseFrom(adoj.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            ahcz2 = ahcz;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        ahcz2 = ahcz;
                    }
                    else {
                        ahcz2 = adoj;
                    }
                }
                else {
                    final ahcr builder = adoj.toBuilder();
                    if (((adoj)builder.instance).Y) {
                        ahcz2 = builder.build();
                    }
                    else {
                        builder.copyOnWrite();
                        adoj.a((adoj)builder.instance);
                        final adoj adoj2 = (adoj)builder.instance;
                        Label_1631: {
                            if (!adoj2.aj) {
                                if (adoj2.ai) {
                                    ahcz = adoj2.am;
                                    adog a;
                                    if ((a = (adog)ahcz) == null) {
                                        a = adog.a;
                                    }
                                    final int y = adme.y(a.c);
                                    if (y != 0) {
                                        if (y == 2) {
                                            ahcz = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            final adoj adoj3 = (adoj)builder.instance;
                                            ahcz.getClass();
                                            adoj3.ar = (adog)ahcz;
                                            adoj3.d |= 0x10;
                                            final adog n2 = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            ahcz = builder.instance;
                                            n2.getClass();
                                            ((adoj)ahcz).S = n2;
                                            ((adoj)ahcz).c |= 0x4000;
                                            ahcz = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            final adoj adoj4 = (adoj)builder.instance;
                                            ahcz.getClass();
                                            adoj4.ae = (adog)ahcz;
                                            adoj4.c |= 0x800000;
                                            final adog n3 = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            ahcz = builder.instance;
                                            n3.getClass();
                                            ((adoj)ahcz).C = n3;
                                            ((adoj)ahcz).b |= 0x40000000;
                                            final adog n4 = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            ahcz = builder.instance;
                                            n4.getClass();
                                            ((adoj)ahcz).ag = n4;
                                            ((adoj)ahcz).c |= 0x2000000;
                                            final adog n5 = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            ahcz = builder.instance;
                                            n5.getClass();
                                            ((adoj)ahcz).ao = n5;
                                            ((adoj)ahcz).d |= 0x2;
                                            final adog n6 = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            ahcz = builder.instance;
                                            n6.getClass();
                                            ((adoj)ahcz).R = n6;
                                            ((adoj)ahcz).c |= 0x2000;
                                            ahcz = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            final adoj adoj5 = (adoj)builder.instance;
                                            ahcz.getClass();
                                            adoj5.O = (adog)ahcz;
                                            adoj5.c |= 0x400;
                                            final adog n7 = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            ahcz = builder.instance;
                                            n7.getClass();
                                            ((adoj)ahcz).N = n7;
                                            ((adoj)ahcz).c |= 0x200;
                                            final adog n8 = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            ahcz = builder.instance;
                                            n8.getClass();
                                            ((adoj)ahcz).Q = n8;
                                            ((adoj)ahcz).c |= 0x1000;
                                            ahcz = ((adgg)f.a).n();
                                            builder.copyOnWrite();
                                            final adoj adoj6 = (adoj)builder.instance;
                                            ahcz.getClass();
                                            adoj6.ah = (adog)ahcz;
                                            adoj6.c |= 0x4000000;
                                            break Label_1631;
                                        }
                                    }
                                    ahcz = ((adoj)builder.instance).ar;
                                    adog ar;
                                    if ((ar = (adog)ahcz) == null) {
                                        ar = adog.a;
                                    }
                                    final int y2 = adme.y(ar.c);
                                    Label_0790: {
                                        if (y2 != 0) {
                                            if (y2 == 2) {
                                                break Label_0790;
                                            }
                                        }
                                        ar = adog.a;
                                    }
                                    builder.copyOnWrite();
                                    ahcz = builder.instance;
                                    ar.getClass();
                                    ((adoj)ahcz).ar = ar;
                                    ((adoj)ahcz).d |= 0x10;
                                    ahcz = ((adoj)ahcz).S;
                                    ahcz a2;
                                    if ((a2 = ahcz) == null) {
                                        a2 = adog.a;
                                    }
                                    final adog b = f.B((adog)a2);
                                    builder.copyOnWrite();
                                    ahcz = builder.instance;
                                    b.getClass();
                                    ((adoj)ahcz).S = b;
                                    ((adoj)ahcz).c |= 0x4000;
                                    ahcz = ((adoj)ahcz).ae;
                                    ahcz a3;
                                    if ((a3 = ahcz) == null) {
                                        a3 = adog.a;
                                    }
                                    final adog b2 = f.B((adog)a3);
                                    builder.copyOnWrite();
                                    ahcz = builder.instance;
                                    b2.getClass();
                                    ((adoj)ahcz).ae = b2;
                                    ((adoj)ahcz).c |= 0x800000;
                                    ahcz = ((adoj)ahcz).C;
                                    ahcz a4;
                                    if ((a4 = ahcz) == null) {
                                        a4 = adog.a;
                                    }
                                    ahcz = f.B((adog)a4);
                                    builder.copyOnWrite();
                                    final adoj adoj7 = (adoj)builder.instance;
                                    ahcz.getClass();
                                    adoj7.C = (adog)ahcz;
                                    adoj7.b |= 0x40000000;
                                    ahcz = adoj7.C;
                                    adog a5;
                                    if ((a5 = (adog)ahcz) == null) {
                                        a5 = adog.a;
                                    }
                                    final adog b3 = f.B(a5);
                                    builder.copyOnWrite();
                                    ahcz = builder.instance;
                                    b3.getClass();
                                    ((adoj)ahcz).ag = b3;
                                    ((adoj)ahcz).c |= 0x2000000;
                                    ahcz = ((adoj)ahcz).ao;
                                    ahcz a6;
                                    if ((a6 = ahcz) == null) {
                                        a6 = adog.a;
                                    }
                                    ahcz = f.B((adog)a6);
                                    builder.copyOnWrite();
                                    final adoj adoj8 = (adoj)builder.instance;
                                    ahcz.getClass();
                                    adoj8.ao = (adog)ahcz;
                                    adoj8.d |= 0x2;
                                    ahcz = adoj8.R;
                                    adog a7;
                                    if ((a7 = (adog)ahcz) == null) {
                                        a7 = adog.a;
                                    }
                                    ahcz = f.B(a7);
                                    builder.copyOnWrite();
                                    final adoj adoj9 = (adoj)builder.instance;
                                    ahcz.getClass();
                                    adoj9.R = (adog)ahcz;
                                    adoj9.c |= 0x2000;
                                    ahcz = adoj9.O;
                                    adog a8;
                                    if ((a8 = (adog)ahcz) == null) {
                                        a8 = adog.a;
                                    }
                                    final adog b4 = f.B(a8);
                                    builder.copyOnWrite();
                                    ahcz = builder.instance;
                                    b4.getClass();
                                    ((adoj)ahcz).O = b4;
                                    ((adoj)ahcz).c |= 0x400;
                                    ahcz = ((adoj)ahcz).N;
                                    ahcz a9;
                                    if ((a9 = ahcz) == null) {
                                        a9 = adog.a;
                                    }
                                    final adog b5 = f.B((adog)a9);
                                    builder.copyOnWrite();
                                    ahcz = builder.instance;
                                    b5.getClass();
                                    ((adoj)ahcz).N = b5;
                                    ((adoj)ahcz).c |= 0x200;
                                    ahcz = ((adoj)ahcz).Q;
                                    ahcz a10;
                                    if ((a10 = ahcz) == null) {
                                        a10 = adog.a;
                                    }
                                    ahcz = f.B((adog)a10);
                                    builder.copyOnWrite();
                                    final adoj adoj10 = (adoj)builder.instance;
                                    ahcz.getClass();
                                    adoj10.Q = (adog)ahcz;
                                    adoj10.c |= 0x1000;
                                    ahcz = adoj10.ah;
                                    adog a11;
                                    if ((a11 = (adog)ahcz) == null) {
                                        a11 = adog.a;
                                    }
                                    ahcz = f.B(a11);
                                    builder.copyOnWrite();
                                    final adoj adoj11 = (adoj)builder.instance;
                                    ahcz.getClass();
                                    adoj11.ah = (adog)ahcz;
                                    adoj11.c |= 0x4000000;
                                }
                                else {
                                    final adog a12 = adog.a;
                                    builder.copyOnWrite();
                                    ahcz = builder.instance;
                                    a12.getClass();
                                    ((adoj)ahcz).ae = a12;
                                    final int c = ((adoj)ahcz).c | 0x800000;
                                    ((adoj)ahcz).c = c;
                                    if ((c & 0x80) != 0x0) {
                                        ahcz = ((adgg)f.a).n();
                                        builder.copyOnWrite();
                                        final adoj adoj12 = (adoj)builder.instance;
                                        ahcz.getClass();
                                        adoj12.O = (adog)ahcz;
                                        adoj12.c |= 0x400;
                                    }
                                    else {
                                        final adog a13 = adog.a;
                                        builder.copyOnWrite();
                                        ahcz = builder.instance;
                                        a13.getClass();
                                        ((adoj)ahcz).O = a13;
                                        ((adoj)ahcz).c |= 0x400;
                                    }
                                }
                            }
                        }
                        ahcz2 = builder.build();
                    }
                }
            }
        }
        catch (final ahds ahds) {
            ahcz2 = ahcz;
        }
        if (ahcz2 == null) {
            this.g(s);
        }
        else if (n < 3) {
            this.i(s, (adoj)ahcz2);
        }
        return (adoj)ahcz2;
    }
    
    private final void k(final String s, final adoj adoj) {
        atmj e;
        if ((e = this.a.get(s)) == null) {
            e = atmj.e();
            this.a.put(s, e);
        }
        e.tt((Object)adoj);
    }
    
    private final void l() {
        synchronized (this) {
            final ScheduledFuture d = this.d;
            if (d != null) {
                d.cancel(true);
            }
            this.f();
            this.d = this.c.schedule((Runnable)new addt(this, 16), 60L, TimeUnit.SECONDS);
        }
    }
    
    private static final ContentValues m(final String s, final adoj adoj) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("id", s);
        contentValues.put("version", Integer.valueOf(3));
        contentValues.put("data", adoj.toByteArray());
        return contentValues;
    }
    
    public final adne a(final String s, final admm admm) {
        synchronized (this) {
            this.l();
            try {
                this.e.beginTransaction();
                try {
                    final adoj b = this.b(s);
                    final adoj a = admm.a(b);
                    if (aexq.c(a, b)) {
                        final adne adne = new adne(b, a);
                        final SQLiteDatabase e = this.e;
                        e.getClass();
                        e.endTransaction();
                        return adne;
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
                    final adne adne2 = new adne(b, a);
                    final SQLiteDatabase e3 = this.e;
                    e3.getClass();
                    e3.endTransaction();
                    return adne2;
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
                throw new admk("Error updating the database in a transaction", (Throwable)ex);
            }
        }
    }
    
    public final adoj b(final String s) {
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
                throw new admk("Error querying the database", t);
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
                        final adoj j = this.j(string, query.getBlob(columnIndexOrThrow3), query.getInt(columnIndexOrThrow2));
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
                throw new admk("Error querying the database", t);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Map d(final afbk afbk) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList<Object>(this.c().entrySet());
            Collections.sort((List<Object>)list, (Comparator<? super Object>)new zmm(15));
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int size = list.size(), i = 0; i < size; ++i) {
                final Map.Entry<K, adoj> entry = (Map.Entry<K, adoj>)list.get(i);
                if (afbk.a(entry.getValue())) {
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
                throw new admk("Could not close the database", t);
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
                this.e = new admi(this.b).getWritableDatabase();
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            try {
                final Throwable t;
                throw new admk("Could not open the database", t);
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
                        final atmj atmj = this.a.remove(s);
                        if (atmj != null) {
                            atmj.tw();
                        }
                    }
                    return b;
                }
                throw new AssertionError((Object)"Multiple jobs with the same id were found");
            }
            finally {
                final Throwable t;
                throw new admk("Error deleting from the database", t);
            }
        }
    }
    
    public final boolean h(final String s, final adoj adoj) {
        synchronized (this) {
            adme.K(adoj.Y);
            this.l();
            try {
                final boolean b = this.e.insertOrThrow("job_storage_jobs", (String)null, m(s, adoj)) >= 0L;
                if (b) {
                    this.k(s, adoj);
                }
                return b;
            }
            finally {
                final Throwable t;
                throw new admk("Error inserting into the database", t);
            }
        }
    }
    
    public final boolean i(final String s, final adoj adoj) {
        synchronized (this) {
            this.l();
            try {
                final SQLiteDatabase e = this.e;
                final ContentValues m = m(s, adoj);
                boolean b = true;
                final int update = e.update("job_storage_jobs", m, "id = ?", new String[] { s });
                if (update <= 1) {
                    if (update != 1) {
                        b = false;
                    }
                    if (b) {
                        this.k(s, adoj);
                    }
                    return b;
                }
                throw new AssertionError((Object)"Multiple jobs with the same id were found");
            }
            finally {
                final Throwable t;
                throw new admk("Error updating the database", t);
            }
        }
    }
}
