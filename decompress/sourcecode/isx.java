import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isx extends uwv
{
    public final Rect a;
    
    public isx(final Context context, final uwz uwz) {
        super(context, uwz);
        this.a = new Rect();
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new absc(-1, -1, false);
    }
    
    public final String mr() {
        return "player_overlay_player_info_card_drawer";
    }
}
