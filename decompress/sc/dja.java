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

final class dja implements ddy
{
    private static final String[] a;
    private final Context b;
    private final dij c;
    private final dij d;
    private final Uri e;
    private final int f;
    private final int g;
    private final ddp h;
    private final Class i;
    private volatile boolean j;
    private volatile ddy k;
    
    static {
        a = new String[] { "_data" };
    }
    
    public dja(final Context context, final dij c, final dij d, final Uri e, final int f, final int g, final ddp h, final Class i) {
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final Class a() {
        return this.i;
    }
    
    @Override
    public final void d() {
        final ddy k = this.k;
        if (k != null) {
            k.d();
        }
    }
    
    @Override
    public final void f(final dca dca, final ddx ddx) {
        try {
            final boolean externalStorageLegacy = Environment.isExternalStorageLegacy();
            Object k = null;
            CharSequence string = null;
            Object b = null;
            Label_0294: {
                if (externalStorageLegacy) {
                    final dij c = this.c;
                    final Uri e = this.e;
                    try {
                        final Cursor query = this.b.getContentResolver().query(e, dja.a, (String)null, (String[])null, (String)null);
                        Label_0174: {
                            if (query == null) {
                                break Label_0174;
                            }
                            try {
                                if (!query.moveToFirst()) {
                                    k = String.valueOf(e);
                                    string = new StringBuilder("Failed to media store entry for: ");
                                    ((StringBuilder)string).append((String)k);
                                    throw new FileNotFoundException(((StringBuilder)string).toString());
                                }
                                string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    final File file = new File((String)string);
                                    query.close();
                                    c.b(file, this.f, this.g, this.h);
                                    break Label_0294;
                                }
                                k = String.valueOf(e);
                                string = new StringBuilder("File path was empty in media store for: ");
                                ((StringBuilder)string).append((String)k);
                                throw new FileNotFoundException(((StringBuilder)string).toString());
                            }
                            finally {}
                        }
                    }
                    finally {
                        b = string;
                    }
                    if (b != null) {
                        ((Cursor)b).close();
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
                    b = this.d.b(uri, this.f, this.g, this.h);
                }
            }
            if (b != null) {
                k = ((aln)b).b;
            }
            if (k == null) {
                final String value = String.valueOf(this.e);
                final StringBuilder sb = new StringBuilder("Failed to build fetcher for: ");
                sb.append(value);
                ddx.e(new IllegalArgumentException(sb.toString()));
                return;
            }
            this.k = (ddy)k;
            if (this.j) {
                this.lq();
                return;
            }
            ((ddy)k).f(dca, ddx);
        }
        catch (final FileNotFoundException ex) {
            ddx.e(ex);
        }
    }
    
    @Override
    public final int g() {
        return 1;
    }
    
    @Override
    public final void lq() {
        this.j = true;
        final ddy k = this.k;
        if (k != null) {
            k.lq();
        }
    }
}
