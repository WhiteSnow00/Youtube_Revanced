// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.widget.ImageView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import io.grpc.Status;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k;

public final class d implements asmi
{
    public final Object a;
    private final int b;
    
    public d(final g a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final k a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final f a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final c a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final CommandRunCompletionCallback a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final EnvironmentDataObserver a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final ema a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public d(final one a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final opg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final owh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                ((CommandRunCompletionCallback)this.a).completion(Status.b((Throwable)o));
                return;
            }
            case 19: {
                final Object a = this.a;
                final Throwable t = (Throwable)o;
                final opg opg = (opg)a;
                opg.a.a(31, "Command error", opg.b, t);
                return;
            }
            case 18: {
                ((one)this.a).a = (byte[])o;
                return;
            }
            case 17: {
                final Object a2 = this.a;
                final byte[] array = (byte[])o;
                ((EnvironmentDataObserver)a2).environmentDataDidChange();
                return;
            }
            case 16: {
                final Object a3 = this.a;
                final onn onn = (onn)o;
                final int o2 = olk.o;
                ((owh)a3).c();
                return;
            }
            case 15: {
                final Object a4 = this.a;
                final asln asln = (asln)o;
                final int o3 = olk.o;
                ((owh)a4).i();
                return;
            }
            case 14: {
                final Object a5 = this.a;
                final Throwable t2 = (Throwable)o;
                ((c)a5).b(MutedAutoplayState.a);
                return;
            }
            case 13: {
                ((c)this.a).b((MutedAutoplayState)o);
                return;
            }
            case 12: {
                final Object a6 = this.a;
                if (o) {
                    final c c = (c)a6;
                    final aniy c2 = c.c;
                    if (c2 != null && (c2.c & 0x4) != 0x0) {
                        c.j.q(c2.g.I());
                    }
                }
                return;
            }
            case 11: {
                ((c)this.a).k.e(2131431138, (boolean)o);
                return;
            }
            case 10: {
                ((f)this.a).b = (boolean)o;
                return;
            }
            case 9: {
                final Object a7 = this.a;
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g)a7).e = (com.google.android.apps.youtube.embeddedplayer.service.model.c)o;
                ((abcq)a7).Y();
                return;
            }
            case 8: {
                final Object a8 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.model.c k = (com.google.android.apps.youtube.embeddedplayer.service.model.c)o;
                final e g = ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b)a8).g;
                if (g != null) {
                    g.k = k;
                    final ImageView d = g.d;
                    if (d != null) {
                        d.setImageBitmap(k.d);
                    }
                }
                return;
            }
            case 7: {
                ((b)this.a).a((aapf)o);
                return;
            }
            case 6: {
                ((b)this.a).b((aapp)o);
                return;
            }
            case 5: {
                ((k)this.a).R = (com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c)o;
                return;
            }
            case 4: {
                final Object a9 = this.a;
                final int a10 = ((PlayerViewModeData)o).a;
                ((k)a9).P = a10;
                if (a10 != 1 && a10 != 3) {
                    ((abcq)a9).mk();
                    return;
                }
                ((abcq)a9).ow();
                return;
            }
            case 3: {
                ((k)this.a).Q = (boolean)o;
                return;
            }
            case 2: {
                ((g)this.a).a = (veh)o;
                return;
            }
            case 1: {
                ((ema)this.a).w((BusSupported$Data)o);
                return;
            }
            case 0: {
                ((g)this.a).d = (boolean)o;
            }
        }
    }
}
