import android.os.Bundle;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ewf extends evw
{
    public final Intent getIntent() {
        final Intent intent = super.getIntent();
        try {
            final Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.isEmpty();
            }
        }
        catch (final RuntimeException ex) {
            intent.replaceExtras((Bundle)null);
        }
        return intent;
    }
}
