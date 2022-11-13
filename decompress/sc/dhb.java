import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhb
{
    final Object a;
    final Object b;
    
    public dhb(final Context a) {
        this.a = a;
        this.b = "image_manager_disk_cache";
    }
    
    public dhb(final cbo a, final cct b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        ((cbo)this.a).s.remove(this.b);
        ((cbo)this.a).o.notifyDataSetChanged();
    }
}
