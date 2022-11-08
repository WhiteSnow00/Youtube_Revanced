import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.content.Context;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public enum abrt
{
    a("MONOSPACED_SERIF", 0, 0, c("fonts/MonoSerif-Regular.ttf")), 
    b("PROPORTIONAL_SERIF", 1, 1, b(Typeface.create("serif", 0))), 
    c("MONOSPACED_SANS_SERIF", 2, 2, b(Typeface.create("monospace", 0))), 
    d("PROPORTIONAL_SANS_SERIF", 3, 3, b(Typeface.create("sans-serif", 0))), 
    e("CASUAL", 4, 4, c("fonts/ComingSoon-Regular.ttf")), 
    f("CURSIVE", 5, 5, c("fonts/DancingScript-Regular.ttf")), 
    g("SMALL_CAPITALS", 6, 6, c("fonts/CarroisGothicSC-Regular.ttf")), 
    h("INLINE_MUTED", 7, 8, (abrs)new abrr(g2, 2));
    
    public final int i;
    private final abrs k;
    private Typeface l;
    
    static {
        final abyk g2 = abyk.g;
        g2.getClass();
    }
    
    private abrt(final String s, final int n, final int i, final abrs k) {
        this.i = i;
        this.k = k;
    }
    
    public static Typeface a(final Context context, final SubtitlesStyle subtitlesStyle) {
        final int f = subtitlesStyle.f;
        if (f != 7) {
            final abrt[] values = values();
            for (int i = 0; i < values.length; ++i) {
                final abrt abrt = values[i];
                if (abrt.i == f) {
                    if (abrt.l == null) {
                        abrt.l = abrt.k.a(context);
                    }
                    return values[i].l;
                }
            }
            return null;
        }
        return ((CaptioningManager)context.getSystemService("captioning")).getUserStyle().getTypeface();
    }
    
    private static abrs b(final Typeface typeface) {
        return (abrs)new abrr(typeface, 0);
    }
    
    private static abrs c(final String s) {
        return (abrs)new abrr(s, 1);
    }
}
