import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class abnc implements vnc
{
    private final int a;
    
    public abnc(final int a) {
        this.a = a;
    }
    
    public final ahbt a(final byte[] array) {
        if (this.a != 0) {
            return ume.ab(array, 2);
        }
        return ume.ab(array, 3);
    }
    
    public final MessageLite b(final MessageLite messageLite) {
        if (this.a != 0) {
            final alcc alcc = (alcc)messageLite;
            akzi a;
            if (alcc.b == 2) {
                a = (akzi)alcc.c;
            }
            else {
                a = akzi.a;
            }
            return (MessageLite)a;
        }
        final alcc alcc2 = (alcc)messageLite;
        algm a2;
        if (alcc2.d == 3) {
            a2 = (algm)alcc2.e;
        }
        else {
            a2 = algm.a;
        }
        return (MessageLite)a2;
    }
    
    public final aknj c(final MessageLite messageLite) {
        if (this.a != 0) {
            final alcc alcc = (alcc)messageLite;
            akzi a;
            if (alcc.b == 2) {
                a = (akzi)alcc.c;
            }
            else {
                a = akzi.a;
            }
            aknj aknj;
            if ((aknj = a.d) == null) {
                aknj = aknj.a;
            }
            return aknj;
        }
        final alcc alcc2 = (alcc)messageLite;
        algm a2;
        if (alcc2.d == 3) {
            a2 = (algm)alcc2.e;
        }
        else {
            a2 = algm.a;
        }
        aknj aknj2;
        if ((aknj2 = a2.d) == null) {
            aknj2 = aknj.a;
        }
        return aknj2;
    }
    
    public final boolean d(final MessageLite messageLite) {
        if (this.a != 0) {
            return ((alcc)messageLite).b == 2;
        }
        return ((alcc)messageLite).d == 3;
    }
}
