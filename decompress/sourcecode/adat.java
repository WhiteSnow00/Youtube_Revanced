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

public final class adat implements acil, acgz, aczf
{
    private final acha a;
    private final View b;
    private final adbh c;
    private final TextView d;
    private adao e;
    private Object f;
    
    public adat(final Context context, final vax vax, final aceo aceo, final acha a, final acng acng) {
        context.getClass();
        vax.getClass();
        a.getClass();
        this.a = a;
        acng.getClass();
        final View inflate = View.inflate(context, 2131624278, (ViewGroup)null);
        this.b = inflate;
        this.c = new adbh(aceo, (ImageView)inflate.findViewById(2131428406));
        this.d = (TextView)inflate.findViewById(2131432276);
        final ImageButton imageButton = (ImageButton)inflate.findViewById(2131429455);
        final ImageButton imageButton2 = (ImageButton)inflate.findViewById(2131429294);
        final View viewById = inflate.findViewById(2131428424);
        viewById.setOnClickListener((View$OnClickListener)new aafm(this, vax, 11));
        viewById.setOnLongClickListener((View$OnLongClickListener)new adas(this, vax, 0));
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void b(final Uri uri, final Uri uri2) {
        this.f(this.e = (adao)this.a.b(uri));
    }
    
    public final void c(final acir acir) {
    }
    
    public final void d(final vax vax) {
        final adao e = this.e;
        if (e == null) {
            return;
        }
        final aivd b = e.b;
        final aioe aioe = null;
        ameo ameo = null;
        Label_0093: {
            if (b != null) {
                amer amer;
                if ((amer = b.e) == null) {
                    amer = amer.a;
                }
                if ((amer.b & 0x1) != 0x0) {
                    amer amer2;
                    if ((amer2 = e.b.e) == null) {
                        amer2 = amer.a;
                    }
                    if ((ameo = amer2.c) == null) {
                        ameo = ameo.a;
                    }
                    break Label_0093;
                }
            }
            ameo = null;
        }
        if (ameo != null) {
            return;
        }
        final adao e2 = this.e;
        final aivd b2 = e2.b;
        aioe aioe2;
        if (b2 != null) {
            aioe2 = aioe;
            if ((b2.b & 0x100) != 0x0 && (aioe2 = b2.g) == null) {
                aioe2 = aioe.a;
            }
        }
        else {
            final aivf c = e2.c;
            if (c != null) {
                aioe2 = aioe;
                if ((c.b & 0x80) != 0x0 && (aioe2 = c.f) == null) {
                    aioe2 = aioe.a;
                }
            }
            else {
                final aivg d = e2.d;
                aioe2 = aioe;
                if (d != null) {
                    aioe2 = aioe;
                    if ((d.b & 0x400) != 0x0 && (aioe2 = d.f) == null) {
                        aioe2 = aioe.a;
                    }
                }
            }
        }
        if (aioe2 == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        hashMap.put("contact_menu_source_model", this.f);
        vax.c(aioe2, (Map)hashMap);
    }
    
    protected final void f(final adao adao) {
        final aivd b = adao.b;
        final ajsq ajsq = null;
        final ajsq ajsq2 = null;
        final CharSequence charSequence = null;
        final ajsq ajsq3 = null;
        ajau ajau = null;
        Label_0130: {
            if (b != null) {
                if ((b.b & 0x2) != 0x0) {
                    if ((ajau = b.d) == null) {
                        ajau = ajau.a;
                    }
                    break Label_0130;
                }
            }
            else {
                final aivf c = adao.c;
                if (c != null) {
                    if ((c.b & 0x2) != 0x0) {
                        if ((ajau = c.d) == null) {
                            ajau = ajau.a;
                        }
                        break Label_0130;
                    }
                }
                else {
                    final aivg d = adao.d;
                    if (d != null && (d.b & 0x2) != 0x0) {
                        if ((ajau = d.d) == null) {
                            ajau = ajau.a;
                        }
                        break Label_0130;
                    }
                }
            }
            ajau = null;
        }
        final adbh c2 = this.c;
        if (ajau != null && (ajau.b & 0x1) != 0x0) {
            aorm aorm;
            if ((aorm = ajau.c) == null) {
                aorm = aorm.a;
            }
            c2.b.j(c2.c, aorm, adbh.a);
            c2.a(0);
        }
        else {
            c2.a(4);
        }
        final TextView d2 = this.d;
        final aivd b2 = adao.b;
        Object text;
        if (b2 != null) {
            ajsq ajsq4 = ajsq3;
            if ((b2.b & 0x1) != 0x0 && (ajsq4 = b2.c) == null) {
                ajsq4 = ajsq.a;
            }
            text = abyh.b(ajsq4);
        }
        else {
            final aivf c3 = adao.c;
            if (c3 != null) {
                ajsq ajsq5 = ajsq;
                if ((c3.b & 0x1) != 0x0 && (ajsq5 = c3.c) == null) {
                    ajsq5 = ajsq.a;
                }
                text = abyh.b(ajsq5);
            }
            else {
                final aivg d3 = adao.d;
                text = charSequence;
                if (d3 != null) {
                    ajsq ajsq6 = ajsq2;
                    if ((d3.b & 0x1) != 0x0 && (ajsq6 = d3.c) == null) {
                        ajsq6 = ajsq.a;
                    }
                    text = abyh.b(ajsq6);
                }
            }
        }
        d2.setText((CharSequence)text);
    }
    
    public final void mN(final acij acij, Object f) {
        this.f = f;
        if (this.e != null) {
            this.a.f((acgz)this);
        }
        final aivd aivd = (aivd)f;
        String h;
        if ((aivd.b & 0x200) != 0x0) {
            h = aivd.h;
        }
        else {
            h = null;
        }
        f = new adao(h, aivd, null, null);
        final Uri b = adbp.b(((adao)f).b());
        this.e = (adao)this.a.c(b, (acgy)f);
        this.a.h(b, (acgz)this);
        this.f(this.e);
    }
}
