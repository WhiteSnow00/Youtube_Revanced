import android.app.Activity;
import android.content.res.Configuration;
import android.support.v4.app.Fragment$SavedState;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentManager$6;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentState;
import android.support.v4.app.FragmentManagerState;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.util.List;
import java.util.Collection;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.Writer;
import java.io.PrintWriter;
import java.util.Iterator;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cl
{
    private boolean A;
    private ArrayList B;
    private final Map C;
    private final akp D;
    private final akp E;
    private final akp F;
    private final akp G;
    private final alq H;
    private final by I;
    private boolean J;
    private ArrayList K;
    private ArrayList L;
    private ArrayList M;
    private final Runnable N;
    private final di O;
    public final cr a;
    ArrayList b;
    public final ca c;
    public ra d;
    public final qx e;
    public final AtomicInteger f;
    public final Map g;
    public final Map h;
    public ArrayList i;
    public final CopyOnWriteArrayList j;
    int k;
    public bz l;
    public bw m;
    public br n;
    br o;
    public rg p;
    public rg q;
    public rg r;
    ArrayDeque s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public cm x;
    public final kh y;
    private final ArrayList z;
    
    public cl() {
        this.z = new ArrayList();
        this.a = new cr();
        this.c = new ca(this);
        this.e = new cc(this);
        this.f = new AtomicInteger();
        this.C = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.g = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.h = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.y = new kh(this);
        this.j = new CopyOnWriteArrayList();
        this.D = (akp)new bs(this, 2);
        this.E = (akp)new bs(this, 3);
        this.F = (akp)new bs(this, 4);
        this.G = (akp)new bs(this, 5);
        this.H = (alq)new cd(this);
        this.k = -1;
        this.I = new ce(this);
        this.O = new di();
        this.s = new ArrayDeque();
        this.N = (Runnable)new be(this, 3);
    }
    
    public static boolean W(final int n) {
        return Log.isLoggable("FragmentManager", n);
    }
    
    private final void aA() {
        final Iterator iterator = this.a.d().iterator();
        while (iterator.hasNext()) {
            this.al((msg)iterator.next());
        }
    }
    
    private final void aB(final RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        final PrintWriter printWriter = new PrintWriter((Writer)new cx());
        final bz l = this.l;
        if (l != null) {
            try {
                ((bt)l).a.dump("  ", (FileDescriptor)null, printWriter, new String[0]);
            }
            catch (final Exception ex2) {
                Log.e("FragmentManager", "Failed dumping state", (Throwable)ex2);
            }
        }
        else {
            try {
                this.D("  ", null, printWriter, new String[0]);
            }
            catch (final Exception ex3) {
                Log.e("FragmentManager", "Failed dumping state", (Throwable)ex3);
            }
        }
        throw ex;
    }
    
    public static final boolean ac(br br) {
        if (!br.K || !br.L) {
            final Iterator iterator = br.B.a.e().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                br = (br)iterator.next();
                int ac = n;
                if (br != null) {
                    ac = (ac(br) ? 1 : 0);
                }
                if ((n = ac) != 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    static final boolean ad(final br br) {
        boolean b = true;
        if (br == null) {
            return true;
        }
        if (br.L) {
            if (br.z == null) {
                return b;
            }
            if (ad(br.C)) {
                return true;
            }
        }
        b = false;
        return b;
    }
    
    static final void ag(final br br) {
        if (W(2)) {
            new StringBuilder("show: ").append(br);
        }
        if (br.G) {
            br.G = false;
            br.S ^= true;
        }
    }
    
    private final ViewGroup ap(final br br) {
        final ViewGroup n = br.N;
        if (n != null) {
            return n;
        }
        if (br.E <= 0) {
            return null;
        }
        if (this.m.b()) {
            final View a = this.m.a(br.E);
            if (a instanceof ViewGroup) {
                return (ViewGroup)a;
            }
        }
        return null;
    }
    
    private final Set aq() {
        final HashSet set = new HashSet();
        final Iterator iterator = this.a.d().iterator();
        while (iterator.hasNext()) {
            final ViewGroup n = ((br)((msg)iterator.next()).b).N;
            if (n != null) {
                this.ao();
                set.add(de.f(n));
            }
        }
        return set;
    }
    
    private final void ar() {
        if (!this.Z()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    
    private final void as() {
        this.A = false;
        this.L.clear();
        this.K.clear();
    }
    
    private final void at() {
        if (this.J) {
            this.J = false;
            this.aA();
        }
    }
    
    private final void au() {
        final Iterator iterator = this.aq().iterator();
        while (iterator.hasNext()) {
            ((de)iterator.next()).c();
        }
    }
    
    private final void av(final boolean b) {
        if (this.A) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.l == null) {
            if (this.w) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        else {
            if (Looper.myLooper() == this.l.d.getLooper()) {
                if (!b) {
                    this.ar();
                }
                if (this.K == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }
    
    private final void aw(final ArrayList list, final ArrayList list2, int i, final int n) {
        final boolean s = list.get(i).s;
        final ArrayList m = this.M;
        if (m == null) {
            this.M = new ArrayList();
        }
        else {
            m.clear();
        }
        this.M.addAll(this.a.f());
        br br = this.o;
        int j = i;
        int n2 = 0;
        while (j < n) {
            final av av = list.get(j);
            br br2;
            if (!(boolean)list2.get(j)) {
                final ArrayList k = this.M;
                int n3 = 0;
                while (true) {
                    br2 = br;
                    if (n3 >= av.d.size()) {
                        break;
                    }
                    final cs cs = av.d.get(n3);
                    final int a = cs.a;
                    Label_0571: {
                        Label_0253: {
                            if (a != 1) {
                                br b;
                                int n4;
                                if (a != 2) {
                                    if (a != 3 && a != 6) {
                                        if (a == 7) {
                                            break Label_0253;
                                        }
                                        if (a != 8) {
                                            b = br;
                                            n4 = n3;
                                        }
                                        else {
                                            av.d.add(n3, new cs(9, br, (byte[])null));
                                            cs.c = true;
                                            b = cs.b;
                                            n4 = n3 + 1;
                                        }
                                    }
                                    else {
                                        k.remove(cs.b);
                                        final br b2 = cs.b;
                                        b = br;
                                        n4 = n3;
                                        if (b2 == br) {
                                            av.d.add(n3, new cs(9, b2));
                                            ++n3;
                                            br = null;
                                            break Label_0571;
                                        }
                                    }
                                }
                                else {
                                    final br b3 = cs.b;
                                    final int e = b3.E;
                                    int l = k.size() - 1;
                                    boolean b4 = false;
                                    while (l >= 0) {
                                        final br br3 = k.get(l);
                                        if (br3.E == e) {
                                            if (br3 == b3) {
                                                b4 = true;
                                            }
                                            else {
                                                if (br3 == br) {
                                                    av.d.add(n3, new cs(9, br3, (byte[])null));
                                                    ++n3;
                                                    br = null;
                                                }
                                                final cs cs2 = new cs(3, br3, (byte[])null);
                                                cs2.d = cs.d;
                                                cs2.f = cs.f;
                                                cs2.e = cs.e;
                                                cs2.g = cs.g;
                                                av.d.add(n3, cs2);
                                                k.remove(br3);
                                                ++n3;
                                            }
                                        }
                                        --l;
                                    }
                                    if (!b4) {
                                        cs.a = 1;
                                        cs.c = true;
                                        k.add(b3);
                                        break Label_0571;
                                    }
                                    av.d.remove(n3);
                                    n4 = n3 - 1;
                                    b = br;
                                }
                                br = b;
                                n3 = n4;
                                break Label_0571;
                            }
                        }
                        k.add(cs.b);
                    }
                    ++n3;
                }
            }
            else {
                final ArrayList m2 = this.M;
                int n5 = av.d.size() - 1;
                while (true) {
                    br2 = br;
                    if (n5 < 0) {
                        break;
                    }
                    final cs cs3 = av.d.get(n5);
                    final int a2 = cs3.a;
                    Label_0733: {
                        Label_0722: {
                            if (a2 != 1) {
                                if (a2 != 3) {
                                    switch (a2) {
                                        default: {
                                            break Label_0733;
                                        }
                                        case 10: {
                                            cs3.i = cs3.h;
                                            break Label_0733;
                                        }
                                        case 9: {
                                            br = cs3.b;
                                            break Label_0733;
                                        }
                                        case 8: {
                                            br = null;
                                            break Label_0733;
                                        }
                                        case 6: {
                                            break;
                                        }
                                        case 7: {
                                            break Label_0722;
                                        }
                                    }
                                }
                                m2.add(cs3.b);
                                break Label_0733;
                            }
                        }
                        m2.remove(cs3.b);
                    }
                    --n5;
                }
            }
            if (n2 == 0 && !av.j) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            ++j;
            br = br2;
        }
        this.M.clear();
        if (!s && this.k > 0) {
            for (int n6 = i; n6 < n; ++n6) {
                final ArrayList d = list.get(n6).d;
                for (int size = d.size(), n7 = 0; n7 < size; ++n7) {
                    final br b5 = ((cs)d.get(n7)).b;
                    if (b5 != null && b5.z != null) {
                        this.a.l(this.ak(b5));
                    }
                }
            }
        }
        for (int n8 = i; n8 < n; ++n8) {
            final av av2 = list.get(n8);
            if (list2.get(n8)) {
                av2.c(-1);
                for (int n9 = av2.d.size() - 1; n9 >= 0; --n9) {
                    final cs cs4 = av2.d.get(n9);
                    final br b6 = cs4.b;
                    if (b6 != null) {
                        b6.t = false;
                        b6.al(true);
                        final int i2 = av2.i;
                        int n10 = 8194;
                        if (i2 != 4097) {
                            if (i2 != 8194) {
                                n10 = 4100;
                                if (i2 != 8197) {
                                    if (i2 != 4099) {
                                        if (i2 != 4100) {
                                            n10 = 0;
                                        }
                                        else {
                                            n10 = 8197;
                                        }
                                    }
                                    else {
                                        n10 = 4099;
                                    }
                                }
                            }
                            else {
                                n10 = 4097;
                            }
                        }
                        b6.ak(n10);
                        b6.an(av2.r, av2.q);
                    }
                    switch (cs4.a) {
                        default: {
                            final StringBuilder sb = new StringBuilder("Unknown cmd: ");
                            sb.append(cs4.a);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        case 10: {
                            av2.a.P(b6, cs4.h);
                            break;
                        }
                        case 9: {
                            av2.a.Q(b6);
                            break;
                        }
                        case 8: {
                            av2.a.Q(null);
                            break;
                        }
                        case 7: {
                            b6.af(cs4.d, cs4.e, cs4.f, cs4.g);
                            av2.a.M(b6, true);
                            av2.a.n(b6);
                            break;
                        }
                        case 6: {
                            b6.af(cs4.d, cs4.e, cs4.f, cs4.g);
                            av2.a.m(b6);
                            break;
                        }
                        case 5: {
                            b6.af(cs4.d, cs4.e, cs4.f, cs4.g);
                            av2.a.M(b6, true);
                            av2.a.G(b6);
                            break;
                        }
                        case 4: {
                            b6.af(cs4.d, cs4.e, cs4.f, cs4.g);
                            final cl a3 = av2.a;
                            ag(b6);
                            break;
                        }
                        case 3: {
                            b6.af(cs4.d, cs4.e, cs4.f, cs4.g);
                            av2.a.aj(b6);
                            break;
                        }
                        case 1: {
                            b6.af(cs4.d, cs4.e, cs4.f, cs4.g);
                            av2.a.M(b6, true);
                            av2.a.K(b6);
                            break;
                        }
                    }
                }
            }
            else {
                av2.c(1);
                for (int size2 = av2.d.size(), n11 = 0; n11 < size2; ++n11) {
                    final cs cs5 = av2.d.get(n11);
                    final br b7 = cs5.b;
                    if (b7 != null) {
                        b7.al(b7.t = false);
                        b7.ak(av2.i);
                        b7.an(av2.q, av2.r);
                    }
                    switch (cs5.a) {
                        default: {
                            final StringBuilder sb2 = new StringBuilder("Unknown cmd: ");
                            sb2.append(cs5.a);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        case 10: {
                            av2.a.P(b7, cs5.i);
                            break;
                        }
                        case 9: {
                            av2.a.Q(null);
                            break;
                        }
                        case 8: {
                            av2.a.Q(b7);
                            break;
                        }
                        case 7: {
                            b7.af(cs5.d, cs5.e, cs5.f, cs5.g);
                            av2.a.M(b7, false);
                            av2.a.m(b7);
                            break;
                        }
                        case 6: {
                            b7.af(cs5.d, cs5.e, cs5.f, cs5.g);
                            av2.a.n(b7);
                            break;
                        }
                        case 5: {
                            b7.af(cs5.d, cs5.e, cs5.f, cs5.g);
                            av2.a.M(b7, false);
                            final cl a4 = av2.a;
                            ag(b7);
                            break;
                        }
                        case 4: {
                            b7.af(cs5.d, cs5.e, cs5.f, cs5.g);
                            av2.a.G(b7);
                            break;
                        }
                        case 3: {
                            b7.af(cs5.d, cs5.e, cs5.f, cs5.g);
                            av2.a.K(b7);
                            break;
                        }
                        case 1: {
                            b7.af(cs5.d, cs5.e, cs5.f, cs5.g);
                            av2.a.M(b7, false);
                            av2.a.aj(b7);
                            break;
                        }
                    }
                }
            }
        }
        final boolean booleanValue = list2.get(n - 1);
        for (int n12 = i; n12 < n; ++n12) {
            final av av3 = list.get(n12);
            if (booleanValue) {
                for (int n13 = av3.d.size() - 1; n13 >= 0; --n13) {
                    final br b8 = av3.d.get(n13).b;
                    if (b8 != null) {
                        this.ak(b8).g();
                    }
                }
            }
            else {
                final ArrayList d2 = av3.d;
                for (int size3 = d2.size(), n14 = 0; n14 < size3; ++n14) {
                    final br b9 = ((cs)d2.get(n14)).b;
                    if (b9 != null) {
                        this.ak(b9).g();
                    }
                }
            }
        }
        this.H(this.k, true);
        final HashSet set = new HashSet();
        for (int n15 = i; n15 < n; ++n15) {
            final ArrayList d3 = list.get(n15).d;
            for (int size4 = d3.size(), n16 = 0; n16 < size4; ++n16) {
                final br b10 = ((cs)d3.get(n16)).b;
                if (b10 != null) {
                    final ViewGroup n17 = b10.N;
                    if (n17 != null) {
                        set.add(de.b(n17, this));
                    }
                }
            }
        }
        Object o = set.iterator();
        final int n18 = n2;
        while (((Iterator)o).hasNext()) {
            final de de = (de)((Iterator)o).next();
            de.d = booleanValue;
            Object o2 = de.b;
            synchronized (o2) {
                de.d();
                for (int n19 = de.b.size() - 1; n19 >= 0; --n19) {
                    final dd dd = de.b.get(n19);
                    final int qh = di.qh(dd.a.O);
                    if (dd.e == 2 && qh != 2) {
                        final bo r = dd.a.R;
                        break;
                    }
                }
                monitorexit(o2);
                if (!anc.am((View)de.a)) {
                    de.c();
                    de.d = false;
                    continue;
                }
                synchronized (de.b) {
                    if (!de.b.isEmpty()) {
                        o2 = new ArrayList(de.c);
                        de.c.clear();
                        final Iterator iterator = ((ArrayList)o2).iterator();
                        while (iterator.hasNext()) {
                            o2 = iterator.next();
                            if (W(2)) {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("SpecialEffectsController: Cancelling operation ");
                                sb3.append(o2);
                            }
                            ((dd)o2).d();
                            if (!((dd)o2).d) {
                                de.c.add(o2);
                            }
                        }
                        de.d();
                        final ArrayList list3 = new ArrayList(de.b);
                        de.b.clear();
                        de.c.addAll(list3);
                        o2 = list3.iterator();
                        while (((Iterator)o2).hasNext()) {
                            ((dd)((Iterator<bd>)o2).next()).b();
                        }
                        final boolean d4 = de.d;
                        final Iterator iterator2 = list3.iterator();
                        Object o3 = null;
                        Object o4 = null;
                        while (iterator2.hasNext()) {
                            final dd dd2 = (dd)iterator2.next();
                            final int qh2 = di.qh(dd2.a.O);
                            final int e2 = dd2.e;
                            final int n20 = e2 - 1;
                            if (e2 == 0) {
                                throw null;
                            }
                            if (n20 == 0) {
                                goto Label_2767;
                            }
                            Object o5;
                            if (n20 != 1) {
                                if (n20 != 2 && n20 != 3) {
                                    o5 = o3;
                                    o2 = o4;
                                }
                                else {
                                    o5 = o3;
                                    o2 = o4;
                                    if (qh2 == 2) {
                                        o5 = o3;
                                        o2 = o4;
                                        if (o3 == null) {
                                            o5 = dd2;
                                            o2 = o4;
                                        }
                                    }
                                }
                            }
                            else {
                                o5 = o3;
                                o2 = o4;
                                if (qh2 != 2) {
                                    o2 = dd2;
                                    o5 = o3;
                                }
                            }
                            o3 = o5;
                            o4 = o2;
                        }
                        final Iterator iterator3 = (Iterator)o;
                        if (W(2)) {
                            o = new StringBuilder();
                            ((StringBuilder)o).append("Executing operations from ");
                            ((StringBuilder)o).append(o3);
                            ((StringBuilder)o).append(" to ");
                            ((StringBuilder)o).append(o2);
                        }
                        final ArrayList list4 = new ArrayList();
                        final ArrayList list5 = new ArrayList();
                        final ArrayList list6 = new ArrayList(list3);
                        o2 = ((dd)list3.get(list3.size() - 1)).a;
                        o = list3.iterator();
                        while (((Iterator)o).hasNext()) {
                            final bo r2 = ((dd)((Iterator)o).next()).a.R;
                            final bo r3 = ((br)o2).R;
                            r2.b = r3.b;
                            r2.c = r3.c;
                            r2.d = r3.d;
                            r2.e = r3.e;
                        }
                        o = list3.iterator();
                        while (((Iterator)o).hasNext()) {
                            o2 = ((Iterator)o).next();
                            final ajm ajm = new ajm();
                            ((dd)o2).e(ajm);
                            list4.add(new bb((dd)o2, ajm, d4));
                            final ajm ajm2 = new ajm();
                            ((dd)o2).e(ajm2);
                            list5.add(new bd((dd)o2, ajm2, d4, d4 ? (o2 == o3) : (o2 == o2)));
                            ((dd)o2).c((Runnable)new da((List)list6, (dd)o2, 1));
                        }
                        final HashMap hashMap = new HashMap();
                        o = list5.iterator();
                        while (((Iterator)o).hasNext()) {
                            o2 = ((Iterator)o).next();
                            if (!((bc)o2).c()) {
                                ((bd)o2).a(((bd)o2).c);
                                ((bd)o2).a(((bd)o2).d);
                            }
                        }
                        o2 = list5.iterator();
                        while (((Iterator)o2).hasNext()) {
                            o = ((Iterator<bd>)o2).next();
                            hashMap.put(((bc)o).a, false);
                            ((bc)o).b();
                        }
                        final boolean containsValue = hashMap.containsValue(true);
                        final ViewGroup a5 = de.a;
                        final Context context = a5.getContext();
                        final ArrayList<Object> list7 = (ArrayList<Object>)new ArrayList<bb>();
                        o2 = list4.iterator();
                        boolean b11 = false;
                        o = de;
                        while (((Iterator)o2).hasNext()) {
                            final bb bb = (bb)((Iterator<bd>)o2).next();
                            if (((bc)bb).c()) {
                                ((bc)bb).b();
                            }
                            else {
                                final kh a6 = bb.a(context);
                                if (a6 == null) {
                                    ((bc)bb).b();
                                }
                                else {
                                    final Object b12 = a6.b;
                                    if (b12 == null) {
                                        list7.add(bb);
                                    }
                                    else {
                                        final dd a7 = ((bc)bb).a;
                                        final br a8 = a7.a;
                                        if (Boolean.TRUE.equals(hashMap.get(a7))) {
                                            if (W(2)) {
                                                final StringBuilder sb4 = new StringBuilder();
                                                sb4.append("Ignoring Animator set on ");
                                                sb4.append(a8);
                                            }
                                            ((bc)bb).b();
                                        }
                                        else {
                                            final boolean b13 = a7.e == 3;
                                            if (b13) {
                                                list6.remove(a7);
                                            }
                                            final View o6 = a8.O;
                                            a5.startViewTransition(o6);
                                            ((Animator)b12).addListener((Animator$AnimatorListener)new ax(a5, o6, b13, a7, bb));
                                            ((Animator)b12).setTarget((Object)o6);
                                            ((Animator)b12).start();
                                            if (W(2)) {
                                                final StringBuilder sb5 = new StringBuilder();
                                                sb5.append("Animator from operation ");
                                                sb5.append(a7);
                                            }
                                            ((bc)bb).b.b(new ay((Animator)b12, a7));
                                            b11 = true;
                                        }
                                    }
                                }
                            }
                        }
                        for (int size5 = list7.size(), n21 = 0; n21 < size5; ++n21) {
                            o2 = list7.get(n21);
                            final dd a9 = ((bc)o2).a;
                            final br a10 = a9.a;
                            if (containsValue) {
                                if (W(2)) {
                                    final StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Ignoring Animation set on ");
                                    sb6.append(a10);
                                }
                                ((bc)o2).b();
                            }
                            else if (b11) {
                                if (W(2)) {
                                    final StringBuilder sb7 = new StringBuilder();
                                    sb7.append("Ignoring Animation set on ");
                                    sb7.append(a10);
                                }
                                ((bc)o2).b();
                            }
                            else {
                                final View o7 = a10.O;
                                final kh a11 = ((bb)o2).a(context);
                                afc.j(a11);
                                final Object a12 = a11.a;
                                afc.j(a12);
                                if (a9.e != 1) {
                                    o7.startAnimation((Animation)a12);
                                    ((bc)o2).b();
                                }
                                else {
                                    a5.startViewTransition(o7);
                                    final bv bv = new bv((Animation)a12, a5, o7);
                                    ((Animation)bv).setAnimationListener((Animation$AnimationListener)new az(a9, a5, o7, (bb)o2));
                                    o7.startAnimation((Animation)bv);
                                    if (W(2)) {
                                        final StringBuilder sb8 = new StringBuilder();
                                        sb8.append("Animation from operation ");
                                        sb8.append(a9);
                                    }
                                }
                                ((bc)o2).b.b(new ba(o7, a5, (bb)o2, a9));
                            }
                        }
                        for (int size6 = list6.size(), n22 = 0; n22 < size6; ++n22) {
                            de.e((dd)list6.get(n22));
                        }
                        list6.clear();
                        if (W(2)) {
                            o2 = new StringBuilder();
                            ((StringBuilder)o2).append("Completed executing operations from ");
                            ((StringBuilder)o2).append(o3);
                            ((StringBuilder)o2).append(" to ");
                            ((StringBuilder)o2).append(o2);
                        }
                        ((de)o).d = false;
                        o = iterator3;
                    }
                }
            }
            break;
        }
        while (i < n) {
            final av av4 = list.get(i);
            if (list2.get(i) && av4.c >= 0) {
                av4.c = -1;
            }
            if (av4.t != null) {
                for (int n23 = 0; n23 < av4.t.size(); ++n23) {
                    ((Runnable)av4.t.get(n23)).run();
                }
                av4.t = null;
            }
            ++i;
        }
        if (n18 != 0 && this.i != null) {
            for (i = 0; i < this.i.size(); ++i) {
                this.i.get(i).B();
            }
        }
    }
    
    private final void ax() {
        for (de de : this.aq()) {}
    }
    
    private final void ay(final ArrayList list, final ArrayList list2) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == list2.size()) {
            final int size = list.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                int n2 = i;
                int n3 = n;
                if (!((av)list.get(i)).s) {
                    if (n != i) {
                        this.aw(list, list2, n, i);
                    }
                    int n4;
                    n3 = (n4 = i + 1);
                    if (list2.get(i)) {
                        while ((n3 = n4) < size) {
                            n3 = n4;
                            if (!(boolean)list2.get(n4)) {
                                break;
                            }
                            n3 = n4;
                            if (((av)list.get(n4)).s) {
                                break;
                            }
                            ++n4;
                        }
                    }
                    this.aw(list, list2, i, n3);
                    n2 = n3 - 1;
                }
                i = n2 + 1;
                n = n3;
            }
            if (n != size) {
                this.aw(list, list2, n, size);
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }
    
    private final void az(final br br) {
        final ViewGroup ap = this.ap(br);
        if (ap != null && br.nh() + br.nT() + br.nU() + br.nJ() > 0) {
            if (ap.getTag(2131432388) == null) {
                ap.setTag(2131432388, (Object)br);
            }
            ((br)ap.getTag(2131432388)).al(br.aq());
        }
    }
    
    public final void A() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        this.B(5);
    }
    
    public final void B(final int a) {
        try {
            this.A = true;
            for (final msg msg : this.a.b.values()) {
                if (msg != null) {
                    msg.a = a;
                }
            }
            this.H(a, false);
            final Iterator iterator2 = this.aq().iterator();
            while (iterator2.hasNext()) {
                ((de)iterator2.next()).c();
            }
            this.A = false;
            this.ah(true);
        }
        finally {
            this.A = false;
            while (true) {}
        }
    }
    
    public final void C() {
        this.v = true;
        this.x.g = true;
        this.B(4);
    }
    
    public final void D(final String s, FileDescriptor z, final PrintWriter printWriter, final String[] array) {
        final cr a = this.a;
        if (!a.b.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Active Fragments:");
            for (final msg msg : a.b.values()) {
                printWriter.print(s);
                if (msg != null) {
                    final String value = String.valueOf(s);
                    final Object b = msg.b;
                    printWriter.println(b);
                    ((br)b).R(value.concat("    "), z, printWriter, array);
                }
                else {
                    printWriter.println("null");
                }
            }
        }
        final int size = a.a.size();
        final int n = 0;
        if (size > 0) {
            printWriter.print(s);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; ++i) {
                final br br = a.a.get(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(br.toString());
            }
        }
        final ArrayList b2 = this.B;
        if (b2 != null) {
            final int size2 = b2.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int j = 0; j < size2; ++j) {
                    final br br2 = this.B.get(j);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(j);
                    printWriter.print(": ");
                    printWriter.println(br2.toString());
                }
            }
        }
        final ArrayList b3 = this.b;
        if (b3 != null) {
            final int size3 = b3.size();
            if (size3 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int k = 0; k < size3; ++k) {
                    final String value2 = String.valueOf(s);
                    final av av = this.b.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(av.toString());
                    av.g(value2.concat("    "), printWriter);
                }
            }
        }
        printWriter.print(s);
        final StringBuilder sb = new StringBuilder("Back Stack Index: ");
        sb.append(this.f.get());
        printWriter.println(sb.toString());
        z = (FileDescriptor)this.z;
        monitorenter(z);
        try {
            final int size4 = this.z.size();
            if (size4 > 0) {
                printWriter.print(s);
                printWriter.println("Pending Actions:");
                for (int l = n; l < size4; ++l) {
                    final cj cj = this.z.get(l);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(l);
                    printWriter.print(": ");
                    printWriter.println(cj);
                }
            }
            monitorexit(z);
            printWriter.print(s);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(s);
            printWriter.print("  mHost=");
            printWriter.println(this.l);
            printWriter.print(s);
            printWriter.print("  mContainer=");
            printWriter.println(this.m);
            if (this.n != null) {
                printWriter.print(s);
                printWriter.print("  mParent=");
                printWriter.println(this.n);
            }
            printWriter.print(s);
            printWriter.print("  mCurState=");
            printWriter.print(this.k);
            printWriter.print(" mStateSaved=");
            printWriter.print(this.u);
            printWriter.print(" mStopped=");
            printWriter.print(this.v);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.w);
            if (this.t) {
                printWriter.print(s);
                printWriter.print("  mNeedMenuInvalidate=");
                printWriter.println(this.t);
            }
        }
        finally {
            monitorexit(z);
            while (true) {}
        }
    }
    
    final void E(final cj cj, final boolean b) {
        if (!b) {
            if (this.l == null) {
                if (this.w) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            else {
                this.ar();
            }
        }
        synchronized (this.z) {
            if (this.l == null) {
                if (b) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            else {
                this.z.add(cj);
                synchronized (this.z) {
                    if (this.z.size() == 1) {
                        this.l.d.removeCallbacks(this.N);
                        this.l.d.post(this.N);
                        this.R();
                    }
                }
            }
        }
    }
    
    final void F(final cj cj, final boolean b) {
        if (b && (this.l == null || this.w)) {
            return;
        }
        this.av(b);
        cj.i(this.K, this.L);
        this.A = true;
        try {
            this.ay(this.K, this.L);
            this.as();
            this.R();
            this.at();
            this.a.h();
        }
        finally {
            this.as();
        }
    }
    
    final void G(final br br) {
        if (W(2)) {
            new StringBuilder("hide: ").append(br);
        }
        if (!br.G) {
            br.G = true;
            br.S ^= true;
            this.az(br);
        }
    }
    
    final void H(int i, final boolean b) {
        if (this.l == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!b && i == this.k) {
            return;
        }
        this.k = i;
        final cr a = this.a;
        final ArrayList a2 = a.a;
        int size;
        msg msg;
        for (size = a2.size(), i = 0; i < size; ++i) {
            msg = a.b.get(((br)a2.get(i)).l);
            if (msg != null) {
                msg.g();
            }
        }
        for (final msg msg2 : a.b.values()) {
            if (msg2 != null) {
                msg2.g();
                final br br = (br)msg2.b;
                if (!br.s || br.at()) {
                    continue;
                }
                final boolean t = br.t;
                a.m(msg2);
            }
        }
        this.aA();
        if (this.t) {
            final bz l = this.l;
            if (l != null && this.k == 7) {
                l.c();
                this.t = false;
            }
        }
    }
    
    public final void I() {
        this.E(new ck(this, -1, 0), false);
    }
    
    public final void J(final Bundle bundle, final String s, final br br) {
        if (br.z != this) {
            final StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(br);
            sb.append(" is not currently in the FragmentManager");
            this.aB(new IllegalStateException(sb.toString()));
        }
        bundle.putString(s, br.l);
    }
    
    final void K(final br br) {
        if (W(2)) {
            new StringBuilder("remove: ").append(br);
            final int y = br.y;
        }
        final boolean at = br.at();
        if (br.H && !(at ^ true)) {
            return;
        }
        this.a.i(br);
        if (ac(br)) {
            this.t = true;
        }
        br.s = true;
        this.az(br);
    }
    
    final void L(final Parcelable parcelable) {
        final Bundle bundle = (Bundle)parcelable;
        for (final String s : bundle.keySet()) {
            if (s.startsWith("result_")) {
                final Bundle bundle2 = bundle.getBundle(s);
                if (bundle2 == null) {
                    continue;
                }
                bundle2.setClassLoader(this.l.c.getClassLoader());
                this.g.put(s.substring(7), bundle2);
            }
        }
        final HashMap<String, Bundle> hashMap = new HashMap<String, Bundle>();
        for (final String s2 : bundle.keySet()) {
            if (s2.startsWith("fragment_")) {
                final Bundle bundle3 = bundle.getBundle(s2);
                if (bundle3 == null) {
                    continue;
                }
                bundle3.setClassLoader(this.l.c.getClassLoader());
                hashMap.put(s2.substring(9), bundle3);
            }
        }
        final cr a = this.a;
        a.c.clear();
        a.c.putAll(hashMap);
        final FragmentManagerState fragmentManagerState = (FragmentManagerState)bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.a.b.clear();
        final ArrayList a2 = fragmentManagerState.a;
        final int size = a2.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final Bundle a3 = this.a.a((String)a2.get(i), (Bundle)null);
            if (a3 != null) {
                final br br = this.x.b.get(((FragmentState)a3.getParcelable("state")).b);
                msg msg;
                if (br != null) {
                    if (W(2)) {
                        new StringBuilder("restoreSaveState: re-attaching retained ").append(br);
                    }
                    msg = new msg(this.y, this.a, br, a3, (byte[])null);
                }
                else {
                    msg = new msg(this.y, this.a, this.l.c.getClassLoader(), this.h(), a3, (byte[])null);
                }
                final Object b = msg.b;
                final br br2 = (br)b;
                br2.h = a3;
                br2.z = this;
                if (W(2)) {
                    final StringBuilder sb = new StringBuilder("restoreSaveState: active (");
                    sb.append(br2.l);
                    sb.append("): ");
                    sb.append(b);
                }
                msg.h(this.l.c.getClassLoader());
                this.a.l(msg);
                msg.a = this.k;
            }
        }
        for (final br br3 : new ArrayList(this.x.b.values())) {
            if (!this.a.j(br3.l)) {
                if (W(2)) {
                    final StringBuilder sb2 = new StringBuilder("Discarding retained Fragment ");
                    sb2.append(br3);
                    sb2.append(" that was not found in the set of active Fragments ");
                    sb2.append(fragmentManagerState.a);
                }
                this.x.e(br3);
                br3.z = this;
                final msg msg2 = new msg(this.y, this.a, br3, (byte[])null);
                msg2.a = 1;
                msg2.g();
                br3.s = true;
                msg2.g();
            }
        }
        final cr a4 = this.a;
        final ArrayList b2 = fragmentManagerState.b;
        a4.a.clear();
        if (b2 != null) {
            for (final String s3 : b2) {
                final br b3 = a4.b(s3);
                if (b3 == null) {
                    final StringBuilder sb3 = new StringBuilder("No instantiated fragment for (");
                    sb3.append(s3);
                    sb3.append(")");
                    throw new IllegalStateException(sb3.toString());
                }
                if (W(2)) {
                    final StringBuilder sb4 = new StringBuilder("restoreSaveState: added (");
                    sb4.append(s3);
                    sb4.append("): ");
                    sb4.append(b3);
                }
                a4.g(b3);
            }
        }
        final BackStackRecordState[] c = fragmentManagerState.c;
        if (c != null) {
            this.b = new ArrayList(c.length);
            int n2 = 0;
            while (true) {
                final BackStackRecordState[] c2 = fragmentManagerState.c;
                if (n2 >= c2.length) {
                    break;
                }
                final BackStackRecordState backStackRecordState = c2[n2];
                final av av = new av(this);
                int n3 = 0;
                int n4 = 0;
                while (true) {
                    final int[] a5 = backStackRecordState.a;
                    if (n3 >= a5.length) {
                        break;
                    }
                    final cs cs = new cs();
                    final int n5 = n3 + 1;
                    cs.a = a5[n3];
                    if (W(2)) {
                        new StringBuilder("Instantiate ").append(av);
                        final int n6 = backStackRecordState.a[n5];
                    }
                    cs.h = auj.values()[backStackRecordState.c[n4]];
                    cs.i = auj.values()[backStackRecordState.d[n4]];
                    final int[] a6 = backStackRecordState.a;
                    final int n7 = n5 + 1;
                    cs.c = (a6[n5] != 0);
                    final int n8 = n7 + 1;
                    final int n9 = a6[n7];
                    cs.d = n9;
                    final int n10 = n8 + 1;
                    final int n11 = a6[n8];
                    cs.e = n11;
                    final int n12 = n10 + 1;
                    final int n13 = a6[n10];
                    cs.f = n13;
                    final int n14 = a6[n12];
                    cs.g = n14;
                    av.e = n9;
                    av.f = n11;
                    av.g = n13;
                    av.h = n14;
                    ((ct)av).p(cs);
                    ++n4;
                    n3 = n12 + 1;
                }
                av.i = backStackRecordState.e;
                av.l = backStackRecordState.f;
                av.j = true;
                av.m = backStackRecordState.h;
                av.n = backStackRecordState.i;
                av.o = backStackRecordState.j;
                av.p = backStackRecordState.k;
                av.q = backStackRecordState.l;
                av.r = backStackRecordState.m;
                av.s = backStackRecordState.n;
                av.c = backStackRecordState.g;
                for (int j = 0; j < backStackRecordState.b.size(); ++j) {
                    final String s4 = backStackRecordState.b.get(j);
                    if (s4 != null) {
                        av.d.get(j).b = this.d(s4);
                    }
                }
                av.c(1);
                if (W(2)) {
                    final StringBuilder sb5 = new StringBuilder("restoreAllState: back stack #");
                    sb5.append(n2);
                    sb5.append(" (index ");
                    sb5.append(av.c);
                    sb5.append("): ");
                    sb5.append(av);
                    final PrintWriter printWriter = new PrintWriter((Writer)new cx());
                    av.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.b.add(av);
                ++n2;
            }
        }
        else {
            this.b = null;
        }
        this.f.set(fragmentManagerState.d);
        final String e = fragmentManagerState.e;
        if (e != null) {
            this.w(this.o = this.d(e));
        }
        final ArrayList f = fragmentManagerState.f;
        if (f != null) {
            for (int k = n; k < f.size(); ++k) {
                this.C.put(f.get(k), fragmentManagerState.g.get(k));
            }
        }
        this.s = new ArrayDeque(fragmentManagerState.h);
    }
    
    final void M(final br br, final boolean b) {
        final ViewGroup ap = this.ap(br);
        if (ap != null && ap instanceof FragmentContainerView) {
            ((FragmentContainerView)ap).a = (b ^ true);
        }
    }
    
    public final void N(final String s, final Bundle bundle) {
        final ci ci = this.h.get(s);
        if (ci != null && ci.a.a().a(auj.d)) {
            ci.a(s, bundle);
        }
        else {
            this.g.put(s, bundle);
        }
        if (W(2)) {
            final StringBuilder sb = new StringBuilder("Setting fragment result with key ");
            sb.append(s);
            sb.append(" and result ");
            sb.append(bundle);
        }
    }
    
    public final void O(final String s, final aup aup, final cp cp) {
        final auk lifecycle = aup.getLifecycle();
        if (lifecycle.a() == auj.a) {
            return;
        }
        final FragmentManager$6 fragmentManager$6 = new FragmentManager$6(this, s, cp, lifecycle);
        lifecycle.b((auo)fragmentManager$6);
        final ci ci = this.h.put(s, new ci(lifecycle, cp, (aun)fragmentManager$6));
        if (ci != null) {
            ci.a.c((auo)ci.b);
        }
        if (W(2)) {
            final StringBuilder sb = new StringBuilder("Setting FragmentResultListener with key ");
            sb.append(s);
            sb.append(" lifecycleOwner ");
            sb.append(lifecycle);
            sb.append(" and listener ");
            sb.append(cp);
        }
    }
    
    final void P(final br br, final auj w) {
        if (br.equals((Object)this.d(br.l)) && (br.A == null || br.z == this)) {
            br.W = w;
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(br);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    final void Q(final br o) {
        Label_0080: {
            if (o != null) {
                if (o.equals((Object)this.d(o.l))) {
                    if (o.A == null) {
                        break Label_0080;
                    }
                    if (o.z == this) {
                        break Label_0080;
                    }
                }
                final StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(o);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        final br o2 = this.o;
        this.o = o;
        this.w(o2);
        this.w(this.o);
    }
    
    public final void R() {
        synchronized (this.z) {
            final boolean empty = this.z.isEmpty();
            boolean b = true;
            if (!empty) {
                this.e.e(true);
                return;
            }
            monitorexit(this.z);
            final qx e = this.e;
            if (this.a() <= 0 || !this.Y(this.n)) {
                b = false;
            }
            e.e(b);
        }
    }
    
    final boolean S(final MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (final br br : this.a.f()) {
            if (br != null && !br.G && br.B.S(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    final boolean T(final Menu menu, final MenuInflater menuInflater) {
        final int k = this.k;
        final int n = 0;
        if (k <= 0) {
            return false;
        }
        final Iterator iterator = this.a.f().iterator();
        ArrayList b = null;
        boolean b2 = false;
        while (iterator.hasNext()) {
            final br br = (br)iterator.next();
            if (br != null && ad(br) && !br.G && ((br.K && br.L) | br.B.T(menu, menuInflater))) {
                ArrayList list;
                if ((list = b) == null) {
                    list = new ArrayList();
                }
                list.add(br);
                b2 = true;
                b = list;
            }
        }
        if (this.B != null) {
            for (int i = n; i < this.B.size(); ++i) {
                final br br2 = this.B.get(i);
                if (b != null) {
                    b.contains(br2);
                }
            }
        }
        this.B = b;
        return b2;
    }
    
    final boolean U(final MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (final br br : this.a.f()) {
            if (br != null && !br.G) {
                if (br.K && br.L) {
                    br.aE(menuItem);
                }
                if (br.B.U(menuItem)) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    final boolean V(final Menu menu) {
        if (this.k <= 0) {
            return false;
        }
        final Iterator iterator = this.a.f().iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final br br = (br)iterator.next();
            if (br != null && ad(br) && !br.G && (br.B.V(menu) | (br.K && br.L))) {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean X() {
        final br n = this.n;
        return n == null || (n.ar() && n.G().X());
    }
    
    final boolean Y(final br br) {
        if (br == null) {
            return true;
        }
        final cl z = br.z;
        return br.equals((Object)z.o) && this.Y(z.n);
    }
    
    public final boolean Z() {
        return this.u || this.v;
    }
    
    public final int a() {
        final ArrayList b = this.b;
        if (b != null) {
            return b.size();
        }
        return 0;
    }
    
    public final boolean aa() {
        return this.ai(0);
    }
    
    public final void ab() {
        this.ah(true);
        this.ax();
    }
    
    public final void ae(final int n, final boolean b) {
        if (n >= 0) {
            this.E(new ck(this, n, 1), b);
            return;
        }
        final StringBuilder sb = new StringBuilder("Bad id: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    final boolean af(final ArrayList list, final ArrayList list2, int n, int i) {
        final ArrayList b = this.b;
        Label_0189: {
            Label_0187: {
                if (b != null) {
                    if (!b.isEmpty()) {
                        if (n >= 0) {
                            int n2;
                            for (n2 = this.b.size() - 1; n2 >= 0 && n != ((av)this.b.get(n2)).c; --n2) {}
                            if (n2 >= 0) {
                                int n3 = n2;
                                if (i == 0) {
                                    if (n2 == this.b.size() - 1) {
                                        break Label_0187;
                                    }
                                    n = n2 + 1;
                                    break Label_0189;
                                }
                                else {
                                    while ((n2 = n3) > 0) {
                                        final ArrayList b2 = this.b;
                                        i = n3 - 1;
                                        n2 = n3;
                                        if (n != ((av)b2.get(i)).c) {
                                            break;
                                        }
                                        n3 = i;
                                    }
                                }
                            }
                            n = n2;
                            break Label_0189;
                        }
                        if (i != 0) {
                            n = 0;
                            break Label_0189;
                        }
                        n = this.b.size() - 1;
                        break Label_0189;
                    }
                }
            }
            n = -1;
        }
        if (n < 0) {
            return false;
        }
        for (i = this.b.size() - 1; i >= n; --i) {
            list.add(this.b.remove(i));
            list2.add(true);
        }
        return true;
    }
    
    public final void ah(final boolean b) {
        this.av(b);
        while (true) {
            final ArrayList k = this.K;
            final ArrayList l = this.L;
            final ArrayList z = this.z;
            monitorenter(z);
            try {
                Label_0153: {
                    if (this.z.isEmpty()) {
                        monitorexit(z);
                        break Label_0153;
                    }
                    try {
                        final int size = this.z.size();
                        int i = 0;
                        boolean b2 = false;
                        while (i < size) {
                            b2 |= this.z.get(i).i(k, l);
                            ++i;
                        }
                        this.z.clear();
                        this.l.d.removeCallbacks(this.N);
                        monitorexit(z);
                        if (b2) {
                            this.A = true;
                            try {
                                this.ay(this.K, this.L);
                                continue;
                            }
                            finally {
                                this.as();
                            }
                        }
                        this.R();
                        this.at();
                        this.a.h();
                    }
                    finally {
                        this.z.clear();
                        this.l.d.removeCallbacks(this.N);
                    }
                }
            }
            finally {
                monitorexit(z);
                while (true) {}
            }
        }
    }
    
    public final boolean ai(final int n) {
        this.ah(false);
        this.av(true);
        final br o = this.o;
        if (o != null && o.oc().aa()) {
            return true;
        }
        final boolean af = this.af(this.K, this.L, -1, n);
        if (af) {
            this.A = true;
            try {
                this.ay(this.K, this.L);
            }
            finally {
                this.as();
            }
        }
        this.R();
        this.at();
        this.a.h();
        return af;
    }
    
    final msg aj(final br br) {
        final String v = br.V;
        if (v != null) {
            atj.a(br, v);
        }
        if (W(2)) {
            new StringBuilder("add: ").append(br);
        }
        final msg ak = this.ak(br);
        br.z = this;
        this.a.l(ak);
        if (!br.H) {
            this.a.g(br);
            br.s = false;
            if (br.O == null) {
                br.S = false;
            }
            if (ac(br)) {
                this.t = true;
            }
        }
        return ak;
    }
    
    final msg ak(final br br) {
        final msg k = this.a.k(br.l);
        if (k != null) {
            return k;
        }
        final msg msg = new msg(this.y, this.a, br, (byte[])null);
        msg.h(this.l.c.getClassLoader());
        msg.a = this.k;
        return msg;
    }
    
    final void al(final msg msg) {
        final br br = (br)msg.b;
        if (br.P) {
            if (this.A) {
                this.J = true;
                return;
            }
            br.P = false;
            msg.g();
        }
    }
    
    public final void am(final di di, final boolean b) {
        ((CopyOnWriteArrayList<fwz>)this.y.a).add(new fwz(di, b, (byte[])null, (byte[])null));
    }
    
    public final void an(final di di) {
        final kh y = this.y;
        final Object a = y.a;
        monitorenter(a);
        try {
            for (int size = ((CopyOnWriteArrayList)y.a).size(), i = 0; i < size; ++i) {
                if (((fwz)((CopyOnWriteArrayList)y.a).get(i)).b == di) {
                    ((CopyOnWriteArrayList)y.a).remove(i);
                    break;
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    final di ao() {
        final br n = this.n;
        if (n != null) {
            return n.z.ao();
        }
        return this.O;
    }
    
    public final Bundle b() {
        final Bundle bundle = new Bundle();
        this.ax();
        this.au();
        this.ah(true);
        this.u = true;
        this.x.g = true;
        final cr a = this.a;
        final ArrayList a2 = new ArrayList<String>(a.b.size());
        for (final msg msg : a.b.values()) {
            if (msg != null) {
                final Object b = msg.b;
                final br br = (br)b;
                a.a(br.l, msg.c());
                a2.add(br.l);
                if (!W(2)) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder("Saved state of ");
                sb.append(b);
                sb.append(": ");
                sb.append(br.h);
            }
        }
        final HashMap c2 = this.a.c;
        if (c2.isEmpty()) {
            return bundle;
        }
        final cr a3 = this.a;
        Object c = a3.a;
        monitorenter(c);
        try {
            final boolean empty = a3.a.isEmpty();
            final BackStackRecordState[] array = null;
            ArrayList<String> b2;
            if (empty) {
                monitorexit(c);
                b2 = null;
            }
            else {
                b2 = new ArrayList<String>(a3.a.size());
                for (final br br2 : a3.a) {
                    b2.add(br2.l);
                    if (W(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("saveAllState: adding fragment (");
                        sb2.append(br2.l);
                        sb2.append("): ");
                        sb2.append(br2);
                    }
                }
                monitorexit(c);
            }
            final ArrayList b3 = this.b;
            c = array;
            if (b3 != null) {
                final int size = b3.size();
                c = array;
                if (size > 0) {
                    final BackStackRecordState[] array2 = new BackStackRecordState[size];
                    int n = 0;
                    while (true) {
                        c = array2;
                        if (n >= size) {
                            break;
                        }
                        array2[n] = new BackStackRecordState((av)this.b.get(n));
                        if (W(2)) {
                            c = new StringBuilder("saveAllState: adding back stack #");
                            ((StringBuilder)c).append(n);
                            ((StringBuilder)c).append(": ");
                            ((StringBuilder)c).append(this.b.get(n));
                        }
                        ++n;
                    }
                }
            }
            final FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = a2;
            fragmentManagerState.b = b2;
            fragmentManagerState.c = (BackStackRecordState[])c;
            fragmentManagerState.d = this.f.get();
            final br o = this.o;
            if (o != null) {
                fragmentManagerState.e = o.l;
            }
            fragmentManagerState.f.addAll(this.C.keySet());
            fragmentManagerState.g.addAll(this.C.values());
            fragmentManagerState.h = new ArrayList(this.s);
            bundle.putParcelable("state", (Parcelable)fragmentManagerState);
            c = this.g.keySet().iterator();
            while (((Iterator)c).hasNext()) {
                final String s = (String)((Iterator<msg>)c).next();
                bundle.putBundle("result_".concat(String.valueOf(s)), (Bundle)this.g.get(s));
            }
            for (final String s2 : c2.keySet()) {
                c = String.valueOf(s2);
                bundle.putBundle("fragment_".concat((String)c), (Bundle)c2.get(s2));
            }
            return bundle;
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public final Fragment$SavedState c(final br br) {
        final msg k = this.a.k(br.l);
        if (k == null || !((br)k.b).equals((Object)br)) {
            final StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(br);
            sb.append(" is not currently in the FragmentManager");
            this.aB(new IllegalStateException(sb.toString()));
        }
        if (((br)k.b).g >= 0) {
            return new Fragment$SavedState(k.c());
        }
        return null;
    }
    
    final br d(final String s) {
        return this.a.b(s);
    }
    
    public final br e(final int n) {
        final cr a = this.a;
        int size = a.a.size();
        Object b = null;
    Label_0125:
        while (true) {
            final int n2 = size - 1;
            if (n2 < 0) {
                for (final msg msg : a.b.values()) {
                    if (msg != null) {
                        b = msg.b;
                        if (((br)b).D == n) {
                            break Label_0125;
                        }
                        continue;
                    }
                }
                b = null;
                break;
            }
            b = a.a.get(n2);
            size = n2;
            if (b == null) {
                continue;
            }
            size = n2;
            if (((br)b).D == n) {
                break;
            }
        }
        return (br)b;
    }
    
    public final br f(final String s) {
        final cr a = this.a;
        if (s != null) {
            int size = a.a.size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final Object b = a.a.get(n);
                size = n;
                if (b == null) {
                    continue;
                }
                size = n;
                if (s.equals(((br)b).F)) {
                    return (br)b;
                }
            }
        }
        Object b;
        final br br = (br)(b = null);
        if (s != null) {
            final Iterator iterator = a.b.values().iterator();
            while (true) {
                b = br;
                if (!iterator.hasNext()) {
                    break;
                }
                final msg msg = (msg)iterator.next();
                if (msg == null) {
                    continue;
                }
                b = msg.b;
                if (s.equals(((br)b).F)) {
                    break;
                }
            }
        }
        return (br)b;
    }
    
    public final br g(final Bundle bundle, final String s) {
        final String string = bundle.getString(s);
        if (string == null) {
            return null;
        }
        final br d = this.d(string);
        if (d == null) {
            final StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(s);
            sb.append(": unique id ");
            sb.append(string);
            this.aB(new IllegalStateException(sb.toString()));
        }
        return d;
    }
    
    public final by h() {
        final br n = this.n;
        if (n != null) {
            return n.z.h();
        }
        return this.I;
    }
    
    public final ct i() {
        return (ct)new av(this);
    }
    
    public final List j() {
        return this.a.f();
    }
    
    public final void k(final cn cn) {
        this.j.add(cn);
    }
    
    public final void l(bz l, final bw m, final br n) {
        if (this.l == null) {
            this.l = l;
            this.m = m;
            if ((this.n = n) != null) {
                this.k(new cf());
            }
            else if (l instanceof cn) {
                this.k((cn)l);
            }
            if (this.n != null) {
                this.R();
            }
            if (l instanceof rb) {
                final ra onBackPressedDispatcher = ((rb)l).getOnBackPressedDispatcher();
                this.d = onBackPressedDispatcher;
                Object o;
                if (n != null) {
                    o = n;
                }
                else {
                    o = l;
                }
                onBackPressedDispatcher.b((aup)o, this.e);
            }
            if (n != null) {
                final cm x = n.z.x;
                cm x2;
                if ((x2 = x.c.get(n.l)) == null) {
                    x2 = new cm(x.e);
                    x.c.put(n.l, x2);
                }
                this.x = x2;
            }
            else if (l instanceof avw) {
                this.x = (cm)new alo(((avw)l).getViewModelStore(), cm.a).h((Class)cm.class);
            }
            else {
                this.x = new cm(false);
            }
            final cm x3 = this.x;
            x3.g = this.Z();
            this.a.d = x3;
            l = this.l;
            if (l instanceof cgn && n == null) {
                final cgl savedStateRegistry = ((cgn)l).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new cb(this, 0));
                final Bundle a = savedStateRegistry.a("android:support:fragments");
                if (a != null) {
                    this.L((Parcelable)a);
                }
            }
            l = this.l;
            if (l instanceof rk) {
                final rj activityResultRegistry = ((rk)l).getActivityResultRegistry();
                String concat;
                if (n != null) {
                    concat = String.valueOf(n.l).concat(":");
                }
                else {
                    concat = "";
                }
                final rp rp = new rp();
                final cg cg = new cg(this, 0);
                final String concat2 = "FragmentManager:".concat(concat);
                this.p = activityResultRegistry.a(concat2.concat("StartActivityForResult"), (rm)rp, (re)cg);
                this.q = activityResultRegistry.a(concat2.concat("StartIntentSenderForResult"), (rm)new ch(), (re)new cg(this, 2));
                this.r = activityResultRegistry.a(concat2.concat("RequestPermissions"), (rm)new rn(), (re)new cg(this, 1));
            }
            l = this.l;
            if (l instanceof ahf) {
                ((ahf)l).addOnConfigurationChangedListener(this.D);
            }
            final bz i = this.l;
            if (i instanceof ahg) {
                ((qu)((bt)i).a).addOnTrimMemoryListener(this.E);
            }
            final bz j = this.l;
            if (j instanceof cy) {
                ((qu)((bt)j).a).addOnMultiWindowModeChangedListener(this.F);
            }
            final bz k = this.l;
            if (k instanceof cz) {
                ((qu)((bt)k).a).addOnPictureInPictureModeChangedListener(this.G);
            }
            l = this.l;
            if (l instanceof aln && n == null) {
                ((qu)((bt)l).a).addMenuProvider(this.H);
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }
    
    final void m(final br br) {
        if (W(2)) {
            new StringBuilder("attach: ").append(br);
        }
        if (br.H) {
            br.H = false;
            if (!br.r) {
                this.a.g(br);
                if (W(2)) {
                    new StringBuilder("add from attach: ").append(br);
                }
                if (ac(br)) {
                    this.t = true;
                }
            }
        }
    }
    
    final void n(final br br) {
        if (W(2)) {
            new StringBuilder("detach: ").append(br);
        }
        if (!br.H) {
            br.H = true;
            if (br.r) {
                if (W(2)) {
                    new StringBuilder("remove from detach: ").append(br);
                }
                this.a.i(br);
                if (ac(br)) {
                    this.t = true;
                }
                this.az(br);
            }
        }
    }
    
    public void noteStateNotSaved() {
        if (this.l == null) {
            return;
        }
        this.u = false;
        this.v = false;
        this.x.g = false;
        for (final br br : this.a.f()) {
            if (br != null) {
                br.B.noteStateNotSaved();
            }
        }
    }
    
    public final void o() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        this.B(4);
    }
    
    final void p(final Configuration configuration, final boolean b) {
        if (b && this.l instanceof ahf) {
            this.aB(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (final br br : this.a.f()) {
            if (br != null) {
                br.onConfigurationChanged(configuration);
                if (!b) {
                    continue;
                }
                br.B.p(configuration, true);
            }
        }
    }
    
    final void q() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        this.B(1);
    }
    
    public final void r() {
        this.ah(this.w = true);
        this.au();
        final bz l = this.l;
        boolean f;
        if (l instanceof avw) {
            f = this.a.d.f;
        }
        else {
            f = (true ^ ((Activity)l.c).isChangingConfigurations());
        }
        if (f) {
            final Iterator iterator = this.C.values().iterator();
            while (iterator.hasNext()) {
                final Iterator iterator2 = ((BackStackState)iterator.next()).a.iterator();
                while (iterator2.hasNext()) {
                    this.a.d.c((String)iterator2.next());
                }
            }
        }
        this.B(-1);
        final bz i = this.l;
        if (i instanceof ahg) {
            ((qu)((bt)i).a).removeOnTrimMemoryListener(this.E);
        }
        final bz j = this.l;
        if (j instanceof ahf) {
            ((ahf)j).removeOnConfigurationChangedListener(this.D);
        }
        final bz k = this.l;
        if (k instanceof cy) {
            ((qu)((bt)k).a).removeOnMultiWindowModeChangedListener(this.F);
        }
        final bz m = this.l;
        if (m instanceof cz) {
            ((qu)((bt)m).a).removeOnPictureInPictureModeChangedListener(this.G);
        }
        final bz l2 = this.l;
        if (l2 instanceof aln) {
            ((qu)((bt)l2).a).removeMenuProvider(this.H);
        }
        this.l = null;
        this.m = null;
        this.n = null;
        if (this.d != null) {
            this.e.c();
            this.d = null;
        }
        final rg p = this.p;
        if (p != null) {
            p.a();
            this.q.a();
            this.r.a();
        }
    }
    
    final void s(final boolean b) {
        if (b && this.l instanceof ahg) {
            this.aB(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (final br br : this.a.f()) {
            if (br != null) {
                br.onLowMemory();
                if (!b) {
                    continue;
                }
                br.B.s(true);
            }
        }
    }
    
    final void t(final boolean b, final boolean b2) {
        if (b2 && this.l instanceof cy) {
            this.aB(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (final br br : this.a.f()) {
            if (br != null && b2) {
                br.B.t(b, true);
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        final br n = this.n;
        if (n != null) {
            sb.append(n.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.n)));
            sb.append("}");
        }
        else {
            final bz l = this.l;
            if (l != null) {
                sb.append(l.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.l)));
                sb.append("}");
            }
            else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
    
    public final void u() {
        for (final br br : this.a.e()) {
            if (br != null) {
                br.X(br.as());
                br.B.u();
            }
        }
    }
    
    final void v(final Menu menu) {
        if (this.k <= 0) {
            return;
        }
        for (final br br : this.a.f()) {
            if (br != null && !br.G) {
                br.B.v(menu);
            }
        }
    }
    
    public final void w(final br br) {
        if (br != null && br.equals((Object)this.d(br.l))) {
            final boolean y = br.z.Y(br);
            final Boolean q = br.q;
            if (q == null || q != y) {
                br.q = y;
                final cl b = br.B;
                b.R();
                b.w(b.o);
            }
        }
    }
    
    public final void x() {
        this.B(5);
    }
    
    final void y(final boolean b, final boolean b2) {
        if (b2 && this.l instanceof cz) {
            this.aB(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (final br br : this.a.f()) {
            if (br != null) {
                br.aF();
                if (!b2) {
                    continue;
                }
                br.B.y(b, true);
            }
        }
    }
    
    public final void z() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        this.B(7);
    }
}
