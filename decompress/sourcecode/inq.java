import android.graphics.Typeface;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.concurrent.Future;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inq implements tec
{
    public final tdz a;
    public final iki b;
    public final atjj c;
    public final TextView d;
    public final OfflineArrowView e;
    public final acih f;
    public aitc g;
    public String h;
    public ika i;
    public Future j;
    public final eg k;
    public final e l;
    private final aago m;
    
    public inq(final e l, final tdz a, final eg k, final aago m, final iki b, final atjj c, final View view, final acih f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.l = l;
        this.a = a;
        this.k = k;
        this.m = m;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = (TextView)view.findViewById(2131431819);
        this.e = (OfflineArrowView)view.findViewById(2131430122);
    }
    
    public final void a() {
        if (!aexs.f(this.h)) {
            if (!"PPSV".equals(this.h)) {
                this.m.c(this.h, aagg.a(true));
            }
        }
    }
    
    public final void b(final ijj ijj) {
        if (aexs.f(((String[])ijj.c)[0])) {
            final aitc g = this.g;
            g.getClass();
            final TextView d = this.d;
            ajsq ajsq;
            if ((g.b & 0x2) != 0x0) {
                if ((ajsq = g.h) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            tmy.t(d, (CharSequence)abyh.b(ajsq));
            final TextView d2 = this.d;
            d2.setTextColor(tmy.ct(d2.getContext(), 2130970926).orElse(0));
            this.d.setTypeface(Typeface.DEFAULT);
            return;
        }
        tmy.t(this.d, (CharSequence)((String[])ijj.c)[0]);
        final TextView d3 = this.d;
        d3.setTextColor(tmy.ct(d3.getContext(), ijj.a).orElse(0));
        final TextView d4 = this.d;
        final Typeface typeface = d4.getTypeface();
        final int b = ijj.b;
        d4.setTypeface(typeface, 0);
    }
    
    public final void c(final zyy zyy) {
        this.i.b(ijk.a((zza)zyy));
        this.b(this.b.c(zyy));
    }
    
    public final void d(final zzm zzm) {
        this.i.b(ijk.a((zza)zzm));
        this.b(this.b.a());
    }
    
    public final boolean f() {
        return "PPSV".equals(this.h);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                                sb.append(n);
                                throw new IllegalStateException(sb.toString());
                            }
                            final zww zww = (zww)o;
                            array2 = array;
                            if ("PPSV".equals(this.h)) {
                                if (this.i != null) {
                                    this.d(zww.a);
                                    return null;
                                }
                                array2 = array;
                            }
                        }
                        else {
                            final zwb zwb = (zwb)o;
                            array2 = array;
                            if (zwb.a.d().equals(this.h)) {
                                if (this.i != null) {
                                    this.c(zwb.a);
                                    return null;
                                }
                                array2 = array;
                            }
                        }
                    }
                    else {
                        final zvz zvz = (zvz)o;
                        final String h = this.h;
                        if (zvz.a.equals(h)) {
                            this.c(((zzu)this.c.a()).a().i().d(h));
                            array2 = array;
                        }
                        else {
                            if (this.f()) {
                                this.d(((zzu)this.c.a()).a().l().f());
                                return null;
                            }
                            array2 = array;
                        }
                    }
                }
                else {
                    final zvw zvw = (zvw)o;
                    final String h2 = this.h;
                    if (zvw.a.equals(h2)) {
                        this.c(((zzu)this.c.a()).a().i().d(h2));
                        return null;
                    }
                    array2 = array;
                }
            }
            else {
                final ijc ijc = (ijc)o;
                if (this.f()) {
                    this.b(this.b.a());
                    return null;
                }
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { ijc.class, zvw.class, zvz.class, zwb.class, zww.class };
        }
        return array2;
    }
}
