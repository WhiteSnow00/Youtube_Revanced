import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gic implements gig
{
    public static final gic a;
    public static final gic b;
    public static final gic c;
    public static final gic d;
    public static final gic e;
    public static final gic f;
    public static final gic g;
    public static final gic h;
    public static final gic i;
    public static final gic j;
    private final int k;
    
    static {
        j = new gic(9);
        i = new gic(8);
        h = new gic(7);
        g = new gic(6);
        f = new gic(5);
        e = new gic(4);
        d = new gic(3);
        c = new gic(2);
        b = new gic(1);
        a = new gic(0);
    }
    
    private gic(final int k) {
        this.k = k;
    }
    
    @Override
    public final gia a(final Context context, final Runnable runnable) {
        switch (this.k) {
            default: {
                return new gia(context, 2131232932, 2132019129, 2132019129, "com.google.android.libraries.youtube.player.action.controller_notification_replay", xaa.c(142279), runnable);
            }
            case 8: {
                return new gia(context, 2131232893, 2132019147, 2132017326, "com.google.android.libraries.youtube.player.action.controller_notification_play", xaa.c(142277), runnable);
            }
            case 7: {
                return new gia(context, 2131232864, 2132019147, 2132017324, "com.google.android.libraries.youtube.player.action.controller_notification_pause", xaa.c(142276), runnable);
            }
            case 6: {
                return new gia(context, 2131232760, 2132019142, 2132019142, "com.google.android.youtube.action.background", xaa.c(142274), runnable);
            }
            case 5: {
                return new gia(context, 2131232837, 2132019125, 2132019125, "com.google.android.youtube.action.autonav.cancel", null, runnable);
            }
            case 4: {
                return new gia(context, 2131232893, 2132019128, 2132019128, "com.google.android.youtube.action.autonav.play", null, runnable);
            }
            case 3: {
                return new gia(context, 2131232966, 2132019832, 2132019832, "com.google.android.libraries.youtube.player.action.controller_notification_skip_ad", null, runnable);
            }
            case 2: {
                return new gia(context, 2131232966, 2132019144, 2132019144, "com.google.android.libraries.youtube.player.action.controller_notification_next", xaa.c(142275), runnable);
            }
            case 1: {
                return new gia(context, 2131232972, 2132019148, 2132017358, "com.google.android.libraries.youtube.player.action.controller_notification_prev", xaa.c(142278), runnable);
            }
            case 0: {
                return new gia(context, 2131232932, 2132019130, 2132019130, "com.google.android.libraries.youtube.player.action.controller_notification_retry", null, runnable);
            }
        }
    }
}
