import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acdb implements ors
{
    private final Context a;
    
    public acdb(final Context a) {
        this.a = a;
    }
    
    private final void d(final int n) {
        Toast.makeText(this.a, (CharSequence)this.a.getString(n), 1).show();
    }
    
    @Override
    public final agyr a() {
        return (agyr)aqis.b;
    }
}
