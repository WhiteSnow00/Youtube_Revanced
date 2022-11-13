import java.util.Map;
import java.util.HashMap;
import android.net.Uri;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcw implements acko, acjc, adbi
{
    private final acjd a;
    private final View b;
    private final addk c;
    private final TextView d;
    private adcr e;
    private Object f;
    
    public adcw(final Context context, final vcy vcy, final acgs acgs, final acjd a, final acpk acpk) {
        context.getClass();
        vcy.getClass();
        a.getClass();
        this.a = a;
        acpk.getClass();
        final View inflate = View.inflate(context, 2131624277, (ViewGroup)null);
        this.b = inflate;
        this.c = new addk(acgs, (ImageView)inflate.findViewById(2131428406));
        this.d = (TextView)inflate.findViewById(2131432279);
        final ImageButton imageButton = (ImageButton)inflate.findViewById(2131429455);
        final ImageButton imageButton2 = (ImageButton)inflate.findViewById(2131429294);
        final View viewById = inflate.findViewById(2131428424);
        viewById.setOnClickListener((View$OnClickListener)new zgi(this, vcy, 12));
        viewById.setOnLongClickListener((View$OnLongClickListener)new adcv(this, vcy, 0));
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void b(final Uri uri, final Uri uri2) {
        this.f(this.e = (adcr)this.a.b(uri));
    }
    
    public final void c(final acku acku) {
    }
    
    public final void d(final vcy vcy) {
        final adcr e = this.e;
        if (e == null) {
            return;
        }
        final aixi b = e.b;
        final aiqj aiqj = null;
        amgs amgs = null;
        Label_0096: {
            if (b != null) {
                amgv amgv;
                if ((amgv = b.e) == null) {
                    amgv = amgv.a;
                }
                if ((amgv.b & 0x1) != 0x0) {
                    amgv amgv2;
                    if ((amgv2 = e.b.e) == null) {
                        amgv2 = amgv.a;
                    }
                    if ((amgs = amgv2.c) == null) {
                        amgs = amgs.a;
                    }
                    break Label_0096;
                }
            }
            amgs = null;
        }
        if (amgs != null) {
            return;
        }
        final adcr e2 = this.e;
        final aixi b2 = e2.b;
        aiqj aiqj2;
        if (b2 != null) {
            aiqj2 = aiqj;
            if ((b2.b & 0x100) != 0x0 && (aiqj2 = b2.g) == null) {
                aiqj2 = aiqj.a;
            }
        }
        else {
            final aixk c = e2.c;
            if (c != null) {
                aiqj2 = aiqj;
                if ((c.b & 0x80) != 0x0 && (aiqj2 = c.f) == null) {
                    aiqj2 = aiqj.a;
                }
            }
            else {
                final aixl d = e2.d;
                aiqj2 = aiqj;
                if (d != null) {
                    aiqj2 = aiqj;
                    if ((d.b & 0x400) != 0x0 && (aiqj2 = d.f) == null) {
                        aiqj2 = aiqj.a;
                    }
                }
            }
        }
        if (aiqj2 == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        hashMap.put("contact_menu_source_model", this.f);
        vcy.c(aiqj2, (Map)hashMap);
    }
    
    protected final void f(final adcr adcr) {
        final aixi b = adcr.b;
        final ajut ajut = null;
        final ajut ajut2 = null;
        final CharSequence charSequence = null;
        final ajut ajut3 = null;
        ajcy ajcy = null;
        Label_0130: {
            if (b != null) {
                if ((b.b & 0x2) != 0x0) {
                    if ((ajcy = b.d) == null) {
                        ajcy = ajcy.a;
                    }
                    break Label_0130;
                }
            }
            else {
                final aixk c = adcr.c;
                if (c != null) {
                    if ((c.b & 0x2) != 0x0) {
                        if ((ajcy = c.d) == null) {
                            ajcy = ajcy.a;
                        }
                        break Label_0130;
                    }
                }
                else {
                    final aixl d = adcr.d;
                    if (d != null && (d.b & 0x2) != 0x0) {
                        if ((ajcy = d.d) == null) {
                            ajcy = ajcy.a;
                        }
                        break Label_0130;
                    }
                }
            }
            ajcy = null;
        }
        final addk c2 = this.c;
        if (ajcy != null && (ajcy.b & 0x1) != 0x0) {
            aotp aotp;
            if ((aotp = ajcy.c) == null) {
                aotp = aotp.a;
            }
            c2.b.j(c2.c, aotp, addk.a);
            c2.a(0);
        }
        else {
            c2.a(4);
        }
        final TextView d2 = this.d;
        final aixi b2 = adcr.b;
        Object text;
        if (b2 != null) {
            ajut ajut4 = ajut3;
            if ((b2.b & 0x1) != 0x0 && (ajut4 = b2.c) == null) {
                ajut4 = ajut.a;
            }
            text = acak.b(ajut4);
        }
        else {
            final aixk c3 = adcr.c;
            if (c3 != null) {
                ajut ajut5 = ajut;
                if ((c3.b & 0x1) != 0x0 && (ajut5 = c3.c) == null) {
                    ajut5 = ajut.a;
                }
                text = acak.b(ajut5);
            }
            else {
                final aixl d3 = adcr.d;
                text = charSequence;
                if (d3 != null) {
                    ajut ajut6 = ajut2;
                    if ((d3.b & 0x1) != 0x0 && (ajut6 = d3.c) == null) {
                        ajut6 = ajut.a;
                    }
                    text = acak.b(ajut6);
                }
            }
        }
        d2.setText((CharSequence)text);
    }
    
    public final void mN(final ackm ackm, Object f) {
        this.f = f;
        if (this.e != null) {
            this.a.f((acjc)this);
        }
        final aixi aixi = (aixi)f;
        String h;
        if ((aixi.b & 0x200) != 0x0) {
            h = aixi.h;
        }
        else {
            h = null;
        }
        f = new adcr(h, aixi, null, null);
        final Uri h2 = acvg.h(((adcr)f).b());
        this.e = (adcr)this.a.c(h2, (acjb)f);
        this.a.h(h2, (acjc)this);
        this.f(this.e);
    }
}
