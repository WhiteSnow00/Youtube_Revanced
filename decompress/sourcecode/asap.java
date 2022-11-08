import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.io.IOException;
import java.util.logging.Level;
import java.io.InputStream;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URISyntaxException;
import java.net.URI;
import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import io.grpc.Status$Code;
import java.util.Set;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asap
{
    public static final arub a;
    public static final arub b;
    public static final arub c;
    public static final arub d;
    public static final arub e;
    static final arub f;
    public static final arub g;
    public static final arub h;
    public static final arub i;
    public static final arvb j;
    public static final arrj k;
    public static final asez l;
    public static final asez m;
    public static final aeyr n;
    private static final Logger o;
    private static final Set p;
    private static final arxi q;
    
    static {
        o = Logger.getLogger(asap.class.getName());
        p = Collections.unmodifiableSet((Set<?>)EnumSet.of(Status$Code.a, Status$Code.d, Status$Code.f, Status$Code.g, Status$Code.j, Status$Code.k, Status$Code.l, Status$Code.p));
        Charset.forName("US-ASCII");
        a = arub.c("grpc-timeout", (artx)new asao(0));
        b = arub.c("grpc-encoding", arug.c);
        c = artc.b("grpc-accept-encoding", (artb)new asar(1));
        d = arub.c("content-encoding", arug.c);
        e = artc.b("accept-encoding", (artb)new asar(1));
        f = arub.c("content-length", arug.c);
        g = arub.c("content-type", arug.c);
        h = arub.c("te", arug.c);
        i = arub.c("user-agent", arug.c);
        aeyk.b(',').e();
        TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        j = (arvb)new asdb();
        k = arrj.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        q = new arxi(null, null);
        l = (asez)new asam();
        m = (asez)new asan();
        n = (aeyr)new acyx(3);
    }
    
    private asap() {
    }
    
    public static Status a(final int n) {
        Status$Code status$Code = null;
        Label_0127: {
            if (n >= 100 && n < 200) {
                status$Code = Status$Code.n;
            }
            else {
                Label_0123: {
                    if (n != 400) {
                        if (n == 401) {
                            status$Code = Status$Code.q;
                            break Label_0127;
                        }
                        if (n == 403) {
                            status$Code = Status$Code.h;
                            break Label_0127;
                        }
                        if (n != 404) {
                            if (n != 429) {
                                if (n == 431) {
                                    break Label_0123;
                                }
                                switch (n) {
                                    default: {
                                        status$Code = Status$Code.c;
                                        break Label_0127;
                                    }
                                    case 502:
                                    case 503:
                                    case 504: {
                                        break;
                                    }
                                }
                            }
                            status$Code = Status$Code.o;
                            break Label_0127;
                        }
                        status$Code = Status$Code.m;
                        break Label_0127;
                    }
                }
                status$Code = Status$Code.n;
            }
        }
        final Status b = status$Code.b();
        final StringBuilder sb = new StringBuilder("HTTP status code ");
        sb.append(n);
        return b.withDescription(sb.toString());
    }
    
    public static Status b(final Status status) {
        agot.u(status != null);
        Status c = status;
        if (asap.p.contains(status.getCode())) {
            final Status k = Status.k;
            final String string = status.getCode().toString();
            final String description = status.getDescription();
            final StringBuilder sb = new StringBuilder("Inappropriate status code from control plane: ");
            sb.append(string);
            sb.append(" ");
            sb.append(description);
            c = k.withDescription(sb.toString()).c(status.o);
        }
        return c;
    }
    
    public static aryw c(final artk artk, final boolean b) {
        final artn b2 = artk.b;
        aryw a;
        if (b2 != null) {
            a = ((asfj)b2.b()).a();
        }
        else {
            a = null;
        }
        if (a == null) {
            if (!artk.c.f()) {
                if (artk.d) {
                    return (aryw)new asaf(b(artk.c), aryu.c);
                }
                if (!b) {
                    return (aryw)new asaf(b(artk.c), aryu.a);
                }
            }
            return null;
        }
        return a;
    }
    
    public static String d(final String s, final int n) {
        try {
            return new URI(null, null, s, n, null, null, null).getAuthority();
        }
        catch (final URISyntaxException ex) {
            final StringBuilder sb = new StringBuilder("Invalid host or port: ");
            sb.append(s);
            sb.append(" ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString(), ex);
        }
    }
    
    public static String e(final InetSocketAddress inetSocketAddress) {
        try {
            return (String)InetSocketAddress.class.getMethod("getHostString", (Class<?>[])new Class[0]).invoke(inetSocketAddress, new Object[0]);
        }
        catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
            return inetSocketAddress.getHostName();
        }
    }
    
    static void f(final asfe asfe) {
        while (true) {
            final InputStream g = asfe.g();
            if (g == null) {
                break;
            }
            g(g);
        }
    }
    
    public static void g(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (final IOException ex) {
            asap.o.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", ex);
        }
    }
    
    public static boolean h(String lowerCase) {
        if (lowerCase == null) {
            return false;
        }
        if (lowerCase.length() < 16) {
            return false;
        }
        lowerCase = lowerCase.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        final char char1 = lowerCase.charAt(16);
        return char1 == '+' || char1 == ';';
    }
    
    public static boolean i(final arrk arrk) {
        return !Boolean.TRUE.equals(arrk.e(asap.k));
    }
    
    public static String j(final String s) {
        final StringBuilder sb = new StringBuilder();
        if (s != null) {
            sb.append(s);
            sb.append(' ');
        }
        sb.append("grpc-java-cronet/1.51.0-SNAPSHOT");
        return sb.toString();
    }
    
    public static ThreadFactory k(final String s) {
        final arss arss = new arss((byte[])null);
        arss.j(true);
        arss.k(s);
        return arss.l(arss);
    }
    
    public static arxi[] l(final arrk arrk) {
        final List d = arrk.d;
        final int n = d.size() + 1;
        final arxi[] array = new arxi[n];
        arrk.getClass();
        for (int i = 0; i < d.size(); ++i) {
            array[i] = ((aqzg)d.get(i)).A();
        }
        array[n - 1] = asap.q;
        return array;
    }
}
