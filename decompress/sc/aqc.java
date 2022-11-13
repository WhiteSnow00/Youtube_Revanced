import android.widget.Filter$FilterResults;
import android.database.Cursor;
import android.widget.Filter;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqc extends Filter
{
    final aqb a;
    
    public aqc(final aqb a) {
        this.a = a;
    }
    
    public final CharSequence convertResultToString(final Object o) {
        return this.a.b((Cursor)o);
    }
    
    protected final Filter$FilterResults performFiltering(final CharSequence charSequence) {
        final Cursor a = this.a.a(charSequence);
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        if (a != null) {
            filter$FilterResults.count = a.getCount();
            filter$FilterResults.values = a;
        }
        else {
            filter$FilterResults.count = 0;
            filter$FilterResults.values = null;
        }
        return filter$FilterResults;
    }
    
    protected final void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        final Cursor g = this.a.g();
        if (filter$FilterResults.values != null && filter$FilterResults.values != g) {
            this.a.d((Cursor)filter$FilterResults.values);
        }
    }
}
