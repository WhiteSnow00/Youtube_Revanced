import com.google.mediapipe.framework.GlSyncToken;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtm extends agts
{
    final agtn a;
    
    public agtm(final agtn a, final int n, final int n2, final int n3) {
        this.a = a;
        super(n, n2, n3);
    }
    
    @Override
    public final void release() {
        super.release();
        this.a.b(this);
    }
    
    @Override
    public final void release(final GlSyncToken glSyncToken) {
        super.release(glSyncToken);
        this.a.b(this);
    }
}
