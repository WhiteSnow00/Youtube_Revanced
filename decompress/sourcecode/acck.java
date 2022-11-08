import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acck implements oss
{
    final /* synthetic */ acbf a;
    final /* synthetic */ boolean b;
    final /* synthetic */ wxz c;
    
    public acck(final acbf a, final boolean b, final wxz c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void e(final View view) {
        alff b;
        final alff alff = b = this.a.b;
        if (this.b) {
            agza agza;
            if (alff == null) {
                agza = ((agzi)alff.a).createBuilder();
            }
            else {
                agza = ((agzi)alff).toBuilder();
            }
            final agza builder = ((agzi)alex.a).createBuilder();
            builder.copyOnWrite();
            alex.a((alex)builder.instance);
            agza.copyOnWrite();
            final alff alff2 = (alff)agza.instance;
            final alex o = (alex)builder.build();
            o.getClass();
            alff2.O = o;
            alff2.d |= 0x8;
            b = (alff)agza.build();
        }
        this.a.a.t(this.c, b);
    }
}
