import java.util.Iterator;
import java.util.List;
import android.animation.TimeInterpolator;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmn implements acxf
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public jmn(final VoiceSearchActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jmn(final jmp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int n) {
        if (this.b != 0) {
            if (n > 0) {
                if (gkt.aw(((VoiceSearchActivity)this.a).ap) && ((VoiceSearchActivity)this.a).p.t(alku.K)) {
                    final VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity)this.a;
                    if (!voiceSearchActivity.M) {
                        voiceSearchActivity.M = true;
                        voiceSearchActivity.p.y("voz_ss", alku.K);
                    }
                }
                ((VoiceSearchActivity)this.a).c.b(n);
            }
            return;
        }
        if (n > 0 && gkt.aw(((jmp)this.a).C) && ((jmp)this.a).h.t(alku.K)) {
            final jmp jmp = (jmp)this.a;
            if (!jmp.x) {
                jmp.x = true;
                jmp.h.y("voz_ss", alku.K);
            }
        }
        ((jmp)this.a).b.g(n);
    }
    
    public final void b() {
        if (this.b != 0) {
            if (gkt.aw(((VoiceSearchActivity)this.a).ap) && ((VoiceSearchActivity)this.a).p.t(alku.K)) {
                final VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity)this.a;
                voiceSearchActivity.N = true;
                voiceSearchActivity.p.y("voz_mf", alku.K);
            }
            final VoiceSearchActivity voiceSearchActivity2 = (VoiceSearchActivity)this.a;
            voiceSearchActivity2.h = false;
            final acxg i = voiceSearchActivity2.i;
            if (i != null) {
                i.d();
            }
            voiceSearchActivity2.c.setEnabled(false);
            voiceSearchActivity2.c.e();
            voiceSearchActivity2.W.animate().alpha(0.0f).setDuration(200L).setInterpolator((TimeInterpolator)voiceSearchActivity2.aj);
            return;
        }
        if (gkt.aw(((jmp)this.a).C) && ((jmp)this.a).h.t(alku.K)) {
            final jmp jmp = (jmp)this.a;
            jmp.y = true;
            jmp.h.y("voz_mf", alku.K);
        }
        final jmp jmp2 = (jmp)this.a;
        jmp2.n = false;
        final acxg j = jmp2.j;
        if (j != null) {
            j.d();
        }
        ((jmp)this.a).b.m();
    }
    
    public final void c() {
        if (this.b != 0) {
            ((VoiceSearchActivity)this.a).d.setVisibility(0);
            ((VoiceSearchActivity)this.a).F.setVisibility(0);
            ((VoiceSearchActivity)this.a).c.c();
            return;
        }
        ((jmp)this.a).b.n();
    }
    
    public final void d(final List list) {
        if (this.b != 0) {
            if (!((VoiceSearchActivity)this.a).m && !list.isEmpty() && ((VoiceSearchActivity)this.a).p.t(alku.K)) {
                ((VoiceSearchActivity)this.a).p.y("voz_ftr", alku.K);
                ((VoiceSearchActivity)this.a).m = true;
            }
            for (final aeub aeub : list) {
                if (aeub.c == 1.0) {
                    ((VoiceSearchActivity)this.a).O = true;
                }
                final VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity)this.a;
                if (voiceSearchActivity.c.b != 1) {
                    voiceSearchActivity.J.setVisibility(8);
                    ((VoiceSearchActivity)this.a).G.setVisibility(8);
                    ((VoiceSearchActivity)this.a).W.animate().alpha(0.0f).setDuration(200L).setInterpolator((TimeInterpolator)((VoiceSearchActivity)this.a).aj);
                }
                if (aeub.c >= 0.8) {
                    ((VoiceSearchActivity)this.a).F.setText((CharSequence)"");
                    ((VoiceSearchActivity)this.a).d.setText((CharSequence)aeub.b);
                    if (!gkt.aw(((VoiceSearchActivity)this.a).ap) || !((VoiceSearchActivity)this.a).p.t(alku.K)) {
                        continue;
                    }
                    final VoiceSearchActivity voiceSearchActivity2 = (VoiceSearchActivity)this.a;
                    if (voiceSearchActivity2.N) {
                        continue;
                    }
                    voiceSearchActivity2.p.y("voz_sf", alku.K);
                }
                else {
                    ((VoiceSearchActivity)this.a).F.setText((CharSequence)aeub.b);
                }
            }
            return;
        }
        if (!((jmp)this.a).v && !list.isEmpty() && ((jmp)this.a).h.t(alku.K)) {
            ((jmp)this.a).h.y("voz_ftr", alku.K);
            ((jmp)this.a).v = true;
        }
        for (final aeub aeub2 : list) {
            final double n = aeub2.c;
            if (n == 1.0) {
                ((jmp)this.a).q = true;
            }
            if (n >= 0.8) {
                if (gkt.aw(((jmp)this.a).C) && ((jmp)this.a).h.t(alku.K)) {
                    final jmp jmp = (jmp)this.a;
                    if (!jmp.y) {
                        jmp.h.y("voz_sf", alku.K);
                    }
                }
                ((jmp)this.a).b.o(aeub2.b);
            }
            else {
                ((jmp)this.a).b.q(aeub2.b);
            }
        }
    }
}
