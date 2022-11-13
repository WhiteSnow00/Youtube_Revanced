import android.opengl.GLU;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public class aavz
{
    private final String a;
    private boolean b;
    public int c;
    
    public aavz(String glGetProgramInfoLog, final String s) {
        final String simpleName = this.getClass().getSimpleName();
        this.a = simpleName;
        aatt.g(this.c = GLES20.glCreateProgram());
        final int a = this.a(35633, glGetProgramInfoLog);
        final int a2 = this.a(35632, s);
        GLES20.glAttachShader(this.c, a);
        GLES20.glAttachShader(this.c, a2);
        GLES20.glLinkProgram(this.c);
        final int[] array = { 0 };
        GLES20.glGetProgramiv(this.c, 35714, array, 0);
        if (array[0] == 1) {
            GLES20.glDeleteShader(a);
            GLES20.glDeleteShader(a2);
            return;
        }
        glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.c);
        final StringBuilder sb = new StringBuilder("Failed to link GlProgram ");
        sb.append(simpleName);
        sb.append(": ");
        sb.append(glGetProgramInfoLog);
        ttr.b(sb.toString());
        final StringBuilder sb2 = new StringBuilder("Failed to link GlProgram ");
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(glGetProgramInfoLog);
        throw new aatr(sb2.toString());
    }
    
    private final int a(int glCreateShader, String glGetShaderInfoLog) {
        glCreateShader = GLES20.glCreateShader(glCreateShader);
        aatt.g(glCreateShader);
        GLES20.glShaderSource(glCreateShader, glGetShaderInfoLog);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] == 1) {
            return glCreateShader;
        }
        glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("Failed to compile shader for GlProgram ");
        sb.append(a);
        sb.append(": ");
        sb.append(glGetShaderInfoLog);
        ttr.b(sb.toString());
        final String a2 = this.a;
        final StringBuilder sb2 = new StringBuilder("Failed to compile shader for GlProgram ");
        sb2.append(a2);
        sb2.append(": ");
        sb2.append(glGetShaderInfoLog);
        throw new aatr(sb2.toString());
    }
    
    protected final int e(final String s) {
        final int glGetAttribLocation = GLES20.glGetAttribLocation(this.c, s);
        this.g(glGetAttribLocation, s);
        return glGetAttribLocation;
    }
    
    protected final int f(final String s) {
        final int glGetUniformLocation = GLES20.glGetUniformLocation(this.c, s);
        this.g(glGetUniformLocation, s);
        return glGetUniformLocation;
    }
    
    protected final void g(int glGetError, final String s) {
        if (glGetError == -1) {
            while (true) {
                glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    break;
                }
                ttr.b("GL error ".concat(String.valueOf(GLU.gluErrorString(glGetError))));
            }
            final String a = this.a;
            final StringBuilder sb = new StringBuilder("Invalid GL location: ");
            sb.append(a);
            sb.append(": ");
            sb.append(s);
            ttr.b(sb.toString());
        }
    }
    
    public final void h() {
        if (this.b) {
            return;
        }
        final int[] array = { 0 };
        GLES20.glValidateProgram(this.c);
        GLES20.glGetProgramiv(this.c, 35715, array, 0);
        if (array[0] == 1) {
            this.b = true;
            return;
        }
        final String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.c);
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("Failed to validate GlProgram ");
        sb.append(a);
        sb.append(": ");
        sb.append(glGetProgramInfoLog);
        ttr.b(sb.toString());
        final String a2 = this.a;
        final StringBuilder sb2 = new StringBuilder("Failed to validate GlProgram ");
        sb2.append(a2);
        sb2.append(": ");
        sb2.append(glGetProgramInfoLog);
        throw new aatr(sb2.toString());
    }
    
    public void i() {
        final int c = this.c;
        if (c != 0) {
            GLES20.glDeleteProgram(c);
            final Boolean a = aatt.a;
            this.c = 0;
        }
    }
    
    public final void j() {
        GLES20.glUseProgram(this.c);
        final Boolean a = aatt.a;
    }
}
