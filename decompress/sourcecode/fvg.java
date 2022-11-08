import android.text.Spanned;
import android.text.TextUtils;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvg
{
    public int a;
    private final boolean b;
    private final TextView c;
    private final Resources d;
    private final Context e;
    
    public fvg(final TextView c, final boolean b) {
        this.c = c;
        this.b = b;
        this.d = c.getResources();
        this.e = c.getContext();
    }
    
    private final int b() {
        final int a = this.a;
        if (a == 1) {
            final Context e = this.e;
            int n;
            if (!this.b) {
                n = 2130970904;
            }
            else {
                n = 2130970885;
            }
            return tmy.cn(e, n);
        }
        if (a != 3) {
            final Context e2 = this.e;
            int n2;
            if (!this.b) {
                n2 = 2130970849;
            }
            else {
                n2 = 2130970922;
            }
            return tmy.cn(e2, n2);
        }
        return tmy.cn(this.e, 2130970884);
    }
    
    private static boolean c(final aokb aokb) {
        final int az = aqql.aZ(aokb.v);
        if (az != 0) {
            if (az == 2) {
                return true;
            }
        }
        return false;
    }
    
    private static int d(final aokb aokb) {
        final int d = aokb.d;
        int ay;
        final int n = ay = 1;
        if (d == 19) {
            ay = aqql.aY(((aokc)aokb.e).b);
            if (ay == 0) {
                ay = n;
            }
        }
        return ay;
    }
    
    final void a(final aokb aokb) {
        final TextView c = this.c;
        final int d = aokb.d;
        int n = 0;
        Label_0183: {
            if (d != 35 || !((aokd)aokb.e).e) {
                if (c(aokb)) {
                    akbf akbf;
                    if ((akbf = aokb.w) == null) {
                        akbf = akbf.a;
                    }
                    akbe akbe;
                    if ((akbe = akbe.b(akbf.c)) == null) {
                        akbe = akbe.a;
                    }
                    if (akbe == akbe.X) {
                        final int a = this.a;
                        if (a != 1 && a != 3) {
                            if (this.b) {
                                n = 2131233320;
                                break Label_0183;
                            }
                            n = 2131233318;
                            break Label_0183;
                        }
                    }
                }
                else if (d != 19 || !((aokc)aokb.e).c) {
                    final int a2 = this.a;
                    if (a2 != 1 && a2 != 3) {
                        if (this.b) {
                            n = 2131233319;
                            break Label_0183;
                        }
                        n = 2131233317;
                        break Label_0183;
                    }
                }
            }
            n = 0;
        }
        api.i(c, n, 0);
        final TextView c2 = this.c;
        float alpha;
        if (!aokb.n) {
            alpha = 0.5f;
        }
        else {
            alpha = 1.0f;
        }
        c2.setAlpha(alpha);
        this.c.setEnabled(aokb.n);
        final TextView c3 = this.c;
        int textColor = 0;
        Label_0586: {
            if (aokb.d == 35) {
                aoqe aoqe;
                if (this.b) {
                    if ((aoqe = ((aokd)aokb.e).d) == null) {
                        aoqe = aoqe.a;
                    }
                }
                else if ((aoqe = ((aokd)aokb.e).c) == null) {
                    aoqe = aoqe.a;
                }
                final Context e = this.e;
                aoqb aoqb;
                if ((aoqb = aoqb.b(aoqe.c)) == null) {
                    aoqb = aoqb.a;
                }
                textColor = actf.a(e, aoqb, 0);
            }
            else if (c(aokb)) {
                final int a3 = this.a;
                int n2 = 2130970885;
                if (a3 != 1) {
                    if (a3 != 3) {
                        final Context e2 = this.e;
                        int n3;
                        if (!this.b) {
                            n3 = 2130970852;
                        }
                        else {
                            n3 = 2130970922;
                        }
                        textColor = tmy.cn(e2, n3);
                    }
                    else {
                        textColor = tmy.cn(this.e, 2130970885);
                    }
                }
                else {
                    final Context e3 = this.e;
                    if (!this.b) {
                        n2 = 2130970904;
                    }
                    textColor = tmy.cn(e3, n2);
                }
            }
            else {
                final int a4 = this.a;
                if (a4 != 3) {
                    if (a4 != 1) {
                        if (!this.b) {
                            int d2 = d(aokb);
                            if (this.b) {
                                if (d2 == 11) {
                                    textColor = tmy.cn(this.e, 2130970926);
                                    break Label_0586;
                                }
                                textColor = this.b();
                                break Label_0586;
                            }
                            else {
                                if (--d2 == 5) {
                                    textColor = tmy.cn(this.e, 2130970940);
                                    break Label_0586;
                                }
                                if (d2 == 6) {
                                    textColor = tmy.cn(this.e, 2130970903);
                                    break Label_0586;
                                }
                                if (d2 != 10) {
                                    textColor = this.b();
                                    break Label_0586;
                                }
                                textColor = tmy.cn(this.e, 2130970849);
                                break Label_0586;
                            }
                        }
                    }
                }
                textColor = this.b();
            }
        }
        c3.setTextColor(textColor);
        abyk abyk;
        if (this.a == 1) {
            abyk = abyk.g;
        }
        else {
            final int n4 = d(aokb) - 1;
            if (n4 != 5 && n4 != 6 && n4 != 10) {
                abyk = abyk.a;
            }
            else {
                abyk = abyk.g;
            }
        }
        this.c.setTypeface(abyk.a(this.e));
        final int d3 = d(aokb);
        if (this.a == 2 && d3 == 11) {
            this.c.setTextSize(2, 16.0f);
        }
        final boolean b = this.b;
        final ajsq ajsq = null;
        ajsq ajsq2 = null;
        Spanned text;
        if (b) {
            if ((aokb.b & 0x4) != 0x0 && (ajsq2 = aokb.g) == null) {
                ajsq2 = ajsq.a;
            }
            text = abyh.b(ajsq2);
        }
        else {
            ajsq ajsq3 = ajsq;
            if ((aokb.b & 0x8) != 0x0 && (ajsq3 = aokb.h) == null) {
                ajsq3 = ajsq.a;
            }
            text = abyh.b(ajsq3);
        }
        if (!TextUtils.isEmpty((CharSequence)text)) {
            this.c.setText((CharSequence)text);
        }
        else {
            final TextView c4 = this.c;
            final Resources d4 = this.d;
            int n5;
            if (!this.b) {
                n5 = 2132019894;
            }
            else {
                n5 = 2132019895;
            }
            c4.setText(d4.getText(n5));
        }
        ahgn ahgn;
        if (this.b) {
            if ((ahgn = aokb.C) == null) {
                ahgn = ahgn.a;
            }
        }
        else if ((ahgn = aokb.B) == null) {
            ahgn = ahgn.a;
        }
        ahgm ahgm;
        if ((ahgm = ahgn.c) == null) {
            ahgm = ahgm.a;
        }
        if (!ahgm.c.isEmpty()) {
            this.c.setContentDescription((CharSequence)ahgm.c);
            return;
        }
        final TextView c5 = this.c;
        final Resources d5 = this.d;
        int n6;
        if (!this.b) {
            n6 = 2132017227;
        }
        else {
            n6 = 2132017228;
        }
        c5.setContentDescription(d5.getText(n6));
    }
}
