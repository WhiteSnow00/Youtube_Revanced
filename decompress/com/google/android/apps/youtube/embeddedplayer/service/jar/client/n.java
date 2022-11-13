// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import android.content.Context;

public final class n implements asjm
{
    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    public static final n o;
    public static final n p;
    public static final n q;
    private final int r;
    
    static {
        q = new n(18);
        p = new n(17);
        o = new n(16);
        n = new n(15);
        m = new n(14);
        l = new n(13);
        k = new n(12);
        j = new n(11);
        i = new n(10);
        h = new n(8);
        g = new n(7);
        f = new n(6);
        e = new n(4);
        d = new n(3);
        c = new n(2);
        b = new n(1);
        a = new n(0);
    }
    
    public n(final int r) {
        this.r = r;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.r) {
            default: {
                ((Integer)o).intValue();
                return;
            }
            case 19: {
                ((Boolean)o).booleanValue();
                return;
            }
            case 18: {
                final Throwable t = (Throwable)o;
                final zll a = zll.a;
                final zlk a2 = zlk.a;
                zlm.i();
                vdh.aX(t);
                return;
            }
            case 17: {
                final aezq aezq = (aezq)o;
                final uux uux = (uux)aezq.a;
                if (uux == aezq.b) {
                    uux.ql();
                    return;
                }
                uux.o();
                return;
            }
            case 16: {
                ttr.d("Error updating entity with sync mode", (Throwable)o);
                return;
            }
            case 15: {
                final Throwable t2 = (Throwable)o;
                ttr.b("Failed to get media items from local storage");
                return;
            }
            case 14: {
                final Throwable t3 = (Throwable)o;
                final String a3 = udd.a;
                zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Camera]".concat(String.valueOf(t3.getMessage())));
                ttr.f(udd.a, "Error subscribing to touch event", t3);
                return;
            }
            case 13: {
                final Throwable t4 = (Throwable)o;
                final String a4 = udd.a;
                zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Camera]Cannot subscribe to null getShortsCreationResponseProvider");
                ttr.f(udd.a, "Error subscribing to getShortsCreationResponse", t4);
                return;
            }
            case 12: {
                vdh.aX((Throwable)o);
                return;
            }
            case 11: {
                vdh.aX((Throwable)o);
                return;
            }
            case 10: {
                vdh.aX((Throwable)o);
                return;
            }
            case 9: {
                zlm.c(zll.b, zlk.a, "AdNotificationController failed unexpectedly while receiving an RX event.", (Throwable)o);
                return;
            }
            case 8: {
                vdh.aX((Throwable)o);
                return;
            }
            case 7: {
                vdh.aX((Throwable)o);
                return;
            }
            case 6: {
                mft.u((Throwable)o);
                return;
            }
            case 5: {
                final vcy vcy = (vcy)o;
                return;
            }
            case 4: {
                mft.u((Throwable)o);
                return;
            }
            case 3: {
                final t t5 = (t)o;
                final Context context = (Context)t5.e.get();
                if (t5.q != null && context != null && !tsy.e(context)) {
                    t5.m(t5.q.a(2));
                }
                return;
            }
            case 2: {
                final t t6 = (t)o;
                if (!t6.o()) {
                    t6.g.t();
                }
                return;
            }
            case 1: {
                final t t7 = (t)o;
                return;
            }
            case 0: {
                final t t8 = (t)o;
                if (!t8.o()) {
                    if (!t8.g.v(t8)) {
                        final SimplePlaybackDescriptor q = t8.q;
                        if (q != null) {
                            t8.m(q.a(1));
                        }
                    }
                }
            }
        }
    }
}
