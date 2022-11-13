import android.util.DisplayMetrics;
import android.text.Layout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.f;
import android.view.ViewGroup$LayoutParams;
import android.view.TouchDelegate;
import android.widget.ImageView$ScaleType;
import android.view.View;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.l;
import com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider;
import android.graphics.Rect;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcy implements View$OnLayoutChangeListener
{
    final Object a;
    private final int b;
    
    public jcy(final Rect a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final ashu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final MainAppEngagementPanelDataProvider a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final l a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final g a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final SegmentedControl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final jbt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final jcz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final jds a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final jna a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final kee a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final kee a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final khm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final kkx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final kpm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final kvw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final oxs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final tsv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final ufo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final uwu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcy(final wet a, final int b) {
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
                ((wet)this.a).l();
                return;
            }
            case 19: {
                final Object a = this.a;
                n = Math.abs(az - n);
                e = Math.abs(o - e);
                final atiy d = ((uwu)a).d;
                if (viewById.getVisibility() != 0 || n <= 0 || e <= 0) {
                    b4 = false;
                }
                d.tu((Object)b4);
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
                        final ufo ufo = (ufo)a2;
                        ufo.h.removeOnLayoutChangeListener(ufo.k);
                        ufo.c();
                    }
                }
                return;
            }
            case 16: {
                ((tsv)this.a).a();
                return;
            }
            case 15: {
                final Object a3 = this.a;
                if (!((ashu)a3).tA()) {
                    ((ashu)a3).c((Object)new Rect(n, e, az, o));
                }
                return;
            }
            case 14: {
                ((oxs)this.a).e();
                return;
            }
            case 13: {
                final f c = ((g)this.a).c;
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
                final l l = (l)this.a;
                final TextView v = l.v;
                n = az - n;
                e = (int)(n * 0.16666667f);
                v.setPadding(e, 10, e, 10);
                n = tpe.bf(l.g.getResources().getDisplayMetrics(), n);
                l.M = (l.g != null && (n <= 0 || n >= 300));
                boolean o2 = b5;
                if (n > 450) {
                    o2 = true;
                }
                l.O = o2;
                final b d2 = l.D;
                final boolean b6 = o2 ^ true;
                d2.q = b6;
                d2.n = b6;
                return;
            }
            case 11: {
                final Object a4 = this.a;
                e = Math.abs(e - o);
                if (Math.abs(n3 - n5) != e) {
                    final MainAppEngagementPanelDataProvider mainAppEngagementPanelDataProvider = (MainAppEngagementPanelDataProvider)a4;
                    final alxt c2 = mainAppEngagementPanelDataProvider.c;
                    if (c2 == null || e != c2.c) {
                        final ahaz d3 = mainAppEngagementPanelDataProvider.d;
                        final float c3 = (float)tpe.bf(mainAppEngagementPanelDataProvider.b, e);
                        d3.copyOnWrite();
                        final alxt alxt = (alxt)d3.instance;
                        final alxt a5 = alxt.a;
                        alxt.b |= 0x1;
                        alxt.c = c3;
                        mainAppEngagementPanelDataProvider.c = (alxt)mainAppEngagementPanelDataProvider.d.build();
                        mainAppEngagementPanelDataProvider.a.b("/youtube/app/engagement_panel", ((agzk)mainAppEngagementPanelDataProvider.c).toByteArray());
                    }
                }
                n = Math.abs(az - n);
                if (Math.abs(n4 - n2) != n) {
                    final MainAppEngagementPanelDataProvider mainAppEngagementPanelDataProvider2 = (MainAppEngagementPanelDataProvider)a4;
                    final alxt c4 = mainAppEngagementPanelDataProvider2.c;
                    if (c4 == null || n != c4.d) {
                        final ahaz d4 = mainAppEngagementPanelDataProvider2.d;
                        final float d5 = (float)tpe.bf(mainAppEngagementPanelDataProvider2.b, n);
                        d4.copyOnWrite();
                        final alxt alxt2 = (alxt)d4.instance;
                        final alxt a6 = alxt.a;
                        alxt2.b |= 0x2;
                        alxt2.d = d5;
                        mainAppEngagementPanelDataProvider2.c = (alxt)mainAppEngagementPanelDataProvider2.d.build();
                        mainAppEngagementPanelDataProvider2.a.b("/youtube/app/engagement_panel", ((agzk)mainAppEngagementPanelDataProvider2.c).toByteArray());
                    }
                }
                return;
            }
            case 10: {
                final Object a7 = this.a;
                n = o - e;
                if (n == n5 - n3) {
                    return;
                }
                ((gbc)((kvw)a7).c.a()).m(fxz.g, n);
                return;
            }
            case 9: {
                ((kpm)this.a).f();
                return;
            }
            case 8: {
                final Object a8 = this.a;
                if (n == n2 && e == n3 && az == n4 && o == n5) {
                    return;
                }
                final kkx kkx = (kkx)a8;
                kkx.k(kkx.j, kkx.g);
                return;
            }
            case 7: {
                if (viewById.getParent() != null) {
                    if (((khm)this.a).a.getVisibility() == 0) {
                        final Layout layout = ((khm)this.a).a.getLayout();
                        if (layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(0) > 0) {
                            ((khm)this.a).a.setVisibility(8);
                        }
                    }
                }
                return;
            }
            case 6: {
                ((kee)this.a).r.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                final kee kee = (kee)this.a;
                kee.n(anb.f((View)kee.r) == 1 && b2);
                return;
            }
            case 5: {
                ((kee)this.a).l();
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
                view.setTouchDelegate((TouchDelegate)new kbu(rect, viewById));
                return;
            }
            case 3: {
                final jna jna = (jna)this.a;
                final DisplayMetrics displayMetrics = jna.f.getResources().getDisplayMetrics();
                n2 = tpe.aZ(displayMetrics, 270);
                az = tpe.aZ(displayMetrics, jna.h);
                n = tpe.aZ(displayMetrics, 8);
                viewById = viewById.findViewById(jna.g);
                viewById.getLayoutParams().height = n2 + (o - e - n - n2) % az;
                if (!viewById.isInLayout()) {
                    viewById.requestLayout();
                }
                return;
            }
            case 2: {
                o -= e;
                az -= n;
                if (az != n4 - n2 || o != n5 - n3) {
                    final jds jds = (jds)this.a;
                    n = jds.n;
                    if (n != az || jds.o != o) {
                        if (n > jds.o) {
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
                            jds.c.d = false;
                        }
                        jds.n = az;
                        jds.o = o;
                        jds.j = new Rect(0, 0, az, o);
                        final float n7 = az / (float)o;
                        jds.p = n7;
                        jds.d.h = n7;
                        jds.u();
                    }
                }
                return;
            }
            case 1: {
                final jbt jbt = (jbt)this.a;
                if (e != jbt.e) {
                    jbt.e = e;
                    if (jbt.d) {
                        jbt.f();
                    }
                }
                return;
            }
            case 0: {
                final Object a9 = this.a;
                final boolean i = o - e > az - n && b3;
                final jcz jcz = (jcz)a9;
                jcz.i = i;
                jcz.c();
            }
        }
    }
}
