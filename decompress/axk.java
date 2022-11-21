import android.os.Build$VERSION;
import android.media.VolumeProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public class axk
{
    public int a;
    private final int b;
    private final int c;
    private final String d;
    private VolumeProvider e;
    
    public axk(final int b, final int c, final int a, final String d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public final Object a() {
        if (this.e == null) {
            if (Build$VERSION.SDK_INT >= 30) {
                this.e = new axh(this, this.b, this.c, this.a, this.d);
            }
            else {
                this.e = new axi(this, this.b, this.c, this.a);
            }
        }
        return this.e;
    }
    
    public void b(final int n) {
        throw null;
    }
    
    public void c(final int n) {
        throw null;
    }
}
