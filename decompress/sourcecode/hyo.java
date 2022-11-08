import java.util.concurrent.Callable;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.innertube.guide.impl.GuideControllerImpl$WatchWhileLifecycleObserver;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyo implements hyk, tec
{
    public final vou a;
    public final tdz b;
    public final fem c;
    public final Resources d;
    public final zki e;
    public final atje f;
    public final atje g;
    public final asho h;
    public final atjj i;
    public final GuideControllerImpl$WatchWhileLifecycleObserver j;
    public final ewl k;
    public final Executor l;
    public ashe m;
    public final uyf n;
    public final eg o;
    public final mck p;
    
    public hyo(final vou a, final tdz b, final asho h, final fem c, final Resources d, final zki e, final eg o, final uyf n, final mck p17, final atjj i, final GuideControllerImpl$WatchWhileLifecycleObserver j, final ewl k, final Executor l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = ((atje)atix.e()).aX();
        this.g = ((atje)atix.e()).aX();
        a.getClass();
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        this.o = o;
        this.e = e;
        this.h = h;
        this.n = n;
        this.p = p17;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public static amzo c(final String s, final String s2, final akbe akbe) {
        final agza builder = ((agzi)amzo.a).createBuilder();
        final agza builder2 = ((agzi)amzl.a).createBuilder();
        builder2.copyOnWrite();
        final amzl amzl = (amzl)builder2.instance;
        amzl.b |= 0x1;
        amzl.e = s;
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        final agzg browseEndpoint = BrowseEndpointOuterClass.browseEndpoint;
        final agza builder3 = ((agzi)aial.a).createBuilder();
        builder3.copyOnWrite();
        final aial aial = (aial)builder3.instance;
        aial.b |= 0x1;
        aial.c = s;
        agzc.e((agyr)browseEndpoint, (Object)builder3.build());
        builder2.copyOnWrite();
        final amzl amzl2 = (amzl)builder2.instance;
        final aioe g = (aioe)((agza)agzc).build();
        g.getClass();
        amzl2.g = g;
        amzl2.b |= 0x4;
        final agzc agzc2 = (agzc)((agzi)akbf.a).createBuilder();
        ((agza)agzc2).copyOnWrite();
        final akbf akbf = (akbf)agzc2.instance;
        akbf.c = akbe.sv;
        akbf.b |= 0x1;
        builder2.copyOnWrite();
        final amzl amzl3 = (amzl)builder2.instance;
        final akbf d = (akbf)((agza)agzc2).build();
        d.getClass();
        amzl3.d = d;
        amzl3.c = 5;
        final ajsq g2 = abyh.g(new String[] { s2 });
        builder2.copyOnWrite();
        final amzl amzl4 = (amzl)builder2.instance;
        g2.getClass();
        amzl4.h = g2;
        amzl4.b |= 0x10;
        builder.copyOnWrite();
        final amzo amzo = (amzo)builder.instance;
        final amzl c = (amzl)builder2.build();
        c.getClass();
        amzo.c = c;
        amzo.b = 117501096;
        return (amzo)builder.build();
    }
    
    public final ashe a() {
        final ashe m = this.m;
        m.getClass();
        return m;
    }
    
    public final asgy b() {
        final ashp d = this.d();
        this.f.tr((Object)d);
        return d.i().F();
    }
    
    public final ashp d() {
        return ashp.s((Callable)new hxj(this, 4)).J((asjc)hym.b).o();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final res res = (res)o;
            this.g.tr((Object)ttx.a);
            array = null;
        }
        else {
            array = new Class[] { res.class };
        }
        return array;
    }
}
