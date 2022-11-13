import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnClickListener;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.c;
import android.widget.ImageView;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcl implements View$OnLayoutChangeListener
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public jcl(final ahyz b, final ImageView a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jcl(final c b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jcl(final jcn a, final abig b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jcl(final jfx b, final View$OnClickListener a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jcl(final jgb b, final View$OnClickListener a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jcl(final koq b, final bu a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jcl(final wfg b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void onLayoutChange(final View view, int bf, final int n, final int n2, final int n3, int n4, final int n5, final int n6, final int n7) {
        n4 = this.c;
        final boolean b = true;
        switch (n4) {
            default: {
                final Object b2 = this.b;
                final Object a = this.a;
                final wfg wfg = (wfg)b2;
                if (wfg.c.isShowing() && wfg.d != null) {
                    final int[] array = new int[2];
                    ((View)a).getLocationOnScreen(array);
                    bf = array[1];
                    wfg.d.a(bf);
                    return;
                }
                break;
            }
            case 6: {
                final Object b3 = this.b;
                final Object a2 = this.a;
                n4 = stv.bB;
                aotp aotp;
                if ((aotp = ((ahyz)b3).b) == null) {
                    aotp = aotp.a;
                }
                tpe.aF((View)a2, tpe.aA(n2 - bf - (int)(aald.I(aotp) * (n3 - n))), (Class)ViewGroup$MarginLayoutParams.class);
                return;
            }
            case 5: {
                ((View)this.a).removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                ((c)this.b).b.H(3);
                return;
            }
            case 4: {
                final Object b4 = this.b;
                bf = tpe.bf(((bu)this.a).getResources().getDisplayMetrics(), Math.abs(n2 - bf));
                final koq koq = (koq)b4;
                final boolean j = koq.j;
                int i;
                if (bf >= 350) {
                    i = 1;
                }
                else {
                    i = 0;
                }
                if ((j ? 1 : 0) == i) {
                    return;
                }
                koq.j = (i != 0);
                final TextView e = koq.e;
                tpe.v((View)e, i != 0 && !TextUtils.isEmpty(e.getText()) && b);
                return;
            }
            case 3: {
                final Object b5 = this.b;
                final Object a3 = this.a;
                final jgb jgb = (jgb)b5;
                final fyv d = jgb.d;
                if (d != null) {
                    if (d.d()) {
                        if (!jgb.f.hasOnClickListeners()) {
                            jgb.f.setOnClickListener((View$OnClickListener)a3);
                            tpe.r((View)jgb.f, (Drawable)null);
                            jgb.f.setClickable(true);
                        }
                    }
                    else if (jgb.f.hasOnClickListeners()) {
                        jgb.f.setOnClickListener((View$OnClickListener)null);
                        jgb.f.setBackground((Drawable)null);
                        jgb.f.setClickable(false);
                    }
                }
                return;
            }
            case 2: {
                final Object b6 = this.b;
                final Object a4 = this.a;
                final jfx jfx = (jfx)b6;
                if (jfx.d.d()) {
                    if (!jfx.f.hasOnClickListeners()) {
                        jfx.f.setOnClickListener((View$OnClickListener)a4);
                        tpe.r((View)jfx.f, (Drawable)null);
                        jfx.f.setClickable(true);
                    }
                }
                else if (jfx.f.hasOnClickListeners()) {
                    jfx.f.setOnClickListener((View$OnClickListener)null);
                    jfx.f.setBackground((Drawable)null);
                    jfx.f.setClickable(false);
                }
                return;
            }
            case 1: {
                ((jcn)this.a).e((abig)this.b);
                return;
            }
            case 0: {
                ((jcn)this.a).e((abig)this.b);
                break;
            }
        }
    }
}
