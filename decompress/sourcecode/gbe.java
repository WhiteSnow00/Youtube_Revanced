import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbe
{
    public YouTubeTextView a;
    public HatsSurvey b;
    private HatsContainer c;
    private HatsHorizontalSurvey d;
    
    private gbe() {
    }
    
    public gbe(final HatsContainer c) {
        this.c = c;
    }
    
    public final View a(final int n) {
        return LayoutInflater.from(this.c.getContext()).inflate(n, this.c.f, false);
    }
    
    public final HatsHorizontalSurvey b() {
        if (this.d == null) {
            this.d = (HatsHorizontalSurvey)this.a(2131624509);
        }
        return this.d;
    }
}
