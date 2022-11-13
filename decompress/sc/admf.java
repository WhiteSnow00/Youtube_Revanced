import java.util.Collection;
import java.util.Iterator;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admf implements Runnable
{
    public final admj a;
    
    public admf(final admj a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final admj a = this.a;
        final Object l = a.l;
        monitorenter(l);
        try {
            if (a.m == null) {
                a.D();
                monitorexit(l);
                return;
            }
            Object o;
            try {
                o = Collections.unmodifiableCollection(a.e.d((aezs)new qxo(a, 17)).values());
            }
            catch (final adkv adkv) {
                ttr.d("Failed to fetch uploads yet to be transferred.", (Throwable)adkv);
                o = afeq.q();
            }
            final int size = ((Collection)o).size();
            final int size2 = a.n.size();
            a.i = size2;
            if (size > 0) {
                a.i = size2 - size + 1;
            }
            final afq afq = (afq)a.k.a();
            final admi admi = a.n.get(a.m);
            final int j = a.j;
            Label_1218: {
                boolean a2;
                if (j != 0) {
                    a2 = a.g.a(afq, j);
                }
                else {
                    if (admi == null) {
                        break Label_1218;
                    }
                    final adml g = a.g;
                    final int size3 = a.n.size();
                    final int i = a.i;
                    final Resources resources = g.a.getResources();
                    boolean b = false;
                    final String quantityString = resources.getQuantityString(2131886167, size3, new Object[] { i, size3 });
                    boolean b2;
                    if (!TextUtils.equals(g.c, (CharSequence)quantityString)) {
                        afq.j(g.c = quantityString);
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    String d = "";
                    final long f = admi.f;
                    if (f > 0L && admi.e > 0L) {
                        d = g.a.getResources().getString(2132020073, new Object[] { tvb.f(admi.e), tvb.e(g.a.getResources(), admi.e), tvb.f(admi.f), tvb.e(g.a.getResources(), admi.f) });
                    }
                    else if (f > 0L && admi.g > 0L) {
                        d = g.a.getResources().getString(2132020072);
                    }
                    else if (admi.h > 0.0) {
                        d = g.a.getResources().getString(2132020072);
                    }
                    boolean b3;
                    if (!TextUtils.equals((CharSequence)d, g.d)) {
                        afq.i(g.d = d);
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    byte[] g2;
                    if ((g2 = admi.i) == null) {
                        g2 = ((agzk)vdb.a("FEmy_videos")).toByteArray();
                    }
                    boolean b4;
                    if (!Arrays.equals(g2, g.g)) {
                        g.g = g2;
                        final Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setClassName("com.google.android.youtube", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
                        intent.setFlags(67108864);
                        intent.putExtra("navigation_endpoint", g2);
                        afq.g = PendingIntent.getActivity(g.a, 0, intent, 201326592);
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    final double n = admi.h * 100.0;
                    final long f2 = admi.f;
                    double min = 0.0;
                    Label_0703: {
                        if (f2 > 0L) {
                            final long e = admi.e;
                            if (e > 0L) {
                                final double n2 = (double)(e * 100L);
                                final double n3 = (double)f2;
                                Double.isNaN(n2);
                                Double.isNaN(n3);
                                min = Math.min(n2 / n3, 100.0);
                                break Label_0703;
                            }
                        }
                        min = 0.0;
                    }
                    final long f3 = admi.f;
                    double min2 = 0.0;
                    Label_0773: {
                        if (f3 > 0L) {
                            final long g3 = admi.g;
                            if (g3 > 0L) {
                                final double n4 = (double)(g3 * 100L);
                                final double n5 = (double)f3;
                                Double.isNaN(n4);
                                Double.isNaN(n5);
                                min2 = Math.min(n4 / n5, 100.0);
                                break Label_0773;
                            }
                        }
                        min2 = 0.0;
                    }
                    boolean b5 = false;
                    Label_0945: {
                        Label_0820: {
                            if (min > 0.0) {
                                final int f4 = g.f;
                                final int f5 = (int)min;
                                if (f4 == f5) {
                                    break Label_0820;
                                }
                                afq.p(100, g.f = f5, false);
                            }
                            else if (min2 > 0.0) {
                                final int f6 = g.f;
                                final int f7 = (int)min2;
                                if (f6 == f7) {
                                    break Label_0820;
                                }
                                afq.p(100, g.f = f7, false);
                            }
                            else if (n > 0.0) {
                                final int f8 = g.f;
                                final int f9 = (int)n;
                                if (f8 == f9) {
                                    break Label_0820;
                                }
                                afq.p(100, g.f = f9, false);
                            }
                            else {
                                if (g.f == -3) {
                                    break Label_0820;
                                }
                                g.f = -3;
                                afq.p(100, 0, false);
                            }
                            b5 = true;
                            break Label_0945;
                        }
                        b5 = false;
                    }
                    final int f10 = g.f;
                    boolean b6 = false;
                    Label_1065: {
                        if (f10 > 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(f10);
                            sb.append("%");
                            final String string = sb.toString();
                            b6 = b5;
                            if (TextUtils.equals((CharSequence)string, g.e)) {
                                break Label_1065;
                            }
                            afq.h(g.e = string);
                        }
                        else {
                            b6 = b5;
                            if (TextUtils.equals(g.e, (CharSequence)"")) {
                                break Label_1065;
                            }
                            afq.h(g.e = "");
                        }
                        b6 = true;
                    }
                    final Bitmap d2 = admi.d;
                    boolean b8;
                    if (d2 != null) {
                        final Bitmap b7 = g.b;
                        if (b7 != null && d2 == b7) {
                            b8 = false;
                        }
                        else {
                            afq.m(g.b = d2);
                            b8 = true;
                        }
                    }
                    else {
                        b8 = false;
                        b = true;
                    }
                    boolean b9 = b8;
                    if (b) {
                        b9 = b8;
                        if (g.b != null) {
                            afq.m(g.b = null);
                            b9 = true;
                        }
                    }
                    a2 = (b9 | (b6 | (b2 | b3 | b4)));
                }
                if (a2) {
                    ((NotificationManager)a.c.getSystemService("notification")).notify(5, afq.a());
                }
            }
            if (!a.o.isEmpty()) {
                final Iterator iterator = a.o.iterator();
                while (iterator.hasNext()) {
                    a.y((String)iterator.next());
                    iterator.remove();
                }
            }
            if (a.m == null) {
                a.D();
            }
            monitorexit(l);
        }
        finally {
            monitorexit(l);
            while (true) {}
        }
    }
}
