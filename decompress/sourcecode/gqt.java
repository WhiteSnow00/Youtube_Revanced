import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqt
{
    public static final afik a;
    public final Context b;
    public final AtomicReference c;
    public final arhr d;
    public final acoh e;
    public final cya f;
    
    static {
        a = afik.m("com/google/android/apps/youtube/app/extensions/assistant/common/ui/AssistantUiUtils");
    }
    
    public gqt(final mrm mrm, final toa toa, final Context b, final cya f, final mrm mrm2, final acoh e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = new AtomicReference();
        this.b = b;
        this.f = f;
        this.d = (arhr)mrm2.a;
        this.e = e;
        mrm.C((Callable)new exk(this, toa, 14));
    }
}
