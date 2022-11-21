import org.chromium.net.CronetEngine$Builder$LibraryLoader;
import org.chromium.net.ExperimentalCronetEngine$Builder;
import java.net.URL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrw implements tdn
{
    public final URL a;
    public final adfa b;
    
    public adrw(final adfa b, final URL a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(final Object o, final Object o2) {
        final adfa b = this.b;
        final URL a = this.a;
        final Object o3 = null;
        final adrx libraryLoader = new adrx(b, null);
        final ExperimentalCronetEngine$Builder experimentalCronetEngine$Builder = (ExperimentalCronetEngine$Builder)o;
        experimentalCronetEngine$Builder.setLibraryLoader((CronetEngine$Builder$LibraryLoader)libraryLoader);
        experimentalCronetEngine$Builder.enableQuic(true);
        experimentalCronetEngine$Builder.enableHttp2(((alff)b.b).g);
        if (a.getDefaultPort() != -1) {
            experimentalCronetEngine$Builder.addQuicHint(a.getHost(), a.getDefaultPort(), a.getDefaultPort());
        }
        experimentalCronetEngine$Builder.setExperimentalOptions(((alff)b.b).f);
        Object o4 = null;
        try {
            ((ExperimentalCronetEngine$Builder)o).build();
        }
        finally {
            final Throwable t;
            tut.d("Failed to construct CronetEngine using ".concat((String)o2), t);
            o4 = o3;
        }
        return o4;
    }
}
