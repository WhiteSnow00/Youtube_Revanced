import java.util.Iterator;
import android.view.Menu;
import android.animation.ValueAnimator;
import android.view.ViewParent;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import android.os.Build$VERSION;
import android.content.ComponentName;
import android.animation.Animator$AnimatorListener;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.database.Cursor;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView$SearchAutoComplete;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class be implements Runnable
{
    public final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public be(final ActionBarOverlayLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final RecyclerView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final SearchView$SearchAutoComplete a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final SearchView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final az a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final bi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final cl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final fw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final ge a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final mh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final mk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final ml a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public be(final nb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete)a;
                if (searchView$SearchAutoComplete.b) {
                    ((InputMethodManager)searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput((View)a, 0);
                    searchView$SearchAutoComplete.b = false;
                    return;
                }
                break;
            }
            case 19: {
                final apz mSuggestionsAdapter = ((SearchView)this.a).mSuggestionsAdapter;
                if (mSuggestionsAdapter instanceof pi) {
                    mSuggestionsAdapter.d(null);
                }
                return;
            }
            case 18: {
                ((SearchView)this.a).updateFocusedState();
                return;
            }
            case 17: {
                final nt e = ((RecyclerView)this.a).E;
                if (e != null) {
                    e.d();
                }
                ((RecyclerView)this.a).O = false;
                return;
            }
            case 16: {
                final RecyclerView recyclerView = (RecyclerView)this.a;
                if (recyclerView.t) {
                    if (!recyclerView.isLayoutRequested()) {
                        final RecyclerView recyclerView2 = (RecyclerView)this.a;
                        if (!recyclerView2.r) {
                            recyclerView2.requestLayout();
                            return;
                        }
                        if (recyclerView2.v) {
                            recyclerView2.u = true;
                            return;
                        }
                        recyclerView2.z();
                    }
                }
                return;
            }
            case 15: {
                final mh e2 = ((nb)this.a).e;
                if (e2 != null && ana.am((View)e2) && ((nb)this.a).e.getCount() > ((nb)this.a).e.getChildCount()) {
                    final int childCount = ((nb)this.a).e.getChildCount();
                    final nb nb = (nb)this.a;
                    if (childCount <= nb.k) {
                        nb.q.setInputMethodMode(2);
                        ((nb)this.a).v();
                    }
                }
                return;
            }
            case 14: {
                ((nb)this.a).q();
                return;
            }
            case 13: {
                final ml ml = (ml)this.a;
                ml.d();
                final View c = ml.c;
                if (c.isEnabled()) {
                    if (!c.isLongClickable()) {
                        if (ml.b()) {
                            c.getParent().requestDisallowInterceptTouchEvent(true);
                            final long uptimeMillis = SystemClock.uptimeMillis();
                            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            c.onTouchEvent(obtain);
                            obtain.recycle();
                            ml.d = true;
                        }
                    }
                }
                return;
            }
            case 12: {
                final ViewParent parent = ((ml)this.a).c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return;
            }
            case 11: {
                final mk mk = (mk)this.a;
                final int q = mk.q;
                if (q != 1) {
                    if (q != 2) {
                        return;
                    }
                }
                else {
                    mk.p.cancel();
                }
                mk.q = 3;
                final ValueAnimator p = mk.p;
                p.setFloatValues(new float[] { (float)p.getAnimatedValue(), 0.0f });
                mk.p.setDuration(500L);
                mk.p.start();
                return;
            }
            case 10: {
                final mh mh = (mh)this.a;
                mh.b = null;
                mh.drawableStateChanged();
                return;
            }
            case 9: {
                ((ActionBarOverlayLayout)this.a).b();
                final ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)this.a;
                actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY((float)(-((ActionBarOverlayLayout)this.a).c.getHeight())).setListener((Animator$AnimatorListener)((ActionBarOverlayLayout)this.a).j);
                return;
            }
            case 8: {
                ((ActionBarOverlayLayout)this.a).b();
                final ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout)this.a;
                actionBarOverlayLayout2.i = actionBarOverlayLayout2.c.animate().translationY(0.0f).setListener((Animator$AnimatorListener)((ActionBarOverlayLayout)this.a).j);
                return;
            }
            case 7: {
                final Object a2 = this.a;
                final Menu d = ((ge)a2).D();
                Object o;
                if (!(d instanceof im)) {
                    o = null;
                }
                else {
                    o = d;
                }
                if (o != null) {
                    ((im)o).s();
                }
                try {
                    d.clear();
                    if (!((ge)a2).b.onCreatePanelMenu(0, d) || !((ge)a2).b.onPreparePanel(0, (View)null, d)) {
                        d.clear();
                    }
                }
                finally {
                    if (o != null) {
                        ((im)o).r();
                    }
                }
            }
            case 6: {
                final fw fw = (fw)this.a;
                fw.r.showAtLocation((View)fw.q, 55, 0, 0);
                ((fw)this.a).T();
                if (((fw)this.a).aa()) {
                    ((fw)this.a).q.setAlpha(0.0f);
                    final fw fw2 = (fw)this.a;
                    final bx ab = ana.aB((View)fw2.q);
                    ab.p(1.0f);
                    fw2.I = ab;
                    ((fw)this.a).I.s((ank)new fg(this, null));
                    return;
                }
                ((fw)this.a).q.setAlpha(1.0f);
                ((fw)this.a).q.setVisibility(0);
                return;
            }
            case 5: {
                final fw fw3 = (fw)this.a;
                if ((fw3.F & 0x1) != 0x0) {
                    fw3.S(0);
                }
                final fw fw4 = (fw)this.a;
                if ((fw4.F & 0x1000) != 0x0) {
                    fw4.S(108);
                }
                final fw fw5 = (fw)this.a;
                fw5.E = false;
                fw5.F = 0;
                return;
            }
            case 4: {
                final Context f = (Context)this.a;
                final ComponentName componentName = new ComponentName(f, "android.support.v7.app.AppLocalesMetadataHolderService");
                if (f.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                    fe.f = f;
                    ajo ajo = null;
                    Label_1110: {
                        if (Build$VERSION.SDK_INT >= 33) {
                            final Object k = fe.k();
                            if (k != null) {
                                ajo = ajo.e(fd.a(k));
                                break Label_1110;
                            }
                        }
                        else if ((ajo = fe.c) != null) {
                            break Label_1110;
                        }
                        ajo = ajo.a;
                    }
                    if (ajo.h()) {
                        final ajo c2 = ajo.c(ei.c(f));
                        c2.getClass();
                        if (Build$VERSION.SDK_INT >= 33) {
                            final Object i = fe.k();
                            if (i != null) {
                                fd.b(i, fc.a(c2.f()));
                            }
                        }
                        else if (!c2.equals((Object)fe.c)) {
                            synchronized (fe.h) {
                                fe.c = c2;
                                final Iterator iterator = fe.g.iterator();
                                while (iterator.hasNext()) {
                                    final fe fe = iterator.next().get();
                                    if (fe != null) {
                                        fe.D();
                                    }
                                }
                            }
                        }
                    }
                    f.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                }
                fe.e = true;
                return;
            }
            case 3: {
                fe.A((Context)this.a);
                return;
            }
            case 2: {
                ((cl)this.a).ah(true);
                return;
            }
            case 1: {
                final az az = (az)this.a;
                az.b.endViewTransition(az.c);
                ((bc)((az)this.a).d).b();
                return;
            }
            case 0: {
                final bi bi = (bi)this.a;
                bi.a.onDismiss((DialogInterface)bi.d);
                break;
            }
        }
    }
}
