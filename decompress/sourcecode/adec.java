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

public final class adec
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public adec(final int a) {
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.d = new IdentityHashMap();
        this.a = a;
    }
    
    public adec(final int a, final String b, final List list, final byte[] d) {
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
    
    public adec(final int a, final int[] b, final int[] d, final int[] c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public adec(final Context context, final int a) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        final File dir = context.getDir("pccache", 0);
        nmr.I(dir, false);
        this.d = dir;
        final File dir2 = context.getDir("tmppccache", 0);
        nmr.I(dir2, true);
        this.b = dir2;
        this.a = a;
    }
    
    public adec(final Context context, final asho b, final vup d, final toa c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = tmy.aZ(context.getResources().getDisplayMetrics(), 768);
    }
    
    public adec(final auck b, final List c, final List d, final int a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public adec(final String b, final int a, final String c, final Set d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public adec(final String b, final oas c, final int a, final List d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public adec(final String s, final byte[] array, final afcr b, final String d, final int a) {
        tsx.n(s);
        this.c = zbm.a((Object)array);
        this.b = b;
        tsx.n(d);
        this.d = d;
        this.a = a;
    }
    
    public adec(final List b, final List d, final yeb c, final int a) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public adec(final luf c, final byte[] d, final agfu[] b, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public adec(final pxx d, final int a, final dmw c, final String b, final byte[] array, final byte[] array2) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adec(final String[] c, final int[] b, final String[] d, final int a) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public static void a(final RelativeLayout relativeLayout, final int n) {
        relativeLayout.getClass();
        relativeLayout.setTranslationY((float)n);
        tmy.aF((View)relativeLayout, tmy.aq(n), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    public static String e(final enx enx) {
        return muh.a(((agxl)enx).toByteArray());
    }
    
    public final ListenableFuture b(final boolean b) {
        final long currentTimeMillis = System.currentTimeMillis();
        ListenableFuture listenableFuture;
        if (b) {
            listenableFuture = ((pxx)this.d).a();
        }
        else {
            listenableFuture = ((pxx)this.d).b();
        }
        afld.o(listenableFuture, (afsz)new pyx(this, b, currentTimeMillis, (byte[])null), (Executor)afsl.a);
        return listenableFuture;
    }
    
    public final ListenableFuture c(final boolean b, final String s, final int n) {
        final long currentTimeMillis = System.currentTimeMillis();
        ListenableFuture listenableFuture;
        if (b) {
            listenableFuture = ((pxx)this.d).c(s, n);
        }
        else {
            listenableFuture = ((pxx)this.d).d(s, n);
        }
        afld.o(listenableFuture, (afsz)new pyw(this, n, b, currentTimeMillis, (byte[])null, (byte[])null), (Executor)afsl.a);
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
    
    public final enx h(final int n) {
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
            final enx enx = (enx)agzi.parseFrom((agzi)enx.a, agyc.x(muh.b(s)));
            final String c = enx.c;
            File file;
            if (!(file = nmr.E(c, "pcam.jar", this.d())).exists()) {
                file = nmr.E(c, "pcam", this.d());
            }
            final File e = nmr.E(c, "pcbc", this.d());
            if (file.exists() && e.exists()) {
                return enx;
            }
            return null;
        }
        catch (final ahab ahab) {
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
