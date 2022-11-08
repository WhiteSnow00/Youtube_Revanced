import android.database.Cursor;
import java.io.FileNotFoundException;
import android.text.TextUtils;
import java.io.File;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class die implements ddx
{
    private static final String[] a;
    private final Context b;
    private final Uri c;
    
    static {
        a = new String[] { "_data" };
    }
    
    public die(final Context b, final Uri c) {
        this.b = b;
        this.c = c;
    }
    
    public final Class a() {
        return File.class;
    }
    
    public final void d() {
    }
    
    public final void f(final dbz dbz, final ddw ddw) {
        final Cursor query = this.b.getContentResolver().query(this.c, die.a, (String)null, (String[])null, (String)null);
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
            ddw.e((Exception)new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
            return;
        }
        ddw.b((Object)new File(s));
    }
    
    public final int g() {
        return 1;
    }
    
    public final void lq() {
    }
}
