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

public final class adbm implements acil, acie
{
    private final wwv a;
    private final bi b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final tdz f;
    private final acih g;
    private adbl h;
    
    public adbm(final vax vax, final wwv a, final bi b, final tdz f) {
        this.a = a;
        this.b = b;
        f.getClass();
        this.f = f;
        final View inflate = View.inflate((Context)((br)b).od(), 2131625370, (ViewGroup)null);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131429270);
        this.e = (TextView)inflate.findViewById(2131429479);
        this.g = new acih(vax, inflate, (acie)this);
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
    }
    
    public final boolean h(final View view) {
        this.f.d((Object)new acze());
        if (this.h != null) {
            final agza builder = ((agzi)alff.a).createBuilder();
            final agza builder2 = ((agzi)alfl.a).createBuilder();
            final adbl h = this.h;
            final String a = adbl.a((aioe)h.d);
            if (h.e == null) {
                final Object d = h.d;
                if (d != null && ((agzd)d).rs((agyr)AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
                    h.e = ((ahpv)((agzd)h.d).rr((agyr)AndroidApplicationEndpointOuterClass.androidAppEndpoint)).d;
                }
            }
            final String format = String.format("%s/%s", a, h.e);
            builder2.copyOnWrite();
            final alfl alfl = (alfl)builder2.instance;
            format.getClass();
            alfl.b |= 0x1;
            alfl.c = format;
            builder.copyOnWrite();
            final alff alff = (alff)builder.instance;
            final alfl j = (alfl)builder2.build();
            j.getClass();
            alff.j = j;
            alff.b |= 0x20;
            final alff alff2 = (alff)builder.build();
            final Object c = this.h.c;
            if (c != null) {
                this.a.J(3, (wxz)new wws((byte[])c), alff2);
            }
        }
        this.b.pJ();
        return false;
    }
}
