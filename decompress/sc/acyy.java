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

public final class acyy implements acxu, acxz
{
    public final acyo a;
    public final acyu b;
    public final zmf c;
    public final ScheduledExecutorService d;
    public final afvt e;
    public final oby f;
    final acyw g;
    public long h;
    public final AtomicInteger i;
    public final AtomicBoolean j;
    public xao k;
    public final acvg l;
    public final aekp m;
    public final aujg n;
    private final rhx o;
    private final acyi p;
    private final acyl q;
    private final acyz r;
    private final AtomicBoolean s;
    private final AtomicLong t;
    private final acvg u;
    
    public acyy(final acyo a, final acyu b, final Context context, final zmf c, final rhx o, final ScheduledExecutorService d, final oby f, final acvg u, final acyi p21, final acyl q, final aekp m, final acyw g, final aujg n, final acyz r, final acvg l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        context.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.g = g;
        adkp.H(TextUtils.isEmpty((CharSequence)a.a()) ^ true);
        c.getClass();
        this.c = c;
        o.getClass();
        this.o = o;
        d.getClass();
        this.d = d;
        this.e = afwm.f(d);
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
        acvg.a = a.j;
    }
    
    private final List l(String e) {
        final ArrayList list = new ArrayList();
        e = (String)this.m.E(e);
        try {
            if (((Cursor)e).moveToFirst()) {
                final int columnIndex = ((Cursor)e).getColumnIndex("suggest_intent_query");
                do {
                    list.add(new acyn(((Cursor)e).getString(columnIndex), 1, (int[])null));
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
    
    public final void a(final adia adia) {
        throw null;
    }
    
    public final xao b() {
        return this.k;
    }
    
    public final int c() {
        return this.i.get();
    }
    
    public final acyt d(final String d, final boolean b, int i, final String m, final boolean b2, final String n, long a) {
        this.t.set(this.f.g());
        final acyt acyt = new acyt(d);
        final agnt d2 = acyt.d;
        d.getClass();
        Collections.emptyList();
        final ArrayList list = new ArrayList();
        final List a2 = this.q.a(d);
        acyt acyt2 = acyt;
        agnt agnt = d2;
        if (a2 != null) {
            final Iterator iterator = a2.iterator();
            while (true) {
                acyt2 = acyt;
                agnt = d2;
                if (!iterator.hasNext()) {
                    break;
                }
                final String s = (String)iterator.next();
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                final StringBuilder sb = new StringBuilder();
                final ArrayList r = agpi.R((Object[])s.split("[\\s\\_\\.\\/\\'\",]"));
                final ArrayList r2 = agpi.R((Object[])d.split("[\\s\\_\\.\\/\\'\",]"));
                final int size = r.size();
                int j = 0;
                int n2 = 0;
                int n3 = 0;
                while (j < size) {
                    final String s2 = (String)r.get(j);
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
                            final int size2 = r2.size();
                            int n9 = 2;
                            if (n7 >= size2) {
                                break;
                            }
                            final String s3 = (String)r2.get(n7);
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
                            acyl.c(spannableStringBuilder, sb.toString(), (boolean)(n2 != 0));
                            sb.setLength(0);
                        }
                        n2 = (false ? 1 : 0);
                        if (n8 == 2) {
                            sb.append(s2);
                            r2.remove(n6);
                        }
                        else {
                            if (n8 == 1) {
                                final int length = ((String)r2.get(n6)).length();
                                sb.append(s2, 0, length);
                                acyl.c(spannableStringBuilder, sb.toString(), false);
                                sb.setLength(0);
                                sb.append(s2, length, s2.length());
                                r2.remove(n6);
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
                acyl.c(spannableStringBuilder, sb.toString(), (boolean)(n2 != 0));
                if (n3 < s.length()) {
                    acyl.c(spannableStringBuilder, s.substring(n3, s.length()), true);
                }
                list.add(new acyn(s, 0, 19, new int[] { 71 }, (String)null, 0, (String)null, 0, (String)null, (Spanned)spannableStringBuilder));
            }
        }
        this.q.b();
        if (list.size() >= 20) {
            acyt2.b = list.subList(0, 20);
            return acyt2;
        }
        final List<Object> emptyList = Collections.emptyList();
        final boolean empty = TextUtils.isEmpty((CharSequence)d);
        final acyh acyh = null;
        final acyh acyh2 = null;
        List<Object> b3;
        acyh acyh3;
        if (empty && !this.a.d()) {
            b3 = emptyList;
            acyh3 = acyh;
        }
        else {
            acyh acyh4 = null;
            Label_1151: {
                try {
                    if (d.isEmpty() && !this.a.d()) {
                        acyh4 = acyh2;
                        break Label_1151;
                    }
                    final acys acys = new acys();
                    acys.a = this.a.a();
                    acys.b = acvg.f();
                    acys.c = this.u.a();
                    acys.j = this.a.b();
                    acys.m = (String)m;
                    acys.p = i;
                    try {
                        acys.d = d;
                        acys.q = true;
                        acys.v = this.k;
                        if (this.n != null) {
                            if (this.j.getAndSet(false) || d.isEmpty()) {
                                this.n.C();
                            }
                            acys.r = this.n.B();
                        }
                        if (a == 0L || b2) {
                            acys.n = n;
                            acys.o = a;
                        }
                        if (b) {
                            final acyi p7 = this.p;
                            final Object c = p7.c;
                            a = p7.a();
                            acys.k = (String)c;
                            acys.l = a;
                        }
                        if (this.a.e) {
                            acys.d(this.e(), this.g());
                        }
                        final acyz r3 = this.r;
                        if (r3 != null && r3.c()) {
                            acys.f();
                            acys.t = this.r.b();
                            acys.u = this.r.a();
                        }
                        if (!this.c.t() && this.a.c()) {
                            acys.i = this.c.k();
                        }
                        acyh acyh5 = null;
                        Label_1125: {
                            if (d.isEmpty()) {
                                alxw alxw;
                                if ((alxw = ((jlu)this.a).a.f().e) == null) {
                                    alxw = alxw.a;
                                }
                                if (alxw.R) {
                                    acyh5 = this.b.c(acys);
                                    break Label_1125;
                                }
                            }
                            acyh5 = this.g.a(acys);
                        }
                        acyh4 = acyh5;
                    }
                    catch (final IOException m) {}
                }
                catch (final IOException ex) {}
                acvg.n("IOException during suggestions", (Throwable)m);
                acyh4 = acyh2;
            }
            b3 = emptyList;
            acyh3 = acyh4;
            if (acyh4 != null) {
                b3 = acyh4.b;
                agnt.a = acyh4.d;
                this.s.set(acyh4.c);
                agnt.b = acyh4.c;
                acyh3 = acyh4;
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
        acyn acyn;
        for (size3 = list3.size(), i = 0; i < size3; ++i) {
            acyn = (acyn)list3.get(i);
            if (set.add(acyn.a)) {
                b4.add(acyn);
            }
        }
        if (d.isEmpty() && this.a.d()) {
            this.i.set(b4.size());
        }
        if (!list.isEmpty() && b4.size() >= 20) {
            acyt2.b = b4.subList(0, 20);
            if (acyh3 != null) {
                acyt2.c = acyh3.f;
            }
            return acyt2;
        }
        acyt2.b = b4;
        if (acyh3 != null) {
            acyt2.c = acyh3.f;
        }
        return acyt2;
    }
    
    public final String e() {
        final boolean t = this.c.t();
        String d = "";
        if (!t) {
            return "";
        }
        final auda g = this.o.g((AccountIdentity)this.c.c());
        if (g.f()) {
            d = g.d();
        }
        return d;
    }
    
    public final String f() {
        return this.a.a();
    }
    
    public final String g() {
        final zme c = this.c.c();
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
            final acys acys = new acys();
            acys.a = this.a.a();
            acys.b = acvg.f();
            acys.c = this.u.a();
            acys.j = this.a.b();
            acys.d = "";
            acys.e();
            acys.q = true;
            final aujg n = this.n;
            if (n != null) {
                acys.r = String.format("%04X", (int)(char)((Random)n.a).nextInt(65536));
            }
            final acyz r = this.r;
            if (r != null && r.c()) {
                acys.f();
                acys.t = this.r.b();
                acys.u = this.r.a();
            }
            if (this.a.e) {
                acys.d(this.e(), this.g());
            }
            try {
                final acyu b = this.b;
                if (b.a == null) {
                    return;
                }
                acys.d = "";
                acys.e();
                b.c(acys);
            }
            catch (final IOException ex) {
                acvg.n("Could not background-update zero-prefix cache.", (Throwable)ex);
                ttr.n("Could not background-update zero-prefix cache.", (Throwable)ex);
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
