import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public class ahah
{
    protected volatile MessageLite a;
    public volatile agyc b;
    
    static {
        final ExtensionRegistryLite a = ExtensionRegistryLite.a;
    }
    
    public final agyc a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = agyc.b;
            }
            else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }
    
    public final MessageLite b(final MessageLite messageLite) {
        Label_0054: {
            if (this.a != null) {
                break Label_0054;
            }
            synchronized (this) {
                if (this.a != null) {
                    monitorexit(this);
                }
                else {
                    try {
                        this.a = messageLite;
                        this.b = agyc.b;
                    }
                    catch (final ahab ahab) {
                        this.a = messageLite;
                        this.b = agyc.b;
                    }
                    monitorexit(this);
                }
                return this.a;
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ahah)) {
            return false;
        }
        final ahah ahah = (ahah)o;
        final MessageLite a = this.a;
        final MessageLite a2 = ahah.a;
        if (a == null && a2 == null) {
            return this.a().equals(ahah.a());
        }
        if (a != null && a2 != null) {
            return a.equals(a2);
        }
        if (a != null) {
            return a.equals(ahah.b(a.getDefaultInstanceForType()));
        }
        return this.b(a2.getDefaultInstanceForType()).equals(a2);
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
}
