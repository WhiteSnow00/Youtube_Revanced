import com.google.vr.cardboard.ExternalSurfaceManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcb implements arch
{
    public final ExternalSurfaceManager a;
    private final int b;
    
    public arcb(final ExternalSurfaceManager a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final arcf arcf) {
        if (this.b != 0) {
            final arcc a = this.a.a;
            if (arcf.i) {
                if (arcf.d.getAndSet(0) > 0) {
                    arcf.g.updateTexImage();
                    arcf.g.getTransformMatrix(arcf.c);
                    a.a(arcf.a, arcf.f[0], arcf.g.getTimestamp(), arcf.c);
                }
            }
            return;
        }
        final arcc a2 = this.a.a;
        if (arcf.i) {
            if (arcf.d.get() > 0) {
                arcf.d.decrementAndGet();
                arcf.g.updateTexImage();
                arcf.g.getTransformMatrix(arcf.c);
                a2.a(arcf.a, arcf.f[0], arcf.g.getTimestamp(), arcf.c);
            }
        }
    }
}
