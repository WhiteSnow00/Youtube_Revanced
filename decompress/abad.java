import android.widget.TextView;
import android.view.View;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abad extends aazy
{
    public abad(final Context context, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final ajrb ajrb, final vbs vbs) {
        super(context, creatorEndscreenOverlayPresenter, ajrb, vbs);
    }
    
    public final void f(final View view) {
        super.f(view);
        view.findViewById(2131428890).setVisibility(8);
        view.findViewById(2131428891).setVisibility(0);
        final Context a = super.a;
        final ajrb b = super.b;
        ajws ajws;
        if ((b.b & 0x20) != 0x0) {
            if ((ajws = b.g) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        ((TextView)view.findViewById(2131430487)).setText((CharSequence)a.getString(2132017984, new Object[] { acbu.b(ajws) }));
    }
}
