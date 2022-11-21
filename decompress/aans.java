import java.util.ArrayList;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aans
{
    private final int a;
    private final long b;
    private final long c;
    private aanq d;
    private aanr e;
    private final boolean f;
    private final boolean g;
    
    public aans(final yrv yrv, final yrv yrv2, final FormatStreamModel formatStreamModel, final long b, final long c) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.z();
        this.g = formatStreamModel.P();
        this.c = c;
        this.b = b;
        if (yrv != null) {
            this.d = new aanq(this, yrv);
        }
        if (yrv2 != null) {
            this.e = new aanr(this, yrv2);
        }
    }
    
    public aans(final yrv[] array, final FormatStreamModel formatStreamModel, final long b, final long c) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.z();
        this.g = formatStreamModel.P();
        this.b = b;
        this.c = c;
        for (final yrv yrv : array) {
            if (j(yrv)) {
                this.d = new aanq(this, yrv);
            }
            else if (k(yrv)) {
                this.e = new aanr(this, yrv);
            }
        }
    }
    
    public static /* bridge */ long a(final aans aans) {
        return aans.c;
    }
    
    static /* bridge */ List f(final yrv yrv, final String s) {
        return i(yrv, s);
    }
    
    private static List i(final yrv yrv, String d) {
        final ArrayList list = new ArrayList();
        d = yrv.d(d);
        List h = list;
        if (d != null) {
            h = afcb.d(",").h(d);
        }
        return h.subList(0, h.size() - 1);
    }
    
    private static boolean j(final yrv yrv) {
        return yrv.a.equals("http://youtube.com/streaming/metadata/segment/102015");
    }
    
    private static boolean k(final yrv yrv) {
        return yrv.a.equals("http://youtube.com/streaming/metadata/streamer/092019");
    }
    
    public long b() {
        return this.b;
    }
    
    public long c() {
        return this.c;
    }
    
    public aanq d() {
        return this.d;
    }
    
    public aanr e() {
        return this.e;
    }
    
    public boolean g() {
        return this.f;
    }
    
    public boolean h() {
        return this.g;
    }
}
