import android.view.SubMenu;
import android.widget.FrameLayout;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.widget.TextView;
import com.google.android.material.internal.NavigationMenuItemView;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxj extends nr
{
    public final ArrayList a;
    public ip e;
    public boolean f;
    final adxq g;
    
    public adxj(final adxq g) {
        this.g = g;
        this.a = new ArrayList();
        this.b();
    }
    
    private final void y(int i, final int n) {
        while (i < n) {
            this.a.get(i).b = true;
            ++i;
        }
    }
    
    private final void z(final View view, final int n, final boolean b) {
        anc.N(view, new adxi(this, n, b));
    }
    
    public final int a() {
        return this.a.size();
    }
    
    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.clear();
        this.a.add(new adxk());
        final int size = this.g.c.f().size();
        int n = -1;
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (i < size) {
            final ip ip = this.g.c.f().get(i);
            if (ip.isChecked()) {
                this.x(ip);
            }
            if (ip.isCheckable()) {
                ip.j(false);
            }
            int b;
            int b2;
            int n4;
            if (ip.hasSubMenu()) {
                final jh k = ip.k;
                b = n;
                b2 = n2;
                n4 = n3;
                if (((SubMenu)k).hasVisibleItems()) {
                    if (i != 0) {
                        this.a.add(new adxm(this.g.z, 0));
                    }
                    this.a.add(new adxn(ip));
                    final int size2 = this.a.size();
                    final int size3 = ((SubMenu)k).size();
                    int j = 0;
                    int n5 = 0;
                    while (j < size3) {
                        final ip ip2 = (ip)((SubMenu)k).getItem(j);
                        int n6 = n5;
                        if (ip2.isVisible()) {
                            if ((n6 = n5) == 0) {
                                n6 = n5;
                                if (ip2.getIcon() != null) {
                                    n6 = 1;
                                }
                            }
                            if (ip2.isCheckable()) {
                                ip2.j(false);
                            }
                            if (ip.isChecked()) {
                                this.x(ip);
                            }
                            this.a.add(new adxn(ip2));
                        }
                        ++j;
                        n5 = n6;
                    }
                    b = n;
                    b2 = n2;
                    n4 = n3;
                    if (n5 != 0) {
                        this.y(size2, this.a.size());
                        b = n;
                        b2 = n2;
                        n4 = n3;
                    }
                }
            }
            else {
                b = ip.b;
                int n7;
                if (b != n) {
                    final int size4 = this.a.size();
                    final boolean b3 = (b2 = ((ip.getIcon() != null) ? 1 : 0)) != 0;
                    n7 = size4;
                    if (i != 0) {
                        final ArrayList a = this.a;
                        final int z = this.g.z;
                        a.add(new adxm(z, z));
                        n7 = size4 + 1;
                        b2 = (b3 ? 1 : 0);
                    }
                }
                else {
                    b2 = n2;
                    n7 = n3;
                    if (n2 == 0) {
                        b2 = n2;
                        n7 = n3;
                        if (ip.getIcon() != null) {
                            this.y(n3, this.a.size());
                            b2 = 1;
                            n7 = n3;
                        }
                    }
                }
                final adxn adxn = new adxn(ip);
                adxn.b = (b2 != 0);
                this.a.add(adxn);
                n4 = n7;
            }
            ++i;
            n = b;
            n2 = b2;
            n3 = n4;
        }
        this.f = false;
    }
    
    public final int d(final int n) {
        final adxl adxl = this.a.get(n);
        if (adxl instanceof adxm) {
            return 2;
        }
        if (adxl instanceof adxk) {
            return 3;
        }
        if (!(adxl instanceof adxn)) {
            throw new RuntimeException("Unknown item type.");
        }
        if (((adxn)adxl).a.hasSubMenu()) {
            return 1;
        }
        return 0;
    }
    
    public final oo g(final ViewGroup viewGroup, final int n) {
        if (n == 0) {
            final adxq g = this.g;
            return new adxp(g.f, viewGroup, g.B);
        }
        if (n == 1) {
            return new oo(this.g.f.inflate(2131624343, viewGroup, false));
        }
        if (n == 2) {
            return new oo(this.g.f.inflate(2131624342, viewGroup, false));
        }
        if (n != 3) {
            return null;
        }
        return new oo((View)this.g.b);
    }
    
    public final long mO(final int n) {
        return n;
    }
    
    public final /* bridge */ void q(final oo oo, final int n) {
        final int d = this.d(n);
        boolean j = true;
        if (d == 0) {
            final NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView)oo.a;
            navigationMenuItemView.i = this.g.k;
            if (navigationMenuItemView.i == null) {
                j = false;
            }
            navigationMenuItemView.j = j;
            final ip h = navigationMenuItemView.h;
            if (h != null) {
                navigationMenuItemView.b(h.getIcon());
            }
            final int i = this.g.i;
            if (i != 0) {
                ((TextView)navigationMenuItemView.f).setTextAppearance(i);
            }
            final ColorStateList k = this.g.j;
            if (k != null) {
                navigationMenuItemView.f.setTextColor(k);
            }
            final Drawable l = this.g.l;
            Drawable drawable;
            if (l != null) {
                drawable = l.getConstantState().newDrawable();
            }
            else {
                drawable = null;
            }
            anc.Q((View)navigationMenuItemView, drawable);
            final RippleDrawable m = this.g.m;
            if (m != null) {
                ((adxf)navigationMenuItemView).setForeground(m.getConstantState().newDrawable());
            }
            final adxn adxn = this.a.get(n);
            navigationMenuItemView.d = adxn.b;
            final adxq g = this.g;
            final int n2 = g.n;
            final int o = g.o;
            navigationMenuItemView.setPadding(n2, o, n2, o);
            navigationMenuItemView.f.setCompoundDrawablePadding(this.g.p);
            final adxq g2 = this.g;
            if (g2.v) {
                navigationMenuItemView.c = g2.q;
            }
            navigationMenuItemView.f.setMaxLines(g2.x);
            navigationMenuItemView.f(adxn.a);
            this.z((View)navigationMenuItemView, n, false);
            return;
        }
        if (d == 1) {
            final TextView textView = (TextView)oo.a;
            textView.setText(this.a.get(n).a.d);
            final int g3 = this.g.g;
            if (g3 != 0) {
                textView.setTextAppearance(g3);
            }
            textView.setPadding(this.g.t, textView.getPaddingTop(), this.g.u, textView.getPaddingBottom());
            final ColorStateList h2 = this.g.h;
            if (h2 != null) {
                textView.setTextColor(h2);
            }
            this.z((View)textView, n, true);
            return;
        }
        if (d != 2) {
            this.z(oo.a, n, true);
            return;
        }
        final adxm adxm = this.a.get(n);
        final View a = oo.a;
        final adxq g4 = this.g;
        a.setPadding(g4.r, adxm.a, g4.s, adxm.b);
    }
    
    public final /* bridge */ void r(final oo oo) {
        if (oo instanceof adxp) {
            final NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView)oo.a;
            final FrameLayout g = navigationMenuItemView.g;
            if (g != null) {
                g.removeAllViews();
            }
            navigationMenuItemView.f.setCompoundDrawables((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
        }
    }
    
    public final void x(final ip e) {
        if (this.e != e) {
            if (e.isCheckable()) {
                final ip e2 = this.e;
                if (e2 != null) {
                    e2.setChecked(false);
                }
                (this.e = e).setChecked(true);
            }
        }
    }
}
