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

public final class emw extends enu
{
    private static final cya j;
    private final Context h;
    private final ehn i;
    
    static {
        j = new cya((short[])null);
    }
    
    public emw(final emj emj, final agza agza, final int n, final Context h, final ehn i) {
        super(emj, "JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", agza, n, 27);
        this.h = h;
        this.i = i;
    }
    
    public static String c(final ehn ehn) {
        if (ehn != null && (ehn.b & 0x2) != 0x0) {
            ehp ehp;
            if ((ehp = ehn.d) == null) {
                ehp = ehp.a;
            }
            if (!emm.g(ehp.b)) {
                ehp ehp2;
                if ((ehp2 = ehn.d) == null) {
                    ehp2 = ehp.a;
                }
                return ehp2.b;
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
            final ehs i = this.a.i;
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
        Object h = emw.j.g(this.h.getPackageName());
        synchronized (h) {
            final eks eks = ((AtomicReference<eks>)h).get();
            if (eks == null || emm.g(eks.a) || eks.a.equals("E") || eks.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                int n;
                if (!emm.g(c(this.i))) {
                    n = 5;
                }
                else {
                    final ehn i = this.i;
                    Boolean b;
                    if (!emm.g(c(i))) {
                        b = false;
                    }
                    else {
                        boolean b2 = false;
                        Label_0163: {
                            if (i != null && (i.b & 0x1) != 0x0) {
                                eho eho;
                                if ((eho = i.c) == null) {
                                    eho = eho.a;
                                }
                                final int c = epc.C(eho.c);
                                if (c != 0) {
                                    if (c == 4) {
                                        b2 = true;
                                        break Label_0163;
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
                final Boolean b4 = (Boolean)mcs.f.e();
                String b5;
                if (mcs.e.e()) {
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
                        if (emm.g(b5)) {
                            d = this.d();
                        }
                    }
                }
                final eks eks2 = new eks((String)this.d.invoke(null, this.h, b3, d));
                if (emm.g(eks2.a) || eks2.a.equals("E")) {
                    if (--n != 3) {
                        if (n == 4) {
                            ehp ehp;
                            if ((ehp = this.i.d) == null) {
                                ehp = ehp.a;
                            }
                            eks2.a = ehp.b;
                        }
                    }
                    else {
                        final String d2 = this.d();
                        if (!emm.g(d2)) {
                            eks2.a = d2;
                        }
                    }
                }
                ((AtomicReference<eks>)h).set(eks2);
            }
            final eks eks3 = ((AtomicReference<eks>)h).get();
            monitorexit(h);
            final agza g = this.g;
            monitorenter(g);
            if (eks3 == null) {
                return;
            }
            try {
                final agza g2 = this.g;
                h = eks3.a;
                g2.copyOnWrite();
                final ehs ehs = (ehs)g2.instance;
                final ehs a = ehs.a;
                ((AtomicReference)h).getClass();
                ehs.b |= 0x400000;
                ehs.s = (String)h;
                h = this.g;
                final long b6 = eks3.b;
                ((agza)h).copyOnWrite();
                h = ((agza)h).instance;
                ((ehs)h).b |= 0x20000000;
                ((ehs)h).y = b6;
                final agza g3 = this.g;
                h = eks3.c;
                g3.copyOnWrite();
                final ehs ehs2 = (ehs)g3.instance;
                h.getClass();
                ehs2.b |= 0x10000000;
                ehs2.x = (String)h;
                final agza g4 = this.g;
                h = eks3.d;
                g4.copyOnWrite();
                final ehs ehs3 = (ehs)g4.instance;
                h.getClass();
                ehs3.c |= 0x80;
                ehs3.H = (String)h;
                h = this.g;
                final String e = eks3.e;
                ((agza)h).copyOnWrite();
                h = ((agza)h).instance;
                e.getClass();
                ((ehs)h).c |= 0x100;
                ((ehs)h).I = e;
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
            final byte[] i = emm.i((String)mcs.g.e());
            final ArrayList list = new ArrayList();
            list.add(instance.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                list.add(instance.generateCertificate(new ByteArrayInputStream(emm.i((String)mcs.h.e()))));
            }
            final Context h = this.h;
            final String packageName = h.getPackageName();
            final ExecutorService b = this.a.b;
            if (Build$VERSION.SDK_INT > 30 || Build$VERSION.CODENAME.equals("S")) {
                final SettableFuture create = SettableFuture.create();
                h.getPackageManager().requestChecksums(packageName, false, 8, (List)list, (PackageManager$OnChecksumsReadyListener)new env(create));
                s = (String)create.get();
            }
            return s;
        }
        catch (final CertificateEncodingException | PackageManager$NameNotFoundException | ExecutionException | InterruptedException | CertificateException | NoClassDefFoundError certificateEncodingException | PackageManager$NameNotFoundException | ExecutionException | InterruptedException | CertificateException | NoClassDefFoundError) {
            return s;
        }
    }
}
