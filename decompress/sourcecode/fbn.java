// 
// Decompiled by Procyon v0.6.0
// 

public enum fbn implements agzm
{
    a("BACKGROUND_AUDIO_POLICY_UNSPECIFIED", 0, 0), 
    b("BACKGROUND_AUDIO_POLICY_ON", 1, 1), 
    c("BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES", 2, 2), 
    d("BACKGROUND_AUDIO_POLICY_OFF", 3, 3);
    
    public final int e;
    
    private fbn(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static fbn a(final int n) {
        if (n == 0) {
            return fbn.a;
        }
        if (n == 1) {
            return fbn.b;
        }
        if (n == 2) {
            return fbn.c;
        }
        if (n != 3) {
            return null;
        }
        return fbn.d;
    }
    
    public static agzo b() {
        return ehk.i;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
