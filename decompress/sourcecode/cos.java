import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cos implements Runnable
{
    private final cou a;
    private final Intent b;
    private final int c;
    
    public cos(final cou a, final Intent b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.a.d(this.b, this.c);
    }
}
