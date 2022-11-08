// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

public class UrlRequest$Status
{
    public static final int CONNECTING = 10;
    public static final int DOWNLOADING_PAC_FILE = 5;
    public static final int ESTABLISHING_PROXY_TUNNEL = 8;
    public static final int IDLE = 0;
    public static final int INVALID = -1;
    public static final int READING_RESPONSE = 14;
    public static final int RESOLVING_HOST = 9;
    public static final int RESOLVING_HOST_IN_PAC_FILE = 7;
    public static final int RESOLVING_PROXY_FOR_URL = 6;
    public static final int SENDING_REQUEST = 12;
    public static final int SSL_HANDSHAKE = 11;
    public static final int WAITING_FOR_AVAILABLE_SOCKET = 2;
    public static final int WAITING_FOR_CACHE = 4;
    public static final int WAITING_FOR_DELEGATE = 3;
    public static final int WAITING_FOR_RESPONSE = 13;
    public static final int WAITING_FOR_STALLED_SOCKET_POOL = 1;
    
    private UrlRequest$Status() {
    }
}
