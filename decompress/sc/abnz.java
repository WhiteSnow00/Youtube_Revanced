import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnz implements ynj
{
    private final abny a;
    
    public abnz(final abny a) {
        this.a = a;
    }
    
    public final ynm a(final FormatStreamModel formatStreamModel) {
        final long j = formatStreamModel.j();
        if (formatStreamModel.b != null && (j > 0L || j == -1L) && this.a != null) {
            return (ynm)new abnv((ynm)new ynh(), this.a, formatStreamModel);
        }
        return (ynm)new ynh();
    }
}
