import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arck implements arda
{
    private final Context a;
    
    public arck(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @Override
    public final afqs a(final SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return null;
    }
    
    @Override
    public final CardboardDevice$DeviceParams b() {
        return arbx.a(this.a);
    }
    
    @Override
    public final CardboardDevice$DeviceParamsList c() {
        return CardboardDevice$DeviceParamsList.getDefaultInstance();
    }
    
    @Override
    public final Display$DisplayParams d() {
        Display$DisplayParams display$DisplayParams;
        if ((display$DisplayParams = arbx.b(this.a)) == null) {
            display$DisplayParams = arcn.a(this.a);
        }
        return display$DisplayParams;
    }
    
    @Override
    public final Preferences$UserPrefs e() {
        return null;
    }
    
    @Override
    public final void f() {
    }
    
    @Override
    public final boolean g(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams == null) {
            return arbx.c(this.a);
        }
        return arbx.d(cardboardDevice$DeviceParams, this.a);
    }
}
