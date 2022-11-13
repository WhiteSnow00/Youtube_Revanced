import android.view.View$OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilh extends ikr
{
    public ilh(final OfflineArrowView offlineArrowView, final View$OnClickListener view$OnClickListener) {
        super(offlineArrowView, view$OnClickListener);
    }
    
    public final void d(final aabf aabf) {
        if (aabf == null || aabf.q()) {
            super.a();
            super.b.f();
            super.b.l();
            return;
        }
        if (aabf.i() == aabb.b) {
            super.a();
            super.b.e();
            super.b.l();
            super.b.setContentDescription((CharSequence)super.a.getString(2132017313));
            return;
        }
        if (aabf.s()) {
            if (!aabf.w()) {
                this.c();
                return;
            }
            final int d = aabf.d();
            super.a();
            super.b.c(2131231850);
            if (d > 0) {
                super.b.j(d);
                return;
            }
            super.b.l();
        }
        else {
            if (!aabf.x()) {
                final aabi o = aabf.o;
                final int n = 2;
                int n2 = 0;
                int n4 = 0;
                Label_0180: {
                    if (o != null) {
                        final int c = o.c;
                        final int n3 = n4 = 1;
                        if (c == 1) {
                            break Label_0180;
                        }
                        n4 = n3;
                        if (c == 2) {
                            break Label_0180;
                        }
                        if (c == 8) {
                            n4 = n3;
                            break Label_0180;
                        }
                    }
                    n4 = 0;
                }
                int n5 = n;
                if (aabf.B()) {
                    if (n4 != 0) {
                        n5 = n;
                    }
                    else {
                        n5 = 0;
                    }
                }
                if (aabf.z() || n4 != 0) {
                    n2 = 4;
                }
                final int n6 = n5 | n2;
                final int d2 = aabf.d();
                super.a();
                if ((n6 & 0x2) != 0x0) {
                    if ((n6 & 0x4) != 0x0) {
                        super.b.h();
                    }
                    else {
                        super.b.i();
                    }
                }
                else {
                    super.b.f();
                }
                super.b.j(d2);
                super.b.setContentDescription((CharSequence)super.a.getString(2132017309));
                return;
            }
            this.c();
        }
    }
}
