import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public class acqd implements acqf
{
    private final tun a;
    private final boolean b;
    private final Intent c;
    private final acbk d;
    
    public acqd(final tun a, final boolean b, final Intent c, final acbk d) {
        this.a = a;
        this.b = true;
        this.c = c;
        this.d = d;
    }
    
    public int a() {
        return this.a.a;
    }
    
    public acbk b() {
        return this.d;
    }
    
    public CharSequence c() {
        return (CharSequence)this.a.b;
    }
    
    public boolean d() {
        return this.b;
    }
}
