import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnd extends nm
{
    public final hne b;
    
    public hnd(final hne b) {
        this.b = b;
    }
    
    public final int a(final nw nw, final int n, final int n2) {
        return this.b.C = super.a(nw, n, n2);
    }
    
    public final View b(final nw nw) {
        if (nw.as() > 0 && this.b.q()) {
            final int x = this.b.p.x();
            final int d = this.b.p.D();
            final int n = 0;
            int n2 = 0;
            final View view = null;
            View ab;
            if (x != -1 && this.b.B >= x) {
                while (true) {
                    ab = view;
                    if (n2 >= nw.as()) {
                        break;
                    }
                    final View ab2 = nw.aB(n2);
                    final hoc l = hoc.L(ab2);
                    if (l instanceof hmm && !((hmm)l).u) {
                        final hne b = this.b;
                        b.l.set(b.B);
                        ab = ab2;
                        if (this.b.l.get() > 0) {
                            ab2.postDelayed((Runnable)new hdh(this, 17), 1000L);
                            ab = ab2;
                            break;
                        }
                        break;
                    }
                    else {
                        ++n2;
                    }
                }
            }
            else {
                ab = view;
                if (d != -1) {
                    ab = view;
                    if (this.b.B <= 0) {
                        int n3 = n;
                        while (true) {
                            ab = view;
                            if (n3 >= nw.as()) {
                                break;
                            }
                            ab = nw.aB(n3);
                            final hoc i = hoc.L(ab);
                            if (i instanceof hmm && ((hmm)i).u) {
                                final hne b2 = this.b;
                                b2.k.set(b2.B);
                                ab.postDelayed((Runnable)new hdh(this, 18), 1000L);
                                break;
                            }
                            ++n3;
                        }
                    }
                }
            }
            if (ab != null) {
                return ab;
            }
        }
        return super.b(nw);
    }
}
