import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public class aalr
{
    private final SubtitleTrack a;
    private final boolean b;
    
    public aalr(final SubtitleTrack subtitleTrack) {
        this(subtitleTrack, false);
    }
    
    public aalr(final SubtitleTrack a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public SubtitleTrack a() {
        return this.a;
    }
    
    public String b() {
        final SubtitleTrack a = this.a;
        String l;
        if (a != null) {
            l = a.l();
        }
        else {
            l = "-";
        }
        return l;
    }
    
    public boolean c() {
        return this.b;
    }
}
