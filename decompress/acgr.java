import com.youtube.android.libraries.elements.StatusOr;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgr extends okf
{
    private final arzb a;
    
    public acgr(final arzb a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final ahci a() {
        return ajzw.b;
    }
    
    public final StatusOr execute(final byte[] array) {
        final ahcr builder = ((ahcz)ajzx.a).createBuilder();
        anyx c;
        if ((c = this.a.f().B) == null) {
            c = anyx.a;
        }
        builder.copyOnWrite();
        final ajzx ajzx = (ajzx)builder.instance;
        c.getClass();
        ajzx.c = c;
        ajzx.b |= 0x1;
        return StatusOr.fromValue((Object)((ahbc)builder.build()).toByteArray());
    }
}
