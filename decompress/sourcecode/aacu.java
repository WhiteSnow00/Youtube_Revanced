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
public final class aacu
{
    aahk a;
    private final Key b;
    private boolean c;
    private final zzu d;
    
    public aacu(final zzu d, final Key b) {
        this.d = d;
        this.b = b;
    }
    
    public final aacv a(final zzd zzd) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final aack a = this.d.a();
            final aach h = a.h();
            final int a2 = h.a(zzd.g(), zzd.a());
            if (a2 == -1) {
                final aacv x = aaiw.x(zzd, 0, list, 3);
                monitorexit(this);
                return x;
            }
            this.c = false;
            final zyv c = h.c(zzd.g(), zzd.a(), a2, 0);
            if (c != null) {
                final byte[] b = ((zyn)c).b;
                if (b != null && b.length == 10) {
                    this.c = true;
                }
            }
            this.a = new aahk(this.c);
            final int n = (int)Math.pow(2.0, a2) * 4096;
            final double n2 = (double)zzd.b();
            final double n3 = n;
            Double.isNaN(n2);
            Double.isNaN(n3);
            final int n4 = (int)Math.ceil(n2 / n3);
            final zrx c2 = a.c();
            lwm lwm2;
            final lwm lwm = lwm2 = null;
            if (c2 != null) {
                final Iterator iterator = ((zrv)c2).h().iterator();
                do {
                    lwm2 = lwm;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    lwm2 = (lwm)iterator.next();
                } while (!lwm2.h().contains(zzd.f()));
            }
            if (lwm2 == null) {
                final aacv x2 = aaiw.x(zzd, 0, list, 3);
                monitorexit(this);
                return x2;
            }
            final byte[] array = new byte[n];
            for (int i = 0; i < n4; ++i) {
                final zyv c3 = h.c(zzd.g(), zzd.a(), a2, i);
                if (c3 != null && ((zyn)c3).b != null) {
                    final long n5 = i * n;
                    final int n6 = (int)Math.min(n, zzd.b() - n5);
                    final bay bay = new bay(this.b.getEncoded(), (bbk)new lwp(lwm2, (bbk)aact.a, (bbk)new lwy("Offline"), (bbi)null, 4, (yyt)null));
                    Object o = zzd.f();
                    final bbo bbo = new bbo(Uri.EMPTY, n5, (long)n6, (String)o);
                    try {
                        ((bbk)bay).b(bbo);
                        ((bbk)bay).a(array, 0, n6);
                        this.a.c();
                        o = aahk.a(this.c);
                        final double n7 = n6;
                        Double.isNaN(n7);
                        for (int n8 = (int)Math.ceil(n7 / 4096.0), j = 0; j < n8; ++j) {
                            final int n9 = j * 4096;
                            final int min = Math.min(4096, n6 - n9);
                            ((aahi)o).b();
                            ((aahi)o).c(array, n9, min);
                            this.a.b(((aahi)o).d());
                        }
                        if (!Arrays.equals(this.a.d(), ((zyn)c3).b)) {
                            aaiw.y(n5, zzd, list);
                        }
                    }
                    catch (final IOException ex) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't read from data source for ");
                        sb.append((String)o);
                        sb.append("\n");
                        trn.d(sb.toString(), (Throwable)ex);
                        aaiw.y(n5, zzd, list);
                    }
                }
                else {
                    aaiw.y((long)(i * n), zzd, list);
                }
            }
            final aacv x3 = aaiw.x(zzd, n, list, 3);
            monitorexit(this);
            return x3;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
