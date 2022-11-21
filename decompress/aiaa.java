// 
// Decompiled by Procyon v0.6.0
// 

public enum aiaa implements ahdd
{
    a("BACKGROUND_PLAYBACK_BUTTON_TYPE_UNKNOWN", 0, 0), 
    b("BACKGROUND_PLAYBACK_BUTTON_TYPE_PLAY_PAUSE", 1, 1), 
    c("BACKGROUND_PLAYBACK_BUTTON_TYPE_PREVIOUS_VIDEO", 2, 2), 
    d("BACKGROUND_PLAYBACK_BUTTON_TYPE_NEXT_VIDEO", 3, 3), 
    e("BACKGROUND_PLAYBACK_BUTTON_TYPE_DISMISS", 4, 4), 
    f("BACKGROUND_PLAYBACK_BUTTON_TYPE_SEEK_BACKWARDS", 5, 5), 
    g("BACKGROUND_PLAYBACK_BUTTON_TYPE_SEEK_FORWARDS", 6, 6);
    
    private static final aiaa[] h;
    private final int i;
    
    private aiaa(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahdf a() {
        return ahvv.o;
    }
    
    public static aiaa b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return aiaa.g;
            }
            case 5: {
                return aiaa.f;
            }
            case 4: {
                return aiaa.e;
            }
            case 3: {
                return aiaa.d;
            }
            case 2: {
                return aiaa.c;
            }
            case 1: {
                return aiaa.b;
            }
            case 0: {
                return aiaa.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}
