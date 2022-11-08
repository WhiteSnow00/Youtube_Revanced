// 
// Decompiled by Procyon v0.6.0
// 

public enum aomr implements agzm
{
    a("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED", 0, 0), 
    b("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_CONTENT_VIDEO_START", 1, 1), 
    c("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_AD_FINISH", 2, 4), 
    d("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_START", 3, 5), 
    e("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_FINISH", 4, 2), 
    f("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_START", 5, 6), 
    g("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_FINISH", 6, 7), 
    h("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PLAYBACK_FINISH", 7, 3);
    
    private static final agzn i;
    private final int k;
    
    static {
        i = (agzn)new afom(5);
    }
    
    private aomr(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static agzo a() {
        return aoiz.r;
    }
    
    public static aomr b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return aomr.g;
            }
            case 6: {
                return aomr.f;
            }
            case 5: {
                return aomr.d;
            }
            case 4: {
                return aomr.c;
            }
            case 3: {
                return aomr.h;
            }
            case 2: {
                return aomr.e;
            }
            case 1: {
                return aomr.b;
            }
            case 0: {
                return aomr.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
