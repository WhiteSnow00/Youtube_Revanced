import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtm implements zmx
{
    public final List a;
    public final List b;
    
    public abtm() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final abtn b() {
        if (this.a.isEmpty() || this.a.get(0) != 0L) {
            this.a.add(0, 0L);
            this.b.add(0, SubtitleWindowSettings.a);
        }
        return new abtn(this.a, this.b);
    }
}
