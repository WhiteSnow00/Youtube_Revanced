// 
// Decompiled by Procyon v0.6.0
// 

public enum anbc implements agzm
{
    a("AUDIO_ROUTE_TYPE_UNKNOWN", 0, 0), 
    b("AUDIO_ROUTE_TYPE_PHONE_SPEAKERS", 1, 1), 
    c("AUDIO_ROUTE_TYPE_WIRED_HEADPHONES", 2, 2), 
    d("AUDIO_ROUTE_TYPE_BLUETOOTH_DEVICE", 3, 3);
    
    public final int e;
    
    private anbc(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return anaf.c;
    }
    
    public static anbc b(final int n) {
        if (n == 0) {
            return anbc.a;
        }
        if (n == 1) {
            return anbc.b;
        }
        if (n == 2) {
            return anbc.c;
        }
        if (n != 3) {
            return null;
        }
        return anbc.d;
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
