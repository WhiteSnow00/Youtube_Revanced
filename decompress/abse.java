import android.os.Handler;
import java.util.Iterator;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import android.view.View$DragShadowBuilder;
import android.view.View;
import android.app.Dialog;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abse implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public abse(final abrx a, final vxu b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final absh a, final ablo b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final absm a, final TrackingUrlModel b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final absy a, final znz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final abxc b, final atnb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abse(final abxd a, final yrc b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final abzz a, final ablo b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final abzz b, final acac a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abse(final acae a, final acac b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final acaf a, final acac b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final acas a, final acaq b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final acmx a, final oo b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final acos a, final Bitmap b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final actz a, final Dialog b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final acuj b, final aies a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abse(final adaw b, final Throwable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abse(final View a, final View$DragShadowBuilder b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abse(final gsf b, final aexj a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                final Object b = this.b;
                final Object a = this.a;
                final adau e = ((adaw)((gsf)b).a).e;
                aexs aexs;
                if ((aexs = ((aexj)a).e) == null) {
                    aexs = aexs.a;
                }
                e.d(aexs.b);
                return;
            }
            case 19: {
                ((adaw)((gsf)this.b).a).d.d((List)((aexj)this.a).d);
                return;
            }
            case 18: {
                ((adaw)this.b).e.c((Throwable)this.a);
                return;
            }
            case 17: {
                ((adaw)this.b).e.c((Throwable)this.a);
                return;
            }
            case 16: {
                anc.af((View)this.a, (View$DragShadowBuilder)this.b);
                qem.s((Runnable)this, 200L);
                return;
            }
            case 15: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                final acuj acuj = (acuj)b2;
                acuj.e.I(a2, acuj.a);
                return;
            }
            case 14: {
                final Object a3 = this.a;
                final Dialog dialog = (Dialog)this.b;
                final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)dialog.findViewById(2131428487);
                final FrameLayout frameLayout = (FrameLayout)dialog.findViewById(2131428419);
                if (coordinatorLayout != null) {
                    final View av = ((actz)a3).av;
                    if (av != null) {
                        tqf.aF((View)coordinatorLayout, tqf.aq(av.getMeasuredHeight()), (Class)ViewGroup$MarginLayoutParams.class);
                        frameLayout.requestLayout();
                    }
                }
                return;
            }
            case 13: {
                final acos acos = (acos)this.a;
                acos.b.d(acos.a, (Bitmap)this.b);
                return;
            }
            case 12: {
                ((acmx)this.a).a((oo)this.b);
                return;
            }
            case 11: {
                ((acmx)this.a).a((oo)this.b);
                return;
            }
            case 10: {
                final Object a4 = this.a;
                final Object b3 = this.b;
                final acas acas = (acas)a4;
                if (b3 == acas.e) {
                    acas.e = null;
                    acas.f = null;
                    acas.b();
                }
                return;
            }
            case 9: {
                final Object a5 = this.a;
                final acac acac = (acac)this.b;
                if (!acac.a()) {
                    final acaj acaj = (acaj)((acaf)a5).a.a();
                    final abkw d = PlaybackStartDescriptor.d();
                    d.a = acac.b;
                    acaj.d(d.a());
                }
                return;
            }
            case 8: {
                final Object a6 = this.a;
                if (!((acac)this.b).a()) {
                    ((acak)((acae)a6).b.a()).ag();
                }
                return;
            }
            case 7: {
                final Object b4 = this.b;
                if (!((acac)this.a).a()) {
                    final abwp abwp = (abwp)((abzz)b4).g;
                    abwp.ak(7);
                    abwp.f.f();
                }
                return;
            }
            case 6: {
                ((abzz)this.a).g.e((ablo)this.b);
                return;
            }
            case 5: {
                final Object a7 = this.a;
                final Object b5 = this.b;
                final abxd abxd = (abxd)a7;
                final agmq e2 = abxd.e;
                final aant aant = new aant((yrc)b5, abxd.v());
                final acav a8 = abxd.a;
                for (acat acat : e2.c) {}
                a8.ag().tt(aant);
                return;
            }
            case 4: {
                final Object b6 = this.b;
                final Object a9 = ((atnb)this.a).a();
                final abxc abxc = (abxc)b6;
                if (abxc.f) {
                    return;
                }
                final abxd abxd2 = (abxd)a9;
                final acav a10 = abxd2.a;
                final long d2 = abxc.c.d();
                final long e3 = abxc.e;
                int n = 2;
                if (d2 >= e3 && aamp.J(a10) == 2) {
                    n = 4;
                }
                else if (!absv.ah(abxc.g)) {
                    n = 1;
                }
                abxd2.A(n);
                long n2 = 1000L;
                if (n == 4) {
                    final long d3 = abxc.c.d();
                    final long e4 = abxc.e;
                    if (d3 - e4 > 1000L) {
                        abxc.e = abxc.c.d() + 1000L;
                    }
                    else {
                        abxc.e = e4 + 1000L;
                    }
                }
                if (!absv.ac(abxc.g).S || absv.ah(abxc.g)) {
                    n2 = 100L;
                }
                final Handler b7 = abxc.b;
                final Runnable a11 = abxc.a;
                final long d4 = abxc.d;
                long n3 = n2;
                if (d4 > 0L) {
                    n3 = n2;
                    if (d4 <= n2) {
                        n3 = d4;
                    }
                }
                b7.postDelayed(a11, n3);
                abxc.d = Long.MAX_VALUE;
                return;
            }
            case 3: {
                ((absy)this.a).c((znz)this.b);
                return;
            }
            case 2: {
                final Object a12 = this.a;
                final Object b8 = this.b;
                final absm absm = (absm)a12;
                absm.b((TrackingUrlModel)b8, absm.f);
                return;
            }
            case 1: {
                ((abrx)this.a).b((vxu)this.b);
                return;
            }
            case 0: {
                ((absh)this.a).c.e((ablo)this.b);
            }
        }
    }
}
