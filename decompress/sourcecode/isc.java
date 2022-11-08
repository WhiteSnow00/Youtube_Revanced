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

public final class isc
{
    public final Activity a;
    public final vax b;
    public AlertDialog c;
    public View d;
    public final atjj e;
    public final aeby f;
    private RadioGroup g;
    
    public isc(final Activity a, final vax b, final aeby f, final atjj e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public final void a(final amvz amvz) {
        if (this.c == null) {
            final View inflate = LayoutInflater.from((Context)this.a).inflate(2131624963, (ViewGroup)null, false);
            this.d = inflate;
            ((TextView)inflate.findViewById(2131428432)).setMovementMethod(LinkMovementMethod.getInstance());
            final View d = this.d;
            d.getClass();
            this.g = (RadioGroup)d.findViewById(2131430195);
            for (final amvu amvu : amvz.c) {
                final RadioButton radioButton = new RadioButton((Context)this.a);
                final int b = amvu.b;
                if ((b & 0x8) != 0x0) {
                    amvz tag;
                    if ((tag = amvu.f) == null) {
                        tag = amvz.a;
                    }
                    radioButton.setTag((Object)tag);
                    final amvz f = amvu.f;
                    amvz a;
                    if (f == null) {
                        a = amvz.a;
                    }
                    else {
                        a = f;
                    }
                    ajsq ajsq;
                    if ((a.b & 0x1) != 0x0) {
                        amvz a2;
                        if ((a2 = f) == null) {
                            a2 = amvz.a;
                        }
                        if ((ajsq = a2.d) == null) {
                            ajsq = ajsq.a;
                        }
                    }
                    else {
                        ajsq = null;
                    }
                    radioButton.setText((CharSequence)abyh.b(ajsq));
                }
                else if ((b & 0x2) != 0x0) {
                    amvx tag2;
                    if ((tag2 = amvu.d) == null) {
                        tag2 = amvx.a;
                    }
                    radioButton.setTag((Object)tag2);
                    final amvx d2 = amvu.d;
                    amvx a3;
                    if (d2 == null) {
                        a3 = amvx.a;
                    }
                    else {
                        a3 = d2;
                    }
                    ajsq ajsq2;
                    if ((a3.b & 0x1) != 0x0) {
                        amvx a4;
                        if ((a4 = d2) == null) {
                            a4 = amvx.a;
                        }
                        if ((ajsq2 = a4.c) == null) {
                            ajsq2 = ajsq.a;
                        }
                    }
                    else {
                        ajsq2 = null;
                    }
                    radioButton.setText((CharSequence)abyh.b(ajsq2));
                }
                else {
                    if ((b & 0x1) == 0x0) {
                        continue;
                    }
                    amvv tag3;
                    if ((tag3 = amvu.c) == null) {
                        tag3 = amvv.a;
                    }
                    radioButton.setTag((Object)tag3);
                    final amvv c = amvu.c;
                    amvv a5;
                    if (c == null) {
                        a5 = amvv.a;
                    }
                    else {
                        a5 = c;
                    }
                    ajsq ajsq3;
                    if ((a5.b & 0x1) != 0x0) {
                        amvv a6;
                        if ((a6 = c) == null) {
                            a6 = amvv.a;
                        }
                        if ((ajsq3 = a6.c) == null) {
                            ajsq3 = ajsq.a;
                        }
                    }
                    else {
                        ajsq3 = null;
                    }
                    radioButton.setText((CharSequence)abyh.b(ajsq3));
                }
                radioButton.setTextColor(this.a.getResources().getColor(2131102338));
                final agfu agfu = (agfu)this.e.a();
                agfu.c(radioButton, 2131169379, 2131169378);
                agfu.b(radioButton);
                if (agfu.a) {
                    radioButton.setTextColor(tmy.cn(radioButton.getContext(), 2130970924));
                }
                final RadioGroup g = this.g;
                if (g != null) {
                    g.addView((View)radioButton);
                }
            }
            final abyy af = this.f.af((Context)this.a);
            ajsq ajsq4;
            if ((amvz.b & 0x1) != 0x0) {
                if ((ajsq4 = amvz.d) == null) {
                    ajsq4 = ajsq.a;
                }
            }
            else {
                ajsq4 = null;
            }
            final AlertDialog$Builder setTitle = ((AlertDialog$Builder)af).setTitle((CharSequence)abyh.b(ajsq4));
            final View d3 = this.d;
            d3.getClass();
            final AlertDialog create = setTitle.setView(d3).setPositiveButton(2132019514, (DialogInterface$OnClickListener)null).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).create();
            final RadioGroup g2 = this.g;
            if (g2 != null) {
                g2.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new isb(create, 0));
            }
            this.c = create;
        }
        this.c.show();
        final RadioGroup g3 = this.g;
        if (g3 != null) {
            g3.clearCheck();
        }
        final ina onClickListener = new ina(this, 12);
        final AlertDialog c2 = this.c;
        c2.getClass();
        c2.getButton(-1).setOnClickListener((View$OnClickListener)onClickListener);
    }
}
