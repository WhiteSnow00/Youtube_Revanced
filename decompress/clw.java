import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clw
{
    public static final clh a;
    public static final cll b;
    public static final clh c;
    
    static {
        new clf("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new clf("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new cli("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new clg("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new clj("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new clj("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new clj("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new clj("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new clj("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new clj("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new clg("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new clg("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new clg("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new clg("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new clg("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new clg("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new clf("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new clf("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new clg("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new clj("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new clg("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new clf("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new clf("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new clj("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new clj("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new clj("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        new clf("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new clf("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        a = new clh("WEB_MESSAGE_GET_MESSAGE_PAYLOAD", "WEB_MESSAGE_GET_MESSAGE_PAYLOAD");
        new clf("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new clf("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        new clf("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new clf("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new cli("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new cli("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new cll("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new cll("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new clk();
        new clt();
        new cll("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        new clv();
        new clh("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        new clh("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE");
        new clh("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        b = new cll("FORCE_DARK", "FORCE_DARK");
        new clh("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        c = new clh("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        new clh("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new clh("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new clh("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new clh("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new clh("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new clh("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
    }
    
    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
    
    public static boolean b(final String s) {
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)cln.a);
        final HashSet set = new HashSet();
        for (final clr clr : unmodifiableSet) {
            if (clr.b().equals(s)) {
                set.add(clr);
            }
        }
        if (!set.isEmpty()) {
            final Iterator iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                if (((clr)iterator2.next()).c()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature ".concat(s));
    }
}
