import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ceq
{
    public static void a(final View view, final boolean accessibilityHeading) {
        view.setAccessibilityHeading(accessibilityHeading);
    }
    
    public static final cgo b(final Context context, final String s, final cgn cgn, final boolean b, final boolean b2) {
        if (b && (s == null || s.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new cgo(context, s, cgn, b, b2);
    }
    
    public static final cgv c(final elx elx, final SQLiteDatabase sqLiteDatabase) {
        elx.getClass();
        final Object a = elx.a;
        if (a != null) {
            final cgv cgv = (cgv)a;
            if (atoc.c((Object)cgv.b, (Object)sqLiteDatabase)) {
                return cgv;
            }
        }
        return (cgv)(elx.a = new cgv(sqLiteDatabase));
    }
}
