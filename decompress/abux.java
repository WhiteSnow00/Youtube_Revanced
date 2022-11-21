import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abux
{
    final List a;
    private final List b;
    
    public abux(final List list, final List list2) {
        adme.U(list.size() == list2.size(), "startTimes and settings differ in size");
        this.a = Collections.unmodifiableList((List<?>)list);
        this.b = Collections.unmodifiableList((List<?>)list2);
    }
    
    public final SubtitleWindowSettings a(final long n) {
        synchronized (this) {
            final int binarySearch = Collections.binarySearch(this.a, n);
            if (binarySearch >= 0) {
                return (SubtitleWindowSettings)this.b.get(binarySearch);
            }
            final int n2 = -binarySearch - 2;
            if (n2 >= 0) {
                return (SubtitleWindowSettings)this.b.get(n2);
            }
            return SubtitleWindowSettings.a;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.size(); ++i) {
            sb.append("[");
            sb.append(this.a.get(i));
            sb.append(": ");
            sb.append(this.b.get(i));
            sb.append("]");
        }
        return sb.toString();
    }
}
