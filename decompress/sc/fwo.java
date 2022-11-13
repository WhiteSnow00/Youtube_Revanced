import java.util.concurrent.Executor;
import j$.util.function.Consumer$_CC;
import android.view.Window;
import android.content.Context;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.PopupWindow;
import android.view.View$MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.View;
import android.view.ViewGroup;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwo implements Consumer
{
    public final fwp a;
    public final aomw b;
    public final wyw c;
    
    public fwo(final fwp a, final aomw b, final wyw c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void accept(final Object o) {
        final fwp a = this.a;
        final aomw b = this.b;
        final wyw c = this.c;
        final aomx aomx = (aomx)o;
        if (a.a.p()) {
            final int d = aomx.d;
            a.f(d);
            final zst c2 = a.c;
            final TextView b2 = a.b;
            final bs bs = new bs(a, 7);
            final int db = aqsx.db(b.h);
            if (db != 0 && db == 3) {
                c2.a();
                final Context a2 = c2.a;
                Object decorView = null;
                final ViewGroup viewGroup = (ViewGroup)View.inflate(a2, 2131624918, (ViewGroup)null);
                int n = -1;
                for (int i = 0; i < b.c.size(); ++i) {
                    final aomx aomx2 = (aomx)b.c.get(i);
                    anuv anuv;
                    if ((anuv = aomx2.f) == null) {
                        anuv = anuv.a;
                    }
                    if (((ahbc)anuv).ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                        anuv anuv2;
                        if ((anuv2 = aomx2.f) == null) {
                            anuv2 = anuv.a;
                        }
                        final aicz aicz = (aicz)((ahbc)anuv2).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                        final View inflate = View.inflate(c2.a, 2131624919, (ViewGroup)decorView);
                        final boolean b3 = aomx2.c == d;
                        final acsx h = ((aujg)c2.d).H(inflate);
                        h.b(aicz, c);
                        h.d = (acsv)new jfd(c, 4);
                        h.c = (acsw)new zss(c2, inflate, viewGroup, b3, (ako)bs, aomx2);
                        final TextView textView = (TextView)inflate.findViewById(2131431953);
                        ajut ajut;
                        if ((aicz.b & 0x200) != 0x0) {
                            if ((ajut = aicz.i) == null) {
                                ajut = ajut.a;
                            }
                        }
                        else {
                            ajut = null;
                        }
                        textView.setText((CharSequence)acak.b(ajut));
                        akdi akdi;
                        if ((akdi = aicz.g) == null) {
                            akdi = akdi.a;
                        }
                        if ((akdi.b & 0x1) != 0x0) {
                            final Object c3 = c2.c;
                            akdi akdi2;
                            if ((akdi2 = aicz.g) == null) {
                                akdi2 = akdi.a;
                            }
                            akdh akdh;
                            if ((akdh = akdh.b(akdi2.c)) == null) {
                                akdh = akdh.a;
                            }
                            final int a3 = ((acpk)c3).a(akdh);
                            if (a3 != 0) {
                                ((ImageView)inflate.findViewById(2131429270)).setImageResource(a3);
                            }
                        }
                        if (((vai)c2.h).aU()) {
                            if (b3) {
                                n = viewGroup.getChildCount();
                            }
                            c2.b(inflate, b3);
                        }
                        else if (b3) {
                            n = viewGroup.getChildCount();
                            c2.b(inflate, true);
                        }
                        viewGroup.addView(inflate);
                        inflate.setTag((Object)aomx2.c);
                        final wyt wyt = new wyt(aicz.w);
                        decorView = null;
                        c.t((wzz)wyt, (alhi)null);
                    }
                }
                if (n == -1) {
                    ttr.b("Could not find the index of the selected state in the model!");
                    return;
                }
                viewGroup.measure(View$MeasureSpec.makeMeasureSpec(tpe.bd(c2.a), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(tpe.bb(c2.a), Integer.MIN_VALUE));
                int n2 = 0;
                for (int j = 0; j < n; ++j) {
                    n2 += viewGroup.getChildAt(j).getMeasuredHeight();
                }
                c2.g = new PopupWindow((View)viewGroup, -2, -2, true);
                ((PopupWindow)c2.g).setElevation((float)tpe.aZ(c2.a.getResources().getDisplayMetrics(), 4));
                final Object g = c2.g;
                final Context a4 = c2.a;
                int n3;
                if (!((vai)c2.h).aU()) {
                    n3 = 2130970845;
                }
                else {
                    n3 = 2130970868;
                }
                ((PopupWindow)g).setBackgroundDrawable((Drawable)new ColorDrawable(tpe.cr(a4, n3)));
                ((PopupWindow)c2.g).setOutsideTouchable(true);
                ((PopupWindow)c2.g).setAnimationStyle(16973826);
                final int[] array = new int[2];
                ((View)b2).getLocationOnScreen(array);
                final Point point = new Point(array[0], array[1]);
                final int x = point.x;
                final int measuredWidth = viewGroup.getMeasuredWidth();
                final int width = ((View)b2).getWidth();
                final int paddingEnd = ((View)b2).getPaddingEnd();
                final int paddingEnd2 = viewGroup.getChildAt(0).getPaddingEnd();
                final int y = point.y;
                final int height = ((View)b2).getHeight();
                final int measuredHeight = viewGroup.getChildAt(0).getMeasuredHeight();
                final int measuredHeight2 = viewGroup.getMeasuredHeight();
                final yvu yvu = new yvu(c2, (View)b2, x - measuredWidth + width - paddingEnd + paddingEnd2, 2);
                final Context a5 = c2.a;
                if (a5 instanceof Activity) {
                    final Window window = ((Activity)a5).getWindow();
                    if (window != null) {
                        decorView = window.getDecorView();
                    }
                }
                final int n4 = y - n2 + (height - measuredHeight) / 2;
                if (decorView == null) {
                    ((Executor)c2.f).execute((Runnable)new wip((ako)yvu, n4, 20));
                    return;
                }
                ((Executor)c2.e).execute((Runnable)new aava(c2, (View)decorView, n4, measuredHeight2, (ako)yvu, 1));
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        return Consumer$_CC.$default$andThen((Consumer)this, consumer);
    }
}
