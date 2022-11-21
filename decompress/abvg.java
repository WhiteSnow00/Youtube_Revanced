import android.view.accessibility.CaptioningManager$CaptioningChangeListener;
import java.util.Iterator;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.HashSet;
import android.view.accessibility.CaptioningManager;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvg
{
    public final vbo a;
    public final acjq b;
    private final Context c;
    private final Set d;
    private CaptioningManager e;
    private abvf f;
    
    public abvg(final Context c, final acjq b, final vbo a, final byte[] array) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = new HashSet();
        this.a = a;
    }
    
    private final CaptioningManager g() {
        if (this.e == null) {
            this.e = (CaptioningManager)this.c.getSystemService("captioning");
        }
        return this.e;
    }
    
    public final float a() {
        return this.g().getFontScale();
    }
    
    public final SubtitlesStyle b() {
        return new SubtitlesStyle(this.g().getUserStyle(), this.a);
    }
    
    public final void c(final float n) {
        monitorenter(this);
        try {
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((abvb)iterator.next()).p(n);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void d(final SubtitlesStyle subtitlesStyle) {
        monitorenter(this);
        try {
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((abvb)iterator.next()).q(subtitlesStyle);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e(final abvb abvb) {
        synchronized (this) {
            if (this.d.isEmpty()) {
                this.f = new abvf(this);
                this.g().addCaptioningChangeListener((CaptioningManager$CaptioningChangeListener)this.f);
            }
            this.d.add(abvb);
        }
    }
    
    public final void f(final abvb abvb) {
        synchronized (this) {
            this.d.remove(abvb);
            if (this.d.isEmpty()) {
                this.g().removeCaptioningChangeListener((CaptioningManager$CaptioningChangeListener)this.f);
            }
        }
    }
}
