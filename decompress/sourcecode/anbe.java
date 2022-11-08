// 
// Decompiled by Procyon v0.6.0
// 

public enum anbe implements agzm
{
    a("PLAYBACK_INTERRUPTION_TYPE_UNKNOWN", 0, 0), 
    b("PLAYBACK_INTERRUPTION_TYPE_AUDIO_BECOMING_NOISY", 1, 1), 
    c("PLAYBACK_INTERRUPTION_TYPE_POOR_NETWORK", 2, 2), 
    d("PLAYBACK_INTERRUPTION_TYPE_PLAYER_EXCEPTION", 3, 3), 
    e("PLAYBACK_INTERRUPTION_TYPE_UNEXPECTED_BACKGROUND_SERVICE_DESTROYED", 4, 4);
    
    public final int f;
    
    private anbe(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return anaf.f;
    }
    
    public static anbe b(final int n) {
        if (n == 0) {
            return anbe.a;
        }
        if (n == 1) {
            return anbe.b;
        }
        if (n == 2) {
            return anbe.c;
        }
        if (n == 3) {
            return anbe.d;
        }
        if (n != 4) {
            return null;
        }
        return anbe.e;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
