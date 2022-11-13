import java.util.Iterator;
import android.view.ViewParent;
import android.text.Spanned;
import android.text.Layout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View$OnClickListener;
import java.util.List;
import android.content.res.Resources;
import android.text.TextUtils;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class haq implements ViewTreeObserver$OnGlobalLayoutListener
{
    final Object a;
    final Object b;
    private final int c;
    
    public haq(final TextView b, final TextView a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final YouTubeTextView b, final SpannableString a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final fto b, final GradientDrawable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final har b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final hrk b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final jat a, final ahnw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public haq(final jko a, final apkp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public haq(final jyb b, final ViewTreeObserver a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final koh b, final View a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final ure b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final utz b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public haq(final wpu a, final acwr b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public haq(final xpy a, final acwr b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onGlobalLayout() {
        switch (this.c) {
            default: {
                final Rect rect = new Rect();
                ((xpy)this.a).r.getGlobalVisibleRect(rect);
                ((acwr)this.b).g(rect);
                ((xpy)this.a).r.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                return;
            }
            case 11: {
                final Rect rect2 = new Rect();
                ((wpu)this.a).n.getGlobalVisibleRect(rect2);
                ((acwr)this.b).g(rect2);
                ((wpu)this.a).a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                return;
            }
            case 10: {
                ((View)this.a).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                final int measuredHeight = ((View)this.a).getMeasuredHeight();
                final Object b = this.b;
                final utz utz = (utz)b;
                final float n = (float)utz.au;
                final float ar = utz.ar;
                final float as = utz.as;
                final BottomSheetBehavior a = ((adts)((bi)b).d).a();
                final utz utz2 = (utz)this.b;
                final float as2 = utz2.as;
                Label_0370: {
                    if (as2 > 0.0f && as2 < 1.0f) {
                        final int n2 = (int)(n * as);
                        if (measuredHeight > n2) {
                            a.E(as2);
                            a.H(6);
                            a.G(n2);
                            break Label_0370;
                        }
                    }
                    final float ar2 = utz2.ar;
                    if (ar2 > 0.0f && ar2 < 1.0f) {
                        final int n3 = (int)(ar * n);
                        if (measuredHeight < n3) {
                            a.E(ar2);
                            a.H(6);
                            a.G(n3);
                        }
                    }
                }
                ((View)this.a).setVisibility(0);
                return;
            }
            case 9: {
                if (((View)this.a).getWidth() > 0) {
                    ((View)this.a).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                    final ObjectAnimator setDuration = ObjectAnimator.ofInt((Object)((ure)this.b).h, "scrollX", new int[] { ((View)this.a).getLeft() - ((ure)this.b).b / 2 + ((View)this.a).getWidth() / 2 }).setDuration(225L);
                    setDuration.setInterpolator((TimeInterpolator)new ats());
                    setDuration.start();
                }
                return;
            }
            case 8: {
                ((YouTubeTextView)this.b).getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                final Object b2 = this.b;
                final Object a2 = this.a;
                final YouTubeTextView youTubeTextView = (YouTubeTextView)b2;
                if (youTubeTextView.getLayout() != null) {
                    final int height = youTubeTextView.getHeight();
                    final int scrollY = youTubeTextView.getScrollY();
                    final Layout layout = youTubeTextView.getLayout();
                    int i;
                    if (height <= youTubeTextView.getLineHeight() * youTubeTextView.getMaxLines()) {
                        i = layout.getLineForVertical(height + scrollY);
                    }
                    else {
                        i = youTubeTextView.getMaxLines() - 1;
                    }
                    int n4 = 0;
                    while (i >= 0) {
                        n4 += layout.getLineEnd(i) - layout.getLineStart(i);
                        --i;
                    }
                    if (n4 < youTubeTextView.getText().length()) {
                        final CharSequence text = youTubeTextView.getText();
                        final CharSequence subSequence = text.subSequence(0, n4);
                        final Rect rect3 = new Rect();
                        final TextView textView = (TextView)b2;
                        textView.getPaint().getTextBounds(a2.toString(), 0, ((CharSequence)a2).length(), rect3);
                        int width;
                        int width2;
                        int n5;
                        for (width = rect3.width(), width2 = 0, n5 = 0; width2 < width && n5 < subSequence.length(); width2 = rect3.width(), ++n5) {
                            textView.getPaint().getTextBounds(subSequence.toString(), subSequence.length() - n5, subSequence.length(), rect3);
                        }
                        youTubeTextView.setText(TextUtils.concat(new CharSequence[] { text.subSequence(0, n4 - (n5 - 1)), (CharSequence)a2 }));
                    }
                }
                return;
            }
            case 7: {
                ((ViewTreeObserver)this.a).removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                ((jyb)this.b).l();
                return;
            }
            case 6: {
                qdt.W(((koh)this.b).b, 0, 0, (int)((Resources)((koh)this.b).c).getDimension(2131166322), 0);
                ((View)this.a).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                return;
            }
            case 5: {
                final apkp apkp = (apkp)this.b;
                ajut ajut;
                if ((apkp.b & 0x8) != 0x0) {
                    if ((ajut = apkp.e) == null) {
                        ajut = ajut.a;
                    }
                }
                else {
                    ajut = null;
                }
                final Spanned b3 = acak.b(ajut);
                if (!TextUtils.isEmpty((CharSequence)b3)) {
                    final int lineCount = ((kds)this.a).j.getLineCount();
                    final jko jko = (jko)this.a;
                    jko.d.a((CharSequence)b3, 2131427696).setLines(jko.c - lineCount);
                }
                ((kds)this.a).i.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                return;
            }
            case 4: {
                ((jat)this.a).p.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                ((jat)this.a).e((ahnw)this.b);
                return;
            }
            case 3: {
                ((TextView)this.b).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                final Layout layout2 = ((TextView)this.b).getLayout();
                if (layout2 != null && layout2.getLineCount() != 0) {
                    if (layout2.getEllipsisCount(0) != 0) {
                        final String[] split = ((TextView)this.b).getText().toString().split(" \u2022 ");
                        if (split.length == 2) {
                            ((TextView)this.b).setText((CharSequence)split[0]);
                            tpe.t((TextView)this.a, (CharSequence)split[1]);
                            ((TextView)this.b).requestLayout();
                            ((TextView)this.a).requestLayout();
                        }
                    }
                }
                return;
            }
            case 2: {
                final Object b4 = this.b;
                final View view = (View)this.a;
                final ViewParent parent = view.getParent();
                final hrk hrk = (hrk)b4;
                final hrj e = hrk.e;
                if (parent == e) {
                    e.getViewTreeObserver().removeOnGlobalLayoutListener(hrk.g);
                    hrk.i = view.getWidth();
                    hrk.j = view.getHeight();
                    hrk.e.removeView(view);
                    for (final angw angw : hrk.f.b) {
                        if (!hrk.c(angw).isEmpty()) {
                            hrk.e(angw.f);
                            final Iterator<Object> iterator2 = ((List<Object>)angw.b).iterator();
                            while (iterator2.hasNext()) {
                                final View ag = vdh.aG(hrk.c, hrk.e.getMeasuredWidth(), hrk.e.getMeasuredHeight(), 0.5625f, (List)iterator2.next().b);
                                ag.setOnClickListener((View$OnClickListener)new gbw(hrk, angw, hrk.c(angw), 9));
                                if (((vai)hrk.k.b).l(45381627L).aM()) {
                                    ag.setBackgroundColor(1358888960);
                                }
                                ag.setContentDescription((CharSequence)angw.e);
                                hrk.e.addView(ag);
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                ((fto)this.b).d.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                final Object a3 = this.a;
                final fto fto = (fto)this.b;
                ((GradientDrawable)a3).setCornerRadius(fto.a * (fto.d.getHeight() / 2.0f));
                return;
            }
            case 0: {
                if (((View)this.a).getWidth() > 0) {
                    ((View)this.a).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                    final ObjectAnimator setDuration2 = ObjectAnimator.ofInt((Object)((har)this.b).b, "scrollX", new int[] { ((View)this.a).getLeft() - ((har)this.b).d / 2 + ((View)this.a).getWidth() / 2 }).setDuration(225L);
                    setDuration2.setInterpolator((TimeInterpolator)new ats());
                    setDuration2.start();
                }
            }
        }
    }
}
