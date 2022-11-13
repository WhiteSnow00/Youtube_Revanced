import java.util.Map;
import java.util.Collections;
import android.app.Activity;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import android.os.Bundle;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agq
{
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public agq(final aeqe d, final aqtv c, final byte[] array, final byte[] array2) {
        this.b = new Object();
        this.e = new HashMap();
        this.d = d;
        this.c = c;
        final aezp aezp = (aezp)c.b;
        final boolean h = aezp.h();
        boolean a = false;
        if (h) {
            a = a;
            if (aezp.c() instanceof aeot) {
                a = true;
            }
        }
        this.a = a;
    }
    
    public agq(final CharSequence b, final Bundle c, final Set d) {
        this.e = "com.google.android.libraries.notifications.REPLY_TEXT_KEY";
        this.b = b;
        this.a = true;
        this.c = c;
        this.d = d;
    }
    
    public agq(final String e, final abke abke, final List b, final String d, final sfw c) {
        this.e = e;
        final abke i = abke.i;
        boolean a = true;
        if (abke != i) {
            a = (abke == abke.j && a);
        }
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public agq(final String e, final String b, final boolean a, final vgy c, final amti d) {
        e.getClass();
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public agq(final qho b, final String d, String e, final boolean a) {
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = a;
        final qho qho = b;
        final qoa a2 = qob.a(b.a);
        a2.e("phenotype");
        final StringBuilder sb = new StringBuilder();
        final String s = e;
        sb.append(e);
        sb.append("/");
        e = d;
        sb.append(d);
        sb.append(".pb");
        a2.f(sb.toString());
        if (a) {
            final int a3 = ohm.a;
            a2.d("directboot-files");
        }
        this.c = a2.a();
    }
    
    public static afev a(final qjf qjf) {
        final afes i = afev.i(qjf.h.size() + 3);
        for (final qjg qjg : qjf.h) {
            final int c = qjg.c;
            boolean booleanValue = false;
            int n;
            if (c != 0) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                if (c != 6) {
                                    n = 0;
                                }
                                else {
                                    n = 5;
                                }
                            }
                            else {
                                n = 4;
                            }
                        }
                        else {
                            n = 3;
                        }
                    }
                    else {
                        n = 2;
                    }
                }
                else {
                    n = 1;
                }
            }
            else {
                n = 6;
            }
            if (n == 0) {
                throw null;
            }
            if (--n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                continue;
                            }
                            final String e = qjg.e;
                            ahab b;
                            if (c == 6) {
                                b = (ahab)qjg.d;
                            }
                            else {
                                b = ahab.b;
                            }
                            i.g(e, b.I());
                        }
                        else {
                            final String e2 = qjg.e;
                            String s;
                            if (c == 5) {
                                s = (String)qjg.d;
                            }
                            else {
                                s = "";
                            }
                            i.g(e2, s);
                        }
                    }
                    else {
                        final String e3 = qjg.e;
                        double doubleValue;
                        if (c == 4) {
                            doubleValue = (double)qjg.d;
                        }
                        else {
                            doubleValue = 0.0;
                        }
                        i.g(e3, doubleValue);
                    }
                }
                else {
                    final String e4 = qjg.e;
                    if (c == 3) {
                        booleanValue = (boolean)qjg.d;
                    }
                    i.g(e4, booleanValue);
                }
            }
            else {
                final String e5 = qjg.e;
                long longValue;
                if (c == 2) {
                    longValue = (long)qjg.d;
                }
                else {
                    longValue = 0L;
                }
                i.g(e5, longValue);
            }
        }
        i.g("__phenotype_server_token", qjf.e);
        i.g("__phenotype_snapshot_token", qjf.c);
        i.g("__phenotype_configuration_version", qjf.f);
        return i.f();
    }
    
    public static agq d(final amti amti) {
        if (amti != null && (amti.b & 0x1) != 0x0) {
            amth amth;
            if ((amth = amti.c) == null) {
                amth = amth.a;
            }
            aotp aotp;
            if ((aotp = amth.d) == null) {
                aotp = aotp.a;
            }
            return e(amti, new vgy(aotp));
        }
        return null;
    }
    
    public static agq e(final amti amti, final vgy vgy) {
        if (amti != null && (amti.b & 0x1) != 0x0) {
            amth amth;
            if ((amth = amti.c) == null) {
                amth = amth.a;
            }
            return new agq(amth.c, amth.e, amth.f, vgy, amti);
        }
        return null;
    }
    
    public final ListenableFuture b(final String s) {
        return aftq.e(((qho)this.b).c().b((String)this.d, s), (aezf)qje.a, (Executor)((qho)this.b).e());
    }
    
    public final ListenableFuture c(final qjf qjf) {
        return afwm.q((Callable)new pak(this, qjf, 5, (byte[])null), (Executor)((qho)this.b).e());
    }
    
    public final Object f(final AccountId accountId) {
        final Set g = this.g();
        final boolean a = this.a;
        boolean b2;
        final boolean b = b2 = true;
        if (!a) {
            b2 = b;
            if (!g.isEmpty()) {
                b2 = (g.size() == 1 && g.contains(accountId) && b);
            }
        }
        adkp.W(b2, "There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: %s\n\tNew AccountId: %s", (Object)g, (Object)accountId);
        adkp.T(((aeqe)this.d).a().getApplicationContext() instanceof arlm, "Sting Activity must be attached to an @Sting Application. Found: %s", (Object)((aeqe)this.d).a().getApplicationContext());
        final aqtv aqtv = (aqtv)this.c;
        aepo aepo;
        if (((aezp)aqtv.b).h()) {
            final epp a2 = ((aepd)aqsy.k(((ahdc)aqtv.a).e(accountId), (Class)aepd.class)).a();
            a2.a = (Activity)((aezp)aqtv.b).c();
            aepo = a2.a();
        }
        else {
            final epp a3 = ((aepd)aqsy.k(((ahdc)aqtv.a).e(accountId), (Class)aepd.class)).a();
            a3.b = (aeqe)aqtv.c;
            aepo = a3.a();
        }
        return aepo;
    }
    
    public final Set g() {
        synchronized (this.b) {
            return Collections.unmodifiableSet(((Map<?, V>)this.e).keySet());
        }
    }
}
