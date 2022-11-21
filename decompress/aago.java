import java.util.Iterator;
import java.io.IOException;
import java.util.Arrays;
import android.net.Uri;
import java.util.ArrayList;
import java.security.Key;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aago
{
    aalc a;
    private final Key b;
    private boolean c;
    private final aadl d;
    
    public aago(final aadl d, final Key b) {
        this.d = d;
        this.b = b;
    }
    
    public final aagp a(final aacu aacu) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final aage a = this.d.a();
            final aagb h = a.h();
            int a2 = h.a(aacu.g(), aacu.a());
            if (a2 == -1) {
                final aagp x = aamn.x(aacu, 0, list, 3);
                monitorexit(this);
                return x;
            }
            this.c = false;
            final aacm c = h.c(aacu.g(), aacu.a(), a2, 0);
            if (c != null) {
                final byte[] b = ((aace)c).b;
                if (b != null && b.length == 10) {
                    this.c = true;
                }
            }
            this.a = new aalc(this.c);
            final int n = (int)Math.pow(2.0, a2);
            final double n2 = (double)aacu.b();
            final int n3 = n * 4096;
            final double n4 = n3;
            Double.isNaN(n2);
            Double.isNaN(n4);
            final int n5 = (int)Math.ceil(n2 / n4);
            final zvm c2 = a.c();
            lyf lyf2;
            final lyf lyf = lyf2 = null;
            if (c2 != null) {
                final Iterator iterator = ((zvk)c2).h().iterator();
                do {
                    lyf2 = lyf;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    lyf2 = (lyf)iterator.next();
                } while (!lyf2.h().contains(aacu.f()));
            }
            if (lyf2 == null) {
                final aagp x2 = aamn.x(aacu, 0, list, 3);
                monitorexit(this);
                return x2;
            }
            final byte[] array = new byte[n3];
            for (int i = 0; i < n5; ++i) {
                final aacm c3 = h.c(aacu.g(), aacu.a(), a2, i);
                if (c3 != null && ((aace)c3).b != null) {
                    final long n6 = n3;
                    final long b2 = aacu.b();
                    final long n7 = i * n3;
                    final int n8 = (int)Math.min(n6, b2 - n7);
                    final bbb bbb = new bbb(this.b.getEncoded(), (bbn)new lyi(lyf2, (bbn)aagn.a, (bbn)new lyr("Offline"), (bbl)null, 4, (zch)null));
                    Object o = aacu.f();
                    final bbr bbr = new bbr(Uri.EMPTY, n7, n8, (String)o);
                    try {
                        ((bbn)bbb).b(bbr);
                        try {
                            ((bbn)bbb).a(array, 0, n8);
                            this.a.c();
                            o = aalc.a(this.c);
                            final double n9 = n8;
                            Double.isNaN(n9);
                            for (int n10 = (int)Math.ceil(n9 / 4096.0), j = 0; j < n10; ++j) {
                                final int n11 = j * 4096;
                                final int min = Math.min(4096, n8 - n11);
                                ((aala)o).b();
                                ((aala)o).c(array, n11, min);
                                this.a.b(((aala)o).d());
                            }
                            final int n12 = a2 = a2;
                            if (!Arrays.equals(this.a.d(), ((aace)c3).b)) {
                                aamn.y(n7, aacu, list);
                                a2 = n12;
                            }
                            continue;
                        }
                        catch (final IOException c3) {}
                    }
                    catch (final IOException ex) {}
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't read from data source for ");
                    sb.append((String)o);
                    sb.append("\n");
                    tut.d(sb.toString(), (Throwable)c3);
                    aamn.y(n7, aacu, list);
                }
                else {
                    aamn.y(i * n3, aacu, list);
                }
            }
            final aagp x3 = aamn.x(aacu, n3, list, 3);
            monitorexit(this);
            return x3;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
