import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.view.View;
import java.util.Map;
import java.util.function.Consumer;
import android.content.Context;
import java.util.WeakHashMap;
import android.widget.EdgeEffect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqv extends EdgeEffect
{
    public final WeakHashMap a;
    
    public kqv(final Context context) {
        super(context);
        this.a = new WeakHashMap();
    }
    
    private final void a(final Consumer consumer) {
        for (final Map.Entry<View, V> entry : this.a.entrySet()) {
            final View view = entry.getKey();
            final EdgeEffect edgeEffect = (EdgeEffect)((WeakReference)entry.getValue()).get();
            if (edgeEffect != null) {
                consumer.accept(edgeEffect);
                view.invalidate();
            }
        }
    }
    
    public final void finish() {
        super.finish();
        this.a((Consumer)kbd.d);
    }
    
    public final void onAbsorb(final int n) {
        super.onAbsorb(n);
        this.a(new iyb(n, 5));
    }
    
    public final void onPull(final float n) {
        super.onPull(n);
        this.a(new kqt(n, 0));
    }
    
    public final void onPull(final float n, final float n2) {
        super.onPull(n, n2);
        this.a(new kqu(n, n2, 0));
    }
    
    public final float onPullDistance(final float n, final float n2) {
        this.a(new kqu(n, n2, 1));
        return super.onPullDistance(n, n2);
    }
    
    public final void onRelease() {
        super.onRelease();
        this.a((Consumer)kbd.e);
    }
}
