import java.util.UUID;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqh
{
    private final Object a;
    private aioe b;
    private PlaybackStartDescriptor c;
    
    public fqh(final UUID a, final aioe b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public fqh(final UUID uuid, final PlaybackStartDescriptor c) {
        this(uuid, ezp.e(c));
        this.c = c;
    }
    
    public final PlaybackStartDescriptor a() {
        synchronized (this) {
            if (this.c == null) {
                final aioe b = this.b;
                final abhx d = PlaybackStartDescriptor.d();
                d.a = b;
                this.c = d.a();
            }
            return this.c;
        }
    }
    
    public final aioe b() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final String c() {
        return this.a().k();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && (this == o || (o instanceof fqh && this.a.equals(fqh.class.cast(o).a)));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
