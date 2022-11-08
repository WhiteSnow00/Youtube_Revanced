import androidx.cardview.widget.CardView;
import android.widget.Button;
import j$.util.Optional;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextUtils;
import java.util.function.Consumer;
import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.app.common.ui.bottomui.Mealbar;

// 
// Decompiled by Procyon v0.6.0
// 

final class gbi implements gaw
{
    private final Mealbar a;
    private final aceo b;
    private final uyi c;
    private final zhb d;
    
    public gbi(final Mealbar a, final aceo b, final zhb d, final uyi c, final byte[] array) {
        (this.a = a).setOnClickListener((View$OnClickListener)null);
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    private static final View$OnClickListener b(final View$OnClickListener view$OnClickListener, final qpt qpt) {
        Object o;
        if (view$OnClickListener == null) {
            o = new fuh(qpt, 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        else {
            o = new exm(view$OnClickListener, qpt, 19, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        return (View$OnClickListener)o;
    }
}
