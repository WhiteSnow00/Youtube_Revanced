import java.util.ArrayList;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aalv
{
    private final int a;
    private final long b;
    private final long c;
    private aalt d;
    private aalu e;
    private final boolean f;
    private final boolean g;
    
    public aalv(final yqb yqb, final yqb yqb2, final FormatStreamModel formatStreamModel, final long b, final long c) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.z();
        this.g = formatStreamModel.P();
        this.c = c;
        this.b = b;
        if (yqb != null) {
            this.d = new aalt(this, yqb);
        }
        if (yqb2 != null) {
            this.e = new aalu(this, yqb2);
        }
    }
    
    public aalv(final yqb[] array, final FormatStreamModel formatStreamModel, final long b, final long c) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.z();
        this.g = formatStreamModel.P();
        this.b = b;
        this.c = c;
        for (final yqb yqb : array) {
            if (j(yqb)) {
                this.d = new aalt(this, yqb);
            }
            else if (k(yqb)) {
                this.e = new aalu(this, yqb);
            }
        }
    }
    
    public static /* bridge */ long a(final aalv aalv) {
        return aalv.c;
    }
    
    static /* bridge */ List f(final yqb yqb, final String s) {
        return i(yqb, s);
    }
    
    private static List i(final yqb yqb, String d) {
        final ArrayList list = new ArrayList();
        d = yqb.d(d);
        List h = list;
        if (d != null) {
            h = afaj.d(",").h((CharSequence)d);
        }
        return h.subList(0, h.size() - 1);
    }
    
    private static boolean j(final yqb yqb) {
        return yqb.a.equals("http://youtube.com/streaming/metadata/segment/102015");
    }
    
    private static boolean k(final yqb yqb) {
        return yqb.a.equals("http://youtube.com/streaming/metadata/streamer/092019");
    }
    
    public long b() {
        return this.b;
    }
    
    public long c() {
        return this.c;
    }
    
    public aalt d() {
        return this.d;
    }
    
    public aalu e() {
        return this.e;
    }
    
    public boolean g() {
        return this.f;
    }
    
    public boolean h() {
        return this.g;
    }
}
