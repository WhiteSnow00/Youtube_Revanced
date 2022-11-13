import android.app.AlertDialog$Builder;
import java.util.Iterator;
import android.view.View$OnClickListener;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.content.DialogInterface$OnClickListener;
import android.widget.RadioButton;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RadioGroup;
import android.view.View;
import android.app.AlertDialog;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itb
{
    public final Activity a;
    public final vcy b;
    public AlertDialog c;
    public View d;
    public final atke e;
    public final aeea f;
    private RadioGroup g;
    
    public itb(final Activity a, final vcy b, final aeea f, final atke e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public final void a(final amyd amyd) {
        if (this.c == null) {
            final View inflate = LayoutInflater.from((Context)this.a).inflate(2131624964, (ViewGroup)null, false);
            this.d = inflate;
            ((TextView)inflate.findViewById(2131428432)).setMovementMethod(LinkMovementMethod.getInstance());
            final View d = this.d;
            d.getClass();
            this.g = (RadioGroup)d.findViewById(2131430195);
            for (final amxy amxy : amyd.c) {
                final RadioButton radioButton = new RadioButton((Context)this.a);
                final int b = amxy.b;
                if ((b & 0x8) != 0x0) {
                    amyd tag;
                    if ((tag = amxy.f) == null) {
                        tag = amyd.a;
                    }
                    radioButton.setTag((Object)tag);
                    final amyd f = amxy.f;
                    amyd a;
                    if (f == null) {
                        a = amyd.a;
                    }
                    else {
                        a = f;
                    }
                    ajut ajut;
                    if ((a.b & 0x1) != 0x0) {
                        amyd a2;
                        if ((a2 = f) == null) {
                            a2 = amyd.a;
                        }
                        if ((ajut = a2.d) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    radioButton.setText((CharSequence)acak.b(ajut));
                }
                else if ((b & 0x2) != 0x0) {
                    amyb tag2;
                    if ((tag2 = amxy.d) == null) {
                        tag2 = amyb.a;
                    }
                    radioButton.setTag((Object)tag2);
                    final amyb d2 = amxy.d;
                    amyb a3;
                    if (d2 == null) {
                        a3 = amyb.a;
                    }
                    else {
                        a3 = d2;
                    }
                    ajut ajut2;
                    if ((a3.b & 0x1) != 0x0) {
                        amyb a4;
                        if ((a4 = d2) == null) {
                            a4 = amyb.a;
                        }
                        if ((ajut2 = a4.c) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    radioButton.setText((CharSequence)acak.b(ajut2));
                }
                else {
                    if ((b & 0x1) == 0x0) {
                        continue;
                    }
                    amxz tag3;
                    if ((tag3 = amxy.c) == null) {
                        tag3 = amxz.a;
                    }
                    radioButton.setTag((Object)tag3);
                    final amxz c = amxy.c;
                    amxz a5;
                    if (c == null) {
                        a5 = amxz.a;
                    }
                    else {
                        a5 = c;
                    }
                    ajut ajut3;
                    if ((a5.b & 0x1) != 0x0) {
                        amxz a6;
                        if ((a6 = c) == null) {
                            a6 = amxz.a;
                        }
                        if ((ajut3 = a6.c) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    radioButton.setText((CharSequence)acak.b(ajut3));
                }
                radioButton.setTextColor(this.a.getResources().getColor(2131102366));
                final aghv aghv = (aghv)this.e.a();
                aghv.c(radioButton, 2131169378, 2131169377);
                aghv.b(radioButton);
                if (aghv.a) {
                    radioButton.setTextColor(tpe.cr(radioButton.getContext(), 2130970924));
                }
                final RadioGroup g = this.g;
                if (g != null) {
                    g.addView((View)radioButton);
                }
            }
            final acba al = this.f.al((Context)this.a);
            ajut ajut4;
            if ((amyd.b & 0x1) != 0x0) {
                if ((ajut4 = amyd.d) == null) {
                    ajut4 = ajut.a;
                }
            }
            else {
                ajut4 = null;
            }
            final AlertDialog$Builder setTitle = ((AlertDialog$Builder)al).setTitle((CharSequence)acak.b(ajut4));
            final View d3 = this.d;
            d3.getClass();
            final AlertDialog create = setTitle.setView(d3).setPositiveButton(2132019515, (DialogInterface$OnClickListener)null).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).create();
            final RadioGroup g2 = this.g;
            if (g2 != null) {
                g2.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new ita(create, 0));
            }
            this.c = create;
        }
        this.c.show();
        final RadioGroup g3 = this.g;
        if (g3 != null) {
            g3.clearCheck();
        }
        final iob onClickListener = new iob(this, 12);
        final AlertDialog c2 = this.c;
        c2.getClass();
        c2.getButton(-1).setOnClickListener((View$OnClickListener)onClickListener);
    }
}
