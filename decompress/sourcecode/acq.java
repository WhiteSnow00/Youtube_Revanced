import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acq
{
    public HashSet a;
    public int b;
    public boolean c;
    public final acr d;
    public acq e;
    public int f;
    int g;
    public acm h;
    public final int i;
    
    public acq(final acr d, final int i) {
        this.a = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.d = d;
        this.i = i;
    }
    
    public final int a() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }
    
    public final int b() {
        if (this.d.ah == 8) {
            return 0;
        }
        final int g = this.g;
        if (g != Integer.MIN_VALUE) {
            final acq e = this.e;
            if (e != null && e.d.ah == 8) {
                return g;
            }
        }
        return this.f;
    }
    
    public final void c(final int n, final ArrayList list, final adl adl) {
        final HashSet a = this.a;
        if (a != null) {
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                sq.d(((acq)iterator.next()).d, n, list, adl);
            }
        }
    }
    
    public final void d() {
        final acq e = this.e;
        if (e != null) {
            final HashSet a = e.a;
            if (a != null) {
                a.remove(this);
                if (this.e.a.size() == 0) {
                    this.e.a = null;
                }
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }
    
    public final void e(final int b) {
        this.b = b;
        this.c = true;
    }
    
    public final boolean f() {
        final HashSet a = this.a;
        if (a == null) {
            return false;
        }
        for (final acq acq : a) {
            final int n = acq.i - 1;
            acq acq2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            acq2 = null;
                        }
                        else {
                            acq2 = acq.d.K;
                        }
                    }
                    else {
                        acq2 = acq.d.J;
                    }
                }
                else {
                    acq2 = acq.d.M;
                }
            }
            else {
                acq2 = acq.d.L;
            }
            if (acq2.h()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean g() {
        final HashSet a = this.a;
        return a != null && a.size() > 0;
    }
    
    public final boolean h() {
        return this.e != null;
    }
    
    public final void i() {
        final acm h = this.h;
        if (h == null) {
            this.h = new acm(1);
            return;
        }
        h.c();
    }
    
    public final void j(final acq e, final int f, final int g) {
        if (e == null) {
            this.d();
            return;
        }
        this.e = e;
        if (e.a == null) {
            e.a = new HashSet();
        }
        final HashSet a = this.e.a;
        if (a != null) {
            a.add(this);
        }
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final String toString() {
        final String ai = this.d.ai;
        String s = null;
        switch (this.i) {
            default: {
                s = "CENTER_Y";
                break;
            }
            case 8: {
                s = "CENTER_X";
                break;
            }
            case 7: {
                s = "CENTER";
                break;
            }
            case 6: {
                s = "BASELINE";
                break;
            }
            case 5: {
                s = "BOTTOM";
                break;
            }
            case 4: {
                s = "RIGHT";
                break;
            }
            case 3: {
                s = "TOP";
                break;
            }
            case 2: {
                s = "LEFT";
                break;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(ai);
        sb.append(":");
        sb.append(s);
        return sb.toString();
    }
}
