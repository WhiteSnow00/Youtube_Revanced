import java.net.PasswordAuthentication;
import java.util.List;
import java.net.URISyntaxException;
import java.net.SocketAddress;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.logging.Level;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aseh implements arxc
{
    public static final Logger a;
    private static final afaq c;
    private static final asfn d;
    public final InetSocketAddress b;
    
    static {
        a = Logger.getLogger(aseh.class.getName());
        d = new asfn();
        c = (afaq)new adba(4);
    }
    
    public aseh() {
        final afaq c = aseh.c;
        final asfn d = aseh.d;
        final String getenv = System.getenv("GRPC_PROXY_EXP");
        c.getClass();
        d.getClass();
        if (getenv != null) {
            final String[] split = getenv.split(":", 2);
            int int1;
            if (split.length > 1) {
                int1 = Integer.parseInt(split[1]);
            }
            else {
                int1 = 80;
            }
            aseh.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.b = new InetSocketAddress(split[0], int1);
            return;
        }
        this.b = null;
    }
    
    public static final arxb a(final InetSocketAddress inetSocketAddress) {
        final Object o = null;
        try {
            final String e = asby.e(inetSocketAddress);
            try {
                final URI uri = new URI("https", null, e, inetSocketAddress.getPort(), null, null, null);
                final ProxySelector default1 = ProxySelector.getDefault();
                if (default1 == null) {
                    aseh.a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                final List<Proxy> select = default1.select(uri);
                if (select.size() > 1) {
                    aseh.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                final Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                final InetSocketAddress inetSocketAddress2 = (InetSocketAddress)proxy.address();
                final PasswordAuthentication b = asfn.b(asby.e(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
                InetSocketAddress inetSocketAddress3 = inetSocketAddress2;
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                final aruy a = arux.a();
                a.e(inetSocketAddress);
                a.d((SocketAddress)inetSocketAddress3);
                if (b == null) {
                    return (arxb)a.c();
                }
                a.d = b.getUserName();
                Object b2;
                if (b.getPassword() == null) {
                    b2 = o;
                }
                else {
                    b2 = new String(b.getPassword());
                }
                a.b = b2;
                return (arxb)a.c();
            }
            catch (final URISyntaxException ex) {
                aseh.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", ex);
                return null;
            }
        }
        finally {
            final Throwable t;
            aseh.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", t);
            return null;
        }
    }
}
