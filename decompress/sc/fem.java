import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class fem extends fes
{
    final fet a;
    
    public fem(final fet a, final avu avu, final byte[] array) {
        super(this.a = a, avu, (byte[])null);
    }
    
    protected final /* bridge */ Object a(final byte[] array) {
        final vlq e = this.a.e;
        if (array == null) {
            return null;
        }
        return new vvl((akzp)e.a(array, (MessageLite)akzp.a));
    }
    
    protected final byte[] b(final Object o) {
        return ((agzk)((vvl)o).a).toByteArray();
    }
}
