import java.util.Map;
import java.util.HashMap;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import java.nio.FloatBuffer;
import java.nio.Buffer;
import android.opengl.GLES20;
import javax.microedition.khronos.opengles.GL10;
import com.google.mediapipe.framework.TextureFrame;
import java.util.concurrent.atomic.AtomicReference;
import android.opengl.GLSurfaceView$Renderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtp implements GLSurfaceView$Renderer
{
    public float a;
    public float b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final float[] k;
    private final AtomicReference l;
    
    public agtp() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.i = 36197;
        this.a = 0.5f;
        this.b = 0.5f;
        this.k = new float[16];
        this.l = new AtomicReference();
    }
    
    public final void a(final int e, final int f) {
        this.e = e;
        this.f = f;
    }
    
    public final void b(final TextureFrame textureFrame) {
        final TextureFrame textureFrame2 = this.l.getAndSet(textureFrame);
        if (textureFrame2 != null && textureFrame2 != textureFrame) {
            textureFrame2.release();
        }
    }
    
    public final void c() {
        if (this.g == 0) {
            this.i = 3553;
            return;
        }
        throw new IllegalStateException("setTextureTarget must be called before the surface is created");
    }
    
    public final void onDrawFrame(final GL10 gl10) {
        final AtomicReference l = this.l;
        final TextureFrame textureFrame = null;
        TextureFrame textureFrame2 = l.getAndSet(null);
        GLES20.glClear(16384);
        agub.c("glClear");
        if (textureFrame2 == null) {
            textureFrame2 = textureFrame;
        }
        else {
            GLES20.glActiveTexture(33984);
            agub.c("glActiveTexture");
            GLES20.glBindTexture(this.i, textureFrame2.getTextureName());
            agub.c("glBindTexture");
            GLES20.glTexParameteri(this.i, 10241, 9729);
            GLES20.glTexParameteri(this.i, 10240, 9729);
            GLES20.glTexParameteri(this.i, 10242, 33071);
            GLES20.glTexParameteri(this.i, 10243, 33071);
            agub.c("texture setup");
            GLES20.glUseProgram(this.g);
            GLES20.glUniform1i(this.h, 0);
            GLES20.glUniformMatrix4fv(this.j, 1, false, this.k, 0);
            agub.c("glUniformMatrix4fv");
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer)agtw.a);
            final int e = this.e;
            float n;
            if (e > 0) {
                n = this.c / (float)e;
            }
            else {
                n = 1.0f;
            }
            final int f = this.f;
            float n2;
            if (f > 0) {
                n2 = this.d / (float)f;
            }
            else {
                n2 = 1.0f;
            }
            final float max = Math.max(n, n2);
            final float n3 = n / max;
            final float n4 = n2 / max;
            final float n5 = (1.0f - n3) * this.a;
            final float n6 = (1.0f - n4) * this.b;
            final float n7 = n3 + n5;
            final float n8 = n4 + n6;
            final FloatBuffer b = agub.b(new float[] { n5, n6, n7, n6, n5, n8, n7, n8 });
            GLES20.glEnableVertexAttribArray(2);
            GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer)b);
            agub.c("program setup");
            GLES20.glDrawArrays(5, 0, 4);
            agub.c("glDrawArrays");
            GLES20.glBindTexture(this.i, 0);
            agub.c("unbind surfaceTexture");
        }
        GLES20.glFlush();
        if (textureFrame2 != null) {
            textureFrame2.release();
        }
    }
    
    public final void onSurfaceChanged(final GL10 gl10, final int c, final int d) {
        GLES20.glViewport(0, 0, this.c = c, this.d = d);
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        Matrix.setIdentityM(this.k, 0);
        final HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        String s;
        if (this.i != 36197) {
            s = "varying mediump vec2 sample_coordinate;\nuniform sampler2D video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}";
        }
        else {
            s = "#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}";
        }
        final int d = agub.d(s, (Map)hashMap);
        this.g = d;
        this.h = GLES20.glGetUniformLocation(d, "video_frame");
        this.j = GLES20.glGetUniformLocation(this.g, "texture_transform");
        agub.c("glGetUniformLocation");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
