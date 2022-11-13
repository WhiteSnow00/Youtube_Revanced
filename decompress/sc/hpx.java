import java.util.Iterator;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpx extends abde
{
    public int a;
    
    public hpx(final Context context) {
        super(context);
        this.a = 1;
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -1);
    }
    
    public final void c(final List list) {
        final ArrayList list2 = new ArrayList();
        for (final SubtitleWindowSnapshot subtitleWindowSnapshot : list) {
            final int a = this.a;
            if (a == 2) {
                final SubtitleWindowSettings c = subtitleWindowSnapshot.c;
                list2.add(new SubtitleWindowSnapshot(subtitleWindowSnapshot.a, subtitleWindowSnapshot.b, subtitleWindowSnapshot.d, subtitleWindowSnapshot.e, new SubtitleWindowSettings(9, 0, 0, c.e, c.f)));
            }
            else if (a == 3) {
                final SubtitleWindowSettings c2 = subtitleWindowSnapshot.c;
                list2.add(new SubtitleWindowSnapshot(subtitleWindowSnapshot.a, subtitleWindowSnapshot.b, subtitleWindowSnapshot.d, subtitleWindowSnapshot.e, new SubtitleWindowSettings(33, 0, 100, c2.e, c2.f)));
            }
            else {
                list2.add(subtitleWindowSnapshot);
            }
        }
        super.c((List)list2);
    }
}
