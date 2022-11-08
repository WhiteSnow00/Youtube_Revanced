import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arss
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    
    public arss() {
    }
    
    public arss(final byte[] array) {
        this.c = null;
        this.a = null;
        this.b = null;
        this.d = null;
    }
    
    public static String i(final String s, final Object... array) {
        return String.format(Locale.ROOT, s, array);
    }
    
    public static ThreadFactory l(final arss arss) {
        final Object c = arss.c;
        final Object a = arss.a;
        final Object b = arss.b;
        Object o;
        if ((o = arss.d) == null) {
            o = Executors.defaultThreadFactory();
        }
        AtomicLong atomicLong;
        if (c != null) {
            atomicLong = new AtomicLong(0L);
        }
        else {
            atomicLong = null;
        }
        return (ThreadFactory)new afud((ThreadFactory)o, (String)c, atomicLong, (Boolean)a, (Integer)b);
    }
    
    public final arsv a() {
        this.a.getClass();
        this.b.getClass();
        this.c.getClass();
        agot.E(true, (Object)"at least one of channelRef and subchannelRef must be null");
        return new arsv((String)this.a, (arst)this.b, (long)this.c, null, (artf)this.d, null);
    }
    
    public final void b(final long n) {
        this.c = n;
    }
    
    public final arsr c() {
        return new arsr((SocketAddress)this.a, (InetSocketAddress)this.c, (String)this.d, (String)this.b);
    }
    
    public final void d(final SocketAddress a) {
        a.getClass();
        this.a = a;
    }
    
    public final void e(final InetSocketAddress c) {
        c.getClass();
        this.c = c;
    }
    
    public final aggd f() {
        return new aggd((String)this.b, (String)this.a, (String)null, (String)null, (String)this.c, (String)null, (String)this.d);
    }
    
    public final void g(final String a) {
        kgk.aW(a, "ApiKey must be set.");
        this.a = a;
    }
    
    public final void h(final String b) {
        kgk.aW(b, "ApplicationId must be set.");
        this.b = b;
    }
    
    public final void j(final boolean b) {
        this.a = b;
    }
    
    public final void k(final String c) {
        i(c, 0);
        this.c = c;
    }
}
