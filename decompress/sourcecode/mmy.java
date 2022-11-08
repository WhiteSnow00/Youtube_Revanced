import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.ApplicationMetadata;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface mmy extends IInterface
{
    void a(final ApplicationMetadata p0, final String p1, final String p2, final boolean p3);
    
    void b(final int p0);
    
    void c(final int p0);
    
    void d(final int p0);
    
    void e(final ApplicationStatus p0);
    
    void f(final int p0);
    
    void g(final int p0);
    
    void h(final DeviceStatus p0);
    
    void i(final int p0);
    
    void j(final int p0);
    
    void k(final String p0, final String p1);
    
    void l(final long p0);
    
    void m(final long p0, final int p1);
    
    void n();
    
    void o(final byte[] p0);
}
