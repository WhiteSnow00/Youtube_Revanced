import android.util.SparseArray;
import java.util.Iterator;
import android.view.View;
import java.util.Set;
import com.google.android.libraries.video.encoder.AudioEncoderOptions;
import com.google.android.libraries.video.encoder.VideoEncoderOptions;
import com.google.android.libraries.youtube.creation.common.media.TranscodeOptions;
import android.media.CamcorderProfile;
import java.util.concurrent.Callable;
import java.util.function.Function;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzm
{
    public Object a;
    public final Object b;
    
    public hzm() {
        this.b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public hzm(final ajsk b) {
        this.b = b;
        ajsl ajsl;
        if ((ajsl = b.h) == null) {
            ajsl = ajsl.a;
        }
        adkp.Q((ajsl.b & 0x8) != 0x0);
    }
    
    public hzm(final anjj b) {
        b.getClass();
        this.b = b;
        tvb.n(b.c);
        final int b2 = b.b;
        final boolean b3 = true;
        adkp.Q((b2 & 0x2) != 0x0);
        adkp.Q((b.b & 0x10) != 0x0);
        adkp.Q((b.b & 0x200) != 0x0 && b3);
    }
    
    public hzm(final eqy b) {
        this.b = b;
    }
    
    public hzm(final fzw b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = null;
    }
    
    public hzm(final Object a) {
        this.b = new HashSet();
        this.a = a;
    }
    
    public hzm(final msr msr, final arkg arkg, final arkg arkg2, Optional map, final byte[] array, final byte[] array2) {
        map = map.map((Function)far.h);
        final Boolean value = false;
        this.b = ((asht)map.orElse((Object)asht.X((Object)value))).ao((Object)value).Z((asjr)new fdo(arkg2, arkg, 10)).i(ashb.e);
        this.a = arkg.a();
        msr.Q((Callable)new csi(this, 12, (byte[])null, (byte[])null));
    }
    
    public hzm(final ubu b) {
        this.b = b;
    }
    
    public hzm(final xao b) {
        this.b = b;
    }
    
    private final int q() {
        final CamcorderProfile s = this.s();
        if (s != null) {
            return s.videoFrameHeight;
        }
        return 720;
    }
    
    private final int r() {
        final CamcorderProfile s = this.s();
        if (s != null) {
            return s.videoFrameWidth;
        }
        return 1280;
    }
    
    private final CamcorderProfile s() {
        if (this.a == null) {
            this.a = ujv.b(this.e());
        }
        return (CamcorderProfile)this.a;
    }
    
    public final byte[] a() {
        return ((anjj)this.b().b).m.I();
    }
    
    public final hzm b() {
        if (this.a == null) {
            ajsl ajsl;
            if ((ajsl = ((ajsk)this.b).h) == null) {
                ajsl = ajsl.a;
            }
            anjj anjj;
            if ((anjj = ajsl.c) == null) {
                anjj = anjj.a;
            }
            this.a = new hzm(anjj);
        }
        return (hzm)this.a;
    }
    
    public final int c() {
        final CamcorderProfile s = this.s();
        if (s != null) {
            return s.audioChannels;
        }
        return 2;
    }
    
    public final int d() {
        final CamcorderProfile s = this.s();
        if (s != null) {
            return s.audioSampleRate;
        }
        return 44100;
    }
    
    public final int e() {
        final ucd h = this.h();
        if (h != null) {
            final int q = h.q;
            if (q >= 0) {
                return q;
            }
        }
        return 5;
    }
    
    public final int f() {
        if (this.e() == 6) {
            return 8000000;
        }
        return 5000000;
    }
    
    public final TranscodeOptions g() {
        final rad f = VideoEncoderOptions.f();
        f.e(Math.max(this.r(), this.q()));
        f.d(Math.min(this.r(), this.q()));
        f.f();
        f.c(30.0f);
        f.b(this.f());
        final VideoEncoderOptions a = f.a();
        final zxh d = AudioEncoderOptions.d();
        d.h(this.d());
        d.g(this.c());
        return vdh.aR(a, d.f());
    }
    
    public final ucd h() {
        return ((ubu)this.b).b();
    }
    
    public final void i(final int n) {
        final ucd h = this.h();
        if (h != null) {
            h.P(n);
        }
    }
    
    public final void j(final float n) {
        final int[] g = ujz.g();
        final int n2 = g[0];
        final int n3 = g[1];
        Label_0103: {
            if (n2 >= 0 || n3 >= 0) {
                if (n2 >= 0) {
                    if (!CamcorderProfile.hasProfile(n2, 6)) {
                        break Label_0103;
                    }
                    final CamcorderProfile value = CamcorderProfile.get(n2, 6);
                    if (value == null || value.videoFrameRate < n) {
                        break Label_0103;
                    }
                }
                if (n3 >= 0) {
                    if (!CamcorderProfile.hasProfile(n3, 6)) {
                        break Label_0103;
                    }
                    final CamcorderProfile value2 = CamcorderProfile.get(n3, 6);
                    if (value2 == null || value2.videoFrameRate < n) {
                        break Label_0103;
                    }
                }
                this.i(6);
                return;
            }
        }
        this.i(5);
    }
    
    public final void k(final fxy fxy) {
        ((Set<fxy>)this.b).add(fxy);
    }
    
    public final void l(final fxy fxy) {
        ((Set)this.b).remove(fxy);
    }
    
    public final abpq m() {
        return ((abpu)this.a).n();
    }
    
    public final void n() {
        if (this.a != null) {
            return;
        }
        this.a = ((fzw)this.b).i();
    }
    
    public final void o() {
        final Object a = this.a;
        if (a == null) {
            return;
        }
        ((fzw)this.b).j((String)a);
        this.a = null;
    }
    
    public final void p(final Object a) {
        final Object a2 = this.a;
        if (a2 != a && (a2 == null || !a2.equals(a))) {
            this.a = a;
            for (final eg eg : this.b) {
                for (final dst dst : ((Map<K, Set>)eg.b).get(this)) {
                    final Object value = ((Map<K, Object>)eg.c).get(dst);
                    if (eg.G(dst)) {
                        final SparseArray g = dst.g();
                        for (int i = 0; i < g.size(); ++i) {
                            if (g.valueAt(i) == this) {
                                eg.J(g.keyAt(i), this, (View)value);
                            }
                        }
                    }
                    final int length = dst.v.length;
                }
            }
        }
    }
}
