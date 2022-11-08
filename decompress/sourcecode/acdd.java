import com.youtube.android.libraries.elements.StatusOr;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acdd extends oih
{
    private final arud a;
    
    public acdd(final arud a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final agyr a() {
        return (agyr)ajvs.b;
    }
    
    public final StatusOr execute(final byte[] array) {
        final agza builder = ((agzi)ajvt.a).createBuilder();
        anuo c;
        if ((c = this.a.f().B) == null) {
            c = anuo.a;
        }
        builder.copyOnWrite();
        final ajvt ajvt = (ajvt)builder.instance;
        c.getClass();
        ajvt.c = c;
        ajvt.b |= 0x1;
        return StatusOr.fromValue((Object)((agxl)builder.build()).toByteArray());
    }
}
