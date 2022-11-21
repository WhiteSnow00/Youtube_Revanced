import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafs extends vmz
{
    public final List a;
    public final List b;
    public final List c;
    
    protected aafs(final aefs aefs, final znz znz, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("offline", aefs, znz, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    public final /* bridge */ ahen a() {
        final ahcr builder = akxo.a.createBuilder();
        final List a = this.a;
        builder.copyOnWrite();
        final akxo akxo = (akxo)builder.instance;
        final ahdp d = akxo.d;
        if (!d.c()) {
            akxo.d = ahcz.mutableCopy(d);
        }
        ahbc.addAll((Iterable)a, (List)akxo.d);
        final List b = this.b;
        builder.copyOnWrite();
        final akxo akxo2 = (akxo)builder.instance;
        final ahdp f = akxo2.f;
        if (!f.c()) {
            akxo2.f = ahcz.mutableCopy(f);
        }
        ahbc.addAll((Iterable)b, (List)akxo2.f);
        final List c = this.c;
        builder.copyOnWrite();
        final akxo akxo3 = (akxo)builder.instance;
        final ahdp e = akxo3.e;
        if (!e.c()) {
            akxo3.e = ahcz.mutableCopy(e);
        }
        ahbc.addAll((Iterable)c, (List)akxo3.e);
        builder.copyOnWrite();
        final akxo akxo4 = (akxo)builder.instance;
        akxo4.b |= 0x2;
        akxo4.g = false;
        return (ahen)builder;
    }
    
    protected final void c() {
        adme.T(!this.a.isEmpty() || !this.b.isEmpty() || !this.c.isEmpty());
        adme.T(true);
    }
}
