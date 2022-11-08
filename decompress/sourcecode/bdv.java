import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdv
{
    public bdu a;
    public float b;
    private int c;
    
    public bdv(final Context context, final bdu a) {
        this.b = 1.0f;
        dk.d((Object)context.getApplicationContext().getSystemService("audio"));
        this.a = a;
        final int a2 = bdt.a;
        this.c = 0;
    }
    
    public static final void b() {
        if (!baw.aa(null, null)) {
            dk.g(true, (Object)"Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }
    
    public final void a() {
    }
    
    public final int c(final boolean b) {
        if (b) {
            return 1;
        }
        return -1;
    }
}
