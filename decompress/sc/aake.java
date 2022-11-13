import android.media.AudioManager$OnAudioFocusChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aake implements AudioManager$OnAudioFocusChangeListener
{
    public static final int e = 0;
    public boolean a;
    public boolean b;
    public final aakg c;
    public int d;
    
    public aake(final aakg c) {
        this.c = c;
        this.a = false;
        this.b = false;
        this.d = 1;
    }
    
    public final boolean a() {
        return this.d != 1;
    }
    
    public final void onAudioFocusChange(int n) {
        if (this.c.b.k) {
            return;
        }
        if (n != -3) {
            if (n == -2 || n == -1) {
                final abje b = abje.b;
                String s;
                if (n == -2) {
                    s = "AudioFocus LOSS_TRANSIENT";
                }
                else {
                    s = "AudioFocus LOSS";
                }
                abjf.a(b, s, new Object[0]);
                final aakf h = this.c.h;
                if (h != null) {
                    boolean a;
                    if (h.f() && n == -2) {
                        n = -2;
                        a = true;
                    }
                    else {
                        a = false;
                    }
                    this.a = a;
                    final aakg c = this.c;
                    final boolean b2 = c.l == 2;
                    if (b2) {
                        if (n == -2) {
                            final abpq abpq = (abpq)c.h;
                            abpq.ai(abpq.p.k(), 4);
                        }
                        else {
                            ((abpq)c.h).ai(false, 4);
                        }
                    }
                    else {
                        c.h.g();
                    }
                    String s2;
                    if (!b2) {
                        s2 = "mute";
                    }
                    else {
                        s2 = "pause";
                    }
                    ttr.b("AudioFocus loss; Will ".concat(s2));
                }
                this.c.j = 0;
                return;
            }
            if (n == 1 || n == 2 || n == 3) {
                abjf.a(abje.b, "AudioFocus GAIN; shouldResume=%b", new Object[] { this.a });
                final aakg c2 = this.c;
                c2.j = 1;
                final aakf h2 = c2.h;
                if (h2 != null) {
                    h2.b(false);
                }
                if (this.a) {
                    final aakg c3 = this.c;
                    if (!c3.b.i && !this.a()) {
                        this.b = true;
                        return;
                    }
                    this.a = false;
                    this.b = false;
                    if (c3.h != null) {
                        abjf.a(abje.b, "AudioFocus GAIN; transient resume", new Object[0]);
                        this.c.h.d();
                    }
                }
            }
        }
        else {
            abjf.a(abje.b, "AudioFocus DUCK", new Object[0]);
            final aakf h3 = this.c.h;
            if (h3 != null) {
                h3.b(true);
                this.c.j = 2;
                ttr.b("AudioFocus loss; Will lower volume");
            }
        }
    }
}
