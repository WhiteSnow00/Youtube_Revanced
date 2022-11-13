import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivr
{
    public final atjm a;
    public final atjm b;
    public final wyw c;
    public final atke d;
    public final ghp e;
    public ImageView f;
    public final vai g;
    
    public ivr(final abty abty, final vaf vaf, final wyw c, final atke d, final ghp e, final vai g) {
        final Boolean value = false;
        this.a = atjm.aW((Object)value);
        this.b = atjm.aW((Object)value);
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = null;
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        final boolean bz = alxp.bz;
        if (!fbu.aj(vaf) && !bz) {
            return;
        }
        abty.a((abtx)new ivq(this, 0));
    }
}
