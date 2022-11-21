import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import android.os.Build;
import android.opengl.GLSurfaceView$EGLConfigChooser;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfh implements GLSurfaceView$EGLConfigChooser
{
    private static final boolean a;
    
    static {
        a = Build.FINGERPRINT.contains("generic_x86");
    }
    
    private static int a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig, final int n) {
        final int[] array = { 0 };
        if (egl10.eglGetConfigAttrib(eglDisplay, eglConfig, n, array)) {
            return array[0];
        }
        return 0;
    }
    
    public final EGLConfig chooseConfig(final EGL10 egl10, final EGLDisplay eglDisplay) {
        final int[] array2;
        final int[] array = array2 = new int[17];
        array2[0] = 12324;
        array2[1] = 8;
        array2[2] = 12323;
        array2[3] = 8;
        array2[4] = 12322;
        array2[5] = 8;
        array2[6] = 12321;
        array2[7] = 0;
        array2[8] = 12325;
        array2[9] = 0;
        array2[10] = 12326;
        array2[11] = 0;
        array2[12] = 12352;
        array2[13] = 64;
        array2[14] = 12339;
        array2[15] = 4100;
        array2[16] = 12344;
        final int[] array3 = { 0 };
        if (!egl10.eglChooseConfig(eglDisplay, array, (EGLConfig[])null, 0, array3) && !arfh.a) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        array[15] = 4;
        if (!egl10.eglChooseConfig(eglDisplay, array, (EGLConfig[])null, 0, array3)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = 0;
        final int n = array3[0];
        if (n <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        final EGLConfig[] array4 = new EGLConfig[n];
        if (!egl10.eglChooseConfig(eglDisplay, array, array4, n, array3)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        EGLConfig eglConfig = null;
        Label_0364: {
            if (arfh.a) {
                eglConfig = array4[0];
            }
            else {
                while (i < n) {
                    final EGLConfig eglConfig2 = array4[i];
                    final int a = a(egl10, eglDisplay, eglConfig2, 12325);
                    final int a2 = a(egl10, eglDisplay, eglConfig2, 12326);
                    final int a3 = a(egl10, eglDisplay, eglConfig2, 12324);
                    final int a4 = a(egl10, eglDisplay, eglConfig2, 12323);
                    final int a5 = a(egl10, eglDisplay, eglConfig2, 12322);
                    final int a6 = a(egl10, eglDisplay, eglConfig2, 12339);
                    if (a3 == 8 && a4 == 8 && a5 == 8 && a == 0 && a2 == 0 && (a6 & 0x1000) != 0x0) {
                        eglConfig = eglConfig2;
                        break Label_0364;
                    }
                    ++i;
                }
                eglConfig = null;
            }
        }
        if (eglConfig != null) {
            return eglConfig;
        }
        throw new IllegalArgumentException("No config chosen");
    }
}
