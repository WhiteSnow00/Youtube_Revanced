import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrl implements zla
{
    public final List a;
    public final List b;
    
    public abrl() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    public final abrm b() {
        if (this.a.isEmpty() || this.a.get(0) != 0L) {
            this.a.add(0, 0L);
            this.b.add(0, SubtitleWindowSettings.a);
        }
        return new abrm(this.a, this.b);
    }
}
