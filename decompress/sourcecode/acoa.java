import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acoa
{
    public final acmq a;
    public final Object b;
    public final View$OnClickListener c;
    public final acob d;
    
    public acoa(final acmq a, final Object b, final View$OnClickListener c, final acob d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final acoa a(final acmq acmq) {
        return new acoa(acmq, this.b, this.c, this.d);
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("event", (Object)this.a);
        o.b("eventId", this.b);
        o.b("onRetry", (Object)this.d);
        o.b("onMore", (Object)this.c);
        o.b("moreLabel", (Object)null);
        return o.toString();
    }
}
