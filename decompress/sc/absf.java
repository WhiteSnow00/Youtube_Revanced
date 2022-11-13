import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absf extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, String s) {
        final absz absz = deque.peekFirst();
        if (absz == null) {
            return;
        }
        final int g = aale.g(attributes, 0, new String[] { "w", "win", "id" });
        s = aale.j(attributes, new String[] { "t", "start" });
        if (s == null) {
            return;
        }
        final int int1 = Integer.parseInt(s);
        s = attributes.getValue("op");
        if (s != null && s.equals("define")) {
            s = aale.j(attributes, new String[] { "ap" });
            int f;
            if (s != null) {
                f = aale.f(Integer.parseInt(s));
            }
            else {
                f = 34;
            }
            s = aale.j(attributes, new String[] { "ah" });
            int max;
            if (s != null) {
                max = Math.max(0, Math.min(Integer.parseInt(s), 100));
            }
            else {
                max = 50;
            }
            s = aale.j(attributes, new String[] { "av" });
            int max2;
            if (s != null) {
                max2 = Math.max(0, Math.min(Integer.parseInt(s), 100));
            }
            else {
                max2 = 95;
            }
            s = aale.j(attributes, new String[] { "vs" });
            absz.b(g).e(int1, new SubtitleWindowSettings(f, max, max2, s == null || Boolean.parseBoolean(s), aale.j(attributes, new String[] { "sd" }) != null));
        }
    }
}
