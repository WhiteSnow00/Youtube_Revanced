import android.content.SharedPreferences;
import java.util.Locale;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout;
import java.util.Set;
import java.io.File;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.IdentityHashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adge
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public adge(final int a) {
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.d = new IdentityHashMap();
        this.a = a;
    }
    
    public adge(final int a, final String b, final List list, final byte[] d) {
        this.a = a;
        this.b = b;
        List<Object> c;
        if (list == null) {
            c = Collections.emptyList();
        }
        else {
            c = Collections.unmodifiableList((List<?>)list);
        }
        this.c = c;
        this.d = d;
    }
    
    public adge(final int a, final int[] b, final int[] d, final int[] c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public adge(final Context context, final int a) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        final File dir = context.getDir("pccache", 0);
        ntc.R(dir, false);
        this.d = dir;
        final File dir2 = context.getDir("tmppccache", 0);
        ntc.R(dir2, true);
        this.b = dir2;
        this.a = a;
    }
    
    public adge(final Context context, final asid b, final vwa d, final tqf c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = tpe.aZ(context.getResources().getDisplayMetrics(), 768);
    }
    
    public adge(final audb b, final List c, final List d, final int a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public adge(final String b, final int a, final String c, final Set d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public adge(final String b, final oby c, final int a, final List d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public adge(final String s, final byte[] array, final afeq b, final String d, final int a) {
        tvb.n(s);
        this.c = zdf.a((Object)array);
        this.b = b;
        tvb.n(d);
        this.d = d;
        this.a = a;
    }
    
    public adge(final List b, final List d, final yfx c, final int a) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public adge(final lvk c, final byte[] d, final aghv[] b, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public adge(final pzi d, final int a, final dmx c, final String b, final byte[] array, final byte[] array2) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adge(final String[] c, final int[] b, final String[] d, final int a) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public static void a(final RelativeLayout relativeLayout, final int n) {
        relativeLayout.getClass();
        relativeLayout.setTranslationY((float)n);
        tpe.aF((View)relativeLayout, tpe.aq(n), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    public static String e(final eny eny) {
        return mvl.a(((agzk)eny).toByteArray());
    }
    
    public final ListenableFuture b(final boolean b) {
        final long currentTimeMillis = System.currentTimeMillis();
        ListenableFuture listenableFuture;
        if (b) {
            listenableFuture = ((pzi)this.d).a();
        }
        else {
            listenableFuture = ((pzi)this.d).b();
        }
        afnd.s(listenableFuture, (afva)new qai(this, b, currentTimeMillis, (byte[])null), (Executor)afum.a);
        return listenableFuture;
    }
    
    public final ListenableFuture c(final boolean b, final String s, final int n) {
        final long currentTimeMillis = System.currentTimeMillis();
        ListenableFuture listenableFuture;
        if (b) {
            listenableFuture = ((pzi)this.d).c(s, n);
        }
        else {
            listenableFuture = ((pzi)this.d).d(s, n);
        }
        afnd.s(listenableFuture, (afva)new qah(this, n, b, currentTimeMillis, (byte[])null, (byte[])null), (Executor)afum.a);
        return listenableFuture;
    }
    
    public final File d() {
        final File file = new File((File)this.d, Integer.toString(this.a - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
    
    public final String f() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(a - 1);
        return sb.toString();
    }
    
    public final String g() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(a - 1);
        return sb.toString();
    }
    
    public final eny h(final int n) {
        String s;
        if (n == 1) {
            s = ((SharedPreferences)this.c).getString(this.g(), (String)null);
        }
        else {
            s = ((SharedPreferences)this.c).getString(this.f(), (String)null);
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        try {
            final eny eny = (eny)ahbh.parseFrom((ahbh)eny.a, ahab.x(mvl.b(s)));
            final String c = eny.c;
            File file;
            if (!(file = ntc.N(c, "pcam.jar", this.d())).exists()) {
                file = ntc.N(c, "pcam", this.d());
            }
            final File n2 = ntc.N(c, "pcbc", this.d());
            if (file.exists() && n2.exists()) {
                return eny;
            }
            return null;
        }
        catch (final ahca ahca) {
            return null;
        }
    }
    
    public final String i(final String s, final long n, final int n2, final long n3) {
        final StringBuilder sb = new StringBuilder();
        int n4 = 0;
        int a;
        while (true) {
            a = this.a;
            if (n4 >= a) {
                break;
            }
            sb.append(((String[])this.c)[n4]);
            final int n5 = ((int[])this.b)[n4];
            if (n5 == 1) {
                sb.append(s);
            }
            else if (n5 == 2) {
                sb.append(String.format(Locale.US, ((String[])this.d)[n4], n));
            }
            else if (n5 == 3) {
                sb.append(String.format(Locale.US, ((String[])this.d)[n4], n2));
            }
            else if (n5 == 4) {
                sb.append(String.format(Locale.US, ((String[])this.d)[n4], n3));
            }
            ++n4;
        }
        sb.append(((String[])this.c)[a]);
        return sb.toString();
    }
}
