import android.database.Cursor;
import java.util.Iterator;
import android.os.Bundle;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Set;
import java.util.HashSet;
import android.content.ComponentName;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chf extends ContentProvider
{
    public final int delete(final Uri uri, final String s, final String[] array) {
        throw new IllegalStateException("Not allowed.");
    }
    
    public final String getType(final Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }
    
    public final boolean onCreate() {
        final Context context = this.getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                if (che.a == null) {
                    synchronized (che.b) {
                        if (che.a == null) {
                            che.a = new che(context);
                        }
                    }
                }
                final Class<? extends chf> class1 = this.getClass();
                final che a = che.a;
                try {
                    final Bundle metaData = a.e.getPackageManager().getProviderInfo(new ComponentName(a.e, (Class)class1), 128).metaData;
                    final String string = a.e.getString(2132017476);
                    if (metaData == null) {
                        return true;
                    }
                    try {
                        final HashSet set = new HashSet();
                        for (final String s : metaData.keySet()) {
                            if (string.equals(metaData.getString(s, (String)null))) {
                                final Class<?> forName = Class.forName(s);
                                if (!chg.class.isAssignableFrom(forName)) {
                                    continue;
                                }
                                a.d.add(forName);
                            }
                        }
                        final Iterator iterator2 = a.d.iterator();
                        while (iterator2.hasNext()) {
                            a.a((Class)iterator2.next(), set);
                        }
                    }
                    catch (final ClassNotFoundException ex) {
                        throw new chh(ex);
                    }
                }
                catch (final PackageManager$NameNotFoundException ex2) {
                    throw new chh((Throwable)ex2);
                }
            }
            return true;
        }
        throw new chh();
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        throw new IllegalStateException("Not allowed.");
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new IllegalStateException("Not allowed.");
    }
}
