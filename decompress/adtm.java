import com.google.protobuf.ExtensionRegistryLite;
import java.util.function.Function;
import j$.util.Optional;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class adtm extends BroadcastReceiver
{
    private static final afma a;
    private final adtg b;
    
    static {
        a = afma.m("com/google/android/livesharing/internal/sessiondetection/SessionDetectionResponseReceiver");
    }
    
    public adtm(final adtg b) {
        this.b = b;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final int n = 0;
        final Optional ofNullable = Optional.ofNullable((Object)this.getResultExtras(false));
        final boolean present = ofNullable.isPresent();
        int a = 1;
        Label_0465: {
            if (!present) {
                ((afly)((afly)((aflw)adtm.a).f()).j("com/google/android/livesharing/internal/sessiondetection/SessionDetectionResponseReceiver", "parseResponse", 120, "SessionDetectionResponseReceiver.java")).r("Result Extras was null");
            }
            else {
                final Optional map = ofNullable.map((Function)adtc.d);
                if (!(boolean)map.map((Function)adtc.e).orElse((Object)false)) {
                    ((afly)((afly)((aflw)adtm.a).h()).j("com/google/android/livesharing/internal/sessiondetection/SessionDetectionResponseReceiver", "parseResponse", 128, "SessionDetectionResponseReceiver.java")).r("Received response from Meet but proto was empty");
                }
                else {
                    try {
                        final odl odl = (odl)ahcz.parseFrom((ahcz)odl.a, (byte[])map.get(), ExtensionRegistryLite.a);
                        odk odk;
                        if ((odk = odl.b) == null) {
                            odk = odk.a;
                        }
                        if (!odk.b) {
                            ((afly)((afly)((aflw)adtm.a).h()).j("com/google/android/livesharing/internal/sessiondetection/SessionDetectionResponseReceiver", "parseResponse", 147, "SessionDetectionResponseReceiver.java")).r("Invalid state proto detected");
                        }
                        else {
                            odj odj;
                            if ((odj = odl.c) == null) {
                                odj = odj.a;
                            }
                            int e;
                            if ((odj.b & 0x1) != 0x0) {
                                odj odj2;
                                if ((odj2 = odl.c) == null) {
                                    odj2 = odj.a;
                                }
                                e = (odj2.e ? 1 : 0);
                            }
                            else {
                                odj odj3;
                                if ((odj3 = odl.c) == null) {
                                    odj3 = odj.a;
                                }
                                odh a2;
                                if (odj3.c == 1) {
                                    a2 = (odh)odj3.d;
                                }
                                else {
                                    a2 = odh.a;
                                }
                                a = a2.b;
                                if (a != 0) {
                                    if (a != 1) {
                                        if (a != 2) {
                                            a = 0;
                                        }
                                        else {
                                            a = 4;
                                        }
                                    }
                                    else {
                                        a = 3;
                                    }
                                }
                                else {
                                    a = 2;
                                }
                                Label_0355: {
                                    if (a != 0) {
                                        if (a == 4) {
                                            a = 1;
                                            break Label_0355;
                                        }
                                    }
                                    a = 0;
                                }
                                e = (a ^ 0x1);
                            }
                            if (e != 0) {
                                odj odj4;
                                if ((odj4 = odl.c) == null) {
                                    odj4 = odj.a;
                                }
                                a = odj4.c;
                                if (a != 0) {
                                    if (a != 1) {
                                        if (a != 2) {
                                            a = n;
                                        }
                                        else {
                                            a = 2;
                                        }
                                    }
                                    else {
                                        a = 1;
                                    }
                                }
                                else {
                                    a = 3;
                                }
                                if (a == 0) {
                                    throw null;
                                }
                                if (a - 1 == 0) {
                                    a = 3;
                                    break Label_0465;
                                }
                            }
                            a = 2;
                        }
                    }
                    catch (final ahds ahds) {
                        c.i(((aflw)adtm.a).h(), "Error parsing bytes and converting to proto", "com/google/android/livesharing/internal/sessiondetection/SessionDetectionResponseReceiver", "parseResponse", '\u008d', "SessionDetectionResponseReceiver.java", (Throwable)ahds);
                    }
                }
            }
        }
        final adtg b = this.b;
        final adsj a3 = adsk.a();
        a3.b("");
        a3.c("");
        a3.a = a;
        ((adtj)b).a.c((Object)a3.a());
    }
}
