import java.util.Iterator;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EdgeEffect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apk
{
    public static float a(final EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        }
        finally {
            return 0.0f;
        }
    }
    
    public static float b(final EdgeEffect edgeEffect, final float n, final float n2) {
        try {
            return edgeEffect.onPullDistance(n, n2);
        }
        finally {
            edgeEffect.onPull(n, n2);
            return 0.0f;
        }
    }
    
    public static EdgeEffect c(final Context context, final AttributeSet set) {
        try {
            return new EdgeEffect(context, set);
        }
        finally {
            return new EdgeEffect(context);
        }
    }
    
    public static final void d(final View view) {
        final Iterator a = asbq.d((atqh)new anh(view, (atov)null)).a();
        while (a.hasNext()) {
            e((View)a.next()).f();
        }
    }
    
    public static final avv e(final View view) {
        avv avv;
        if ((avv = (avv)view.getTag(2131430513)) == null) {
            avv = new avv((byte[])null);
            view.setTag(2131430513, (Object)avv);
        }
        return avv;
    }
}
