import com.google.android.libraries.elements.interfaces.ByteStore;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class acal extends iw
{
    final /* synthetic */ acan a;
    private boolean b;
    
    public acal(final acan a) {
        this.a = a;
        this.b = true;
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        if (recyclerView.canScrollVertically(-1)) {
            if (!this.b) {
                return;
            }
            final ByteStore byteStore = (ByteStore)this.a.af.a();
            final agza builder = aqfn.a.createBuilder();
            builder.copyOnWrite();
            final aqfn aqfn = (aqfn)builder.instance;
            aqfn.b |= 0x1;
            aqfn.c = false;
            byteStore.set("bottom_sheet_scroll_position_key", ((agxl)builder.build()).toByteArray());
            this.b = false;
        }
        else {
            if (this.b) {
                return;
            }
            final ByteStore byteStore2 = (ByteStore)this.a.af.a();
            final agza builder2 = aqfn.a.createBuilder();
            builder2.copyOnWrite();
            final aqfn aqfn2 = (aqfn)builder2.instance;
            aqfn2.b |= 0x1;
            aqfn2.c = true;
            byteStore2.set("bottom_sheet_scroll_position_key", ((agxl)builder2.build()).toByteArray());
            this.b = true;
        }
    }
}
