import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavn implements aapp
{
    public final Handler a;
    public final aavq b;
    public final aatj c;
    private final int d;
    
    public aavn(final Handler a, final aavq b, final aatj c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        if (this.d != 0) {
            final Handler a = this.a;
            final aavq b = this.b;
            final aatj c = this.c;
            a.post((Runnable)new aavc(b, 2));
            ((aasb)c.a.b).l = false;
            final aath h = c.h;
            if (h != null) {
                ((aaus)h).i();
            }
            return;
        }
        final Handler a2 = this.a;
        final aavq b2 = this.b;
        final aatj c2 = this.c;
        a2.post((Runnable)new aavc(b2, 3));
        c2.g();
    }
}
