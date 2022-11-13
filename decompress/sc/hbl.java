import android.text.Layout;
import java.util.Iterator;
import java.util.Set;
import android.widget.TextView;
import android.text.TextUtils;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.graphics.Rect;
import java.util.concurrent.FutureTask;
import com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.text.SpannableString;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.Map;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbl implements ViewTreeObserver$OnGlobalLayoutListener
{
    final Object a;
    final Object b;
    final Object c;
    private final int d;
    
    public hbl(final cbo a, final Map b, final Map c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public hbl(final YouTubeTextView c, final CharSequence b, final SpannableString a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hbl(final hbm c, final View a, final ucd b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hbl(final hfm c, final RecyclerView a, final aeea b, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hbl(final jyp a, final FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand b, final aezp c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public hbl(final ooj c, final FutureTask b, final RecyclerView a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        final int d = this.d;
        if (d == 0) {
            ((hbm)this.c).b.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            ((hbm)this.c).h = ((View)this.a).getMeasuredWidth();
            ((hbm)this.c).i = ((View)this.a).getMeasuredHeight();
            final hbm hbm = (hbm)this.c;
            hbm.f = hbm.c(hbm.b((View)hbm.b), hbm.b((View)this.a));
            final hbm hbm2 = (hbm)this.c;
            if (hbm2.h > 0 && hbm2.i > 0) {
                if (hbm2.f != null) {
                    if (!ucd.ad((ucd)this.b)) {
                        final ucd ucd = (ucd)this.b;
                        if (!ucd.o().h()) {
                            final hbm hbm3 = (hbm)this.c;
                            if (hbm3.e != null) {
                                hbm3.l.execute(aeun.h((Runnable)new gwk(hbm3, ucd, 10)));
                            }
                        }
                    }
                }
            }
            return;
        }
        int i = 0;
        int j = 0;
        if (d == 1) {
            ((cbo)this.a).n.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            final Object a = this.a;
            final Object b = this.b;
            final Object c = this.c;
            final cbo cbo = (cbo)a;
            final Set q = cbo.q;
            if (q != null) {
                if (cbo.r != null) {
                    final int n = q.size() - cbo.r.size();
                    final cbi animationListener = new cbi(cbo, 0);
                    final int firstVisiblePosition = cbo.n.getFirstVisiblePosition();
                    int n2 = 0;
                    while (i < cbo.n.getChildCount()) {
                        final View child = cbo.n.getChildAt(i);
                        final cct cct = (cct)cbo.o.getItem(firstVisiblePosition + i);
                        final Rect rect = ((Map<K, Rect>)b).get(cct);
                        final int top = child.getTop();
                        int top2;
                        if (rect != null) {
                            top2 = rect.top;
                        }
                        else {
                            top2 = cbo.x * n + top;
                        }
                        final AnimationSet set = new AnimationSet(true);
                        final Set q2 = cbo.q;
                        if (q2 != null && q2.contains(cct)) {
                            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                            ((Animation)alphaAnimation).setDuration((long)cbo.Q);
                            set.addAnimation((Animation)alphaAnimation);
                            top2 = top;
                        }
                        final TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float)(top2 - top), 0.0f);
                        ((Animation)translateAnimation).setDuration((long)cbo.P);
                        set.addAnimation((Animation)translateAnimation);
                        set.setFillAfter(true);
                        set.setFillEnabled(true);
                        set.setInterpolator(cbo.S);
                        if (n2 == 0) {
                            set.setAnimationListener((Animation$AnimationListener)animationListener);
                        }
                        child.clearAnimation();
                        child.startAnimation((Animation)set);
                        ((Map<K, Rect>)b).remove(cct);
                        ((Map)c).remove(cct);
                        ++i;
                        n2 = 1;
                    }
                    for (final Map.Entry<cct, V> entry : ((Map)c).entrySet()) {
                        final cct cct2 = entry.getKey();
                        final BitmapDrawable bitmapDrawable = (BitmapDrawable)entry.getValue();
                        final Rect rect2 = ((Map<K, Rect>)b).get(cct2);
                        cbs cbs;
                        if (cbo.r.contains(cct2)) {
                            cbs = new cbs(bitmapDrawable, rect2);
                            cbs.h = 1.0f;
                            cbs.i = 0.0f;
                            cbs.e = cbo.R;
                            cbs.d = cbo.S;
                        }
                        else {
                            final int x = cbo.x;
                            cbs = new cbs(bitmapDrawable, rect2);
                            cbs.g = x * n;
                            cbs.e = cbo.P;
                            cbs.d = cbo.S;
                            cbs.m = new dhb(cbo, cct2);
                            cbo.s.add(cct2);
                        }
                        cbo.n.a.add(cbs);
                    }
                }
            }
            return;
        }
        if (d != 2) {
            if (d == 3) {
                final int d2 = ((FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand)this.b).d;
                if (d2 >= 0 && d2 <= ((tfz)((jyp)this.a).a).size()) {
                    final aezp aezp = (aezp)this.c;
                    if (aezp.h()) {
                        final aikr aikr = (aikr)aezp.c();
                        ((tfz)((jyp)this.a).a).add(d2, (Object)aikr);
                        final jyp jyp = (jyp)this.a;
                        jyp.e = true;
                        if (jyp.j.h() && d2 <= (int)((jyp)this.a).j.c()) {
                            final jyp jyp2 = (jyp)this.a;
                            jyp2.j = aezp.k((Object)((int)jyp2.j.c() + 1));
                        }
                        if (((jyp)this.a).f.h() && d2 <= (int)((jyp)this.a).f.c()) {
                            final jyp jyp3 = (jyp)this.a;
                            jyp3.f = aezp.k((Object)((int)jyp3.f.c() + 1));
                        }
                        if (((FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand)this.b).f) {
                            final jyp jyp4 = (jyp)this.a;
                            final aezp f = jyp4.f;
                            jyp4.f = aezp.k((Object)d2);
                            if (f.h()) {
                                ((jyp)this.a).v((int)f.c(), false);
                            }
                            else if (((jyp)this.a).j.h()) {
                                final jyp jyp5 = (jyp)this.a;
                                jyp5.v((int)jyp5.j.c(), false);
                            }
                            ((jyp)this.a).v(d2, true);
                            final jyp jyp6 = (jyp)this.a;
                            final atjs k = jyp6.k;
                            if (k != null) {
                                final aezp f2 = jyp6.f;
                                final aezp d3 = jyp6.d;
                                k.tu((Object)jyj.e(f, f2, d3, d3));
                            }
                            final vcy b2 = ((jyp)this.a).b;
                            aiqj aiqj;
                            if ((aiqj = aikr.g) == null) {
                                aiqj = aiqj.a;
                            }
                            b2.c(aiqj, (Map)afev.m("sectionListController", ((jyp)this.a).l));
                        }
                        final FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand)this.b;
                        if ((filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.b & 0x20) != 0x0) {
                            final vcy b3 = ((jyp)this.a).b;
                            aiqj aiqj2;
                            if ((aiqj2 = filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.e) == null) {
                                aiqj2 = aiqj.a;
                            }
                            b3.a(aiqj2);
                        }
                    }
                }
                ((jyp)this.a).g.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                return;
            }
            if (d == 4) {
                if (((ooj)this.c).e()) {
                    if (!((FutureTask)this.b).isCancelled() && !((FutureTask)this.b).isDone()) {
                        ((FutureTask)this.b).run();
                    }
                    ((RecyclerView)this.a).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                }
                return;
            }
            ((YouTubeTextView)this.c).getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            final Object c2 = this.c;
            final Object b4 = this.b;
            final Object a2 = this.a;
            final YouTubeTextView youTubeTextView = (YouTubeTextView)c2;
            if (youTubeTextView.getLayout() == null) {
                return;
            }
            final int maxLines = youTubeTextView.getMaxLines();
            final String string = b4.toString();
            CharSequence concat = (CharSequence)b4;
            if (maxLines > 0) {
                final Layout b5 = youTubeTextView.b((CharSequence)string);
                concat = (CharSequence)b4;
                if (b5.getLineCount() > maxLines) {
                    final int lineEnd = b5.getLineEnd(maxLines - 1);
                    concat = (CharSequence)b4;
                    if (lineEnd < string.length()) {
                        String s;
                        for (s = string.substring(0, lineEnd).trim(); youTubeTextView.b(TextUtils.concat(new CharSequence[] { s, (CharSequence)a2 })).getLineCount() > maxLines; s = s.substring(0, s.length() - 1)) {}
                        concat = TextUtils.concat(new CharSequence[] { s, (CharSequence)a2 });
                    }
                }
            }
            tpe.t((TextView)c2, concat);
        }
        else {
            ((RecyclerView)this.a).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            if (((RecyclerView)this.a).getChildCount() == 0) {
                ttr.b("Thumbnail list child views are not drawn when onGlobalLayout is invoked");
                return;
            }
            ((hfm)this.c).e = (((RecyclerView)this.a).getWidth() - ((RecyclerView)this.a).getChildAt(0).getWidth()) / 2;
            if (this.b != null) {
                while (j < ((RecyclerView)this.a).getChildCount()) {
                    final twx cg = ((aeea)this.b).cG(xaa.c(128916));
                    cg.k(true);
                    cg.c();
                    ++j;
                }
            }
        }
    }
}
