import android.view.KeyEvent;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ViewDebug$CapturedViewProperty;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.MenuItem$OnActionExpandListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class io implements ajd
{
    private int A;
    private View B;
    private MenuItem$OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public Intent e;
    public char f;
    public int g;
    public char h;
    public int i;
    public final im j;
    public jg k;
    public CharSequence l;
    public CharSequence m;
    public int n;
    public akw o;
    public boolean p;
    private final int q;
    private CharSequence r;
    private Drawable s;
    private int t;
    private MenuItem$OnMenuItemClickListener u;
    private ColorStateList v;
    private PorterDuff$Mode w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    public io(final im j, final int b, final int a, final int q, final int c, final CharSequence d, final int n) {
        this.g = 4096;
        this.i = 4096;
        this.t = 0;
        this.v = null;
        this.w = null;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = 16;
        this.p = false;
        this.j = j;
        this.a = a;
        this.b = b;
        this.q = q;
        this.c = c;
        this.d = d;
        this.n = n;
    }
    
    public static void g(final StringBuilder sb, final int n, final int n2, final String s) {
        if ((n & n2) == n2) {
            sb.append(s);
        }
    }
    
    private final Drawable v(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.z) {
                if (!this.x) {
                    mutate = drawable;
                    if (!this.y) {
                        return mutate;
                    }
                }
                mutate = drawable.mutate();
                if (this.x) {
                    aip.g(mutate, this.v);
                }
                if (this.y) {
                    aip.h(mutate, this.w);
                }
                this.z = false;
            }
        }
        return mutate;
    }
    
    @Override
    public final akw a() {
        return this.o;
    }
    
    @Override
    public final void b(final CharSequence l) {
        this.l = l;
        this.j.l(false);
    }
    
    @Override
    public final void c(akw o) {
        final akw o2 = this.o;
        if (o2 != null) {
            o2.c = null;
        }
        this.B = null;
        this.o = o;
        this.j.l(true);
        o = this.o;
        if (o != null) {
            o.h(new qpt(this));
        }
    }
    
    @Override
    public final boolean collapseActionView() {
        if ((this.n & 0x8) == 0x0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        final MenuItem$OnActionExpandListener c = this.C;
        return (c == null || c.onMenuItemActionCollapse((MenuItem)this)) && this.j.t(this);
    }
    
    @Override
    public final void d(final CharSequence m) {
        this.m = m;
        this.j.l(false);
    }
    
    public final char e() {
        char c;
        if (this.j.x()) {
            c = this.h;
        }
        else {
            c = this.f;
        }
        return c;
    }
    
    @Override
    public final boolean expandActionView() {
        if (!this.m()) {
            return false;
        }
        final MenuItem$OnActionExpandListener c = this.C;
        return (c == null || c.onMenuItemActionExpand((MenuItem)this)) && this.j.v(this);
    }
    
    public final CharSequence f(final ja ja) {
        CharSequence charSequence;
        if (ja != null && ja.e()) {
            charSequence = this.getTitleCondensed();
        }
        else {
            charSequence = this.d;
        }
        return charSequence;
    }
    
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    @Override
    public final View getActionView() {
        final View b = this.B;
        if (b != null) {
            return b;
        }
        final akw o = this.o;
        if (o != null) {
            return this.B = o.e((MenuItem)this);
        }
        return null;
    }
    
    @Override
    public final int getAlphabeticModifiers() {
        return this.i;
    }
    
    public final char getAlphabeticShortcut() {
        return this.h;
    }
    
    @Override
    public final CharSequence getContentDescription() {
        return this.l;
    }
    
    public final int getGroupId() {
        return this.b;
    }
    
    public final Drawable getIcon() {
        final Drawable s = this.s;
        if (s != null) {
            return this.v(s);
        }
        final int t = this.t;
        if (t != 0) {
            final Drawable b = fc.b(this.j.a, t);
            this.t = 0;
            this.s = b;
            return this.v(b);
        }
        return null;
    }
    
    @Override
    public final ColorStateList getIconTintList() {
        return this.v;
    }
    
    @Override
    public final PorterDuff$Mode getIconTintMode() {
        return this.w;
    }
    
    public final Intent getIntent() {
        return this.e;
    }
    
    @ViewDebug$CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    @Override
    public final int getNumericModifiers() {
        return this.g;
    }
    
    public final char getNumericShortcut() {
        return this.f;
    }
    
    public final int getOrder() {
        return this.q;
    }
    
    public final SubMenu getSubMenu() {
        return (SubMenu)this.k;
    }
    
    @ViewDebug$CapturedViewProperty
    public final CharSequence getTitle() {
        return this.d;
    }
    
    public final CharSequence getTitleCondensed() {
        final CharSequence r = this.r;
        if (r != null) {
            return r;
        }
        return this.d;
    }
    
    @Override
    public final CharSequence getTooltipText() {
        return this.m;
    }
    
    public final void h(final boolean p) {
        this.p = p;
        this.j.l(false);
    }
    
    public final boolean hasSubMenu() {
        return this.k != null;
    }
    
    final void i(final boolean b) {
        final int a = this.A;
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 2;
        }
        final int a2 = n | (a & 0xFFFFFFFD);
        this.A = a2;
        if (a != a2) {
            this.j.l(false);
        }
    }
    
    @Override
    public final boolean isActionViewExpanded() {
        return this.p;
    }
    
    public final boolean isCheckable() {
        return (this.A & 0x1) == 0x1;
    }
    
    public final boolean isChecked() {
        return (this.A & 0x2) == 0x2;
    }
    
    public final boolean isEnabled() {
        return (this.A & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        final akw o = this.o;
        if (o != null && o.g()) {
            return (this.A & 0x8) == 0x0 && this.o.f();
        }
        return (this.A & 0x8) == 0x0;
    }
    
    public final void j(final boolean b) {
        final int a = this.A;
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 4;
        }
        this.A = (n | (a & 0xFFFFFFFB));
    }
    
    public final void k(final boolean b) {
        int a;
        if (b) {
            a = (this.A | 0x20);
        }
        else {
            a = (this.A & 0xFFFFFFDF);
        }
        this.A = a;
    }
    
    public final void l(final jg k) {
        (this.k = k).setHeaderTitle(this.d);
    }
    
    public final boolean m() {
        if ((this.n & 0x8) != 0x0) {
            if (this.B == null) {
                final akw o = this.o;
                if (o != null) {
                    this.B = o.e((MenuItem)this);
                }
            }
            if (this.B != null) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean n() {
        final MenuItem$OnMenuItemClickListener u = this.u;
        if (u != null && u.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        final im j = this.j;
        if (j.u(j, (MenuItem)this)) {
            return true;
        }
        final Intent e = this.e;
        if (e != null) {
            try {
                this.j.a.startActivity(e);
                return true;
            }
            catch (final ActivityNotFoundException ex) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)ex);
            }
        }
        final akw o = this.o;
        return o != null && o.d();
    }
    
    public final boolean o() {
        return (this.A & 0x20) == 0x20;
    }
    
    public final boolean p() {
        return (this.A & 0x4) != 0x0;
    }
    
    public final boolean q() {
        return (this.n & 0x1) == 0x1;
    }
    
    public final boolean r() {
        return (this.n & 0x2) == 0x2;
    }
    
    final boolean s(final boolean b) {
        final int a = this.A;
        int n;
        if (!b) {
            n = 8;
        }
        else {
            n = 0;
        }
        final int a2 = n | (a & 0xFFFFFFF7);
        this.A = a2;
        return a != a2;
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public final MenuItem setAlphabeticShortcut(final char c) {
        if (this.h == c) {
            return (MenuItem)this;
        }
        this.h = Character.toLowerCase(c);
        this.j.l(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        if (this.h == c && this.i == n) {
            return (MenuItem)this;
        }
        this.h = Character.toLowerCase(c);
        this.i = KeyEvent.normalizeMetaState(n);
        this.j.l(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        final int a = this.A;
        final int a2 = (b ? 1 : 0) | (a & 0xFFFFFFFE);
        this.A = a2;
        if (a != a2) {
            this.j.l(false);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        if ((this.A & 0x4) != 0x0) {
            final im j = this.j;
            final int b2 = this.b;
            final int size = j.c.size();
            j.s();
            for (int i = 0; i < size; ++i) {
                final io io = j.c.get(i);
                if (io.b == b2) {
                    if (io.p()) {
                        if (io.isCheckable()) {
                            io.i(io == this);
                        }
                    }
                }
            }
            j.r();
        }
        else {
            this.i(b);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        int a;
        if (b) {
            a = (this.A | 0x10);
        }
        else {
            a = (this.A & 0xFFFFFFEF);
        }
        this.A = a;
        this.j.l(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int t) {
        this.s = null;
        this.t = t;
        this.z = true;
        this.j.l(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable s) {
        this.t = 0;
        this.s = s;
        this.z = true;
        this.j.l(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintList(final ColorStateList v) {
        this.v = v;
        this.x = true;
        this.z = true;
        this.j.l(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintMode(final PorterDuff$Mode w) {
        this.w = w;
        this.y = true;
        this.z = true;
        this.j.l(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent e) {
        this.e = e;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c) {
        if (this.f == c) {
            return (MenuItem)this;
        }
        this.f = c;
        this.j.l(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setNumericShortcut(final char c, final int n) {
        if (this.f == c && this.g == n) {
            return (MenuItem)this;
        }
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(n);
        this.j.l(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener c) {
        this.C = c;
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener u) {
        this.u = u;
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.f = c;
        this.h = Character.toLowerCase(c2);
        this.j.l(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(n);
        this.h = Character.toLowerCase(c2);
        this.i = KeyEvent.normalizeMetaState(n2);
        this.j.l(false);
        return (MenuItem)this;
    }
    
    @Override
    public final void setShowAsAction(final int n) {
        final int n2 = n & 0x3;
        if (n2 != 0 && n2 != 1 && n2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.n = n;
        this.j.B();
    }
    
    public final MenuItem setTitle(final int n) {
        this.setTitle(this.j.a.getString(n));
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence charSequence) {
        this.d = charSequence;
        this.j.l(false);
        final jg k = this.k;
        if (k != null) {
            k.setHeaderTitle(charSequence);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence r) {
        this.r = r;
        this.j.l(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        if (this.s(b)) {
            this.j.C();
        }
        return (MenuItem)this;
    }
    
    public final boolean t() {
        return this.j.y() && this.e() != '\0';
    }
    
    @Override
    public final String toString() {
        final CharSequence d = this.d;
        if (d != null) {
            return d.toString();
        }
        return null;
    }
    
    public final void u(final View b) {
        this.B = b;
        this.o = null;
        if (b != null && b.getId() == -1) {
            final int a = this.a;
            if (a > 0) {
                b.setId(a);
            }
        }
        this.j.B();
    }
}
