import java.util.Iterator;
import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CaptureRequest$Builder;
import android.graphics.Rect;
import android.widget.PopupWindow;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mz
{
    static void a(final PopupWindow popupWindow, final Rect epicenterBounds) {
        popupWindow.setEpicenterBounds(epicenterBounds);
    }
    
    static void b(final PopupWindow popupWindow, final boolean isClippedToScreen) {
        popupWindow.setIsClippedToScreen(isClippedToScreen);
    }
    
    public static void c(final CaptureRequest$Builder captureRequest$Builder, yy yy) {
        final bx bx = new bx((char[])null, null, (byte[])null);
        yy.i(new xu(bx, yy, (byte[])null, (byte[])null, (byte[])null));
        yy = (yy)new xv((yy)zi.m((yy)bx.a));
        for (final yw yw : rp.d((zk)yy)) {
            try {
                captureRequest$Builder.set((CaptureRequest$Key)null, ((xv)yy).a.c(yw));
            }
            catch (final IllegalArgumentException ex) {
                yi.a("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: null");
            }
        }
    }
}
