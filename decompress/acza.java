import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acza
{
    private static final String a = "acza";
    
    private acza() {
    }
    
    public static void a(final vex vex, final String s, final boolean b, final boolean b2) {
        if (s.isEmpty()) {
            return;
        }
        final apwu d = apwv.d(s);
        final ahcr a = d.a;
        final boolean booleanValue = (boolean)b;
        a.copyOnWrite();
        final apwx apwx = (apwx)a.instance;
        final apwx a2 = apwx.a;
        apwx.b |= 0x80;
        apwx.j = booleanValue;
        final ahcr a3 = d.a;
        final boolean booleanValue2 = (boolean)b2;
        a3.copyOnWrite();
        final apwx apwx2 = (apwx)a3.instance;
        apwx2.b |= 0x100;
        apwx2.k = booleanValue2;
        final byte[] d2 = d.b().d();
        final ahcr builder = ((ahcz)ajrx.a).createBuilder();
        final ahgk b3 = ahgl.b();
        b3.e(new int[] { 8, 9 });
        final aeka a4 = b3.a();
        builder.copyOnWrite();
        final ajrx ajrx = (ajrx)builder.instance;
        a4.getClass();
        ajrx.d = a4;
        ajrx.b |= 0x2;
        final ajrx ajrx2 = (ajrx)builder.build();
        final vhe d3 = vex.d();
        d3.i(s, ajrx2, d2);
        d3.b().U();
    }
    
    public static void b(final vex vex, final String s, final String h) {
        if (!s.isEmpty()) {
            if (!h.isEmpty()) {
                final apwu d = apwv.d(s);
                final ahcr a = d.a;
                a.copyOnWrite();
                final apwx apwx = (apwx)a.instance;
                final apwx a2 = apwx.a;
                h.getClass();
                apwx.b |= 0x20;
                apwx.h = h;
                final byte[] d2 = d.b().d();
                final ahcr builder = ((ahcz)ajrx.a).createBuilder();
                final ahgk b = ahgl.b();
                b.e(new int[] { 6 });
                final aeka a3 = b.a();
                builder.copyOnWrite();
                final ajrx ajrx = (ajrx)builder.instance;
                a3.getClass();
                ajrx.d = a3;
                ajrx.b |= 0x2;
                final ajrx ajrx2 = (ajrx)builder.build();
                final vhe d3 = vex.d();
                d3.i(s, ajrx2, d2);
                d3.b().U();
            }
        }
    }
    
    public static void c(final vex vex, final String s, String f, final boolean b) {
        if (s.isEmpty()) {
            return;
        }
        final Uri parse = Uri.parse(f);
        final apwu d = apwv.d(s);
        final ahcr a = d.a;
        a.copyOnWrite();
        final apwx apwx = (apwx)a.instance;
        final apwx a2 = apwx.a;
        f.getClass();
        apwx.b |= 0x2;
        apwx.d = f;
        f = afbj.e(parse.getHost());
        final ahcr a3 = d.a;
        a3.copyOnWrite();
        final apwx apwx2 = (apwx)a3.instance;
        apwx2.b |= 0x4;
        apwx2.e = f;
        f = afbj.e(parse.getScheme());
        final ahcr a4 = d.a;
        a4.copyOnWrite();
        final apwx apwx3 = (apwx)a4.instance;
        apwx3.b |= 0x8;
        apwx3.f = f;
        final ahcr a5 = d.a;
        final boolean booleanValue = (boolean)b;
        a5.copyOnWrite();
        final apwx apwx4 = (apwx)a5.instance;
        apwx4.b |= 0x40;
        apwx4.i = booleanValue;
        final byte[] d2 = d.b().d();
        final ahcr builder = ((ahcz)ajrx.a).createBuilder();
        final ahgk b2 = ahgl.b();
        b2.e(new int[] { 2, 3, 4, 5, 7 });
        final aeka a6 = b2.a();
        builder.copyOnWrite();
        final ajrx ajrx = (ajrx)builder.instance;
        a6.getClass();
        ajrx.d = a6;
        ajrx.b |= 0x2;
        final ajrx ajrx2 = (ajrx)builder.build();
        final vhe d3 = vex.d();
        d3.i(s, ajrx2, d2);
        d3.b().U();
    }
    
    public static boolean d(final Uri uri, final Context context) {
        try {
            aewf.k(context, new Intent("android.intent.action.VIEW", uri));
            return true;
        }
        catch (final ActivityNotFoundException ex) {
            final String value = String.valueOf(String.valueOf(uri));
            final zng a = zng.a;
            final znf y = znf.y;
            final String a2 = acza.a;
            final StringBuilder sb = new StringBuilder("GenericWebView::");
            sb.append(a2);
            sb.append(" Could not open URL (activity not found): ".concat(value));
            znh.b(a, y, sb.toString());
            return false;
        }
    }
    
    public static void e(final acoe acoe, final int n, final int n2, final String s, final boolean b) {
        f(acoe, n, n2, s, b, -1);
    }
    
    public static void f(final acoe acoe, final int n, final int n2, String e, final boolean e2, final int f) {
        final ahcr builder = apwt.a.createBuilder();
        builder.copyOnWrite();
        final apwt apwt = (apwt)builder.instance;
        apwt.b |= 0x4;
        apwt.e = e2;
        builder.copyOnWrite();
        final apwt apwt2 = (apwt)builder.instance;
        if (n2 != 0) {
            apwt2.d = n2 - 1;
            apwt2.b |= 0x2;
            if (!e.isEmpty()) {
                e = afbj.e(Uri.parse(e).getHost());
                builder.copyOnWrite();
                final apwt apwt3 = (apwt)builder.instance;
                apwt3.b |= 0x1;
                apwt3.c = e;
            }
            if (f > 0) {
                builder.copyOnWrite();
                final apwt apwt4 = (apwt)builder.instance;
                apwt4.b |= 0x8;
                apwt4.f = f;
            }
            final wzh wzh = new wzh(n - 1, 32);
            final ahcr builder2 = ((ahcz)ajve.a).createBuilder();
            final apwt n3 = (apwt)builder.build();
            builder2.copyOnWrite();
            final ajve ajve = (ajve)builder2.instance;
            n3.getClass();
            ajve.n = n3;
            ajve.b |= 0x200000;
            wzh.a = (ajve)builder2.build();
            acoe.d(wzh, ajvy.F);
            return;
        }
        throw null;
    }
}
