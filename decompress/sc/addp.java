import android.graphics.drawable.Drawable;
import java.util.Map;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addp implements acko, ackh
{
    private final wyw a;
    private final bi b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final tgd f;
    private final ackk g;
    private addo h;
    
    public addp(final vcy vcy, final wyw a, final bi b, final tgd f) {
        this.a = a;
        this.b = b;
        f.getClass();
        this.f = f;
        final View inflate = View.inflate((Context)b.od(), 2131625375, (ViewGroup)null);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131429270);
        this.e = (TextView)inflate.findViewById(2131429479);
        this.g = new ackk(vcy, inflate, (ackh)this);
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acku acku) {
    }
    
    public final boolean h(final View view) {
        this.f.d((Object)new adbh());
        if (this.h != null) {
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            final ahaz builder2 = ((ahbh)alho.a).createBuilder();
            final addo h = this.h;
            final String a = addo.a((aiqj)h.d);
            if (h.e == null) {
                final Object d = h.d;
                if (d != null && ((ahbc)d).ry((ahaq)AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
                    h.e = ((ahrt)((ahbc)h.d).rx((ahaq)AndroidApplicationEndpointOuterClass.androidAppEndpoint)).d;
                }
            }
            final String format = String.format("%s/%s", a, h.e);
            builder2.copyOnWrite();
            final alho alho = (alho)builder2.instance;
            format.getClass();
            alho.b |= 0x1;
            alho.c = format;
            builder.copyOnWrite();
            final alhi alhi = (alhi)builder.instance;
            final alho j = (alho)builder2.build();
            j.getClass();
            alhi.j = j;
            alhi.b |= 0x20;
            final alhi alhi2 = (alhi)builder.build();
            final Object c = this.h.c;
            if (c != null) {
                this.a.J(3, (wzz)new wyt((byte[])c), alhi2);
            }
        }
        this.b.pO();
        return false;
    }
    
    public final /* bridge */ void mN(final ackm ackm, Object c) {
        final addo h = (addo)c;
        this.g.a(this.a, (aiqj)h.d, (Map)null);
        c = h.c;
        if (c != null) {
            this.a.t((wzz)new wyt((byte[])c), (alhi)null);
        }
        this.d.setImageDrawable((Drawable)h.a);
        this.e.setText((CharSequence)h.b);
        this.h = h;
    }
}
