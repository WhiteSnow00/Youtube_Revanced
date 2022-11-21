import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhg
{
    public final auny a;
    public auom b;
    public int c;
    private int d;
    
    public arhg() {
        this.a = new auny(6407);
    }
    
    public final void a(int d, final int n) {
        final float n2 = (float)this.c;
        final float n3 = (float)Math.max(d, n);
        final float n4 = (float)d;
        final float min = Math.min(1.0f, n2 / n3);
        this.a.b(Math.round(n4 * min), Math.round(n * min));
        GLES20.glBindFramebuffer(36160, this.a.a);
        final auny a = this.a;
        final int c = a.c;
        final int d2 = a.d;
        if (c >= d) {
            d = 1;
        }
        else {
            final int n5 = d / c;
            if (d % c == 0 && n % d2 == 0 && (n5 & 0x1) == 0x0) {
                d = Math.min(8, n5 >> 1);
            }
            else {
                d = Math.min(8, n5);
            }
        }
        final auom b = this.b;
        if (b != null && d != this.d) {
            b.c();
            this.b = null;
        }
        if (this.b == null) {
            Object b2;
            if (d != 1) {
                if (d != 2) {
                    b2 = new arhi("uniform vec2 xUnit;\nuniform vec2 yUnit;\nuniform int samplingFactor;\n\nvoid main() {\n  float k = float(samplingFactor - 1) / -2.0;\n  vec4 sum = vec4(0.0);\n  vec2 dx = xUnit * k;\n  for (int ix = 0; ix < samplingFactor; ++ix) {\n    vec2 dy = yUnit * k;\n    for (int iy = 0; iy < samplingFactor; ++iy) {\n      sum += sample(tc + dx + dy);\n      dy += yUnit;\n    }\n    dx += xUnit;\n  }\n  gl_FragColor = sum / float(samplingFactor * samplingFactor);\n}\n", new arhh(d));
                }
                else {
                    b2 = new arhi("uniform vec2 xUnit;\nuniform vec2 yUnit;\n\nvoid main() {\n  vec2 halfX = 0.5 * xUnit;\n  vec2 halfY = 0.5 * yUnit;\n  gl_FragColor = 0.25 * ((sample(tc - halfX - halfY) + sample(tc + halfX - halfY))\n      + (sample(tc - halfX + halfY) + sample(tc + halfX + halfY)));\n}\n", new arhh(d));
                }
            }
            else {
                b2 = new aunv();
            }
            this.b = (auom)b2;
            this.d = d;
        }
    }
}
