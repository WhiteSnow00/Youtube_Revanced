import org.webrtc.VideoFrame;
import com.google.vr.vrcore.controller.api.ControllerListenerOptions;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevn
{
    public final int a;
    public final Object b;
    public final Object c;
    
    public aevn(final int a, final aqzj c, final InputStream b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aevn(final int a, final String b, final xyk c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aevn(final int a, final AtomicInteger b, final azn c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aevn(final aevu b, final Set set) {
        this.b = b;
        this.c = aevb.c(set);
        this.a = 2;
    }
    
    public aevn(final ControllerServiceBridge$Callbacks b, final ControllerListenerOptions c, final int a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aevn(final VideoFrame b, final int a, final arhr c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aevn(final xte xte) {
        final int f = xte.f;
        this.b = xte.b.clone();
        this.c = xte.c.clone();
        this.a = xte.a();
    }
    
    public aevn(final float[] b, final float[] c, final int a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final aeuq a(final String s) {
        return ((aevu)this.b).b(s, (aevb)this.c);
    }
    
    public final aeuq b(final String s, final aevb aevb) {
        return ((aevu)this.b).b(s, aevb.d((aevb)this.c, aevb));
    }
    
    public final aevl c(final String s) {
        if (!aewp.r()) {
            return ((aevu)this.b).d(s, aevb.d((aevb)this.c, aeva.a));
        }
        return aeuu.c;
    }
    
    public final String d() {
        final String a = ((aqzj)this.c).a("X-GUploader-UploadID");
        final int a2 = this.a;
        final String value = String.valueOf(this.c);
        String concat;
        if (a == null) {
            concat = "\n No upload id.";
        }
        else {
            concat = "\n Upload id: ".concat(a);
        }
        final StringBuilder sb = new StringBuilder("HttpResponse:\n   ");
        sb.append(a2);
        sb.append("  ");
        sb.append(value);
        sb.append(concat);
        return sb.toString();
    }
}
