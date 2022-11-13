import android.text.Spanned;
import android.text.TextUtils;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvo
{
    public int a;
    private final boolean b;
    private final TextView c;
    private final Resources d;
    private final Context e;
    
    public fvo(final TextView c, final boolean b) {
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
            return tpe.cr(e, n);
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
            return tpe.cr(e2, n2);
        }
        return tpe.cr(this.e, 2130970884);
    }
    
    private static boolean c(final aome aome) {
        final int ba = aqsx.ba(aome.v);
        if (ba != 0) {
            if (ba == 2) {
                return true;
            }
        }
        return false;
    }
    
    private static int d(final aome aome) {
        final int d = aome.d;
        int az;
        final int n = az = 1;
        if (d == 19) {
            az = aqsx.aZ(((aomf)aome.e).b);
            if (az == 0) {
                az = n;
            }
        }
        return az;
    }
    
    final void a(final aome aome) {
        final TextView c = this.c;
        final int d = aome.d;
        int n = 0;
        Label_0184: {
            if (d != 35 || !((aomg)aome.e).e) {
                if (c(aome)) {
                    akdi akdi;
                    if ((akdi = aome.w) == null) {
                        akdi = akdi.a;
                    }
                    akdh akdh;
                    if ((akdh = akdh.b(akdi.c)) == null) {
                        akdh = akdh.a;
                    }
                    if (akdh == akdh.X) {
                        final int a = this.a;
                        if (a != 1 && a != 3) {
                            if (this.b) {
                                n = 2131233320;
                                break Label_0184;
                            }
                            n = 2131233318;
                            break Label_0184;
                        }
                    }
                }
                else if (d != 19 || !((aomf)aome.e).c) {
                    final int a2 = this.a;
                    if (a2 != 1 && a2 != 3) {
                        if (this.b) {
                            n = 2131233319;
                            break Label_0184;
                        }
                        n = 2131233317;
                        break Label_0184;
                    }
                }
            }
            n = 0;
        }
        apj.i(c, n, 0);
        final TextView c2 = this.c;
        float alpha;
        if (!aome.n) {
            alpha = 0.5f;
        }
        else {
            alpha = 1.0f;
        }
        c2.setAlpha(alpha);
        this.c.setEnabled(aome.n);
        final TextView c3 = this.c;
        int textColor = 0;
        Label_0586: {
            if (aome.d == 35) {
                aosh aosh;
                if (this.b) {
                    if ((aosh = ((aomg)aome.e).d) == null) {
                        aosh = aosh.a;
                    }
                }
                else if ((aosh = ((aomg)aome.e).c) == null) {
                    aosh = aosh.a;
                }
                final Context e = this.e;
                aose aose;
                if ((aose = aose.b(aosh.c)) == null) {
                    aose = aose.a;
                }
                textColor = acvj.a(e, aose, 0);
            }
            else if (c(aome)) {
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
                        textColor = tpe.cr(e2, n3);
                    }
                    else {
                        textColor = tpe.cr(this.e, 2130970885);
                    }
                }
                else {
                    final Context e3 = this.e;
                    if (!this.b) {
                        n2 = 2130970904;
                    }
                    textColor = tpe.cr(e3, n2);
                }
            }
            else {
                final int a4 = this.a;
                if (a4 != 3) {
                    if (a4 != 1) {
                        if (!this.b) {
                            int d2 = d(aome);
                            if (this.b) {
                                if (d2 == 11) {
                                    textColor = tpe.cr(this.e, 2130970926);
                                    break Label_0586;
                                }
                                textColor = this.b();
                                break Label_0586;
                            }
                            else {
                                if (--d2 == 5) {
                                    textColor = tpe.cr(this.e, 2130970940);
                                    break Label_0586;
                                }
                                if (d2 == 6) {
                                    textColor = tpe.cr(this.e, 2130970903);
                                    break Label_0586;
                                }
                                if (d2 != 10) {
                                    textColor = this.b();
                                    break Label_0586;
                                }
                                textColor = tpe.cr(this.e, 2130970849);
                                break Label_0586;
                            }
                        }
                    }
                }
                textColor = this.b();
            }
        }
        c3.setTextColor(textColor);
        acan acan;
        if (this.a == 1) {
            acan = acan.g;
        }
        else {
            final int n4 = d(aome) - 1;
            if (n4 != 5 && n4 != 6 && n4 != 10) {
                acan = acan.a;
            }
            else {
                acan = acan.g;
            }
        }
        this.c.setTypeface(acan.a(this.e));
        final int d3 = d(aome);
        if (this.a == 2 && d3 == 11) {
            this.c.setTextSize(2, 16.0f);
        }
        final boolean b = this.b;
        ajut ajut = null;
        final ajut ajut2 = null;
        Spanned text;
        if (b) {
            ajut ajut3 = ajut2;
            if ((aome.b & 0x4) != 0x0 && (ajut3 = aome.g) == null) {
                ajut3 = ajut.a;
            }
            text = acak.b(ajut3);
        }
        else {
            if ((aome.b & 0x8) != 0x0 && (ajut = aome.h) == null) {
                ajut = ajut.a;
            }
            text = acak.b(ajut);
        }
        if (!TextUtils.isEmpty((CharSequence)text)) {
            this.c.setText((CharSequence)text);
        }
        else {
            final TextView c4 = this.c;
            final Resources d4 = this.d;
            int n5;
            if (!this.b) {
                n5 = 2132019895;
            }
            else {
                n5 = 2132019896;
            }
            c4.setText(d4.getText(n5));
        }
        ahil ahil;
        if (this.b) {
            if ((ahil = aome.C) == null) {
                ahil = ahil.a;
            }
        }
        else if ((ahil = aome.B) == null) {
            ahil = ahil.a;
        }
        ahik ahik;
        if ((ahik = ahil.c) == null) {
            ahik = ahik.a;
        }
        if (!ahik.c.isEmpty()) {
            this.c.setContentDescription((CharSequence)ahik.c);
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
