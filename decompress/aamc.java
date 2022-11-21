import android.media.AudioManager$OnAudioFocusChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamc implements AudioManager$OnAudioFocusChangeListener
{
    public static final int e = 0;
    public boolean a;
    public boolean b;
    public final aame c;
    public int d;
    
    public aamc(final aame c) {
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
                final abkl b = abkl.b;
                String s;
                if (n == -2) {
                    s = "AudioFocus LOSS_TRANSIENT";
                }
                else {
                    s = "AudioFocus LOSS";
                }
                abkm.a(b, s, new Object[0]);
                final aamd h = this.c.h;
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
                    final aame c = this.c;
                    final boolean b2 = c.l == 2;
                    if (b2) {
                        if (n == -2) {
                            final abqv abqv = (abqv)c.h;
                            abqv.ak(abqv.p.k(), 4);
                        }
                        else {
                            ((abqv)c.h).ak(false, 4);
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
                    tut.b("AudioFocus loss; Will ".concat(s2));
                }
                this.c.j = 0;
                return;
            }
            if (n == 1 || n == 2 || n == 3) {
                abkm.a(abkl.b, "AudioFocus GAIN; shouldResume=%b", this.a);
                final aame c2 = this.c;
                c2.j = 1;
                final aamd h2 = c2.h;
                if (h2 != null) {
                    h2.b(false);
                }
                if (this.a) {
                    final aame c3 = this.c;
                    if (!c3.b.i && !this.a()) {
                        this.b = true;
                        return;
                    }
                    this.a = false;
                    this.b = false;
                    if (c3.h != null) {
                        abkm.a(abkl.b, "AudioFocus GAIN; transient resume", new Object[0]);
                        this.c.h.d();
                    }
                }
            }
        }
        else {
            abkm.a(abkl.b, "AudioFocus DUCK", new Object[0]);
            final aamd h3 = this.c.h;
            if (h3 != null) {
                h3.b(true);
                this.c.j = 2;
                tut.b("AudioFocus loss; Will lower volume");
            }
        }
    }
}
