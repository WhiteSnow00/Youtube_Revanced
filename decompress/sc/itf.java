import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.Pair;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.apps.youtube.app.player.overlay.ChapterSeekOverlayController;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemControllerImpl;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itf implements asjm
{
    public final Object a;
    private final int b;
    
    public itf(final View a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final SingleLoopMenuItemControllerImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final ChapterSeekOverlayController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final itj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final itr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final itu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final itv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final ity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final iup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public itf(final iuu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        final boolean b2 = true;
        int f = 1;
        boolean b3 = true;
        final int n = 0;
        final int n2 = 0;
        switch (b) {
            default: {
                ((iuu)this.a).pa((boolean)o);
                return;
            }
            case 19: {
                ((iuu)this.a).w((boolean)o);
                return;
            }
            case 18: {
                ((iuu)this.a).t((boolean)o);
                return;
            }
            case 17: {
                ((iuu)this.a).i((boolean)o);
                return;
            }
            case 16: {
                ((iuu)this.a).oZ((ControlsState)o);
                return;
            }
            case 15: {
                ((iuu)this.a).j((ControlsOverlayStyle)o);
                return;
            }
            case 14: {
                final Object a = this.a;
                final Pair pair = (Pair)o;
                if (pair.first) {
                    ((iuu)a).y((boolean)pair.second);
                    return;
                }
                ((iuu)a).oY((boolean)pair.second);
                return;
            }
            case 13: {
                final Object a2 = this.a;
                final aanw aanw = (aanw)o;
                if (aanw.c()) {
                    return;
                }
                ((ChapterSeekOverlayController)a2).a = aanw.a();
                return;
            }
            case 12: {
                ((View)this.a).setAlpha((float)o);
                return;
            }
            case 11: {
                final Object a3 = this.a;
                final Integer n3 = (Integer)o;
                final iup iup = (iup)a3;
                final View a4 = iup.a;
                a4.getClass();
                anb.ab(a4, anb.j(a4), iup.a.getPaddingTop(), n3, iup.a.getPaddingBottom());
                return;
            }
            case 10: {
                final Object a5 = this.a;
                final Integer n4 = (Integer)o;
                final iup iup2 = (iup)a5;
                iup2.b.getClass();
                final View a6 = iup2.a;
                a6.getClass();
                tpe.aF(a6, tpe.aq((int)n4), (Class)ViewGroup$MarginLayoutParams.class);
                iup2.g();
                iup2.b.requestLayout();
                return;
            }
            case 9: {
                final Object a7 = this.a;
                if (o) {
                    ((iup)a7).q.b();
                }
                return;
            }
            case 8: {
                final Object a8 = this.a;
                final boolean booleanValue = (boolean)o;
                final iup iup3 = (iup)a8;
                iup3.m = booleanValue;
                iup3.c();
                return;
            }
            case 7: {
                final Object a9 = this.a;
                final boolean booleanValue2 = (boolean)o;
                final ity ity = (ity)a9;
                ity.f = booleanValue2;
                ity.e();
                return;
            }
            case 6: {
                final Object a10 = this.a;
                final boolean booleanValue3 = (boolean)o;
                final ity ity2 = (ity)a10;
                ity2.e = booleanValue3;
                ity2.e();
                return;
            }
            case 5: {
                final Object a11 = this.a;
                final Rect rect = (Rect)o;
                final itv itv = (itv)a11;
                if (itv.a.equals((Object)rect)) {
                    return;
                }
                itv.a.set(rect);
                if (anb.f((View)a11) != 1) {
                    b3 = false;
                }
                int left;
                if (b3) {
                    left = itv.a.left;
                }
                else {
                    left = 0;
                }
                int right;
                if (b3) {
                    right = n2;
                }
                else {
                    right = itv.a.right;
                }
                ((uys)a11).b.setPadding(left, itv.a.top, right, itv.a.bottom);
                return;
            }
            case 4: {
                final Object a12 = this.a;
                final jbg jbg = (jbg)o;
                ((itu)a12).c(false);
                return;
            }
            case 3: {
                final Object a13 = this.a;
                ((itr)a13).b = (boolean)o;
                ((abhs)a13).k();
                return;
            }
            case 2: {
                final Object a14 = this.a;
                final aaly aaly = (aaly)o;
                final int a15 = aaly.a();
                final apoc b4 = aaly.b();
                final itj itj = (itj)a14;
                itj.d = b4;
                if (itj.e != null) {
                    int i = 0;
                    while (true) {
                        while (i < itj.f().length) {
                            if (itj.f()[i].a == aaly.a()) {
                                if (i >= 0) {
                                    itj.o(itj.f(), i, a15 == -2 && b2);
                                }
                                return;
                            }
                            else {
                                ++i;
                            }
                        }
                        i = -1;
                        continue;
                    }
                }
                return;
            }
            case 1: {
                final Object a16 = this.a;
                final aani aani = (aani)o;
                final SingleLoopMenuItemControllerImpl singleLoopMenuItemControllerImpl = (SingleLoopMenuItemControllerImpl)a16;
                final boolean f2 = singleLoopMenuItemControllerImpl.f;
                final WatchNextResponseModel a17 = aani.a();
                if (a17 == null) {
                    singleLoopMenuItemControllerImpl.f = false;
                    f = n;
                }
                else {
                    final vgs h = a17.h;
                    if (h == null || !h.b()) {
                        f = 0;
                    }
                    singleLoopMenuItemControllerImpl.f = (f != 0);
                }
                if ((f2 ? 1 : 0) != f) {
                    singleLoopMenuItemControllerImpl.c.a("menu_item_single_video_playback_loop", (boolean)(f != 0));
                    final ist d = singleLoopMenuItemControllerImpl.d;
                    if (d != null) {
                        d.g(singleLoopMenuItemControllerImpl.f);
                        if (singleLoopMenuItemControllerImpl.d.g) {
                            singleLoopMenuItemControllerImpl.b.D((wzz)new wyt(xaa.c(123601)));
                            if (singleLoopMenuItemControllerImpl.g) {
                                singleLoopMenuItemControllerImpl.b.t((wzz)new wyt(xaa.c(123601)), (alhi)null);
                            }
                        }
                    }
                }
                return;
            }
            case 0: {
                ((SingleLoopMenuItemControllerImpl)this.a).h = ((aans)o).c();
            }
        }
    }
}
