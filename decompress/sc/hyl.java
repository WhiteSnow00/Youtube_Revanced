// 
// Decompiled by Procyon v0.6.0
// 

public final class hyl implements wyv
{
    public final Object a;
    private final int b;
    
    public hyl(final acsp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hyl(final atke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hyl(final ldz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hyl(final sui a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public hyl(final wyn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hyl(final wyw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final wyw pF() {
        switch (this.b) {
            default: {
                return ((acsp)this.a).a();
            }
            case 8: {
                return ((wpj)((sui)this.a).a).a.i;
            }
            case 7: {
                return (wyw)this.a;
            }
            case 6: {
                return ((ldz)this.a).b;
            }
            case 5: {
                return (wyw)this.a;
            }
            case 4: {
                return (wyw)this.a;
            }
            case 3: {
                return (wyw)this.a;
            }
            case 2: {
                return (wyw)((atke)this.a).a();
            }
            case 1: {
                return (wyw)this.a;
            }
            case 0: {
                return (wyw)this.a;
            }
        }
    }
}
