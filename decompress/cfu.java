import java.util.concurrent.locks.Lock;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfu
{
    public final cfw a;
    public final AtomicBoolean b;
    public volatile boolean c;
    public final sc d;
    public final Object e;
    public final Runnable f;
    public volatile chf g;
    public cet h;
    public final ceu i;
    private final Map j;
    private final Map k;
    private final Object l;
    
    public cfu(final cfw a, final Map j, final String... array) {
        this.a = a;
        this.j = j;
        int i = 0;
        this.b = new AtomicBoolean(false);
        this.i = new ceu();
        Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>()).getClass();
        this.d = new sc();
        this.l = new Object();
        this.e = new Object();
        this.k = new LinkedHashMap();
        final int length = array.length;
        final String[] array2 = new String[length];
        while (i < length) {
            final String s = array[i];
            final Locale us = Locale.US;
            us.getClass();
            final String lowerCase = s.toLowerCase(us);
            lowerCase.getClass();
            this.k.put(lowerCase, i);
            final String s2 = this.j.get(array[i]);
            String lowerCase2;
            if (s2 != null) {
                final Locale us2 = Locale.US;
                us2.getClass();
                lowerCase2 = s2.toLowerCase(us2);
                lowerCase2.getClass();
            }
            else {
                lowerCase2 = null;
            }
            if (lowerCase2 == null) {
                lowerCase2 = lowerCase;
            }
            array2[i] = lowerCase2;
            ++i;
        }
        for (final Map.Entry<K, String> entry : this.j.entrySet()) {
            final String s3 = entry.getValue();
            final Locale us3 = Locale.US;
            us3.getClass();
            final String lowerCase3 = s3.toLowerCase(us3);
            lowerCase3.getClass();
            if (this.k.containsKey(lowerCase3)) {
                final String s4 = (String)entry.getKey();
                final Locale us4 = Locale.US;
                us4.getClass();
                final String lowerCase4 = s4.toLowerCase(us4);
                lowerCase4.getClass();
                final Map k = this.k;
                final Object value = k.get(lowerCase3);
                if (value == null && !k.containsKey(lowerCase3)) {
                    final StringBuilder sb = new StringBuilder("Key ");
                    sb.append((Object)lowerCase3);
                    sb.append(" is missing in the map.");
                    throw new NoSuchElementException(sb.toString());
                }
                k.put(lowerCase4, value);
            }
        }
        this.f = new cde(this, 7);
    }
    
    public final void a(cgp h) {
        if (h.i()) {
            return;
        }
        try {
            h = (cgp)this.a.h();
            ((Lock)h).lock();
            try {
                synchronized (this.l) {
                    final ceu i = this.i;
                    monitorenter(i);
                    monitorexit(i);
                }
            }
            finally {
                ((Lock)h).unlock();
            }
        }
        catch (final SQLiteException ex) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex);
        }
        catch (final IllegalStateException ex2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex2);
        }
    }
}
