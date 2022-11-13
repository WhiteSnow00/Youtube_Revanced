import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.io.File;
import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbc implements tet
{
    public final hbg a;
    public final boolean b;
    public final boolean c;
    public final Uri d;
    public final String e;
    
    public hbc(final hbg a, final boolean b, final boolean c, final Uri d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final Object o) {
        final hbg a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final Uri d = this.d;
        final String e = this.e;
        a.s((List)o, b, c);
        if (d != null && !d.equals((Object)Uri.EMPTY)) {
            if (e != null) {
                a.s.put(d, new File(e));
            }
            a.r((DeviceLocalFile)a.l.f.get(d), true);
        }
    }
}
