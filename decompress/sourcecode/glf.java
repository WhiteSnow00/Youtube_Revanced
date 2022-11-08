// 
// Decompiled by Procyon v0.6.0
// 

public enum glf
{
    a("NONE", 0, 0.0f), 
    b("AUTOPLAYABLE", 1, 0.0f), 
    c("INLINE_PLAYBACK", 2, 0.5f), 
    d("INLINE_PLAYBACK_VIDEO_FEED", 3, 0.0f), 
    e("INLINE_SURVEY_PLAYABLE", 4, 0.0f), 
    f("PROMOTED_VIDEO_PLAYABLE", 5, 0.0f), 
    g("CAROUSEL_PLAYABLE", 6, 0.0f), 
    h("DEFAULT_PROMO_PANEL", 7, 0.0f), 
    i("DISCOVERY_ACTION_VIDEO_PLAYABLE", 8, 0.0f), 
    j("DISCOVERY_APP_VIDEO_PLAYABLE", 9, 0.0f), 
    k("PROMOTED_SPARKLES_TEXT_CTD_HOME_THEMED_CTA_HIGHLIGHTABLE", 10, 0.0f), 
    l("PROMOTED_SPARKLES_TEXT_CTD_HOME_THEMED_CTA_COMPACT_HIGHLIGHTABLE", 11, 0.0f), 
    m("PROMOTED_SPARKLES_TEXT_HOME_THEMED_CTA_HIGHLIGHTABLE", 12, 0.0f), 
    n("PROMOTED_SPARKLES_TEXT_HOME_THEMED_LARGE_SQUARE_CTA_HIGHLIGHTABLE", 13, 0.0f);
    
    public final float o;
    
    private glf(final String s, final int n, final float o) {
        this.o = o;
    }
}
