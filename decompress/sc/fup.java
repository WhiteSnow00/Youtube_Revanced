import java.util.Iterator;
import android.app.Activity;
import java.util.HashMap;
import java.util.function.Predicate;
import java.util.Map;
import java.util.List;
import java.util.function.Consumer;
import j$.util.Optional;
import j$.util.Map$_EL;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fup implements View$OnClickListener
{
    public final Object a;
    private final int b;
    
    public fup(final HatsContainer a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final ReelBrowseFragmentToolbarController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final fts a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final fuq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final fvn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final fwm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final gfw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final gmk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final gms a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final gqk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final gvy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fup(final pvh a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        switch (this.b) {
            default: {
                final gvy gvy = (gvy)this.a;
                gvy.q.cG(gvy.e.f).d();
                gvy.h();
                return;
            }
            case 19: {
                final gvy gvy2 = (gvy)this.a;
                gvy2.q.cG(gvy2.d.f).d();
                gvy2.q.cG(gvy.a).h();
                gvy2.m = 1;
                final int[] array = new int[2];
                gvy2.d.getLocationOnScreen(array);
                gvy2.k();
                gvy2.j((float)array[1]);
                gvy2.j.removeCallbacksAndMessages((Object)null);
                gvy2.d(true);
                gvy2.i();
                for (int i = 0; i < 10; ++i) {
                    final View view2 = gvy2.h[i];
                    if (view2 != null && view2.getVisibility() == 0) {
                        gvy2.i[i] = gvy2.h[i];
                    }
                    else {
                        gvy2.i[i] = null;
                    }
                }
                gxv.d(gvy2.i);
                final Iterator iterator = gvy2.c().iterator();
                boolean b = false;
                while (iterator.hasNext()) {
                    final CreationButtonView creationButtonView = (CreationButtonView)iterator.next();
                    final String g = creationButtonView.g;
                    if (g != null && (int)Map$_EL.getOrDefault(gvy2.g, (Object)g, (Object)0) == 0 && gvy.q(creationButtonView)) {
                        gvy2.g.put(creationButtonView.g, 1);
                        b = true;
                    }
                }
                gvy2.m();
                if (b) {
                    gvy.o(gvy2.p, gvy2.g);
                }
                return;
            }
            case 18: {
                ((ReelBrowseFragmentToolbarController)this.a).g();
                return;
            }
            case 17: {
                ((ReelBrowseFragmentToolbarController)this.a).g();
                return;
            }
            case 16: {
                ((ReelBrowseFragmentToolbarController)this.a).g();
                return;
            }
            case 15: {
                ((ReelBrowseFragmentToolbarController)this.a).g();
                return;
            }
            case 14: {
                final Object a = this.a;
                ((gqk)a).f();
                ((acav)a).i(1);
                return;
            }
            case 13: {
                ((acav)this.a).i(2);
                return;
            }
            case 12: {
                ((acav)this.a).i(2);
                return;
            }
            case 11: {
                final Object a2 = this.a;
                ((gqk)a2).f();
                ((acav)a2).i(1);
                return;
            }
            case 10: {
                ((gms)this.a).e.G((Object)view);
                return;
            }
            case 9: {
                ((gmb)this.a).c();
                return;
            }
            case 8: {
                final acqe a3 = ((gfw)this.a).a;
                if (a3 != null) {
                    final acqf d = a3.d;
                    if (d != null) {
                        d.oL();
                    }
                }
                return;
            }
            case 7: {
                ((Runnable)this.a).run();
                return;
            }
            case 6: {
                ((pvh)this.a).N(1);
                return;
            }
            case 5: {
                ((HatsContainer)this.a).b();
                return;
            }
            case 4: {
                ((HatsContainer)this.a).b();
                return;
            }
            case 3: {
                final fwm fwm = (fwm)this.a;
                Optional.ofNullable((Object)fwm.c).ifPresent((Consumer)new fvj(fwm, 13));
                return;
            }
            case 2: {
                final fvn fvn = (fvn)this.a;
                if (!fvn.b) {
                    final aome p = fvn.p;
                    if (p != null) {
                        if (!((List)p.y).isEmpty()) {
                            fvn.f.d((List)p.y, (Map)null);
                            return;
                        }
                        if (fvn.k.o()) {
                            Optional.ofNullable((Object)fvn.p).filter((Predicate)fqo.e).ifPresent((Consumer)new fvj(fvn, 4));
                            if (fvn.d.t()) {
                                fvn.m(p, false);
                                return;
                            }
                            final gmy gmy = new gmy(fvn, p, 1);
                            if ((p.c & 0x1) != 0x0) {
                                final HashMap hashMap = new HashMap();
                                hashMap.put("sign_in_callback", gmy);
                                final vcy f = fvn.f;
                                aiqj aiqj;
                                if ((aiqj = p.E) == null) {
                                    aiqj = aiqj.a;
                                }
                                f.c(aiqj, (Map)hashMap);
                                return;
                            }
                            fvn.e.b((Activity)fvn.c, (byte[])null, (zmr)gmy);
                        }
                        else {
                            fvn.l.b();
                        }
                    }
                }
                return;
            }
            case 1: {
                final fts fts = (fts)this.a;
                final Object f2 = fts.f;
                if (f2 != null) {
                    final ahno ahno = (ahno)f2;
                    if ((0x4 & ahno.b) != 0x0) {
                        final ftq b2 = fts.b;
                        if (b2 != null) {
                            aiqj aiqj2;
                            if ((aiqj2 = ahno.e) == null) {
                                aiqj2 = aiqj.a;
                            }
                            b2.a(f2, (List)afeq.r((Object)aiqj2));
                        }
                    }
                }
                return;
            }
            case 0: {
                final fuq fuq = (fuq)this.a;
                fuq.a(fuq.c.isChecked() ^ true);
            }
        }
    }
}
