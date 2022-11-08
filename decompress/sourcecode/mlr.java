import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mlr extends BasePendingResult
{
    private mng a;
    public final boolean c;
    final /* synthetic */ mlu d;
    
    public mlr(final mlu mlu) {
        this(mlu, false);
    }
    
    public mlr(final mlu d, final boolean c) {
        this.d = d;
        super((mpv)null);
        this.c = c;
    }
    
    public static final mls d(final Status status) {
        return (mls)new mlq(status, 0);
    }
    
    public abstract void b();
    
    final mng c() {
        if (this.a == null) {
            this.a = (mng)new mnc(this, 1);
        }
        return this.a;
    }
}
