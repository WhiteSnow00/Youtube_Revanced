import java.util.Set;
import java.io.OutputStream;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.graphics.Path;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.File;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.view.ViewStub;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import java.util.List;
import android.graphics.Rect;
import android.animation.ArgbEvaluator;
import j$.util.DesugarCollections;
import java.util.WeakHashMap;
import java.util.HashSet;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import android.view.View;
import android.util.DisplayMetrics;
import android.content.Context;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxz
{
    public final Object a;
    
    public cxz() {
        this.a = new ArrayList();
    }
    
    public cxz(final long n) {
        this.a = new dig(n);
    }
    
    public cxz(final aagm a, final byte[] array) {
        this.a = a;
    }
    
    public cxz(final Context a) {
        this.a = a;
    }
    
    public cxz(final DisplayMetrics a) {
        this.a = a;
    }
    
    public cxz(final View a) {
        this.a = a;
    }
    
    public cxz(final atjj a) {
        a.getClass();
        this.a = a;
    }
    
    public cxz(final atjj a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public cxz(final atjj a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public cxz(final atjj a, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
    }
    
    public cxz(final atjj a, final char[] array) {
        a.getClass();
        this.a = a;
    }
    
    public cxz(final cxz cxz, final byte[] array, final byte[] array2) {
        this.a = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>((Map<?, ?>)cxz.a));
    }
    
    public cxz(final dum a) {
        this.a = a;
    }
    
    public cxz(final dzn a) {
        this.a = a;
    }
    
    public cxz(final Class a) {
        this.a = a;
    }
    
    public cxz(final Object a) {
        this.a = a;
    }
    
    public cxz(final qpt a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
    }
    
    public cxz(final tku a) {
        this.a = a;
    }
    
    public cxz(final byte[] array) {
        this.a = new HashMap();
    }
    
    public cxz(final byte[] array, final byte[] array2) {
        this.a = new ArrayDeque();
    }
    
    public cxz(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new HashMap();
        new HashMap();
    }
    
    public cxz(final byte[] array, final byte[] array2, final char[] array3) {
        this.a = new HashMap();
    }
    
    public cxz(final byte[] array, final byte[] array2, final short[] array3) {
        this.a = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
    }
    
    public cxz(final byte[] array, final char[] array2) {
        this.a = new HashSet();
    }
    
    public cxz(final byte[] array, final short[] array2) {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public cxz(final char[] array, final byte[] array2) {
        this.a = new ArrayList();
    }
    
    public cxz(final char[] array, final byte[] array2, final byte[] array3) {
        this.a = DesugarCollections.synchronizedMap((Map)new HashMap());
    }
    
    public cxz(final char[] array, final char[] array2) {
        this.a = new ArgbEvaluator();
    }
    
    public cxz(final int[] array) {
        this.a = new Rect();
    }
    
    public cxz(final short[] array) {
        this.a = new HashSet();
    }
    
    private static String J(final String s) {
        return "imageprefetch_".concat(String.valueOf(s));
    }
    
    public static String c(String s, final cxy cxy, final boolean b) {
        final String replaceAll = s.replaceAll("\\W+", "");
        if (b) {
            s = ".temp".concat(String.valueOf(cxy.c));
        }
        else {
            s = cxy.c;
        }
        final StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(replaceAll);
        sb.append(s);
        return sb.toString();
    }
    
    public static List j(final int n, final List list) {
        final ArrayList list2 = new ArrayList(n);
        final Iterator iterator = list.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final toq toq = (toq)iterator.next();
            if (n2 == n) {
                break;
            }
            list2.add(toq.b);
            ++n2;
        }
        return list2;
    }
    
    public static List k(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((dua)iterator.next()).b);
        }
        return list2;
    }
    
    public static List l(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((dua)iterator.next()).a);
        }
        return list2;
    }
    
    public static cxz w(final cxz cxz) {
        final cxz cxz2 = new cxz((char[])null, null, null);
        if (cxz != null) {
            synchronized (cxz.a) {
                ((Map<Object, Object>)cxz2.a).putAll((Map<?, ?>)cxz.a);
            }
        }
        return cxz2;
    }
    
    public static cxz x(final cxz cxz) {
        if (cxz == null) {
            return null;
        }
        return w(cxz);
    }
    
    public final CharSequence A(final int n) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)((Context)this.a).getString(n));
        spannableStringBuilder.setSpan((Object)new TextAppearanceSpan((Context)this.a, 2132084065), 0, spannableStringBuilder.length(), 33);
        return (CharSequence)spannableStringBuilder;
    }
    
    public final CharSequence B(final int n) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)((Context)this.a).getString(n));
        spannableStringBuilder.setSpan((Object)new TextAppearanceSpan((Context)this.a, 2132084087), 0, spannableStringBuilder.length(), 33);
        return (CharSequence)spannableStringBuilder;
    }
    
    public final fzy C(final Context context, final View view) {
        final acng acng = (acng)((atjj)this.a).a();
        acng.getClass();
        context.getClass();
        view.getClass();
        return new fzy(acng, context, view);
    }
    
    public final fzy D(final Context context, final ViewStub viewStub) {
        final acng acng = (acng)((atjj)this.a).a();
        acng.getClass();
        context.getClass();
        viewStub.getClass();
        return new fzy(acng, context, viewStub);
    }
    
    public final ListenableFuture E() {
        return afrp.e(((aagm)this.a).b(), (aexg)fna.l, (Executor)afsl.a);
    }
    
    public final ListenableFuture F() {
        return afrp.e(((aagm)this.a).b(), (aexg)fna.m, (Executor)afsl.a);
    }
    
    public final ListenableFuture G() {
        return ((aagm)this.a).c((aexg)new fna(13), (Executor)afsl.a);
    }
    
    public final ListenableFuture H() {
        return afrp.e(((tku)this.a).a(), (aexg)fna.k, (Executor)afsl.a);
    }
    
    public final fsz I(final String s) {
        final osb osb = (osb)((atjj)this.a).a();
        osb.getClass();
        return new fsz(osb, s);
    }
    
    public final File a() {
        final File file = new File(((Context)((qpt)this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
    
    public final File b(String c, final InputStream inputStream, final cxy cxy) {
        c = c((String)c, cxy, true);
        final File file = new File(this.a(), (String)c);
        try {
            c = new FileOutputStream(file);
            try {
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = inputStream.read(array);
                    if (read == -1) {
                        break;
                    }
                    ((OutputStream)c).write(array, 0, read);
                }
                ((OutputStream)c).flush();
                ((OutputStream)c).close();
                inputStream.close();
                return file;
            }
            finally {
                ((OutputStream)c).close();
            }
        }
        finally {
            inputStream.close();
            while (true) {}
        }
    }
    
    public final void d(final cvk cvk) {
        ((List<cvk>)this.a).add(cvk);
    }
    
    public final void e(final Path path) {
        int size = ((List)this.a).size();
        while (--size >= 0) {
            czq.g(path, (cvk)((List<Object>)this.a).get(size));
        }
    }
    
    public final boolean f(final Class clazz) {
        return ((Map)this.a).containsKey(clazz);
    }
    
    public final Object g(Object f, final int n, final int n2) {
        final dih a = dih.a(f, n, n2);
        f = ((dpc)this.a).f((Object)a);
        a.b();
        return f;
    }
    
    public final void h(final Object o, final int n, final int n2, final Object o2) {
        ((dpc)this.a).g((Object)dih.a(o, n, n2), o2);
    }
    
    public final void i(final ddj ddj, final dfp dfp) {
        final Object a = this.a;
        if (dfp.equals(((Map<K, Object>)a).get((Object)ddj))) {
            ((Map<K, Object>)a).remove(ddj);
        }
    }
    
    public final eeh m(final Object b, final int a) {
        final Object a2 = this.a;
        final eaj eaj = new eaj();
        eaj.a = a;
        eaj.b = b;
        eaj.c = null;
        final dum dum = (dum)a2;
        final eeh eeh = (eeh)dum.b.l().P(dum, (Object)eaj);
        if (eeh != null) {
            final boolean a3 = dyo.a;
            return eeh;
        }
        throw new IllegalStateException("Method annotated with '@OnEvent(RenderEvent.class)' is not allowed to return 'null'.");
    }
    
    public final void n(final String s, final int n, final String s2) {
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().n(s, n, s2);
        }
    }
    
    public final void o(final String s, final int n, final eeh eeh, final String s2) {
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().o(s, n, eeh, s2);
        }
    }
    
    public final void p(final String s, final int n, final int n2, final String s2) {
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().p(s, n, n2, s2);
        }
    }
    
    public final void q(final String s, final Object o, final Object o2, final String s2, final String s3, final Boolean b, final String s4) {
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().q(s, o, o2, s2, s3, b, s4);
        }
    }
    
    public final void r(final String s, final int n, final eeh eeh, final String s2) {
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().r(s, n, eeh, s2);
        }
    }
    
    public final boolean s(final dss dss) {
        final String j = J(cox.l(dss));
        return ((Map)this.a).containsKey(j) && (int)((Map<Object, Object>)this.a).get(j) == 1;
    }
    
    public final void t(final dss dss, final int n) {
        ((Map<String, Integer>)this.a).put(J(cox.l(dss)), Integer.valueOf(n));
    }
    
    public final Object u(final Class clazz) {
        return ((Map<K, Object>)this.a).get(clazz);
    }
    
    public final void v(final Class clazz, final Object o) {
        ((Map<Class, Object>)this.a).put(clazz, o);
    }
    
    public final boolean y(final PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }
    
    public final gcy z(final gda gda) {
        final vax vax = (vax)((atjj)this.a).a();
        vax.getClass();
        gda.getClass();
        return new gcy(vax, gda);
    }
}
