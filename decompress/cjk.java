import java.util.Collection;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import android.graphics.Matrix;
import android.view.View;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import java.lang.reflect.InvocationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjk
{
    public cjk() {
    }
    
    public cjk(final InvocationHandler invocationHandler) {
        final WebMessagePortBoundaryInterface webMessagePortBoundaryInterface = (WebMessagePortBoundaryInterface)auig.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
    
    static void a(final View view, final Matrix animationMatrix) {
        view.setAnimationMatrix(animationMatrix);
    }
    
    static void b(final View view, final Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
    
    static void c(final View view, final Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
    
    public static final dah d(final ArrayList list, final long b, final dag dag) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("SKU cannot be null.");
        }
        if (list.size() > 1) {
            final SkuDetails skuDetails = list.get(0);
            final String d = skuDetails.d();
            for (int size = list.size(), i = 0; i < size; ++i) {
                final SkuDetails skuDetails2 = (SkuDetails)list.get(i);
                if (!d.equals("play_pass_subs") && !skuDetails2.d().equals("play_pass_subs") && !d.equals(skuDetails2.d())) {
                    throw new IllegalArgumentException("SKUs should have the same type.");
                }
            }
            final String a = skuDetails.a();
            for (int size2 = list.size(), j = 0; j < size2; ++j) {
                final SkuDetails skuDetails3 = (SkuDetails)list.get(j);
                if (!d.equals("play_pass_subs") && !skuDetails3.d().equals("play_pass_subs") && !a.equals(skuDetails3.a())) {
                    throw new IllegalArgumentException("All SKUs must have the same package name.");
                }
            }
        }
        final dah dah = new dah();
        final boolean a2 = list.get(0).a().isEmpty() ^ true;
        dah.a = a2;
        if (!a2 && b > 0L) {
            throw new IllegalArgumentException("Transaction id is only set for cross sell purchases.");
        }
        dah.b = b;
        dah.e = dag.a();
        dah.d = new ArrayList(list);
        dah.c = afgh.q();
        return dah;
    }
}
