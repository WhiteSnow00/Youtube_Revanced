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

public final class cya
{
    public final Object a;
    
    public cya() {
        this.a = new ArrayList();
    }
    
    public cya(final long n) {
        this.a = new dih(n);
    }
    
    public cya(final Context a) {
        this.a = a;
    }
    
    public cya(final DisplayMetrics a) {
        this.a = a;
    }
    
    public cya(final View a) {
        this.a = a;
    }
    
    public cya(final atke a) {
        a.getClass();
        this.a = a;
    }
    
    public cya(final atke a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public cya(final atke a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public cya(final atke a, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
    }
    
    public cya(final atke a, final char[] array) {
        a.getClass();
        this.a = a;
    }
    
    public cya(final cya cya, final byte[] array, final byte[] array2) {
        this.a = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>((Map<?, ?>)cya.a));
    }
    
    public cya(final dun a) {
        this.a = a;
    }
    
    public cya(final dzo a) {
        this.a = a;
    }
    
    public cya(final Class a) {
        this.a = a;
    }
    
    public cya(final Object a) {
        this.a = a;
    }
    
    public cya(final pvh a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
    }
    
    public cya(final qqr a) {
        this.a = a;
    }
    
    public cya(final tmx a) {
        this.a = a;
    }
    
    public cya(final byte[] array) {
        this.a = new HashMap();
    }
    
    public cya(final byte[] array, final byte[] array2) {
        this.a = new ArrayDeque();
    }
    
    public cya(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new HashMap();
        new HashMap();
    }
    
    public cya(final byte[] array, final byte[] array2, final char[] array3) {
        this.a = new HashMap();
    }
    
    public cya(final byte[] array, final byte[] array2, final short[] array3) {
        this.a = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
    }
    
    public cya(final byte[] array, final char[] array2) {
        this.a = new HashSet();
    }
    
    public cya(final byte[] array, final short[] array2) {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public cya(final char[] array, final byte[] array2) {
        this.a = new ArrayList();
    }
    
    public cya(final char[] array, final byte[] array2, final byte[] array3) {
        this.a = DesugarCollections.synchronizedMap((Map)new HashMap());
    }
    
    public cya(final char[] array, final char[] array2) {
        this.a = new ArgbEvaluator();
    }
    
    public cya(final int[] array) {
        this.a = new Rect();
    }
    
    public cya(final short[] array) {
        this.a = new HashSet();
    }
    
    private static String J(final String s) {
        return "imageprefetch_".concat(String.valueOf(s));
    }
    
    public static String c(String s, final cxz cxz, final boolean b) {
        final String replaceAll = s.replaceAll("\\W+", "");
        if (b) {
            s = ".temp".concat(String.valueOf(cxz.c));
        }
        else {
            s = cxz.c;
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
            final tqv tqv = (tqv)iterator.next();
            if (n2 == n) {
                break;
            }
            list2.add(tqv.b);
            ++n2;
        }
        return list2;
    }
    
    public static List k(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((dub)iterator.next()).b);
        }
        return list2;
    }
    
    public static List l(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((dub)iterator.next()).a);
        }
        return list2;
    }
    
    public static cya w(final cya cya) {
        final cya cya2 = new cya((char[])null, null, null);
        if (cya != null) {
            synchronized (cya.a) {
                ((Map<Object, Object>)cya2.a).putAll((Map<?, ?>)cya.a);
            }
        }
        return cya2;
    }
    
    public static cya x(final cya cya) {
        if (cya == null) {
            return null;
        }
        return w(cya);
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
    
    public final gag C(final Context context, final View view) {
        final acpk acpk = (acpk)((atke)this.a).a();
        acpk.getClass();
        context.getClass();
        view.getClass();
        return new gag(acpk, context, view);
    }
    
    public final gag D(final Context context, final ViewStub viewStub) {
        final acpk acpk = (acpk)((atke)this.a).a();
        acpk.getClass();
        context.getClass();
        viewStub.getClass();
        return new gag(acpk, context, viewStub);
    }
    
    public final ListenableFuture E() {
        return aftq.e(((qqr)this.a).a(), (aezf)fng.l, (Executor)afum.a);
    }
    
    public final ListenableFuture F() {
        return aftq.e(((qqr)this.a).a(), (aezf)fng.m, (Executor)afum.a);
    }
    
    public final ListenableFuture G() {
        return ((qqr)this.a).b((aezf)new fng(13), (Executor)afum.a);
    }
    
    public final ListenableFuture H() {
        return aftq.e(((tmx)this.a).a(), (aezf)fng.k, (Executor)afum.a);
    }
    
    public final fth I(final String s) {
        final otk otk = (otk)((atke)this.a).a();
        otk.getClass();
        return new fth(otk, s);
    }
    
    public final File a() {
        final File file = new File(((Context)((pvh)this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
    
    public final File b(String c, final InputStream inputStream, final cxz cxz) {
        c = c((String)c, cxz, true);
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
    
    public final void d(final cvl cvl) {
        ((List<cvl>)this.a).add(cvl);
    }
    
    public final void e(final Path path) {
        int size = ((List)this.a).size();
        while (--size >= 0) {
            czr.g(path, (cvl)((List<Object>)this.a).get(size));
        }
    }
    
    public final boolean f(final Class clazz) {
        return ((Map)this.a).containsKey(clazz);
    }
    
    public final Object g(Object f, final int n, final int n2) {
        final dii a = dii.a(f, n, n2);
        f = ((dpd)this.a).f((Object)a);
        a.b();
        return f;
    }
    
    public final void h(final Object o, final int n, final int n2, final Object o2) {
        ((dpd)this.a).g((Object)dii.a(o, n, n2), o2);
    }
    
    public final void i(final ddk ddk, final dfq dfq) {
        final Object a = this.a;
        if (dfq.equals(((Map<K, Object>)a).get((Object)ddk))) {
            ((Map<K, Object>)a).remove(ddk);
        }
    }
    
    public final eei m(final Object b, final int a) {
        final Object a2 = this.a;
        final eak eak = new eak();
        eak.a = a;
        eak.b = b;
        eak.c = null;
        final dun dun = (dun)a2;
        final eei eei = (eei)dun.b.l().P(dun, eak);
        if (eei != null) {
            final boolean a3 = dyp.a;
            return eei;
        }
        throw new IllegalStateException("Method annotated with '@OnEvent(RenderEvent.class)' is not allowed to return 'null'.");
    }
    
    public final void n(final String s, final int n, final String s2) {
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().n(s, n, s2);
        }
    }
    
    public final void o(final String s, final int n, final eei eei, final String s2) {
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().o(s, n, eei, s2);
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
    
    public final void r(final String s, final int n, final eei eei, final String s2) {
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().r(s, n, eei, s2);
        }
    }
    
    public final boolean s(final dst dst) {
        final String j = J(coy.l(dst));
        return ((Map)this.a).containsKey(j) && (int)((Map<Object, Object>)this.a).get(j) == 1;
    }
    
    public final void t(final dst dst, final int n) {
        ((Map<String, Integer>)this.a).put(J(coy.l(dst)), Integer.valueOf(n));
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
    
    public final gdh z(final gdj gdj) {
        final vcy vcy = (vcy)((atke)this.a).a();
        vcy.getClass();
        gdj.getClass();
        return new gdh(vcy, gdj);
    }
}
