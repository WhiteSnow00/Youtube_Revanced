import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evk extends rxh implements eun
{
    private boolean k;
    
    public evk(final atke atke, final ccb ccb, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6, final atke atke7, final atke atke8, final atke atke9, final atke atke10, final atke atke11, final qdw qdw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(atke, atke2, atke3, atke4, atke5, atke6, atke7, atke8, atke9, atke10, atke11);
        ccb.p((eun)this);
    }
    
    public final void h(final abke abke, final PlayerResponseModel playerResponseModel, final abvx abvx, final String s, final String s2) {
        if (!this.k) {
            super.h(abke, playerResponseModel, abvx, s, s2);
        }
    }
    
    public final void l(final PlayerResponseModel playerResponseModel) {
        if (!this.k) {
            super.l(playerResponseModel);
        }
    }
    
    public final void s(final eum eum) {
    }
    
    public final void t(final euo euo) {
        this.k = true;
    }
    
    public final void x() {
        this.k = false;
    }
}
