// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded;

import android.view.Window;
import android.view.ViewGroup;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.k;
import com.google.android.apps.youtube.embeddedplayer.service.jar.b;
import android.os.Looper;
import android.os.Handler$Callback;
import android.graphics.Rect;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;
import android.os.Handler;
import java.util.Random;
import android.view.View;

public final class f implements i
{
    public static final afft a;
    public static final afft b;
    private String A;
    public final View c;
    public final h d;
    public final Random e;
    public final Handler f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public String l;
    public int m;
    public e n;
    public final c o;
    public final asiq p;
    private final a r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private boolean x;
    private int y;
    private String z;
    
    static {
        a = afft.x((Object)"com.google.android.googlequicksearchbox", (Object)"com.google.android.apps.magazines", (Object)"com.google.android.apps.newsstand_exp", (Object)"com.google.android.apps.newsstand_internal", (Object)"com.google.android.apps.newsstand_staging", (Object)"com.google.android.apps.newsstanddev", (Object[])new String[] { "com.google.android.play.games" });
        b = afft.x((Object)"com.android.vending", (Object)"com.google.android.apps.magazines", (Object)"com.google.android.apps.messaging", (Object)"com.google.android.apps.newsstand_exp", (Object)"com.google.android.apps.newsstand_internal", (Object)"com.google.android.apps.newsstand_staging", (Object[])new String[] { "com.google.android.apps.newsstanddev", "com.google.android.googlequicksearchbox", "com.google.android.music", "com.google.android.play.games" });
    }
    
    private f(final View c, final a r, final h d, final c o) {
        final Looper mainLooper = c.getContext().getMainLooper();
        final Random e = new Random();
        this.m = 4;
        this.n = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.e.a;
        this.p = new asiq();
        c.getClass();
        this.c = c;
        this.r = r;
        o.getClass();
        this.o = o;
        d.getClass();
        this.d = d;
        this.e = e;
        adkp.I(true, "normalMinimumPeriod must be >= 0");
        adkp.I(true, "normalMaximumPeriod must be >= 0");
        adkp.I(true, "recheckMinimumPeriod must be >= 0");
        adkp.I(true, "recheckMaximumPeriod must be >= 0");
        this.f = new Handler(mainLooper, (Handler$Callback)new bne(this, 4));
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
    }
    
    public static f a(final View view, final a a, final h h) {
        return b(view, a, h, c.a);
    }
    
    public static f b(final View view, final a a, final h h, final c c) {
        final f f = new f(view, a, h, c);
        f.p.c(com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.a(new k(f, 11)));
        return f;
    }
    
    private final int m(final float n, final int n2) {
        if (this.o.f()) {
            return 0;
        }
        return (int)Math.floor(n * n2);
    }
    
    private static String n(final Rect rect, final Rect rect2) {
        return String.format("left: %d, top: %d, right: %d, bottom: %d", rect2.left - rect.left, rect2.top - rect.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }
    
    private static final void o(final View view, final Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = view.getWidth();
        rect.bottom = view.getHeight();
        rect.offset((int)view.getTranslationX(), (int)view.getTranslationY());
    }
    
    private static final void p(final View view, final ViewGroup viewGroup, final Rect rect) {
        rect.offset(view.getLeft(), view.getTop());
        rect.offset(-viewGroup.getScrollX(), -viewGroup.getScrollY());
        rect.offset((int)viewGroup.getTranslationX(), (int)viewGroup.getTranslationY());
    }
    
    @Override
    public final void c() {
        if (!this.j()) {
            afse.p("Video playback stopped because of an unauthorized overlay on top of player. ".concat(String.valueOf(this.z)));
            return;
        }
        if (!this.i()) {
            afse.p("Video playback stopped because the player view is too small. ".concat(String.valueOf(this.A)));
            return;
        }
        if (!this.l()) {
            afse.p("Video playback stopped because the player view is not visible. ".concat(String.valueOf(this.l)));
        }
    }
    
    @Override
    public final void d() {
        synchronized (this) {
            --this.y;
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            ++this.y;
        }
    }
    
    @Override
    public final void f() {
        this.h();
        this.p.dispose();
    }
    
    @Override
    public final void g() {
        this.f.removeMessages(0);
        this.f.sendEmptyMessage(0);
    }
    
    @Override
    public final void h() {
        this.o.e();
        this.f.removeMessages(0);
    }
    
    public final boolean i() {
        final float density = this.c.getResources().getDisplayMetrics().density;
        final float n = this.c.getWidth() / density;
        final float n2 = this.c.getHeight() / density;
        final int n3 = (int)(n + 0.5f);
        final int n4 = (int)(n2 + 0.5f);
        if (n3 >= 195 && n4 >= 105) {
            return true;
        }
        this.A = String.format("The player view is %ddp wide (minimum is %ddp) and %ddp high (minimum is %ddp).", n3, 200, n4, 110);
        return false;
    }
    
    @Override
    public final boolean j() {
        final Window d = this.r.d();
        this.x = this.o.f();
        if (d == null || !d.hasFeature(9)) {
            return this.k(null);
        }
        final View viewById = d.getDecorView().findViewById(16908290);
        if (viewById != null) {
            return this.k(viewById);
        }
        if (this.o.f()) {
            this.k(null);
        }
        return true;
    }
    
    final boolean k(final View view) {
        if (this.g && this.y <= 0 && !this.c.hasWindowFocus()) {
            this.o.d(true);
            this.z = "The player view is obstructed by another window.";
            return false;
        }
        this.o.b();
        o(this.c, this.s);
        ViewGroup viewGroup;
        for (Object c = this.c; c != view && ((View)c).getParent() instanceof ViewGroup; c = viewGroup) {
            viewGroup = (ViewGroup)((View)c).getParent();
            p((View)c, viewGroup, this.s);
            if (!this.o.f()) {
                final Rect t = this.t;
                t.set(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                if (viewGroup.getClipToPadding()) {
                    t.left += viewGroup.getPaddingLeft();
                    t.top += viewGroup.getPaddingTop();
                    t.right -= viewGroup.getPaddingRight();
                    t.bottom -= viewGroup.getPaddingBottom();
                }
                t.offset((int)viewGroup.getTranslationX(), (int)viewGroup.getTranslationY());
                if (!this.t.contains(this.s)) {
                    final String value = String.valueOf(viewGroup);
                    final String n = n(this.t, this.s);
                    final StringBuilder sb = new StringBuilder("The player view is not contained inside its ancestor ");
                    sb.append(value);
                    sb.append(". The distances between the ancestor's edges and that of theplayer view is: ");
                    sb.append(n);
                    sb.append(" (these should all be positive).");
                    this.z = sb.toString();
                    if (!this.x) {
                        return false;
                    }
                }
            }
            final e n2 = this.n;
            final e a = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.e.a;
            final int m = this.m(n2.c, this.s.width());
            final int i = this.m(this.n.c, this.s.height());
            this.w.set(this.s.left + m, this.s.top + i, this.s.right - m, this.s.bottom - i);
            for (int childCount = viewGroup.getChildCount(), j = viewGroup.indexOfChild((View)c) + 1; j < childCount; ++j) {
                final View child = viewGroup.getChildAt(j);
                final int id = child.getId();
                if (this.h) {
                    if (id == 16908336) {
                        continue;
                    }
                }
                if (child.getVisibility() == 0) {
                    final int left = this.w.left;
                    final int top = this.w.top;
                    final int right = this.w.right;
                    final int bottom = this.w.bottom;
                    this.u.setEmpty();
                    p(child, viewGroup, this.u);
                    o(child, this.v);
                    this.v.offset(this.u.left, this.u.top);
                    if (this.v.intersects(left, top, right, bottom)) {
                        this.o.c(this.v, new Rect(left, top, right, bottom));
                        this.u.set(left, top, right, bottom);
                        final String value2 = String.valueOf(child);
                        final Rect u = this.u;
                        final Rect v = this.v;
                        final StringBuilder sb2 = new StringBuilder(260);
                        if (v.contains(u)) {
                            sb2.append("The player view's interior zone is completely covered by the obscuring view. The distance (px) between each edge of the obscuring view and each corresponding interior zone edge is: ");
                            sb2.append(n(v, u));
                            sb2.append(". ");
                        }
                        else if (u.contains(v)) {
                            sb2.append("The obscuring view is inside the player view's interior zone. The distance (px) between each edge of the obscuring view and each corresponding interior zone edge is: ");
                            sb2.append(n(u, v));
                            sb2.append(". ");
                        }
                        else {
                            if (u.left < v.left && v.left < u.right) {
                                sb2.append("Left edge ");
                                sb2.append(u.right - v.left);
                                sb2.append(" px left of the player view's interior zone's right edge. ");
                            }
                            else if (u.left < v.right && v.right < u.right) {
                                sb2.append("Right edge ");
                                sb2.append(v.right - u.left);
                                sb2.append(" px right the of player view's interior zone's left edge. ");
                            }
                            if (u.top < v.top && v.top < u.bottom) {
                                sb2.append("Top edge ");
                                sb2.append(u.bottom - v.top);
                                sb2.append(" px above the player view's interior zone's bottom edge. ");
                            }
                            else if (u.top < v.bottom && v.bottom < u.bottom) {
                                sb2.append("Bottom edge ");
                                sb2.append(v.bottom - u.top);
                                sb2.append(" px below the player view's interior zone's top edge. ");
                            }
                        }
                        final e n3 = this.n;
                        if (n3 == com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.e.b) {
                            final String format = String.format("%.3f", n3.c);
                            sb2.append("The PolicyMode inset factor is ");
                            sb2.append(format);
                            sb2.append(".");
                        }
                        final String string = sb2.toString();
                        final StringBuilder sb3 = new StringBuilder("The player view is obscured by ");
                        sb3.append(value2);
                        sb3.append(". ");
                        sb3.append(string);
                        sb3.append(".");
                        this.z = sb3.toString();
                        if (!this.x) {
                            return false;
                        }
                    }
                }
            }
        }
        this.o.d(false);
        return this.o.a() <= 0;
    }
    
    public final boolean l() {
        View c = this.c;
        View view;
        do {
            final int visibility = c.getVisibility();
            if (visibility != 0) {
                final String value = String.valueOf(c);
                String s;
                if (visibility != 0) {
                    if (visibility != 4) {
                        if (visibility != 8) {
                            s = "UNKNOWN";
                        }
                        else {
                            s = "GONE";
                        }
                    }
                    else {
                        s = "INVISIBLE";
                    }
                }
                else {
                    s = "VISIBLE";
                }
                final StringBuilder sb = new StringBuilder("The view ");
                sb.append(value);
                sb.append(" has visibility \"");
                sb.append(s);
                sb.append("\".");
                this.l = sb.toString();
                return false;
            }
            if (c.getParent() instanceof View) {
                view = (View)c.getParent();
            }
            else {
                view = null;
            }
            c = view;
        } while (view != null);
        return true;
    }
}
