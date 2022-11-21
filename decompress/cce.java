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

public final class cce
{
    public final Object a;
    public Object b;
    public Object c;
    
    public cce() {
        this.a = new kz();
    }
    
    public cce(final abqv a) {
        this.a = a;
        this.c = fku.a;
    }
    
    public cce(final Context a) {
        this.a = a;
        this.b = afag.a;
    }
    
    public cce(final ccf ccf) {
        if (ccf != null) {
            this.a = new Bundle(ccf.a);
            if (!ccf.q().isEmpty()) {
                this.b = new ArrayList(ccf.q());
            }
            if (!ccf.p().isEmpty()) {
                this.c = new ArrayList(ccf.c);
            }
            return;
        }
        throw new IllegalArgumentException("descriptor must not be null");
    }
    
    public cce(final era a) {
        this.a = a;
    }
    
    public cce(final String s, final String s2) {
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
    
    public cce(final sh a) {
        this.a = a;
    }
    
    public cce(final byte[] array) {
        this.a = new HashSet();
    }
    
    private final void s(final fku fku) {
        if (fku == fku.g) {
            return;
        }
        final Object a = this.a;
        final boolean c = fku.c();
        final boolean b = true;
        ((abqv)a).J(c && !fku.f());
        final Object a2 = this.a;
        boolean e = b;
        if (!fku.m()) {
            e = (fku.f() && b);
        }
        final abkq f = ((abqv)a2).f;
        if (f.e != e) {
            f.e = e;
            f.i();
        }
        final Object a3 = this.a;
        final boolean e2 = fku.e();
        final abkq f2 = ((abqv)a3).f;
        if (e2 != f2.l) {
            f2.l = e2;
            f2.i();
        }
        ((abqv)this.a).K(fku.f());
    }
    
    public final ccf a() {
        final Object c = this.c;
        if (c != null) {
            ((Bundle)this.a).putParcelableArrayList("controlFilters", (ArrayList)c);
        }
        final Object b = this.b;
        if (b != null) {
            ((Bundle)this.a).putStringArrayList("groupMemberIds", (ArrayList)b);
        }
        return new ccf((Bundle)this.a);
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
    
    public final void n(final fku c) {
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
    
    public final void o(final fku b) {
        final Object c = this.c;
        if (c != b) {
            this.s((fku)(this.b = b));
            return;
        }
        if (this.b == null) {
            return;
        }
        this.b = null;
        this.s((fku)c);
    }
    
    public final void p(final eup eup) {
        ((Set<eup>)this.a).add(eup);
    }
    
    public final void q(final euo c) {
        if (aexq.c(c, this.c)) {
            return;
        }
        if ((this.c = c) != null) {
            final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
            while (iterator.hasNext()) {
                iterator.next().s((euo)this.c);
            }
        }
    }
    
    public final void r(final euq b) {
        if (aexq.c(b, this.b)) {
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
                iterator2.next().t((euq)this.b);
            }
        }
    }
}
