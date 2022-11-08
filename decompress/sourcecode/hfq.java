import com.google.android.libraries.video.editablevideo.EditableVideo;
import com.google.android.libraries.youtube.metadataeditor.thumbnail.FrameSelectorVideoViewModel;
import android.widget.SeekBar;
import com.google.android.libraries.youtube.creation.common.ui.VolumeTrackView;
import androidx.preference.SeekBarPreference;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfq implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public hfq(final SeekBarPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hfq(final VolumeTrackView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hfq(final hfs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hfq(final svo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hfq(final ufk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hfq(final wne a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hfq(final zfq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int k, final boolean b) {
        final int b2 = this.b;
        if (b2 == 0) {
            if (b) {
                final hfs hfs = (hfs)this.a;
                hfs.l = hfs.j * k / 100L;
                hfs.e();
            }
            return;
        }
        if (b2 == 1) {
            if (b) {
                final SeekBarPreference seekBarPreference = (SeekBarPreference)this.a;
                if (seekBarPreference.f || !seekBarPreference.c) {
                    seekBarPreference.l(seekBar);
                    return;
                }
            }
            final SeekBarPreference seekBarPreference2 = (SeekBarPreference)this.a;
            seekBarPreference2.o(k + seekBarPreference2.b);
            return;
        }
        if (b2 == 2) {
            final svo svo = (svo)this.a;
            svo.k = k;
            svo.b();
            return;
        }
        if (b2 == 3) {
            ((VolumeTrackView)this.a).a(k);
            final gzt b3 = ((VolumeTrackView)this.a).b;
            if (b3 != null && b) {
                b3.b.d.e(k / 100.0f, b3.a);
                b3.b.i();
            }
            ((VolumeTrackView)this.a).c(k);
            return;
        }
        if (b2 == 4) {
            ((ufk)this.a).k.setTextSize(2, k + 12.0f);
            ((ufk)this.a).l();
            return;
        }
        if (b2 != 5) {
            if (b) {
                final FrameSelectorVideoViewModel l = ((zfq)this.a).l;
                l.getClass();
                l.b((long)k);
            }
            return;
        }
        if (tqt.e(((wne)this.a).f)) {
            ((wne)this.a).m(k / (float)seekBar.getMax());
        }
        ((wne)this.a).j();
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        final int b = this.b;
        if (b == 0) {
            final her a = ((hfs)this.a).a;
            if (a != null) {
                a.g();
            }
            ((hfs)this.a).h = true;
            return;
        }
        if (b == 1) {
            ((SeekBarPreference)this.a).c = true;
            return;
        }
        if (b != 3) {
            return;
        }
        final gzt b2 = ((VolumeTrackView)this.a).b;
        if (b2 != null) {
            b2.c = b2.b.u();
        }
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        final int b = this.b;
        if (b == 0) {
            final hfs hfs = (hfs)this.a;
            final her a = hfs.a;
            if (a != null) {
                final EditableVideo g = hfs.g;
                if (g != null) {
                    a.b(g.m());
                }
            }
            final hfs hfs2 = (hfs)this.a;
            hfs2.h = false;
            final hfr f = hfs2.f;
            if (f != null) {
                ((hfl)f).aN.S(wya.c(110246)).i();
            }
            return;
        }
        if (b == 1) {
            ((SeekBarPreference)this.a).c = false;
            final int progress = seekBar.getProgress();
            final SeekBarPreference seekBarPreference = (SeekBarPreference)this.a;
            if (progress + seekBarPreference.b != seekBarPreference.a) {
                seekBarPreference.l(seekBar);
            }
            return;
        }
        if (b == 3) {
            final gzt b2 = ((VolumeTrackView)this.a).b;
            if (b2 != null) {
                b2.b.f();
                final gzv b3 = b2.b;
                final Object a2 = b3.n.a;
                final wxz b4 = b3.b(b2.a);
                final agza c = b2.c;
                final alge c2 = b2.b.c(b2.a);
                c.copyOnWrite();
                final algf algf = (algf)c.instance;
                final algf a3 = algf.a;
                c2.getClass();
                algf.o = c2;
                algf.b |= 0x10000;
                ((wwv)a2).J(2049, b4, gzv.t(c));
                b2.c.clear();
            }
            return;
        }
        if (b != 5) {
            return;
        }
        ((wne)this.a).m(seekBar.getProgress() / (float)seekBar.getMax());
    }
}
