import java.util.concurrent.Executor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.Collection;
import java.net.URISyntaxException;
import java.net.URI;
import java.util.ArrayList;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdj extends arvy
{
    static final long a;
    public static final long b;
    private static final Logger n;
    private static final asea o;
    private static final arur p;
    private static final aruj q;
    asea c;
    public asea d;
    public final List e;
    final arwy f;
    arwr g;
    final String h;
    public String i;
    final arur j;
    final aruj k;
    public long l;
    final arvc m;
    private final asdg r;
    
    static {
        n = Logger.getLogger(asdj.class.getName());
        a = TimeUnit.MINUTES.toMillis(30L);
        b = TimeUnit.SECONDS.toMillis(1L);
        o = asfq.c(asby.l);
        p = arur.b;
        q = aruj.a;
    }
    
    public asdj(final SocketAddress socketAddress, final String s, final asdg r) {
        final asea o = asdj.o;
        this.c = o;
        this.d = o;
        this.e = new ArrayList();
        final arwy a = arwy.a();
        this.f = a;
        this.g = a.a;
        this.j = asdj.p;
        this.k = asdj.q;
        this.l = asdj.a;
        this.m = arvc.a;
        this.h = b(socketAddress);
        r.getClass();
        this.r = r;
        this.g = new asdi(socketAddress, s);
    }
    
    static String b(final SocketAddress socketAddress) {
        try {
            final String value = String.valueOf(socketAddress);
            final StringBuilder sb = new StringBuilder("/");
            sb.append(value);
            return new URI("directaddress", "", sb.toString(), null).toString();
        }
        catch (final URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final arvx a() {
        final asah a = this.r.a();
        final asfq c = asfq.c(asby.l);
        final afaq n = asby.n;
        final ArrayList list = new ArrayList(this.e);
        final arub arub = null;
        arub arub2 = null;
        Label_0200: {
            try {
                final Method declaredMethod = Class.forName("aryu").getDeclaredMethod("getClientInterceptor", Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
                final Boolean value = true;
                arub2 = (arub)declaredMethod.invoke(null, value, value, false, value);
                break Label_0200;
            }
            catch (final InvocationTargetException ex) {
                asdj.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex);
            }
            catch (final IllegalAccessException ex2) {
                asdj.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex2);
            }
            catch (final NoSuchMethodException ex3) {
                asdj.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex3);
            }
            catch (final ClassNotFoundException ex4) {
                asdj.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex4);
            }
            arub2 = null;
        }
        if (arub2 != null) {
            list.add(0, arub2);
        }
        arub arub3;
        try {
            arub3 = (arub)Class.forName("aryv").getDeclaredMethod("getClientInterceptor", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (final InvocationTargetException ex5) {
            asdj.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex5);
            arub3 = arub;
        }
        catch (final IllegalAccessException ex6) {
            asdj.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex6);
            arub3 = arub;
        }
        catch (final NoSuchMethodException ex7) {
            asdj.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex7);
            arub3 = arub;
        }
        catch (final ClassNotFoundException ex8) {
            asdj.n.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", ex8);
            arub3 = arub;
        }
        if (arub3 != null) {
            list.add(0, arub3);
        }
        return (arvx)new asdl((arvx)new asdf(this, a, c, n, list, asfw.a));
    }
    
    public final void c(final Executor executor) {
        if (executor != null) {
            this.c = new asfq(executor, 1);
            return;
        }
        this.c = asdj.o;
    }
}
