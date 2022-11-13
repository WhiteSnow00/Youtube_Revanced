import android.view.View;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavl implements View$OnClickListener, aavk
{
    public aavj a;
    private final TouchImageView b;
    
    public aavl(final TouchImageView b) {
        (this.b = b).setOnClickListener((View$OnClickListener)this);
    }
    
    public final void c(final boolean b) {
        tpe.v((View)this.b, b);
    }
    
    public final void onClick(final View view) {
        final aavj a = this.a;
        if (a != null) {
            a.c();
        }
    }
}
