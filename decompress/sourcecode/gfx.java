import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import j$.util.OptionalInt;
import com.google.apps.tiktok.account.AccountId;
import java.util.Iterator;
import android.os.Build;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import java.util.Set;
import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack$BackStackEntry;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import android.support.v4.app.Fragment$SavedState;
import java.util.function.Consumer;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;
import java.util.List;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfx implements ggs, cgg
{
    public final SparseArray a;
    public final arhr b;
    public final fzo c;
    private final fa d;
    private final cl e;
    private final atjj f;
    private int g;
    private ggq h;
    private final atje i;
    private final atje j;
    private final List k;
    private final fap l;
    private final uyi m;
    private final uyi n;
    private final avt o;
    private final vup p;
    private final vup q;
    private final vup r;
    private final vup s;
    private final avt t;
    
    public gfx(final fa d, final avt o, final arhr b, final fzo c, final uyi m, final uyi n, final Optional optional, final atjj f, final fap l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.p = vup.P((ttk)eyg.e);
        this.q = vup.P((ttk)eyg.f);
        this.r = vup.P((ttk)eyg.g);
        this.i = ((atje)atir.e()).aX();
        this.t = avt.af();
        this.s = vup.P((ttk)eyg.h);
        this.f = f;
        d.getClass();
        this.d = d;
        this.e = d.getSupportFragmentManager();
        o.getClass();
        this.o = o;
        this.b = b;
        this.c = c;
        this.m = m;
        this.n = n;
        this.l = l;
        this.g = (int)optional.filter((Predicate)fqf.m).map((Function)fwc.s).orElse((Object)0);
        this.a = (SparseArray)optional.map((Function)fwc.t).orElseGet((Supplier)fde.e);
        this.k = (List)optional.map((Function)fwc.u).orElseGet((Supplier)fde.f);
        this.j = ((atje)atir.aR((Object)ggm.c(0, -1))).aX();
    }
    
    private final Pane O() {
        final int g = this.g;
        final Pane pane = (Pane)this.R(g).orElseGet((Supplier)new gfv(g));
        this.a.put(g, (Object)pane);
        return pane;
    }
    
    private final Optional P() {
        return this.R(this.g);
    }
    
    private final Optional Q() {
        return this.P().map((Function)gfu.j);
    }
    
    private final Optional R(final int n) {
        return Optional.ofNullable((Object)this.a.get(n));
    }
    
    private final void S(final PaneDescriptor paneDescriptor) {
        Optional.ofNullable((Object)paneDescriptor).map((Function)gfu.d).ifPresent((Consumer)new gft(this, 3));
    }
    
    private final void T() {
        this.k.clear();
        this.t.T((Consumer)fwb.s);
    }
    
    private final void U() {
        final PaneDescriptor d = this.d();
        if (d == null) {
            return;
        }
        final ggh f = this.f();
        Fragment$SavedState c = null;
        String f2;
        Object bc;
        if (f != null && PaneDescriptor.s(PaneDescriptor.b(f), d, this.o)) {
            c = this.e.c((br)f);
            f2 = ((br)f).F;
            bc = f.bc();
        }
        else {
            bc = (f2 = null);
        }
        this.O().b.d(d, c, bc, f2);
    }
    
    private final boolean V(final Predicate predicate) {
        final Optional map = Optional.ofNullable((Object)this.f()).filter((Predicate)new fqe((Class)ggk.class, 6)).map((Function)new fnm((Class)ggk.class, 11));
        predicate.getClass();
        return (boolean)map.map((Function)new fnm(predicate, 7)).orElse((Object)false);
    }
    
    private final boolean W(ggj ggj) {
        ggj = (ggj)Optional.ofNullable((Object)this.h).map((Function)new fnm(ggj, 10)).orElse((Object)ggj);
        this.d();
        final int b = ggj.b;
        boolean x = false;
        Label_0899: {
            if (b != 0) {
                int n = 2130772046;
                int n2 = 2130772044;
                final boolean b2 = false;
                final Object o = null;
                final Object o2 = null;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                x = b2;
                                break Label_0899;
                            }
                            if (!this.V((Predicate)fqf.l)) {
                                x = b2;
                                if (!this.J()) {
                                    break Label_0899;
                                }
                            }
                        }
                        else {
                            final PaneDescriptor a = ggj.a;
                            if (a == null) {
                                x = b2;
                                break Label_0899;
                            }
                            if (!this.V((Predicate)new fqe(a, 5))) {
                                x = b2;
                                if (!this.X(ggj)) {
                                    break Label_0899;
                                }
                            }
                        }
                    }
                    else {
                        final PaneDescriptor a2 = ggj.a;
                        final ggh f = this.f();
                        if (!(f instanceof ggk) || !((ggk)f).mF()) {
                            final boolean i = this.I();
                            if (i && a2 == null) {
                                x = b2;
                                break Label_0899;
                            }
                            final boolean c = ggj.c;
                            final Optional q = this.Q();
                            final PaneDescriptor e = this.e();
                            Object a3 = null;
                            Object b3 = null;
                            String d = null;
                            Object o3 = null;
                            Label_0421: {
                                if (q.map((Function)fwc.r).orElse((Object)false)) {
                                    final Optional q2 = this.Q();
                                    Optional optional;
                                    if (q2.isEmpty()) {
                                        optional = Optional.empty();
                                    }
                                    else {
                                        final PaneBackStack paneBackStack = (PaneBackStack)q2.get();
                                        final PaneBackStack$BackStackEntry paneBackStack$BackStackEntry = paneBackStack.a.peekLast();
                                        while (!paneBackStack.e()) {
                                            final PaneBackStack$BackStackEntry c2 = paneBackStack.c();
                                            c2.getClass();
                                            this.S(c2.a);
                                        }
                                        optional = Optional.ofNullable((Object)paneBackStack$BackStackEntry);
                                    }
                                    if (!c && optional.isPresent()) {
                                        a3 = ((PaneBackStack$BackStackEntry)optional.get()).a;
                                        b3 = ((PaneBackStack$BackStackEntry)optional.get()).b;
                                        final Object c3 = ((PaneBackStack$BackStackEntry)optional.get()).c;
                                        d = ((PaneBackStack$BackStackEntry)optional.get()).d;
                                        o3 = c3;
                                        break Label_0421;
                                    }
                                }
                                a3 = (d = null);
                                b3 = (o3 = d);
                            }
                            if (a3 == null || !PaneDescriptor.q((PaneDescriptor)a3, e, this.o)) {
                                d = null;
                                b3 = (o3 = d);
                                a3 = e;
                            }
                            boolean b4;
                            String s;
                            Object o4;
                            Object o5;
                            if (a2 != null) {
                                if (i) {
                                    n = 0;
                                }
                                if (i) {
                                    n2 = 0;
                                }
                                this.F(a2);
                                b4 = (i ^ true);
                                s = null;
                                a3 = a2;
                                o4 = s;
                                o5 = o2;
                            }
                            else {
                                final Object o6 = b3;
                                o5 = o3;
                                n2 = 2130772044;
                                n = 2130772046;
                                b4 = true;
                                s = d;
                                o4 = o6;
                            }
                            if (a3 == null) {
                                x = b2;
                                break Label_0899;
                            }
                            this.S(this.d());
                            this.v(this.d(), this.f(), (PaneDescriptor)a3);
                            this.B((PaneDescriptor)a3, (Fragment$SavedState)o4, o5, s, n2, n, false, b4);
                        }
                    }
                }
                else {
                    final PaneDescriptor a4 = ggj.a;
                    final ggh f2 = this.f();
                    if (!(f2 instanceof ggk) || !((ggk)f2).J()) {
                        final boolean j = this.I();
                        if (j && a4 == null) {
                            x = b2;
                            break Label_0899;
                        }
                        this.Y(ggj);
                        final Optional q3 = this.Q();
                        final PaneDescriptor e2 = this.e();
                        PaneDescriptor a5;
                        Object b5;
                        Object c5;
                        String d2;
                        if (q3.map((Function)gfu.l).orElse((Object)false)) {
                            final PaneBackStack$BackStackEntry c4 = ((PaneBackStack)q3.get()).c();
                            c4.getClass();
                            a5 = c4.a;
                            b5 = c4.b;
                            c5 = c4.c;
                            d2 = c4.d;
                        }
                        else {
                            d2 = null;
                            b5 = (c5 = d2);
                            a5 = e2;
                        }
                        int n3;
                        int n4;
                        boolean b6;
                        if (a4 != null) {
                            if (PaneDescriptor.q(a5, e2, this.o)) {
                                this.F(a4);
                            }
                            if (j) {
                                n3 = 0;
                                n4 = 0;
                                b6 = false;
                            }
                            else {
                                n3 = 2130772044;
                                n4 = 2130772046;
                                b6 = true;
                            }
                            b5 = null;
                            a5 = a4;
                            d2 = null;
                            c5 = o;
                        }
                        else {
                            n3 = 2130772044;
                            n4 = 2130772046;
                            b6 = true;
                        }
                        if (a5 == null) {
                            x = b2;
                            break Label_0899;
                        }
                        this.S(this.d());
                        this.v(this.d(), this.f(), a5);
                        this.B(a5, (Fragment$SavedState)b5, c5, d2, n3, n4, false, b6);
                    }
                }
                x = true;
            }
            else {
                x = this.X(ggj);
            }
        }
        if (x) {
            this.p.C((Object)new ardu(this.d(), b));
        }
        return x;
    }
    
    private final boolean X(final ggj ggj) {
        final PaneDescriptor a = ggj.a;
        if (a == null) {
            return false;
        }
        final Optional q = this.Q();
        final PaneDescriptor d = this.d();
        final PaneDescriptor e = this.e();
        final boolean b = !this.Y(ggj) && d != null && !this.Z(d, a);
        int n2 = 0;
        Label_0210: {
            if (b) {
                this.U();
            }
            else {
                this.S(d);
                if (q.isPresent()) {
                    final PaneBackStack paneBackStack = (PaneBackStack)q.get();
                    int n = 0;
                    while (true) {
                        n2 = n;
                        if (paneBackStack.e()) {
                            break Label_0210;
                        }
                        final PaneBackStack$BackStackEntry b2 = paneBackStack.b();
                        b2.getClass();
                        int n3 = n;
                        if (paneBackStack.a() == 1) {
                            n3 = n;
                            if (PaneDescriptor.q(b2.a, e, this.o)) {
                                n3 = 1;
                            }
                        }
                        n2 = n3;
                        if (!this.Z(b2.a, a)) {
                            break Label_0210;
                        }
                        paneBackStack.c();
                        this.S(b2.a);
                        if ((n = n3) == 0) {
                            continue;
                        }
                        this.F(a);
                        n = n3;
                    }
                }
            }
            n2 = 0;
        }
        if (!b && n2 == 0 && (boolean)q.map((Function)gfu.c).orElse((Object)true) && (e == null || this.Z(e, a))) {
            this.F(a);
        }
        this.v(d, this.f(), a);
        int n4;
        if (!b) {
            n4 = 0;
        }
        else {
            n4 = 2130772048;
        }
        int n5;
        if (!b) {
            n5 = 0;
        }
        else {
            n5 = 2130772050;
        }
        this.B(a, null, null, null, n4, n5, true, b);
        return true;
    }
    
    @Deprecated
    private final boolean Y(final ggj ggj) {
        if (ggj.c) {
            this.Q().ifPresent((Consumer)fwb.q);
            this.F(ggj.a);
            return true;
        }
        return false;
    }
    
    private final boolean Z(final PaneDescriptor paneDescriptor, final PaneDescriptor paneDescriptor2) {
        return (boolean)Optional.ofNullable((Object)this.h).map((Function)new gjk(paneDescriptor, paneDescriptor2, 1)).orElse((Object)false);
    }
    
    public final void A(final ggo ggo) {
        this.q.E((Object)ggo);
    }
    
    public final void B(final PaneDescriptor paneDescriptor, final Fragment$SavedState fragment$SavedState, final Object o, final String s, int b, int b2, final boolean b3, final boolean b4) {
        final Optional h = paneDescriptor.h();
        final boolean present = h.isPresent();
        final int n = 0;
        if (!present) {
            tmy.x((Context)this.d, 2132019512, 0);
            return;
        }
        final ggh ggh = (ggh)h.get();
        if (fragment$SavedState != null) {
            ((br)ggh).ai(fragment$SavedState);
        }
        if (o != null) {
            ggh.bi(o);
        }
        String s2;
        if ((s2 = s) == null) {
            s2 = "PaneFragment";
        }
        Optional optional;
        if (paneDescriptor != null) {
            optional = Optional.of((Object)this.O());
        }
        else {
            optional = this.P();
        }
        optional.ifPresent((Consumer)new gft(paneDescriptor, 5));
        final Iterator iterator = ((Set)this.f.a()).iterator();
        while (iterator.hasNext()) {
            final Object a = ((qpt)iterator.next()).a;
            if (paneDescriptor.c) {
                final AccountId at = ((WatchWhileActivity)a).m().aT;
                at.getClass();
                adwd.aX((br)ggh, at);
            }
        }
        final Optional ofNullable = Optional.ofNullable((Object)this.f());
        final boolean booleanValue = (boolean)ofNullable.map((Function)gfu.f).orElse((Object)false);
        final boolean b5 = (ggh.bo() && b3) || (booleanValue && !b3);
        int n2 = 0;
        int n3 = 0;
        Label_0351: {
            if (!this.m.bU()) {
                n2 = b;
                n3 = b2;
                if (!b5) {
                    break Label_0351;
                }
                n2 = b;
                n3 = b2;
                if (!this.m.f(45372641L)) {
                    break Label_0351;
                }
            }
            n2 = b;
            n3 = b2;
            if (b4) {
                if (b3) {
                    ofNullable.map((Function)gfu.g).ifPresent((Consumer)fwb.r);
                    n2 = 2130772049;
                    n3 = 2130772051;
                }
                else {
                    n2 = 2130772045;
                    n3 = 2130772047;
                }
            }
        }
        final agza builder = far.a.createBuilder();
        builder.copyOnWrite();
        final far far = (far)builder.instance;
        far.c = 3;
        far.b |= 0x1;
        final far far2 = (far)builder.build();
        if (Build.DEVICE.equals("generic_x86")) {
            b = 0;
        }
        else {
            b = this.l.b(far2, new atvw(n2, (char[])null));
        }
        if (Build.DEVICE.equals("generic_x86")) {
            b2 = n;
        }
        else {
            b2 = this.l.b(far2, new atvw(n3, (char[])null));
        }
        final ct i = this.e.i();
        i.B(b, b2);
        i.w(2131430247, (br)ggh, s2);
        i.e();
    }
    
    public final void C() {
        final ggh f = this.f();
        if (f != null) {
            f.bh();
        }
    }
    
    public final void D(final ClassLoader classLoader) {
        for (int i = 0; i < this.a.size(); ++i) {
            final Pane pane = (Pane)this.a.valueAt(i);
            final Iterator iterator = pane.b.a.iterator();
            while (iterator.hasNext()) {
                ((PaneBackStack$BackStackEntry)iterator.next()).a.j(classLoader);
            }
            Optional.ofNullable((Object)pane.c).ifPresent((Consumer)new gft(classLoader, 1));
            Optional.ofNullable((Object)pane.d).ifPresent((Consumer)new gft(classLoader, 0));
        }
    }
    
    public final void E(final ggq h) {
        this.h = h;
    }
    
    public final void F(final PaneDescriptor paneDescriptor) {
        Optional optional;
        if (paneDescriptor != null) {
            optional = Optional.of((Object)this.O());
        }
        else {
            optional = this.P();
        }
        optional.ifPresent((Consumer)new gft(paneDescriptor, 2));
    }
    
    public final void G() {
        final ggh f = this.f();
        if (f != null) {
            f.lQ();
        }
    }
    
    public final void H(final int g, final int n) {
        if (g >= 0) {
            final int g2 = this.g;
            if (g != g2) {
                final PaneDescriptor d = this.d();
                if (d != null) {
                    this.U();
                }
                this.g = g;
                final Optional q = this.Q();
                if (q.map((Function)gfu.b).orElse((Object)false)) {
                    final PaneBackStack$BackStackEntry c = ((PaneBackStack)q.get()).c();
                    c.getClass();
                    this.v(d, this.f(), c.a);
                    this.B(c.a, c.b, c.c, c.d, 0, 0, false, false);
                }
                else {
                    Optional.ofNullable((Object)this.e()).ifPresent((Consumer)new fuz(this, d, 9));
                }
                if (n != 1) {
                    this.k.remove((Object)this.g);
                    this.k.add(g2);
                }
                final ggm c2 = ggm.c(g2, n);
                this.s.C((Object)c2);
                this.j.tr((Object)c2);
            }
            return;
        }
        throw new IndexOutOfBoundsException("argument cannot be negative");
    }
    
    public final boolean I() {
        final PaneDescriptor d = this.d();
        final Optional map = this.Q().map((Function)new fnm(d, 9));
        final Boolean value = true;
        return (boolean)map.orElse((Object)value) && d != null && PaneDescriptor.q(d, this.e(), this.o) && (boolean)Optional.ofNullable((Object)this.f()).filter((Predicate)new fqe((Class)ggk.class, 6)).map((Function)new fnm((Class)ggk.class, 11)).map((Function)fwc.q).orElse((Object)value);
    }
    
    public final boolean J() {
        final sic b = ggj.b();
        b.g(1);
        b.a = null;
        b.f(false);
        return this.W(b.e());
    }
    
    public final boolean L(final PaneDescriptor a) {
        final sic b = ggj.b();
        b.g(0);
        b.a = a;
        b.f(false);
        return this.W(b.e());
    }
    
    public final boolean M() {
        if (this.J()) {
            return true;
        }
        final afdu g = this.g();
        while (!this.k.isEmpty()) {
            final List k = this.k;
            final Integer n = k.remove(k.size() - 1);
            n.getClass();
            final int intValue = n;
            if (((Set)g).contains(intValue)) {
                this.H(intValue, 1);
                return true;
            }
        }
        final OptionalInt optionalInt = (OptionalInt)ashe.R((Iterable)g).J((asjd)new fdl(this, 8)).W((asjc)gcr.g).aH((Object)OptionalInt.empty());
        if (optionalInt.isPresent() && this.g != optionalInt.getAsInt()) {
            this.H(optionalInt.getAsInt(), 1);
            return true;
        }
        if (this.n.f(45359221L)) {
            final ggh f = this.f();
            if (f != null && f.bp()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean N() {
        final sic b = ggj.b();
        b.g(4);
        b.a = null;
        b.f(false);
        return this.W(b.e());
    }
    
    public final Bundle a() {
        final Bundle bundle = new Bundle();
        bundle.putInt("activePaneKey", this.g);
        bundle.putIntegerArrayList("tabBackStack", new ArrayList(this.k));
        bundle.putSparseParcelableArray("panes", this.a);
        return bundle;
    }
    
    public final int b() {
        return this.g;
    }
    
    public final int c() {
        return (int)Optional.ofNullable((Object)this.h).map((Function)new fnm(this, 6)).orElse((Object)0);
    }
    
    public final PaneDescriptor d() {
        return (PaneDescriptor)this.P().map((Function)gfu.e).orElse((Object)null);
    }
    
    public final PaneDescriptor e() {
        return (PaneDescriptor)this.P().map((Function)gfu.a).orElse((Object)null);
    }
    
    public final ggh f() {
        final br e = this.e.e(2131430247);
        if (e instanceof ggh) {
            return (ggh)e;
        }
        return null;
    }
    
    public final afdu g() {
        final afds i = afdu.i();
        for (int j = 0; j < this.a.size(); ++j) {
            i.h(this.a.keyAt(j));
        }
        return i.g();
    }
    
    public final ashe h() {
        return (ashe)this.j;
    }
    
    public final ashe i() {
        return (ashe)this.i;
    }
    
    public final Optional j() {
        return this.Q().flatMap((Function)gfu.h);
    }
    
    public final Optional k(final int n) {
        return this.R(n).map((Function)gfu.a);
    }
    
    public final void m(final ggl ggl) {
        this.s.D((Object)ggl);
    }
    
    public final boolean mF() {
        final sic b = ggj.b();
        b.g(2);
        b.a = null;
        b.f(false);
        return this.W(b.e());
    }
    
    public final void n(final ggo ggo) {
        this.q.D((Object)ggo);
    }
    
    public final void o(final ggp ggp) {
        this.r.D((Object)ggp);
    }
    
    public final void p(final ggr ggr) {
        this.p.D((Object)ggr);
    }
    
    public final void q() {
        this.a.clear();
        this.g = 0;
        this.T();
    }
    
    public final void r() {
        Optional.ofNullable((Object)this.f()).ifPresent((Consumer)fwb.t);
    }
    
    public final void s() {
        final Optional p = this.P();
        this.a.clear();
        p.ifPresent((Consumer)new gft(this, 4));
        this.T();
    }
    
    public final void t(final int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException("argument cannot be negative");
        }
        if (this.a.get(n) == null) {
            return;
        }
        this.a.remove(n);
        this.T();
    }
    
    public final void u(final PaneDescriptor a) {
        final sic b = ggj.b();
        b.g(3);
        b.a = a;
        b.f(false);
        this.W(b.e());
    }
    
    public final void v(final PaneDescriptor paneDescriptor, ggh ggh, final PaneDescriptor paneDescriptor2) {
        PaneDescriptor b;
        if (ggh != null) {
            b = PaneDescriptor.b(ggh);
        }
        else {
            b = null;
        }
        PaneDescriptor paneDescriptor3;
        if (b != null && paneDescriptor == null) {
            paneDescriptor3 = b;
        }
        else {
            paneDescriptor3 = paneDescriptor;
            if (!PaneDescriptor.s(b, paneDescriptor, this.o)) {
                ggh = null;
                paneDescriptor3 = paneDescriptor;
            }
        }
        this.q.C((Object)gfw.d(paneDescriptor3, ggh, paneDescriptor2));
    }
    
    public final void w(final ggh ggh) {
        this.r.C((Object)ggh);
        this.i.tr((Object)ggh);
    }
    
    public final void x() {
        final PaneDescriptor d = this.d();
        if (d == null) {
            return;
        }
        final ggh f = this.f();
        if (f == null) {
            return;
        }
        Fragment$SavedState c;
        Object bc;
        Object o;
        if (PaneDescriptor.s(PaneDescriptor.b(f), d, this.o)) {
            c = this.e.c((br)f);
            final String f2 = ((br)f).F;
            bc = f.bc();
            o = f2;
        }
        else {
            c = null;
            o = (bc = c);
        }
        this.B(d, c, bc, (String)o, 0, 0, false, false);
    }
    
    public final void y() {
        final PaneDescriptor d = this.d();
        if (d == null) {
            return;
        }
        this.v(d, this.f(), d);
        this.B(d, null, null, null, 0, 0, false, false);
    }
    
    public final void z() {
        final ggh f = this.f();
        if (f == null) {
            return;
        }
        f.bg();
    }
}
