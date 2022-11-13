import app.revanced.integrations.patches.HideMixPlaylistsPatch;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ih extends BaseAdapter
{
    final ii a;
    private int b;
    
    public ih(final ii a) {
        this.a = a;
        this.b = -1;
        this.b();
    }
    
    public final io a(final int n) {
        final ArrayList e = this.a.c.e();
        final int b = this.b;
        int n2 = n;
        if (b >= 0 && (n2 = n) >= b) {
            n2 = n + 1;
        }
        return (io)e.get(n2);
    }
    
    final void b() {
        final im c = this.a.c;
        final io i = c.i;
        if (i != null) {
            final ArrayList e = c.e();
            for (int size = e.size(), j = 0; j < size; ++j) {
                if (e.get(j) == i) {
                    this.b = j;
                    return;
                }
            }
        }
        this.b = -1;
    }
    
    public final int getCount() {
        final int size = this.a.c.e().size();
        if (this.b < 0) {
            return size;
        }
        return size - 1;
    }
    
    public final /* bridge */ Object getItem(final int n) {
        return this.a(n);
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.a.b.inflate(2131623952, viewGroup, false);
        }
        HideMixPlaylistsPatch.hideMixPlaylists(inflate);
        HideMixPlaylistsPatch.hideMixPlaylists(inflate);
        ((ja)inflate).f(this.a(n));
        return inflate;
    }
    
    public final void notifyDataSetChanged() {
        this.b();
        super.notifyDataSetChanged();
    }
}
