import java.util.ArrayList;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aakb
{
    private final int a;
    private final long b;
    private final long c;
    private aajz d;
    private aaka e;
    private final boolean f;
    private final boolean g;
    
    public aakb(final yob yob, final yob yob2, final FormatStreamModel formatStreamModel, final long b, final long c) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.z();
        this.g = formatStreamModel.P();
        this.c = c;
        this.b = b;
        if (yob != null) {
            this.d = new aajz(this, yob);
        }
        if (yob2 != null) {
            this.e = new aaka(this, yob2);
        }
    }
    
    public aakb(final yob[] array, final FormatStreamModel formatStreamModel, final long b, final long c) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.z();
        this.g = formatStreamModel.P();
        this.b = b;
        this.c = c;
        for (final yob yob : array) {
            if (j(yob)) {
                this.d = new aajz(this, yob);
            }
            else if (k(yob)) {
                this.e = new aaka(this, yob);
            }
        }
    }
    
    private static List i(final yob yob, String d) {
        final ArrayList list = new ArrayList();
        d = yob.d(d);
        List h = list;
        if (d != null) {
            h = aeyk.d(",").h(d);
        }
        return h.subList(0, h.size() - 1);
    }
    
    private static boolean j(final yob yob) {
        return yob.a.equals("http://youtube.com/streaming/metadata/segment/102015");
    }
    
    private static boolean k(final yob yob) {
        return yob.a.equals("http://youtube.com/streaming/metadata/streamer/092019");
    }
    
    public long b() {
        return this.b;
    }
    
    public long c() {
        return this.c;
    }
    
    public aajz d() {
        return this.d;
    }
    
    public aaka e() {
        return this.e;
    }
    
    public boolean g() {
        return this.f;
    }
    
    public boolean h() {
        return this.g;
    }
}
