import android.content.res.Resources$NotFoundException;
import android.util.Log;
import android.net.Uri;
import android.content.res.Resources;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dip implements dii
{
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    
    public dip(final AssetManager c, final dhk b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public dip(final Resources c, final dii b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    private final Uri c(final Integer n) {
        try {
            final String resourcePackageName = ((Resources)this.c).getResourcePackageName((int)n);
            final String resourceTypeName = ((Resources)this.c).getResourceTypeName((int)n);
            final String resourceEntryName = ((Resources)this.c).getResourceEntryName((int)n);
            final StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(resourcePackageName);
            sb.append("/");
            sb.append(resourceTypeName);
            sb.append("/");
            sb.append(resourceEntryName);
            return Uri.parse(sb.toString());
        }
        catch (final Resources$NotFoundException ex) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                new StringBuilder("Received invalid resource id: ").append(n);
                Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(n)), (Throwable)ex);
            }
            return null;
        }
    }
}
