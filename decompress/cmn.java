import android.app.Notification;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmn
{
    public final int a;
    public final int b;
    public final Notification c;
    
    public cmn(final int a, final Notification c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final cmn cmn = (cmn)o;
            return this.a == cmn.a && this.b == cmn.b && this.c.equals(cmn.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a * 31 + this.b) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ForegroundInfo{mNotificationId=");
        sb.append(this.a);
        sb.append(", mForegroundServiceType=");
        sb.append(this.b);
        sb.append(", mNotification=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
