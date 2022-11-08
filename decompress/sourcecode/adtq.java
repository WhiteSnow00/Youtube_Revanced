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

public final class adtq extends nq
{
    public final ArrayList a;
    public io e;
    public boolean f;
    final /* synthetic */ adtx g;
    
    public adtq(final adtx g) {
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
        ana.N(view, (akv)new adtp(this, n, b));
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
        this.a.add(new adtr());
        final int size = this.g.c.f().size();
        int n = -1;
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (i < size) {
            final io io = this.g.c.f().get(i);
            if (io.isChecked()) {
                this.x(io);
            }
            if (io.isCheckable()) {
                io.j(false);
            }
            int b;
            int b2;
            int n4;
            if (io.hasSubMenu()) {
                final jg k = io.k;
                b = n;
                b2 = n2;
                n4 = n3;
                if (((SubMenu)k).hasVisibleItems()) {
                    if (i != 0) {
                        this.a.add(new adtt(this.g.z, 0));
                    }
                    this.a.add(new adtu(io));
                    final int size2 = this.a.size();
                    final int size3 = ((SubMenu)k).size();
                    int j = 0;
                    int n5 = 0;
                    while (j < size3) {
                        final io io2 = (io)((SubMenu)k).getItem(j);
                        int n6 = n5;
                        if (io2.isVisible()) {
                            if ((n6 = n5) == 0) {
                                n6 = n5;
                                if (io2.getIcon() != null) {
                                    n6 = 1;
                                }
                            }
                            if (io2.isCheckable()) {
                                io2.j(false);
                            }
                            if (io.isChecked()) {
                                this.x(io);
                            }
                            this.a.add(new adtu(io2));
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
                b = io.b;
                int n7;
                if (b != n) {
                    final int size4 = this.a.size();
                    final boolean b3 = (b2 = ((io.getIcon() != null) ? 1 : 0)) != 0;
                    n7 = size4;
                    if (i != 0) {
                        n7 = size4 + 1;
                        final ArrayList a = this.a;
                        final int z = this.g.z;
                        a.add(new adtt(z, z));
                        b2 = (b3 ? 1 : 0);
                    }
                }
                else {
                    b2 = n2;
                    n7 = n3;
                    if (n2 == 0) {
                        b2 = n2;
                        n7 = n3;
                        if (io.getIcon() != null) {
                            this.y(n3, this.a.size());
                            b2 = 1;
                            n7 = n3;
                        }
                    }
                }
                final adtu adtu = new adtu(io);
                adtu.b = (b2 != 0);
                this.a.add(adtu);
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
        final adts adts = this.a.get(n);
        if (adts instanceof adtt) {
            return 2;
        }
        if (adts instanceof adtr) {
            return 3;
        }
        if (!(adts instanceof adtu)) {
            throw new RuntimeException("Unknown item type.");
        }
        if (((adtu)adts).a.hasSubMenu()) {
            return 1;
        }
        return 0;
    }
    
    public final long mR(final int n) {
        return n;
    }
    
    public final void x(final io e) {
        if (this.e != e) {
            if (e.isCheckable()) {
                final io e2 = this.e;
                if (e2 != null) {
                    e2.setChecked(false);
                }
                (this.e = e).setChecked(true);
            }
        }
    }
}
