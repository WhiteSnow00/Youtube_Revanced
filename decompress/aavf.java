// 
// Decompiled by Procyon v0.6.0
// 

public final class aavf implements aapp
{
    public final afhd a;
    private final int b;
    
    public aavf(final afhd a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int b = this.b;
        if (b == 0) {
            final afhd a = this.a;
            final int e = aavg.e;
            a.t();
            return;
        }
        if (b == 1) {
            final afhd a2 = this.a;
            final int e2 = aavg.e;
            a2.t();
            return;
        }
        if (b == 2) {
            final afhd a3 = this.a;
            final int e3 = aavg.e;
            final aaus aaus = (aaus)((adlp)a3.a).a;
            aaus.a.post((Runnable)new aaog(aaus, 18));
            aaus.k = false;
            aaus.i();
            return;
        }
        if (b != 3) {
            final afhd a4 = this.a;
            final int e4 = aavg.e;
            final aaus aaus2 = (aaus)((adlp)a4.a).a;
            aaus2.a.post((Runnable)new aaog(aaus2, 17));
            aaus2.o = true;
            return;
        }
        final afhd a5 = this.a;
        final int e5 = aavg.e;
        final aaus aaus3 = (aaus)((adlp)a5.a).a;
        aaus3.a.post((Runnable)new aaog(aaus3, 19));
        aaus3.o = true;
    }
}
