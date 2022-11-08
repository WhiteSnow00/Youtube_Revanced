import android.database.Cursor;
import java.util.Random;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.io.IOException;
import android.text.Spanned;
import android.text.SpannableStringBuilder;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;
import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acww implements acvs, acvx
{
    public final acwm a;
    public final acws b;
    public final zki c;
    public final ScheduledExecutorService d;
    public final afts e;
    public final oas f;
    final acwu g;
    public long h;
    public final AtomicInteger i;
    public final AtomicBoolean j;
    public wyo k;
    public final adbp l;
    public final aeim m;
    public final auip n;
    private final rfv o;
    private final acwg p;
    private final acwj q;
    private final acwx r;
    private final AtomicBoolean s;
    private final AtomicLong t;
    private final adbp u;
    
    public acww(final acwm a, final acws b, final Context context, final zki c, final rfv o, final ScheduledExecutorService d, final oas f, final adbp u, final acwg p21, final acwj q, final aeim m, final acwu g, final auip n, final acwx r, final adbp l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        context.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.g = g;
        agot.u(TextUtils.isEmpty((CharSequence)a.a()) ^ true);
        c.getClass();
        this.c = c;
        o.getClass();
        this.o = o;
        d.getClass();
        this.d = d;
        this.e = afva.f(d);
        f.getClass();
        this.f = f;
        u.getClass();
        this.u = u;
        p21.getClass();
        this.p = p21;
        q.getClass();
        this.q = q;
        this.m = m;
        this.n = n;
        this.r = r;
        this.l = l;
        this.i = new AtomicInteger();
        this.s = new AtomicBoolean();
        this.t = new AtomicLong();
        this.j = new AtomicBoolean();
        adbp.a = a.j;
    }
    
    private final List l(String e) {
        final ArrayList list = new ArrayList();
        e = (String)this.m.E(e);
        try {
            if (((Cursor)e).moveToFirst()) {
                final int columnIndex = ((Cursor)e).getColumnIndex("suggest_intent_query");
                do {
                    list.add(new acwl(((Cursor)e).getString(columnIndex), 1, (int[])null));
                } while (((Cursor)e).moveToNext());
            }
            ((Cursor)e).close();
            return list;
        }
        finally {
            ((Cursor)e).close();
            while (true) {}
        }
    }
    
    public final void a(final adfy adfy) {
        throw null;
    }
    
    public final wyo b() {
        return this.k;
    }
    
    public final int c() {
        return this.i.get();
    }
    
    public final acwr d(final String d, final boolean b, int i, final String m, final boolean b2, final String n, long a) {
        this.t.set(this.f.g());
        final acwr acwr = new acwr(d);
        final agls d2 = acwr.d;
        d.getClass();
        Collections.emptyList();
        final ArrayList list = new ArrayList();
        final List a2 = this.q.a(d);
        acwr acwr2 = acwr;
        agls agls = d2;
        if (a2 != null) {
            final Iterator iterator = a2.iterator();
            while (true) {
                acwr2 = acwr;
                agls = d2;
                if (!iterator.hasNext()) {
                    break;
                }
                final String s = (String)iterator.next();
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                final StringBuilder sb = new StringBuilder();
                final ArrayList an = adwd.an((Object[])s.split("[\\s\\_\\.\\/\\'\",]"));
                final ArrayList an2 = adwd.an((Object[])d.split("[\\s\\_\\.\\/\\'\",]"));
                final int size = an.size();
                int j = 0;
                int n2 = 0;
                int n3 = 0;
                while (j < size) {
                    final String s2 = (String)an.get(j);
                    if (!TextUtils.isEmpty((CharSequence)s2)) {
                        int n4 = n3;
                        if (s.charAt(n3) != s2.charAt(0)) {
                            for (n4 = n3; s.charAt(n4) != s2.charAt(0); ++n4) {}
                            sb.append(s, n3, n4);
                        }
                        final int n5 = n4 + s2.length();
                        int n6 = -1;
                        int n7 = 0;
                        int n8 = 0;
                        while (true) {
                            final int size2 = an2.size();
                            int n9 = 2;
                            if (n7 >= size2) {
                                break;
                            }
                            final String s3 = (String)an2.get(n7);
                            int n10 = n6;
                            int n11 = n8;
                            if (!TextUtils.isEmpty((CharSequence)s3)) {
                                if (!s2.equals(s3)) {
                                    if (s2.startsWith(s3)) {
                                        n9 = 1;
                                    }
                                    else {
                                        n9 = 0;
                                    }
                                }
                                n10 = n6;
                                n11 = n8;
                                if (n9 > n8) {
                                    n10 = n7;
                                    n11 = n9;
                                }
                            }
                            ++n7;
                            n6 = n10;
                            n8 = n11;
                        }
                        int n12;
                        if (n8 != 0) {
                            n12 = 0;
                        }
                        else {
                            n12 = 1;
                        }
                        if (n12 != n2) {
                            acwj.c(spannableStringBuilder, sb.toString(), (boolean)(n2 != 0));
                            sb.setLength(0);
                        }
                        n2 = (false ? 1 : 0);
                        if (n8 == 2) {
                            sb.append(s2);
                            an2.remove(n6);
                        }
                        else {
                            if (n8 == 1) {
                                final int length = ((String)an2.get(n6)).length();
                                sb.append(s2, 0, length);
                                acwj.c(spannableStringBuilder, sb.toString(), false);
                                sb.setLength(0);
                                sb.append(s2, length, s2.length());
                                an2.remove(n6);
                            }
                            else {
                                sb.append(s2);
                            }
                            n2 = (true ? 1 : 0);
                        }
                        n3 = n5;
                    }
                    ++j;
                }
                acwj.c(spannableStringBuilder, sb.toString(), (boolean)(n2 != 0));
                if (n3 < s.length()) {
                    acwj.c(spannableStringBuilder, s.substring(n3, s.length()), true);
                }
                list.add(new acwl(s, 0, 19, new int[] { 71 }, (String)null, 0, (String)null, 0, (String)null, (Spanned)spannableStringBuilder));
            }
        }
        this.q.b();
        if (list.size() >= 20) {
            acwr2.b = list.subList(0, 20);
            return acwr2;
        }
        final List<Object> emptyList = Collections.emptyList();
        final boolean empty = TextUtils.isEmpty((CharSequence)d);
        final acwf acwf = null;
        final acwf acwf2 = null;
        List<Object> b3 = null;
        acwf acwf3 = null;
        Label_1218: {
            if (empty) {
                if (!this.a.d()) {
                    b3 = emptyList;
                    acwf3 = acwf;
                    break Label_1218;
                }
            }
            acwf acwf4 = null;
            Label_1159: {
                try {
                    if (d.isEmpty() && !this.a.d()) {
                        acwf4 = acwf2;
                        break Label_1159;
                    }
                    final acwq acwq = new acwq();
                    acwq.a = this.a.a();
                    acwq.b = adbp.n();
                    acwq.c = this.u.a();
                    acwq.j = this.a.b();
                    acwq.m = (String)m;
                    acwq.p = i;
                    try {
                        acwq.d = d;
                        acwq.q = true;
                        acwq.v = this.k;
                        if (this.n != null) {
                            if (this.j.getAndSet(false) || d.isEmpty()) {
                                this.n.C();
                            }
                            acwq.r = this.n.B();
                        }
                        if (a == 0L || b2) {
                            acwq.n = n;
                            acwq.o = a;
                        }
                        if (b) {
                            final acwg p7 = this.p;
                            final Object c = p7.c;
                            a = p7.a();
                            acwq.k = (String)c;
                            acwq.l = a;
                        }
                        if (this.a.e) {
                            acwq.d(this.e(), this.g());
                        }
                        final acwx r = this.r;
                        if (r != null && r.c()) {
                            acwq.f();
                            acwq.t = this.r.b();
                            acwq.u = this.r.a();
                        }
                        if (!this.c.t() && this.a.c()) {
                            acwq.i = this.c.k();
                        }
                        acwf acwf5 = null;
                        Label_1133: {
                            if (d.isEmpty()) {
                                alvs alvs;
                                if ((alvs = ((jkt)this.a).a.f().e) == null) {
                                    alvs = alvs.a;
                                }
                                if (alvs.R) {
                                    acwf5 = this.b.c(acwq);
                                    break Label_1133;
                                }
                            }
                            acwf5 = this.g.a(acwq);
                        }
                        acwf4 = acwf5;
                    }
                    catch (final IOException m) {}
                }
                catch (final IOException ex) {}
                adbp.k("IOException during suggestions", m);
                acwf4 = acwf2;
            }
            b3 = emptyList;
            acwf3 = acwf4;
            if (acwf4 != null) {
                b3 = acwf4.b;
                agls.a = acwf4.d;
                this.s.set(acwf4.c);
                agls.b = acwf4.c;
                acwf3 = acwf4;
            }
        }
        List<Object> list2 = b3;
        if (this.a.f) {
            list2 = b3;
            if (this.c.c().y()) {
                if (this.a.e() != null) {
                    this.a.e();
                    this.l(d);
                    list2 = b3;
                }
                else {
                    final List l = this.l(d);
                    list2 = new ArrayList<Object>();
                    list2.addAll(l);
                    list2.addAll(b3);
                }
            }
        }
        final ArrayList list3 = new ArrayList();
        list3.addAll(list);
        list3.addAll(list2);
        final ArrayList b4 = new ArrayList();
        final HashSet set = new HashSet();
        int size3;
        acwl acwl;
        for (size3 = list3.size(), i = 0; i < size3; ++i) {
            acwl = (acwl)list3.get(i);
            if (set.add(acwl.a)) {
                b4.add(acwl);
            }
        }
        if (d.isEmpty() && this.a.d()) {
            this.i.set(b4.size());
        }
        if (!list.isEmpty() && b4.size() >= 20) {
            acwr2.b = b4.subList(0, 20);
            if (acwf3 != null) {
                acwr2.c = acwf3.f;
            }
            return acwr2;
        }
        acwr2.b = b4;
        if (acwf3 != null) {
            acwr2.c = acwf3.f;
        }
        return acwr2;
    }
    
    public final String e() {
        final boolean t = this.c.t();
        String d = "";
        if (!t) {
            return "";
        }
        final aucj g = this.o.g((AccountIdentity)this.c.c());
        if (g.f()) {
            d = g.d();
        }
        return d;
    }
    
    public final String f() {
        return this.a.a();
    }
    
    public final String g() {
        final zkh c = this.c.c();
        if (c != null && c.w()) {
            return c.e();
        }
        return null;
    }
    
    @Deprecated
    public final Collection h(final String s) {
        synchronized (this) {
            return this.k(s);
        }
    }
    
    public final void i() {
        synchronized (this) {
            if (!this.a.d()) {
                return;
            }
            final acwq acwq = new acwq();
            acwq.a = this.a.a();
            acwq.b = adbp.n();
            acwq.c = this.u.a();
            acwq.j = this.a.b();
            acwq.d = "";
            acwq.e();
            acwq.q = true;
            final auip n = this.n;
            if (n != null) {
                acwq.r = String.format("%04X", (int)(char)((Random)n.b).nextInt(65536));
            }
            final acwx r = this.r;
            if (r != null && r.c()) {
                acwq.f();
                acwq.t = this.r.b();
                acwq.u = this.r.a();
            }
            if (this.a.e) {
                acwq.d(this.e(), this.g());
            }
            try {
                final acws b = this.b;
                if (b.a == null) {
                    return;
                }
                acwq.d = "";
                acwq.e();
                b.c(acwq);
            }
            catch (final IOException ex) {
                adbp.k("Could not background-update zero-prefix cache.", ex);
                trn.n("Could not background-update zero-prefix cache.", (Throwable)ex);
            }
        }
    }
    
    public final boolean j() {
        return this.a.d();
    }
    
    @Deprecated
    public final Collection k(final String s) {
        synchronized (this) {
            return this.d(s, false, -1, null, false, null, -1L).b;
        }
    }
}
