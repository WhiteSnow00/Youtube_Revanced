import com.google.mediapipe.framework.GlSyncToken;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrn extends agrt
{
    final /* synthetic */ agro a;
    
    public agrn(final agro a, final int n, final int n2, final int n3) {
        this.a = a;
        super(n, n2, n3);
    }
    
    public final void release() {
        super.release();
        this.a.b(this);
    }
    
    public final void release(final GlSyncToken glSyncToken) {
        super.release(glSyncToken);
        this.a.b(this);
    }
}
