import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzw implements aral
{
    private final Context a;
    
    public aqzw(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public final afor a(final SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return null;
    }
    
    public final CardboardDevice$DeviceParams b() {
        return aqzj.a(this.a);
    }
    
    public final CardboardDevice$DeviceParamsList c() {
        return CardboardDevice$DeviceParamsList.getDefaultInstance();
    }
    
    public final Display$DisplayParams d() {
        Display$DisplayParams display$DisplayParams;
        if ((display$DisplayParams = aqzj.b(this.a)) == null) {
            display$DisplayParams = aqzz.a(this.a);
        }
        return display$DisplayParams;
    }
    
    public final Preferences$UserPrefs e() {
        return null;
    }
    
    public final void f() {
    }
    
    public final boolean g(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams == null) {
            return aqzj.c(this.a);
        }
        return aqzj.d(cardboardDevice$DeviceParams, this.a);
    }
}
