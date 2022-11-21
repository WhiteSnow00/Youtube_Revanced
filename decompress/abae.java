import android.widget.TextView;
import android.view.View;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abae extends aazy
{
    public abae(final Context context, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final ajrb ajrb, final vbs vbs) {
        super(context, creatorEndscreenOverlayPresenter, ajrb, vbs);
    }
    
    public final void f(final View view) {
        super.f(view);
        final TextView textView = (TextView)view.findViewById(2131428890);
        final ajrb b = super.b;
        ajws ajws;
        if ((b.b & 0x10) != 0x0) {
            if ((ajws = b.f) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        tqf.t(textView, (CharSequence)acbu.b(ajws));
    }
}
