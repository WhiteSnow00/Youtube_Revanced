import android.view.ViewGroup;
import android.view.View;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hao implements hbf
{
    final /* synthetic */ hap a;
    
    public hao(final hap a) {
        this.a = a;
    }
    
    public final void b() {
        this.a.f.E();
    }
    
    public final void e(final DeviceLocalFile deviceLocalFile) {
        final haa l = this.a.l;
        if (!l.e.containsKey(deviceLocalFile)) {
            final View a = l.a(deviceLocalFile);
            if (a != null) {
                final ViewGroup c = l.c;
                c.addView(a, c.getChildCount() - l.i.size());
            }
            l.g(a);
        }
        this.a.f.E();
        if (deviceLocalFile.a() == 0) {
            this.a.p(deviceLocalFile);
            return;
        }
        if (deviceLocalFile.a() != 1 && deviceLocalFile.a() != 2) {
            return;
        }
        this.a.r(deviceLocalFile, true);
    }
    
    public final void nh() {
        final qpt v = this.a.v;
        if (v != null) {
            v.J();
        }
    }
}
