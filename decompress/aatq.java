import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aatq extends aauk
{
    private static final float[] c;
    protected final aavi a;
    protected aavk b;
    private final aavh d;
    private float e;
    
    static {
        c = new float[] { -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f };
    }
    
    public aatq(final aavi a, final aavk b) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.d = new aavh(aatq.c, 3);
    }
    
    public final void a(final aavk b) {
        this.b = b;
    }
    
    public final void b() {
    }
    
    protected abstract aaxm g();
    
    public final void p(final foq foq) {
        if (this.b.a() && !this.b.b()) {
            this.e = (float)Math.random();
        }
        this.a.h();
    }
    
    public final void r(final agmq agmq) {
        final aaxm g = this.g();
        if (((aaxi)g).c != 0) {
            this.a.f();
            ((aaxi)g).j();
            g.b.c(this.a);
            final float e = this.e;
            final aavk b = this.b;
            g.d.a(e, b.a, b.b);
            GLES20.glEnableVertexAttribArray(g.a);
            final Boolean a = aavd.a;
            this.d.a(g.a);
            ((aaxi)g).h();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(g.a);
            return;
        }
        tut.b("Error drawing! Program not created.");
    }
    
    public final void rQ() {
        this.d.b();
    }
}
