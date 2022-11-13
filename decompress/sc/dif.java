import android.database.Cursor;
import java.io.FileNotFoundException;
import android.text.TextUtils;
import java.io.File;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class dif implements ddy
{
    private static final String[] a;
    private final Context b;
    private final Uri c;
    
    static {
        a = new String[] { "_data" };
    }
    
    public dif(final Context b, final Uri c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Class a() {
        return File.class;
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void f(final dca dca, final ddx ddx) {
        final Cursor query = this.b.getContentResolver().query(this.c, dif.a, (String)null, (String[])null, (String)null);
        final String s = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    query.getString(query.getColumnIndexOrThrow("_data"));
                }
            }
            finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            ddx.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
            return;
        }
        ddx.b(new File(s));
    }
    
    @Override
    public final int g() {
        return 1;
    }
    
    @Override
    public final void lq() {
    }
}
