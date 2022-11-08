import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import android.view.KeyEvent;
import android.view.Gravity;
import android.os.Parcelable;
import java.util.Iterator;
import java.lang.reflect.Method;
import android.widget.ListView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.graphics.Rect;
import android.transition.Transition;
import android.os.Build$VERSION;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.view.LayoutInflater;
import android.content.res.Resources;
import java.util.ArrayList;
import android.view.View$OnAttachStateChangeListener;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.List;
import android.os.Handler;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ig extends iv implements View$OnKeyListener, PopupWindow$OnDismissListener, iz
{
    public final Handler a;
    public final List b;
    final ViewTreeObserver$OnGlobalLayoutListener c;
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private final List l;
    private final View$OnAttachStateChangeListener m;
    private final nc n;
    private int o;
    private int p;
    private View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private iy y;
    private PopupWindow$OnDismissListener z;
    
    public ig(final Context h, final View q, final int j, final boolean k) {
        this.l = new ArrayList();
        this.b = new ArrayList();
        this.c = (ViewTreeObserver$OnGlobalLayoutListener)new je(this, 1);
        this.m = (View$OnAttachStateChangeListener)new ie(this, 0);
        this.n = (nc)new if(this);
        this.o = 0;
        this.p = 0;
        this.h = h;
        this.q = q;
        this.j = j;
        this.k = k;
        this.w = false;
        this.r = this.B();
        final Resources resources = h.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165208));
        this.a = new Handler();
    }
    
    private final int B() {
        if (ana.f(this.q) == 1) {
            return 0;
        }
        return 1;
    }
    
    private final void C(final im im) {
        final LayoutInflater from = LayoutInflater.from(this.h);
        final ij ij = new ij(im, from, this.k, 2131623947);
        if (!this.x() && this.w) {
            ij.b = true;
        }
        else if (this.x()) {
            ij.b = iv.z(im);
        }
        int n = A((ListAdapter)ij, this.h, this.i);
        final nh nh = new nh(this.h, this.j);
        nh.b = this.n;
        ((nb)nh).t((PopupWindow$OnDismissListener)(((nb)nh).m = (AdapterView$OnItemClickListener)this));
        ((nb)nh).l = this.q;
        ((nb)nh).j = this.p;
        ((nb)nh).z();
        ((nb)nh).y();
        ((nb)nh).e((ListAdapter)ij);
        ((nb)nh).r(n);
        ((nb)nh).j = this.p;
        trg trg2 = null;
        View l = null;
        Label_0440: {
            Label_0437: {
                if (this.b.size() > 0) {
                    final List b = this.b;
                    final trg trg = b.get(b.size() - 1);
                    final im im2 = (im)trg.c;
                    while (true) {
                        for (int size = im2.size(), i = 0; i < size; ++i) {
                            final Object item = im2.getItem(i);
                            if (((MenuItem)item).hasSubMenu() && im == ((MenuItem)item).getSubMenu()) {
                                Label_0268: {
                                    if (item != null) {
                                        final ListView v = trg.v();
                                        final ListAdapter adapter = v.getAdapter();
                                        int headersCount;
                                        ij ij2;
                                        if (adapter instanceof HeaderViewListAdapter) {
                                            final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
                                            headersCount = headerViewListAdapter.getHeadersCount();
                                            ij2 = (ij)headerViewListAdapter.getWrappedAdapter();
                                        }
                                        else {
                                            ij2 = (ij)adapter;
                                            headersCount = 0;
                                        }
                                        final int count = ij2.getCount();
                                        int j = 0;
                                        while (true) {
                                            while (j < count) {
                                                if (item == ij2.a(j)) {
                                                    if (j == -1) {
                                                        break Label_0268;
                                                    }
                                                    final int n2 = j + headersCount - v.getFirstVisiblePosition();
                                                    trg2 = trg;
                                                    if (n2 < 0) {
                                                        break Label_0437;
                                                    }
                                                    if (n2 >= v.getChildCount()) {
                                                        break Label_0268;
                                                    }
                                                    final View child = v.getChildAt(n2);
                                                    trg2 = trg;
                                                    l = child;
                                                    break Label_0440;
                                                }
                                                else {
                                                    ++j;
                                                }
                                            }
                                            j = -1;
                                            continue;
                                        }
                                    }
                                }
                                trg2 = trg;
                                break Label_0437;
                            }
                        }
                        final Object item = null;
                        continue;
                    }
                }
                trg2 = null;
            }
            l = null;
        }
        if (l != null) {
            if (Build$VERSION.SDK_INT <= 28) {
                final Method a = nh.a;
                if (a != null) {
                    try {
                        a.invoke(nh.q, false);
                    }
                    catch (final Exception ex) {}
                }
            }
            else {
                ne.a(nh.q, false);
            }
            nd.a(nh.q, null);
            final List b2 = this.b;
            final ListView v2 = b2.get(b2.size() - 1).v();
            final int[] array = new int[2];
            v2.getLocationOnScreen(array);
            final Rect rect = new Rect();
            this.d.getWindowVisibleDisplayFrame(rect);
            int r = 0;
            Label_0622: {
                Label_0619: {
                    if (this.r == 1) {
                        if (array[0] + v2.getWidth() + n > rect.right) {
                            break Label_0619;
                        }
                    }
                    else if (array[0] - n >= 0) {
                        break Label_0619;
                    }
                    r = 1;
                    break Label_0622;
                }
                r = 0;
            }
            this.r = r;
            ((nb)nh).l = l;
            int width = 0;
            Label_0687: {
                if ((this.p & 0x5) == 0x5) {
                    if (r != 0) {
                        width = n;
                        break Label_0687;
                    }
                    n = l.getWidth();
                }
                else if (r != 0) {
                    width = l.getWidth();
                    break Label_0687;
                }
                width = -n;
            }
            ((nb)nh).g = width;
            ((nb)nh).i = true;
            ((nb)nh).h = true;
            ((nb)nh).j(0);
        }
        else {
            if (this.s) {
                ((nb)nh).g = this.u;
            }
            if (this.t) {
                ((nb)nh).j(this.v);
            }
            ((nb)nh).s(super.g);
        }
        this.b.add(new trg(nh, im, this.r));
        ((nb)nh).v();
        final mh e = ((nb)nh).e;
        ((ListView)e).setOnKeyListener((View$OnKeyListener)this);
        if (trg2 == null && this.x && im.e != null) {
            final FrameLayout frameLayout = (FrameLayout)from.inflate(2131623954, (ViewGroup)e, false);
            final TextView textView = (TextView)frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(im.e);
            ((ListView)e).addHeaderView((View)frameLayout, (Object)null, false);
            ((nb)nh).v();
        }
    }
    
    public final void d(final im im, final boolean b) {
        final int size = this.b.size();
        int i = 0;
        while (true) {
            while (i < size) {
                final int n = i;
                if (im != ((trg)this.b.get(i)).c) {
                    ++i;
                }
                else {
                    if (n < 0) {
                        return;
                    }
                    final int n2 = n + 1;
                    if (n2 < this.b.size()) {
                        ((im)((trg)this.b.get(n2)).c).i(false);
                    }
                    final trg trg = this.b.remove(n);
                    ((im)trg.c).m(this);
                    if (this.f) {
                        nd.b(((nh)trg.b).q, null);
                        ((nb)trg.b).q.setAnimationStyle(0);
                    }
                    ((nb)trg.b).m();
                    final int size2 = this.b.size();
                    if (size2 > 0) {
                        this.r = ((trg)this.b.get(size2 - 1)).a;
                    }
                    else {
                        this.r = this.B();
                    }
                    if (size2 == 0) {
                        this.m();
                        final iy y = this.y;
                        if (y != null) {
                            y.a(im, true);
                        }
                        final ViewTreeObserver e = this.e;
                        if (e != null) {
                            if (e.isAlive()) {
                                this.e.removeGlobalOnLayoutListener(this.c);
                            }
                            this.e = null;
                        }
                        this.d.removeOnAttachStateChangeListener(this.m);
                        this.z.onDismiss();
                        return;
                    }
                    if (b) {
                        ((im)this.b.get(0).c).i(false);
                    }
                    return;
                }
            }
            final int n = -1;
            continue;
        }
    }
    
    public final void e(final iy y) {
        this.y = y;
    }
    
    public final boolean f() {
        return false;
    }
    
    public final boolean g(final jg jg) {
        for (final trg trg : this.b) {
            if (jg == trg.c) {
                trg.v().requestFocus();
                return true;
            }
        }
        if (((im)jg).hasVisibleItems()) {
            this.l((im)jg);
            final iy y = this.y;
            if (y != null) {
                y.b((im)jg);
            }
            return true;
        }
        return false;
    }
    
    public final void j() {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            y(((trg)iterator.next()).v().getAdapter()).notifyDataSetChanged();
        }
    }
    
    public final Parcelable kC() {
        return null;
    }
    
    public final ListView kD() {
        if (this.b.isEmpty()) {
            return null;
        }
        final List b = this.b;
        return ((trg)b.get(b.size() - 1)).v();
    }
    
    public final void l(final im im) {
        im.h(this, this.h);
        if (this.x()) {
            this.C(im);
            return;
        }
        this.l.add(im);
    }
    
    public final void m() {
        int size = this.b.size();
        if (size > 0) {
            final trg[] array = this.b.toArray(new trg[size]);
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final trg trg = array[n];
                size = n;
                if (!((nb)trg.b).x()) {
                    continue;
                }
                ((nb)trg.b).m();
                size = n;
            }
        }
    }
    
    public final void n(final Parcelable parcelable) {
    }
    
    public final void o(final View q) {
        if (this.q != q) {
            this.q = q;
            this.p = Gravity.getAbsoluteGravity(this.o, ana.f(q));
        }
    }
    
    public final void onDismiss() {
        while (true) {
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                final trg trg = this.b.get(i);
                if (!((nb)trg.b).x()) {
                    if (trg != null) {
                        ((im)trg.c).i(false);
                    }
                    return;
                }
            }
            final trg trg = null;
            continue;
        }
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.m();
            return true;
        }
        return false;
    }
    
    public final void p(final boolean w) {
        this.w = w;
    }
    
    public final void q(final int o) {
        if (this.o != o) {
            this.o = o;
            this.p = Gravity.getAbsoluteGravity(o, ana.f(this.q));
        }
    }
    
    public final void r(final int u) {
        this.s = true;
        this.u = u;
    }
    
    public final void s(final PopupWindow$OnDismissListener z) {
        this.z = z;
    }
    
    public final void t(final boolean x) {
        this.x = x;
    }
    
    public final void u(final int v) {
        this.t = true;
        this.v = v;
    }
    
    public final void v() {
        if (this.x()) {
            return;
        }
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            this.C((im)iterator.next());
        }
        this.l.clear();
        final View q = this.q;
        if ((this.d = q) != null) {
            final ViewTreeObserver e = this.e;
            final ViewTreeObserver viewTreeObserver = q.getViewTreeObserver();
            this.e = viewTreeObserver;
            if (e == null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }
    
    protected final boolean w() {
        return false;
    }
    
    public final boolean x() {
        return this.b.size() > 0 && ((nb)this.b.get(0).b).x();
    }
}
