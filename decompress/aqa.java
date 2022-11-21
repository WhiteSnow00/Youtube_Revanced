import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqa extends DataSetObserver
{
    final aqb a;
    
    public aqa(final aqb a) {
        this.a = a;
    }
    
    public final void onChanged() {
        final aqb a = this.a;
        a.b = true;
        a.notifyDataSetChanged();
    }
    
    public final void onInvalidated() {
        final aqb a = this.a;
        a.b = false;
        a.notifyDataSetInvalidated();
    }
}
