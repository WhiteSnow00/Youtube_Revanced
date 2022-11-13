import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public interface arda
{
    afqs a(final SdkConfiguration$SdkConfigurationRequest p0);
    
    CardboardDevice$DeviceParams b();
    
    CardboardDevice$DeviceParamsList c();
    
    Display$DisplayParams d();
    
    Preferences$UserPrefs e();
    
    void f();
    
    boolean g(final CardboardDevice$DeviceParams p0);
}
