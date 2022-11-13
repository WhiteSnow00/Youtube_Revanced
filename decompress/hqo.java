import java.util.Map;
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

public final class hqo
{
    private static final elx o;
    public final acgs a;
    public final afaq b;
    public final tpg c;
    public ImageView d;
    public ImageView e;
    public hqn f;
    public achb g;
    public aotp h;
    public boolean i;
    public boolean j;
    public final tcc k;
    public final vai l;
    public final arwh m;
    private final int n;
    
    static {
        o = new elx((int[])null);
    }
    
    public hqo(final acgs a, final afaq b, final msr msr, final vai l, final arwh m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = new hqm(this);
        this.k = (tcc)new c(1);
        this.a = a;
        this.b = b;
        this.l = l;
        this.m = m;
        final answ answ = (answ)b.a();
        Label_0091: {
            if (answ != null) {
                final int c = answ.C;
                if (c > 0) {
                    this.n = c;
                    break Label_0091;
                }
            }
            this.n = 720;
        }
        ajrk ajrk;
        if ((ajrk = m.f().A) == null) {
            ajrk = ajrk.a;
        }
        final ahaz builder = ((ahbh)ajrl.a).createBuilder();
        builder.copyOnWrite();
        ajrl.a((ajrl)builder.instance);
        final ajrl ajrl = (ajrl)builder.build();
        final ahcr b2 = ajrk.b;
        final Long value = 45366410L;
        ajrl ajrl2 = ajrl;
        if (((Map)b2).containsKey(value)) {
            ajrl2 = (ajrl)((Map)b2).get(value);
        }
        if (ajrl2.b != 1 || !(boolean)ajrl2.c) {
            ajrk ajrk2;
            if ((ajrk2 = m.f().A) == null) {
                ajrk2 = ajrk.a;
            }
            final ahaz builder2 = ((ahbh)ajrl.a).createBuilder();
            builder2.copyOnWrite();
            ajrl.a((ajrl)builder2.instance);
            final ajrl ajrl3 = (ajrl)builder2.build();
            final ahcr b3 = ajrk2.b;
            final Long value2 = 45383266L;
            ajrl ajrl4 = ajrl3;
            if (((Map)b3).containsKey(value2)) {
                ajrl4 = (ajrl)((Map)b3).get(value2);
            }
            if (ajrl4.b != 1 || !(boolean)ajrl4.c) {
                msr.S((Callable)new hvu(this, 1));
                return;
            }
        }
        ajrk ajrk3;
        if ((ajrk3 = m.f().A) == null) {
            ajrk3 = ajrk.a;
        }
        final ahaz builder3 = ((ahbh)ajrl.a).createBuilder();
        builder3.copyOnWrite();
        ajrl.a((ajrl)builder3.instance);
        final ajrl ajrl5 = (ajrl)builder3.build();
        final ahcr b4 = ajrk3.b;
        final Long value3 = 45358111L;
        ajrl ajrl6 = ajrl5;
        if (((Map)b4).containsKey(value3)) {
            ajrl6 = (ajrl)((Map)b4).get(value3);
        }
        this.j = (ajrl6.b == 1 && (boolean)ajrl6.c);
    }
    
    public final void a(final zdi zdi, final Optional optional) {
        this.e.getClass();
        final int e = zdi.e();
        final int c = zdi.c();
        if (e == 0 || c == 0) {
            optional.ifPresent((Consumer)gyr.u);
            return;
        }
        final elx o = hqo.o;
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
            zdi.k((Bitmap)o.a, (tcc)new gqj(this, optional, 3));
            return;
        }
        optional.ifPresent((Consumer)gyr.u);
    }
    
    public final void b() {
        final ImageView e = this.e;
        if (e != null) {
            e.setImageBitmap((Bitmap)null);
            tpe.v((View)this.e, false);
        }
    }
    
    public final void c() {
        this.i = false;
        ajrk ajrk;
        if ((ajrk = this.m.f().A) == null) {
            ajrk = ajrk.a;
        }
        final ahaz builder = ((ahbh)ajrl.a).createBuilder();
        builder.copyOnWrite();
        ajrl.a((ajrl)builder.instance);
        final ajrl ajrl = (ajrl)builder.build();
        final ahcr b = ajrk.b;
        final Long value = 45382468L;
        ajrl ajrl2 = ajrl;
        if (((Map)b).containsKey(value)) {
            ajrl2 = (ajrl)((Map)b).get(value);
        }
        if (ajrl2.b != 1 || !(boolean)ajrl2.c) {
            this.j = false;
        }
        this.h = null;
        this.g.a();
        tpe.v((View)this.d, false);
    }
    
    public final void d(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        this.e(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        this.g();
    }
    
    public final void e(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        final boolean y = hko.y(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        boolean i = true;
        if (!y) {
            i = (hko.p(reelWatchEndpointOuterClass$ReelWatchEndpoint) && i);
        }
        this.i = i;
        aotp h;
        if ((h = reelWatchEndpointOuterClass$ReelWatchEndpoint.i) == null) {
            h = aotp.a;
        }
        this.h = h;
        this.g.k(h);
    }
    
    public final void f() {
        tpe.v((View)this.e, true);
    }
    
    public final void g() {
        tpe.v((View)this.d, true);
    }
}
