import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.view.accessibility.CaptioningManager$CaptionStyle;
import android.view.accessibility.CaptioningManager$CaptioningChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class abtv extends CaptioningManager$CaptioningChangeListener
{
    final abtw a;
    
    public abtv(final abtw a) {
        this.a = a;
    }
    
    public final void onFontScaleChanged(final float n) {
        super.onFontScaleChanged(n);
        this.a.c(n);
    }
    
    public final void onUserStyleChanged(final CaptioningManager$CaptionStyle captioningManager$CaptionStyle) {
        super.onUserStyleChanged(captioningManager$CaptionStyle);
        final abtw a = this.a;
        a.d(new SubtitlesStyle(captioningManager$CaptionStyle, a.a));
    }
}
