import android.text.TextUtils;
import java.net.URL;
import java.io.File;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhy implements dij
{
    private final int a;
    private final Object b;
    
    public dhy(final Context b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dhy(final Context context, final int a, final byte[] array) {
        this.a = a;
        this.b = context.getApplicationContext();
    }
    
    public dhy(final Context context, final int a, final char[] array) {
        this.a = a;
        this.b = context.getApplicationContext();
    }
    
    public dhy(final dhn b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dhy(final dhw b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dhy(final dij b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    private static Uri c(final String s) {
        return Uri.fromFile(new File(s));
    }
    
    @Override
    public final boolean a(final Object o) {
        final int a = this.a;
        if (a == 0) {
            final File file = (File)o;
            return true;
        }
        if (a == 1) {
            final byte[] array = (byte[])o;
            return true;
        }
        if (a == 2) {
            return ckm.b((Uri)o);
        }
        if (a == 3) {
            final String s = (String)o;
            return true;
        }
        if (a == 4) {
            final Uri uri = (Uri)o;
            return ckm.b(uri) && !ckm.d(uri);
        }
        if (a != 5) {
            final URL url = (URL)o;
            return true;
        }
        final Uri uri2 = (Uri)o;
        return ckm.b(uri2) && ckm.d(uri2);
    }
    
    @Override
    public final aln b(final Object o, final int n, final int n2, final ddp ddp) {
        final int a = this.a;
        if (a == 0) {
            final File file = (File)o;
            return new aln((ddk)new dos((Object)file), (ddy)new dhv(file, (dhw)this.b, 0));
        }
        if (a == 1) {
            final byte[] array = (byte[])o;
            return new aln((ddk)new dos((Object)array), (ddy)new dho(array, (dhn)this.b));
        }
        if (a == 2) {
            final Uri uri = (Uri)o;
            return new aln((ddk)new dos((Object)uri), (ddy)new dif((Context)this.b, uri));
        }
        if (a != 3) {
            if (a != 4) {
                if (a != 5) {
                    return ((dij)this.b).b(new dhz((URL)o), n, n2, ddp);
                }
                final Uri uri2 = (Uri)o;
                if (ckm.c(n, n2)) {
                    final Long n3 = (Long)ddp.b(dkx.a);
                    if (n3 != null && n3 == -1L) {
                        final dos dos = new dos((Object)uri2);
                        final Context context = (Context)this.b;
                        return new aln((ddk)dos, (ddy)dhv.b(context, uri2, (der)new deq(context.getContentResolver())));
                    }
                }
                return null;
            }
            else {
                final Uri uri3 = (Uri)o;
                if (ckm.c(n, n2)) {
                    final dos dos2 = new dos((Object)uri3);
                    final Context context2 = (Context)this.b;
                    return new aln((ddk)dos2, (ddy)dhv.b(context2, uri3, (der)new dep(context2.getContentResolver())));
                }
                return null;
            }
        }
        else {
            final String s = (String)o;
            Uri uri4;
            if (TextUtils.isEmpty((CharSequence)s)) {
                uri4 = null;
            }
            else if (s.charAt(0) == '/') {
                uri4 = c(s);
            }
            else {
                uri4 = Uri.parse(s);
                if (uri4.getScheme() == null) {
                    uri4 = c(s);
                }
            }
            if (uri4 != null && ((dij)this.b).a(uri4)) {
                return ((dij)this.b).b(uri4, n, n2, ddp);
            }
            return null;
        }
    }
}
