// 
// Decompiled by Procyon v0.6.0
// 

public final class aajz
{
    public final Object a;
    final /* synthetic */ Object b;
    
    public aajz(final aakb b, final yob a) {
        this.b = b;
        this.a = a;
    }
    
    public aajz(final aapo b, final aapn a) {
        this.b = b;
        this.a = a;
    }
    
    public final yni a() {
        return yni.c(aakb.a((aakb)this.b), (yob)this.a);
    }
    
    public final float b() {
        final float b = ((aapo)this.b).b;
        if (b == 0.0f) {
            return -1.0f;
        }
        return (((aapn)this.a).a[0] + b / 2.0f) / b;
    }
    
    public final boolean c() {
        final aapo aapo = (aapo)this.b;
        if (aapo.b != 0.0f) {
            if (aapo.c != 0.0f) {
                if (Math.abs(((aapn)this.a).a[0]) <= ((aapo)this.b).b / 2.0f && Math.abs(((aapn)this.a).a[1]) <= ((aapo)this.b).c / 2.0f) {
                    return true;
                }
            }
        }
        return false;
    }
}
