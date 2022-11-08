import android.graphics.drawable.Drawable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class acpr extends qjg
{
    public boolean g;
    public boolean h;
    public String i;
    public final Context j;
    
    public acpr(final Context j, final String s) {
        super(s);
        this.j = j;
    }
    
    public void a(final boolean g) {
        this.g = g;
        Drawable drawable;
        if (g) {
            drawable = this.j.getResources().getDrawable(2131232645);
        }
        else {
            drawable = null;
        }
        super.e = drawable;
    }
    
    public int b() {
        return 2131624094;
    }
}
