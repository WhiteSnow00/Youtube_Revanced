import android.view.View$OnClickListener;
import java.util.concurrent.TimeUnit;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import android.view.View;
import android.content.SharedPreferences;
import android.text.TextUtils$TruncateAt;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.content.pm.PackageManager;
import java.util.HashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmw
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public hmw(final abmq a, final abmq c, final abmq d, final abmq e, final fbq b, final fbr f) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = b;
        this.f = f;
    }
    
    public hmw(final Context c, final acpk a, final vcy d, final aeea f, final wyv b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.e = new HashMap();
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
        this.f = f;
    }
    
    public hmw(final PackageManager b, final fbo e, final fbl f, final atke c, final atke a, final atke d) {
        this.b = b;
        this.e = e;
        this.f = f;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public hmw(final ViewGroup b, final boolean b2, final acgs f, final gkx a) {
        this.a = a;
        this.b = b;
        this.e = b.findViewById(2131427992);
        final YouTubeTextView c = (YouTubeTextView)b.findViewById(2131427995);
        this.c = c;
        final YouTubeTextView d = (YouTubeTextView)b.findViewById(2131427994);
        this.d = d;
        if (b2) {
            final YouTubeTextView youTubeTextView = c;
            c.setMaxLines(1);
            final TextUtils$TruncateAt end = TextUtils$TruncateAt.END;
            final YouTubeTextView youTubeTextView2 = c;
            c.setEllipsize(end);
            final YouTubeTextView youTubeTextView3 = d;
            d.setMaxLines(1);
            final TextUtils$TruncateAt end2 = TextUtils$TruncateAt.END;
            final YouTubeTextView youTubeTextView4 = d;
            d.setEllipsize(end2);
        }
        this.f = f;
    }
    
    public hmw(final atke a, final atke b, final atke c, final atke d, final atke e, final atke f) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
    }
    
    public hmw(final atke f, final atke d, final atke b, final atke a, final atke c, final atke e, final byte[] array) {
        f.getClass();
        this.f = f;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
    }
    
    public hmw(final vcy d, final wyw c, final tjm a, final oby e, final SharedPreferences b, final acwb f) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.e = e;
        this.b = b;
        this.f = f;
    }
    
    public static void a(final View view, final boolean enabled) {
        view.setEnabled(enabled);
        float alpha;
        if (!enabled) {
            alpha = 0.33f;
        }
        else {
            alpha = 1.0f;
        }
        view.setAlpha(alpha);
    }
    
    private static amrl e(final apny apny) {
        if (apny != null) {
            apnz apnz;
            if ((apnz = apny.e) == null) {
                apnz = apnz.a;
            }
            amrl a;
            if (apnz.b == 96140188) {
                a = (amrl)apnz.c;
            }
            else {
                a = amrl.a;
            }
            aida aida;
            if ((aida = a.d) == null) {
                aida = aida.a;
            }
            if ((aida.b & 0x1) != 0x0) {
                apnz apnz2;
                if ((apnz2 = apny.e) == null) {
                    apnz2 = apnz.a;
                }
                amrl a2;
                if (apnz2.b == 96140188) {
                    a2 = (amrl)apnz2.c;
                }
                else {
                    a2 = amrl.a;
                }
                return a2;
            }
        }
        return null;
    }
    
    private static final boolean f(final apny apny, final apoa apoa) {
        if ((apny.b & 0x1) != 0x0) {
            apob apob;
            if ((apob = apny.c) == null) {
                apob = apob.b;
            }
            final Iterator<Object> iterator = ((List<Object>)new ahbr((List)apob.c, apob.a)).iterator();
            while (iterator.hasNext()) {
                if (apoa == iterator.next()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final gld b(final TextView textView) {
        final vcy vcy = (vcy)((atke)this.f).a();
        vcy.getClass();
        final acvw acvw = (acvw)((atke)this.d).a();
        acvw.getClass();
        final acpk acpk = (acpk)((atke)this.b).a();
        acpk.getClass();
        final aeea aeea = (aeea)((atke)this.a).a();
        aeea.getClass();
        final vaf vaf = (vaf)((atke)this.c).a();
        vaf.getClass();
        final vai vai = (vai)((atke)this.e).a();
        vai.getClass();
        textView.getClass();
        return new gld(vcy, acvw, acpk, aeea, vaf, vai, textView, null, null, null, null);
    }
    
    public final void c(final apny apny) {
        tbi.f();
        final amrl e = e(apny);
        if (e != null && (e.b & 0x1) != 0x0) {
            aida aida;
            if ((aida = e.d) == null) {
                aida = aida.a;
            }
            aicz aicz;
            if ((aicz = aida.c) == null) {
                aicz = aicz.a;
            }
            if ((aicz.b & 0x8000) != 0x0) {
                final aida d = e.d;
                aida a;
                if (d == null) {
                    a = aida.a;
                }
                else {
                    a = d;
                }
                aicz aicz2;
                if ((aicz2 = a.c) == null) {
                    aicz2 = aicz.a;
                }
                ajut ajut;
                if ((aicz2.b & 0x200) != 0x0) {
                    aida a2;
                    if ((a2 = d) == null) {
                        a2 = aida.a;
                    }
                    aicz aicz3;
                    if ((aicz3 = a2.c) == null) {
                        aicz3 = aicz.a;
                    }
                    if ((ajut = aicz3.i) == null) {
                        ajut = ajut.a;
                    }
                }
                else {
                    ajut = null;
                }
                if (acak.b(ajut) != null) {
                    apny.getClass();
                    apob apob;
                    if ((apob = apny.c) == null) {
                        apob = apob.b;
                    }
                    if (apob != null) {
                        if (TimeUnit.MILLISECONDS.toSeconds(((oby)this.e).c() - ((SharedPreferences)this.b).getLong("video_quality_promo_last_displayed", 0L)) < apob.g) {
                            return;
                        }
                    }
                    if (!((tjm)this.a).m() || !f(apny, apoa.c)) {
                        if (!((tjm)this.a).r() || !f(apny, apoa.b)) {
                            return;
                        }
                    }
                    apny.getClass();
                    final amrl e2 = e(apny);
                    e2.getClass();
                    final fvt fvt = new fvt(this, apny, e2, null);
                    final Object f = this.f;
                    final acwc j = ((acwb)f).j();
                    ajut ajut2;
                    if ((e2.b & 0x1) != 0x0) {
                        if ((ajut2 = e2.c) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    j.k((CharSequence)acak.b(ajut2));
                    final aida d2 = e2.d;
                    aida a3;
                    if (d2 == null) {
                        a3 = aida.a;
                    }
                    else {
                        a3 = d2;
                    }
                    aicz aicz4;
                    if ((aicz4 = a3.c) == null) {
                        aicz4 = aicz.a;
                    }
                    ajut ajut3;
                    if ((aicz4.b & 0x200) != 0x0) {
                        aida a4;
                        if ((a4 = d2) == null) {
                            a4 = aida.a;
                        }
                        aicz aicz5;
                        if ((aicz5 = a4.c) == null) {
                            aicz5 = aicz.a;
                        }
                        if ((ajut3 = aicz5.i) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    j.m((CharSequence)acak.b(ajut3).toString(), (View$OnClickListener)new exq(this, e2, 18, (byte[])null));
                    j.l((acvo)fvt);
                    j.h(false);
                    ((acwb)f).n(j.b());
                }
            }
        }
    }
    
    public final void d(final ajfm ajfm) {
        final Object f = this.f;
        final Object e = this.e;
        aotp aotp;
        if ((aotp = ajfm.g) == null) {
            aotp = aotp.a;
        }
        ((acgs)f).g((ImageView)e, aotp);
        final Object c = this.c;
        ajut ajut;
        if ((ajut = ajfm.e) == null) {
            ajut = ajut.a;
        }
        tpe.t((TextView)c, (CharSequence)acak.b(ajut));
        final Object d = this.d;
        ajut ajut2;
        if ((ajut2 = ajfm.f) == null) {
            ajut2 = ajut.a;
        }
        tpe.t((TextView)d, (CharSequence)acak.b(ajut2));
        final gkv a = ((gkx)this.a).a();
        final Object b = this.b;
        if (b != null) {
            if (a != null) {
                if ((a == gkv.a && (ajfm.b & 0x10) != 0x0) || (a == gkv.b && (ajfm.b & 0x20) != 0x0)) {
                    ((ViewGroup)b).setBackgroundColor(0);
                }
            }
        }
    }
}
