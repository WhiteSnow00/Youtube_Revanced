import java.util.Set;
import java.util.Iterator;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cca
{
    public final Object a;
    public Object b;
    public Object c;
    
    public cca() {
        this.a = new kz();
    }
    
    public cca(final abno a) {
        this.a = a;
        this.c = fkk.a;
    }
    
    public cca(final Context a) {
        this.a = a;
        this.b = aewp.a;
    }
    
    public cca(final ccb ccb) {
        if (ccb != null) {
            this.a = new Bundle(ccb.a);
            if (!ccb.q().isEmpty()) {
                this.b = new ArrayList(ccb.q());
            }
            if (!ccb.p().isEmpty()) {
                this.c = new ArrayList(ccb.c);
            }
            return;
        }
        throw new IllegalArgumentException("descriptor must not be null");
    }
    
    public cca(final eqv a) {
        this.a = a;
    }
    
    public cca(final String s, final String s2) {
        final Bundle a = new Bundle();
        this.a = a;
        if (s == null) {
            throw new NullPointerException("id must not be null");
        }
        final Bundle bundle = a;
        a.putString("id", s);
        if (s2 != null) {
            final Bundle bundle2 = a;
            a.putString("name", s2);
            return;
        }
        throw new NullPointerException("name must not be null");
    }
    
    public cca(final sg a) {
        this.a = a;
    }
    
    public cca(final byte[] array) {
        this.a = new HashSet();
    }
    
    private final void s(final fkk fkk) {
        if (fkk == fkk.g) {
            return;
        }
        final Object a = this.a;
        final boolean c = fkk.c();
        final boolean b = true;
        ((abno)a).J(c && !fkk.f());
        final Object a2 = this.a;
        boolean f = b;
        if (!fkk.m()) {
            f = (fkk.f() && b);
        }
        final abhq f2 = ((abno)a2).f;
        if (f2.f != f) {
            f2.f = f;
            f2.i();
        }
        final Object a3 = this.a;
        final boolean e = fkk.e();
        final abhq f3 = ((abno)a3).f;
        if (e != f3.m) {
            f3.m = e;
            f3.i();
        }
        ((abno)this.a).K(fkk.f());
    }
    
    public final ccb a() {
        final Object c = this.c;
        if (c != null) {
            ((Bundle)this.a).putParcelableArrayList("controlFilters", (ArrayList)c);
        }
        final Object b = this.b;
        if (b != null) {
            ((Bundle)this.a).putStringArrayList("groupMemberIds", (ArrayList)b);
        }
        return new ccb((Bundle)this.a);
    }
    
    public final void b(final IntentFilter intentFilter) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (!((ArrayList)this.c).contains(intentFilter)) {
            ((ArrayList)this.c).add(intentFilter);
        }
    }
    
    public final void c(final Collection collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                for (final IntentFilter intentFilter : collection) {
                    if (intentFilter != null) {
                        this.b(intentFilter);
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("filters must not be null");
    }
    
    public final void d(final int n) {
        ((Bundle)this.a).putInt("connectionState", n);
    }
    
    public final void e(final String s) {
        ((Bundle)this.a).putString("status", s);
    }
    
    public final void f(final int n) {
        ((Bundle)this.a).putInt("deviceType", n);
    }
    
    public final void g(final boolean b) {
        ((Bundle)this.a).putBoolean("enabled", b);
    }
    
    public final void h(Bundle bundle) {
        if (bundle == null) {
            ((Bundle)this.a).putBundle("extras", (Bundle)null);
            return;
        }
        final Object a = this.a;
        bundle = new Bundle(bundle);
        ((Bundle)a).putBundle("extras", bundle);
    }
    
    public final void i(final int n) {
        ((Bundle)this.a).putInt("playbackType", n);
    }
    
    public final void j(final int n) {
        ((Bundle)this.a).putInt("presentationDisplayId", n);
    }
    
    public final void k(final int n) {
        ((Bundle)this.a).putInt("volume", n);
    }
    
    public final void l(final int n) {
        ((Bundle)this.a).putInt("volumeHandling", n);
    }
    
    public final void m(final int n) {
        ((Bundle)this.a).putInt("volumeMax", n);
    }
    
    public final void n(final fkk c) {
        c.getClass();
        this.c = c;
        final Object b = this.b;
        if (b != null) {
            if (c != b) {
                return;
            }
            this.b = null;
        }
        this.s(c);
    }
    
    public final void o(final fkk b) {
        final Object c = this.c;
        if (c != b) {
            this.s((fkk)(this.b = b));
            return;
        }
        if (this.b == null) {
            return;
        }
        this.b = null;
        this.s((fkk)c);
    }
    
    public final void p(final euk euk) {
        ((Set<euk>)this.a).add(euk);
    }
    
    public final void q(final euj c) {
        if (aeda.v((Object)c, this.c)) {
            return;
        }
        if ((this.c = c) != null) {
            final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
            while (iterator.hasNext()) {
                iterator.next().s((euj)this.c);
            }
        }
    }
    
    public final void r(final eul b) {
        if (aeda.v((Object)b, this.b)) {
            return;
        }
        if (this.b != null) {
            final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
            while (iterator.hasNext()) {
                iterator.next().x();
            }
        }
        if ((this.b = b) != null) {
            final Iterator<Object> iterator2 = ((Set<Object>)this.a).iterator();
            while (iterator2.hasNext()) {
                iterator2.next().t((eul)this.b);
            }
        }
    }
}
