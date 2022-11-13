import android.os.Parcelable;
import android.content.Context;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class guf implements zpf
{
    public final atjy a;
    final qcy b;
    private final Uri c;
    private final byte[] d;
    
    public guf(final qcy b, final Uri c, final byte[] d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = atjy.ag();
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dbj dbj) {
        ttr.d("Error loading video", (Throwable)dbj);
        ((tqd)this.b.g).e((Throwable)dbj);
        this.a.ts((Object)guh.a(1, ((tqd)this.b.g).b((Throwable)dbj)));
    }
    
    public final /* bridge */ void mX(final Object o) {
        final akup akup = (akup)o;
        if ((akup.b & 0x2) != 0x0) {
            aiqj aiqj;
            if ((aiqj = akup.d) == null) {
                aiqj = aiqj.a;
            }
            aiqj a = aiqj;
            if (this.d != null) {
                final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
                final ahab x = ahab.x(this.d);
                ((ahaz)ahbb).copyOnWrite();
                final aiqj aiqj2 = (aiqj)ahbb.instance;
                aiqj2.b |= 0x1;
                aiqj2.c = x;
                a = (aiqj)((ahaz)ahbb).build();
            }
            final abjp d = PlaybackStartDescriptor.d();
            d.a = a;
            d.c(false);
            final PlaybackStartDescriptor a2 = d.a();
            if (adkp.ae((Object)a2.k(), (Object)"")) {
                if (adkp.ae((Object)a2.i(), (Object)"") && a2.l() == null) {
                    this.a.ts((Object)guh.a(2, String.format("Unsupported link: %s", this.c)));
                    return;
                }
            }
            final atjy a3 = this.a;
            final qcy b = this.b;
            if (!b.W() && !((abjj)b.f).k) {
                final Object e = b.e;
                final WatchDescriptor watchDescriptor = new WatchDescriptor(a2);
                watchDescriptor.i();
                final Context context = (Context)e;
                context.startActivity(fwc.h(context).putExtra("watch", (Parcelable)watchDescriptor).putExtra("playback_start_flag", 3));
            }
            else {
                ((abpl)((atke)b.b).a()).d(a2);
            }
            a3.ts((Object)guh.a);
        }
    }
    
    public final void mY() {
    }
}
