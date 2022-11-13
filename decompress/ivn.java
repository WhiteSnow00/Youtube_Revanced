import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivn implements abuc
{
    public final laf a;
    public final ativ b;
    public View c;
    private final Context d;
    
    public ivn(final Context d) {
        this.d = d;
        final ativ ae = ativ.aE();
        this.b = ae;
        this.a = (laf)new ivl(ae);
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new abud(-1, -1, false);
    }
    
    public final void c() {
        if (this.c != null) {
            return;
        }
        this.c = LayoutInflater.from(this.d).inflate(2131624414, (ViewGroup)null);
    }
    
    public final View md() {
        this.c();
        final View c = this.c;
        c.getClass();
        return c;
    }
    
    public final String mr() {
        return "player_overlay_fullscreen_engagement_panel_scrim";
    }
}
