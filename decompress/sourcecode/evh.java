import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evh extends rvc implements euk
{
    private boolean k;
    
    public evh(final atjj atjj, final cca cca, final atjj atjj2, final atjj atjj3, final atjj atjj4, final atjj atjj5, final atjj atjj6, final atjj atjj7, final atjj atjj8, final atjj atjj9, final atjj atjj10, final atjj atjj11, final qcv qcv, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(atjj, atjj2, atjj3, atjj4, atjj5, atjj6, atjj7, atjj8, atjj9, atjj10, atjj11);
        cca.p((euk)this);
    }
    
    public final void h(final abim abim, final PlayerResponseModel playerResponseModel, final abtt abtt, final String s, final String s2) {
        if (!this.k) {
            super.h(abim, playerResponseModel, abtt, s, s2);
        }
    }
    
    public final void l(final PlayerResponseModel playerResponseModel) {
        if (!this.k) {
            super.l(playerResponseModel);
        }
    }
    
    public final void s(final euj euj) {
    }
    
    public final void t(final eul eul) {
        this.k = true;
    }
    
    public final void x() {
        this.k = false;
    }
}
