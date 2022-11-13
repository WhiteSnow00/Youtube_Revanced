import android.content.res.Resources$NotFoundException;
import android.util.Log;
import android.net.Uri;
import android.content.res.Resources;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class diq implements dij
{
    private final int a;
    private final Object b;
    private final Object c;
    
    public diq(final AssetManager c, final dhl b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public diq(final Resources c, final dij b, final int a) {
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
    
    @Override
    public final boolean a(final Object o) {
        if (this.a != 0) {
            final Uri uri = (Uri)o;
            return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
        final Integer n = (Integer)o;
        return true;
    }
    
    @Override
    public final aln b(final Object o, final int n, final int n2, final ddp ddp) {
        if (this.a != 0) {
            final Uri uri = (Uri)o;
            return new aln((ddk)new dos((Object)uri), ((dhl)this.b).a((AssetManager)this.c, uri.toString().substring(22)));
        }
        final Uri c = this.c((Integer)o);
        if (c == null) {
            return null;
        }
        return ((dij)this.b).b(c, n, n2, ddp);
    }
}
