import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.function.Consumer;
import j$.util.Optional;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.c;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpt
{
    private static final elw o;
    public final aceo a;
    public final aeyr b;
    public final tna c;
    public ImageView d;
    public ImageView e;
    public hps f;
    public acex g;
    public aorm h;
    public boolean i;
    public boolean j;
    public final szx k;
    public final uyi l;
    public final arud m;
    private final int n;
    
    static {
        o = new elw();
    }
    
    public hpt(final aceo a, final aeyr b, final mrm mrm, final uyi l, final arud m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = new hpr(this);
        this.k = (szx)new c(1);
        this.a = a;
        this.b = b;
        this.l = l;
        this.m = m;
        final anqt anqt = (anqt)b.a();
        Label_0091: {
            if (anqt != null) {
                final int c = anqt.C;
                if (c > 0) {
                    this.n = c;
                    break Label_0091;
                }
            }
            this.n = 720;
        }
        ajpg ajpg;
        if ((ajpg = m.f().A) == null) {
            ajpg = ajpg.a;
        }
        final agza builder = ajph.a.createBuilder();
        builder.copyOnWrite();
        ajph.a((ajph)builder.instance);
        final ajph ajph = (ajph)builder.build();
        final ahas b2 = ajpg.b;
        final Long value = 45366410L;
        ajph ajph2 = ajph;
        if (b2.containsKey(value)) {
            ajph2 = b2.get(value);
        }
        if (ajph2.b != 1 || !(boolean)ajph2.c) {
            ajpg ajpg2;
            if ((ajpg2 = m.f().A) == null) {
                ajpg2 = ajpg.a;
            }
            final agza builder2 = ajph.a.createBuilder();
            builder2.copyOnWrite();
            ajph.a((ajph)builder2.instance);
            final ajph ajph3 = (ajph)builder2.build();
            final ahas b3 = ajpg2.b;
            final Long value2 = 45383266L;
            ajph ajph4 = ajph3;
            if (b3.containsKey(value2)) {
                ajph4 = b3.get(value2);
            }
            if (ajph4.b != 1 || !(boolean)ajph4.c) {
                mrm.C((Callable)new guf(this, 19));
                return;
            }
        }
        ajpg ajpg3;
        if ((ajpg3 = m.f().A) == null) {
            ajpg3 = ajpg.a;
        }
        final agza builder3 = ajph.a.createBuilder();
        builder3.copyOnWrite();
        ajph.a((ajph)builder3.instance);
        final ajph ajph5 = (ajph)builder3.build();
        final ahas b4 = ajpg3.b;
        final Long value3 = 45358111L;
        ajph ajph6 = ajph5;
        if (b4.containsKey(value3)) {
            ajph6 = b4.get(value3);
        }
        this.j = (ajph6.b == 1 && (boolean)ajph6.c);
    }
    
    public final void a(final zbp zbp, final Optional optional) {
        this.e.getClass();
        final int e = zbp.e();
        final int c = zbp.c();
        if (e == 0 || c == 0) {
            optional.ifPresent((Consumer)gyc.u);
            return;
        }
        final elw o = hpt.o;
        if (o.a == null) {
            final int n = this.n;
            o.a = Bitmap.createBitmap(n, n, Bitmap$Config.RGB_565);
        }
        final int n2 = this.n;
        int n3 = 0;
        int n4 = 0;
        Label_0186: {
            if (e <= n2) {
                n3 = e;
                if ((n4 = c) <= n2) {
                    break Label_0186;
                }
            }
            final double n5 = c;
            final double n6 = e;
            Double.isNaN(n5);
            Double.isNaN(n6);
            final double n7 = n5 / n6;
            if (e > c) {
                final double n8 = n2;
                Double.isNaN(n8);
                n4 = (int)(n8 * n7 + 0.5);
                n3 = n2;
            }
            else {
                final double n9 = n2;
                Double.isNaN(n9);
                n3 = (int)(n9 / n7 + 0.5);
                n4 = n2;
            }
        }
        if (n3 >= 8 && n4 >= 8) {
            this.e.setImageDrawable((Drawable)null);
            ((Bitmap)o.a).reconfigure(n3, n4, Bitmap$Config.RGB_565);
            zbp.k((Bitmap)o.a, (szx)new gqd(this, optional, 3));
            return;
        }
        optional.ifPresent((Consumer)gyc.u);
    }
    
    public final void b() {
        final ImageView e = this.e;
        if (e != null) {
            e.setImageBitmap((Bitmap)null);
            tmy.v((View)this.e, false);
        }
    }
    
    public final void c() {
        this.i = false;
        ajpg ajpg;
        if ((ajpg = this.m.f().A) == null) {
            ajpg = ajpg.a;
        }
        final agza builder = ajph.a.createBuilder();
        builder.copyOnWrite();
        ajph.a((ajph)builder.instance);
        final ajph ajph = (ajph)builder.build();
        final ahas b = ajpg.b;
        final Long value = 45382468L;
        ajph ajph2 = ajph;
        if (b.containsKey(value)) {
            ajph2 = b.get(value);
        }
        if (ajph2.b != 1 || !(boolean)ajph2.c) {
            this.j = false;
        }
        this.h = null;
        this.g.a();
        tmy.v((View)this.d, false);
    }
    
    public final void d(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        this.e(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        this.g();
    }
    
    public final void e(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        final boolean i = iba.I(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        boolean j = true;
        if (!i) {
            j = (iba.z(reelWatchEndpointOuterClass$ReelWatchEndpoint) && j);
        }
        this.i = j;
        aorm h;
        if ((h = reelWatchEndpointOuterClass$ReelWatchEndpoint.i) == null) {
            h = aorm.a;
        }
        this.h = h;
        this.g.k(h);
    }
    
    public final void f() {
        tmy.v((View)this.e, true);
    }
    
    public final void g() {
        tmy.v((View)this.d, true);
    }
}
