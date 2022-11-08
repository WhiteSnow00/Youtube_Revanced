// 
// Decompiled by Procyon v0.6.0
// 

public enum anae implements agzm
{
    a("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN", 0, 0), 
    b("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_LINE_OUT", 1, 1), 
    c("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HEADPHONES", 2, 2), 
    d("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_A2DP", 3, 3), 
    e("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_RECEIVER", 4, 4), 
    f("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_SPEAKER", 5, 5), 
    g("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HDMI", 6, 6), 
    h("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_AIR_PLAY", 7, 7), 
    i("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_LE", 8, 8), 
    j("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_HFP", 9, 9), 
    k("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_USB_AUDIO", 10, 10), 
    l("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_CAR_PLAY", 11, 11), 
    m("PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_ANDROID_AUDIO", 12, 12);
    
    public final int n;
    
    private anae(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static agzo a() {
        return anaf.b;
    }
    
    public static anae b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return anae.m;
            }
            case 11: {
                return anae.l;
            }
            case 10: {
                return anae.k;
            }
            case 9: {
                return anae.j;
            }
            case 8: {
                return anae.i;
            }
            case 7: {
                return anae.h;
            }
            case 6: {
                return anae.g;
            }
            case 5: {
                return anae.f;
            }
            case 4: {
                return anae.e;
            }
            case 3: {
                return anae.d;
            }
            case 2: {
                return anae.c;
            }
            case 1: {
                return anae.b;
            }
            case 0: {
                return anae.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.n;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}
