import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;
import java.util.Map;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gne implements vcv, tcc
{
    private final Context a;
    private final abpq b;
    private final irz c;
    private final wyv d;
    private final itg e;
    private final agmx f;
    
    public gne(final Context a, final abpq b, final irz c, final wyv d, final itg e, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.f = new agmx(a, aeea, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.e = e;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final Void void1 = (Void)o;
        this.f.g((List)o2, (abdh)new icz(this.b, 1), this.d);
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final CaptionPickerEndpointOuterClass$CaptionPickerEndpoint captionPickerEndpointOuterClass$CaptionPickerEndpoint = (CaptionPickerEndpointOuterClass$CaptionPickerEndpoint)((ahbc)aiqj).rx((ahaq)CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint);
        if ((captionPickerEndpointOuterClass$CaptionPickerEndpoint.b & 0x1) != 0x0 && captionPickerEndpointOuterClass$CaptionPickerEndpoint.c.equals(this.c.k())) {
            if ((captionPickerEndpointOuterClass$CaptionPickerEndpoint.b & 0x2) != 0x0) {
                final int y = aefb.Y(captionPickerEndpointOuterClass$CaptionPickerEndpoint.d);
                if (y != 0) {
                    if (y == 3) {
                        this.e.d();
                        return;
                    }
                }
            }
            this.b.G((tcc)this);
            return;
        }
        tpe.x(this.a, 2132018009, 1);
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final Void void1 = (Void)o;
        tpe.x(this.a, 2132018805, 1);
    }
}
