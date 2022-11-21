import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;
import android.os.Handler;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adka
{
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public adka(final long a, final bjs c, final FormatStreamModel d, final bpo b, final biz e) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public adka(final Context context, final adkx adkx, final adju d, final adjv b) {
        this.e = new adjz(this);
        this.b = b;
        this.d = d;
        this.c = new Handler(context.getMainLooper());
        aosz aosz;
        if ((aosz = adkx.b().j) == null) {
            aosz = aosz.a;
        }
        this.a = aosz.b;
    }
    
    public adka(final String c, final String d, final String b, final long a, final Object e) {
        kht.aV(c);
        kht.aV(b);
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
        this.e = e;
    }
    
    public adka(final String s, final Set set, final LinkedHashSet set2, final List list, final List list2, final long n) {
        final afgm m = afgm.m(s, set);
        final afgm i = afgm.m(s, set2);
        final afgm j = afgm.m(s, list);
        Map<Object, Object> map;
        if (list2 != null) {
            map = afgm.m(s, list2);
        }
        else {
            map = Collections.emptyMap();
        }
        this(m, i, j, map, n);
    }
    
    public adka(final Map b, final Map e, final Map c, final Map d, final long a) {
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public final LinkedHashSet a(final String s) {
        final LinkedHashSet set = ((Map<K, LinkedHashSet>)this.e).get(s);
        if (set != null) {
            return set;
        }
        return new LinkedHashSet();
    }
    
    public final List b(final String s) {
        final List list = ((Map<K, List>)this.c).get(s);
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }
    
    public final List c(final String s) {
        return ((Map<K, List>)this.d).get(s);
    }
    
    public final long d() {
        return ((biz)this.e).d();
    }
    
    public final long e() {
        return ((biz)this.e).f(this.a);
    }
    
    public final long f(final long n) {
        return this.h(n) + ((biz)this.e).b(n, this.a);
    }
    
    public final long g(final long n) {
        return ((biz)this.e).g(n, this.a);
    }
    
    public final long h(final long n) {
        return ((biz)this.e).h(n);
    }
    
    public final bjp i(final long n) {
        return ((biz)this.e).i(n);
    }
    
    public final long j(final bjk bjk, final long n) {
        if (this.e() == -1L && bjk.f != -9223372036854775807L) {
            return Math.max(this.d(), this.g(n - baz.w(bjk.a) - baz.w(bjk.d(0).a) - baz.w(bjk.f)));
        }
        return this.d();
    }
    
    public final long k(final bjk bjk, long g) {
        final long e = this.e();
        if (e == -1L) {
            g = this.g(g - baz.w(bjk.a) - baz.w(bjk.d(0).a));
        }
        else {
            g = this.d() + e;
        }
        return g - 1L;
    }
}
