import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class fep extends fes
{
    final fet a;
    
    public fep(final fet a, final avu avu, final byte[] array) {
        super(this.a = a, avu, (byte[])null);
    }
    
    protected final /* bridge */ Object a(final byte[] array) {
        return BrowseResponseModel.e(array, this.a.e);
    }
    
    protected final byte[] b(final Object o) {
        return ((BrowseResponseModel)o).k();
    }
}
