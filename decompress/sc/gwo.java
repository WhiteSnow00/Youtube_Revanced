import java.util.Map;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.function.ToIntFunction;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwo implements ToIntFunction
{
    public static final gwo a;
    public static final gwo b;
    public static final gwo c;
    public static final gwo d;
    public static final gwo e;
    public static final gwo f;
    private final int g;
    
    static {
        f = new gwo(5);
        e = new gwo(4);
        d = new gwo(3);
        c = new gwo(2);
        b = new gwo(1);
        a = new gwo(0);
    }
    
    private gwo(final int g) {
        this.g = g;
    }
    
    @Override
    public final int applyAsInt(final Object o) {
        final int g = this.g;
        if (g == 0) {
            arbj arbj;
            if ((arbj = ((arbk)o).f) == null) {
                arbj = arbj.a;
            }
            return arbj.d;
        }
        int n = 1;
        if (g == 1) {
            return ((gjt)o).b;
        }
        if (g == 2) {
            return ((SubtitleTrack)o).a();
        }
        if (g == 3) {
            arbj arbj2;
            if ((arbj2 = ((arbo)o).d) == null) {
                arbj2 = arbj.a;
            }
            return arbj2.c;
        }
        if (g != 4) {
            return ((Map.Entry)o).getValue();
        }
        final int cw = aqsx.cw(((vkd)o).c.b);
        if (cw != 0) {
            n = cw;
        }
        return n - 1;
    }
}
