import android.database.sqlite.SQLiteDatabase;
import android.view.WindowInsets$Type;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ceu
{
    public static ceu a;
    
    static void a(final Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets$Type.ime());
    }
    
    public static final cgy b(final ema ema, final SQLiteDatabase sqLiteDatabase) {
        ema.getClass();
        final Object a = ema.a;
        if (a != null) {
            final cgy cgy = (cgy)a;
            if (atqz.c(cgy.b, sqLiteDatabase)) {
                return cgy;
            }
        }
        return (cgy)(ema.a = new cgy(sqLiteDatabase));
    }
}
