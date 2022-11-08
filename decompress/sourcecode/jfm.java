import android.view.View$OnClickListener;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import android.content.Context;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfm extends jfl implements tec
{
    public String b;
    public Boolean c;
    public ikm d;
    private final Activity e;
    private final tdz f;
    private final fml g;
    private final OfflineArrowView h;
    private final atjj i;
    private final atjj j;
    private final lfy k;
    private final alm l;
    private final eg m;
    
    public jfm(final Activity e, final Context context, final vax vax, final lfy k, final tdz f, final fml g, final giz giz, final alm alm, final eg m, final alm l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, vax, giz, alm, 2131624114, new nx(context.getResources().getDimensionPixelSize(2131165565), context.getResources().getDimensionPixelSize(2131165563)), new nx(context.getResources().getDimensionPixelSize(2131165565), context.getResources().getDimensionPixelSize(2131165562)), context.getResources().getDimensionPixelSize(2131165561), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = k;
        this.m = m;
        this.l = l;
        this.h = (OfflineArrowView)this.a().findViewById(2131430125);
        this.i = (atjj)new jex(this, 2);
        this.j = (atjj)eps.n;
    }
    
    public final void c(final acir acir) {
        this.f.m((Object)this);
        this.d = null;
        this.b = null;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 5: {
                if (!((zwe)o).a.equals(this.b)) {
                    break;
                }
                ((ijy)this.d).a();
                return null;
            }
            case 4: {
                final zwd zwd = (zwd)o;
                if (!zwd.a.d().equals(this.b)) {
                    break;
                }
                ((ijy)this.d).b(ijk.a((zza)zwd.a));
                return null;
            }
            case 3: {
                final zwb zwb = (zwb)o;
                if (!zwb.a.d().equals(this.b)) {
                    break;
                }
                ((ijy)this.d).b(ijk.a((zza)zwb.a));
                return null;
            }
            case 2: {
                if (!((zvz)o).a.equals(this.b)) {
                    break;
                }
                ((ijy)this.d).a();
                return null;
            }
            case 1: {
                if (!((zvy)o).a.equals(this.b)) {
                    break;
                }
                ((ijy)this.d).a();
                return null;
            }
            case 0: {
                if (!((zvx)o).a.equals(this.b)) {
                    break;
                }
                ((ijy)this.d).a();
                return null;
            }
            case -1: {
                array = new Class[] { zvx.class, zvy.class, zvz.class, zwb.class, zwd.class, zwe.class };
                break;
            }
        }
        return array;
    }
}
