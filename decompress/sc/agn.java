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

public final class agn
{
    public static RemoteInput a(final agq agq) {
        final RemoteInput$Builder setChoices = new RemoteInput$Builder((String)agq.e).setLabel((CharSequence)agq.b).setChoices((CharSequence[])null);
        final boolean a = agq.a;
        final RemoteInput$Builder addExtras = setChoices.setAllowFreeFormInput(true).addExtras((Bundle)agq.c);
        final Iterator<Object> iterator = ((Set<Object>)agq.d).iterator();
        while (iterator.hasNext()) {
            ago.a(addExtras, iterator.next(), true);
        }
        if (Build$VERSION.SDK_INT >= 29) {
            agp.b(addExtras, 0);
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
