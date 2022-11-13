// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api.jar.client;

import android.content.Intent;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a;

public final class f extends com.google.android.apps.youtube.embeddedplayer.service.jar.client.f
{
    public final RemoteEmbeddedPlayer a;
    
    public f(final RemoteEmbeddedPlayer a) {
        this.a = a;
    }
    
    public final String a(final String s) {
        afse.o("Embed config is not supported in RemoteEmbeddedPlayer.");
        return "";
    }
    
    public final void b() {
        this.a.V();
    }
    
    public final void g(final boolean b, final long n) {
        this.a.h.post((Runnable)new ypp(this, n, 9));
        this.a.W(b);
    }
    
    public final void h() {
        this.a.h.post((Runnable)new d(this, 0));
    }
    
    public final void i() {
        this.a.h.post((Runnable)new d(this, 4));
    }
    
    public final void j(final String s) {
        final int n = 14;
        while (true) {
            try {
                int n2 = 0;
                Label_0341: {
                    switch (s.hashCode()) {
                        case 1918408868: {
                            if (s.equals("EMPTY_PLAYLIST")) {
                                n2 = 7;
                                break Label_0341;
                            }
                            break;
                        }
                        case 1635406296: {
                            if (s.equals("AUTOPLAY_DISABLED")) {
                                n2 = 8;
                                break Label_0341;
                            }
                            break;
                        }
                        case 1479939124: {
                            if (s.equals("UNEXPECTED_SERVICE_DISCONNECTION")) {
                                n2 = 11;
                                break Label_0341;
                            }
                            break;
                        }
                        case 1045580280: {
                            if (s.equals("BLOCKED_FOR_APP")) {
                                n2 = 1;
                                break Label_0341;
                            }
                            break;
                        }
                        case 433141802: {
                            if (s.equals("UNKNOWN")) {
                                n2 = 13;
                                break Label_0341;
                            }
                            break;
                        }
                        case 383333018: {
                            if (s.equals("NOT_PLAYABLE")) {
                                n2 = 2;
                                break Label_0341;
                            }
                            break;
                        }
                        case 75858354: {
                            if (s.equals("USER_DECLINED_RESTRICTED_CONTENT")) {
                                n2 = 9;
                                break Label_0341;
                            }
                            break;
                        }
                        case -485608986: {
                            if (s.equals("INTERNAL_ERROR")) {
                                n2 = 12;
                                break Label_0341;
                            }
                            break;
                        }
                        case -513113115: {
                            if (s.equals("UNAUTHORIZED_OVERLAY")) {
                                n2 = 4;
                                break Label_0341;
                            }
                            break;
                        }
                        case -585411087: {
                            if (s.equals("USER_DECLINED_HIGH_BANDWIDTH")) {
                                n2 = 10;
                                break Label_0341;
                            }
                            break;
                        }
                        case -879828873: {
                            if (s.equals("NETWORK_ERROR")) {
                                n2 = 3;
                                break Label_0341;
                            }
                            break;
                        }
                        case -1731984950: {
                            if (s.equals("PLAYER_VIEW_NOT_VISIBLE")) {
                                n2 = 6;
                                break Label_0341;
                            }
                            break;
                        }
                        case -1949945212: {
                            if (s.equals("EMBEDDING_DISABLED")) {
                                n2 = 0;
                                break Label_0341;
                            }
                            break;
                        }
                        case -2142596576: {
                            if (s.equals("PLAYER_VIEW_TOO_SMALL")) {
                                n2 = 5;
                                break Label_0341;
                            }
                            break;
                        }
                    }
                    n2 = -1;
                }
                int n3 = n;
                switch (n2) {
                    default: {
                        throw new IllegalArgumentException();
                    }
                    case 13: {
                        this.a.aB(n3);
                        return;
                    }
                    case 12: {
                        n3 = 13;
                        continue;
                    }
                    case 11: {
                        n3 = 12;
                        continue;
                    }
                    case 10: {
                        n3 = 11;
                        continue;
                    }
                    case 9: {
                        n3 = 10;
                        continue;
                    }
                    case 8: {
                        n3 = 9;
                        continue;
                    }
                    case 7: {
                        n3 = 8;
                        continue;
                    }
                    case 6: {
                        n3 = 7;
                        continue;
                    }
                    case 5: {
                        n3 = 6;
                        continue;
                    }
                    case 4: {
                        n3 = 5;
                        continue;
                    }
                    case 3: {
                        n3 = 4;
                        continue;
                    }
                    case 2: {
                        n3 = 3;
                        continue;
                    }
                    case 1: {
                        n3 = 2;
                        continue;
                    }
                    case 0: {
                        n3 = 1;
                        continue;
                    }
                }
            }
            catch (final IllegalArgumentException | NullPointerException ex) {
                final int n3 = n;
                continue;
            }
            break;
        }
    }
    
    public final void k(final boolean b) {
        this.a.h.post((Runnable)new a(this, b, 18));
        this.a.X(b);
    }
    
    public final void l(final String s, final String s2, final long n, final long n2, final boolean b, final boolean b2, final int n3) {
        this.a.h.post((Runnable)new c(this, s2, b, b2, n, n2));
        this.a.Y(s);
    }
    
    public final void m() {
        this.a.h.post((Runnable)new d(this, 3));
        this.a.Z();
    }
    
    public final void n() {
        this.a.aa();
    }
    
    public final void o(final long n) {
        this.a.h.post((Runnable)new ypp(this, n, 8));
        this.a.ab();
    }
    
    public final void p(final long n, final long n2) {
        this.a.h.post((Runnable)new e(this, n, n2, 0));
        this.a.ac();
    }
    
    public final void q() {
        this.a.h.post((Runnable)new d(this, 5));
    }
    
    public final void r() {
        this.a.ad();
    }
    
    public final void s() {
        this.a.ae();
    }
    
    public final void t(final long n, final long n2) {
        this.a.h.post((Runnable)new e(this, n, n2, 1));
    }
    
    public final void u(final long n) {
        this.a.h.post((Runnable)new ypp(this, n, 10));
        this.a.af(n);
    }
    
    public final void v() {
        this.a.h.post((Runnable)new d(this, 6));
        this.a.ag();
    }
    
    public final void w() {
        this.a.ah();
    }
    
    public final void x() {
        this.a.h.post((Runnable)new d(this, 2));
        this.a.ai();
    }
    
    public final void y(final String s) {
    }
    
    public final void z(final Intent intent) {
        this.a.D.startActivity(intent);
    }
}
