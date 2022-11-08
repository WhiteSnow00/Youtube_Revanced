import java.util.List;
import j$.time.Instant;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvp
{
    public Object a;
    public final Object b;
    
    public kvp() {
        this.b = new ArrayList();
    }
    
    public kvp(final atjj b) {
        this.b = b;
    }
    
    public kvp(final cxz b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
    }
    
    public kvp(final ivu b) {
        this.b = b;
        this.a = sif.a().n();
    }
    
    public final jfi a() {
        if (this.a == null) {
            this.c(0L);
        }
        this.a.getClass();
        return new jfi();
    }
    
    public final void b(final aorm aorm) {
        final Object b = this.b;
        aorm.getClass();
        ((List<aorm>)b).add(aorm);
    }
    
    public final void c(final long n) {
        final Instant ofEpochMilli = Instant.ofEpochMilli(n);
        ofEpochMilli.getClass();
        this.a = ofEpochMilli;
    }
}
