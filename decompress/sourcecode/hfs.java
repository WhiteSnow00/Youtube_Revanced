import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import java.util.concurrent.TimeUnit;
import android.view.ViewGroup;
import android.graphics.PorterDuff$Mode;
import android.content.Context;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfs
{
    public final her a;
    public final View b;
    final TextView c;
    public final TextView d;
    final SeekBar e;
    final hfr f;
    public EditableVideo g;
    public boolean h;
    public long i;
    long j;
    public long k;
    public long l;
    final SeekBar$OnSeekBarChangeListener m;
    public final eg n;
    private final Context o;
    
    public hfs(final her a, final View view, final Context o, final hfr f) {
        this.i = 0L;
        this.j = 0L;
        final hfq hfq = new hfq(this, 0);
        this.m = (SeekBar$OnSeekBarChangeListener)hfq;
        this.a = a;
        this.f = f;
        this.o = o;
        final View viewById = view.findViewById(2131432332);
        this.b = viewById;
        final SeekBar e = (SeekBar)view.findViewById(2131430419);
        this.e = e;
        if (e != null) {
            e.setProgressDrawable(o.getResources().getDrawable(2131233290));
            e.getThumb().setColorFilter(o.getResources().getColor(2131102393), PorterDuff$Mode.SRC_IN);
        }
        this.d = (TextView)view.findViewById(2131432304);
        this.c = (TextView)view.findViewById(2131430418);
        (this.n = new eg((ViewGroup)view.findViewById(2131430990))).ab();
        e.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)hfq);
        viewById.setVisibility(8);
    }
    
    public final String a(final long n) {
        final Context o = this.o;
        o.getClass();
        return qhd.k(o, n, false);
    }
    
    public final void b(final long n) {
        this.j = Math.max(0L, this.i - afqo.c(n).toMillis());
    }
    
    public final void c() {
        final TextView c = this.c;
        if (c != null) {
            c.setText((CharSequence)this.a(this.l));
        }
    }
    
    public final void d(long i) {
        final long j = this.j;
        long l = i;
        if (i > j) {
            l = j;
        }
        i = this.i;
        int progress;
        final int n = progress = 0;
        if (i > 0L) {
            progress = n;
            if (j > 0L) {
                progress = (int)(100L * l / j);
            }
        }
        if (progress == 0) {
            l = 0L;
        }
        if (this.e.getProgress() != progress) {
            this.e.setProgress(progress);
        }
        if (this.l != l) {
            this.l = l;
            this.c();
        }
    }
    
    public final void e() {
        this.c();
        final hfr f = this.f;
        if (f != null) {
            final long l = this.l;
            final hfl hfl = (hfl)f;
            if (hfl.ar != null) {
                final long as = hfl.as;
                final long micros = TimeUnit.MILLISECONDS.toMicros(l);
                final ShortsVideoTrimView2 c = hfl.c;
                if (c != null) {
                    c.X(as - micros);
                }
            }
        }
    }
}
