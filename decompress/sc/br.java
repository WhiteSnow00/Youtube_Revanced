import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.app.Application;
import android.content.ContextWrapper;
import android.support.v4.app.Fragment$SavedState;
import android.os.Parcelable;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.view.MenuItem;
import android.view.LayoutInflater$Factory2;
import android.app.Activity;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import java.util.UUID;
import android.util.SparseArray;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public class br implements ComponentCallbacks, View$OnCreateContextMenuListener, aun, avv, aue, cgk, re
{
    static final Object f;
    public bz A;
    public cl B;
    public br C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;
    boolean J;
    public boolean K;
    boolean L;
    public boolean M;
    public ViewGroup N;
    public View O;
    public boolean P;
    public boolean Q;
    public bo R;
    public boolean S;
    public LayoutInflater T;
    public boolean U;
    public String V;
    public auh W;
    public auo X;
    public cv Y;
    private int YZ;
    public auy Z;
    private final bq Zd;
    avr aa;
    public cgj ab;
    public final AtomicInteger ac;
    public final ArrayList ad;
    public int g;
    public Bundle h;
    public SparseArray i;
    public Bundle j;
    public Boolean k;
    public String l;
    public Bundle m;
    public br n;
    public String o;
    public int p;
    public Boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public cl z;
    
    static {
        f = new Object();
    }
    
    public br() {
        this.g = -1;
        this.l = UUID.randomUUID().toString();
        this.o = null;
        this.q = null;
        this.B = new cl();
        this.L = true;
        this.Q = true;
        this.W = auh.e;
        this.Z = new auy();
        this.ac = new AtomicInteger();
        this.ad = new ArrayList();
        this.Zd = (bq)new bk(this);
        this.nA();
    }
    
    public br(final int yz) {
        this();
        this.YZ = yz;
    }
    
    @Deprecated
    public static br aC(final Context context, final String s) {
        try {
            return by.a(context.getClassLoader(), s).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final InvocationTargetException ex) {
            final StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": calling Fragment constructor caused an exception");
            throw new bp(sb.toString(), (Exception)ex);
        }
        catch (final NoSuchMethodException ex2) {
            final StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": could not find Fragment constructor");
            throw new bp(sb2.toString(), (Exception)ex2);
        }
        catch (final IllegalAccessException ex3) {
            final StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(s);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new bp(sb3.toString(), (Exception)ex3);
        }
        catch (final InstantiationException ex4) {
            final StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(s);
            sb4.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new bp(sb4.toString(), (Exception)ex4);
        }
    }
    
    private final int lm() {
        if (this.W != auh.b && this.C != null) {
            return Math.min(this.W.ordinal(), this.C.lm());
        }
        return this.W.ordinal();
    }
    
    private final void nA() {
        this.X = new auo((aun)this);
        this.ab = cgj.a((cgk)this);
        this.aa = null;
        if (!this.ad.contains(this.Zd)) {
            this.nB(this.Zd);
        }
    }
    
    private final void nB(final bq bq) {
        if (this.g >= 0) {
            bq.a();
            return;
        }
        this.ad.add(bq);
    }
    
    private final br nz(final boolean b) {
        if (b) {
            ath.c(this);
        }
        final br n = this.n;
        if (n != null) {
            return n;
        }
        final cl z = this.z;
        if (z != null) {
            final String o = this.o;
            if (o != null) {
                return z.d(o);
            }
        }
        return null;
    }
    
    public final cl G() {
        final cl z = this.z;
        if (z != null) {
            return z;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final LayoutInflater H() {
        LayoutInflater layoutInflater;
        if ((layoutInflater = this.T) == null) {
            layoutInflater = this.mH(null);
        }
        return layoutInflater;
    }
    
    public View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final int yz = this.YZ;
        if (yz != 0) {
            return layoutInflater.inflate(yz, viewGroup, false);
        }
        return null;
    }
    
    public final rf M(final rl rl, final sc sc, final rd rd) {
        if (this.g <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            this.nB((bq)new bn(this, sc, atomicReference, rl, rd));
            return new bj(atomicReference);
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Object O() {
        final bz a = this.A;
        if (a == null) {
            return null;
        }
        return ((bt)a).a;
    }
    
    public final String P(final int n) {
        return this.nZ().getString(n);
    }
    
    public final String Q(final int n, final Object... array) {
        return this.nZ().getString(n, array);
    }
    
    public void R(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.D));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mTag=");
        printWriter.println(this.F);
        printWriter.print(s);
        printWriter.print("mState=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.y);
        printWriter.print(s);
        printWriter.print("mAdded=");
        printWriter.print(this.r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.u);
        printWriter.print(" mInLayout=");
        printWriter.println(this.v);
        printWriter.print(s);
        printWriter.print("mHidden=");
        printWriter.print(this.G);
        printWriter.print(" mDetached=");
        printWriter.print(this.H);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.L);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.K);
        printWriter.print(s);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.I);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Q);
        if (this.z != null) {
            printWriter.print(s);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.z);
        }
        if (this.A != null) {
            printWriter.print(s);
            printWriter.print("mHost=");
            printWriter.println(this.A);
        }
        if (this.C != null) {
            printWriter.print(s);
            printWriter.print("mParentFragment=");
            printWriter.println(this.C);
        }
        if (this.m != null) {
            printWriter.print(s);
            printWriter.print("mArguments=");
            printWriter.println(this.m);
        }
        if (this.h != null) {
            printWriter.print(s);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(s);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(s);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.j);
        }
        final br nz = this.nz(false);
        if (nz != null) {
            printWriter.print(s);
            printWriter.print("mTarget=");
            printWriter.print(nz);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.p);
        }
        printWriter.print(s);
        printWriter.print("mPopDirection=");
        printWriter.println(this.aq());
        if (this.nk() != 0) {
            printWriter.print(s);
            printWriter.print("getEnterAnim=");
            printWriter.println(this.nk());
        }
        if (this.nW() != 0) {
            printWriter.print(s);
            printWriter.print("getExitAnim=");
            printWriter.println(this.nW());
        }
        if (this.nX() != 0) {
            printWriter.print(s);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(this.nX());
        }
        if (this.nM() != 0) {
            printWriter.print(s);
            printWriter.print("getPopExitAnim=");
            printWriter.println(this.nM());
        }
        if (this.N != null) {
            printWriter.print(s);
            printWriter.print("mContainer=");
            printWriter.println(this.N);
        }
        if (this.O != null) {
            printWriter.print(s);
            printWriter.print("mView=");
            printWriter.println(this.O);
        }
        if (this.nT() != null) {
            awc.a((aun)this).c(s, printWriter);
        }
        printWriter.print(s);
        final StringBuilder sb = new StringBuilder("Child ");
        sb.append(this.B);
        sb.append(":");
        printWriter.println(sb.toString());
        this.B.D(s.concat("  "), fileDescriptor, printWriter, array);
    }
    
    public final void S() {
        this.nA();
        this.V = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.y = 0;
        this.z = null;
        this.B = new cl();
        this.A = null;
        this.D = 0;
        this.E = 0;
        this.F = null;
        this.G = false;
        this.H = false;
    }
    
    @Deprecated
    public void T(final Bundle bundle) {
        this.M = true;
    }
    
    @Deprecated
    public void U(final int n, final int n2, final Intent intent) {
        if (cl.W(2)) {
            final StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(n);
            sb.append(" resultCode: ");
            sb.append(n2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }
    
    @Deprecated
    public void V(final Activity activity) {
        this.M = true;
    }
    
    public void W() {
        this.M = true;
    }
    
    public void X(final boolean b) {
    }
    
    public void Y() {
        this.M = true;
    }
    
    @Deprecated
    public void Z(final int n, final String[] array, final int[] array2) {
    }
    
    @Deprecated
    public final LayoutInflater aA() {
        final bz a = this.A;
        if (a != null) {
            final bt bt = (bt)a;
            final LayoutInflater cloneInContext = bt.a.getLayoutInflater().cloneInContext((Context)bt.a);
            cloneInContext.setFactory2((LayoutInflater$Factory2)this.B.c);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }
    
    public final void aB() {
    }
    
    public final void aD() {
        this.M = true;
        final bz a = this.A;
        Activity b;
        if (a == null) {
            b = null;
        }
        else {
            b = a.b;
        }
        if (b != null) {
            this.M = true;
        }
    }
    
    @Deprecated
    public void aE(final MenuItem menuItem) {
    }
    
    public void aF() {
    }
    
    @Deprecated
    public final void aG(final br n) {
        if (n != null) {
            ath.g(this, n);
        }
        final cl z = this.z;
        cl z2;
        if (n != null) {
            z2 = n.z;
        }
        else {
            z2 = null;
        }
        if (z != null && z2 != null && z != z2) {
            final StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(n);
            sb.append(" must share the same FragmentManager to be set as a target fragment");
            throw new IllegalArgumentException(sb.toString());
        }
        for (br nz = n; nz != null; nz = nz.nz(false)) {
            if (nz.equals(this)) {
                final StringBuilder sb2 = new StringBuilder("Setting ");
                sb2.append(n);
                sb2.append(" as the target of ");
                sb2.append(this);
                sb2.append(" would create a target cycle");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        Label_0207: {
            if (n == null) {
                this.o = null;
            }
            else {
                if (this.z == null || n.z == null) {
                    this.o = null;
                    this.n = n;
                    break Label_0207;
                }
                this.o = n.l;
            }
            this.n = null;
        }
        this.p = 0;
    }
    
    public final void aH(final Intent intent) {
        final bz a = this.A;
        if (a != null) {
            a.e(intent, -1, null);
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    public void aI(final int n, final int n2) {
    }
    
    public void aJ(final int n, final int n2) {
    }
    
    public void aa() {
        this.M = true;
    }
    
    public void ab(final View view, final Bundle bundle) {
    }
    
    public final void ac() {
        final Bundle h = this.h;
        Bundle bundle;
        if (h != null) {
            bundle = h.getBundle("savedInstanceState");
        }
        else {
            bundle = null;
        }
        this.ab(this.O, bundle);
        this.B.B(2);
    }
    
    @Deprecated
    public final void ad(final String[] array, final int n) {
        if (this.A != null) {
            final cl g = this.G();
            if (g.r != null) {
                g.s.addLast(new FragmentManager$LaunchedFragmentInfo(this.l, n));
                g.r.b((Object)array);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void ae() {
        final Bundle h = this.h;
        if (h != null) {
            final Bundle bundle = h.getBundle("childFragmentManager");
            if (bundle != null) {
                this.B.L((Parcelable)bundle);
                this.B.q();
            }
        }
    }
    
    public final void af(int n, final int n2, final int n3, final int e) {
        int b = n;
        int c = n2;
        int d = n3;
        if (this.R == null) {
            b = n;
            c = n2;
            d = n3;
            if (n == 0) {
                n = (b = 0);
                c = n2;
                d = n3;
                if (n2 == 0) {
                    if (n3 == 0) {
                        if (e == 0) {
                            return;
                        }
                        c = 0;
                        d = 0;
                        b = n;
                    }
                    else {
                        c = 0;
                        d = n3;
                        b = n;
                    }
                }
            }
        }
        this.ob().b = b;
        this.ob().c = c;
        this.ob().d = d;
        this.ob().e = e;
    }
    
    public final void ag(final Bundle m) {
        if (this.z != null && this.av()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.m = m;
    }
    
    public final void ah(final View m) {
        this.ob().m = m;
    }
    
    public final void ai(final Fragment$SavedState fragment$SavedState) {
        if (this.z == null) {
            Bundle a;
            final Bundle bundle = a = null;
            if (fragment$SavedState != null) {
                a = fragment$SavedState.a;
                if (a == null) {
                    a = bundle;
                }
            }
            this.h = a;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }
    
    public final void aj(final boolean l) {
        if (this.L != l) {
            this.L = l;
            if (this.K && this.ar() && !this.as()) {
                this.A.c();
            }
        }
    }
    
    final void ak(final int f) {
        if (this.R == null && f == 0) {
            return;
        }
        this.ob();
        this.R.f = f;
    }
    
    final void al(final boolean a) {
        if (this.R == null) {
            return;
        }
        this.ob().a = a;
    }
    
    @Deprecated
    public final void am(final boolean i) {
        ath.d(this);
        this.I = i;
        final cl z = this.z;
        if (z == null) {
            this.J = true;
            return;
        }
        if (i) {
            z.x.a(this);
            return;
        }
        z.x.e(this);
    }
    
    final void an(final ArrayList g, final ArrayList h) {
        this.ob();
        final bo r = this.R;
        r.g = g;
        r.h = h;
    }
    
    @Deprecated
    public final void ao(final boolean q) {
        ath.e(this, q);
        if (!this.Q && q && this.g < 5) {
            final cl z = this.z;
            if (z != null && this.ar() && this.U) {
                z.al(z.ak(this));
            }
        }
        this.Q = q;
        final int g = this.g;
        boolean p = false;
        if (g < 5) {
            p = p;
            if (!q) {
                p = true;
            }
        }
        this.P = p;
        if (this.h != null) {
            this.k = q;
        }
    }
    
    @Deprecated
    public final void ap(final Intent intent, final int n, final Bundle bundle) {
        if (this.A == null) {
            final StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" not attached to Activity");
            throw new IllegalStateException(sb.toString());
        }
        final cl g = this.G();
        if (g.p != null) {
            g.s.addLast(new FragmentManager$LaunchedFragmentInfo(this.l, n));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            g.p.b((Object)intent);
            return;
        }
        g.l.e(intent, n, bundle);
    }
    
    final boolean aq() {
        final bo r = this.R;
        return r != null && r.a;
    }
    
    public final boolean ar() {
        return this.A != null && this.r;
    }
    
    public final boolean as() {
        final boolean g = this.G;
        boolean b = true;
        if (!g) {
            if (this.z != null) {
                final br c = this.C;
                if (c != null) {
                    if (c.as()) {
                        b = b;
                        return b;
                    }
                }
                return false;
            }
            b = false;
        }
        return b;
    }
    
    public final boolean at() {
        return this.y > 0;
    }
    
    public final boolean au() {
        return this.g >= 7;
    }
    
    public final boolean av() {
        final cl z = this.z;
        return z != null && z.Z();
    }
    
    public final boolean aw() {
        if (this.ar() && !this.as()) {
            final View o = this.O;
            if (o != null && o.getWindowToken() != null && this.O.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ax(final String s) {
        final bz a = this.A;
        return a != null && td.g((Activity)((bt)a).a, s);
    }
    
    public final void ay() {
    }
    
    public final void az() {
    }
    
    public final avy getDefaultViewModelCreationExtras() {
        while (true) {
            for (Context context = this.nY().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                if (context instanceof Application) {
                    final Application application = (Application)context;
                    if (application == null && cl.W(3)) {
                        new StringBuilder("Could not find Application instance from Context ").append(this.nY().getApplicationContext());
                    }
                    final awa awa = new awa();
                    if (application != null) {
                        awa.b(avq.b, (Object)application);
                    }
                    awa.b(avk.a, (Object)this);
                    awa.b(avk.b, (Object)this);
                    final Bundle m = this.m;
                    if (m != null) {
                        awa.b(avk.c, (Object)m);
                    }
                    return (avy)awa;
                }
            }
            final Application application = null;
            continue;
        }
    }
    
    public avr getDefaultViewModelProviderFactory() {
        if (this.z != null) {
            if (this.aa == null) {
                while (true) {
                    for (Context context = this.nY().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                        if (context instanceof Application) {
                            final Application application = (Application)context;
                            if (application == null && cl.W(3)) {
                                new StringBuilder("Could not find Application instance from Context ").append(this.nY().getApplicationContext());
                            }
                            this.aa = (avr)new avn(application, (cgk)this, this.m);
                            return this.aa;
                        }
                    }
                    final Application application = null;
                    continue;
                }
            }
            return this.aa;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }
    
    public aui getLifecycle() {
        return (aui)this.X;
    }
    
    public final cgi getSavedStateRegistry() {
        return (cgi)this.ab.c;
    }
    
    public final avu getViewModelStore() {
        if (this.z == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.lm() != auh.b.ordinal()) {
            final cm x = this.z.x;
            avu avu;
            if ((avu = x.d.get(this.l)) == null) {
                avu = new avu();
                x.d.put(this.l, avu);
            }
            return avu;
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    
    public void lP(final Context context) {
        this.M = true;
        final bz a = this.A;
        Activity b;
        if (a == null) {
            b = null;
        }
        else {
            b = a.b;
        }
        if (b != null) {
            this.M = false;
            this.V(b);
        }
    }
    
    public final LayoutInflater mH(final Bundle bundle) {
        return this.T = this.nj(bundle);
    }
    
    public final View mI() {
        return this.O;
    }
    
    public final View mJ() {
        final View o = this.O;
        if (o != null) {
            return o;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }
    
    public final aun mK() {
        final cv y = this.Y;
        if (y != null) {
            return (aun)y;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }
    
    public final int nM() {
        final bo r = this.R;
        if (r == null) {
            return 0;
        }
        return r.e;
    }
    
    public Context nT() {
        final bz a = this.A;
        if (a == null) {
            return null;
        }
        return a.c;
    }
    
    public final int nW() {
        final bo r = this.R;
        if (r == null) {
            return 0;
        }
        return r.c;
    }
    
    public final int nX() {
        final bo r = this.R;
        if (r == null) {
            return 0;
        }
        return r.d;
    }
    
    public final Context nY() {
        final Context nt = this.nT();
        if (nt != null) {
            return nt;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Resources nZ() {
        return this.nY().getResources();
    }
    
    public LayoutInflater nj(final Bundle bundle) {
        return this.aA();
    }
    
    public final int nk() {
        final bo r = this.R;
        if (r == null) {
            return 0;
        }
        return r.b;
    }
    
    public bw nl() {
        return (bw)new bl(this);
    }
    
    public void nm() {
        this.M = true;
    }
    
    public void nn() {
        this.M = true;
    }
    
    public void no() {
        this.M = true;
    }
    
    public void np() {
        this.M = true;
    }
    
    public void nq(final Bundle bundle) {
        this.M = true;
    }
    
    public void nr(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.B.noteStateNotSaved();
        this.x = true;
        this.Y = new cv(this, this.getViewModelStore());
        final View k = this.K(layoutInflater, viewGroup, bundle);
        this.O = k;
        if (k != null) {
            this.Y.b();
            di.f(this.O, (aun)this.Y);
            di.e(this.O, (avv)this.Y);
            cax.c(this.O, (cgk)this.Y);
            this.Z.m((Object)this.Y);
            return;
        }
        if (this.Y.a == null) {
            this.Y = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }
    
    public final Bundle oa() {
        final Bundle m = this.m;
        if (m != null) {
            return m;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final bo ob() {
        if (this.R == null) {
            this.R = new bo();
        }
        return this.R;
    }
    
    @Deprecated
    public final br oc() {
        return this.nz(true);
    }
    
    public final bu od() {
        final bz a = this.A;
        if (a == null) {
            return null;
        }
        return (bu)a.b;
    }
    
    public final bu oe() {
        final bu od = this.od();
        if (od != null) {
            return od;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final cl og() {
        if (this.A != null) {
            return this.B;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.M = true;
    }
    
    public final void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.oe().onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public final void onLowMemory() {
        this.M = true;
    }
    
    public void oq(final Bundle bundle) {
        this.M = true;
        this.ae();
        final cl b = this.B;
        if (b.k > 0) {
            return;
        }
        b.q();
    }
    
    public void pP(final Bundle bundle) {
    }
    
    public final rf registerForActivityResult(final rl rl, final rd rd) {
        return this.M(rl, (sc)new bm(this, 1), rd);
    }
    
    @Deprecated
    public final void startActivityForResult(final Intent intent, final int n) {
        this.ap(intent, n, null);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        if (this.F != null) {
            sb.append(" tag=");
            sb.append(this.F);
        }
        sb.append(")");
        return sb.toString();
    }
}
