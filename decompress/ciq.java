import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import java.util.Map;
import android.animation.Animator;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.ListView;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ciq implements Cloneable
{
    private static final int[] p;
    private static final ThreadLocal q;
    private static final chw x;
    public long a;
    public long b;
    public TimeInterpolator c;
    final ArrayList d;
    final ArrayList e;
    cix f;
    public final int[] g;
    public ArrayList h;
    public ArrayList i;
    final ArrayList j;
    public ArrayList k;
    public ciy l;
    public chw m;
    public dev n;
    public dev o;
    private final String r;
    private ArrayList s;
    private int t;
    private boolean u;
    private boolean v;
    private ArrayList w;
    
    static {
        p = new int[] { 2, 1, 3, 4 };
        x = new chw();
        q = new ThreadLocal();
    }
    
    public ciq() {
        this.r = this.getClass().getName();
        this.a = -1L;
        this.b = -1L;
        this.c = null;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.s = null;
        this.n = new dev();
        this.o = new dev();
        this.f = null;
        this.g = ciq.p;
        this.j = new ArrayList();
        this.t = 0;
        this.u = false;
        this.v = false;
        this.k = null;
        this.w = new ArrayList();
        this.m = ciq.x;
    }
    
    private static void I(final dev dev, View view, final cjc cjc) {
        ((abp)dev.d).put((Object)view, (Object)cjc);
        final int id = view.getId();
        if (id >= 0) {
            if (((SparseArray)dev.c).indexOfKey(id) >= 0) {
                ((SparseArray)dev.c).put(id, (Object)null);
            }
            else {
                ((SparseArray)dev.c).put(id, (Object)view);
            }
        }
        final String z = anc.z(view);
        if (z != null) {
            if (((abp)dev.b).containsKey((Object)z)) {
                ((abp)dev.b).put((Object)z, (Object)null);
            }
            else {
                ((abp)dev.b).put((Object)z, (Object)view);
            }
        }
        if (view.getParent() instanceof ListView) {
            final ListView listView = (ListView)view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                final long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (((abm)dev.a).a(itemIdAtPosition) >= 0) {
                    view = (View)((abm)dev.a).e(itemIdAtPosition);
                    if (view != null) {
                        anc.W(view, false);
                        ((abm)dev.a).i(itemIdAtPosition, null);
                    }
                }
                else {
                    anc.W(view, true);
                    ((abm)dev.a).i(itemIdAtPosition, view);
                }
            }
        }
    }
    
    private final void e(final View view, final boolean b) {
        if (view == null) {
            return;
        }
        final int id = view.getId();
        final ArrayList s = this.s;
        if (s != null && s.contains(id)) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            final cjc cjc = new cjc(view);
            if (b) {
                this.c(cjc);
            }
            else {
                this.b(cjc);
            }
            cjc.c.add(this);
            this.l(cjc);
            if (b) {
                I(this.n, view, cjc);
            }
            else {
                I(this.o, view, cjc);
            }
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                this.e(viewGroup.getChildAt(i), b);
            }
        }
    }
    
    private static boolean f(final cjc cjc, final cjc cjc2, final String s) {
        final Object value = cjc.a.get(s);
        final Object value2 = cjc2.a.get(s);
        boolean b;
        if (value == null && value2 == null) {
            b = false;
        }
        else {
            if (value != null && value2 != null) {
                return value.equals(value2) ^ true;
            }
            b = true;
        }
        return b;
    }
    
    public static abi g() {
        final ThreadLocal q = ciq.q;
        abi abi;
        if ((abi = q.get()) == null) {
            abi = new abi();
            q.set(abi);
        }
        return abi;
    }
    
    public final void A(final cip cip) {
        final ArrayList k = this.k;
        if (k == null) {
            return;
        }
        k.remove(cip);
        if (this.k.size() == 0) {
            this.k = null;
        }
    }
    
    public void B(final long b) {
        this.b = b;
    }
    
    public void C(final TimeInterpolator c) {
        this.c = c;
    }
    
    public void D(final long a) {
        this.a = a;
    }
    
    public void E() {
    }
    
    public void F(final ciy ciy) {
        this.l = null;
    }
    
    public void G(final chw m) {
        if (m == null) {
            this.m = ciq.x;
            return;
        }
        this.m = m;
    }
    
    public void H(final ViewGroup viewGroup, final dev dev, final dev dev2, final ArrayList list, final ArrayList list2) {
        final abi g = g();
        final SparseIntArray sparseIntArray = new SparseIntArray();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final cjc cjc = list.get(i);
            final cjc cjc2 = list2.get(i);
            cjc cjc3;
            if ((cjc3 = cjc) != null) {
                cjc3 = cjc;
                if (!cjc.c.contains(this)) {
                    cjc3 = null;
                }
            }
            cjc cjc4;
            if ((cjc4 = cjc2) != null) {
                cjc4 = cjc2;
                if (!cjc2.c.contains(this)) {
                    cjc4 = null;
                }
            }
            if ((cjc3 != null || cjc4 != null) && (cjc3 == null || cjc4 == null || this.u(cjc3, cjc4))) {
                Animator a = this.a(viewGroup, cjc3, cjc4);
                if (a != null) {
                    View view2;
                    cjc cjc8;
                    Animator animator3;
                    if (cjc4 != null) {
                        final View b = cjc4.b;
                        final String[] d = this.d();
                        cjc cjc7 = null;
                        Label_0394: {
                            if (d != null) {
                                final cjc cjc5 = new cjc(b);
                                final cjc cjc6 = (cjc)((abp)dev2.d).get((Object)b);
                                Animator animator = a;
                                if (cjc6 != null) {
                                    int n = 0;
                                    while (true) {
                                        animator = a;
                                        if (n >= d.length) {
                                            break;
                                        }
                                        final Map a2 = cjc5.a;
                                        final String s = d[n];
                                        a2.put(s, cjc6.a.get(s));
                                        ++n;
                                    }
                                }
                                a = animator;
                                for (int d2 = ((abp)g).d, j = 0; j < d2; ++j) {
                                    final blx blx = (blx)((abp)g).get((Object)((abp)g).c(j));
                                    if (blx.d != null && blx.e == b && ((String)blx.a).equals(this.r) && ((cjc)blx.d).equals(cjc5)) {
                                        cjc7 = cjc5;
                                        a = null;
                                        break Label_0394;
                                    }
                                }
                                cjc7 = cjc5;
                            }
                            else {
                                cjc7 = null;
                            }
                        }
                        final View view = b;
                        final Animator animator2 = a;
                        view2 = view;
                        cjc8 = cjc7;
                        animator3 = animator2;
                    }
                    else {
                        final View b2 = cjc3.b;
                        cjc8 = null;
                        animator3 = a;
                        view2 = b2;
                    }
                    if (animator3 != null) {
                        ((abp)g).put((Object)animator3, (Object)new blx(view2, this.r, this, cjh.e((View)viewGroup), cjc8));
                        this.w.add(animator3);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int k = 0; k < sparseIntArray.size(); ++k) {
                final Animator animator4 = this.w.get(sparseIntArray.keyAt(k));
                animator4.setStartDelay(sparseIntArray.valueAt(k) - Long.MAX_VALUE + animator4.getStartDelay());
            }
        }
    }
    
    public Animator a(final ViewGroup viewGroup, final cjc cjc, final cjc cjc2) {
        return null;
    }
    
    public abstract void b(final cjc p0);
    
    public abstract void c(final cjc p0);
    
    public /* bridge */ Object clone() {
        return this.h();
    }
    
    public String[] d() {
        return null;
    }
    
    public ciq h() {
        try {
            final ciq ciq = (ciq)super.clone();
            ciq.w = new ArrayList();
            ciq.n = new dev();
            ciq.o = new dev();
            ciq.h = null;
            ciq.i = null;
            return ciq;
        }
        catch (final CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    final cjc i(final View view, final boolean b) {
        final cix f = this.f;
        if (f != null) {
            return f.i(view, b);
        }
        ArrayList list;
        if (b) {
            list = this.h;
        }
        else {
            list = this.i;
        }
        final cjc cjc = null;
        if (list == null) {
            return null;
        }
        while (true) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final cjc cjc2 = list.get(i);
                if (cjc2 == null) {
                    return null;
                }
                if (cjc2.b == view) {
                    cjc cjc3 = cjc;
                    if (i >= 0) {
                        ArrayList list2;
                        if (b) {
                            list2 = this.i;
                        }
                        else {
                            list2 = this.h;
                        }
                        cjc3 = (cjc)list2.get(i);
                    }
                    return cjc3;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public final cjc j(final View view, final boolean b) {
        final cix f = this.f;
        if (f != null) {
            return f.j(view, b);
        }
        dev dev;
        if (b) {
            dev = this.n;
        }
        else {
            dev = this.o;
        }
        return (cjc)((abp)dev.d).get((Object)view);
    }
    
    public String k(String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(this.getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(": ");
        final String s2 = s = sb.toString();
        if (this.b != -1L) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append("dur(");
            sb2.append(this.b);
            sb2.append(") ");
            s = sb2.toString();
        }
        String string = s;
        if (this.a != -1L) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s);
            sb3.append("dly(");
            sb3.append(this.a);
            sb3.append(") ");
            string = sb3.toString();
        }
        s = string;
        if (this.c != null) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(string);
            sb4.append("interp(");
            sb4.append(this.c);
            sb4.append(") ");
            s = sb4.toString();
        }
        if (this.d.size() <= 0) {
            final String concat = s;
            if (this.e.size() <= 0) {
                return concat;
            }
        }
        final int size = this.d.size();
        String s3 = s.concat("tgts(");
        final int n = 0;
        s = s3;
        if (size > 0) {
            int n2 = 0;
            while (true) {
                s = s3;
                if (n2 >= this.d.size()) {
                    break;
                }
                s = s3;
                if (n2 > 0) {
                    s = s3.concat(", ");
                }
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(s);
                final Object value = this.d.get(n2);
                sb5.append(value);
                s3 = s.concat(String.valueOf(value));
                ++n2;
            }
        }
        String s4 = s;
        if (this.e.size() > 0) {
            int n3 = n;
            while (true) {
                s4 = s;
                if (n3 >= this.e.size()) {
                    break;
                }
                String concat2 = s;
                if (n3 > 0) {
                    concat2 = s.concat(", ");
                }
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(concat2);
                final Object value2 = this.e.get(n3);
                sb6.append(value2);
                s = concat2.concat(String.valueOf(value2));
                ++n3;
            }
        }
        return s4.concat(")");
    }
    
    public void l(final cjc cjc) {
    }
    
    final void m(final ViewGroup viewGroup, final boolean b) {
        this.n(b);
        final int size = this.d.size();
        final int n = 0;
        if (size <= 0 && this.e.size() <= 0) {
            this.e((View)viewGroup, b);
            return;
        }
        int n2 = 0;
        int i;
        while (true) {
            i = n;
            if (n2 >= this.d.size()) {
                break;
            }
            final View viewById = viewGroup.findViewById((int)this.d.get(n2));
            if (viewById != null) {
                final cjc cjc = new cjc(viewById);
                if (b) {
                    this.c(cjc);
                }
                else {
                    this.b(cjc);
                }
                cjc.c.add(this);
                this.l(cjc);
                if (b) {
                    I(this.n, viewById, cjc);
                }
                else {
                    I(this.o, viewById, cjc);
                }
            }
            ++n2;
        }
        while (i < this.e.size()) {
            final View view = this.e.get(i);
            final cjc cjc2 = new cjc(view);
            if (b) {
                this.c(cjc2);
            }
            else {
                this.b(cjc2);
            }
            cjc2.c.add(this);
            this.l(cjc2);
            if (b) {
                I(this.n, view, cjc2);
            }
            else {
                I(this.o, view, cjc2);
            }
            ++i;
        }
    }
    
    final void n(final boolean b) {
        if (b) {
            ((abp)this.n.d).clear();
            ((SparseArray)this.n.c).clear();
            ((abm)this.n.a).h();
            return;
        }
        ((abp)this.o.d).clear();
        ((SparseArray)this.o.c).clear();
        ((abm)this.o.a).h();
    }
    
    protected final void o() {
        final int t = this.t - 1;
        this.t = t;
        if (t == 0) {
            final ArrayList k = this.k;
            if (k != null && k.size() > 0) {
                final ArrayList list = (ArrayList)this.k.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((cip)list.get(i)).a(this);
                }
            }
            for (int j = 0; j < ((abm)this.n.a).c(); ++j) {
                final View view = (View)((abm)this.n.a).g(j);
                if (view != null) {
                    anc.W(view, false);
                }
            }
            for (int l = 0; l < ((abm)this.o.a).c(); ++l) {
                final View view2 = (View)((abm)this.o.a).g(l);
                if (view2 != null) {
                    anc.W(view2, false);
                }
            }
            this.v = true;
        }
    }
    
    public void p(final ViewGroup viewGroup) {
        final abi g = g();
        int d = ((abp)g).d;
        if (viewGroup != null) {
            if (d != 0) {
                final cjv e = cjh.e((View)viewGroup);
                final abi abi = new abi((abp)g);
                ((abp)g).clear();
                while (true) {
                    final int n = d - 1;
                    if (n < 0) {
                        break;
                    }
                    final blx blx = (blx)((abp)abi).f(n);
                    d = n;
                    if (blx.e == null) {
                        continue;
                    }
                    d = n;
                    if (!e.equals(blx.c)) {
                        continue;
                    }
                    ((Animator)((abp)abi).c(n)).end();
                    d = n;
                }
            }
        }
    }
    
    public void q(final View view) {
        if (!this.v) {
            int size = this.j.size();
            while (--size >= 0) {
                chx.b((Animator)this.j.get(size));
            }
            final ArrayList k = this.k;
            if (k != null && k.size() > 0) {
                final ArrayList list = (ArrayList)this.k.clone();
                for (int size2 = list.size(), i = 0; i < size2; ++i) {
                    ((cip)list.get(i)).c();
                }
            }
            this.u = true;
        }
    }
    
    public void r(final View view) {
        if (this.u) {
            if (!this.v) {
                int size = this.j.size();
                while (--size >= 0) {
                    chx.c((Animator)this.j.get(size));
                }
                final ArrayList k = this.k;
                if (k != null && k.size() > 0) {
                    final ArrayList list = (ArrayList)this.k.clone();
                    for (int size2 = list.size(), i = 0; i < size2; ++i) {
                        ((cip)list.get(i)).d();
                    }
                }
            }
            this.u = false;
        }
    }
    
    protected void s() {
        this.t();
        final abi g = g();
        final ArrayList w = this.w;
        for (int size = w.size(), i = 0; i < size; ++i) {
            final Animator animator = (Animator)w.get(i);
            if (((abp)g).containsKey((Object)animator)) {
                this.t();
                if (animator != null) {
                    animator.addListener((Animator$AnimatorListener)new cin(this, g));
                    final long b = this.b;
                    if (b >= 0L) {
                        animator.setDuration(b);
                    }
                    final long a = this.a;
                    if (a >= 0L) {
                        animator.setStartDelay(a + animator.getStartDelay());
                    }
                    final TimeInterpolator c = this.c;
                    if (c != null) {
                        animator.setInterpolator(c);
                    }
                    animator.addListener((Animator$AnimatorListener)new cio(this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        this.o();
    }
    
    protected final void t() {
        if (this.t == 0) {
            final ArrayList k = this.k;
            if (k != null && k.size() > 0) {
                final ArrayList list = (ArrayList)this.k.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((cip)list.get(i)).e();
                }
            }
            this.v = false;
        }
        ++this.t;
    }
    
    @Override
    public final String toString() {
        return this.k("");
    }
    
    public boolean u(final cjc cjc, final cjc cjc2) {
        boolean b2;
        final boolean b = b2 = false;
        if (cjc != null) {
            b2 = b;
            if (cjc2 != null) {
                final String[] d = this.d();
                if (d != null) {
                    int n = 0;
                    while (true) {
                        b2 = b;
                        if (n >= d.length) {
                            return b2;
                        }
                        if (f(cjc, cjc2, d[n])) {
                            break;
                        }
                        ++n;
                    }
                }
                else {
                    final Iterator iterator = cjc.a.keySet().iterator();
                    do {
                        b2 = b;
                        if (iterator.hasNext()) {
                            continue;
                        }
                        return b2;
                    } while (!f(cjc, cjc2, (String)iterator.next()));
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    final boolean v(final View view) {
        final int id = view.getId();
        final ArrayList s = this.s;
        return (s == null || !s.contains(id)) && ((this.d.size() == 0 && this.e.size() == 0) || this.d.contains(id) || this.e.contains(view));
    }
    
    public final void w(final cip cip) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(cip);
    }
    
    public void x(final int n) {
        this.d.add(n);
    }
    
    public void y(final View view) {
        this.e.add(view);
    }
    
    public final void z() {
        final ArrayList s = this.s;
        final Integer value = 2131427923;
        ArrayList s2 = s;
        if (s == null) {
            s2 = new ArrayList();
        }
        if (!s2.contains(value)) {
            s2.add(value);
        }
        this.s = s2;
    }
}
