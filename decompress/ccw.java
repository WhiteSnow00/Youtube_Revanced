import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collection;
import android.content.IntentFilter;
import java.util.Map;
import java.util.List;
import android.content.IntentSender;
import android.os.Bundle;
import java.util.ArrayList;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccw
{
    public final ccv a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public int h;
    public boolean i;
    public final ArrayList j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public Bundle q;
    ccf r;
    private int s;
    private IntentSender t;
    private List u;
    private Map v;
    
    public ccw(final ccv a, final String b, final String c) {
        this.j = new ArrayList();
        this.p = -1;
        this.u = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a() {
        if (this.k() && !dmo.s()) {
            return 0;
        }
        return this.s;
    }
    
    public final int b(final ccf r) {
        final ccf r2 = this.r;
        int n = 0;
        if (r2 != r) {
            this.r = r;
            n = n;
            if (r != null) {
                int n2;
                if (!akq.b((Object)this.d, (Object)r.o())) {
                    this.d = r.o();
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                if (!akq.b((Object)this.e, (Object)r.m())) {
                    this.e = r.m();
                    n2 = 1;
                }
                if (!akq.b((Object)this.f, (Object)r.j())) {
                    this.f = r.j();
                    n2 = 1;
                }
                if (this.g != r.t()) {
                    this.g = r.t();
                    n2 = 1;
                }
                if (this.h != r.a()) {
                    this.h = r.a();
                    n2 = 1;
                }
                final ArrayList j = this.j;
                final List p = r.p();
                Label_0394: {
                    if (j != p) {
                        Label_0373: {
                            if (p != null) {
                                final ListIterator listIterator = j.listIterator();
                                final ListIterator listIterator2 = p.listIterator();
                                while (listIterator.hasNext() && listIterator2.hasNext()) {
                                    final IntentFilter intentFilter = (IntentFilter)listIterator.next();
                                    final IntentFilter intentFilter2 = (IntentFilter)listIterator2.next();
                                    if (intentFilter != intentFilter2) {
                                        if (intentFilter == null || intentFilter2 == null) {
                                            break Label_0373;
                                        }
                                        final int countActions = intentFilter.countActions();
                                        if (countActions != intentFilter2.countActions()) {
                                            break Label_0373;
                                        }
                                        for (int i = 0; i < countActions; ++i) {
                                            if (!intentFilter.getAction(i).equals(intentFilter2.getAction(i))) {
                                                break Label_0373;
                                            }
                                        }
                                        final int countCategories = intentFilter.countCategories();
                                        if (countCategories != intentFilter2.countCategories()) {
                                            break Label_0373;
                                        }
                                        for (int k = 0; k < countCategories; ++k) {
                                            if (!intentFilter.getCategory(k).equals(intentFilter2.getCategory(k))) {
                                                break Label_0373;
                                            }
                                        }
                                    }
                                }
                                if (!listIterator.hasNext() && !listIterator2.hasNext()) {
                                    break Label_0394;
                                }
                            }
                        }
                        this.j.clear();
                        this.j.addAll(r.p());
                        n2 = 1;
                    }
                }
                if (this.k != r.d()) {
                    this.k = r.d();
                    n2 = 1;
                }
                if (this.l != r.c()) {
                    this.l = r.c();
                    n2 = 1;
                }
                if (this.m != r.b()) {
                    this.m = r.b();
                    n2 = 1;
                }
                final int s = this.s;
                final int g = r.g();
                final int n3 = 3;
                if (s != g) {
                    this.s = r.g();
                    n2 = 3;
                }
                if (this.n != r.f()) {
                    this.n = r.f();
                    n2 = 3;
                }
                if (this.o != r.h()) {
                    this.o = r.h();
                    n2 = n3;
                }
                int n4 = n2;
                if (this.p != r.e()) {
                    this.p = r.e();
                    n4 = (n2 | 0x5);
                }
                int n5 = n4;
                if (!akq.b((Object)this.q, (Object)r.k())) {
                    this.q = r.k();
                    n5 = (n4 | 0x1);
                }
                int n6 = n5;
                if (!akq.b((Object)this.t, (Object)r.i())) {
                    this.t = r.i();
                    n6 = (n5 | 0x1);
                }
                int n7 = n6;
                if (this.i != r.s()) {
                    this.i = r.s();
                    n7 = (n6 | 0x5);
                }
                final List q = r.q();
                final ArrayList u = new ArrayList();
                int n8;
                if (q.size() != this.u.size()) {
                    n8 = 1;
                }
                else {
                    n8 = 0;
                }
                int n9 = n8;
                if (!q.isEmpty()) {
                    final ccs q2 = dmo.q();
                    final Iterator iterator = q.iterator();
                Label_0707:
                    while (true) {
                        n9 = n8;
                        if (iterator.hasNext()) {
                            final String s2 = q2.h.get(new akr((Object)this.a.a().flattenToShortString(), (Object)iterator.next()));
                            final ArrayList g2 = q2.g;
                            final int size = g2.size();
                            int l = 0;
                            while (true) {
                                while (l < size) {
                                    final ccw ccw = (ccw)g2.get(l);
                                    final boolean equals = ccw.c.equals(s2);
                                    ++l;
                                    if (equals) {
                                        if (ccw == null) {
                                            continue Label_0707;
                                        }
                                        u.add(ccw);
                                        if (n8 == 0 && !this.u.contains(ccw)) {
                                            n8 = 1;
                                            continue Label_0707;
                                        }
                                        continue Label_0707;
                                    }
                                }
                                final ccw ccw = null;
                                continue;
                            }
                        }
                        break;
                    }
                }
                if (n9 != 0) {
                    this.u = u;
                    n = (n7 | 0x1);
                }
                else {
                    n = n7;
                }
            }
        }
        return n;
    }
    
    public final ccl c() {
        final ccv a = this.a;
        dmo.r();
        return a.a;
    }
    
    public final List d() {
        return Collections.unmodifiableList((List<?>)this.u);
    }
    
    public final void e(int min) {
        dmo.r();
        final ccs q = dmo.q();
        min = Math.min(this.o, Math.max(0, min));
        if (this == q.p) {
            final cck q2 = q.q;
            if (q2 != null) {
                q2.b(min);
                return;
            }
        }
        if (!q.t.isEmpty()) {
            final cck cck = q.t.get(this.c);
            if (cck != null) {
                cck.b(min);
            }
        }
    }
    
    public final void f(final int n) {
        dmo.r();
        if (n != 0) {
            final ccs q = dmo.q();
            if (this == q.p) {
                final cck q2 = q.q;
                if (q2 != null) {
                    q2.c(n);
                    return;
                }
            }
            if (!q.t.isEmpty()) {
                final cck cck = q.t.get(this.c);
                if (cck != null) {
                    cck.c(n);
                }
            }
        }
    }
    
    public final void g() {
        dmo.r();
        dmo.q().k(this, 3);
    }
    
    public final void h(final Collection collection) {
        this.u.clear();
        if (this.v == null) {
            this.v = (Map)new abi();
        }
        this.v.clear();
        for (final arjd arjd : collection) {
            final ccw b = this.a.b(((ccf)arjd.b).n());
            if (b != null) {
                this.v.put(b.c, arjd);
                final int a = arjd.a;
                if (a != 2 && a != 3) {
                    continue;
                }
                this.u.add(b);
            }
        }
        dmo.q().j.a(259, this);
    }
    
    public final boolean i() {
        dmo.r();
        return dmo.q().d() == this;
    }
    
    public final boolean j() {
        return this.i() || this.m == 3 || (TextUtils.equals((CharSequence)this.c().f.a(), (CharSequence)"android") && this.o("android.media.intent.category.LIVE_AUDIO") && !this.o("android.media.intent.category.LIVE_VIDEO"));
    }
    
    public final boolean k() {
        return this.d().size() > 0;
    }
    
    final boolean l() {
        return this.r != null && this.g;
    }
    
    public final boolean m() {
        dmo.r();
        return dmo.q().e() == this;
    }
    
    public final boolean n(final ccn ccn) {
        if (ccn != null) {
            dmo.r();
            final ArrayList j = this.j;
            ccn.c();
            final boolean empty = ccn.c.isEmpty();
            final boolean b = false;
            boolean b2 = false;
            Label_0117: {
                if (empty) {
                    b2 = b;
                }
                else {
                    final Iterator iterator = j.iterator();
                    while (true) {
                        b2 = b;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final IntentFilter intentFilter = (IntentFilter)iterator.next();
                        if (intentFilter == null) {
                            continue;
                        }
                        final Iterator iterator2 = ccn.c.iterator();
                        while (iterator2.hasNext()) {
                            if (intentFilter.hasCategory((String)iterator2.next())) {
                                b2 = true;
                                break Label_0117;
                            }
                        }
                    }
                }
            }
            return b2;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
    
    public final boolean o(final String s) {
        dmo.r();
        for (int size = this.j.size(), i = 0; i < size; ++i) {
            if (((IntentFilter)this.j.get(i)).hasCategory(s)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", connectionState=");
        sb.append(this.h);
        sb.append(", canDisconnect=");
        sb.append(this.i);
        sb.append(", playbackType=");
        sb.append(this.k);
        sb.append(", playbackStream=");
        sb.append(this.l);
        sb.append(", deviceType=");
        sb.append(this.m);
        sb.append(", volumeHandling=");
        sb.append(this.s);
        sb.append(", volume=");
        sb.append(this.n);
        sb.append(", volumeMax=");
        sb.append(this.o);
        sb.append(", presentationDisplayId=");
        sb.append(this.p);
        sb.append(", extras=");
        sb.append(this.q);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(this.a.c());
        if (this.k()) {
            sb.append(", members=[");
            for (int size = this.u.size(), i = 0; i < size; ++i) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i) != this) {
                    sb.append(((ccw)this.u.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
