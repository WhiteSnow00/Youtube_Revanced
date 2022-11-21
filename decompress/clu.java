import java.util.Map;
import com.google.protobuf.ExtensionRegistryLite;
import android.util.Base64;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import android.net.Uri;
import java.lang.reflect.InvocationHandler;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clu implements WebMessageListenerBoundaryInterface
{
    private final acyy a;
    
    public clu(final acyy a) {
        this.a = a;
    }
    
    public final String[] getSupportedFeatures() {
        return new String[] { "WEB_MESSAGE_LISTENER" };
    }
    
    public final void onPostMessage(final WebView webView, final InvocationHandler invocationHandler, final Uri uri, final boolean b, final InvocationHandler invocationHandler2) {
        final WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface)auig.a(WebMessageBoundaryInterface.class, invocationHandler);
        final InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        final cjk[] array = new cjk[ports.length];
        for (int i = 0; i < ports.length; ++i) {
            array[i] = new cjk(ports[i]);
        }
        avv avv;
        if (((cln)clw.a).d()) {
            final WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface)auig.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            final int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                avv = null;
                if (type == 1) {
                    avv = new avv(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), (byte[])null);
                }
            }
            else {
                avv = new avv(webMessagePayloadBoundaryInterface.getAsString());
            }
        }
        else {
            avv = new avv(webMessageBoundaryInterface.getData());
        }
        if (avv == null) {
            return;
        }
        final cji cji = (cji)((JsReplyProxyBoundaryInterface)auig.a(JsReplyProxyBoundaryInterface.class, invocationHandler2)).getOrCreatePeer((Callable)new ejc(1));
        final acyy a = this.a;
        final byte[] decode = Base64.decode(afbj.e((String)avv.a), 2);
        try {
            final aisc aisc = ((Map<K, aisc>)a.a).get(((apwr)ahcz.parseFrom(apwr.a, decode, ExtensionRegistryLite.getGeneratedRegistry())).b);
            if (aisc != null) {
                ((veh)a.b).a(aisc);
            }
        }
        catch (final ahds ahds) {}
    }
}
