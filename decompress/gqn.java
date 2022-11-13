import java.util.List;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqn implements dak
{
    public final PlayBilling a;
    
    public gqn(final PlayBilling a) {
        this.a = a;
    }
    
    @Override
    public final void c(final daf daf, final List list) {
        final PlayBilling a = this.a;
        if (!a.f.isPresent()) {
            return;
        }
        final int a2 = daf.a;
        if (a2 != 0) {
            if (a2 != 1) {
                ((acc)a.f.get()).d((Throwable)new gqp("Unable to query sku details", 3, a2));
                return;
            }
            ((acc)a.f.get()).b();
        }
        else {
            if (list != null) {
                ((acc)a.f.get()).c((Object)list);
                return;
            }
            ((acc)a.f.get()).d((Throwable)new gqp("No items in sku details", "EMPTY_SKU_DETAILS"));
        }
    }
}
