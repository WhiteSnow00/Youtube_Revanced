import j$.util.Map$_EL;
import android.view.ViewPropertyAnimator;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import java.util.Collections;
import android.util.Pair;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import android.animation.TimeInterpolator;
import java.util.HashMap;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import android.os.Handler;
import java.util.Map;
import android.view.View;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvy implements txd
{
    public static final xab a;
    public final aun b;
    public final LinearLayout c;
    public final CreationButtonView d;
    public final CreationButtonView e;
    public final View f;
    public final Map g;
    public final View[] h;
    public final View[] i;
    public final Handler j;
    public final EffectsFeatureDescriptionView k;
    public CreationButtonView l;
    public int m;
    public boolean n;
    public int o;
    public final qqr p;
    public final aeea q;
    private final View r;
    private final LinearLayout s;
    private final Map t;
    private boolean u;
    
    static {
        a = xaa.c(128637);
    }
    
    public gvy(final aun b, final aeea q, final qqr p12, final View r, final View[] h, final EffectsFeatureDescriptionView k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.m = 0;
        this.o = 2;
        this.b = b;
        this.q = q;
        this.p = p12;
        this.h = h;
        this.i = new View[10];
        this.k = k;
        this.j = new Handler();
        this.t = new HashMap();
        this.g = new HashMap();
        this.r = r;
        final LinearLayout c = (LinearLayout)r.findViewById(2131431448);
        this.c = c;
        this.s = (LinearLayout)c.findViewById(2131431450);
        this.d = (CreationButtonView)c.findViewById(2131431495);
        this.e = (CreationButtonView)r.findViewById(2131431494);
        this.f = r.findViewById(2131428960);
    }
    
    public static TimeInterpolator a() {
        return (TimeInterpolator)new atr();
    }
    
    public static void o(final qqr qqr, final Map map) {
        qqr.b((aezf)new ggp(map, 11), (Executor)afum.a);
    }
    
    public static final void p(final CreationButtonView creationButtonView) {
        gxv.e(8, (View)creationButtonView.b);
    }
    
    public static final boolean q(final CreationButtonView creationButtonView) {
        return creationButtonView.getVisibility() == 0 && ((ViewGroup)creationButtonView.getParent()).getVisibility() == 0;
    }
    
    public static final void r(final CreationButtonView creationButtonView) {
        gxv.b((View)creationButtonView.b, true);
    }
    
    public final List b() {
        final int n = this.c.getChildCount() - 1;
        final ArrayList list = new ArrayList<CreationButtonView>(n);
        for (int i = 0; i < n; ++i) {
            if (this.c.getChildAt(i) != null) {
                list.add((CreationButtonView)this.c.getChildAt(i));
            }
            else {
                String.format(Locale.getDefault(), "Child view at index %d of toolbarButtonContainer is null.", i);
            }
        }
        return list;
    }
    
    public final List c() {
        final int childCount = this.s.getChildCount();
        final ArrayList list = new ArrayList<CreationButtonView>(childCount);
        for (int i = 0; i < childCount; ++i) {
            if (this.s.getChildAt(i) != null) {
                list.add((CreationButtonView)this.s.getChildAt(i));
            }
            else {
                String.format(Locale.getDefault(), "Child view at index %d of toolbarButtonContainer is null.", i);
            }
        }
        return list;
    }
    
    public final void d(final boolean n) {
        this.n = n;
        final ArrayList list = new ArrayList();
        if (n) {
            for (final CreationButtonView creationButtonView : this.b()) {
                if (creationButtonView.getVisibility() == 0) {
                    list.add(new Pair((Object)creationButtonView, (Object)false));
                }
            }
        }
        final Iterator iterator2 = this.c().iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final CreationButtonView creationButtonView2 = (CreationButtonView)iterator2.next();
            if (creationButtonView2.getVisibility() != 0) {
                continue;
            }
            if (creationButtonView2 == this.e || !n) {
                b = false;
            }
            list.add(new Pair((Object)creationButtonView2, (Object)b));
        }
        if (list.isEmpty()) {
            return;
        }
        if (!n) {
            Collections.reverse(list);
            this.d.b.setVisibility(8);
        }
        final TimeInterpolator a = a();
        final float n2 = (float)list.size();
        for (int i = 0; i < list.size(); ++i) {
            final float n3 = 1.0f;
            final int round = Math.round(a.getInterpolation(i * (1.0f / n2)) * 200.0f);
            final boolean booleanValue = (boolean)((Pair)list.get(i)).second;
            Object b2;
            if (booleanValue) {
                b2 = ((Pair)list.get(i)).first;
            }
            else {
                b2 = ((CreationButtonView)((Pair)list.get(i)).first).b;
            }
            if (!n || ((View)b2).getAlpha() != 1.0f || ((View)b2).getVisibility() != 0) {
                if (n || ((View)b2).getVisibility() != 8) {
                    float alpha;
                    if (!n) {
                        alpha = 1.0f;
                    }
                    else {
                        alpha = 0.0f;
                    }
                    ((View)b2).setAlpha(alpha);
                    ((View)b2).setVisibility(0);
                    if (booleanValue) {
                        ((CreationButtonView)b2).b.setVisibility(0);
                    }
                    final ViewPropertyAnimator animate = ((View)b2).animate();
                    float n4 = n3;
                    if (!n) {
                        n4 = 0.0f;
                    }
                    animate.alpha(n4).setDuration(150L).setStartDelay((long)round).withEndAction((Runnable)new dmv(n, (View)b2, 6)).setListener((Animator$AnimatorListener)new hed(1)).start();
                }
            }
        }
    }
    
    public final void e() {
        int i = 0;
        this.n = false;
        for (List b = this.b(); i < b.size(); ++i) {
            final CreationButtonView creationButtonView = b.get(i);
            if (creationButtonView.getVisibility() == 0) {
                p(creationButtonView);
            }
        }
    }
    
    public final void f(final ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); ++i) {
            if (viewGroup.getChildAt(i) instanceof CreationButtonView) {
                final CreationButtonView creationButtonView = (CreationButtonView)viewGroup.getChildAt(i);
                creationButtonView.e = (txd)this;
                if (creationButtonView.f != null) {
                    final boolean q = q(creationButtonView);
                    this.t.put(creationButtonView, q);
                    final twx cg = this.q.cG(creationButtonView.f);
                    cg.k(q);
                    cg.c();
                }
            }
            else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                this.f((ViewGroup)viewGroup.getChildAt(i));
            }
        }
    }
    
    public final void g(final CreationButtonView creationButtonView) {
        final boolean q = q(creationButtonView);
        if (creationButtonView.f != null && this.t.containsKey(creationButtonView) && q != this.t.get(creationButtonView)) {
            this.t.put(creationButtonView, q);
            final twx cg = this.q.cG(creationButtonView.f);
            cg.k(q);
            cg.j();
        }
    }
    
    public final void h() {
        this.q.cG(gvy.a).f();
        this.m = 0;
        this.e();
        final int[] array = new int[2];
        this.e.getLocationOnScreen(array);
        this.l(0.0f);
        this.j((float)array[1]);
        this.d(false);
        this.i();
        gxv.c(this.i);
    }
    
    public final void i() {
        if (this.m == 1) {
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }
    
    public final void j(final float n) {
        final int m = this.m;
        final List c = this.c();
        if (m != 0) {
            for (final CreationButtonView creationButtonView : c) {
                if (creationButtonView.getVisibility() == 0 && creationButtonView != this.e) {
                    creationButtonView.setAlpha(0.0f);
                }
            }
        }
        CreationButtonView creationButtonView2;
        if (m != 0) {
            creationButtonView2 = this.e;
        }
        else {
            creationButtonView2 = this.d;
        }
        creationButtonView2.setAlpha(0.0f);
        final LinearLayout s = this.s;
        int visibility;
        if (m == 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        s.setVisibility(visibility);
        this.c.post((Runnable)new gvx(this, creationButtonView2, n));
        final Iterator iterator2 = c.iterator();
        while (iterator2.hasNext()) {
            this.g((CreationButtonView)iterator2.next());
        }
    }
    
    public final void k() {
        this.l(1.0f);
    }
    
    final void l(final float alpha) {
        this.d.setAlpha(1.0f);
        if (this.m == 1) {
            this.d.setVisibility(8);
            return;
        }
        for (final CreationButtonView creationButtonView : this.c()) {
            if (creationButtonView != this.e && creationButtonView.getVisibility() == 0) {
                this.d.setAlpha(alpha);
                this.d.setVisibility(0);
                this.m();
                return;
            }
        }
        this.d.setVisibility(8);
    }
    
    public final void m() {
        final Iterator iterator = this.b().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final CreationButtonView creationButtonView = (CreationButtonView)iterator.next();
            final String g = creationButtonView.g;
            if (g == null) {
                continue;
            }
            if ((int)Map$_EL.getOrDefault(this.g, (Object)g, (Object)0) == 2) {
                b = false;
            }
            creationButtonView.f(b);
        }
        final Iterator iterator2 = this.c().iterator();
        boolean b2 = false;
        while (iterator2.hasNext()) {
            final CreationButtonView creationButtonView2 = (CreationButtonView)iterator2.next();
            final String g2 = creationButtonView2.g;
            if (g2 != null) {
                final int intValue = (int)Map$_EL.getOrDefault(this.g, (Object)g2, (Object)0);
                if (intValue == 2) {
                    creationButtonView2.f(false);
                }
                else {
                    creationButtonView2.f(true);
                    if (intValue != 0 || creationButtonView2.getVisibility() != 0) {
                        continue;
                    }
                    b2 = true;
                }
            }
        }
        this.d.f(b2);
    }
    
    public final void n() {
        if (this.u) {
            return;
        }
        this.u = true;
        final int visibility = this.r.getVisibility();
        this.r.animate().cancel();
        this.r.setVisibility(visibility);
        if (visibility == 0) {
            this.r.setAlpha(1.0f);
        }
        else {
            this.r.setAlpha(0.0f);
        }
        final int n = this.c.getChildCount() - 2;
        int o = this.o;
        int n2 = 0;
        int n3 = 0;
        while (n2 < n && o > 0) {
            int n4 = o;
            if (this.c.getChildAt(n2) != null) {
                n4 = o;
                if (this.c.getChildAt(n2).getVisibility() == 0) {
                    n4 = o - 1;
                }
            }
            ++n3;
            ++n2;
            o = n4;
        }
        final int n5 = n3;
        int n6 = n3;
        int n7 = n5;
        while (n6 < n && this.c.getChildAt(n6) != null && this.c.getChildAt(n6).getVisibility() != 0) {
            ++n7;
            ++n6;
        }
        if (n7 < n) {
            int n8 = n;
            while (true) {
                final int n9 = n8 - 1;
                if (n9 < n7) {
                    break;
                }
                final CreationButtonView creationButtonView = (CreationButtonView)this.c.getChildAt(n9);
                n8 = n9;
                if (creationButtonView == null) {
                    continue;
                }
                creationButtonView.animate().cancel();
                this.c.removeView((View)creationButtonView);
                this.s.addView((View)creationButtonView, 0);
                n8 = n9;
            }
        }
        this.u = false;
    }
}
