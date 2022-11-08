import java.util.Iterator;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adds extends vjx
{
    public adds(final adcr adcr, final zkh zkh, final agza agza, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, zkh, "upload/feedback", (ahaw)agza, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    protected final void c() {
        final agza agza = (agza)this.a();
        agot.E(((alat)agza.instance).d.size() + ((alat)agza.instance).e.size() > 0, (Object)"Empty feedback polling request");
        for (final apft apft : Collections.unmodifiableList((List<? extends apft>)((alat)agza.instance).d)) {
            agot.E((((apft.c.isEmpty() ^ true) + (apft.d.isEmpty() ^ true)) ? 1 : 0) == 1, (Object)"Exactly one feedback id needs to be specified");
        }
        final Iterator<Object> iterator2 = (Iterator<Object>)Collections.unmodifiableList((List<? extends String>)((alat)agza.instance).e).iterator();
        while (iterator2.hasNext()) {
            agot.E(iterator2.next().isEmpty() ^ true, (Object)"Empty feedback continuation");
        }
    }
    
    public final boolean p() {
        return false;
    }
}
