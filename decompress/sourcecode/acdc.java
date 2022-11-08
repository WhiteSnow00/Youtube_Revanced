import com.youtube.android.libraries.elements.StatusOr;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acdc extends oih
{
    private final uyf a;
    
    public acdc(final uyf a) {
        this.a = a;
    }
    
    public final agyr a() {
        return (agyr)ajvo.b;
    }
    
    public final StatusOr execute(final byte[] array) {
        final agza builder = ((agzi)ajvp.a).createBuilder();
        anun c;
        if ((c = this.a.b().z) == null) {
            c = anun.a;
        }
        builder.copyOnWrite();
        final ajvp ajvp = (ajvp)builder.instance;
        c.getClass();
        ajvp.c = c;
        ajvp.b |= 0x1;
        return StatusOr.fromValue((Object)((agxl)builder.build()).toByteArray());
    }
}
