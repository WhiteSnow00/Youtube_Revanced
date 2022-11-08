import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iuo implements absb
{
    public final kzc a;
    public final atid b;
    public View c;
    private final Context d;
    
    public iuo(final Context d) {
        this.d = d;
        final atid ad = atid.aD();
        this.b = ad;
        this.a = (kzc)new ium(ad);
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new absc(-1, -1, false);
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
