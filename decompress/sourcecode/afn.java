import android.app.Notification$BigTextStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afn extends aft
{
    private CharSequence a;
    
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
    
    public final void b(final afg afg) {
        final Notification$BigTextStyle a = afm.a(afm.c(afm.b(((agf)afg).b), this.c), this.a);
        if (this.e) {
            afm.d(a, this.d);
        }
    }
    
    public final void c(final CharSequence charSequence) {
        this.a = afp.c(charSequence);
    }
    
    public final void d(final CharSequence charSequence) {
        this.c = afp.c(charSequence);
    }
}
