import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

@atlr(b = "com.google.android.libraries.notifications.internal.scheduled.impl.GnpJobFutureAdapter$executeGnpJob$1", c = "GnpJobFutureAdapter.kt", d = "invokeSuspend", e = { 17 })
final class ppg extends atlv implements atmp
{
    int a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ ptb c;
    
    public ppg(final ptb c, final Bundle b, final atld atld) {
        this.c = c;
        this.b = b;
        super(2, atld);
    }
    
    public final atld create(final Object o, final atld atld) {
        return (atld)new ppg(this.c, this.b, atld);
    }
    
    public final Object invokeSuspend(Object a) {
        final atlk a2 = atlk.a;
        if (this.a != 0) {
            arxj.h(a);
        }
        else {
            arxj.h(a);
            final ptb c = this.c;
            final Bundle b = this.b;
            this.a = 1;
            if ((a = c.a(b, (atld)this)) == a2) {
                return a2;
            }
        }
        return a;
    }
}
