import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cet
{
    public static void a(final View view, final boolean accessibilityHeading) {
        view.setAccessibilityHeading(accessibilityHeading);
    }
    
    public static final cgr b(final Context context, final String s, final cgq cgq, final boolean b, final boolean b2) {
        if (b && (s == null || s.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new cgr(context, s, cgq, b, b2);
    }
    
    public static final void c(final SQLiteOpenHelper sqLiteOpenHelper, final boolean writeAheadLoggingEnabled) {
        sqLiteOpenHelper.getClass();
        sqLiteOpenHelper.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
    }
}
