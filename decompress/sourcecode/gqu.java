import java.util.concurrent.atomic.AtomicReference;
import android.view.WindowManager;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import j$.util.Optional;
import android.view.ViewGroup;
import android.graphics.Rect;
import android.graphics.Point;
import android.os.Build$VERSION;
import android.app.Activity;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqu implements vau
{
    public static final afik a;
    private final gqw b;
    private final hdv c;
    
    static {
        a = afik.m("com/google/android/apps/youtube/app/extensions/assistant/connection/AssistantQueryCommandResolver");
    }
    
    public gqu(final gqw b, final hdv c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (((agzd)aioe).rs((agyr)ajoo.b)) {
            final String c = ((ajoo)((agzd)aioe).rr((agyr)ajoo.b)).c;
            final hdv c2 = this.c;
            final agza builder = grd.a.createBuilder();
            builder.copyOnWrite();
            final grd grd = (grd)builder.instance;
            c.getClass();
            grd.b |= 0x1;
            grd.c = c;
            builder.copyOnWrite();
            final grd grd2 = (grd)builder.instance;
            grd2.b |= 0x2;
            grd2.d = true;
            final gqt gqt = (gqt)c2.b;
            final WindowManager windowManager = ((Activity)gqt.b).getWindowManager();
            int n;
            int n2;
            if (Build$VERSION.SDK_INT >= 30) {
                final Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                n = bounds.height();
                n2 = bounds.width();
            }
            else {
                final Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                n = point.y;
                n2 = point.x;
            }
            final double g = ((uyi)gqt.f.a).g(45371854L);
            final double g2 = ((uyi)gqt.f.a).g(45371855L);
            final boolean inMultiWindowMode = gqt.e.isInMultiWindowMode();
            int n5;
            if (n > n2) {
                final double n3 = n;
                Double.isNaN(n3);
                final int n4 = n5 = (int)(n3 * g);
                if (!inMultiWindowMode) {
                    final Rect rect = gqt.c.get();
                    if (rect == null) {
                        n5 = Math.max(n4, n - ((ViewGroup)gqt.d.a()).getBottom());
                    }
                    else {
                        n5 = Math.max(n4, n - rect.top - rect.bottom - ((ViewGroup)gqt.d.a()).getBottom());
                    }
                }
            }
            else {
                final double n6 = n;
                Double.isNaN(n6);
                n5 = (int)(n6 * g2);
            }
            final afii afii = (afii)((afii)((afig)gqt.a).b()).j("com/google/android/apps/youtube/app/extensions/assistant/common/ui/AssistantUiUtils", "getDrlHeightCap", 112, "AssistantUiUtils.java");
            final Integer value = n;
            final AtomicReference c3 = gqt.c;
            final Integer value2 = n5;
            afii.E((Object)value, (Object)inMultiWindowMode, (Object)n2, (Object)value, (Object)c3, (Object)value2, (Object)g, (Object)g2);
            Optional optional;
            if (n5 > 0) {
                optional = Optional.of((Object)value2);
            }
            else {
                optional = Optional.empty();
            }
            builder.getClass();
            optional.ifPresent((Consumer)new gft(builder, 14));
            builder.copyOnWrite();
            final grd grd3 = (grd)builder.instance;
            grd3.f = 2;
            grd3.b |= 0x8;
            builder.copyOnWrite();
            final grd grd4 = (grd)builder.instance;
            grd4.b |= 0x10;
            final boolean b = false;
            grd4.g = false;
            boolean i = b;
            if (((uyi)((cya)c2.a).a).f(45373712L)) {
                i = b;
                if (((bx)c2.c).X()) {
                    i = true;
                }
            }
            builder.copyOnWrite();
            final grd grd5 = (grd)builder.instance;
            grd5.b |= 0x20;
            grd5.h = (i ^ true);
            builder.copyOnWrite();
            final grd grd6 = (grd)builder.instance;
            grd6.b |= 0x40;
            grd6.i = i;
            afld.o(this.b.a((grd)builder.build()), (afsz)new gqy(1), (Executor)afsl.a);
            return;
        }
        throw new vbh();
    }
}
