import java.util.List;
import java.util.Iterator;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxc extends acja
{
    final LinearLayout a;
    private final Context b;
    private final acio c;
    private final tdz d;
    private final View e;
    private final hmb f;
    
    public fxc(final Context b, final giz c, final hmb f, final tdz d, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = (acio)c;
        this.f = f;
        this.d = d;
        final View inflate = View.inflate(b, 2131624246, (ViewGroup)null);
        this.e = inflate;
        this.a = (LinearLayout)inflate.findViewById(2131430118);
        c.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.c).a;
    }
    
    public final void c(final acir acir) {
    }
}
