import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqe
{
    public final acot a;
    public final Object b;
    public final View$OnClickListener c;
    public final acqf d;
    
    public acqe(final acot a, final Object b, final View$OnClickListener c, final acqf d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final acqe a(final acot acot) {
        return new acqe(acot, this.b, this.c, this.d);
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab(this);
        ab.b("event", (Object)this.a);
        ab.b("eventId", this.b);
        ab.b("onRetry", (Object)this.d);
        ab.b("onMore", (Object)this.c);
        ab.b("moreLabel", (Object)null);
        return ab.toString();
    }
}
