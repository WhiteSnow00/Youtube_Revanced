import java.util.Iterator;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import android.util.Pair;
import android.util.Log;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseErrorHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgw implements DatabaseErrorHandler
{
    public final elx a;
    
    public cgw(final elx a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final void onCorruption(SQLiteDatabase sqLiteDatabase) {
        final elx a = this.a;
        sqLiteDatabase.getClass();
        final cgv c = ceq.c(a, sqLiteDatabase);
        final StringBuilder sb = new StringBuilder("Corruption reported by sqlite on database: ");
        sb.append(c);
        sb.append(".path");
        Log.e("SupportSQLite", sb.toString());
        if (!((cgm)c).j()) {
            sqLiteDatabase = (SQLiteDatabase)((cgm)c).c();
            if (sqLiteDatabase != null) {
                cgn.a((String)sqLiteDatabase);
            }
            return;
        }
        final Iterable iterable = null;
        while (true) {
            try {
                Label_0182: {
                    try {
                        sqLiteDatabase = (SQLiteDatabase)c.b.getAttachedDbs();
                        break Label_0100;
                    }
                    finally {
                        Label_0179: {
                            break Label_0179;
                            try {
                                ((cgm)c).close();
                                break Label_0182;
                                break Label_0179;
                                String c2;
                                while (true) {
                                    final Iterator iterator;
                                    iftrue(Label_0179:)(!iterator.hasNext());
                                    Block_13: {
                                        break Block_13;
                                        Label_0160: {
                                            c2 = ((cgm)c).c();
                                        }
                                        iftrue(Label_0175:)(c2 != null);
                                        iftrue(Label_0160:)(iterable == null);
                                        iterator = iterable.iterator();
                                        continue;
                                    }
                                    final Object second = ((Pair)iterator.next()).second;
                                    second.getClass();
                                    cgn.a((String)second);
                                    continue;
                                }
                                Label_0175: {
                                    cgn.a(c2);
                                }
                            }
                            catch (final IOException ex) {}
                        }
                    }
                }
                if (sqLiteDatabase != null) {
                    final Iterator<Object> iterator2 = ((Iterable<Object>)sqLiteDatabase).iterator();
                    while (iterator2.hasNext()) {
                        sqLiteDatabase = (SQLiteDatabase)iterator2.next().second;
                        sqLiteDatabase.getClass();
                        cgn.a((String)sqLiteDatabase);
                    }
                }
                else {
                    sqLiteDatabase = (SQLiteDatabase)((cgm)c).c();
                    if (sqLiteDatabase != null) {
                        cgn.a((String)sqLiteDatabase);
                    }
                }
            }
            catch (final SQLiteException ex2) {
                continue;
            }
            break;
        }
    }
}
