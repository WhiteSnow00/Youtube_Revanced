import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aens extends arif
{
    private aens(final Activity activity) {
        super(activity);
    }
    
    public static aens a(final Activity activity) {
        return new aens(activity);
    }
    
    protected final Object b() {
        agot.J(this.a.getApplication() instanceof aenm, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", (Object)this.a.getClass().getSimpleName(), (Object)this.a.getApplication().getClass().getSimpleName());
        return super.b();
    }
}
