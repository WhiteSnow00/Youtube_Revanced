import com.google.android.libraries.youtube.player.subtitles.model.AutoValue_SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abur
{
    public String a;
    public CharSequence b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private boolean i;
    private int j;
    private String k;
    private String l;
    private boolean m;
    private byte n;
    
    public abur() {
    }
    
    public abur(final SubtitleTrack subtitleTrack) {
        final AutoValue_SubtitleTrack autoValue_SubtitleTrack = (AutoValue_SubtitleTrack)subtitleTrack;
        this.c = autoValue_SubtitleTrack.a;
        this.d = autoValue_SubtitleTrack.b;
        this.e = autoValue_SubtitleTrack.c;
        this.f = autoValue_SubtitleTrack.d;
        this.g = autoValue_SubtitleTrack.e;
        this.h = autoValue_SubtitleTrack.f;
        this.i = autoValue_SubtitleTrack.g;
        this.j = autoValue_SubtitleTrack.h;
        this.a = autoValue_SubtitleTrack.i;
        this.k = autoValue_SubtitleTrack.j;
        this.l = autoValue_SubtitleTrack.k;
        this.b = autoValue_SubtitleTrack.l;
        this.m = autoValue_SubtitleTrack.m;
        this.n = 15;
    }
    
    public final SubtitleTrack a() {
        if (this.n == 15) {
            final String c = this.c;
            if (c != null) {
                final String d = this.d;
                if (d != null) {
                    final String e = this.e;
                    if (e != null) {
                        final String f = this.f;
                        if (f != null) {
                            final String h = this.h;
                            if (h != null) {
                                final String k = this.k;
                                if (k != null) {
                                    final String l = this.l;
                                    if (l != null) {
                                        return (SubtitleTrack)new AutoValue_SubtitleTrack(c, d, e, f, this.g, h, this.i, this.j, this.a, k, l, this.b, this.m);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" languageCode");
        }
        if (this.d == null) {
            sb.append(" languageName");
        }
        if (this.e == null) {
            sb.append(" trackName");
        }
        if (this.f == null) {
            sb.append(" videoId");
        }
        if ((this.n & 0x1) == 0x0) {
            sb.append(" format");
        }
        if (this.h == null) {
            sb.append(" trackId");
        }
        if ((this.n & 0x2) == 0x0) {
            sb.append(" isForOffline");
        }
        if ((this.n & 0x4) == 0x0) {
            sb.append(" autoTranslateRecommendedDisplayOrder");
        }
        if (this.k == null) {
            sb.append(" vssId");
        }
        if (this.l == null) {
            sb.append(" url");
        }
        if ((this.n & 0x8) == 0x0) {
            sb.append(" isForcedTrack");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final int j) {
        this.j = j;
        this.n |= 0x4;
    }
    
    public final void c(final int g) {
        this.g = g;
        this.n |= 0x1;
    }
    
    public final void d(final boolean i) {
        this.i = i;
        this.n |= 0x2;
    }
    
    public final void e(final boolean m) {
        this.m = m;
        this.n |= 0x8;
    }
    
    public final void f(final String c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null languageCode");
    }
    
    public final void g(final String d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null languageName");
    }
    
    public final void h(final String h) {
        if (h != null) {
            this.h = h;
            return;
        }
        throw new NullPointerException("Null trackId");
    }
    
    public final void i(final String e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null trackName");
    }
    
    public final void j(final String l) {
        if (l != null) {
            this.l = l;
            return;
        }
        throw new NullPointerException("Null url");
    }
    
    public final void k(final String f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null videoId");
    }
    
    public final void l(final String k) {
        if (k != null) {
            this.k = k;
            return;
        }
        throw new NullPointerException("Null vssId");
    }
}
