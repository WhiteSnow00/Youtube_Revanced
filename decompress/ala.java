import android.os.Bundle;
import android.net.Uri;
import android.content.ClipData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ala implements akz
{
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;
    
    public ala(final ClipData a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final ale a() {
        return new ale((alc)new ald(this));
    }
    
    public final void b(final Bundle e) {
        this.e = e;
    }
    
    public final void c(final int c) {
        this.c = c;
    }
    
    public final void d(final Uri d) {
        this.d = d;
    }
}
