import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.Map;
import android.graphics.Paint$Style;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grw
{
    public final Paint a;
    public final Rect b;
    public final float c;
    public final abbu d;
    
    public grw(final Resources resources) {
        this.b = new Rect(0, 0, tmy.aZ(resources.getDisplayMetrics(), 4), tmy.aZ(resources.getDisplayMetrics(), 2));
        this.c = tmy.aX(resources.getDisplayMetrics(), 1.0f);
        final Paint a = new Paint();
        (this.a = a).setStyle(Paint$Style.FILL);
        a.setAntiAlias(true);
        a.setColor(resources.getColor(2131102393));
        this.d = new abbu((byte[])null, (byte[])null);
    }
    
    public static aexq c(final Map map) {
        if (map == null) {
            return (aexq)aewp.a;
        }
        if (map.containsKey(abcg.e)) {
            final TimelineMarker[] array = map.get(abcg.e);
            Object o;
            if (array.length == 1) {
                o = aexq.k(array[0]);
            }
            else {
                o = aewp.a;
            }
            return (aexq)o;
        }
        return (aexq)aewp.a;
    }
    
    public static boolean d(final Map map) {
        return c(map).h();
    }
    
    public final float a(final long n, long min, final Rect rect) {
        min = Math.min(n, Math.max(0L, min));
        return (float)Math.max(0, rect.left + (int)(rect.width() * min / n) - this.b.width() / 2);
    }
    
    public final float b(final long n, long min, final Rect rect) {
        min = Math.min(n, Math.max(0L, min));
        return (float)Math.max(0, rect.left + (int)(rect.width() * min / n) - this.b.width() / 2);
    }
}
