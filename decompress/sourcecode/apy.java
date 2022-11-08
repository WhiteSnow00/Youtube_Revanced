import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class apy extends DataSetObserver
{
    final /* synthetic */ apz a;
    
    public apy(final apz a) {
        this.a = a;
    }
    
    public final void onChanged() {
        final apz a = this.a;
        a.b = true;
        a.notifyDataSetChanged();
    }
    
    public final void onInvalidated() {
        final apz a = this.a;
        a.b = false;
        a.notifyDataSetInvalidated();
    }
}
