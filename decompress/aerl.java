import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aerl extends arno
{
    private aerl(final Activity activity) {
        super(activity);
    }
    
    public static aerl a(final Activity activity) {
        return new aerl(activity);
    }
    
    @Override
    protected final Object b() {
        adme.Z(this.a.getApplication() instanceof aerf, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", this.a.getClass().getSimpleName(), this.a.getApplication().getClass().getSimpleName());
        return super.b();
    }
}
