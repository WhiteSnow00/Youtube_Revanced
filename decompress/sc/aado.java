import java.util.Iterator;
import java.util.ArrayList;
import android.content.SharedPreferences;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aado extends aadn
{
    private final List a;
    
    public aado(final aadq aadq, final adfs adfs, final oby oby, final SharedPreferences sharedPreferences, final arwh arwh, final zvb zvb, final tgd tgd, final byte[] array, final byte[] array2, final byte[] array3) {
        super(aadq, adfs, oby, sharedPreferences, arwh, zvb, tgd, (byte[])null, (byte[])null, (byte[])null);
        this.a = new ArrayList();
    }
    
    protected final void e(final akwn akwn, final amvl amvl, final aaeh aaeh, final long n, final aabe aabe) {
        if (aabe == null) {
            return;
        }
        final ahaz builder = ((ahbh)amvl).toBuilder();
        akwn akwn2 = akwn;
        if (!this.a.isEmpty()) {
            final ahaz builder2 = ((ahbh)akwn).toBuilder();
            builder2.copyOnWrite();
            ((akwn)builder2.instance).c = akwn.emptyIntList();
            final List a = this.a;
            builder2.copyOnWrite();
            final akwn akwn3 = (akwn)builder2.instance;
            final ahbp c = akwn3.c;
            if (!c.c()) {
                akwn3.c = ahbh.mutableCopy(c);
            }
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                akwn3.c.g(((amvb)iterator.next()).h);
            }
            akwn2 = (akwn)builder2.build();
        }
        super.e(akwn2, (amvl)builder.build(), aaeh, n, aabe);
    }
}
