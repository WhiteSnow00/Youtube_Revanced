import android.content.Context;
import com.google.vr.sdk.base.HeadsetSelector$HeadsetInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawi extends acrv
{
    final HeadsetSelector$HeadsetInfo a;
    
    public aawi(final Context context, final HeadsetSelector$HeadsetInfo a) {
        super(context, a.getDisplayName());
        this.a = a;
    }
}
