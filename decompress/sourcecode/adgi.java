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

public final class adgi
{
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public adgi(final long a, final bjo c, final FormatStreamModel d, final bpk b, final biv e) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public adgi(final Context context, final adhe adhe, final adgc d, final adgd b) {
        this.e = new adgh(this);
        this.b = b;
        this.d = d;
        this.c = new Handler(context.getMainLooper());
        aool aool;
        if ((aool = adhe.b().i) == null) {
            aool = aool.a;
        }
        this.a = aool.b;
    }
    
    public adgi(final String c, final String d, final String b, final long a, final Object e) {
        kgk.aV(c);
        kgk.aV(b);
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
        this.e = e;
    }
    
    public adgi(final String s, final Set set, final LinkedHashSet set2, final List list, final List list2, final long n) {
        final afcw m = afcw.m((Object)s, (Object)set);
        final afcw i = afcw.m((Object)s, (Object)set2);
        final afcw j = afcw.m((Object)s, (Object)list);
        Object o;
        if (list2 != null) {
            o = afcw.m((Object)s, (Object)list2);
        }
        else {
            o = Collections.emptyMap();
        }
        this((Map)m, (Map)i, (Map)j, (Map)o, n);
    }
    
    public adgi(final Map b, final Map e, final Map c, final Map d, final long a) {
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
        return ((biv)this.e).d();
    }
    
    public final long e() {
        return ((biv)this.e).f(this.a);
    }
    
    public final long f(final long n) {
        return this.h(n) + ((biv)this.e).b(n, this.a);
    }
    
    public final long g(final long n) {
        return ((biv)this.e).g(n, this.a);
    }
    
    public final long h(final long n) {
        return ((biv)this.e).h(n);
    }
    
    public final bjl i(final long n) {
        return ((biv)this.e).i(n);
    }
    
    public final long j(final bjg bjg, final long n) {
        if (this.e() == -1L && bjg.f != -9223372036854775807L) {
            return Math.max(this.d(), this.g(n - baw.w(bjg.a) - baw.w(bjg.d(0).a) - baw.w(bjg.f)));
        }
        return this.d();
    }
    
    public final long k(final bjg bjg, long g) {
        final long e = this.e();
        if (e == -1L) {
            g = this.g(g - baw.w(bjg.a) - baw.w(bjg.d(0).a));
        }
        else {
            g = this.d() + e;
        }
        return g - 1L;
    }
}
