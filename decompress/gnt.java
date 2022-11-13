import android.app.AlertDialog$Builder;
import java.util.Iterator;
import android.app.AlertDialog;
import android.view.View$OnClickListener;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.content.DialogInterface$OnClickListener;
import android.widget.TextView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnt implements vqf
{
    public final atke a;
    
    public gnt(final atke a) {
        this.a = a;
    }
    
    public final void a(final akoi akoi, final Object o) {
        final atke a = this.a;
        aopj a2 = null;
        Label_0119: {
            if (akoi.c.size() > 0) {
                akog akog;
                if ((akog = ((akof)akoi.c.get(0)).d) == null) {
                    akog = akog.a;
                }
                if (akog.b == 84469086) {
                    akog akog2;
                    if ((akog2 = ((akof)akoi.c.get(0)).d) == null) {
                        akog2 = akog.a;
                    }
                    if (akog2.b == 84469086) {
                        a2 = (aopj)akog2.c;
                        break Label_0119;
                    }
                    a2 = aopj.a;
                    break Label_0119;
                }
            }
            a2 = null;
        }
        if (a2 != null) {
            final jwk jwk = (jwk)a.a();
            final AlertDialog g = jwk.g;
            if (g == null || !g.isShowing()) {
                jwk.e = LayoutInflater.from(jwk.a).inflate(2131625431, (ViewGroup)null);
                jwk.f = (RadioGroup)jwk.e.findViewById(2131430197);
                for (final aopk aopk : a2.j) {
                    final RadioButton radioButton = new RadioButton(jwk.a);
                    final int b = aopk.b;
                    if (b == 84469192) {
                        radioButton.setTag((Object)aopk.c);
                        aopi a3;
                        if (aopk.b == 84469192) {
                            a3 = (aopi)aopk.c;
                        }
                        else {
                            a3 = aopi.a;
                        }
                        ajut ajut;
                        if ((a3.b & 0x2) != 0x0) {
                            aopi a4;
                            if (aopk.b == 84469192) {
                                a4 = (aopi)aopk.c;
                            }
                            else {
                                a4 = aopi.a;
                            }
                            if ((ajut = a4.d) == null) {
                                ajut = ajut.a;
                            }
                        }
                        else {
                            ajut = null;
                        }
                        radioButton.setText((CharSequence)acak.b(ajut));
                    }
                    else if (b == 131108496) {
                        radioButton.setTag((Object)aopk.c);
                        aopd a5;
                        if (aopk.b == 131108496) {
                            a5 = (aopd)aopk.c;
                        }
                        else {
                            a5 = aopd.a;
                        }
                        ajut ajut2;
                        if ((a5.b & 0x1) != 0x0) {
                            aopd a6;
                            if (aopk.b == 131108496) {
                                a6 = (aopd)aopk.c;
                            }
                            else {
                                a6 = aopd.a;
                            }
                            if ((ajut2 = a6.c) == null) {
                                ajut2 = ajut.a;
                            }
                        }
                        else {
                            ajut2 = null;
                        }
                        radioButton.setText((CharSequence)acak.b(ajut2));
                    }
                    final aghv aghv = (aghv)jwk.d.a();
                    aghv.c(radioButton, 2131169765, 2131169764);
                    aghv.b(radioButton);
                    jwk.f.addView((View)radioButton);
                }
                final TextView customTitle = (TextView)LayoutInflater.from(jwk.a).inflate(2131625432, (ViewGroup)null);
                ajut ajut3;
                if ((a2.b & 0x2) != 0x0) {
                    if ((ajut3 = a2.f) == null) {
                        ajut3 = ajut.a;
                    }
                }
                else {
                    ajut3 = null;
                }
                tpe.t(customTitle, (CharSequence)acak.b(ajut3));
                final AlertDialog$Builder setView = ((AlertDialog$Builder)jwk.h.al(jwk.a)).setCustomTitle((View)customTitle).setView(jwk.e);
                aida aida;
                if ((aida = a2.i) == null) {
                    aida = aida.a;
                }
                aicz aicz;
                if ((aicz = aida.c) == null) {
                    aicz = aicz.a;
                }
                ajut ajut4;
                if ((ajut4 = aicz.i) == null) {
                    ajut4 = ajut.a;
                }
                final AlertDialog$Builder setPositiveButton = setView.setPositiveButton((CharSequence)acak.b(ajut4), (DialogInterface$OnClickListener)null);
                aida aida2;
                if ((aida2 = a2.h) == null) {
                    aida2 = aida.a;
                }
                aicz aicz2;
                if ((aicz2 = aida2.c) == null) {
                    aicz2 = aicz.a;
                }
                ajut ajut5;
                if ((ajut5 = aicz2.i) == null) {
                    ajut5 = ajut.a;
                }
                final AlertDialog create = setPositiveButton.setNegativeButton((CharSequence)acak.b(ajut5), (DialogInterface$OnClickListener)null).create();
                jwk.f.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new ita(create, 3, null));
                (jwk.g = create).show();
                jwk.g.getButton(-1).setEnabled(false);
                jwk.g.getButton(-1).setOnClickListener((View$OnClickListener)new jlb(jwk, o, 16));
            }
        }
    }
}
