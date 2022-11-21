import android.media.MediaCodec$CodecException;

// 
// Decompiled by Procyon v0.6.0
// 

public class bma extends bdc
{
    public final bmc a;
    public final String b;
    
    public bma(final Throwable t, final bmc a) {
        final String s = null;
        Object a2;
        if (a == null) {
            a2 = null;
        }
        else {
            a2 = a.a;
        }
        super("Decoder failed: ".concat(String.valueOf(a2)), t);
        this.a = a;
        final int a3 = baz.a;
        String diagnosticInfo = s;
        if (t instanceof MediaCodec$CodecException) {
            diagnosticInfo = ((MediaCodec$CodecException)t).getDiagnosticInfo();
        }
        this.b = diagnosticInfo;
    }
}
