import android.util.DisplayMetrics;
import android.text.Layout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g;
import android.view.ViewGroup$LayoutParams;
import android.view.TouchDelegate;
import android.widget.ImageView$ScaleType;
import android.view.View;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.h;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k;
import com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider;
import android.graphics.Rect;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbw implements View$OnLayoutChangeListener
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public jbw(final Rect a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbw(final jbx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbw(final jcr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbw(final kde a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public jbw(final kgl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbw(final owj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onLayoutChange(View viewById, int n, int e, int az, int o, int n2, final int n3, final int n4, final int n5) {
        final int b = this.b;
        final boolean b2 = true;
        final int n6 = 1;
        final boolean b3 = true;
        boolean b4 = true;
        final boolean b5 = false;
        switch (b) {
            default: {
                ((wcs)this.a).l();
                return;
            }
            case 19: {
                final Object a = this.a;
                n = Math.abs(az - n);
                e = Math.abs(o - e);
                final atig d = ((uuz)a).d;
                if (viewById.getVisibility() != 0 || n <= 0 || e <= 0) {
                    b4 = false;
                }
                d.tr((Object)b4);
                return;
            }
            case 18: {
                final SegmentedControl segmentedControl = (SegmentedControl)this.a;
                final ViewGroup$LayoutParams layoutParams = segmentedControl.b.getLayoutParams();
                n2 = segmentedControl.c;
                layoutParams.height = o - e - (n2 + n2);
                final ViewGroup$LayoutParams layoutParams2 = segmentedControl.b.getLayoutParams();
                e = segmentedControl.c;
                layoutParams2.width = az - n - (e + e);
                return;
            }
            case 17: {
                final Object a2 = this.a;
                if (e - o != 0) {
                    if (n - az != 0) {
                        final udl udl = (udl)a2;
                        udl.h.removeOnLayoutChangeListener(udl.k);
                        udl.c();
                    }
                }
                return;
            }
            case 16: {
                ((tqq)this.a).a();
                return;
            }
            case 15: {
                final Object a3 = this.a;
                if (!((ashf)a3).tx()) {
                    ((ashf)a3).c((Object)new Rect(n, e, az, o));
                }
                return;
            }
            case 14: {
                ((owj)this.a).e();
                return;
            }
            case 13: {
                final g c = ((h)this.a).c;
                if (c != null) {
                    ImageView$ScaleType scaleType;
                    if (az - n > o - e) {
                        scaleType = ImageView$ScaleType.CENTER_CROP;
                    }
                    else {
                        scaleType = ImageView$ScaleType.FIT_CENTER;
                    }
                    c.a.setScaleType(scaleType);
                }
                return;
            }
            case 12: {
                final Object a4 = this.a;
                e = az - n;
                n = (int)(e * 0.16666667f);
                final k k = (k)a4;
                k.v.setPadding(n, 10, n, 10);
                n = tmy.bf(k.g.getResources().getDisplayMetrics(), e);
                k.M = (k.g != null && (n <= 0 || n >= 300));
                boolean o2 = b5;
                if (n > 450) {
                    o2 = true;
                }
                k.O = o2;
                final b d2 = k.D;
                final boolean b6 = o2 ^ true;
                d2.q = b6;
                d2.n = b6;
                return;
            }
            case 11: {
                final Object a5 = this.a;
                e = Math.abs(e - o);
                if (Math.abs(n3 - n5) != e) {
                    final MainAppEngagementPanelDataProvider mainAppEngagementPanelDataProvider = (MainAppEngagementPanelDataProvider)a5;
                    final alvp c2 = mainAppEngagementPanelDataProvider.c;
                    if (c2 == null || e != c2.c) {
                        final agza d3 = mainAppEngagementPanelDataProvider.d;
                        e = tmy.bf(mainAppEngagementPanelDataProvider.b, e);
                        d3.copyOnWrite();
                        final alvp alvp = (alvp)d3.instance;
                        final alvp a6 = alvp.a;
                        alvp.b |= 0x1;
                        alvp.c = (float)e;
                        mainAppEngagementPanelDataProvider.c = (alvp)mainAppEngagementPanelDataProvider.d.build();
                        mainAppEngagementPanelDataProvider.a.b("/youtube/app/engagement_panel", ((agxl)mainAppEngagementPanelDataProvider.c).toByteArray());
                    }
                }
                n = Math.abs(az - n);
                if (Math.abs(n4 - n2) != n) {
                    final MainAppEngagementPanelDataProvider mainAppEngagementPanelDataProvider2 = (MainAppEngagementPanelDataProvider)a5;
                    final alvp c3 = mainAppEngagementPanelDataProvider2.c;
                    if (c3 == null || n != c3.d) {
                        final agza d4 = mainAppEngagementPanelDataProvider2.d;
                        n = tmy.bf(mainAppEngagementPanelDataProvider2.b, n);
                        d4.copyOnWrite();
                        final alvp alvp2 = (alvp)d4.instance;
                        final alvp a7 = alvp.a;
                        alvp2.b |= 0x2;
                        alvp2.d = (float)n;
                        mainAppEngagementPanelDataProvider2.c = (alvp)mainAppEngagementPanelDataProvider2.d.build();
                        mainAppEngagementPanelDataProvider2.a.b("/youtube/app/engagement_panel", ((agxl)mainAppEngagementPanelDataProvider2.c).toByteArray());
                    }
                }
                return;
            }
            case 10: {
                final Object a8 = this.a;
                n = o - e;
                if (n == n5 - n3) {
                    return;
                }
                ((gau)((kuu)a8).c.a()).m(fxr.g, n);
                return;
            }
            case 9: {
                ((kok)this.a).f();
                return;
            }
            case 8: {
                final Object a9 = this.a;
                if (n == n2 && e == n3 && az == n4 && o == n5) {
                    return;
                }
                final kjw kjw = (kjw)a9;
                kjw.k(kjw.j, kjw.g);
                return;
            }
            case 7: {
                if (viewById.getParent() != null) {
                    if (((kgl)this.a).a.getVisibility() == 0) {
                        final Layout layout = ((kgl)this.a).a.getLayout();
                        if (layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(0) > 0) {
                            ((kgl)this.a).a.setVisibility(8);
                        }
                    }
                }
                return;
            }
            case 6: {
                ((kde)this.a).r.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                final kde kde = (kde)this.a;
                kde.n(ana.f((View)kde.r) == 1 && b2);
                return;
            }
            case 5: {
                ((kde)this.a).l();
                return;
            }
            case 4: {
                final View view = (View)viewById.getParent();
                final Rect rect = new Rect();
                viewById.getHitRect(rect);
                rect.left += ((Rect)this.a).left;
                rect.top += ((Rect)this.a).top;
                rect.right -= ((Rect)this.a).right;
                rect.bottom -= ((Rect)this.a).bottom;
                view.setTouchDelegate((TouchDelegate)new kat(rect, viewById));
                return;
            }
            case 3: {
                final jlx jlx = (jlx)this.a;
                final DisplayMetrics displayMetrics = jlx.f.getResources().getDisplayMetrics();
                n2 = tmy.aZ(displayMetrics, 270);
                n = tmy.aZ(displayMetrics, jlx.h);
                az = tmy.aZ(displayMetrics, 8);
                viewById = viewById.findViewById(jlx.g);
                viewById.getLayoutParams().height = n2 + (o - e - az - n2) % n;
                if (!viewById.isInLayout()) {
                    viewById.requestLayout();
                }
                return;
            }
            case 2: {
                az -= n;
                o -= e;
                if (az != n4 - n2 || o != n5 - n3) {
                    final jcr jcr = (jcr)this.a;
                    n = jcr.n;
                    if (n != az || jcr.o != o) {
                        if (n > jcr.o) {
                            n = 0;
                        }
                        else {
                            n = 1;
                        }
                        e = n6;
                        if (az > o) {
                            e = 0;
                        }
                        if (n != e) {
                            jcr.c.d = false;
                        }
                        jcr.n = az;
                        jcr.o = o;
                        jcr.j = new Rect(0, 0, az, o);
                        final float n7 = az / (float)o;
                        jcr.p = n7;
                        jcr.d.h = n7;
                        jcr.u();
                    }
                }
                return;
            }
            case 1: {
                final jau jau = (jau)this.a;
                if (e != jau.e) {
                    jau.e = e;
                    if (jau.d) {
                        jau.f();
                    }
                }
                return;
            }
            case 0: {
                final Object a10 = this.a;
                final boolean i = o - e > az - n && b3;
                final jbx jbx = (jbx)a10;
                jbx.i = i;
                jbx.c();
            }
        }
    }
}
