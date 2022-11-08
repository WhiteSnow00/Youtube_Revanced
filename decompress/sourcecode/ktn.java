import android.content.Context;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class ktn extends acpr
{
    private final Drawable a;
    
    public ktn(final Context context, final String s) {
        super(context, s);
        this.a = tmy.k(context, 2131233679, 2130970924);
    }
    
    public final void a(final boolean b) {
        super.a(b);
        Drawable a;
        if (b) {
            a = this.a;
        }
        else {
            a = null;
        }
        ((qjg)this).e = a;
    }
}
