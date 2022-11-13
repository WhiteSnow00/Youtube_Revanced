import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class fen extends fes
{
    final fet a;
    
    public fen(final fet a, final avu avu, final byte[] array) {
        super(this.a = a, avu, (byte[])null);
    }
    
    protected final /* bridge */ Object a(final byte[] array) {
        final vlq e = this.a.e;
        if (array == null) {
            return null;
        }
        return new vqu((akrh)e.a(array, (MessageLite)akrh.a));
    }
    
    protected final byte[] b(final Object o) {
        return ((agzk)((vqu)o).a).toByteArray();
    }
}
