import android.widget.TextView;
import android.content.Context;
import android.view.View$OnClickListener;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqy extends on
{
    public final ImageView t;
    public final Object u;
    public final Object v;
    
    public acqy(final acqx acqx, final View view, final agkw v, final byte[] array, final byte[] array2) {
        super(view);
        this.u = acqx;
        this.v = v;
        final Context context = view.getContext();
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setOnClickListener((View$OnClickListener)acqx);
        this.t = (ImageView)view.findViewById(2131428844);
    }
    
    public acqy(final View view) {
        super(view);
        this.t = (ImageView)view.findViewById(2131427581);
        this.u = view.findViewById(2131427582);
        this.v = view.findViewById(2131427573);
    }
}
