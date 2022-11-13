import java.util.Iterator;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import android.widget.SeekBar;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.creation.common.ui.VolumeTrackView;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import android.view.View;
import java.util.Set;
import com.google.android.libraries.youtube.creation.editor.volume.Volumes;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ham implements uao
{
    public static final xab a;
    static final xab b;
    static final xab c;
    public Volumes d;
    final hal e;
    public final Set f;
    public final atjs g;
    public View h;
    public tyz i;
    public uca j;
    public twx k;
    aezp l;
    public boolean m;
    public final aeea n;
    private final ubi o;
    private final Map p;
    private final boolean q;
    private View r;
    private uan s;
    private aezp t;
    
    static {
        a = xaa.c(106445);
        b = xaa.b(106442);
        c = xaa.c(106448);
    }
    
    public ham(final ubi o, final aujg aujg, final wyw wyw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = Volumes.b();
        this.e = new hal(this);
        this.f = EnumSet.of(apoy.b);
        this.p = new EnumMap(apoy.class);
        final aeyo a = aeyo.a;
        this.l = (aezp)a;
        this.t = (aezp)a;
        this.o = o;
        this.n = new aeea(wyw, (byte[])null);
        this.g = atjs.e();
        this.q = aujg.bx();
    }
    
    public static alhi t(final ahaz ahaz) {
        final ahaz builder = ((ahbh)alhi.a).createBuilder();
        final alij d = (alij)ahaz.build();
        builder.copyOnWrite();
        final alhi alhi = (alhi)builder.instance;
        d.getClass();
        alhi.D = d;
        alhi.c |= 0x40000;
        return (alhi)builder.build();
    }
    
    private final void v(final apoy apoy) {
        if (this.f.contains(apoy)) {
            return;
        }
        this.f.add(apoy);
        this.d.e(1.0f, apoy);
        this.f();
        this.y(apoy, 0);
        this.z();
    }
    
    private final void w(final apoy apoy) {
        if (!this.f.contains(apoy)) {
            return;
        }
        this.f.remove(apoy);
        this.y(apoy, 8);
        this.x(apoy);
        this.z();
    }
    
    private final void x(final apoy apoy) {
        this.d.e(Volumes.b().a(apoy), apoy);
        this.f();
    }
    
    private final void y(final apoy apoy, final int visibility) {
        if (this.p.containsKey(apoy)) {
            this.p.get(apoy).setVisibility(visibility);
        }
    }
    
    private final void z() {
        if (this.r == null) {
            return;
        }
        final uca j = this.j;
        int visibility = 8;
        if (j != null) {
            if (this.f.size() > 1) {
                visibility = 0;
            }
            else {
                this.x(apoy.b);
            }
        }
        final View r = this.r;
        if (r != null && visibility != r.getVisibility()) {
            this.r.setVisibility(visibility);
            if (visibility == 0) {
                this.n.cG(ham.a).h();
                return;
            }
            this.n.cG(ham.a).f();
        }
    }
    
    public final Volumes a() {
        return new Volumes(this.d);
    }
    
    public final wzz b(final apoy apoy) {
        return xmm.ac(((wyw)this.n.a).g((Object)apoy, ham.c));
    }
    
    public final alii c(final apoy apoy) {
        final ahaz builder = ((ahbh)alii.a).createBuilder();
        builder.copyOnWrite();
        final alii alii = (alii)builder.instance;
        alii.c = apoy.f;
        alii.b |= 0x1;
        final float a = this.a().a(apoy);
        builder.copyOnWrite();
        final alii alii2 = (alii)builder.instance;
        alii2.b |= 0x2;
        alii2.d = a;
        return (alii)builder.build();
    }
    
    public final asht d() {
        return (asht)this.g;
    }
    
    public final void e(final uan s) {
        this.s = s;
    }
    
    public final void f() {
        final uca j = this.j;
        if (j != null) {
            final Volumes d = this.d;
            if (!j.c.c(d)) {
                j.c = new Volumes(d);
                j.a();
            }
        }
    }
    
    public final void g() {
    }
    
    public final void h(View viewById, final aiqj b) {
        this.i = tyz.c(viewById, (tyy)this.e);
        final twx cd = this.n.cD(ham.b);
        cd.b = (ahbh)b;
        this.k = cd;
        viewById = viewById.findViewById(2131431493);
        viewById.getClass();
        (this.r = viewById).setOnClickListener((View$OnClickListener)new gyj(this, 3));
        this.z();
    }
    
    public final void i() {
        final uan s = this.s;
        if (s != null) {
            final Volumes volumes = new Volumes(this.d);
            final tye tye = (tye)s;
            if (tye.B) {
                tye.t.af(volumes);
            }
        }
    }
    
    public final void j(final Bundle bundle) {
        if (bundle.containsKey("VOLUMES_KEY")) {
            final Volumes d = (Volumes)bundle.getParcelable("VOLUMES_KEY");
            if (d != null) {
                this.d = d;
            }
        }
        if (bundle.containsKey("MUSIC_ID_KEY")) {
            this.l = aezp.j((Object)bundle.getString("MUSIC_ID_KEY"));
        }
    }
    
    public final void k(final Bundle bundle) {
        bundle.putParcelable("VOLUMES_KEY", (Parcelable)this.d);
        if (this.l.h()) {
            bundle.putString("MUSIC_ID_KEY", (String)this.l.c());
        }
    }
    
    public final void l() {
        this.s = null;
    }
    
    public final void m() {
        this.i();
        final tyz i = this.i;
        if (i != null) {
            i.d();
        }
    }
    
    public final void n() {
        if (this.p.containsKey(apoy.c) && this.t.h()) {
            this.p.get(apoy.c).b((String)this.t.c());
        }
    }
    
    public final void o(final uca j, final boolean b) {
        this.j = j;
        if (b) {
            this.d = new Volumes(j.c);
            final aezp b2 = j.b;
            if (this.q) {
                Object l;
                if (b2.h()) {
                    l = aezp.k((Object)((arbc)b2.c()).c);
                }
                else {
                    l = aeyo.a;
                }
                this.l = (aezp)l;
            }
            else {
                Object i;
                if (this.o.a() != null) {
                    i = aezp.k((Object)this.o.a().n());
                }
                else {
                    i = aeyo.a;
                }
                this.l = (aezp)i;
            }
        }
        this.z();
    }
    
    public final void p(int n, final apoy apoy, final View view) {
        final VolumeTrackView volumeTrackView = (VolumeTrackView)view.findViewById(n);
        volumeTrackView.getClass();
        n = (int)(this.d.a(apoy) * 100.0f);
        volumeTrackView.a(n);
        volumeTrackView.c(n);
        final SeekBar a = volumeTrackView.a;
        a.getClass();
        a.setProgress(n);
        volumeTrackView.b = new hak(this, apoy);
        this.p.put(apoy, volumeTrackView);
        if (!this.f.contains(apoy)) {
            n = 8;
        }
        else {
            n = 0;
        }
        volumeTrackView.setVisibility(n);
    }
    
    public final void q(aezp j) {
        if (j.h()) {
            final ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack)j.c();
            if (this.o.r(shortsCreationSelectedTrack)) {
                final aezp k = aezp.k((Object)shortsCreationSelectedTrack.n());
                if (!this.l.equals((Object)k)) {
                    this.l = k;
                }
                j = aezp.j((Object)shortsCreationSelectedTrack.m());
                if (!this.t.equals((Object)j)) {
                    this.t = j;
                    this.n();
                }
                this.v(apoy.c);
            }
            return;
        }
        this.w(apoy.c);
    }
    
    public final void r(final boolean b) {
        if (b) {
            this.v(apoy.d);
            return;
        }
        this.w(apoy.d);
    }
    
    public final boolean s() {
        final tyz i = this.i;
        return i != null && !i.f();
    }
    
    public final ahaz u() {
        final ahaz builder = ((ahbh)alij.a).createBuilder();
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            final alii c = this.c((apoy)iterator.next());
            builder.copyOnWrite();
            final alij alij = (alij)builder.instance;
            c.getClass();
            final ahbx n = alij.n;
            if (!n.c()) {
                alij.n = ahbh.mutableCopy(n);
            }
            alij.n.add((Object)c);
        }
        return builder;
    }
}
