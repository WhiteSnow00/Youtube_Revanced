import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ExecutorService;
import java.security.cert.CertificateException;
import android.content.pm.PackageManager$NameNotFoundException;
import java.security.cert.CertificateEncodingException;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;
import com.google.common.util.concurrent.SettableFuture;
import android.os.Build$VERSION;
import android.os.Build;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.security.cert.CertificateFactory;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emx extends env
{
    private static final cyb j;
    private final Context h;
    private final eho i;
    
    static {
        j = new cyb((short[])null);
    }
    
    public emx(final emk emk, final ahaz ahaz, final int n, final Context h, final eho i) {
        super(emk, "JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", ahaz, n, 27);
        this.h = h;
        this.i = i;
    }
    
    public static String c(final eho eho) {
        if (eho != null && (eho.b & 0x2) != 0x0) {
            ehq ehq;
            if ((ehq = eho.d) == null) {
                ehq = ehq.a;
            }
            if (!emn.g(ehq.b)) {
                ehq ehq2;
                if ((ehq2 = eho.d) == null) {
                    ehq2 = ehq.a;
                }
                return ehq2.b;
            }
        }
        return null;
    }
    
    private final String d() {
        try {
            final Future j = this.a.j;
            if (j != null) {
                j.get();
            }
            final eht i = this.a.i;
            if (i != null && (i.b & 0x400000) != 0x0) {
                return i.s;
            }
            return null;
        }
        catch (final InterruptedException | ExecutionException ex) {
            return null;
        }
    }
    
    private final boolean e() {
        return this.a.m;
    }
    
    protected final void a() {
        Object h = emx.j.g(this.h.getPackageName());
        synchronized (h) {
            final ekt ekt = ((AtomicReference<ekt>)h).get();
            if (ekt == null || emn.g(ekt.a) || ekt.a.equals("E") || ekt.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                int n;
                if (!emn.g(c(this.i))) {
                    n = 5;
                }
                else {
                    final eho i = this.i;
                    Boolean b;
                    if (!emn.g(c(i))) {
                        b = false;
                    }
                    else {
                        boolean b2 = false;
                        Label_0178: {
                            if (i != null && (i.b & 0x1) != 0x0) {
                                ehp ehp;
                                if ((ehp = i.c) == null) {
                                    ehp = ehp.a;
                                }
                                final int c = epf.C(ehp.c);
                                if (c != 0) {
                                    if (c == 4) {
                                        b2 = true;
                                        break Label_0178;
                                    }
                                }
                            }
                            b2 = false;
                        }
                        b = b2;
                    }
                    if (b && this.e()) {
                        n = 4;
                    }
                    else {
                        n = 3;
                    }
                }
                final boolean b3 = n == 3;
                final Boolean b4 = (Boolean)mdx.f.e();
                String b5;
                if (mdx.e.e()) {
                    b5 = this.b();
                }
                else {
                    b5 = null;
                }
                String d = b5;
                if (b4) {
                    d = b5;
                    if (this.e()) {
                        d = b5;
                        if (emn.g(b5)) {
                            d = this.d();
                        }
                    }
                }
                final ekt ekt2 = new ekt((String)this.d.invoke(null, this.h, b3, d));
                if (emn.g(ekt2.a) || ekt2.a.equals("E")) {
                    if (--n != 3) {
                        if (n == 4) {
                            ehq ehq;
                            if ((ehq = this.i.d) == null) {
                                ehq = ehq.a;
                            }
                            ekt2.a = ehq.b;
                        }
                    }
                    else {
                        final String d2 = this.d();
                        if (!emn.g(d2)) {
                            ekt2.a = d2;
                        }
                    }
                }
                ((AtomicReference<ekt>)h).set(ekt2);
            }
            final ekt ekt3 = ((AtomicReference<ekt>)h).get();
            monitorexit(h);
            final ahaz g = this.g;
            monitorenter(g);
            if (ekt3 == null) {
                return;
            }
            try {
                final ahaz g2 = this.g;
                h = ekt3.a;
                g2.copyOnWrite();
                final eht eht = (eht)g2.instance;
                final eht a = eht.a;
                ((AtomicReference)h).getClass();
                eht.b |= 0x400000;
                eht.s = (String)h;
                h = this.g;
                final long b6 = ekt3.b;
                ((ahaz)h).copyOnWrite();
                h = ((ahaz)h).instance;
                ((eht)h).b |= 0x20000000;
                ((eht)h).y = b6;
                final ahaz g3 = this.g;
                h = ekt3.c;
                g3.copyOnWrite();
                final eht eht2 = (eht)g3.instance;
                h.getClass();
                eht2.b |= 0x10000000;
                eht2.x = (String)h;
                final ahaz g4 = this.g;
                h = ekt3.d;
                g4.copyOnWrite();
                final eht eht3 = (eht)g4.instance;
                h.getClass();
                eht3.c |= 0x80;
                eht3.H = (String)h;
                h = this.g;
                final String e = ekt3.e;
                ((ahaz)h).copyOnWrite();
                h = ((ahaz)h).instance;
                e.getClass();
                ((eht)h).c |= 0x100;
                ((eht)h).I = e;
            }
            finally {
                monitorexit(g);
            }
        }
    }
    
    protected final String b() {
        String s = null;
        try {
            final CertificateFactory instance = CertificateFactory.getInstance("X.509");
            final byte[] i = emn.i((String)mdx.g.e());
            final ArrayList list = new ArrayList();
            list.add(instance.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                list.add(instance.generateCertificate(new ByteArrayInputStream(emn.i((String)mdx.h.e()))));
            }
            final Context h = this.h;
            final String packageName = h.getPackageName();
            final ExecutorService b = this.a.b;
            if (Build$VERSION.SDK_INT > 30 || Build$VERSION.CODENAME.equals("S")) {
                final SettableFuture create = SettableFuture.create();
                h.getPackageManager().requestChecksums(packageName, false, 8, (List)list, (PackageManager$OnChecksumsReadyListener)new enw(create));
                s = (String)create.get();
            }
            return s;
        }
        catch (final CertificateEncodingException | PackageManager$NameNotFoundException | ExecutionException | InterruptedException | CertificateException | NoClassDefFoundError certificateEncodingException | PackageManager$NameNotFoundException | ExecutionException | InterruptedException | CertificateException | NoClassDefFoundError) {
            return s;
        }
    }
}
