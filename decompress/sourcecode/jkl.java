import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkl
{
    public final Executor a;
    public final Handler b;
    public byte[] c;
    public String d;
    public boolean e;
    public final vjl f;
    
    public jkl(final vjl f, final Executor a, final Handler b) {
        this.f = f;
        this.a = a;
        this.b = b;
    }
    
    public static final boolean a(final aioe aioe) {
        anvc anvc;
        if ((anvc = ((anvb)((agzd)aioe).rr((agyr)SearchEndpointOuterClass.searchEndpoint)).g) == null) {
            anvc = anvc.a;
        }
        anvg a;
        if (anvc.b == 163011016) {
            a = (anvg)anvc.c;
        }
        else {
            a = anvg.a;
        }
        return (a.b & 0x2) != 0x0;
    }
}
