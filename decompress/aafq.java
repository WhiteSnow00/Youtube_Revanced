import android.text.TextUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafq extends vmz
{
    public Collection a;
    public String b;
    
    public aafq(final aefs aefs, final znz znz, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("player/refresh", aefs, znz, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = new ArrayList();
        this.b = "";
        ((vls)this).i = vby.b;
    }
    
    public final /* bridge */ ahen a() {
        final ahcr builder = akye.a.createBuilder();
        final String b = this.b;
        builder.copyOnWrite();
        final akye akye = (akye)builder.instance;
        b.getClass();
        akye.b |= 0x2;
        akye.e = b;
        final Collection a = this.a;
        builder.copyOnWrite();
        final akye akye2 = (akye)builder.instance;
        final ahdp d = akye2.d;
        if (!d.c()) {
            akye2.d = ahcz.mutableCopy(d);
        }
        ahbc.addAll((Iterable)a, (List)akye2.d);
        builder.copyOnWrite();
        final akye akye3 = (akye)builder.instance;
        akye3.b |= 0x4;
        akye3.f = true;
        return (ahen)builder;
    }
    
    protected final void c() {
        twd.n(((vls)this).p);
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            adme.T(this.a.isEmpty() ^ true);
            return;
        }
        twd.n(this.b);
    }
}
