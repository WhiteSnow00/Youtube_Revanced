import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kct
{
    public final Object a;
    public final Object b;
    
    public kct(final Context b) {
        this.a = LayoutInflater.from(b);
        this.b = b;
    }
    
    public kct(final Context context, final aceo b) {
        this.a = LayoutInflater.from(context);
        this.b = b;
    }
    
    public kct(final Context context, final aceo b, final byte[] array) {
        this.a = LayoutInflater.from(context);
        this.b = b;
    }
    
    public kct(final Context context, final aceo a, final char[] array) {
        this.b = LayoutInflater.from(context);
        this.a = a;
    }
    
    public kct(final arud a, final aeyr b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public kct(final atjj b, final atjj a) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public kct(final atjj a, final atjj b, final byte[] array) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public kct(final atjj a, final atjj b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public kct(final atjj a, final atjj b, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public kct(final atjj b, final atjj a, final char[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public kct(final String a, final View$OnClickListener b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public kct(final lzi a, final zki b, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public kct(final tpo tpo, final asgt asgt) {
        final asgt i = tpo.a().i(asgm.c);
        this.a = i;
        final kus q = kus.q;
        final asgt asgt2 = i;
        this.b = asgt.e((aujo)i.L((asjc)q), (aujo)asgt, (asit)kwo.h);
    }
    
    public kct(final utk utk) {
        this.b = utk.g().a;
        this.a = utk.g().i;
    }
    
    public static final trb b(final AdsWebView adsWebView) {
        return (trb)new jly(adsWebView, 20);
    }
    
    public static int d(final Context context, final int n) {
        return tmy.aZ(context.getResources().getDisplayMetrics(), n);
    }
    
    public final kmv a(final ViewSwitcher viewSwitcher, final ViewSwitcher viewSwitcher2, final ImageView imageView, final TextView textView, final kmu kmu) {
        final Context context = (Context)((atjj)this.a).a();
        context.getClass();
        final aceo aceo = (aceo)((atjj)this.b).a();
        aceo.getClass();
        imageView.getClass();
        textView.getClass();
        return new kmv(context, aceo, viewSwitcher, viewSwitcher2, imageView, textView, kmu);
    }
    
    public final View c(final ViewGroup viewGroup, final ajth ajth) {
        final View inflate = ((LayoutInflater)this.b).inflate(2131624456, viewGroup, false);
        final TextView textView = (TextView)inflate.findViewById(2131432092);
        final ImageView imageView = (ImageView)inflate.findViewById(2131432104);
        final TextView textView2 = (TextView)inflate.findViewById(2131428624);
        final Object a = this.a;
        aorm aorm;
        if ((aorm = ajth.c) == null) {
            aorm = aorm.a;
        }
        ((aceo)a).g(imageView, aorm);
        final int b = ajth.b;
        final ajsq ajsq = null;
        ajsq ajsq2;
        if ((b & 0x2) != 0x0) {
            if ((ajsq2 = ajth.d) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        textView.setText((CharSequence)abyh.b(ajsq2));
        ajsq ajsq3;
        if ((ajth.b & 0x4) != 0x0) {
            if ((ajsq3 = ajth.e) == null) {
                ajsq3 = ajsq.a;
            }
        }
        else {
            ajsq3 = null;
        }
        textView2.setText((CharSequence)abyh.b(ajsq3));
        final TextView textView3 = (TextView)inflate.findViewById(2131429452);
        ajsq ajsq4 = ajsq;
        if ((ajth.b & 0x10) != 0x0 && (ajsq4 = ajth.g) == null) {
            ajsq4 = ajsq.a;
        }
        tmy.t(textView3, (CharSequence)abyh.b(ajsq4));
        return inflate;
    }
    
    public final tpe e(final utd utd, final boolean b) {
        if (b) {
            final ajnl c = utd.C();
            Object o;
            if (c != null && (c.c & 0x40) != 0x0) {
                ajni ajni;
                if ((ajni = c.i) == null) {
                    ajni = ajni.a;
                }
                int i;
                if ((i = ajox.i(ajni.c)) == 0) {
                    i = 1;
                }
                if (i - 1 != 2) {
                    o = ((uvt)this.b).b(utd);
                }
                else {
                    o = new uvs((uvt)this.b, true, utd, uvt.a);
                }
            }
            else {
                o = ((uvt)this.b).b(utd);
            }
            return (tpe)o;
        }
        return (tpe)this.a;
    }
    
    public final boolean f() {
        alvs alvs;
        if ((alvs = ((arud)this.a).f().e) == null) {
            alvs = alvs.a;
        }
        final boolean aj = alvs.aj;
        alvs alvs2;
        if ((alvs2 = ((arud)this.a).f().e) == null) {
            alvs2 = alvs.a;
        }
        final boolean am = alvs2.am;
        boolean b = false;
        if (aj) {
            if (!am) {
                if (!(boolean)((aeyr)this.b).a()) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
}
