// 
// Decompiled by Procyon v0.6.0
// 

public enum ancw implements agzm
{
    a("PLAYER_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("PLAYER_EVENT_TYPE_CACHE_INIT_DURATION", 1, 1), 
    c("PLAYER_EVENT_TYPE_OFFLINE_INIT_DURATION", 2, 2), 
    d("PLAYER_EVENT_TYPE_MEDIA_INIT_DURATION", 3, 3), 
    e("PLAYER_EVENT_TYPE_ONLINE_CACHE_LOOKUP_MAP_INIT_DURATION", 4, 4), 
    f("PLAYER_EVENT_TYPE_OFFLINE_CACHE_LOOKUP_MAP_INIT_DURATION", 5, 5), 
    g("PLAYER_EVENT_TYPE_MEDIA_INIT_TIME", 6, 6), 
    h("PLAYER_EVENT_TYPE_MEDIALIBPLAYER_INIT_TIME", 7, 7), 
    i("PLAYER_EVENT_TYPE_SCRIPTED_CONTAINER_INIT_TIME", 8, 8), 
    j("PLAYER_EVENT_TYPE_SCRIPTED_CONTAINER_INIT_DURATION", 9, 9), 
    k("PLAYER_EVENT_TYPE_SCRIPTED_CONTAINER_INIT_STUCK_DURATION", 10, 10);
    
    public final int l;
    
    private ancw(final String s, final int n, final int l) {
        this.l = l;
    }
    
    public static agzo a() {
        return anaf.m;
    }
    
    public static ancw b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 10: {
                return ancw.k;
            }
            case 9: {
                return ancw.j;
            }
            case 8: {
                return ancw.i;
            }
            case 7: {
                return ancw.h;
            }
            case 6: {
                return ancw.g;
            }
            case 5: {
                return ancw.f;
            }
            case 4: {
                return ancw.e;
            }
            case 3: {
                return ancw.d;
            }
            case 2: {
                return ancw.c;
            }
            case 1: {
                return ancw.b;
            }
            case 0: {
                return ancw.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.l;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}
