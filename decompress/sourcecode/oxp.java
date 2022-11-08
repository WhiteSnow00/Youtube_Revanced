import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.app.Application;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxp implements Application$ActivityLifecycleCallbacks
{
    public final Map a;
    public final Map b;
    public final lzi c;
    public final nrw d;
    private final Map e;
    private final Set f;
    private final oyk g;
    
    public oxp(final phq phq, final lzi c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = new nrw();
        this.a = new HashMap();
        this.b = new HashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.g = new oyk(phq, (byte[])null, (byte[])null);
        final Application m = phq.m();
        if (m != null) {
            m.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
        }
    }
    
    public final oxn a(final String s, final oyr oyr) {
        final oyp oyp = this.b.get(s);
        if (oyp == null) {
            return null;
        }
        final oyr a = oyr.a;
        final int ordinal = oyr.ordinal();
        if (ordinal != 10) {
            if (ordinal != 16) {
                boolean s2 = false;
                if (ordinal != 17) {
                    switch (ordinal) {
                        default: {
                            this.g.b(oyp, (oxw)oyr);
                            break;
                        }
                        case 6:
                        case 7:
                        case 8: {
                            this.g.b(oyp, (oxw)oyr);
                            oyp.l = true;
                            break;
                        }
                        case 5: {
                            this.g.b(oyp, (oxw)oyr);
                            oyp.l = false;
                            break;
                        }
                        case 4: {
                            this.g.b(oyp, (oxw)oyr);
                            oyp.n(oyr.e);
                            break;
                        }
                        case 1:
                        case 2:
                        case 3: {
                            this.g.b(oyp, (oxw)oyr);
                            oyp.n(oyr);
                            break;
                        }
                        case 0: {
                            oyp.l = false;
                            if (this.g.a() > 0.0) {
                                s2 = true;
                            }
                            oyp.s = s2;
                            ((oxr)oyp).b = System.currentTimeMillis();
                            this.g.b(oyp, (oxw)oyr);
                            oyp.n(oyr.a);
                            break;
                        }
                    }
                }
                else {
                    this.g.b(oyp, (oxw)oyr);
                    oyp.n = false;
                }
            }
            else {
                this.g.b(oyp, (oxw)oyr);
                oyp.n = true;
            }
        }
        else {
            this.g.b(oyp, (oxw)oyr);
            oyp.p();
        }
        final oxn i = oyp.i(oyr);
        if (!oyr.f()) {
            oyp.m(oyr);
        }
        if (oyr.e() && !oyr.equals((Object)oyr.e)) {
            oyp.o(oyr.c() + 1);
        }
        return i;
    }
    
    public final void b(final String s, final View view, final oxu oxu) {
        if (!this.c.l()) {
            return;
        }
        final oxv oxv = this.e.get(s);
        if (oxv != null) {
            if (view != ((oxr)oxv).a()) {
                ((oxr)oxv).d(view);
            }
            oxv.m = false;
            this.g(s, oxv);
            return;
        }
        if (!this.f.contains(s)) {
            this.f(s, new oxv(view, oxu, s, this));
        }
    }
    
    public final void c(final String s) {
        oxv oxv;
        if (this.a.containsKey(s)) {
            oxv = this.a.get(s);
        }
        else {
            oxv = this.e.get(s);
        }
        oxv.j();
    }
    
    public final void d(final String s) {
        if (!this.c.l()) {
            return;
        }
        oxv oxv;
        if (this.a.containsKey(s)) {
            oxv = this.a.get(s);
        }
        else {
            oxv = this.e.get(s);
        }
        if (oxv == null) {
            return;
        }
        if (!oxv.n) {
            oxv.m = true;
            if (!((oxr)oxv).b() && !oxv.l) {
                this.h(s);
            }
            return;
        }
        this.c(s);
        this.e(s);
    }
    
    public final void e(final String s) {
        this.f.add(s);
        final oxv oxv = this.a.remove(s);
        if (oxv != null) {
            this.g.f(oxv);
        }
        this.e.remove(s);
    }
    
    final void f(final String s, final oxv oxv) {
        this.a.put(s, oxv);
        final oyk g = this.g;
        g.e(oxv);
        final boolean empty = g.b.isEmpty();
        g.b.add(oxv);
        if (empty) {
            g.g();
        }
    }
    
    public final void g(final String s, final oxv oxv) {
        this.e.remove(s);
        this.f(s, oxv);
    }
    
    public final void h(final String s) {
        final oxv oxv = this.a.get(s);
        if (oxv != null) {
            this.e.put(s, oxv);
            this.a.remove(s);
            this.g.f(oxv);
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        final ArrayList list = new ArrayList();
        for (final String s : this.a.keySet()) {
            final View a = ((oxr)this.a.get(s)).a();
            if (a == null || activity == nrw.Z(a)) {
                list.add(s);
            }
        }
        for (final String s2 : this.e.keySet()) {
            final View a2 = ((oxr)this.e.get(s2)).a();
            if (a2 == null || activity == nrw.Z(a2)) {
                list.add(s2);
            }
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            final String s3 = (String)list.get(i);
            this.c(s3);
            this.e(s3);
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (final String s : this.a.keySet()) {
            final oxv oxv = this.a.get(s);
            final View a = ((oxr)oxv).a();
            if (a != null && !oxv.n) {
                if (activity != nrw.Z(a)) {
                    continue;
                }
                ((oxr)oxv).a = true;
                list2.add(s);
            }
            else {
                list.add(s);
            }
        }
        final int size = list.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final String s2 = (String)list.get(i);
            this.c(s2);
            this.e(s2);
        }
        for (int size2 = list2.size(), j = n; j < size2; ++j) {
            this.h((String)list2.get(j));
        }
        for (final oyp oyp : this.b.values()) {
            final View a2 = ((oxr)oyp).a();
            if (a2 != null && activity == nrw.Z(a2)) {
                ((oxr)oyp).a = true;
            }
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (final String s : this.e.keySet()) {
            final oxv oxv = this.e.get(s);
            final View a = ((oxr)oxv).a();
            if (a == null) {
                list.add(s);
            }
            else {
                if (activity != nrw.Z(a)) {
                    continue;
                }
                ((oxr)oxv).a = false;
                list2.add(s);
            }
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            final String s2 = (String)list.get(i);
            this.c(s2);
            this.e(s2);
        }
        for (int size2 = list2.size(), j = 0; j < size2; ++j) {
            final String s3 = (String)list2.get(j);
            this.g(s3, (oxv)this.e.get(s3));
        }
        for (final oyp oyp : this.b.values()) {
            final View a2 = ((oxr)oyp).a();
            if (a2 != null && activity == nrw.Z(a2)) {
                ((oxr)oyp).a = false;
            }
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
