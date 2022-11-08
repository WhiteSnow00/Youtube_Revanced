import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdo
{
    public ShortsVideoTrimView2 a;
    public rbi b;
    public urf c;
    public uir d;
    public int e;
    private heo f;
    private boolean g;
    private int h;
    private int i;
    private byte j;
    
    public hdo() {
    }
    
    public final hdp a() {
        if (this.j == 7) {
            final heo f = this.f;
            if (f != null) {
                final ShortsVideoTrimView2 a = this.a;
                if (a != null) {
                    final rbi b = this.b;
                    if (b != null) {
                        final urf c = this.c;
                        if (c != null) {
                            final int e = this.e;
                            if (e != 0) {
                                return new hdp(f, a, b, c, this.g, this.h, this.i, this.d, e);
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" videoTrimController");
        }
        if (this.a == null) {
            sb.append(" videoTrimView");
        }
        if (this.b == null) {
            sb.append(" videoControllerView");
        }
        if (this.c == null) {
            sb.append(" videoViewManager");
        }
        if ((this.j & 0x1) == 0x0) {
            sb.append(" isPannableCropEnabled");
        }
        if ((this.j & 0x2) == 0x0) {
            sb.append(" recordedLengthMs");
        }
        if ((this.j & 0x4) == 0x0) {
            sb.append(" maximumRecordingDurationMs");
        }
        if (this.e == 0) {
            sb.append(" trimContext");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b() {
        this.g = true;
        this.j |= 0x1;
    }
    
    public final void c(final int i) {
        this.i = i;
        this.j |= 0x4;
    }
    
    public final void d(final int h) {
        this.h = h;
        this.j |= 0x2;
    }
    
    public final void e(final heo f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null videoTrimController");
    }
}
