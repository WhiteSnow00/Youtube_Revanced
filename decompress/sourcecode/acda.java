import android.view.ViewParent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acda implements ors
{
    public final vax a;
    
    public acda(final vax a, final acbo acbo, final uyi uyi) {
        this.a = a;
        final acca a2 = acbo.a();
        final aqnb a3 = aqnb.a;
        dyo.b = a3.c;
        dyo.c = a3.d;
        dyo.d = a3.e;
        final acbm acbm = (acbm)a2;
        final int g = acbm.g;
        final int a4 = dyq.a();
        final int n = 1;
        int n2 = a4;
        if (a4 <= 0) {
            n2 = 1;
        }
        int min = Math.min((int)Math.ceil(n2 * acbm.a), g);
        if (min <= 0) {
            min = n;
        }
        dyo.u = new aerl(min, min, -2);
        if (acbm.b) {
            dyo.v = dyo.u;
        }
        dyo.j = uyi.f(45383649L);
        dyo.l = acbm.f;
        eam.a = acbm.i;
        dyo.o = acbm.k;
        ego.a = uyi.f(45360801L);
    }
    
    private static View c(final View view) {
        if (view.getTag(2131428821) instanceof aqdw) {
            return view;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View c = c(viewGroup.getChildAt(i));
                if (c != null) {
                    return c;
                }
            }
        }
        return null;
    }
    
    @Override
    public final agyr a() {
        return (agyr)akhk.a;
    }
}
