// 
// Decompiled by Procyon v0.6.0
// 

public enum aore implements ahdd
{
    a("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED", 0, 0), 
    b("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_CONTENT_VIDEO_START", 1, 1), 
    c("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_AD_FINISH", 2, 4), 
    d("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_START", 3, 5), 
    e("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_FINISH", 4, 2), 
    f("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_START", 5, 6), 
    g("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_FINISH", 6, 7), 
    h("SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PLAYBACK_FINISH", 7, 3);
    
    private static final ahde i;
    private static final aore[] j;
    private final int k;
    
    static {
        j = c();
        i = (ahde)new afsc(5);
    }
    
    private aore(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static ahdf a() {
        return aonf.t;
    }
    
    public static aore b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return aore.g;
            }
            case 6: {
                return aore.f;
            }
            case 5: {
                return aore.d;
            }
            case 4: {
                return aore.c;
            }
            case 3: {
                return aore.h;
            }
            case 2: {
                return aore.e;
            }
            case 1: {
                return aore.b;
            }
            case 0: {
                return aore.a;
            }
        }
    }
    
    private static aore[] c() {
        return new aore[] { aore.a, aore.b, aore.c, aore.d, aore.e, aore.f, aore.g, aore.h };
    }
    
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
