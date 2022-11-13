import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jeq implements abkx
{
    private final aadj a;
    private final afvt b;
    private final ttt c;
    private final ttt d;
    private final arwh e;
    private final adlp f;
    
    public jeq(final adgj adgj, final adlp f, final aadd aadd, final aadj a, final arwh e, final afvt b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = new jeo(adgj, b, null);
        this.d = new jep(aadd, a);
    }
    
    public final abkw a(final PlaybackStartDescriptor playbackStartDescriptor) {
        final akcn f = this.e.f();
        boolean b = true;
        boolean b2 = false;
        Label_0052: {
            if (f != null) {
                anfc anfc;
                if ((anfc = f.j) == null) {
                    anfc = anfc.a;
                }
                if (anfc.h) {
                    b2 = true;
                    break Label_0052;
                }
            }
            b2 = false;
        }
        Label_0091: {
            if (f != null) {
                amue amue;
                if ((amue = f.g) == null) {
                    amue = amue.a;
                }
                if (amue.k) {
                    break Label_0091;
                }
            }
            b = false;
        }
        if (b2 || b) {
            final adlp f2 = this.f;
            final aadj a = this.a;
            final afvt b3 = this.b;
            final adgj adgj = (adgj)((atke)f2.a).a();
            adgj.getClass();
            final aadd aadd = (aadd)((atke)f2.e).a();
            aadd.getClass();
            final arwh arwh = (arwh)((atke)f2.b).a();
            arwh.getClass();
            ((atke)f2.g).a().getClass();
            final aaag aaag = (aaag)((atke)f2.d).a();
            aaag.getClass();
            final aanx aanx = (aanx)((atke)f2.c).a();
            aanx.getClass();
            final aaec aaec = (aaec)((atke)f2.f).a();
            aaec.getClass();
            b3.getClass();
            return (abkw)new aadb(adgj, aadd, arwh, aaag, aanx, aaec, a, b3, (byte[])null, (byte[])null, (byte[])null);
        }
        if (playbackStartDescriptor != null && playbackStartDescriptor.s()) {
            return (abkw)this.d.a();
        }
        return (abkw)this.c.a();
    }
}
