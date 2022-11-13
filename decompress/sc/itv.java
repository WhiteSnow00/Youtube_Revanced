import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itv extends uys
{
    public final Rect a;
    
    public itv(final Context context, final uyw uyw) {
        super(context, uyw);
        this.a = new Rect();
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new abud(-1, -1, false);
    }
    
    public final String mr() {
        return "player_overlay_player_info_card_drawer";
    }
}
