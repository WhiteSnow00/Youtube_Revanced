import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abuw implements zos
{
    public final List a;
    public final List b;
    
    public abuw() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final abux b() {
        if (this.a.isEmpty() || this.a.get(0) != 0L) {
            this.a.add(0, 0L);
            this.b.add(0, SubtitleWindowSettings.a);
        }
        return new abux(this.a, this.b);
    }
}
