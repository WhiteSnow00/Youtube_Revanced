import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import java.util.Map;
import android.text.TextUtils;
import android.content.Intent;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmu implements vau
{
    public final bu a;
    private final thh c;
    private final Executor d;
    private final zjy e;
    private final wwu f;
    private final zki g;
    private final uyi h;
    private final vup i;
    private final sin j;
    private final bx k;
    
    public gmu(final bu a, final vup i, final thh c, final sin j, final Executor d, final bx k, final zjy e, final wwu f, final zki g, final uyi h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
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
        s = jni.a.get(s);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            intent.putExtra(":android:show_fragment", s);
        }
    }
    
    public final void b(final Intent intent) {
        tcp.n((aum)this.a, this.e.b(this.g.c()), (trb)etd.m, (trb)new fcy(this, intent, 5));
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final int b = aioe.b;
        int n = 1;
        if ((b & 0x1) != 0x0) {
            this.f.n().J(3, (wxz)new wws(aioe.c), (alff)null);
        }
        final Intent r = this.k.R();
        final ahtj ahtj = (ahtj)((agzd)aioe).rr((agyr)ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
        if ((ahtj.b & 0x100) != 0x0) {
            r.putExtra("com.google.android.apps.youtube.app.settings.AllowDeeplinkingNavigation", ahtj.g);
        }
        final boolean o = this.c.o();
        final boolean b2 = false;
        if (o && !this.j.a && ahtj.c) {
            final gmt gmt = new gmt(this, r, 0);
            final vtn a = this.i.a(this.g.c());
            tcp.l(a.d(a.a(ahtj.d)), this.d, (tcn)new fcb((znj)gmt, 5), (tco)new erz((znj)gmt, 13), afua.a);
            return;
        }
        boolean b3 = false;
        Label_0239: {
            if (!this.j.a) {
                b3 = b2;
                if (!this.h.f(45372222L)) {
                    break Label_0239;
                }
                b3 = b2;
                if (ahtj.c) {
                    break Label_0239;
                }
            }
            b3 = true;
        }
        r.putExtra("show_offline_items", b3);
        final int b4 = ahtj.b;
        String s;
        if ((b4 & 0x8) != 0x0) {
            s = ahtj.e;
        }
        else if ((b4 & 0x10) != 0x0) {
            final int bb = aqql.bB(ahtj.f);
            if (bb != 0) {
                n = bb;
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
