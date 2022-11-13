import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmy implements abmq
{
    private final abul a;
    private final abuj b;
    private final int c;
    
    public abmy(final abul a, final abuj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                if (this.a.c) {
                    return 2131232973;
                }
                return 2131231826;
            }
            else {
                if (this.a.d) {
                    return 2131232967;
                }
                return 2131231825;
            }
        }
        else {
            switch (this.a.b) {
                default: {
                    return 2131231821;
                }
                case 8: {
                    return 2131232705;
                }
                case 7: {
                    return 2131232933;
                }
                case 6: {
                    return 2131231828;
                }
                case 2:
                case 9: {
                    return 2131232865;
                }
                case 0:
                case 3:
                case 4:
                case 10: {
                    return 2131232894;
                }
            }
        }
    }
    
    public final int b() {
        final int c = this.c;
        if (c == 0) {
            final int b = this.a.b;
            if (b != 0) {
                if (b != 2) {
                    if (b == 3 || b == 4) {
                        return 2132019146;
                    }
                    switch (b) {
                        default: {
                            return 2132019147;
                        }
                        case 8: {
                            return 2132019150;
                        }
                        case 7: {
                            return 2132019149;
                        }
                        case 9: {
                            break;
                        }
                        case 10: {
                            return 2132019146;
                        }
                    }
                }
                return 2132019145;
            }
            return 2132019146;
        }
        if (c != 1) {
            return 2132019148;
        }
        return 2132019144;
    }
    
    public final aezp c() {
        final int c = this.c;
        if (c == 0) {
            return (aezp)aeyo.a;
        }
        if (c != 1) {
            return (aezp)aeyo.a;
        }
        return (aezp)aeyo.a;
    }
    
    public final String d() {
        final int c = this.c;
        String s = "noop";
        if (c == 0) {
            final int b = this.a.b;
            if (b != 0) {
                if (b != 2) {
                    if (b == 3 || b == 4) {
                        return "com.google.android.libraries.youtube.player.action.controller_notification_play";
                    }
                    switch (b) {
                        default: {
                            return s;
                        }
                        case 8: {
                            s = "com.google.android.libraries.youtube.player.action.controller_notification_retry";
                            return s;
                        }
                        case 7: {
                            s = "com.google.android.libraries.youtube.player.action.controller_notification_replay";
                            return s;
                        }
                        case 9: {
                            break;
                        }
                        case 10: {
                            return "com.google.android.libraries.youtube.player.action.controller_notification_play";
                        }
                    }
                }
                s = "com.google.android.libraries.youtube.player.action.controller_notification_pause";
                return s;
            }
            s = "com.google.android.libraries.youtube.player.action.controller_notification_play";
            return s;
        }
        if (c != 1) {
            if (this.a.c) {
                s = "com.google.android.libraries.youtube.player.action.controller_notification_prev";
            }
            return s;
        }
        if (this.a.d) {
            s = "com.google.android.libraries.youtube.player.action.controller_notification_next";
        }
        return s;
    }
    
    public final Set e() {
        final int c = this.c;
        if (c == 0) {
            return (Set)afft.v((Object)"com.google.android.libraries.youtube.player.action.controller_notification_retry", (Object)"com.google.android.libraries.youtube.player.action.controller_notification_replay", (Object)"com.google.android.libraries.youtube.player.action.controller_notification_pause", (Object)"com.google.android.libraries.youtube.player.action.controller_notification_play");
        }
        if (c != 1) {
            return (Set)afft.s((Object)"com.google.android.libraries.youtube.player.action.controller_notification_prev");
        }
        return (Set)afft.s((Object)"com.google.android.libraries.youtube.player.action.controller_notification_next");
    }
    
    public final void f() {
    }
    
    public final void g() {
    }
    
    public final void h(final abmp abmp) {
    }
    
    public final boolean i(final String s) {
        final int c = this.c;
        boolean b = false;
        if (c == 0) {
            if ("com.google.android.libraries.youtube.player.action.controller_notification_play".equals(s)) {
                this.b.d();
            }
            else if ("com.google.android.libraries.youtube.player.action.controller_notification_pause".equals(s)) {
                this.b.c();
            }
            else if ("com.google.android.libraries.youtube.player.action.controller_notification_replay".equals(s)) {
                this.b.e();
            }
            else {
                if (!"com.google.android.libraries.youtube.player.action.controller_notification_retry".equals(s)) {
                    return b;
                }
                this.b.f();
                return true;
            }
            b = true;
            return b;
        }
        if (c != 1) {
            if ("com.google.android.libraries.youtube.player.action.controller_notification_prev".equals(s)) {
                this.b.j();
                return true;
            }
            return false;
        }
        else {
            if ("com.google.android.libraries.youtube.player.action.controller_notification_next".equals(s)) {
                this.b.i();
                return true;
            }
            return false;
        }
    }
    
    public final boolean j() {
        return true;
    }
    
    public final boolean k() {
        return true;
    }
}
