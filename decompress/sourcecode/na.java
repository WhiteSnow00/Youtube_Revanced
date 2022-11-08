import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class na extends DataSetObserver
{
    final /* synthetic */ nb a;
    
    public na(final nb a) {
        this.a = a;
    }
    
    public final void onChanged() {
        if (this.a.x()) {
            this.a.v();
        }
    }
    
    public final void onInvalidated() {
        this.a.m();
    }
}
