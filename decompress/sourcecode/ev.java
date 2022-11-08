import android.content.Context;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ev extends ArrayAdapter
{
    public ev(final Context context, final int n, final CharSequence[] array) {
        super(context, n, 16908308, (Object[])array);
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
