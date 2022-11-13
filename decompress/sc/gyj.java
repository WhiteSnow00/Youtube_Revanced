import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraToolbarMicButton;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import android.widget.EditText;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyj implements View$OnClickListener
{
    public final Object a;
    private final int b;
    
    public gyj(final gvy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final gyo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hal a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final ham a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final har a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hbk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hbp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hbx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hdb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hdf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hdg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hdm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final hds a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyj(final mcb a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        switch (this.b) {
            default: {
                final mcb mcb = (mcb)this.a;
                if (!((EditText)mcb.a).getText().toString().isEmpty()) {
                    ((EditText)mcb.a).setText((CharSequence)"");
                    return;
                }
                final Object c = mcb.c;
                if (c != null) {
                    final pvh pvh = (pvh)c;
                    ((hds)pvh.a).ae.c();
                    ((hds)pvh.a).b.g();
                    return;
                }
                break;
            }
            case 19: {
                final mcb mcb2 = (mcb)this.a;
                if (((EditText)mcb2.a).getText().toString().isEmpty()) {
                    final Object c2 = mcb2.c;
                    if (c2 != null) {
                        ((hds)((pvh)c2).a).d(false);
                    }
                    return;
                }
                ((EditText)mcb2.a).setText((CharSequence)"");
                return;
            }
            case 18: {
                ((hds)this.a).d(true);
                return;
            }
            case 17: {
                final hdm hdm = (hdm)this.a;
                hdm.B.l(hdm.u, 127992);
                if (hdm.m.aw()) {
                    hdm.m.dismiss();
                }
                return;
            }
            case 16: {
                final hdg j = ((hdf)((hdg)this.a).b.b).j;
                j.getClass();
                ((utv)j).E();
                return;
            }
            case 15: {
                final hft b = ((hdg)this.a).b;
                final hdg i = ((hdf)b.b).j;
                i.getClass();
                ((utv)i).E();
                ((ubi)b.a).l();
                ((hdf)b.b).n.cG(xaa.c(148922)).d();
                return;
            }
            case 14: {
                final hft b2 = ((hdg)this.a).b;
                final hdg k = ((hdf)b2.b).j;
                k.getClass();
                ((utv)k).E();
                ((hdf)b2.b).d();
                return;
            }
            case 13: {
                final hdf hdf = (hdf)this.a;
                final xab b3 = hdf.b();
                if (b3 != null) {
                    final twx cg = hdf.n.cG(b3);
                    cg.b = (ahbh)hdf.i;
                    cg.d();
                }
                if (hdf.a.a() == null) {
                    hdf.d();
                    return;
                }
                if (hdf.k) {
                    final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                    ahbb.e((ahaq)aoey.b, (Object)aoey.a);
                    hdf.d.a((aiqj)((ahaz)ahbb).build());
                    return;
                }
                ((utv)hdf.j).K();
                return;
            }
            case 12: {
                final hdb hdb = (hdb)this.a;
                final pvh ak = hdb.ak;
                if (ak != null) {
                    ((hdm)ak.a).c.l();
                    ((hdm)ak.a).p();
                    ((hdm)ak.a).D.cG(xaa.c(127993)).d();
                }
                hdb.dismiss();
                return;
            }
            case 11: {
                final hdb hdb2 = (hdb)this.a;
                final pvh ak2 = hdb2.ak;
                if (ak2 != null) {
                    final hdm hdm2 = (hdm)ak2.a;
                    if (hdm2.o) {
                        hdm2.D.cG(xaa.c(160736)).d();
                        final hcx l = hdm2.k;
                        final long s = hdm2.s;
                        if (s >= 0L) {
                            l.b(s);
                        }
                    }
                }
                hdb2.dismiss();
                return;
            }
            case 10: {
                final hbw ae = ((hbx)this.a).ae;
                if (ae != null) {
                    ae.b();
                }
                return;
            }
            case 9: {
                final hbw ae2 = ((hbx)this.a).ae;
                if (ae2 != null) {
                    ae2.nh();
                }
                return;
            }
            case 8: {
                final hbp hbp = (hbp)this.a;
                hbp.k.cG(xaa.c(144473)).d();
                final ShortsCameraToolbarMicButton f = hbp.f;
                if (f.a == 1) {
                    f.a(2);
                }
                else {
                    f.a(1);
                }
                if (!hbp.h()) {
                    hbp.c.b(hbp.d);
                }
                return;
            }
            case 7: {
                final hbk hbk = (hbk)this.a;
                if (view == hbk.d || view == null) {
                    final xab e = hbk.e;
                    if (e != null) {
                        final aeea o = hbk.o;
                        if (o != null) {
                            o.cG(e).d();
                        }
                    }
                    final utv m = hbk.i;
                    if (m != null) {
                        m.K();
                    }
                }
                return;
            }
            case 6: {
                final har har = (har)this.a;
                final pvh k2 = har.k;
                if (k2 != null) {
                    ((hbg)k2.a).r((DeviceLocalFile)null, false);
                }
                final aeea l2 = har.l;
                if (l2 != null) {
                    l2.cG(xaa.c(127081)).d();
                }
                return;
            }
            case 5: {
                final har har2 = (har)this.a;
                final pvh k3 = har2.k;
                if (k3 != null) {
                    ((hbg)k3.a).f.K();
                    hbx s2;
                    if ((s2 = (hbx)((hbg)k3.a).f.D().f("nestedGreenScreenGalleryFragment")) == null) {
                        final hbg hbg = (hbg)k3.a;
                        s2 = hbx.s(true, 2132017587, false, hbg.p, (aiqj)null, hbg.n);
                    }
                    final hbg hbg2 = (hbg)k3.a;
                    if (hbg2.r == null) {
                        hbg2.r = (hbw)new hbf(hbg2);
                    }
                    s2.ae = hbg2.r;
                    final ct i2 = hbg2.f.D().i();
                    i2.w(2131429155, (br)s2, "nestedGreenScreenGalleryFragment");
                    i2.d();
                }
                final aeea l3 = har2.l;
                if (l3 != null) {
                    l3.cG(xaa.c(127900)).d();
                }
                return;
            }
            case 4: {
                ((hal)this.a).a.m();
                return;
            }
            case 3: {
                final ham ham = (ham)this.a;
                ham.n.cG(ham.a).d();
                final tyz i3 = ham.i;
                if (i3 != null && ham.j != null) {
                    ham.m = true;
                    i3.e();
                }
                return;
            }
            case 2: {
                ((gyo)this.a).c.n();
                return;
            }
            case 1: {
                final gvy gvy = (gvy)this.a;
                gvy.q.cG(gvy.a).d();
                gvy.h();
                return;
            }
            case 0: {
                ((gyo)this.a).i();
                break;
            }
        }
    }
}
