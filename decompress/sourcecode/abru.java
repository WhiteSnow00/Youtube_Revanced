import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.view.accessibility.CaptioningManager$CaptionStyle;
import android.view.accessibility.CaptioningManager$CaptioningChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class abru extends CaptioningManager$CaptioningChangeListener
{
    final /* synthetic */ abrv a;
    
    public abru(final abrv a) {
        this.a = a;
    }
    
    public final void onFontScaleChanged(final float n) {
        super.onFontScaleChanged(n);
        this.a.c(n);
    }
    
    public final void onUserStyleChanged(final CaptioningManager$CaptionStyle captioningManager$CaptionStyle) {
        super.onUserStyleChanged(captioningManager$CaptionStyle);
        final abrv a = this.a;
        a.d(new SubtitlesStyle(captioningManager$CaptionStyle, a.a));
    }
}
