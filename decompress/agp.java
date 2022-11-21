import java.util.Set;
import android.app.RemoteInput;
import java.util.Map;
import android.content.Intent;
import android.app.RemoteInput$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

final class agp
{
    static RemoteInput$Builder a(final RemoteInput$Builder remoteInput$Builder, final String s, final boolean b) {
        return remoteInput$Builder.setAllowDataType(s, b);
    }
    
    static Map b(final Intent intent, final String s) {
        return RemoteInput.getDataResultsFromIntent(intent, s);
    }
    
    static Set c(final Object o) {
        return ((RemoteInput)o).getAllowedDataTypes();
    }
    
    static void d(final agr agr, final Intent intent, final Map map) {
        RemoteInput.addDataResultToIntent(ago.a(agr), intent, map);
    }
}
