import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.PendingIntent;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefr
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final List e;
    private final int f;
    private final List g;
    private final List h;
    private final PendingIntent i;
    
    public aefr() {
    }
    
    public aefr(final int a, final int b, final int f, final long c, final long d, final List g, final List h, final PendingIntent i, final List e) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        this.i = i;
        this.e = e;
    }
    
    public static aefr a(final int n, final int n2, final int n3, final long n4, final long n5, final List list, final List list2) {
        return new aefr(n, n2, n3, n4, n5, list, list2, null, null);
    }
    
    public static aefr b(final Bundle bundle) {
        return new aefr(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent)bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }
    
    public final List c() {
        final List h = this.h;
        ArrayList list;
        if (h != null) {
            list = new ArrayList(h);
        }
        else {
            list = new ArrayList();
        }
        return list;
    }
    
    public final List d() {
        final List g = this.g;
        ArrayList list;
        if (g != null) {
            list = new ArrayList(g);
        }
        else {
            list = new ArrayList();
        }
        return list;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aefr) {
            final aefr aefr = (aefr)o;
            if (this.a == aefr.a && this.b == aefr.b && this.f == aefr.f && this.c == aefr.c && this.d == aefr.d) {
                final List g = this.g;
                if (g == null) {
                    if (aefr.g != null) {
                        return false;
                    }
                }
                else if (!g.equals(aefr.g)) {
                    return false;
                }
                final List h = this.h;
                if (h == null) {
                    if (aefr.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(aefr.h)) {
                    return false;
                }
                final PendingIntent i = this.i;
                if (i == null) {
                    if (aefr.i != null) {
                        return false;
                    }
                }
                else if (!i.equals((Object)aefr.i)) {
                    return false;
                }
                final List e = this.e;
                final List e2 = aefr.e;
                if (e == null) {
                    if (e2 != null) {
                        return false;
                    }
                }
                else if (!e.equals(e2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int f = this.f;
        final long c = this.c;
        final long d = this.d;
        final List g = this.g;
        int hashCode = 0;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        final int n = (int)(c ^ c >>> 32);
        final int n2 = (int)(d ^ d >>> 32);
        final List h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = h.hashCode();
        }
        final PendingIntent i = this.i;
        int hashCode4;
        if (i == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = i.hashCode();
        }
        final List e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return ((((((((a ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ f) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int f = this.f;
        final long c = this.c;
        final long d = this.d;
        final String value = String.valueOf(this.g);
        final String value2 = String.valueOf(this.h);
        final String value3 = String.valueOf(this.i);
        final String value4 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("SplitInstallSessionState{sessionId=");
        sb.append(a);
        sb.append(", status=");
        sb.append(b);
        sb.append(", errorCode=");
        sb.append(f);
        sb.append(", bytesDownloaded=");
        sb.append(c);
        sb.append(", totalBytesToDownload=");
        sb.append(d);
        sb.append(", moduleNamesNullable=");
        sb.append(value);
        sb.append(", languagesNullable=");
        sb.append(value2);
        sb.append(", resolutionIntent=");
        sb.append(value3);
        sb.append(", splitFileIntents=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
