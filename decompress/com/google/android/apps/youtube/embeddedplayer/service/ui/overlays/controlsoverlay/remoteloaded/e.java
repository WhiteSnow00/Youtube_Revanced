// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.widget.ImageView;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import io.grpc.Status;
import java.util.function.Consumer;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.b;

public final class e implements asjm
{
    public final Object a;
    private final int b;
    
    public e(final l a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final g a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final f a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final c a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final CommandRunCompletionCallback a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final EnvironmentDataObserver a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final omo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final ooq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final ovp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final rox a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final rqw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final aamh aamh = (aamh)o;
                final rqu rqu = new rqu(aamh.c(), aamh.d(), aamh.b(), aamh.a(), aamh.f(), aamh.e());
                final rqw rqw = (rqw)a;
                rqw.e((Consumer)rqu, (Iterable)afft.x((Object)rqw.a, (Object)rqw.l, (Object)rqw.m, (Object)rqw.n, (Object)rqw.o, (Object)rqw.r, (Object[])new rqb[0]));
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final aant aant = (aant)o;
                final rqv rqv = new rqv(aant.i(), aant.e(), aant.a(), aant.f(), aant.j());
                final rqw rqw2 = (rqw)a2;
                rqw2.e((Consumer)rqv, (Iterable)afft.x((Object)rqw2.b, (Object)rqw2.v, (Object)rqw2.a, (Object)rqw2.f, (Object)rqw2.s, (Object)rqw2.t, (Object[])new rqb[0]));
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final aany aany = (aany)o;
                final ktv ktv = new ktv(aany.a().aa(), aany.a().a(), 2);
                final rqw rqw3 = (rqw)a3;
                rqw3.e((Consumer)ktv, (Iterable)afft.v((Object)rqw3.c, (Object)rqw3.h, (Object)rqw3.k, (Object)rqw3.o));
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final aans aans = (aans)o;
                tbi.f();
                final abke a5 = abke.a;
                final int ordinal = aans.c().ordinal();
                if (ordinal == 0) {
                    ((rox)a4).c();
                    return;
                }
                if (ordinal != 8) {
                    return;
                }
                ((rox)a4).d = true;
                return;
            }
            case 16: {
                ((CommandRunCompletionCallback)this.a).completion(Status.b((Throwable)o));
                return;
            }
            case 15: {
                final Object a6 = this.a;
                final Throwable t = (Throwable)o;
                final ooq ooq = (ooq)a6;
                ooq.a.a(31, "Command error", ooq.b, t);
                return;
            }
            case 14: {
                ((omo)this.a).a = (byte[])o;
                return;
            }
            case 13: {
                final Object a7 = this.a;
                final byte[] array = (byte[])o;
                ((EnvironmentDataObserver)a7).environmentDataDidChange();
                return;
            }
            case 12: {
                final Object a8 = this.a;
                final omx omx = (omx)o;
                final int n = okt.n;
                ((ovp)a8).c();
                return;
            }
            case 11: {
                final Object a9 = this.a;
                final asir asir = (asir)o;
                final int n2 = okt.n;
                ((ovp)a9).i();
                return;
            }
            case 10: {
                final Object a10 = this.a;
                final Throwable t2 = (Throwable)o;
                ((c)a10).b(MutedAutoplayState.a);
                return;
            }
            case 9: {
                ((c)this.a).b((MutedAutoplayState)o);
                return;
            }
            case 8: {
                final Object a11 = this.a;
                if (o) {
                    final c c = (c)a11;
                    final angr c2 = c.c;
                    if (c2 != null && (c2.c & 0x4) != 0x0) {
                        c.j.q(c2.g.I());
                    }
                }
                return;
            }
            case 7: {
                ((c)this.a).k.h(2131431138, (boolean)o);
                return;
            }
            case 6: {
                ((f)this.a).b = (boolean)o;
                return;
            }
            case 5: {
                final Object a12 = this.a;
                ((g)a12).e = (com.google.android.apps.youtube.embeddedplayer.service.model.c)o;
                ((abbk)a12).Y();
                return;
            }
            case 4: {
                final Object a13 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.model.c k = (com.google.android.apps.youtube.embeddedplayer.service.model.c)o;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e g = ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b)a13).g;
                if (g != null) {
                    g.k = k;
                    final ImageView d = g.d;
                    if (d != null) {
                        d.setImageBitmap(k.d);
                    }
                }
                return;
            }
            case 3: {
                ((b)this.a).a((aani)o);
                return;
            }
            case 2: {
                ((b)this.a).b((aans)o);
                return;
            }
            case 1: {
                final Object a14 = this.a;
                final int a15 = ((PlayerViewModeData)o).a;
                ((l)a14).P = a15;
                if (a15 != 1 && a15 != 3) {
                    ((abbk)a14).mk();
                    return;
                }
                ((abbk)a14).mm();
                return;
            }
            case 0: {
                ((l)this.a).R = (com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c)o;
            }
        }
    }
}
