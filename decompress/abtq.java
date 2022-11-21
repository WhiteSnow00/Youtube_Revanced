import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtq extends ume
{
    public final void J(final Deque deque, final Attributes attributes, String s) {
        final abuj abuj = deque.peekFirst();
        if (abuj == null) {
            return;
        }
        final int g = aana.g(attributes, 0, "w", "win", "id");
        s = aana.j(attributes, "t", "start");
        if (s == null) {
            return;
        }
        final int int1 = Integer.parseInt(s);
        s = attributes.getValue("op");
        if (s != null && s.equals("define")) {
            s = aana.j(attributes, "ap");
            int f;
            if (s != null) {
                f = aana.f(Integer.parseInt(s));
            }
            else {
                f = 34;
            }
            s = aana.j(attributes, "ah");
            int max;
            if (s != null) {
                max = Math.max(0, Math.min(Integer.parseInt(s), 100));
            }
            else {
                max = 50;
            }
            s = aana.j(attributes, "av");
            int max2;
            if (s != null) {
                max2 = Math.max(0, Math.min(Integer.parseInt(s), 100));
            }
            else {
                max2 = 95;
            }
            s = aana.j(attributes, "vs");
            abuj.b(g).e(int1, new SubtitleWindowSettings(f, max, max2, s == null || Boolean.parseBoolean(s), aana.j(attributes, "sd") != null));
        }
    }
}
