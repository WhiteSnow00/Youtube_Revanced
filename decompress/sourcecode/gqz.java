// 
// Decompiled by Procyon v0.6.0
// 

public final class gqz extends nza
{
    public static final afik a;
    public final aeyr b;
    public final grd c;
    public final gqx d;
    
    static {
        a = afik.m("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/AssistantConnectionCallback");
    }
    
    public gqz(final atjj atjj, final grd c, final gqx d) {
        atjj.getClass();
        this.b = agnj.E((aeyr)new beg(atjj, 17));
        this.c = c;
        this.d = d;
    }
    
    public final void a(final nze nze) {
        final int a = nzj.a(nze.b);
        boolean b = true;
        int n = a;
        if (a == 0) {
            n = 1;
        }
        final afii afii = (afii)((afii)((afig)gqz.a).c().h(afjj.a, (Object)"AQCResolver")).j("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/AssistantConnectionCallback", "onVoicePlateStateChanged", 101, "AssistantConnectionCallback.java");
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    s = "VOICE_PLATE_STATE_CLOSED";
                }
                else {
                    s = "VOICE_PLATE_STATE_CHAT_HEAD";
                }
            }
            else {
                s = "VOICE_PLATE_STATE_OPENED";
            }
        }
        else {
            s = "VOICE_PLATE_STATE_UNKNOWN";
        }
        afii.t("#onVoicePlateStateChanged - voice_plate_state: %s", (Object)s);
        final cya cya = (cya)this.b.a();
        if (n != 2) {
            b = false;
        }
        cya.p(b);
    }
}
