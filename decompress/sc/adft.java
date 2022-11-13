import java.util.Iterator;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adft extends vmc
{
    public adft(final aeea aeea, final zme zme, final ahaz ahaz, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aeea, zme, "upload/feedback", (ahcv)ahaz, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    protected final void c() {
        final ahaz ahaz = (ahaz)this.a();
        adkp.R(((alcw)ahaz.instance).d.size() + ((alcw)ahaz.instance).e.size() > 0, (Object)"Empty feedback polling request");
        for (final aphx aphx : Collections.unmodifiableList((List<? extends aphx>)((alcw)ahaz.instance).d)) {
            adkp.R((((aphx.c.isEmpty() ^ true) + (aphx.d.isEmpty() ^ true)) ? 1 : 0) == 1, (Object)"Exactly one feedback id needs to be specified");
        }
        final Iterator<Object> iterator2 = (Iterator<Object>)Collections.unmodifiableList((List<? extends String>)((alcw)ahaz.instance).e).iterator();
        while (iterator2.hasNext()) {
            adkp.R(iterator2.next().isEmpty() ^ true, (Object)"Empty feedback continuation");
        }
    }
    
    public final boolean p() {
        return false;
    }
}
