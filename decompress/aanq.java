// 
// Decompiled by Procyon v0.6.0
// 

public final class aanq
{
    public final Object a;
    final Object b;
    
    public aanq(final aans b, final yrv a) {
        this.b = b;
        this.a = a;
    }
    
    public aanq(final aasy b, final aasx a) {
        this.b = b;
        this.a = a;
    }
    
    public final yrc a() {
        return yrc.c(aans.a((aans)this.b), (yrv)this.a);
    }
    
    public final float b() {
        final float b = ((aasy)this.b).b;
        if (b == 0.0f) {
            return -1.0f;
        }
        return (((aasx)this.a).a[0] + b / 2.0f) / b;
    }
    
    public final boolean c() {
        final aasy aasy = (aasy)this.b;
        if (aasy.b != 0.0f) {
            if (aasy.c != 0.0f) {
                if (Math.abs(((aasx)this.a).a[0]) <= ((aasy)this.b).b / 2.0f && Math.abs(((aasx)this.a).a[1]) <= ((aasy)this.b).c / 2.0f) {
                    return true;
                }
            }
        }
        return false;
    }
}
