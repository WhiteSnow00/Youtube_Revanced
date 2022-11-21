import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import android.webkit.WebView;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cly
{
    public static final clz a;
    
    static {
        try {
            Label_0050: {
                if (Build$VERSION.SDK_INT >= 28) {
                    final ClassLoader classLoader = clp.c();
                    break Label_0050;
                }
                try {
                    final Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class<?>[])new Class[0]);
                    declaredMethod.setAccessible(true);
                    final ClassLoader classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
                    final clz clz = new cma((WebViewProviderFactoryBoundaryInterface)auig.a(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", (Class<?>[])new Class[0]).invoke(null, new Object[0])));
                    goto Label_0153;
                }
                catch (final IllegalAccessException ex) {
                    throw new RuntimeException(ex);
                }
                catch (final InvocationTargetException ex2) {
                    final RuntimeException ex3 = new(java.lang.RuntimeException.class)();
                    final RuntimeException ex5;
                    final RuntimeException ex4 = ex5 = ex3;
                    final InvocationTargetException ex6 = ex2;
                    new RuntimeException(ex6);
                    throw ex4;
                }
                catch (final NoSuchMethodException ex8) {
                    try {
                        throw new RuntimeException(ex8);
                    }
                    catch (final NoSuchMethodException ex9) {
                        throw new RuntimeException(ex9);
                    }
                    catch (final ClassNotFoundException ex10) {
                        final clz clz = new cls();
                    }
                    catch (final InvocationTargetException ex11) {
                        throw new RuntimeException(ex11);
                    }
                    catch (final IllegalAccessException ex12) {
                        throw new RuntimeException(ex12);
                    }
                }
            }
            try {
                final RuntimeException ex3 = new(java.lang.RuntimeException.class)();
                final RuntimeException ex5;
                final RuntimeException ex4 = ex5 = ex3;
                final InvocationTargetException ex2;
                final InvocationTargetException ex6 = ex2;
                new RuntimeException(ex6);
                throw ex4;
            }
            catch (final NoSuchMethodException ex13) {}
            catch (final ClassNotFoundException ex14) {}
            catch (final InvocationTargetException ex15) {}
            catch (final IllegalAccessException ex16) {}
        }
        catch (final NoSuchMethodException ex17) {}
        catch (final ClassNotFoundException ex18) {}
        catch (final InvocationTargetException ex19) {}
        catch (final IllegalAccessException ex20) {}
    }
}
