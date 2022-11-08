import android.graphics.drawable.Drawable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acft extends dcl
{
    public acft(final dbo dbo, final dmg dmg, final dmq dmq, final Context context) {
        super(dbo, dmg, dmq, context);
    }
    
    protected final void p(final dnp dnp) {
        if (dnp instanceof acfp) {
            super.p(dnp);
            return;
        }
        super.p((dnp)new acfp().d((dng)dnp));
    }
}
