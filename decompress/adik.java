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

public final class adik
{
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public adik(final long a, final bjp c, final FormatStreamModel d, final bpl b, final biw e) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public adik(final Context context, final adjh adjh, final adie d, final adif b) {
        this.e = new adij(this);
        this.b = b;
        this.d = d;
        this.c = new Handler(context.getMainLooper());
        aoqo aoqo;
        if ((aoqo = adjh.b().i) == null) {
            aoqo = aoqo.a;
        }
        this.a = aoqo.b;
    }
    
    public adik(final String c, final String d, final String b, final long a, final Object e) {
        khl.aZ(c);
        khl.aZ(b);
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
        this.e = e;
    }
    
    public adik(final String s, final Set set, final LinkedHashSet set2, final List list, final List list2, final long n) {
        final afev m = afev.m(s, set);
        final afev i = afev.m(s, set2);
        final afev j = afev.m(s, list);
        Map<Object, Object> map;
        if (list2 != null) {
            map = afev.m(s, list2);
        }
        else {
            map = Collections.emptyMap();
        }
        this(m, i, j, map, n);
    }
    
    public adik(final Map b, final Map e, final Map c, final Map d, final long a) {
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
        return ((biw)this.e).d();
    }
    
    public final long e() {
        return ((biw)this.e).f(this.a);
    }
    
    public final long f(final long n) {
        return this.h(n) + ((biw)this.e).b(n, this.a);
    }
    
    public final long g(final long n) {
        return ((biw)this.e).g(n, this.a);
    }
    
    public final long h(final long n) {
        return ((biw)this.e).h(n);
    }
    
    public final bjm i(final long n) {
        return ((biw)this.e).i(n);
    }
    
    public final long j(final bjh bjh, final long n) {
        if (this.e() == -1L && bjh.f != -9223372036854775807L) {
            return Math.max(this.d(), this.g(n - bax.w(bjh.a) - bax.w(bjh.d(0).a) - bax.w(bjh.f)));
        }
        return this.d();
    }
    
    public final long k(final bjh bjh, long g) {
        final long e = this.e();
        if (e == -1L) {
            g = this.g(g - bax.w(bjh.a) - bax.w(bjh.d(0).a));
        }
        else {
            g = this.d() + e;
        }
        return g - 1L;
    }
}
