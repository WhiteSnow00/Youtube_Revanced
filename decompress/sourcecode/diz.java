import android.database.Cursor;
import android.provider.MediaStore;
import java.io.File;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import android.os.Environment;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class diz implements ddx
{
    private static final String[] a;
    private final Context b;
    private final dii c;
    private final dii d;
    private final Uri e;
    private final int f;
    private final int g;
    private final ddo h;
    private final Class i;
    private volatile boolean j;
    private volatile ddx k;
    
    static {
        a = new String[] { "_data" };
    }
    
    public diz(final Context context, final dii c, final dii d, final Uri e, final int f, final int g, final ddo h, final Class i) {
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final Class a() {
        return this.i;
    }
    
    public final void d() {
        final ddx k = this.k;
        if (k != null) {
            k.d();
        }
    }
    
    public final void f(final dbz dbz, final ddw ddw) {
        try {
            final boolean externalStorageLegacy = Environment.isExternalStorageLegacy();
            Object b = null;
            CharSequence charSequence = null;
            Object b2 = null;
            Label_0294: {
                if (externalStorageLegacy) {
                    final dii c = this.c;
                    final Uri e = this.e;
                    try {
                        final Cursor query = this.b.getContentResolver().query(e, diz.a, (String)null, (String[])null, (String)null);
                        Label_0174: {
                            if (query == null) {
                                break Label_0174;
                            }
                            try {
                                if (!query.moveToFirst()) {
                                    charSequence = String.valueOf(e);
                                    b = new StringBuilder("Failed to media store entry for: ");
                                    ((StringBuilder)b).append((String)charSequence);
                                    throw new FileNotFoundException(((StringBuilder)b).toString());
                                }
                                charSequence = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(charSequence)) {
                                    final File file = new File((String)charSequence);
                                    query.close();
                                    c.b((Object)file, this.f, this.g, this.h);
                                    break Label_0294;
                                }
                                charSequence = String.valueOf(e);
                                b = new StringBuilder("File path was empty in media store for: ");
                                ((StringBuilder)b).append((String)charSequence);
                                throw new FileNotFoundException(((StringBuilder)b).toString());
                            }
                            finally {}
                        }
                    }
                    finally {
                        b2 = charSequence;
                    }
                    if (b2 != null) {
                        ((Cursor)b2).close();
                    }
                }
                else {
                    Uri uri;
                    if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri = MediaStore.setRequireOriginal(this.e);
                    }
                    else {
                        uri = this.e;
                    }
                    b2 = this.d.b((Object)uri, this.f, this.g, this.h);
                }
            }
            if (b2 != null) {
                b = ((alm)b2).b;
            }
            if (b == null) {
                final String value = String.valueOf(this.e);
                final StringBuilder sb = new StringBuilder("Failed to build fetcher for: ");
                sb.append(value);
                ddw.e((Exception)new IllegalArgumentException(sb.toString()));
                return;
            }
            this.k = (ddx)b;
            if (this.j) {
                this.lq();
                return;
            }
            ((ddx)b).f(dbz, ddw);
        }
        catch (final FileNotFoundException ex) {
            ddw.e((Exception)ex);
        }
    }
    
    public final int g() {
        return 1;
    }
    
    public final void lq() {
        this.j = true;
        final ddx k = this.k;
        if (k != null) {
            k.lq();
        }
    }
}
