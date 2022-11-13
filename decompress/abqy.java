import java.util.Iterator;
import java.util.List;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqy
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    
    public abqy(final bx bx, final bx bx2, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = bx2.F((Class)xl.class);
        this.c = bx.F((Class)xi.class);
        this.b = bx.F((Class)wu.class);
    }
    
    public abqy(final VideoOptionsParcel videoOptionsParcel) {
        this.a = videoOptionsParcel.a;
        this.c = videoOptionsParcel.b;
        this.b = videoOptionsParcel.c;
    }
    
    public abqy(final boolean a, final boolean b, final boolean c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final List list) {
        if (this.b() && list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((za)iterator.next()).a();
            }
        }
    }
    
    public final boolean b() {
        return this.a || this.c || this.b;
    }
}
