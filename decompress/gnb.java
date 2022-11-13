import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import java.util.Map;
import android.text.TextUtils;
import android.content.Intent;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnb implements vcv
{
    public static final int b = 0;
    public final bu a;
    private final tjm c;
    private final Executor d;
    private final zlv e;
    private final wyv f;
    private final zmf g;
    private final vai h;
    private final vwa i;
    private final skt j;
    private final bx k;
    
    public gnb(final bu a, final vwa i, final tjm c, final skt j, final Executor d, final bx k, final zlv e, final wyv f, final zmf g, final vai h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.i = i;
        this.c = c;
        this.j = j;
        this.d = d;
        this.k = k;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static final void c(final Intent intent, String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        s = joj.a.get(s);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            intent.putExtra(":android:show_fragment", s);
        }
    }
    
    public final void b(final Intent intent) {
        teu.n((aun)this.a, this.e.b(this.g.c()), (ttg)etg.m, (ttg)new fdc(this, intent, 5));
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final int b = aiqj.b;
        int n = 1;
        if ((b & 0x1) != 0x0) {
            this.f.pF().J(3, (wzz)new wyt(aiqj.c), (alhi)null);
        }
        final Intent r = this.k.R();
        final ahvh ahvh = (ahvh)((ahbc)aiqj).rx((ahaq)ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
        if ((ahvh.b & 0x100) != 0x0) {
            r.putExtra("com.google.android.apps.youtube.app.settings.AllowDeeplinkingNavigation", ahvh.g);
        }
        final boolean o = this.c.o();
        final boolean b2 = false;
        if (o && !this.j.a && ahvh.c) {
            final gna gna = new gna(this, r, 0);
            final vvo a = this.i.a(this.g.c());
            teu.l(a.d(a.a(ahvh.d)), this.d, (tes)new fcf((zpf)gna, 5), (tet)new esc((zpf)gna, 13), afwb.a);
            return;
        }
        boolean b3 = false;
        Label_0240: {
            if (!this.j.a) {
                b3 = b2;
                if (!this.h.f(45372222L)) {
                    break Label_0240;
                }
                b3 = b2;
                if (ahvh.c) {
                    break Label_0240;
                }
            }
            b3 = true;
        }
        r.putExtra("show_offline_items", b3);
        final int b4 = ahvh.b;
        String s;
        if ((b4 & 0x8) != 0x0) {
            s = ahvh.e;
        }
        else if ((b4 & 0x10) != 0x0) {
            final int bc = aqsx.bC(ahvh.f);
            if (bc != 0) {
                n = bc;
            }
            s = Integer.toString(n - 1);
        }
        else {
            s = "";
        }
        c(r, s);
        this.b(r);
    }
}
