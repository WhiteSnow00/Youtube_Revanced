import android.text.Spanned;
import android.view.ViewGroup;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjd extends jhu
{
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final acio e;
    
    public jjd(final Context context, final giz e, final vax vax) {
        super(context, vax);
        e.getClass();
        this.e = (acio)e;
        final View inflate = View.inflate(context, 2131625420, (ViewGroup)null);
        this.b = inflate;
        this.c = (YouTubeTextView)inflate.findViewById(2131431535);
        this.d = (YouTubeTextView)inflate.findViewById(2131431295);
        e.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.e).a;
    }
}
