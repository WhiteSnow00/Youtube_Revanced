import android.text.TextUtils;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnq
{
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final long e;
    
    private abnq(final String a, final int b, final String c, final long d, final long e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static abnq a(final Uri uri) {
        final String queryParameter = uri.getQueryParameter("v");
        final String queryParameter2 = uri.getQueryParameter("i");
        final String queryParameter3 = uri.getQueryParameter("x");
        final String queryParameter4 = uri.getQueryParameter("l");
        final String queryParameter5 = uri.getQueryParameter("m");
        if (!TextUtils.isEmpty((CharSequence)queryParameter) && queryParameter2 != null && queryParameter3 != null && queryParameter4 != null && queryParameter5 != null) {
            return new abnq(queryParameter, Integer.parseInt(queryParameter2), queryParameter3, Long.parseLong(queryParameter4), Long.parseLong(queryParameter5));
        }
        return null;
    }
}
