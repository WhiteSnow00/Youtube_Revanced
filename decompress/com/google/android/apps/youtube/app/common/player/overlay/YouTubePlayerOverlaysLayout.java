// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.player.overlay;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import app.revanced.integrations.patches.PlayerTypeHookPatch;
import android.view.View;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.Context;
import android.view.ViewGroup;
import java.util.Map;
import java.util.List;

public class YouTubePlayerOverlaysLayout extends abue implements abbl, trf, fju
{
    public final List a;
    public final List b;
    public final Map c;
    public ViewGroup d;
    public tsb e;
    public fps f;
    public boolean g;
    public final List h;
    public bhv i;
    private fkr n;
    
    public YouTubePlayerOverlaysLayout(final Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new HashMap();
        this.h = new ArrayList();
        this.n = fkr.a;
        this.e = null;
        this.i = null;
        this.d = null;
    }
    
    public YouTubePlayerOverlaysLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new HashMap();
        this.h = new ArrayList();
        this.n = fkr.a;
        this.e = null;
        this.i = null;
        this.d = null;
    }
    
    private final void h(final fkr fkr) {
        if (this.e != null) {
            Label_0086: {
                if (this.g) {
                    if (fkr.m() || fkr.h() || fkr.e()) {
                        break Label_0086;
                    }
                }
                else if (fkr.n() || fkr.h() || fkr.e()) {
                    break Label_0086;
                }
                if (this.g && this.e.a != null) {
                    return;
                }
                this.e.c((View)this);
                return;
            }
            this.e.c((View)null);
        }
    }
    
    private final boolean j(final fqk fqk) {
        return !this.n.h() && fqk.ow(this.n);
    }
    
    private static final abuc m(final abuc abuc) {
        abuc b = abuc;
        if (abuc instanceof fqm) {
            b = ((fqm)abuc).b;
        }
        return b;
    }
    
    private static final abbm p(abuc m) {
        m = m(m);
        if (m instanceof abbm) {
            return (abbm)m;
        }
        return null;
    }
    
    private static final View q(final abuc abuc) {
        final abbm p = p(abuc);
        if (p != null && !p.mn()) {
            return null;
        }
        return abuc.md();
    }
    
    @Override
    protected final List a() {
        final ArrayList list = new ArrayList();
        final bhv i = this.i;
        if (i != null) {
            list.add(((ashi)i.a).am((asjm)new fmn(this, 19)));
        }
        final fps f = this.f;
        if (f != null) {
            list.add(f.a().an((asjm)new fmn(this, 20), (asjm)ezq.s));
        }
        return list;
    }
    
    @Override
    public final void c(final abuc... array) {
        for (final abuc abuc : array) {
            final View q = q(abuc);
            final abbm p = p(abuc);
            if (q == null && p == null) {
                final String value = String.valueOf(abuc);
                final StringBuilder sb = new StringBuilder("Overlay ");
                sb.append(value);
                sb.append(" does not provide a View");
                throw new IllegalArgumentException(sb.toString());
            }
            if (p != null) {
                p.ml(this);
            }
            this.si(abuc, q);
        }
        this.g();
        this.f();
    }
    
    @Override
    public final void d(final abbm abbm, final View view) {
        final int size = this.a.size();
        boolean b = false;
        int i = 0;
        while (true) {
            while (i < size) {
                final abuc abuc = this.a.get(i);
                int n = i;
                if (abuc != abbm) {
                    if (abuc != m(abuc)) {
                        ++i;
                        continue;
                    }
                    n = i;
                }
                if (n >= 0) {
                    b = true;
                }
                adkp.Q(b);
                this.c.put(view, this.a.get(n));
                this.g();
                return;
            }
            int n = -1;
            continue;
        }
    }
    
    public final void e(final View view) {
        this.h(this.n);
    }
    
    public final void f() {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final fqk fqk = this.a.get(i);
            if (this.n == fkr.a || this.j(fqk) || q((abuc)fqk) == null) {
                fqk.k(this.n);
            }
        }
    }
    
    public final void g() {
        final fps f = this.f;
        if (f != null) {
            f.b(this.a);
        }
        final int size = this.a.size();
        int i = 0;
        int j = 0;
        while (i < size) {
            final fqk fqk = this.a.get(i);
            final View q = q((abuc)fqk);
            if (q != null) {
                View child = null;
                while (j < this.getChildCount()) {
                    child = this.getChildAt(j);
                    if (this.c.get(child) != null) {
                        break;
                    }
                    ++j;
                }
                if (this.j(fqk)) {
                    int min = j;
                    if (q != child) {
                        int n = j;
                        if (q.getParent() != null) {
                            ((ViewGroup)q.getParent()).removeView(q);
                            n = j - 1;
                        }
                        min = Math.min(n, this.getChildCount());
                        this.addView(q, min, fqk.a());
                    }
                    j = min + 1;
                }
                else {
                    this.removeView(q);
                }
            }
            ++i;
        }
        final ViewGroup d = this.d;
        if (d != null) {
            this.bringChildToFront((View)d);
        }
    }
    
    public final void n(final fkr n) {
        PlayerTypeHookPatch.YouTubePlayerOverlaysLayout_updatePlayerTypeHookEX((Object)n);
        n.getClass();
        if (n == this.n) {
            return;
        }
        this.h(this.n = n);
        this.g();
        this.f();
        if (n.m()) {
            anb.X((View)this, 1);
            return;
        }
        anb.X((View)this, 2);
        this.clearFocus();
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ViewGroup)this.findViewById(2131430460);
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), 1073741824), View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2), 1073741824));
    }
    
    @Override
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    @Override
    protected final void si(final abuc abuc, final View view) {
        Object o;
        if (abuc instanceof fqk) {
            o = abuc;
        }
        else {
            o = new fqm(abuc);
        }
        this.a.add(o);
        if (view != null) {
            this.c.put(view, o);
        }
    }
}
