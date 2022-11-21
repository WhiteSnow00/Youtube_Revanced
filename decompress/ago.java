import java.util.Set;
import android.content.Intent;
import java.util.Iterator;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.RemoteInput$Builder;
import android.app.RemoteInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ago
{
    public static RemoteInput a(final agr agr) {
        final RemoteInput$Builder setChoices = new RemoteInput$Builder((String)agr.e).setLabel((CharSequence)agr.b).setChoices((CharSequence[])null);
        final boolean a = agr.a;
        final RemoteInput$Builder addExtras = setChoices.setAllowFreeFormInput(true).addExtras((Bundle)agr.c);
        final Iterator<Object> iterator = ((Set<Object>)agr.d).iterator();
        while (iterator.hasNext()) {
            agp.a(addExtras, iterator.next(), true);
        }
        if (Build$VERSION.SDK_INT >= 29) {
            agq.b(addExtras, 0);
        }
        return addExtras.build();
    }
    
    public static Bundle b(final Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
    
    static void c(final Object o, final Intent intent, final Bundle bundle) {
        RemoteInput.addResultsToIntent((RemoteInput[])o, intent, bundle);
    }
}
