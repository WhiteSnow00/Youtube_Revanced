import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public interface blz
{
    int a();
    
    int b(final MediaCodec$BufferInfo p0);
    
    MediaFormat c();
    
    ByteBuffer e(final int p0);
    
    ByteBuffer f(final int p0);
    
    void g();
    
    void h();
    
    void i(final int p0, final long p1);
    
    void j(final Surface p0);
    
    void k(final Bundle p0);
    
    void l(final int p0);
    
    boolean m();
    
    void n(final int p0, final int p1, final long p2, final int p3);
    
    void o(final int p0, final bda p1, final long p2);
    
    void p(final int p0);
}
