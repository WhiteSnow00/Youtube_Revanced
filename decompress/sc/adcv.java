import java.util.Map;
import java.util.HashMap;
import android.view.View;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcv implements View$OnLongClickListener
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public adcv(final adcw a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adcv(final kpq b, final ReelItemRendererOuterClass$ReelItemRenderer a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final boolean onLongClick(final View view) {
        if (this.c != 0) {
            final Object b = this.b;
            final Object a = this.a;
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
            final kpq kpq = (kpq)b;
            final bu h = kpq.h;
            amgv amgv;
            if ((amgv = ((ReelItemRendererOuterClass$ReelItemRenderer)a).n) == null) {
                amgv = amgv.a;
            }
            amgs amgs;
            if ((amgs = amgv.c) == null) {
                amgs = amgs.a;
            }
            acsb.a(h, amgs, kpq.d, kpq.i, (Map)hashMap);
            return true;
        }
        ((adcw)this.a).d((vcy)this.b);
        return true;
    }
}
