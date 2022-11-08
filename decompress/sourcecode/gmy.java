import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;
import java.util.Map;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmy implements vau, szx
{
    private final Context a;
    private final abno b;
    private final ira c;
    private final wwu d;
    private final ish e;
    private final agkw f;
    
    public gmy(final Context a, final abno b, final ira c, final wwu d, final ish e, final aeby aeby, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.f = new agkw(a, aeby, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.e = e;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final CaptionPickerEndpointOuterClass$CaptionPickerEndpoint captionPickerEndpointOuterClass$CaptionPickerEndpoint = (CaptionPickerEndpointOuterClass$CaptionPickerEndpoint)((agzd)aioe).rr((agyr)CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint);
        if ((captionPickerEndpointOuterClass$CaptionPickerEndpoint.b & 0x1) != 0x0 && captionPickerEndpointOuterClass$CaptionPickerEndpoint.c.equals(this.c.k())) {
            if ((captionPickerEndpointOuterClass$CaptionPickerEndpoint.b & 0x2) != 0x0) {
                final int ac = aesy.aC(captionPickerEndpointOuterClass$CaptionPickerEndpoint.d);
                if (ac != 0) {
                    if (ac == 3) {
                        this.e.d();
                        return;
                    }
                }
            }
            this.b.H((szx)this);
            return;
        }
        tmy.x(this.a, 2132018008, 1);
    }
}
