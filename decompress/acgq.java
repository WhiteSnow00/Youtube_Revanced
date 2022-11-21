import com.youtube.android.libraries.elements.StatusOr;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgq extends okf
{
    private final vbo a;
    
    public acgq(final vbo a) {
        this.a = a;
    }
    
    public final ahci a() {
        return ajzs.b;
    }
    
    public final StatusOr execute(final byte[] array) {
        final ahcr builder = ((ahcz)ajzt.a).createBuilder();
        anyw c;
        if ((c = this.a.b().z) == null) {
            c = anyw.a;
        }
        builder.copyOnWrite();
        final ajzt ajzt = (ajzt)builder.instance;
        c.getClass();
        ajzt.c = c;
        ajzt.b |= 0x1;
        return StatusOr.fromValue((Object)((ahbc)builder.build()).toByteArray());
    }
}
