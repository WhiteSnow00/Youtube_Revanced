import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aceu implements zmj
{
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    
    public aceu(final tud c, final int a) {
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = aajj.A();
    }
    
    public aceu(final zmj b, final aeyr c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static void a(final InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        }
        catch (final IOException ex) {}
    }
}
