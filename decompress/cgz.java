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

public final class cgz implements DatabaseErrorHandler
{
    public final ema a;
    
    public cgz(final ema a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final void onCorruption(SQLiteDatabase sqLiteDatabase) {
        final ema a = this.a;
        sqLiteDatabase.getClass();
        final cgy b = ceu.b(a, sqLiteDatabase);
        final StringBuilder sb = new StringBuilder("Corruption reported by sqlite on database: ");
        sb.append(b);
        sb.append(".path");
        Log.e("SupportSQLite", sb.toString());
        if (!b.j()) {
            sqLiteDatabase = (SQLiteDatabase)b.c();
            if (sqLiteDatabase != null) {
                cgq.a((String)sqLiteDatabase);
            }
            return;
        }
        final Iterable iterable = null;
    Label_0179_Outer:
        while (true) {
            try {
                Label_0182: {
                    try {
                        sqLiteDatabase = (SQLiteDatabase)b.b.getAttachedDbs();
                        break Label_0100;
                    }
                    finally {
                        Label_0112: {
                            break Label_0112;
                            try {
                                b.close();
                                break Label_0182;
                                Iterator iterator = null;
                                final Object second = ((Pair)iterator.next()).second;
                                second.getClass();
                                cgq.a((String)second);
                                Label_0123: {
                                    break Label_0123;
                                Label_0179:
                                    while (true) {
                                        final String c;
                                        while (true) {
                                            iterator = iterable.iterator();
                                            break Label_0123;
                                            continue Label_0179;
                                            Label_0175: {
                                                cgq.a(c);
                                            }
                                            continue Label_0179;
                                            iftrue(Label_0160:)(iterable == null);
                                            continue Label_0179_Outer;
                                        }
                                        Label_0160: {
                                            c = b.c();
                                        }
                                        iftrue(Label_0175:)(c != null);
                                        continue Label_0179;
                                    }
                                }
                                iftrue(Label_0179:)(!iterator.hasNext());
                            }
                            catch (final IOException ex) {}
                        }
                    }
                }
                if (sqLiteDatabase != null) {
                    sqLiteDatabase = (SQLiteDatabase)((Iterable<Object>)sqLiteDatabase).iterator();
                    while (((Iterator)sqLiteDatabase).hasNext()) {
                        final Object second2 = ((Iterator<Pair>)sqLiteDatabase).next().second;
                        second2.getClass();
                        cgq.a((String)second2);
                    }
                }
                else {
                    sqLiteDatabase = (SQLiteDatabase)b.c();
                    if (sqLiteDatabase != null) {
                        cgq.a((String)sqLiteDatabase);
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
